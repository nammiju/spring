<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		부서: <input name="departmentId"> 
		firstName: <input name="firstName">
		<button>검색</button>
	</form>
	<table>
		<tr>
			<th>number</th>
			<th>employeeId</th>
			<th>departmentId</th>
			<th>firstName</th>
			<th>lastName</th>
		</tr>
		<c:forEach items="${emps}" var="emp" varStatus="st">
			<tr>
				<td>${st.count}</td>
				<td>${emp.employeeId}</td>
				<td>${emp.departmentId}</td>
				<td>${emp.firstName}</td>
				<td>${emp.lastName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>