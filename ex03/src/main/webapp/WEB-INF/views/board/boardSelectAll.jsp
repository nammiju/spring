<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 검색조건 시작 -->
	<form name="searchFrm">
		제목: <input name="title" value="${boardVO.title}">
		작성자: <input name="writer" value="${boardVO.writer}">
		<input type="hidden" name="page" value="1">
		<button>검색</button>
	</form>
	<!-- 검색조건 종료 -->

	<!-- 목록 시작 -->
	<table class="table table-striped">
		<tr>
			<th>NO</th>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성시간</th>
		</tr>
		<c:forEach items="${boards}" var="board" varStatus="st">
			<tr>
				<td>${st.count}</td>
				<td>${board.bno}</td>
				<td><a href="./boardSelect?bno=${board.bno}">${board.title}</a></td>
				<td>${board.writer}</td>
				<td>${board.regdate}</td>
			</tr>
		</c:forEach>
	</table>
	<!-- 목록 끝 -->

	<!-- 페이징 시작 -->
	<my:paging paging="${paging}" jsFunc="gopage"></my:paging>
	<!-- 페이징 끝 -->

	<script>
		function gopage(i) {
			searchFrm.page.value = i;
			searchFrm.submit();
		}
	</script>
</body>
</html>