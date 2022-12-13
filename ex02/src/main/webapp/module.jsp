<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button type="button" id="btnInsert">등록</button>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">	
	// 즉시실행함수
	(function(greet) {
		console.log(greet)
	})('hello');

		
	var replyService = (function() {
		return { name : 'AAAA',
				add : function(msg){ console.log(msg); },
				upd : function(){ console.log('upd'); },
				del : function(){ console.log('del'); }
				}
	})();
	
	$("#btnInsert").on("click", function(){replyService.add('ddddd')
		})

</script>
</body>
</html>