<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!doctype html>
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
						<li class="dropdown"><a href="login.do" class="dropdown-toggle"><span>Logout</span></a>
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
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<h3 class="page-title">회원리스트</h3>
					<!-- BORDERED TABLE -->
					<div class="panel">
						<form class="navbar-form navbar-left">
							<select class="select" data-mdb-filter="true">
								<option value="1">부서</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
								<option value="4">Four</option>
								<option value="5">Five</option>
								<option value="6">Six</option>
								<option value="7">Seven</option>
								<option value="8">Eight</option>
								<option value="9">Nine</option>
								<option value="10">Ten</option>
							</select> <select class="select" data-mdb-filter="true">
								<option value="1">물품명</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
								<option value="4">Four</option>
								<option value="5">Five</option>
								<option value="6">Six</option>
								<option value="7">Seven</option>
								<option value="8">Eight</option>
								<option value="9">Nine</option>
								<option value="10">Ten</option>
							</select>
							<div class="input-group">
								<input type="text" value="" class="form-control"
									placeholder="Search dashboard..."> <span
									class="input-group-btn"><button type="button"
										class="btn btn-primary">검색</button></span>
							</div>
						</form>
						
						<div class="panel-body">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th>회원번호</th>
										<th>회원이름</th>
										<th>부서</th>
										<th>역할</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${memberList}" var="member">
										<tr>
											<td><a
												href="adminMemberUpdate.do?member_id=${member.member_id}">${member.member_id}</a></td>
											<td>${member.member_name}</td>
											<td>${member.dept_no}</td>
											<td>${member.member_role}</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
					<!-- END BORDERED TABLE -->

				</div>
			</div>
			<!-- END MAIN CONTENT -->
		</div>
		<!-- END MAIN -->




		<div class="clearfix"></div>
		<footer>
			<div class="container-fluid">
				<p class="copyright">
					Shared by <i class="fa fa-love"></i><a
						href="https://bootstrapthemes.co">BootstrapThemes</a>
				</p>
			</div>
		</footer>
	</div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	<script src="./resources/vendor/jquery/jquery.min.js"></script>
	<script src="./resources/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="./resources/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="./resources/scripts/klorofil-common.js"></script>
</body>

</html>
