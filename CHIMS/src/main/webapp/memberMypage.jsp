<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<title>재고관리</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- VENDOR CSS -->
<link rel="stylesheet"
	href="./resources/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/vendor/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="./resources/vendor/linearicons/style.css">
<!-- MAIN CSS -->
<link rel="stylesheet" href="./resources/css/main.css">
<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
<link rel="stylesheet" href="./resources/css/demo.css">
<!-- GOOGLE FONTS -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700"
	rel="stylesheet">
<!-- ICONS -->
<link rel="apple-touch-icon" sizes="76x76"
	href="./resources/img/apple-icon.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="./resources/img/favicon.png">
</head>
<body>

	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- NAVBAR -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="brand">
				<a href="main.do">병원재고관리</a>
			</div>
			<div class="container-fluid">
				<div class="navbar-btn">
					<button type="button" class="btn-toggle-fullwidth">
						<i class="lnr lnr-arrow-left-circle"></i>
					</button>
				</div>
				<form class="navbar-form navbar-left">
					<!-- <div class="input-group">
						<input type="text" value="" class="form-control"
							placeholder="Search dashboard..."> <span
							class="input-group-btn"><button type="button"
								class="btn btn-primary">Go</button></span>
					</div> -->
				</form>

				<div id="navbar-menu">
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown"><a href="#"
							class="dropdown-toggle icon-menu" data-toggle="dropdown"> <i
								class="lnr lnr-alarm"></i> <span class="badge bg-danger">5</span>
						</a> <!-- 알람 토글 -->
							<ul class="dropdown-menu notifications">
								<li><a href="#" class="notification-item"><span
										class="dot bg-warning"></span>System space is almost full</a></li>
								<li><a href="#" class="notification-item"><span
										class="dot bg-danger"></span>You have 9 unfinished tasks</a></li>
								<li><a href="#" class="notification-item"><span
										class="dot bg-success"></span>Monthly report is available</a></li>
								<li><a href="#" class="notification-item"><span
										class="dot bg-warning"></span>Weekly meeting in 1 hour</a></li>
								<li><a href="#" class="notification-item"><span
										class="dot bg-success"></span>Your request has been approved</a></li>
								<li><a href="#" class="more">See all notifications</a></li>
							</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"><span>Logout</span></a>
						</li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"><span>${member_name}</span> <i
								class="icon-submenu lnr lnr-chevron-down"></i></a>
							<ul class="dropdown-menu">
								<li><a href="#"><i class="lnr lnr-user"></i> <span>My
											Page</span></a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</nav>
		<!-- END NAVBAR -->

		<!-- LEFT SIDEBAR -->
		<div id="sidebar-nav" class="sidebar">
			<div class="sidebar-scroll">
				<nav>
					<ul class="nav">
						<li><a href="#subPages" data-toggle="collapse" class="collapsed">
								<i class="lnr lnr-file-empty"></i> <span>물품관리</span>
								<i class="icon-submenu lnr lnr-chevron-left"></i>
							</a>
							<div id="subPages" class="collapse ">
								<ul class="nav">
									<li><a href="memberMain.do" class="">물품리스트</a></li>
									<li><a href="memberProductInsert.do" class="">물품추가</a></li>
								</ul>
							</div>
						</li>
						<li><a href="memberOrder.jsp" class=""><i
								class="lnr lnr-code"></i> <span>물품청구</span></a></li>
						<li><a href="memberOrderList.do" class=""><i
								class="lnr lnr-chart-bars"></i> <span>청구리스트</span></a>
						</li>
					</ul>
				</nav>
			</div>
		</div>
		<!-- END LEFT SIDEBAR -->

		<div class="main">
			<div class="container">
				<form class="form-horizontal" action="memberMain.do" role="form">
					<h4>Registration</h4>
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">아이디</label>
						<div class="col-sm-9">
							<input type="text" id="firstName" placeholder="ID"
								class="form-control" name="member_id" autofocus>
						</div>
					</div>
					<div class="form-group">
						<label for="lastName" class="col-sm-3 control-label">비밀번호</label>
						<div class="col-sm-9">
							<input type="password" id="lastName" placeholder="password"
								class="form-control" name="member_password" autofocus>
						</div>
					</div>
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">이름</label>
						<div class="col-sm-9">
							<input type="text" placeholder="name" class="form-control"
								name="member_name">
						</div>
					</div>

					<div class="form-group">
						<label for="password" class="col-sm-3 control-label">부서</label>
						<div class="col-sm-9">
							<input type="text" placeholder="dept" class="form-control"
								name="dept_no">
						</div>
					</div>

					<button type="submit" class="btn btn-primary btn-block">수정</button>
				</form>
				<!-- /form -->
			</div>
			<!-- ./container -->
		</div>


		<!-- Javascript -->
		<script src="./resources/vendor/jquery/jquery.min.js"></script>
		<script src="./resources/vendor/bootstrap/js/bootstrap.min.js"></script>
		<script
			src="./resources/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
		<script src="./resources/scripts/klorofil-common.js"></script>
</body>
</html>