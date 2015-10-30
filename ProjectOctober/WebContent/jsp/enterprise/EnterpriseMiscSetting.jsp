<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
	
	$(function(){
		$('#deadlineDD').prop('disabled', true);
		$('.selfNtfGroup').prop('disabled', true);
		$('.cstNtfGroup').prop('disabled', true);
		
		$('#deadlineRB1').click(function(){
			$('#deadlineDD').prop('disabled',true);
			$("#deadlineDD").val("-1");
			console.log($(this).val());
			document.getElementById("deadlineHidden").value = $(this).val();
		});
		
		$('#deadlineRB2').click(function(){
			$('#deadlineDD').prop('disabled',false);
		});
		
		$('#deadlineDD').click(function(){
			console.log($(this).val());
			document.getElementById("deadlineHidden").value = $(this).val();
		});
		
		$('#deadlineRB3').click(function(){
			$('#deadlineDD').prop('disabled',true);
			$("#deadlineDD").val("-1");
			console.log($(this).val());
			document.getElementById("deadlineHidden").value = $(this).val();
		});
		
		$('#etpSelfNotification1').click(function(){
			$('.selfNtfGroup').prop('disabled', false);
			console.log($(this).attr('value'));
		});
		
		$('#etpSelfNotification5').click(function(){
			$('.selfNtfGroup').prop('disabled', true).prop('checked', false);
			console.log($(this).attr('value'));
			document.getElementById("etpSelfNotificationHidden").value = $(this).attr('value');
		});
		
		$('#etpCstNotification1').click(function(){
			$('.cstNtfGroup').prop('disabled', false);
			console.log($(this).val());
		});
		
		$('#etpCstNotification5').click(function(){
			$('.cstNtfGroup').prop('disabled', true).prop('checked', false);
			console.log($(this).val());
			document.getElementById("etpCstNotificationHidden").value = $(this).attr('value');
		});
	});
	
	$(function(){
		
		$('.selfNtfGroup').click(function(){
			var x = 0;
			var values = $("input[name='etpSelfNotifications[]']:checked").map(function(index,domElement) {
			    return $(domElement).val();
			});
			$(values).each(function(index, item){
				x += parseInt(item);
			});
			document.getElementById("etpSelfNotificationHidden").value = x;
		});
	});
	
	$(function(){
		
		$('.cstNtfGroup').click(function(){
			var x = 0;
			var values = $("input[name='etpCstNotifications[]']:checked").map(function(index,domElement) {
			    return $(domElement).val();
			});
			$(values).each(function(index, item){
				x += parseInt(item);
			});
			document.getElementById("etpCstNotificationHidden").value = x;
		});	
	});
	
	/* 위에 두개
	1 	- 예약 직후,
	2 - 한 시간 전,
	3 - 예약 직후 + 한 시간 전,
	4 - 30분 전,
	5 - 예약 직후 + 30분 전
	6 - 한 시간 전, 30분 전
	7 - 예약 직후 + 한 시간 전 + 30분 전
	8 - 알림 없음
	*/
	
	//여기서 제약조건 체크
	function updateEnterprise(){
		$("#updateEtpForm").submit();
	}

</script>
<title>사업자 자동화 설정</title>
</head>
<body>
<s:include value="../Header.jsp"></s:include>


