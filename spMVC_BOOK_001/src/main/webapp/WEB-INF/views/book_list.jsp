<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="main list">
	<tr>
		<th>도서코드</th>
		<th>도서명</th>
		<th>지은이</th>
		<th>구입연도</th>
		<th>대여가격</th>
		<th>사용자
		<th>
	</tr>
	<c:forEach items="${BOOK_LIST}" var="BOOK">
		<tr>
			<td>${BOOK.b_code}</td>
			<td>${BOOK.b_name}</td>
			<td>${BOOK.b_auther}</td>
			<td>${BOOK.b_year}</td>
			<td>${BOOK.b_rprice}</td>
			<td>사용자</td>

		</tr>
	</c:forEach>

		<%
		// 주소추가를 클릭하면'
		// 서버에 /insert URL로 GET request로 보낸다
		//	  GET /insert HTTP1.0
		%>
		<a href="${rootPath}/book_add">도서 추가</a>

	</table>