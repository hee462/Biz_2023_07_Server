<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>car</title>
<link href="${rootPath }/resources/css/home.css?2023-07-14-0044"
	rel="stylesheet">
</head>
<body>
	<h1>MY CAR MANAGER</h1>
	<section class="main">

		<form method="POST" action="${rootPath}/insert">
			<div class="input_box">
				<span>운행등록</span> 
				<input placeholder="구분" name="c_div"></input> 
				<input placeholder="시작거리(km)" name="c_startKm"></input> 
				<input placeholder="종료거리(km)" name="c_endKm"></input> 
				<input placeholder="장소" name="c_place"></input> 
				<input placeholder="소요비용" name="c_cost"></input>
			</div>
			<div class="button_box">
				<button>저장</button>
			</div>
		</form>

		<table class="main">
			<tr>
				<th>NO.</th>
				<th>구분</th>
				<th>출발일자</th>
				<th>출발시간</th>
				<th>출발거리(Km)</th>
				<th>도착일자</th>
				<th>도착시간</th>
				<th>도착거리(Km)</th>
				<th>장소</th>
				<th>소요비용</th>
			</tr>
			<c:forEach items="${CAR_LIST}" var="CAR">
				<tr>
					<td>${CAR.c_seq}</td>
					<td>${CAR.c_div}</td>
					<td>${CAR.c_startDate}</td>
					<td>${CAR.c_startTime}</td>
					<td>${CAR.c_startKm}</td>
					<td>${CAR.c_place}</td>
					<td>${CAR.c_cost}</td>
				</tr>
			</c:forEach>
				<c:forEach items="${CAR_LIST}" var="CAR">
				<form>
				<table>
				
				<tr>
					<td>${CAR.c_seq}</td>
					<td>${CAR.c_div}</td>
					<td>${CAR.c_startDate}</td>
					<td>${CAR.c_startTime}</td>
					<td>${CAR.c_startKm}</td>
					<td>${CAR.c_place}</td>
					<td>${CAR.c_cost}</td>
				</tr>
				
				</table>
				
				</form>
			</c:forEach>
		</table>
	</section>
</body>
</html>