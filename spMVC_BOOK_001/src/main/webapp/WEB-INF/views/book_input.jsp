<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
<link href="${rootPath}/static/css/input.css?20230712-003" 
		rel="stylesheet">
</head>
<body>
	<form class="main" method="POST" 
			enctype="multipart/form-data" >
		<div><label>도서코드</label>
			<input name="b_code" value="${BOOK.b_code}"/>
		</div>
		<div><label>도서명</label>
			<input name="b_name" value="${BOOK.b_name}"/>
		</div>
		<div><label>지은이</label>
			<input name="b_auther" value="${BOOK.b_auther}"/>
		</div>
		<div><label>출판사</label>
			<input name="b_comp" value="${BOOK.b_comp}"/>
		</div>
		<div><label>구입년도</label>
			<input name="b_year" value="${BOOK.b_year}"/>
		</div>
		<div><label>구입가역</label>
			<input name="b_iprice" value="${BOOK.b_iprice}"/>
		</div>
		<div><label>대여가격</label>
			<input name="b_rprice" value="${BOOK.b_rprice}"/>
		</div>
		

		<div class="button-box"><button>저장하기</button></div>
	</form>
	
	
</body>
</html>