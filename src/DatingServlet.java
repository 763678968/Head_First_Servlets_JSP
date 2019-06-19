import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DatingServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // 业务逻辑放在这里
        // 具体的业务逻辑取决于这个servlet要做什么
        // （写至数据库，完成查询等）

        PrintWriter out = response.getWriter();

        // 构成动态HTML页面
        out.println("something really ugly goes here");
    }
}
