<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 검색조건 시작 -->
	<form name="searchFrm">
		부서: <my:select2/>
		<%-- <my:select departmentId="${empVO.departmentId}"/> --%>
		firstName: <input name="firstName" value="${empVO.firstName}">
		<input type="hidden" name="page" value="1">
		<button>검색</button>
	</form>
	<!-- 검색조건 종료 -->
	
	<!-- 목록 시작 -->
	<table class="table table-dark table-striped">
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
				<td><a href="./empSelect?id=${emp.employeeId}">${emp.firstName}</a></td>
				<td>${emp.lastName}</td>
			</tr>
		</c:forEach>
	</table>
	<!-- 목록 끝 -->
	
	<!-- 페이징 시작 -->
	 <my:paging paging="${paging}" jsFunc="gopage"></my:paging>
	<!-- 페이징 끝 -->
	
	<script>
	function gopage(i){
		searchFrm.page.value = i;
		searchFrm.submit();
	}
	</script>
</body>
</html>