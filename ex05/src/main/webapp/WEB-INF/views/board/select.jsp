<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardSelect</title>
<script type="text/javascript">
	let path = '${pageContext.request.contextPath}';
	$(function(){
		replyList();
		replyInsert();
		replyUpdate();
		replyDelete();
		
		//댓글 출력 
		function replyList(){
			let bno = ${board.bno};
			$.ajax({
				url : path + '/reply/' + encodeURIComponent(bno),
			}).then( res => {
				for( reply of res){
					$("tbody").append(makeTr(reply));					
				}
			})
		}
		
		//댓글 등록
		function replyInsert(){
			$("#btnInsert").on("click", function(){
				$.ajax({
					url : path + '/reply',
					method : "post",
					data : $("#replyForm").serialize(),
					dataType : 'json'
				}).then( res => {
					alert("등록완료");
					$("tbody").append(makeTr(res));
				})
			})
		}
		
		//댓글 수정
		function replyUpdate(){
			$("#btnUpdate").on("click", function(){
				let tr = $(this).closest("tr");
				$("#name").val(${reply.replyer});
				$("#reply").val(${reply.reply});
				$.ajax({
					url : path + '/reply',
					method : "put",
					data : JSON.stringify( $("#replyForm").serializeObject() ),
					contentType : "application/json"
				}).then( res => {
					alert("수정완료");
					tr.replaceWith(	makeTr(res)	);
				})
			})
		}
		//댓글 삭제
		function replyDelete(){
			$("#btnDelete").on("click", function(){
				let tr = $(this).closest("tr");
				let bno = $(this).closest("tr").data("bno");
				$.ajax({
					url : path+ '/reply/' + bno,
					method : "delete"
					//date:
					//contentType:
				}).then(res => {
					alert("삭제완료");
					tr.remove();
				})
			})
		}
		
		//댓글 tr만들어줌
		function makeTr(reply){
			let tr = `<tr data-bno="\${reply.bno}">
				<td>\${reply.replyer}</td>
				<td>\${reply.reply} </td>
				<td>\${reply.replyDate }</td>
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
			<label>작성자:</label> <input type="text" name="replyer" id="name"> 
			<label>내용:</label> <input type="text" name="reply" id="reply"> 
			<input type="button"
				class="btn btn-primary" value="등록" id="btnInsert" />
				<input type="hidden" name="bno" value="${board.bno}" >
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