import javax.servlet.*;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class AttributeListener implements ServletRequestAttributeListener, HttpSessionAttributeListener, ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        String attrName = scae.getName(); // 目前正在操作的属性名
        Object attrValue = scae.getServletContext().getAttribute(attrName);
        System.out.println("ServletContext【增加】属性：" + attrName + "，属性值：" + attrValue);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("ServletContext【删除】属性：" + scae.getName());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        /*
         * application.setAttribute("name", "zs");  -- 新增name属性
         * application.setAttribute("name", "ls");  -- 替换name属性
         */
        String attrName = scae.getName();
        Object attrValue = scae.getServletContext().getAttribute(attrName);
        System.out.println("ServletContext【替换】属性：" + attrName + "，属性值：" + attrValue);

    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        String attrName = srae.getName(); // 目前正在操作的属性名
        Object attrValue = srae.getServletRequest().getAttribute(attrName);
        System.out.println("ServletContext【增加】属性：" + attrName + "，属性值：" + attrValue);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("ServletContext【删除】属性：" + srae.getName());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String attrName = srae.getName();
        Object attrValue = srae.getServletRequest().getAttribute(attrName);
        System.out.println("ServletContext【替换】属性：" + attrName + "，属性值：" + attrValue);
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        String attrName = se.getName(); // 目前正在操作的属性名
        Object attrValue = se.getSession().getAttribute(attrName);
        System.out.println("HttpSession【增加】属性：" + attrName + "，属性值：" + attrValue);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("HttpSession【删除】属性：" + se.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        String attrName = se.getName();
        Object attrValue = se.getSession().getAttribute(attrName);
        System.out.println("HttpSession【替换】属性：" + attrName + "，属性值：" + attrValue);
    }
}
