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
			<s:form action="../user/user!Update" method="post">
			 		<s:hidden  name = "user.uid" ></s:hidden>
					<s:textfield label = "用户姓名"  name = "user.uname" required="true"></s:textfield>
					<s:password label = "用户密码"  name = "user.upwd" required="true"></s:password>
					<s:textfield label = "出生日期"  name = "user.birthday" required="true"></s:textfield>
					<s:radio label = "性别" list="#{ 'M':'男','W':'女'}"  name = "user.sex" required="true"  value = "'M'"></s:radio >
					<s:radio label = "是否启用"  name = "user.active" required="true"  list="#{'0':'否','1':'是'}" value="1"></s:radio>
					<s:submit value = "提交"></s:submit>
				</s:form>
					
</body>
</html>