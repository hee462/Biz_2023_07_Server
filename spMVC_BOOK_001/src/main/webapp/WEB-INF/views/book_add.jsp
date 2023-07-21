<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객등록</title>
<link href="${rootPath}/static/css/input.css?20230712-003" 
		rel="stylesheet">
</head>
<body>
	<form class="main" method="POST" 
			>
		<div><label>회원코드</label>
			<input name="u_code" value="${USER.u_code}"/>
		</div>
		<div><label>고객이름</label>
			<input name="u_name" value="${USER.u_name}"/>
		</div>
		<div><label>전화번호</label>
			<input name="u_tel" value="${USER.u_tel}"/>
		</div>
		<div><label>주소</label>
			<input name="u_add" value="${USER.u_add}"/>
		</div>
		
		<div class="button-box"><button>저장하기</button></div>
	</form>
	
	
</body>
</html>