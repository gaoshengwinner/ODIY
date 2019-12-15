<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/tagLib.jsp"%>
<!doctype html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>会員ログイン</title>
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
	<form:form modelAttribute="memgerRegistMailCFForm" class="form login-form"
		action="/member/regist_mailcf" method="post">
		<h3 style="border-left: 6px solid #00BFFF; padding: 0px 2px 0px 10px;">メルー確認</h3>
		<h5>貴方の登録用メルーアドレスへ送った確認コードを入力してください。</h5>
		<form:input path="code" placeholder="確認コードを入力してください。" />
		<form:errors path="*" class="error" htmlEscape="div" />
		<button>確認</button>
		<p class="message">
			<a href="/member/regist">アカウント登録>></a>
		</p>
	</form:form>
</body>

</html>
