<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.5/css/bootstrap-dialog.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.5/js/bootstrap-dialog.min.js"></script>

<style>
	#headbar{
		background-image: url("${pageContext.request.contextPath}/image/themes/preview3.jpg");
	}
</style>
<!-- LINK 랑 SCRIPT 임포트하지 말 것! -->
</head>
<body>
<nav class="navbar" id="headbar">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="${pageContext.request.contextPath}/toFirstPage.action">a.#</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<s:if test="#session.loginId != null">
					<s:if test="#session.memCode == 1">	<!-- 사업자 -->
						<li><a id="callNtfWindowEtp">알림<span class="badge" id="etpNtfBadge"><s:property value="ntfCount"/></span></a></li>
						<li><a href="${pageContext.request.contextPath}/enterprise/takeEtp.action">
							<span class="glyphicon glyphicon-home"></span> 내페이지</a></li>
						<li><a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action?etpNum=${session.loginEtpNum}">
							<span class="glyphicon glyphicon-calendar"></span> 예약관리</a></li>
						<li><a href="${pageContext.request.contextPath}/highchart1.action?etpEmail=${session.loginId}">
							<span class="glyphicon glyphicon-zoom-in"></span> 통계분석</a></li>
						<li><a href="${pageContext.request.contextPath}/enterprise/toMiscSettingPage.action">
							<span class="glyphicon glyphicon-cog"></span> 기타설정</a></li>
						<li><a href="${pageContext.request.contextPath}/enterprise/toEnterpriseMyPage.action">
							<span class="glyphicon glyphicon-user"></span> 나의정보</a></li>
					</s:if>
					<s:if test="#session.memCode == 2">	<!-- 개인고객 -->
						<li><a id="callNtfWindowCst">알림<span class="badge" id="cstNtfBadge"><s:property value="ntfCount"/></span></a></li>
						<li><a href="${pageContext.request.contextPath}/search/toBusinessSectorCategoryPage.action">
							<span class="glyphicon glyphicon-briefcase"></span>업종검색</a></li>
						<li><a href="${pageContext.request.contextPath}/search/toFeatureCategoryPage.action">
							<span class="glyphicon glyphicon-flag"></span>특징검색</a></li>
						<li><a href="${pageContext.request.contextPath}/search/toMoodCategoryPage.action">
							<span class="glyphicon glyphicon-heart"></span>기분상태검색</a></li>
						<li><a href="${pageContext.request.contextPath}/toMainPage.action">
							<span class="glyphicon glyphicon-globe"></span>지도검색</a></li>
						<form action="${pageContext.request.contextPath}/search/searchFreeKeyword.action" id="searchFreeKeywordForm" class="navbar-form navbar-right" role="form" method="get" accept-charset="utf-8" role="search">
							<input type="text" name="searchKeyword" class="form-control" placeholder="Search">
							<button type="submit" title="Search" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
						</form>
					</s:if>
					<s:if test="#session.memCode == 3">	<!-- 관리자...이거 3? 1?--> 
					</s:if>
				</s:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<s:if test="#session.loginId == null">
					<li><a data-toggle="modal" href="#myModal"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
					<div class="modal fade" id="myModal" role="dialog">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h3 class="modal-title">회원가입 선택</h3>
								</div>
								<br><br>
								<div class="modal-body" align="center">
									<div class="row">
										<div class="col-md-6">
											<a href="${pageContext.request.contextPath}/member/toEnterpriseRegistrationPage.action">
											<button type="button" class="btn-link"  role="button" style="vertical-align:center; color:#FF480B; " id="etpBT"><h1>사업자</h1></button></a>
											<br><br>								        	 	        	
										</div>
										<div class="col-md-6">
											<a href="${pageContext.request.contextPath}/member/toCustomerRegistrationPage.action">
											<button type="button" class="btn-link"  role="button" style="vertical-align:center; color:#0BC2FF;" id="cstBT"><h1>개인 고객</h1></button></a>
											<br><br>								        	
										</div>
									</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
								</div>
							</div>
						</div>
					</div>
					<li><a href="${pageContext.request.contextPath}/member/toLoginPage.action"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</s:if>
				<s:else>
					<li><a href="${pageContext.request.contextPath}/member/logoutProcess.action"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
				</s:else>
			</ul>		
		</div>
	</div>
