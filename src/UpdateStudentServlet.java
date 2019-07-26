import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // 获取待修改的人的学号
        int no = Integer.parseInt(request.getParameter("sno"));
        // 获取修改后的内容
        String name = request.getParameter("sname");
        int age = Integer.parseInt(request.getParameter("sage"));
        String address = request.getParameter("saddress");
        // 将修改后的内容封装到一个实体类中
        Student student = new Student(name, age, address);

        StudentService service = new StudentService();
        boolean result = service.updateStudentBySno(no, student);
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        if (result) {
            // out.print()
            response.getWriter().println("修改成功！");
        } else {
            response.getWriter().println("修改失败！");
        }

    }
}
