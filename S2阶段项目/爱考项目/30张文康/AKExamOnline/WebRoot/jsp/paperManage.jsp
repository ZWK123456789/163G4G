<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>试卷管理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
span {
	display: none;
}

th {
	background-color: #666;
}

#marginTop {
	margin-top: 20px;
}

.margRight {
	margin-right: 10px;
}
</style>
</head>
<script type="text/javascript">
function showRanCrePaper() {
	var width = (screen.width - 550) / 2;
	var height = (screen.height - 350) / 2;
	var res = window
			.open(
					"jsp/createPaperRandom.jsp",
					"window",
					"width=550px,height=350px,top="
							+ height
							+ ", left="
							+ width
							+ ", toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no");
}
function showSelectCrePaper() {
	var width = (screen.width - 700) / 2;
	var height = (screen.height - 600) / 2;
	var res = window
			.open(
					"jsp/selectCrePaper.jsp",
					"window",
					"width=700px,height=600px,top="
							+ height
							+ ", left="
							+ width
							+ ", toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no");
}
function showStartExam(pid) {
	var width = (screen.width - 600) / 2;
	var height = (screen.height - 400) / 2;
	var res = window
			.open(
					"jsp/startExam.jsp?pid="+pid,
					"window",
					"width=600px,height=400px,top="
							+ height
							+ ", left="
							+ width
							+ ", toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no");
}
function showMsg() {
	alert("同成绩管理！");
}
</script>
<body>
	<div>
		<h3 align="center">试卷列表</h3>
		<form action="paperManage?cmd=paperList" method="post">
			方向: <select name="majorSelect" class="margRight">
				<option value="SCME">SCME</option>
				<option value="SCCE">SCCE</option>
			</select> 阶段: <select name="stageSelect" class="margRight">
				<option value="G1">G1</option>
				<option value="G2">G2</option>
				<option value="G3">G3</option>
			</select> 考试科目: <select name="subSelect" class="margRight">
				<option value="1">计算机基础</option>
			</select> 考试类型: <select name="typeSelect" class="margRight">
				<option value="笔试">笔试</option>
				<option value="机试">机试</option>
			</select> 状态: <select name="stateSelect" class="margRight">
				<option value="未开考">未开考</option>
				<option value="考试中">考试中</option>
				<option value="考试结束">考试结束</option>
			</select> <input type="submit" value="查询" class="margRight">
		</form>
		<div style="margin-top: 20px;">
			<button onclick="javascript:showRanCrePaper();" class="margRight">随机组卷</button>
			<button onclick="javascript:showSelectCrePaper();" class="margRight">选题组卷</button>
			<button onclick="" class="margRight">上机考试</button>
		</div>
	</div>
	<div>
		<fieldset id="marginTop">
			<table width="100%" align="center" id="marginTop" border="0.5"
				bordercolor="#eee" cellspacing="1">
				<tr>
					<th><font color="white">序号</font></th>
					<th><font color="white">类型</font></th>
					<th><font color="white">科目</font></th>
					<th><font color="white">标题</font></th>
					<th><font color="white">考试班级</font></th>
					<th><font color="white">考试时长(分钟)</font></th>
					<th><font color="white">状态</font></th>
					<th><font color="white">操作</font></th>
				</tr>
				<s:iterator value="pageBean.Items" var="paper" status="status">
					<tr>
						<td>${status.count }</td>
						<td>${paper.pType }</td>
						<td>[${paper.course.major }&nbsp;${paper.course.stage }]\n${paper.course.csName }</td>
						<td>${paper.pName }</td>
						<!-- TODO 显示所有班级 -->
						<td>${paper.paperClasses }</td>
						<td>${paper.pTime }</td>
						<!-- TODO 状态颜色 -->
						<td>${paper.pSate }</td>
						<!-- TODO 根据状态显示不同的操作-->
						<td>
							
						</td>
					</tr>
				</s:iterator>
			</table>

			<div align="right" id="marginTop">
				第${pageBean.currentIndex }页， 共${pageBean.totalPage }页&nbsp;&nbsp;
			<a
				href="paper/paper_getPaperList?csId=${csId }&pType=${pType}&pState=${pState }&pageIndex=1">首页</a>&nbsp;
			<a
				href="paper/paper_getPaperList?csId=${csId }&pType=${pType}&pState=${pState }&pageIndex=${pageBean.preIndex }">上一页</a>&nbsp;
			<a
				href="paper/paper_getPaperList?csId=${csId }&pType=${pType}&pState=${pState }&pageIndex=${pageBean.nextIndex }">下一页</a>&nbsp;
			<a
				href="paper/paper_getPaperList?csId=${csId }&pType=${pType}&pState=${pState }&pageIndex=${pageBean.totalPage }">末页</a>
			</div>
		</fieldset>
	</div>
</body>
</html>
