<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录成功</title>
</head>
<body>

    <h1>登录成功</h1>
        
    <h4> customer.username : ${ customer.username } </h4>
    
    <h4> request scope: ${ requestScope.customer.username } </h4>
    
    <hr>
    
    <h4> session scope: ${ sessionScope.customer.username } </h4>
    
    <a href="${ pageContext.request.contextPath }/servlet/logout">注销</a>

</body>
</html>