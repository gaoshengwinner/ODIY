<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/tagLib.jsp"%>
<!doctype html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>ログインしてください</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<!-- uni 的 SDK，必须引用。 -->
<script type="text/javascript"
	src="https://js.cdn.aliyun.dcloud.net.cn/dev/uni-app/uni.webview.1.5.1.js"></script>
<link rel="stylesheet" type="text/css"
	href="/res/login_regist/login_regist.css" />
<style type="text/css">
.myBody {
	padding-top: 8%;
	padding-left: 0%;
}
</style>
<script type="text/javascript">
	$('.message a').click(function() {
		$('form').animate({
			height : "toggle",
			opacity : "toggle"
		}, "slow");
	});

	$(".message").click(function() {
		// touchstar以降のイベントを発生させないように
		//event.preventDefault();

		alert(1);
		// 何らかの処理
		document.getElementId('mydate').type = 'date';
	});
	$(function() {
		var a = document.querySelector('.mydate').addEventListener(
				'touchstart', function(event) {
					// touchstar以降のイベントを発生させないように
					//event.preventDefault();
					document.getElementById('mydate').type = 'date';
					// 何らかの処理
					//foo();  
				});
	});
</script>
</head>
<body class="myBody">
	<%@ include file="/WEB-INF/jsp/common/returnButton.jsp"%>
	<form:form modelAttribute="memgerLoginForm" class="form login-form"
		action="/member/login" method="post">
		<h3 style="border-left: 6px solid #00BFFF; padding: 0px 2px 0px 10px;">ログインしてください</h3>
		<c:if test="${not empty param.error}">
			<span class="error">メールアドレス或いはパースワードはただしくありません。</span>
		</c:if>
		<%-- <div>
		<%@ include file="/WEB-INF/jsp/common/slidercaptcha.jsp"%>
		</div> --%>
		<input type="text" placeholder="メールアドレス" name="memberEmail" />
		<form:errors path="memberEmail" class="error" htmlEscape="div" />
		<input type="password" placeholder="パースワード" name="memberPassword" />
		<form:errors path="memberPassword" class="error" htmlEscape="div" />
		<div style="white-space: nowrap; width: 10px">
			<input class="message" type="checkbox" id="remembermeParamater"
				name="remembermeParamater" value="true" checked title="" /> <label
				for="remembermeParamater" class="message" for="remembermeParamater">ログインしたままにする</label>
		</div>
		<input type="text" class="mydate" name="mydate"
			onblur="this.type='text';" id="mydate" placeholder="生年月日を入力してください。">
		<button>登録</button>
		<div style="width: 100%; text-align: right;">
			<p class="message">
				<a href="${ctx}/member/regist">会員のご登録はこちら>></a>
			</p>
		</div>
	</form:form>
</body>

</html>
