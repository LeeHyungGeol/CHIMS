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
						<li class="dropdown"><a href="login.do"
							class="dropdown-toggle"><span>Logout</span></a></li>
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
						<li><a href="#subPages" data-toggle="collapse"
							class="collapsed"> <i class="lnr lnr-file-empty"></i> <span>물품관리</span>
								<i class="icon-submenu lnr lnr-chevron-left"></i>
						</a>
							<div id="subPages" class="collapse ">
								<ul class="nav">
									<li><a href="adminMain.do" class="">물품리스트</a></li>
									<li><a href="adminProductInsert.do" class="">물품추가</a></li>
								</ul>
							</div></li>
						<li><a href="adminOrderList.do" class=""><i
								class="lnr lnr-code"></i> <span>청구리스트</span></a></li>
						<li><a href="adminConfirmList.do" class=""><i
								class="lnr lnr-chart-bars"></i> <span>발주리스트</span></a></li>

						<li><a href="#subPages1" data-toggle="collapse"
							class="collapsed"> <i class="lnr lnr-file-empty"></i> <span>회원관리</span>
								<i class="icon-submenu lnr lnr-chevron-left"></i>
						</a>
							<div id="subPages1" class="collapse ">
								<ul class="nav">
									<li><a href="adminMemberList.do" class="">회원리스트</a></li>
									<li><a href="adminMemberInsert.do" class="">회원추가</a></li>
								</ul>
							</div></li>
					</ul>
				</nav>
			</div>
		</div>
		<!-- END LEFT SIDEBAR -->

		<div class="main" align="center">
			<div class="container">
				<form class="form-horizontal" action="adminProductUpdate.do"
					method="post" role="form">
					<h4>물품 수정</h4>
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">물품코드</label>
						<div class="col-sm-9">
							<input type="text" id="firstName"
								class="form-control" name="product_code" value="${product.product_code}" autofocus>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">물품명</label>
						<div class="col-sm-9">
							<input type="text" placeholder="" value="${product.product_name}" class="form-control"
								name="product_name">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">분류</label>
						<div class="col-sm-9">
							<input type="text" id="lastName" placeholder="" value="${product.product_category}"
								class="form-control" name="product_category" autofocus>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">수량</label>
						<div class="col-sm-9">
							<input type="text" placeholder="" class="form-control" value="${product.product_cnt}"
								name="product_cnt">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">etc</label>
						<div class="col-sm-9">
							<input type="text" placeholder="" class="form-control" value="${product.product_etc}"
								name="product_etc">
						</div>
					</div>

					<button type="submit" class="btn btn-primary ">수정</button> &nbsp;&nbsp;
				</form>
				<br/>
				<a href="adminProductDelete.do?product_code=${product.product_code}"><button class="btn btn-primary ">삭제</button></a>
				<!-- /form -->
			</div>
			<!-- ./container -->
		</div>
</body>
</html>