</nav>
<script>
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	});
	
	
	if(<s:property value="#session.memCode"/> == 1){
		$(function(){
			var str = '';
			setInterval(function(){
				$.ajax({
					url: "${pageContext.request.contextPath}/enterprise/retrieveEnterpriseNotificationList.action",
					data: {"etpNum" : <s:property value="#session.loginEtpNum"/>},
					success: function(data){
						if(str.length != 0) str = '';
						$('#etpNtfBadge').html(data.ntfCount);
						str += '<div class="table table-responsive">'
						str += '<table class="table table-hover table-compact">';
						str += '<tr>';
						str += '<th>예약 번호</th>';
						str += '<th>알림 메시지</th>';
						str += '<th>고객 이메일</th>';
						str += '<th style="width: 130px;">알림 발생 일시</th>';
						str += '<th>확인</th>'
						str += '</tr>';
						
						$.each(data.notificationList, function(i,d){
							str += "<tr>";
							str += "<td>" + d.rsvNum + "</td>";
							str += "<td>"+ d.ntfMessage + "</td>";
							str += "<td>" + d.cstEmail + "</td>";
							str += "<td>" + d.ntfTime.year + '/' + d.ntfTime.monthValue + '/' + d.ntfTime.dayOfMonth + ' ' + d.ntfTime.hour +':' + d.ntfTime.minute + "</td>";
							str += "<td><input type='button' num='" + d.ntfNum + "' class='rdck btn btn-warning' value='OK'></td>";
							str += "</tr>";
						});
						
						str += '</table>';
						str += '</div>';
					},
					error: function(){
						console.log('failed');
					}
				});
			},3000);
			
			$('#callNtfWindowEtp').on('click', function(event){
				var email = '<s:property value="#session.loginId"/>';
				BootstrapDialog.show({
					title: email + '님의 예약 알림',
					message: str,
					size: BootstrapDialog.SIZE_WIDE,
					buttons: [{
						label: '전체 알림 내역 열기',
						cssClass: 'btn-success',
						action: function(){
							location.href = '${pageContext.request.contextPath}/enterprise/retrieveEnterpriseNotificationListAll.action';
						}
					}] 
				});				
			});
		});
		
		
		$(function(){
			$('.rdck').on('click',function(){
				alert('!');
				var n = $(this).attr('num');
				console.log(n);
				$.ajax({
					url: '${pageContext.request.contextPath}/enterprise/readEnterpriseNotification.action',
					data: {'ntfNum' : n},
					success: function(data){
						alert('읽기 완료되었습니다.');
					}
				});
			});
		});
	}
	
	else if(<s:property value="#session.memCode"/> == 2){
		$(function(){
			var str = '';
			setInterval(function(){
				$.ajax({
					url: "${pageContext.request.contextPath}/customer/retrieveCustomerNotificationList.action",
					data: {"cstEmail" : '<s:property value="#session.loginId"/>'},
					success: function(data){
						if(str.length != 0) str = '';
						console.log(data.ntfCount);
						$('#etpNtfBadge').html(data.ntfCount);
						str += '<div class="table table-responsive">'
						str += '<table class="table table-hover table-compact">';
						str += '<tr>';
						str += '<th>예약 번호</th>';
						str += '<th>알림 메시지</th>';
						str += '<th>사업자 이메일</th>';
						str += '<th style="width: 130px;">알림 발생 일시</th>';
						str += '<th>확인</th>'
						str += '</tr>';
						
						$.each(data.notificationList, function(i,d){
							str += "<tr>";
							str += "<td>" + d.rsvNum + "</td>";
							str += "<td>"+ d.ntfMessage + "</td>";
							str += "<td>" + d.etpEmail + "</td>";
							str += "<td>" + d.ntfTime.year + '/' + d.ntfTime.monthValue + '/' + d.ntfTime.dayOfMonth + ' ' + d.ntfTime.hour +':' + d.ntfTime.minute + "</td>";
							str += "<td><input type='button' num='" + d.ntfNum + "' class='rdck btn btn-warning' value='OK'></td>";
							str += "</tr>";
						});
						
						str += '</table>';
						str += '</div>';
					},
					error: function(){
						console.log('failed');
					}
				});
			},3000);
			
			$('#callNtfWindowCst').on('click', function(event){
				var email = '<s:property value="#session.loginId"/>';
				BootstrapDialog.show({
					title: email + '님의 예약 알림',
					message: str,
					size: BootstrapDialog.SIZE_WIDE,
					buttons: [{
						label: '전체 알림 내역 열기',
						cssClass: 'btn-success',
						action: function(){
							location.href = '${pageContext.request.contextPath}/customer/retrieveCustomerNotificationListAll.action';
						}
					}] 
				});				
			});
		});
	}
</script>

	
</body>		
</html>	