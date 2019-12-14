<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
.all_list_brands_title_details_btn {
	width: 30px;
	height: 30px;
	text-align: center;
	font-size: 12px;
	line-height: 1.428571429;
	border-radius: 15px;
	margin-top: 30px;
	margin-left: 30px;
	float: left;
	background-color: red;
	border: 1px solid #d5d5d5;
}
</style>
<script type="text/javascript">
	
	/* document.addEventListener('UniAppJSBridgeReady', function() {
		document.querySelector('.btn-list').addEventListener('click',
				function(evt) {
					var target = evt.target;
					if (target.tagName === 'BUTTON') {
						var action = target.getAttribute('data-action');
						if (action === 'navigateTo') {
							uni.navigateTo({
								url : '/pages/component/button/button'
							});
						}
					}
				});
	});
	 */
	function gotoHome() {
		uni.navigateTo({
			url : '/pages/index/index'
		});
	}
</script>
<div id="dg"
	style="z-index: 9999; position: fixed ! important; left: 10vw; top: 60vh;">
	<img id="gotoback" onclick="gotoHome();" style="width: 10vw; opacity: 0.5;"
		alt="return" src="/return.jpeg">
</div>
