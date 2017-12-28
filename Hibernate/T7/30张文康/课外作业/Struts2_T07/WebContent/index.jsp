<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="uploaduser"  method="post"  enctype="multipart/form-data">
			<s:textfield label="用户名" name="username" required="true" ></s:textfield>
			<!-- 上传文件的控件，注意的是该name属性值与action组件的File类对象的对象名一致 -->
			<s:file label="选择文件" name="uploadFiles"></s:file>
			<s:submit value = "提交"></s:submit>
			<s:fielderror></s:fielderror>
	</s:form>

</body>
</html>