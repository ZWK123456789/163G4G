<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib  prefix="c"  uri = "core" %>
<%@taglib prefix="s"  uri = "/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>系统登录 - 超市账单管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body class="blue-style">
<!-- 通过链接式CSS为表单控件增加样式 -->
<div id="login">
	<div class="icon"></div>
	<div class="login-box">
	<s:form action = "LoginUser"  method = "post">
			<!-- 用Struts2标签进行页面设计 -->
			<s:textfield label="用户名：" name = "user.userName" required = "true" />
			<s:password label="密码：" name = "user.userPassword" required = "true" />
			<div class="buttons">
				<input type="submit" name="submit" value="登录系统" class="input-button" />
				<input type="reset" name="reset" value="重　　填" class="input-button" />
			</div>
			<s:fielderror></s:fielderror>
	</s:form>
	</div>
</div>
</body>
</html>
