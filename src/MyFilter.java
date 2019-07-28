import javax.servlet.*;
import java.io.IOException;

// 要想将一个普通的class变成一个具有特定功能的类（过滤器、拦截器...），要么继承父类、要么实现一个接口、要么增加一个注解
public class MyFilter implements Filter { // 过滤器

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter...init...");
    }

    @Override
    public void destroy() {
        System.out.println("filter...destroy...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("拦截请求...");
        System.out.println("拦截响应...");
    }
}
