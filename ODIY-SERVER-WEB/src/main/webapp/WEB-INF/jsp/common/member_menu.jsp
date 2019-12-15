<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<link rel="stylesheet" type="text/css" href="${ctx}/res/memberz_menu/css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="${ctx}/res/memberz_menu/fonts/font-awesome-4.2.0/css/font-awesome.min.css" />
		<link rel="stylesheet" type="text/css" href="${ctx}/res/memberz_menu/css/menu_sideslide.css" />

			<div class="menu-wrap">
				<nav class="menu">
					<div class="icon-list">
						<a href="#"><i class="fa fa-fw fa-star-o"></i><span>店管理</span></a>
						<a href="#"><i class="fa fa-fw fa-bell-o"></i><span>メニュー管理</span></a>
						<a href="#"><i class="fa fa-fw fa-envelope-o"></i><span>設定</span></a>
						<a href="/member/logout"><i class="fa fa-fw fa-newspaper-o"></i><span>ログアウト</span></a>
					</div>
				</nav>
				<button class="close-button" id="close-button">Close Menu</button>
			</div>
			<button class="menu-button" id="open-button">Open Menu</button>
		<script src="${ctx}/res/memberz_menu/js/classie.js"></script>
		<script src="${ctx}/res/memberz_menu/js/main.js"></script>
