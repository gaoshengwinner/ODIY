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
	$('button').click(function() {
		$('form').submit();
	});
</script>
</head>
<body class="myBody">
	<%@ include file="/WEB-INF/jsp/common/returnButton.jsp"%>
	<form:form modelAttribute="memgerLoginForm" class="form login-form"
		action="/member/login" method="post">
		<h3 style="border-left: 6px solid #00BFFF; padding: 0px 2px 0px 10px;">ログインしてください</h3>
		<input type="text" placeholder="メールアドレス" name="memberEmail" />
		<form:errors path="memberEmail" class="error" htmlEscape="div" />
		<input type="password" placeholder="パースワード" name="memberPassword" />
		<form:errors path="memberPassword" class="error" htmlEscape="div" />
		<div style="white-space: nowrap; width: 10px">
			<input type="checkbox" id="remembermeParamater"
				name="remembermeParamater" value="true" checked title="" /> <label
				for="remembermeParamater" class="message" for="remembermeParamater">ログインしたままにする</label>
		</div>
		<button>登録</button>
		<div style="width: 100%; text-align: right;">
			<p class="message">
				<a href="/member/regist">会員のご登録はこちら>></a>
			</p>
		</div>
	</form:form>
</body>

</html>
