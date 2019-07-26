import com.Login;
import com.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 控制器层：接收View请求，并分发给Model处理
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理登录
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("uname");
        String pwd = request.getParameter("upwd");
        Login login = new Login(name, pwd);

        // 调用模型层的登录功能
        int result = LoginDao.login(login);
        if (result > 0) { // 成功
            response.sendRedirect("Welcome.jsp");
        } else { // 登录失败
            response.sendRedirect("login.jsp");
        }
    }
}
