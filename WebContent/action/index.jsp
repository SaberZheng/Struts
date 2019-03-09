<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

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

	<h1>Apache Struts</h1>
	
	<div class="container">
	   <h4>Apache Struts 的黑历史:</h4>
	   <div>最初 Apache 推出的框架名称是 Struts ( 就是后来称为 Struts 1 的东东 ) ，迅速流行</div>
	   <div>随后，出现了 opensymphony 推出的 WebWork 框架 ( 设计上很优秀、效率较高 )</div>
	   <div>Apache Struts 2 在名称上沿用了 Struts ，设计和实现上完全采用了 WebWork ( xwork2 )</div>
	</div>
	
    <div class="container">
        <h4>可能需要使用的配置文件</h4>
        <ul>
            <li class="required">web.xml</li>
            <li class="required">struts.xml ( 自己创建，必须 )</li>
            <li>struts.properites ( 自己创建，不是必须 )</li>
            <li class="required">struts-default.xml ( struts2-core-2.5.10.1.jar ) </li>
            <li class="required">default.properites ( org/apache/struts2/default.properties)</li>
            <li>struts-plugin.xml ( 每个插件都有一个 配置文件 )</li>
        </ul>
    </div>
    
    <div class="container">
        <h4>struts-default.xml ( struts2-core-2.5.10.1.jar )</h4>
        <ul>
            <li> 定义常量 ( constant ) </li>
            <li> 定义Bean ( bean ) </li>
            <li> 定义了一个名称是 struts-default 的包 ( package ) </li>
        </ul>
    </div>
    
     <div class="container">
        <h4>struts-default 包</h4>
        <ul>
            <li> 在 result-types 标签内部定义了一批 result-type </li>
            <li> 在 interceptors 标签定义了一批 interceptor 和 一批 interceptor-stack </li>
            <li> 使用 default-interceptor-ref 指定了默认的拦截器栈 ( &lt;default-interceptor-ref name="defaultStack"/&gt;) </li>
            <li> 使用 default-class-ref 定义了默认的 Action 类 ( ActionSupport ) </li>
            <li> 使用 global-allowed-methods 声明了全局范围内允许被访问的方法 ( execute,input,back,cancel,browse,save,delete,list,index ) </li>
        </ul>
    </div>
    
    <div class="container">
        <h4>实现 Action 类的方法:</h4>
        <ul>
            <li> 实现 com.opensymphony.xwork2.Action 接口 </li>
            <li> 继承 com.opensymphony.xwork2.ActionSupport 类  </li>
            <li> 不实现 Action 接口 、 也不继承 ActionSupport 类 ，而是自己写自己的类，但是方法参考 Action 中的 execute 方法的形式去声明 </li>
        </ul>
    </div>
    
    <div class="container">
        <h4>在同一个 Action 中定义不同的 方法:</h4>
        <form action="${ pageContext.request.contextPath }/customer/action/action/register" method="post" >
	            <input type="text" name="username" placeholder="用户名">
	            <input type="password" name="password" placeholder="密码">
	            <input type="password" name="confirm" placeholder="确认密码">
	            <input type="submit" value="注册">
	    </form>
	    <hr>
	    <form action="${ pageContext.request.contextPath }/customer/action/action/login" method="post" >
                <input type="text" name="username" placeholder="用户名">
                <input type="password" name="password" placeholder="密码">
                <input type="submit" value="登录">
        </form>
        <a href="${ pageContext.request.contextPath }/customer/action/action/logout">注销</a>
    </div>
    
    <div class="container">
        <h4>动态方法调用:</h4>
        <form action="${ pageContext.request.contextPath }/dynamic/student!register" method="post" >
                <input type="text" name="username" placeholder="用户名">
                <input type="password" name="password" placeholder="密码">
                <input type="password" name="confirm" placeholder="确认密码">
                <input type="submit" value="注册">
        </form>
        <hr>
        <form action="${ pageContext.request.contextPath }/dynamic/student!login" method="post" >
                <input type="text" name="username" placeholder="用户名">
                <input type="password" name="password" placeholder="密码">
                <input type="submit" value="登录">
        </form>
        <a href="${ pageContext.request.contextPath }/dynamic/student!logout">注销</a>
    </div>
    
    <div class="container">
        <h4>使用通配符:</h4>
        <form action="${ pageContext.request.contextPath }/wildcard/teacher/register" method="post" >
                <input type="text" name="username" placeholder="用户名">
                <input type="password" name="password" placeholder="密码">
                <input type="password" name="confirm" placeholder="确认密码">
                <input type="submit" value="注册">
        </form>
        <hr>
        <form action="${ pageContext.request.contextPath }/wildcard/teacher/login" method="post" >
                <input type="text" name="username" placeholder="用户名">
                <input type="password" name="password" placeholder="密码">
                <input type="submit" value="登录">
        </form>
        <a href="${ pageContext.request.contextPath }/wildcard/teacher/logout">注销</a>
    </div>
    
	<hr>
	
	<s:debug />

</body>
</html>
