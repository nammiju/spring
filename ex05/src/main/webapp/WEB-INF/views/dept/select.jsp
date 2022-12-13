<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dept select.jsp</title>
<style>
</style>
</head>
<body>
	<h3>부서조회</h3>
	<ul>
		<li>부서번호: ${dept.departmentId }</li>
		<li>부서명: ${dept.departmentName }</li>
		<li>매니저ID: ${dept.managerId }</li>
		<li>위치ID: ${dept.locationId }</li>
	</ul>
	<button id="updateBtn">부서 수정페이지 이동</button>
	<button id="deleteBtn">부서 삭제</button>

	<script>
		updateBtn.addEventListener("click", ev=>{ 
		location.assign('update?id=${dept.departmentId}')
		})
		deleteBtn.addEventListener("click", ev=>{ 
			location.assign('delete?id=${dept.departmentId}')
		})
</script>

</body>
</html>