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
	<h3>사원목록</h3>
	<a href="${pageContext.request.contextPath}/emp/insert">사원등록</a>
	<table border="1">
		<tr>
			<th>employeeId</th>
			<th>departmentId</th>
			<th>firstName</th>
			<th>lastName</th>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr>
				<td><a href="./select?id=${emp.employeeId}">${emp.employeeId}</a></td>
				<td>${emp.departmentId}</td>
				<td><a
					href="${pageContext.request.contextPath}/emp/select?id=${emp.employeeId}">${emp.firstName}</a></td>
				<td>${emp.lastName}</td>
			</tr>
		</c:forEach>
	</table>

		<!-- Modal -->
	<div class="modal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Modal title</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<p>Modal body text goes here.</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
	
	<script>
		let result = '${result}';
		if (result) {
			$(".modal-body").html(result);
			//모달 생성
			myModal = $('.modal').modal();
			$(".modal").modal('show');
		}
	</script>
</body>
</html>