<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/29
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="jquery-3.3.1.js"></script>
    <script type="text/javascript">

        function reloadCheckImg() {
            $("img").attr("src", "img.jsp?t=" + (new Date().getTime())); // <img src="..."
        }

        $(document).ready(function() {
            $("#checkcodeId").blur(function() {
                var $checkcode = $("#checkcodeId").val();
                // 校验：文本框中输入的值发送到服务端
                // 服务端：获取文本框输入的值，和真实验证码图片中的值对比，并返回验证结果
                $.post(
                    "CheckCodeServlet", // 服务端地址
                    "checkcode="+$checkcode,
                    function(result) { //图片地址(img/right.jpg img/wrong.jpg)
                        // result: img/right.jpg
                        var resultHtml = $("<img src='"+result+"' height='15px' width='15px' />")
                        $("#tip").html(resultHtml);
                    }
                )
            })
        })

    </script>
    <title>验证码</title>
</head>
<body>
        验证码：
        <input type="text" name="checkcode" id="checkcodeId" size="4" />
        <!-- 验证码 -->
        <a href="javascript:reloadCheckImg();"><img src="img.jsp"/></a>

        <span id="tip"></span>
</body>
</html>
