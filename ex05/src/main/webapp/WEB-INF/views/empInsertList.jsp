<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empInsertList.jsp</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/emp/insertList">
		<input name="emps[0].employeeId" value="100">
		<input name="emps[0].firstName" value="동길동"> <br/>
		<input name="emps[1].employeeId" value="101">
		<input name="emps[1].firstName" value="신순신"> <br/>
		<button>등록</button>
	</form>
	
</body>
</html>