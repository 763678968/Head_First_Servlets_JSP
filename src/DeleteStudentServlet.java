import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 删除
        request.setCharacterEncoding("utf-8");
        // 接收前端传来的学号
        int no = Integer.parseInt(request.getParameter("sno"));

        StudentService service = new StudentService();
        boolean result = service.deleteStudentBySno(no);
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        if (result) {
            // out.print()
            response.getWriter().println("删除成功！");
        } else {
            response.getWriter().println("删除失败！");
        }

    }
}
