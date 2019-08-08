<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h3>登录页面</h3>
<form action="${pageContext.request.contextPath}/securityLogin" method="post">
 用户名:<input type="text" name="username"/><br/>
 密码:<input type="password" name="password"/><br/>
 验证码:<input type="text" name="imageCode"/>
    <img src="${pageContext.request.contextPath}/imageCode"/><br/>
记住我:<input type="checkbox" name="remember-me" value="true"><br/>
 <input type="submit" value="登录"/>
</form>
</body>
</html>
