<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-checkbox/paper-checkbox.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-radio-group/paper-radio-group.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-radio-button/paper-radio-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-dropdown-menu/paper-dropdown-menu.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-menu/paper-menu.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-menu-button/paper-menu-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-icon-button/paper-icon-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-item/paper-item.html">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/Polymer/components/bower_components/webcomponentsjs/webcomponents.min.js"></script>


<script>
	$(function(){
		var tempStartTime = '';
		var tempEndTime = '';
		var x = [];
		$('#group1').hide();
		$('#group2').hide();
	
		
		$("#superclassRad1").click(function(){
			 $('#group3').hide();
			$('#group2').hide();
			$('#group1').show(); 
			$(".subclassChkTds").prop("checked", false);
			x= [];
			document.getElementById("superclass").value = $(this).val();
		});
		
		$("#superclassRad2").click(function(){
			 $('#group3').hide();
			$('#group1').hide();
			$('#group2').show(); 
			$(".subclassChkTds").prop("checked", false);
			x= [];
			document.getElementById("superclass").value = $(this).val();
		});
		
		$('.subclassChkTds').click(function(){
			var arr = $.map($(this), function(e,i) {
			    return e.value;
			});
			
			if($(this).prop('checked') == true){
				x.push(arr.join());
			}else{
				x.pop(arr.join());
			}
			
			document.getElementById("je").value = x;
			var tempt = '' + document.getElementById("je").value;
			tempt.replace(",", " ").trim();
			document.getElementById("je").value = tempt;
		});

		var sp = [];
		$('.specialtyChkTds').click(function(){
			var arr2 = $.map($(this), function(e, i){
				return e.value;	
			});
			if($(this).prop('checked') == true){
				sp.push(arr2.join());
			}else{
				sp.pop(arr2.join());
			}
			document.getElementById("spec").value = sp;
			var tempt2 = '' + document.getElementById("spec").value;
			tempt2.replace(","," ").trim();
			document.getElementById("spec").value = tempt2;
		});
		
		$('#maleStaffCB').click(function(){
			var z = $(this).prop('selectedItem');
			document.getElementById("maleStaffVal").value = $(z).attr('value');
		});
		
		$('#femaleStaffCB').click(function(){
			var z2 = $(this).prop('selectedItem');
			document.getElementById("femaleStaffVal").value = $(z2).attr('value');
		});
		
		$('#holidayDD').click(function(){
			var z3 = $(this).prop('selectedItem');
			document.getElementById("workingDaysVal").value = $(z3).attr('value');
		});
		
		$('#capacityDD').click(function(){
			var z4 = $(this).prop('selectedItem');
			document.getElementById("capacityVal").value = $(z4).attr('value');
		});
		
		$('#startHourDD').click(function(){
			var z5 = $(this).prop('selectedItem');
			document.getElementById("startHour").value = $(z5).attr('value');
			var t1 = document.getElementById("startHour").value;
			tempStartTime = t1 + ':' + document.getElementById("startMinute").value + ':00';
			document.getElementById("startTimeVal").value = tempStartTime;
		});
		
		$('#startMinuteDD').click(function(){
			var z6 = $(this).prop('selectedItem');
			document.getElementById("startMinute").value = $(z6).attr('value');
			var t2 = document.getElementById("startMinute").value;
			tempStartTime = document.getElementById("startHour").value + ":" + t2 + ":00";
			document.getElementById("startTimeVal").value = tempStartTime;
		});
		
		$('#endHourDD').click(function(){
			var z5 = $(this).prop('selectedItem');
			document.getElementById("endHour").value = $(z5).attr('value');
			var t1 = document.getElementById("endHour").value;
			tempStartTime = t1 + ':' + document.getElementById("endMinute").value + ':00';
			document.getElementById("endTimeVal").value = tempStartTime;
		});
		
		$('#endMinuteDD').click(function(){
			var z6 = $(this).prop('selectedItem');
			document.getElementById("endMinute").value = $(z6).attr('value');
			var t2 = document.getElementById("endMinute").value;
			tempStartTime = document.getElementById("endHour").value + ":" + t2 + ":00";
			document.getElementById("endTimeVal").value = tempStartTime;
		});
		
		
	}); 
	
	function submit(){
		$("#secondForm").submit();
	};
