<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页</title>
</head>
<body>

    <h1>Hello , ${ username }</h1>
    <a href="${ pageContext.request.contextPath }/interceptor/logout">退出登录</a>
</body>
</html>