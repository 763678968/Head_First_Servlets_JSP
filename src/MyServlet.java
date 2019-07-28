import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // 获取需要下载的文件名
        String fileName = request.getParameter("filename"); // from a href Servlet?a=b

        // 下载文件：需要设置消息头
        // 对于不同浏览器，进行不同的处理
        // 获取客户端的user-agent信息
        String agent = request.getHeader("User-Agent");

        if (agent.toLowerCase().indexOf("firefox") != -1) {
            // Firefox下载 文件名乱码问题
            // response.addHeader(....);
        } else {
            // Edge下载 文件名乱码问题
            response.addHeader("content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, StandardCharsets.UTF_8));
        }

        // Servlet通过文件的地址，将文件转为输入流读到Servlet中
        InputStream in = getServletContext().getResourceAsStream("/res/无标题.png");

        // 通过输出流将刚才已经转为输入流的文件输出给客户
        ServletOutputStream out = response.getOutputStream();
        byte[] bs = new byte[10];
        int len = -1;
        while ((len = in.read(bs)) != -1) {
            out.write(bs, 0, len);
        }
        out.close();
        in.close();
    }
}