</script>

<style>
	.subclassChkTds, .specialtyChkTds{
		padding: 10px;
	}
	paper-menu {
          width: 120px;
    }

</style>
<title>사업자 회원가입 2</title>

</head>
<body>
	<s:include value="../Header.jsp"></s:include>
	<h1><b>사업분류 및 특징</b></h1>
	<h4>모두 필수 입력사항입니다</h4><br>
	<form action ="toEnterpriseRegistraionThirdPage" role="form" method="post" id="secondForm">
	<div class="container-fluid">
		<div class="form-group" align="left">
			<div class="row ">
				<div class="col-xs-6 col-sm-4 col-md-2 col-lg-2">
					<div class="panel panel-info">
						<div class="panel-heading"><h3><strong>업종</strong></h3></div>
						<div class="panel-body">
			  					<paper-radio-group selected="massage">
			  						<paper-radio-button value="마사지샵" id="superclassRad1" name="massage"><strong>마사지샵</strong></paper-radio-button>
			  						<paper-radio-button value="네일샵" id="superclassRad2" name="nail"><strong>네일샵</strong></paper-radio-button>
			  					</paper-radio-group>
			  					
			  					<input type="hidden" id="superclass" name="member.enterprise.etpSuperclass" />
						</div>
					</div>
				</div>

				<div class="col-xs-6 col-sm-8 col-md-10 col-lg-10">
					<div class="panel panel-info">
						<div class="panel-heading"><h3><b>종류</b><font size="3" color="orange">당 업소에서 제공하는 서비스를 선택해 주세요</font></h3></div>
						<div class="panel-body" id="group1" >
								<paper-checkbox value="타이마사지" id="subclassChk" class="subclassChkTds" label="타이마사지" role="checkbox" tabindex="0"><strong>타이마사지</strong></paper-checkbox>
								<paper-checkbox value="경락마사지" id="subclassChk" class="subclassChkTds" ><strong>경락마사지</strong></paper-checkbox>
								<paper-checkbox value="카이로프랙틱"id="subclassChk" class="subclassChkTds" ><strong>카이로프랙틱</strong> </paper-checkbox>
	
								<paper-checkbox value="발마사지" id="subclassChk" class="subclassChkTds" ><strong>발마사지</strong></paper-checkbox>
								<paper-checkbox value="바디마사지" id="subclassChk" class="subclassChkTds" ><strong>바디마사지</strong></paper-checkbox>
								<paper-checkbox value="페이스마사지" id="subclassChk" class="subclassChkTds" ><strong>페이스마사지</strong></paper-checkbox>
						
								<paper-checkbox value="아로마마사지" id="subclassChk" class="subclassChkTds" ><strong>아로마마사지</strong></paper-checkbox>
								<paper-checkbox value="슬리밍케어" id="subclassChk" class="subclassChkTds" ><strong>슬리밍케어</strong></paper-checkbox>
								<paper-checkbox value="웨딩관리" id="subclassChk" class="subclassChkTds"><strong>웨딩관리</strong></paper-checkbox>
						</div>
						<div class="panel-body" id="group2" >
								<paper-checkbox value="네일케어" id="subclassChk" class="subclassChkTds" ><strong>네일케어</strong></paper-checkbox>
								<paper-checkbox value="랩핑 / 연장" id="subclassChk" class="subclassChkTds" ><strong>랩핑 / 연장</strong></paper-checkbox>
								<paper-checkbox value="프리미엄젤" id="subclassChk" class="subclassChkTds" ><strong>프리미엄젤</strong></paper-checkbox>
						</div>
						<div class="panel-body" id="group3">
							<h4><i>왼쪽의 업종을 먼저 선택해 주세요</i></h4>
							
						</div>
						<input type="text" id="je" name="member.enterprise.etpSubclass" />
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<div class="panel panel-info">
						<div class="panel-heading"><h3><b>특징</b><font size="3" color="orange">종류 선택 가능합니다</font></h3></div>	
						<div class="panel-body">
							<paper-checkbox value="여성전용"  id="specialtyList" class="specialtyChkTds"><strong>여성전용</strong></paper-checkbox>
							<paper-checkbox value="남녀전용"  id="specialtyList" class="specialtyChkTds"><strong>남녀가능</strong></paper-checkbox>
							<paper-checkbox value="커플룸"  id="specialtyList" class="specialtyChkTds"><strong>커플룸</strong></paper-checkbox>
							<paper-checkbox value="주차가능"  id="specialtyList" class="specialtyChkTds"><strong>주차가능</strong></paper-checkbox>
							<paper-checkbox value="연중무휴"  id="specialtyList" class="specialtyChkTds"><strong>연중무휴</strong></paper-checkbox>
							<paper-checkbox value="심야영업" id="specialtyList" class="specialtyChkTds"><strong>심야영업</strong></paper-checkbox>
							<paper-checkbox value="24시간 운영"  id="specialtyList" class="specialtyChkTds"><strong>24시간 운영</strong></paper-checkbox>
							<paper-checkbox value="회원권 제도"  id="specialtyList" class="specialtyChkTds"><strong>회원권 제도</strong></paper-checkbox>
							<paper-checkbox value="샤워실"  id="specialtyList" class="specialtyChkTds"><strong>샤워실</strong></paper-checkbox>
							<paper-checkbox value="파우더룸"  id="specialtyList" class="specialtyChkTds"><strong>파우더룸</strong></paper-checkbox>
							
						</div> <!-- panel-body -->
					</div> <!-- panel panel-default -->
				</div>
				<input type="hidden" id="spec" name="member.enterprise.etpSpecialize"/>
			</div>
			
			<h3><b>선택사항</b></h3>
			
			<div class="row">
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
					<div class="panel panel-info">
						<div class="panel-heading"><h4><b>사업장 규모</b></h4></div>
						<div class="panel-body">
							<!-- <paper-menu-button>
								<paper-icon-button icon="menu" class="dropdown-trigger"></paper-icon-button> -->
							<paper-dropdown-menu label="남성 STAFF 수" id="maleStaffCB"> -->
								<paper-menu class="dropdown-content">
									<paper-item value="0">0</paper-item>
									<paper-item value="1">1</paper-item>
									<paper-item value="2">2</paper-item>
									<paper-item value="3">3</paper-item>
									<paper-item value="4">4</paper-item>
									<paper-item value="5">5</paper-item>
								</paper-menu>
							</paper-dropdown-menu>
							
							<input type="hidden" id="maleStaffVal" name="member.enterprise.etpMaleStaff"/>
							
							<paper-dropdown-menu label="여성 STAFF 수" id="femaleStaffCB">
							<paper-menu class="dropdown-content">
									<paper-item value="0">0</paper-item>
									<paper-item value="1">1</paper-item>
									<paper-item value="2">2</paper-item>
									<paper-item value="3">3</paper-item>
									<paper-item value="4">4</paper-item>
									<paper-item value="5">5</paper-item>
							</paper-menu>
							</paper-dropdown-menu>
							<input type="hidden" id="femaleStaffVal" name="member.enterprise.etpFemaleStaff"/>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
					<div class="panel panel-info">
						<div class="panel-heading"><h4><b>영업일</b></h4></div>
						<div class="panel-body">
							<paper-dropdown-menu label="정기 휴무일" id="holidayDD" >
								<paper-menu class="dropdown-content">
									<paper-item value="mon">월요일</paper-item>
									<paper-item value="tues">화요일</paper-item>
									<paper-item value="wed">수요일</paper-item>
									<paper-item value="thu">목요일</paper-item>
									<paper-item value="fri">금요일</paper-item>
									<paper-item value="sat">토요일</paper-item>
									<paper-item value="sun">일요일</paper-item>
								</paper-menu>
							</paper-dropdown-menu>
							
							<input type="hidden" id="workingDaysVal" name="member.enterprise.workingDays.temp">
							
							<paper-dropdown-menu label="시간당 수용 가능 고객" id="capacityDD">
								<paper-menu class="dropdown-content">
									<paper-item value="1">1</paper-item>
									<paper-item value="2">2</paper-item>
									<paper-item value="3">3</paper-item>
									<paper-item value="4">4</paper-item>
								</paper-menu>
							</paper-dropdown-menu>
							
							<input type="hidden" id="capacityVal" name="member.enterprise.etpCapacity">
							
							<br>
							
							<paper-dropdown-menu label="영업 시작 시간 : 시간" id="startHourDD">
								<paper-menu class="dropdown-content">
									<paper-item value="00">00</paper-item>
									<paper-item value="01">01</paper-item>
									<paper-item value="02">02</paper-item>
									<paper-item value="03">03</paper-item>
									<paper-item value="04">04</paper-item>
									<paper-item value="05">05</paper-item>
									<paper-item value="06">06</paper-item>
									<paper-item value="07">07</paper-item>
									<paper-item value="08">08</paper-item>
									<paper-item value="09">09</paper-item>
									<paper-item value="10">10</paper-item>
									<paper-item value="11">11</paper-item>
									<paper-item value="12">12</paper-item>
									<paper-item value="13">13</paper-item>
									<paper-item value="14">14</paper-item>
									<paper-item value="15">15</paper-item>
									<paper-item value="16">16</paper-item>
									<paper-item value="17">17</paper-item>
									<paper-item value="18">18</paper-item>
									<paper-item value="19">19</paper-item>
									<paper-item value="20">20</paper-item>
									<paper-item value="21">21</paper-item>
									<paper-item value="22">22</paper-item>
									<paper-item value="23">23</paper-item>
								</paper-menu>
							</paper-dropdown-menu>
							
							<input type="hidden" id="startHour"/>
							 
							<paper-dropdown-menu label="영업 시작 시간: 분" id="startMinuteDD">
								<paper-menu class="dropdown-content">
									<paper-item value="00">00</paper-item>
									<paper-item value="30">30</paper-item>
								</paper-menu>
							</paper-dropdown-menu>
							
							<input type="hidden" id="startMinute" />
							
							<input type="hidden" id="startTimeVal" name="member.enterprise.start"/>
						
							<br>
							
							<paper-dropdown-menu label="영업 종료 시간 : 시간" id="endHourDD">
								<paper-menu class="dropdown-content">
									<paper-item value="00">00</paper-item>
									<paper-item value="01">01</paper-item>
									<paper-item value="02">02</paper-item>
									<paper-item value="03">03</paper-item>
									<paper-item value="04">04</paper-item>
									<paper-item value="05">05</paper-item>
									<paper-item value="06">06</paper-item>
									<paper-item value="07">07</paper-item>
									<paper-item value="08">08</paper-item>
									<paper-item value="09">09</paper-item>
									<paper-item value="10">10</paper-item>
									<paper-item value="11">11</paper-item>
									<paper-item value="12">12</paper-item>
									<paper-item value="13">13</paper-item>
									<paper-item value="14">14</paper-item>
									<paper-item value="15">15</paper-item>
									<paper-item value="16">16</paper-item>
									<paper-item value="17">17</paper-item>
									<paper-item value="18">18</paper-item>
									<paper-item value="19">19</paper-item>
									<paper-item value="20">20</paper-item>
									<paper-item value="21">21</paper-item>
									<paper-item value="22">22</paper-item>
									<paper-item value="23">23</paper-item>
								</paper-menu>
							</paper-dropdown-menu>
							
							<input type="hidden" id="endHour" />
							
							<paper-dropdown-menu label="영업 종료 시간: 분" id="endMinuteDD">
								<paper-menu class="dropdown-content">
									<paper-item value="00">00</paper-item>
									<paper-item value="30">30</paper-item>
								</paper-menu>
							</paper-dropdown-menu>	
							
							<input type="hidden" id="endMinute" />
							
							<input type="text" id="endTimeVal" name="member.enterprise.end"/>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-4" align="left"><a href="toFirstRegistrationPage.action"><button type="button" class="btn btn-primary">이전</button></a></div>
			<div class="col-lg-4" align="center"><h3>2 / 3</h3></div>
			<div class="col-lg-4" align="right"><button type="button" class="btn btn-primary" onclick="return submit();">다음</button></div>
		</div>
	</div>
	
	<input type="hidden" name="">
	
	</form>
<br>
<br>
<br>
<br>
<br>

</body>
</html>