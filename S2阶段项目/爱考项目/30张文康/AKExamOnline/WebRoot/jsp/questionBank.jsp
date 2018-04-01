<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri = "/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'questionBank.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
		.group{
		 text-align:center;
		 border: solid 1px black;
		 width: 200px;
		 height: 60px;
		 margin: 10px 10px;
		 margin: 5px;
		 float: left
		}
	</style>

  </head>
  
  <body>
  			<!-- theme 设置为单一
  					s:if用于判断是否有值
  			 --> 
    	<s:form action="question/Question_getCourseInfo" method="post" theme="simple">
    		<s:if test="major != null && major != ' '  ">
    				<!-- 当list用Map集合时，前面的‘’中得内容会当成value值进行提交，后面的‘’中的值会当成文本进行展示 -->
    				<s:select list="{'SCME','SCCE'}" name = "major" value = "major"></s:select>
    		</s:if>	
    		<s:else>
    				<s:select list="{'SCME','SCCE'}" name = "major" value = "SCME"></s:select>
    		</s:else>
    		<s:if test="stage != null && stage != ' '  ">
    				<!-- 当list用Map集合时，前面的‘’中得内容会当成value值进行提交，后面的‘’中的值会当成文本进行展示 -->
    				<s:select list=" {'G1','G2','G3' }" name = "stage" value = "stage"></s:select>
    		</s:if>	
    		<s:else>
    				<s:select list=" {'G1','G2','G3' }"  name = "stage" value = "G1"></s:select>
    		</s:else>
    		
    		<s:submit value ="查询"></s:submit>
    		
    		<!-- 遍历输出各个科目的试题 -->
    			<s:iterator value = "QuestionAllList" var = "course">
    				<div align="center" class="group">
    					 ${course.csName}&nbsp;&nbsp;${course.stage} 
    					 <br />
    					 <a href = "jsp/developing.jsp">
    					 	机试题：
    					 		<s:property value = "#course.MachineTest.size()"/>
    					 </a>
    					 <br />
    					 <a href = "question/Question_getWrittenQuestion?course.csId=${course.csId}&course.csName=${course.csName}&course.stage=${course.stage}"  target="manFrame">
    					 	笔试题：
    					 		<s:property value = "#course.WrittenTest.size()"/>
    					 </a>
    				</div> 			
    			</s:iterator>
    			
    			
    	</s:form>
    
  </body>
</html>
