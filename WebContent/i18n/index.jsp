<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>国际化</title>
<style type="text/css">

    .login-form { width: 80% ; margin: 20px auto ; box-shadow: 0px 0px 5px 4px #d3d3d3; padding: 10px 10px ;}

    .login-form  .form-row { height: auto ; overflow: hidden; border-bottom: 1px dotted #d3d3d3 ; padding-bottom: 5px ;  }
    .login-form  .form-row:last-child { border:  none ; }
    .login-form  .form-row i , .login-form  .form-row b { height: 30px ; line-height: 30px ; }
    .login-form  .form-row i { float: left ; width: 30% ; text-align: right ; font-style: normal ; font-size: 18px ; }
    .login-form  .form-row b {  float: right ; width: 70% ; text-align: left ; }
    
    .login-form  .form-row b input { 
        margin-left: 1% ; padding-left : 4px ;
        height: 20px ; line-height: 20px ; width: 96% ; border: 1px solid #dedede ; outline: none ;
     }
     
     .login-form .buttons { width: 70% ; margin-left: 30% ; }
     
     .login-form .buttons span {
        float : left ; width: 50% ; height: 30px ; line-height: 30px ; 
     }
     
     .login-form .buttons span:first-child {
        text-align: center ;
     }
     
     .login-form .buttons span:last-child {
        text-align: center ;
     }
     
     .login-form .buttons span input {
        width: 80% ; 
     }
</style>
</head>
<body>

    <h3>原生HTML表单</h3>

    <div class="login-form">
    <form action="${ pageContext.request.contextPath }/user/login" method="post" >
        <div class="form-row">
	        <i>用户名:</i>
	        <b> <input type="text" name="username" ></b>
        </div>
        <div class="form-row">
            <i>密码:</i> 
            <b> <input type="password" name="password" > </b>
        </div>
        <div class=" form-row">
		     <div class="buttons">
			      <span >
	                  <input type="reset" value="重置">
	             </span>
	             <span>
	                  <input type="submit" value="登录">
	              </span>
		     </div>
	      </div>
    </form>
    </div>
    <hr>

    <h3>Struts 2 表单(不支持国际化)</h3>
    <s:form namespace="/user" action="login" method="post" >
        <s:textfield label="用户名" name="username" />
        <s:password label="密码" name="password" />
        <s:reset value="重置" />
        <s:submit value="登录" />
    </s:form>
    
    <h3>Struts 2 表单(支持国际化,只有使用Struts标签才可以支持)</h3>
    <s:form namespace="/user" action="login" method="post" >
        <s:textfield key="user.login.username.label" name="username" />
        <s:password key="user.login.password.label" name="password" />
        <s:reset key="user.login.reset.button" />
        <s:submit key="user.login.submit.button" />
    </s:form>
    
    <hr>
    <!-- 语言代码小写，国家大写 -->
    <a href="${ pageContext.request.contextPath }/user/index?request_locale=zh_CN">中文</a>
    <a href="${ pageContext.request.contextPath }/user/index?request_locale=en_US">English</a>

</body>
</html>