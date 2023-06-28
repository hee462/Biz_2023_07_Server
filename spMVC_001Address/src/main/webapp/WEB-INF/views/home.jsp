<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/main.css?20230628-002" rel="stylesheet">
<link href="${rootPath}/static/css/table.css?20230628-002" rel="stylesheet">
<link href="${rootPath}/static/css/button.css?20230628-002" rel="stylesheet">
<link href="${rootPath}/static/css/form.css?20230628-002" rel="stylesheet">

</head>
<body>
	<header>
		<h1>주소록 프로젝트 2023</h1>
		<p>Spring MVC 패턴 기반 주소록 프로젝트</p>

	</header>
	<section class="main">
	<c:if test="${empty BODY}">
	
	<%@ include file="/WEB-INF/views/addr/list.jsp" %>
	
	</c:if>
		<c:if test="${BODY =='INPUT'}">
	
	<%@ include file="/WEB-INF/views/addr/input.jsp" %>
	
	</c:if>
	</section>
	
	<footer>
		<address>CopyRight &copy; hee462@hee462.com</address>
	</footer>
</body>
</html>