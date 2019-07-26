import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        int no = Integer.parseInt(request.getParameter("sno"));
        String name = request.getParameter("sname");
        int age = Integer.parseInt(request.getParameter("sage"));
        String address = request.getParameter("saddress");
        Student student = new Student(no, name, age, address);

        StudentService studentService = new StudentService();
        boolean result = studentService.addStudent(student);

        /**
         * out request response session application
         * out: PrintWriter out = response.getWriter()
         * session: request.getSession();
         * application: request.getServletContext()
         */
        // 设置响应编码
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter(); // 响应对象

        if (result) {
            out.println("增加成功！");
        } else {
            out.println("增加失败！");
        }
    }
}