<div class="container-fluid">
	<h1><b>자동화 설정</b></h1>
	<form role="form" action="updateEnterprise" id="updateEtpForm" method="post">
		<div class="row">
		    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
	    		<h3><b>예약접수 마감 시간 설정</b></h3>
    			<div class="form-group">
    				<label><input type="radio" id="deadlineRB1" name="deadlineRB" value="24" style="margin: 10px;">하루 전</label>
    				<label><input type="radio" id="deadlineRB3" name="deadlineRB" value="-1" style="margin: 10px;">언제든지 가능</label>
					<label><input type="radio" id="deadlineRB2" name="deadlineRB" style="margin: 10px;">시간 설정</label>
					<select class="form-control" id="deadlineDD" name="deadlineDD" style="width: 80%;" >
						<option selected="selected" disabled="disabled" value="-1" tabindex="-1">선택하세요.</option>
						<option value="1" tabindex="0">1 시간 전</option>
						<option value="2" tabindex="1">2 시간 전</option>
						<option value="3" tabindex="2">3 시간 전</option>
						<option value="4" tabindex="3">4 시간 전</option>
						<option value="5" tabindex="4">5 시간 전</option>
						<option value="6" tabindex="5">6 시간 전</option>
						<option value="7" tabindex="6">7 시간 전</option>
						<option value="8" tabindex="7">8 시간 전</option>
						<option value="9" tabindex="8">9 시간 전</option>
						<option value="10" tabindex="9">10 시간 전</option>
						<option value="11" tabindex="10">11 시간 전</option>
						<option value="12" tabindex="11">12 시간 전</option>
					</select>
				</div>
				<input type="hidden" id="deadlineHidden" name="member.enterprise.etpRsvDeadline"/>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
				<h3><b>알림서비스</b></h3>
				<h4><i>사업자</i></h4>
				<div class="form-group">
				<!-- 이건 JQuery에서 보내야할 듯. -->
					<label><input type="radio" id="etpSelfNotification1"  name="etpSelfNotificationRad" style="margin: 10px;" >YES</label>
					<label><input type="checkbox" id="etpSelfNotification2" name="etpSelfNotifications[]" value="1" class="selfNtfGroup" style="margin: 10px;">예약 직후</label>
					<label><input type="checkbox" id="etpSelfNotification3" name="etpSelfNotifications[]" value="2" class="selfNtfGroup" style="margin: 10px;">한 시간 전</label>
					<label><input type="checkbox" id="etpSelfNotification4" name="etpSelfNotifications[]" value="4" class="selfNtfGroup" style="margin: 10px;">30분 전</label>
					<label><input type="radio" id="etpSelfNotification5" name= "etpSelfNotificationRad" style="margin: 10px 10px 10px 50px;" value=8>NO</label>
				</div>
				<input type="hidden" id="etpSelfNotificationHidden" name="member.enterprise.etpSelfNotification" />
			</div>	
		</div>
		<div class="row">
			<div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
				<h4><b>고객</b></h4>
				<div class="form-group">
					<label><input type="radio" id="etpCstNotification1" name="etpCstNotificationRad" style="margin: 10px;">YES</label>
					<label><input type="checkbox" id="etpCstNotification2" name="etpCstNotification[]" value="1" class="cstNtfGroup" style="margin: 10px;">예약 직후</label>
					<label><input type="checkbox" id="etpCstNotification3" name="etpCstNotification[]" value="2" class="cstNtfGroup" style="margin: 10px;">한 시간 전</label>
					<label><input type="checkbox" id="etpCstNotification4" name="etpCstNotification[]" value="4" class="cstNtfGroup" style="margin: 10px;">30분 전</label>
					<label><input type="radio" id="etpCstNotification5" name="etpCstNotificationRad" style="margin: 10px 10px 10px 50px;" value="8">NO</label>
				</div>
				<input type="hidden" id="etpCstNotificationHidden" name="member.enterprise.etpCstNotification" />
			</div>
		</div>
		<input type="hidden" id="etpNumHidden2" name="member.enterprise.etpNum" value="${member.enterprise.etpNum}"/>
		<input type="hidden" id="etpNumHidden4" name="member.enterprise.etpEmail" value="${member.enterprise.etpEmail}"/>
		</form>
	</div>
	 
	<div class="row">
		<div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<div class="col-xs-4" align="center"><button type="button" class="btn btn-warning" onclick="return updateEnterprise();">수정</button></div>
		</div>
	</div>
	

</body>
</html>