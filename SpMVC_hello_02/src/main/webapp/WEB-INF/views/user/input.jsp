<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자 추가하기</h1>
	<form method="POST">	
			<div><input name="username" placeholder="username"></input></div>
			<div><input name="password" placeholder="비밀번호"></input></div> 
			<div><input name="re_password" placeholder="비밀번호 확인"></input></div> 
			<div><input name="name" placeholder="이름"></input></div>
			<div><input name="tel"placeholder="전화번호"></input></div> 
		    <div><input name="addr" placeholder="주소"></input></div>
			<div><input name="age" placeholder="나이"></input></div>
			<div><button>추가하기</button></div>
	</form>
	<a href="${rootPath}/user/list">리스트로</a>
</body>
</html>