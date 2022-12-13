<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update.jsp</title>
</head>
<body>
	<h3>부서수정</h3>
	<form method="post"
		action="${pageContext.request.contextPath}/dept/update">
		<ul>
			<li>부서번호: <input name="departmentId"
				value="${dept.departmentId}" readonly></li>
			<li>부서명: <input name="departmentName"
				value="${dept.departmentName}"></li>
			<li>매니저ID: <select name="managerId">
					<c:forEach items="${employees}" var="employee">
						<option value="${dept.managerId} ">${employee.employeeId}/${employee.firstName}</option>
					</c:forEach>
			</select>
			</li>
			<li>위치ID: <select name="locationId">
					<c:forEach items="${locations}" var="location">
						<option value="${dept.locationId}">${location.city}</option>
					</c:forEach>
			</select>
			</li>
		</ul>
		<button>수정</button>
	</form>
</body>
</html>