<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/6/30
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ tag body-content="empty" dynamic-attributes="tagAttrs" %>

<%@ attribute name="optionsList" type="java.util.List" required="true" rtexprvalue="true" %>

<%@ taglib uri="http://java.sun.com/jsp/jst1/core" prefix="c" %>

<select name="${name}"
        <c:forEach var="attrEntry" items="${tagAttrs}">
            ${attrEntry.key} = '${attrEntry.value}'
        </c:forEach>
>
    <c:forEach var="option" items="${optionsList}">
        <option value="${option}"> ${option} </option>
    </c:forEach>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
