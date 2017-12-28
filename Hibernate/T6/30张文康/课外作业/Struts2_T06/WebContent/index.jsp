<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<h2><s:text name="label.login"></s:text></h2>
	<s:form action="showuser"  namespace="/" method = "post">
		<s:textfield key="label.uname"  name="user.uname" ></s:textfield>
		<s:password key="label.upwd" name = "user.upwd" ></s:password>
		<s:submit value="%{getText('label.login.submit')}"></s:submit>
	</s:form>
	<s:url id = "localEN" action = "local" >
	 <s:param name = "request_locale">en_US</s:param>  
	<%--  <s:param name = "language">en_US</s:param>  --%>
	</s:url>
	<s:url id = "localZH" action = "local"  >
		 <s:param name = "request_locale">zh_CN</s:param>   
		 <%-- <s:param name = "language">zh_CN</s:param>   --%> 
	</s:url>
	<a href="<s:property value = 'localZH'/>">English</a>
	<a href="<s:property value = 'localEN'/>">中文</a>
	<s:fielderror></s:fielderror>
	<s:actionerror/>
</body>
</html>