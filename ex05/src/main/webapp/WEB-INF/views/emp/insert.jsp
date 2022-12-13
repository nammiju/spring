<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert.jsp</title>
</head>
<body>
	<h3>사원등록</h3>
	<form method="post"
		action="${pageContext.request.contextPath}/emp/insert">
		<ul>
			<li>이름: <input name="firstName"></li>
			<li>성: <input name="lastName"></li>
			<li>이메일: <input name="email"></li>
			<li>입사연도: <input name="hireDate"></li>
			<!-- 참조키: select, radio, checkbox등으로 값을 넣는게 조음 -->
			<li>직무: <select name="jobId">
					<c:forEach items="${jobs}" var="job">
						<option value="${job.jobId }">${job.jobTitle }</option>
					</c:forEach>
			</select>
			</li>
			<li>부서번호: <input name="dapartmentId"></li>
		</ul>
		<button>등록</button>
	</form>
</body>
</html>