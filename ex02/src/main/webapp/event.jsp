<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>event</title>
<script type="text/javascript">
window.addEventListener("load", function () {
		//버튼 클릭: 텍스트 필드 입력값을 li태그에 생성해서 추가
		//자바스크립트 버전
		btn.addEventListener("click", function(){
			let li = document.createElement("li");
			li.innerHTML = inTxt.value;
			list.append(li);
			inTxt.value = "";
		})
		
		list.addEventListener("click", function(){
			//event.target == this
			console.log('this', this);
			console.log('target', event.target);
			if( event.target.nodeName == 'LI') {
				event.target.style.backgroundColor = 'yellow';
			}
		})
	})
</script>
</head>
<body>
	<input id=inTxt><button type="button" id="btn">등록</button>
	<ul id="list">
	 <li>사과</li>
	 <li>바나나</li>
	</ul>
</body>
</html>