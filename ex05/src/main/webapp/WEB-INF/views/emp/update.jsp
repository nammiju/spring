<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update.jsp</title>
</head>
<body>
	<h3>사원수정</h3>
	<form method="post"
		action="${pageContext.request.contextPath}/emp/update">
		<ul>
			<li>사번 : <input name="employeeId" value="${emp.employeeId}"
				readonly></li>
			<li>이름: <input name="firstName" value="${emp.firstName}"></li>
			<li>성: <input name="lastName" value="${emp.lastName}"></li>
			<li>이메일: <input name="email" value="${emp.email}"></li>
			<li>입사연도: <input type="date" name="hireDate" value="${emp.hireDate}"></li>
			<li>직무: <input name="jobId" value="${emp.jobId}"></li>
		</ul>
		<button>수정</button>
	</form>
</body>
</html>