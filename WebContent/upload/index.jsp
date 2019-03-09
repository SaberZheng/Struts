<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts Upload</title>
</head>
<body>

    <h5>文件上传</h5>
    <!-- method 必须是 POST ，enctype 必须是 multipart/form-data -->
    <form action="${ pageContext.request.contextPath }/upload/action/single" method="post"  enctype="multipart/form-data">
        <input type="file" name="upload" >
        <input type="submit" value="上传" >
    </form>
    
    <h5>文件上传</h5>
    <!-- method 必须是 POST ，enctype 必须是 multipart/form-data -->
    <form action="${ pageContext.request.contextPath }/upload/action/multiple" method="post"  enctype="multipart/form-data">
        <input type="file" name="upload" > 
        <br>
        <input type="file" name="upload" > 
        <br>
        <input type="file" name="upload" > 
        <br>
        <input type="file" name="upload" > 
        <br>
        <input type="submit" value="上传" >
    </form>

</body>
</html>