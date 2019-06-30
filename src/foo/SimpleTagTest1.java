package foo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
// more imports needed

public class SimpleTagTest1 extends SimpleTagSupport {
    // tag handler code here

    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print("This is the lamest use of a custom tag");
    }
}
