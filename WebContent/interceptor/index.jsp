<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Interceptor</title>
</head>
<body>

    <h1>Interceptor</h1>
    
    <form action="${ pageContext.request.contextPath }/interceptor/login" method="post" >
        <input type="text" name="username" >
        <input type="password" name="password" >
        <input type="submit" value="登录">
    </form>
    <a href="${ pageContext.request.contextPath }/interceptor/main">查看主页面</a>
</body>
</html>