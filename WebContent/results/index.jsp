<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apache Struts</title>
<style type="text/css">
    .container { width: 90% ; margin: 10px auto ; box-shadow: 0px 0px 5px 4px #dedede ; padding: 5px 5px ; }
    ul .required { color : blue ; }
    ul li { font-size: 16px ; padding: 5px 5px ;  }
</style>
</head>
<body>

    <div class="container">
       <h4>属性驱动(赞成使用):</h4>
       <form action="${ pageContext.request.contextPath }/customer/results/register" method="post" >
                <input type="text" name="username" placeholder="用户名">
                <input type="password" name="password" placeholder="密码">
                <input type="password" name="confirm" placeholder="确认密码">
                <input type="submit" value="注册">
        </form>
        <a href="${ pageContext.request.contextPath }/customer/results/register?username=zhangsanfeng">注册</a>
    </div>
    
    <div class="container">
       <h4>属性驱动(反对使用):</h4>
       <form action="${ pageContext.request.contextPath }/customer/results/register" method="post" >
       			<!-- 使用了OGNL表达式 -->
                <input type="text" name="customer.username" placeholder="用户名">
                <input type="password" name="customer.password" placeholder="密码">
                <input type="password" name="customer.confirm" placeholder="确认密码">
                <input type="submit" value="注册">
        </form>
    </div>
    
    <div class="container">
       <h4>模型驱动:</h4>
       <form action="${ pageContext.request.contextPath }/customer/results/login" method="post" >
                <input type="text" name="username" placeholder="用户名">
                <input type="password" name="password" placeholder="密码">
                <input type="text" name="identifyCode" placeholder="验证码">
                <img src="<%= request.getContextPath() %>/stream/code">
                <input type="submit" value="登录">
        </form>
    </div>
    
    <div class="container">
       <h4>登录( 并将用户信息存储到 Session 中 ):</h4>
       <form action="${ pageContext.request.contextPath }/servlet/login" method="post" >
                <input type="text" name="username" placeholder="用户名">
                <input type="password" name="password" placeholder="密码">
                <input type="submit" value="登录">                
        </form>
       	 <!-- 提示完应该将session中的值移除 ，提示完再次访问不应该再由提示-->
        ${ sessionScope.error_message }
        <%-- EL 3.0 才支持直接调用方法 
        ${ pageContext.session.removeAttribute( 'error_message' ) }
        --%>
        <!-- 使用jsp内置对象删除-->
        <% session.removeAttribute( "error_message" ) ; %>
    </div>
    
     <div class="container">
       <h4> &lt;global-results&gt; 和 &lt;global-exception-mappings&gt; :</h4>
       
       <a href="${ pageContext.request.contextPath }/throw/hello?throw=true" >发生异常</a>
       
       <a href="${ pageContext.request.contextPath }/throw/hello?throw=false" >不发生异常</a>
       
     </div>
     
    <div class="container">
       <h4> 使用 stream 类型 :</h4>
       
       <a href="${ pageContext.request.contextPath }/stream/show" >显示</a>
       
       <a href="${ pageContext.request.contextPath }/stream/down" >下载</a>
       
       <!-- 可以在 URL 中传递被下载的文件名，Action 中的 name 属性负责接收  -->
       <a href="${ pageContext.request.contextPath }/stream/down?name=考拉.jpg" >下载</a>
       
     </div>
     
    <div class="container">
       <h4> 使用 stream 类型 :</h4>
       
       <a href="${ pageContext.request.contextPath }/json/customer" >Java Bean</a>
       
       <a href="${ pageContext.request.contextPath }/json/map" >Map</a>
       
     </div>
    

</body>
</html>