package UpAndDown;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        // 上传

        try {
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            if (isMultipart) { // 判断前台的form是否有multipart属性
                //FileItemFactory factory = new DiskFileItemFactory();
                DiskFileItemFactory factory = new DiskFileItemFactory();

                ServletFileUpload upload = new ServletFileUpload(factory);

                // 设置上传文件时用到的临时文件的大小
                factory.setSizeThreshold(10240); // 设置临时的缓冲文件大小为10KB
                factory.setRepository(new File("D:\\Work\\Exercise\\Java\\MyWebProject\\uploadtemp")); // 设置临时文件的目录

                // 控制上传单个文件的大小 20KB
                upload.setSizeMax(20480);

                // 通过parseRequest解析form中的所有请求字段，并保存到items集合中（即前台传递的sno sname spicture就保存在了items中）
                List<FileItem> items = upload.parseRequest(request);
                // 遍历items中的数据(sno sname spicture)
                Iterator<FileItem> iter = items.iterator();
                while (iter.hasNext()) {
                    FileItem item = iter.next();
                    String itemName = item.getFieldName();
                    int sno = -1;
                    String sname = null;

                    // 判断前台字段是普通form表单字段(sno sname)，还是文件字段
                    // request.getParameter()       item.getString()
                    if (item.isFormField()) {
                        if (itemName.equals("sno")) { // 根据name属性判断item是sno sname
                            sno = Integer.parseInt(item.getString("UTF-8"));
                        } else if (itemName.equals("sname")) {
                            sname = item.getString("UTF-8");
                        } else {
                            System.out.println("其他字段.....");
                        }
                    } else { // spicture
                        // 文件上传
                        // 文件名 getFieldName是获取普通表单字段的name值
                        // getName()是获取文件名
                        String fileName = item.getName(); // a.txt a.docx a.png
                        String ext = fileName.substring(fileName.indexOf(".")+1);
                        if (!(ext.equals("png") || ext.equals("gif") || ext.equals("jpg"))) {
                            System.out.println("图片类型有误！格式只能是png gif jpg");
                            return; // 终止
                        }
                        // 获取文件内容并上传
                        // 定义文件路径：指定上传的位置（服务器路径）
                        // 获取服务器路径
                        String path = request.getSession().getServletContext().getRealPath("upload");

                        File file = new File(path, fileName);

                        item.write(file); // 上传
                        System.out.println(fileName + "上传成功！");
                        return;
                    }
                }
            }
        } catch (FileUploadBase.SizeLimitExceededException e) {
            System.out.println("上传文件大小超过限制！最大20KB");
        } catch (FileUploadException e) {
            e.printStackTrace();
        } // 解析请求
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}