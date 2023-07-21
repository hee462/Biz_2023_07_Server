<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서대출</title>
<link href="${rootPath }/resources/css/home.css" rel="stylesheet">
<link href="${rootPath }/resources/css/input.css" rel="stylesheet">
<script>
	var rootPath = "${rootPath}"
</script>
<script src="${rootPath}/resources/js/home.js"></script>
</head>
<body>
	<header class="main">도서대여</header>
	<nav class="main">
		<ul>
			<li class="home">HOME</li>
			<li class="rent_book">도서대여</li>
			<li class="book">도서관리</li>
			<li class="user">회원관리</li>
			<li class="login">로그인</li>
			<li class="admin">관리자</li>

		</ul>
	</nav>
	
		<%@ include file="/WEB-INF/views/user_list.jsp"%>
</body>
</html>