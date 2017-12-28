<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示文件属性</title>
</head>
<body>
		上传者：<s:property value = "username"/>
		<br />
		<br />
		文件名：<s:property value="uploadFilesFileName"/>
		<br />
		<br />
		文件大小：<s:property value = "uploadFilesContentType"/>
		<br />
		<br />
		<a href = "/Struts2_T07/upload/<s:property value="uploadFilesFileName"/>">点击下载</a>
</body>
</html>