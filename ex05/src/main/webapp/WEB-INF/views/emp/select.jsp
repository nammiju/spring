<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select.jsp</title>
<style>
</style>
</head>
<body>
	<h3>사원조회</h3>
	<ul>
		<li>사번: ${emp.employeeId }</li>
		<li>이름: ${emp.firstName } ${emp.lastName}</li>
		<li>직무: ${emp.jobId }</li>
		<li>부서번호: ${emp.departmentId }</li>
		<li>입사일: ${emp.hireDate }</li>
	</ul>
	<button id="updateBtn">사원 수정페이지 이동</button>
	<button id="deleteBtn">사원 삭제</button>

	<script>
		updateBtn.addEventListener("click", ev=>{ 
		location.assign('update?id=${emp.employeeId}')
		})
		deleteBtn.addEventListener("click", ev=>{ 
			location.assign('delete?id=${emp.employeeId}')
		})
</script>

</body>
</html>