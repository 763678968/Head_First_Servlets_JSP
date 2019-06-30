package com.example.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Version three of the HTML select tag uses the JSP
 * dynamic attributes mechanism to store all of the
 * pass-through HTML attributes in a hashmap
 */
public class SelectTagHandler extends SimpleTagSupport implements DynamicAttributes {
    // 存储'optionsList'属性

    public void setOptionsList(List value) {
        this.optionsList = value;
    }
    private List optionsList = null;

    // 存储'name'属性
    public void setName(String value) {
        this.name = value;
    }
    private String name;

    // 存储其他（动态）属性
    public void stDynamicAttribute(String uri, String name, Object value) {
        tagAttrs.put(name, value);
    }
    private Map<String, Object> tagAttrs = new HashMap<String, Object>();

    // 生成<select>和<option>标记
    public void doTag() throws JspException, IOException {
        PageContext pageContext = (PageContext) getJspContext();
        JspWriter out = pageContext.getOut();

        // 开始HTML <select>标记
        out.print("<select ");

        // 增加必要属性
        out.print(String.format(ATTR_TEMPLATE, "name", this.name));

        // 增加动态属性
        for (String attrName : tagAttrs.keySet()) {
            String attrDefinition = String.format(ATTR_TEMPLATE, attrName, tagAttrs.get(attrName));
            out.print(attrDefinition);
        }
        out.println('>');

        // 从optionsList生成<option>标记
        for (Object option : optionsList) {
            String optionTag = String.format(OPTION_TEMPLATE, option.toString());
            out.println(optionTag);
        }

        // 结束HTML </selext>标记

        out.println(" </select>");
    } // doTag()方法结束

    private static final String ATTR_TEMPLATE = "%s='%s' ";
    private static final String OPTION_TEMPLATE = " <option value='%1$s'> %1$s </option>";

} // SelectTagHandler结束
