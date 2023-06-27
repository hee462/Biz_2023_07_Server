<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
// Rendering 작업하기 위한 코드

%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" 
			prefix ="c"%>
<%
// var rootPath = pageContext.request.contextPath;
// core tag를 사용하여 현재 page에서 사용할 변수 선언하기

%>
<c:set value ="${pageContext.request.contextPath}"
		var="rootPath"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>User List</h1>
	<%
	/*
	UserController 에서 설정한 USERS Attribute를 
	table을 사용하여 화면에 Rendering하기
	*/
	%>
		<table>
			<tr>
				<td>USER NAME</td>
				<td>이름</td>
				<td>전화번호</td>
				<td>나이</td>
				<td>주소</td>
			</tr>
			 <c:forEach items ="${USERS}" var ="USER">
			<tr>
			<td>${USER.username}</td>
			<td>${USER.name}</td>
			<td>${USER.tel}</td>
			<td>${USER.age}</td>
			<td>${USER.addr}</td>
			</tr>
			 </c:forEach>
		</table>
		<a href="${rootPath}/user/input">추가하기</a>
</body>
</html>