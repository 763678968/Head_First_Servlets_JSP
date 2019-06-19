import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DatingServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // 业务逻辑放在这里
        // 具体的业务逻辑取决于这个servlet要做什么
        // （写至数据库，完成查询等）

        // 把请求转发到一个特定的JSP页面，
        // 而不是把HTML打印到输出流
    }
}
