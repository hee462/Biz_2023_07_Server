<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230704-008" var="version" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TO DO List 2023</title>
<link href="${rootPath}/resources/css/home.css?${version}" rel="stylesheet">
<script>
var rootPath ="${rootPath}"
</script>
</head>
<body>
	<h1>TO DO List 2023</h1>
	<div class="input_box">
		<input class="input" placeholder="작성일자" type="date" id="currentdate"/> 
		<input class="input" placeholder="작성시각" type="time" id="currenttime"/> 
		<input class="input3" placeholder="작성할일"/>
	</div>

	<table class="list">
		<tr>
			<th>NO.</th>
			<th>할일</th>
			<th>완료여부</th>
		</tr>
		<tr>
			<td>1</td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>2</td>
			<td></td>
			<td></td>
		</tr>

	</table>
</body>
</html>