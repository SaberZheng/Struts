<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册成功</title>
</head>
<body>

    <h1>注册成功</h1>
    
    <h4> username: ${ username } </h4>
    
    <h4> page scope: ${ pageScope.username } </h4>
    
    <h4> request scope: ${ requestScope.username } </h4>
    
    <h4> session scope: ${ sessionScope.username } </h4>
    
    <h4> application scope: ${ applicationScope.username } </h4>
    
    <hr>
    
    <h4> customer.username : ${ customer.username } </h4>
    
    <h4> request scope: ${ requestScope.customer.username } </h4>

</body>
</html>