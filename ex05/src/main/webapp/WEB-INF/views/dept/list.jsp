<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dept List.jsp</title>
</head>
<body>
	<h3>부서목록</h3>
	<a href="${pageContext.request.contextPath}/dept/insert">부서등록</a>
	<table border="1">
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>매니저ID</th>
			<th>위치ID</th>
		</tr>
		<c:forEach items="${depts}" var="dept">
			<tr>
				<td><a href="./select?id=${dept.departmentId}">${dept.departmentId}</a></td>
				<td>${dept.departmentName}</td>
				<td>${dept.managerId}</td>
				<td>${dept.locationId}</td>
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