<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardSelect</title>
<script type="text/javascript">
	$(function(){
		replyInsert();
		
		//댓글 등록
		function replyInsert(){
			$("#btnInsert").on("click", function(){
				$.ajax({
					
				})
			})
		}
		
		//댓글 tr만들어줌
		function makeTr(reply){
			let tr = `<tr>
				<td>${reply.replyer}</td>
				<td>${reply.reply} </td>
				<td>${reply.replyDate}</td>
				<td><button type="button" id="btnUpdate">수정</td>
				<td><button type="button" id="btnDelete">삭제</td>
			</tr>`
			return tr;
		}
	})
</script>
</head>
<body>
	<h3>게시글 상세보기</h3>
	<ul>
		<li>작성자: ${board.writer}</li>
		<li>제목: ${board.title}</li>
		<li>내용: ${board.content}</li>
		<c:choose>
			<c:when test="${board.regdate != board.updatedate}">
				<li>작성일:${board.regdate} | 수정일: ${board.updatedate}</li>
			</c:when>
			<c:otherwise>
				<li>작성일: ${board.regdate}</li>
			</c:otherwise>
		</c:choose>
	</ul>
	<hr />
	<div class="container">
		<form id="replyForm" class="form-horizontal">
			<h5>댓글 등록</h5>
			<label>작성자:</label> <input type="text" class="form-control"
				name="replyer"> <label>내용:</label> <input type="text"
				class="form-control" name="reply"> <input type="button"
				class="btn btn-primary" value="등록" id="btnInsert" />
		</form>
	</div>
	<hr />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>작성자</th>
				<th>내용</th>
				<th>작성일자</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>

		</tbody>
	</table>

	<script type="text/javascript">
		
	</script>
</body>
</html>