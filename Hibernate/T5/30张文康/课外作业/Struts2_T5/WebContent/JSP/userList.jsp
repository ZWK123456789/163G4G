<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有用户</title>
</head>
<body>
		<h2>用户信息</h2>
		<table border="2px">
			<tr>
					<td>用户ID</td>
					<td>用户姓名</td>
					<td>用户密码</td>
					<td>出生日期</td>
					<td>性别</td>
					<td>是否启用</td>
					<td>操作</td>
			</tr>
			<s:iterator value="userList" var ="user">			
				<tr>
						<td><s:property value = "#user.uid"  /></td>
						<td><s:property value = "#user.uname"  /></td>
						<td><s:property value = "#user.upwd"  /></td>
						<td><s:property value = "#user.birthday"  /></td>
						<s:if test='#user.sex == "M"'>
								<td>男</td>
						</s:if>
						<s:else>
								<td>女</td>
						</s:else>
						<s:if test="#user.active == 0 ">
								<td>否</td>
						</s:if>
						<s:else>
								<td>是</td>
						</s:else>
							<td >
								<a href = "../user/user!get?user.uid=<s:property value = "#user.uid"  />">修改</a>
								<a href = "../user/user!Delete?user.uid=<s:property value = "#user.uid"  />">删除</a>
						</td>
				</tr>	
			</s:iterator>
			<tr>
					<td>
							<a href="../JSP/add.jsp">添加</a>
					</td>
			</tr>
		
		</table>
		
</body>
</html>