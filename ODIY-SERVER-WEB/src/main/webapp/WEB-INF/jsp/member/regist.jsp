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
	<form:form modelAttribute="memgerRegistForm" class="form login-form"
		action="${ctx}/member/regist" method="post">
		<h3 style="border-left: 6px solid #00BFFF; padding: 0px 2px 0px 10px;">アカウント登録</h3>
		<form:input path="memberEmail" placeholder="メールアドレス" />
		<form:errors path="memberEmail" class="error" htmlEscape="div" />
		<form:password path="memberPassword" placeholder="パースワード" />
		<form:errors path="memberPassword" class="error" htmlEscape="div" />
		<form:password path="memberPasswordcf" placeholder="パースワード" />
		<form:errors path="memberPasswordcf" class="error" htmlEscape="div" />
		<button>次へ</button>
		<div style="width: 100%; text-align: right;">
			<p class="message">
				<a href="${ctx}/member/login">ログイン>></a>
			</p>
		</div>
	</form:form>
</body>

</html>
