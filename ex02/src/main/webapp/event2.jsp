<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>event2</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		//버튼 클릭: 텍스트 필드 입력값을 li태그에 생성해서 추가
		//제이쿼리 버전
		$("#btn").on("click", function() {
			/* let txt = $("#inTxt").val();
			let li = `<li>\${txt}</li>`
			$('ul').append(li); */
			let li = $("<li>");
			li.html( $("#inTxt").val() );
			$("#list").append(li);
			$("#inTxt").val("");
		})
		
		//그룹이벤트(위임, 이벤트전파)ㅊ
		//li태그 클릭하면 배경색 변경
	 	$("ul").on("click", 'li', function(){ // 부모에게 이벤트를 걸어주고 클릭하면 이벤트가 적용될 요소를 적어주고 함수를 적어줌
	 		$(this).css('background-color', 'yellow');
	 	})
	})
</script>
</head>
<body>
	<input id=inTxt>
	<button type="button" id="btn">등록</button>
	<ul id="list">
	 <li>사과</li>
	 <li>바나나</li>
	</ul>
</body>
</html>