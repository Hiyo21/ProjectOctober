<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-checkbox/paper-checkbox.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/iron-form/iron-form.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-radio-group/paper-radio-group.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-radio-button/paper-radio-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-dropdown-menu/paper-dropdown-menu.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-menu/paper-menu.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-menu-button/paper-menu-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-item/paper-item.html">


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/Polymer/components/bower_components/webcomponentsjs/webcomponents.min.js"></script>

<script>
	$(function(){
		var x = [];
		var sp = [];
		
		$("#superclassRad1").click(function(){
			console.log($(this).attr("value"));
			$('#group3').hide();
			$('#group2').hide();
			$('#group1').show();
			$(".subclassChkTds").prop("checked", false);
			x= [];
		});
		
		$("#superclassRad2").click(function(){
			console.log($(this).attr("value"));
			$('#group3').hide();
			$('#group1').hide();
			$('#group2').show();
			$(".subclassChkTds").prop("checked", false);
			x= [];
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
			$('#je').html(x+',');
		});
		
		$('.specialtyChkTds').click(function(){
			var arr2 = $.map($(this), function(e, i){
				return e.value;	
			});
			if($(this).prop('checked') == true){
				sp.push(arr2.join());
			}else{
				sp.pop(arr2.join());
			}
			$('#spec').html(x+',');
		});
		
		$('#maleStaffCB').click(function(){
			var z = $(this).prop('selectedItem');
			$('#maleStaffVal').html(z);
		})
		
		$('#femaleStaffCB').click(function(){
			var z2 = $(this).prop('selectedItem');
			$('#femaleStaffVal').html(z2);
		})
	});

</script>

<style>
	.subclassChkTds, .specialtyChkTds{
		padding: 10px;
	}
</style>
<title>사업자 회원가입 2</title>

</head>
<body unresolved>
	<s:include value="../Header.jsp"></s:include>
	<h1><b>사업분류 및 특징</b></h1>
	<h4>모두 필수 입력사항입니다</h4><br>
	<form action ="toEnterpriseRegistraionThirdPage" role="form" is="iron-form" method="post">
	<div class="container-fluid">
		<div class="form-group" align="left">
			<div class="row ">
				<div class="col-xs-6 col-sm-4 col-md-2 col-lg-2">
					<div class="panel panel-info">
						<div class="panel-heading"><h3><strong>업종</strong></h3></div>
						<div class="panel-body">
			  					<paper-radio-group selected="네일샵" id="superclassGrp" selected="{{selection}}">
			  						<paper-radio-button value="마사지샵" name="1" id="superclassRad1"><strong>마사지샵</strong></paper-radio-button>
			  						<paper-radio-button value="네일샵" name="2" id="superclassRad2" ><strong>네일샵</strong></paper-radio-button>
			  					</paper-radio-group>
						</div>
					</div>
				</div>

				<div class="col-xs-6 col-sm-8 col-md-10 col-lg-10">
					<div class="panel panel-info">
						<div class="panel-heading"><h3><b>종류</b><font size="3" color="orange">당 업소에서 제공하는 서비스를 선택해 주세요</font></h3></div>
						<div class="panel-body" id="group1" hidden>
								<paper-checkbox name="thai" value="타이마사지" id="subclassChk1" class="subclassChkTds" label="타이마사지" role="checkbox" tabindex="0"><strong>타이마사지</strong></paper-checkbox>
								<paper-checkbox name="acupunctural" value="경락마사지" id="subclassChk2" class="subclassChkTds" ><strong>경락마사지</strong></paper-checkbox>
								<paper-checkbox name="chiropractic" value="카이로프랙틱"id="subclassChk3" class="subclassChkTds" ><strong>카이로프랙틱</strong> </paper-checkbox>
	
								<paper-checkbox name="foot" value="발마사지" id="subclassChk4" class="subclassChkTds" ><strong>발마사지</strong></paper-checkbox>
								<paper-checkbox name="body" value="바디마사지" id="subclassChk5" class="subclassChkTds" ><strong>바디마사지</strong></paper-checkbox>
								<paper-checkbox name="face" value="페이스마사지" id="subclassChk6" class="subclassChkTds" ><strong>페이스마사지</strong></paper-checkbox>
						
								<paper-checkbox name="aroma" value="아로마마사지" id="subclassChk7" class="subclassChkTds" ><strong>아로마마사지</strong></paper-checkbox>
								<paper-checkbox name="sleeping" value="슬리밍케어" id="subclassChk8" class="subclassChkTds" ><strong>슬리밍케어</strong></paper-checkbox>
								<paper-checkbox name="wedding" value="웨딩관리" id="subclassChk9" class="subclassChkTds"><strong>웨딩관리</strong></paper-checkbox>
						</div>
						<div class="panel-body" id="group2" hidden>
								<paper-checkbox name="nailcare" value="네일케어" id="subclassChk10" class="subclassChkTds" ><strong>네일케어</strong></paper-checkbox>
								<paper-checkbox name="wrap" value="랩핑 / 연장" id="subclassChk11" class="subclassChkTds" ><strong>랩핑 / 연장</strong></paper-checkbox>
								<paper-checkbox name="premiumgel" value="프리미엄젤" id="subclassChk12" class="subclassChkTds" ><strong>프리미엄젤</strong></paper-checkbox>
						</div>
						<div class="panel-body" id="group3">
							<h4><i>왼쪽의 업종을 먼저 선택해 주세요</i></h4>
							<input type="hidden" id="je" name="member.enterprise.etpSubclass"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<div class="panel panel-info">
						<div class="panel-heading"><h3><b>특징</b><font size="3" color="orange">종류 선택 가능합니다</font></h3></div>	
						<div class="panel-body">
							<paper-checkbox value="여성전용" name="femaleOnly" id="specialtyList1" class="specialtyChkTds"><strong>여성전용</strong></paper-checkbox>
							<paper-checkbox value="남녀전용" name="bothGenders" id="specialtyList2" class="specialtyChkTds"><strong>남녀가능</strong></paper-checkbox>
							<paper-checkbox value="커플룸" name="coupleRoom" id="specialtyList3" class="specialtyChkTds"><strong>커플룸</strong></paper-checkbox>
							<paper-checkbox value="주차가능" name="parkingLot" id="specialtyList4" class="specialtyChkTds"><strong>주차가능</strong></paper-checkbox>
							<paper-checkbox value="연중무휴" name="noHol" id="specialtyList5" class="specialtyChkTds"><strong>연중무휴</strong></paper-checkbox>
							<paper-checkbox value="심야영업" name="overnight" id="specialtyList6" class="specialtyChkTds"><strong>심야영업</strong></paper-checkbox>
							<paper-checkbox value="24시간 운영" name="twentyFourSeven" id="specialtyList7" class="specialtyChkTds"><strong>24시간 운영</strong></paper-checkbox>
							<paper-checkbox value="회원권 제도" name="membership" id="specialtyList8" class="specialtyChkTds"><strong>회원권 제도</strong></paper-checkbox>
							<paper-checkbox value="샤워실" name="showerRoom" id="specialtyList9" class="specialtyChkTds"><strong>샤워실</strong></paper-checkbox>
							<paper-checkbox value="파우더룸" name="powderRoom" id="specialtyList10" class="specialtyChkTds"><strong>파우더룸</strong></paper-checkbox>
							<input type="hidden" id="spec" name="member.enterprise.etpSpecialize"/>
						</div> <!-- panel-body -->
					</div> <!-- panel panel-default -->
				</div>	
			</div>
			
			<h3><b>선택사항</b></h3>
			
			<div class="row">
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
					<div class="panel panel-info">
						<div class="panel-heading"><h4><b>사업장 규모</b></h4></div>
						<div class="panel-body">
							<paper-dropdown-menu label="남성 STAFF 수" id="maleStaffCB">
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
			
			<div class="row">
				<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
					<div class="panel panel-info">
						<div class="panel-heading"><h4><b>영업일</b></h4></div>
						<div class="panel-body">
							<paper-dropdown-menu label="선택해 주세요.">
								<paper-menu class="dropdown-content">
									<paper-item value="월">월요일</paper-item>
									<paper-item value="화">화요일</paper-item>
									<paper-item value="수">수요일</paper-item>
									<paper-item value="목">목요일</paper-item>
									<paper-item value="금">금요일</paper-item>
									<paper-item value="토">토요일</paper-item>
									<paper-item value="일">일요일</paper-item>
								</paper-menu>
							</paper-dropdown-menu>
					<table>
					<tr>
						<td>시간당 수용 가능 고객&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td><select class="form-control" id="hourlyCapacity" name="etp.hourlyCapacity">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select></td>
					</tr>
					<tr>
						<td>영업 시작 시간</td>
						<td><select class="form-control" id="startHour" name="etp.startHour">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select></td><td>&nbsp;&nbsp;시&nbsp;&nbsp;&nbsp;&nbsp;<td><select class="form-control" id="startHour" name="etp.startHour">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select><td>&nbsp;&nbsp;분&nbsp;&nbsp;&nbsp;&nbsp;</td>
					</tr>
					<tr>
						<td>영업 종료 시간</td>
						<td><select class="form-control" id="endHour" name="etp.endHour">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select></td><td>&nbsp;&nbsp;시&nbsp;&nbsp;&nbsp;&nbsp;<td><select class="form-control" id="endHour" name="etp.endHour">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select><td>&nbsp;&nbsp;분&nbsp;&nbsp;&nbsp;&nbsp;</td>
					</tr>
					</table>
				</div>
			</div>
		</div>
		</div>
		</div>
		</div>

	<div class="container" align="center">
		<div class="row">
			<div class="col-lg-4" align="left"><button type="button" class="btn btn-primary">이전</button></div>
			<div class="col-lg-4" align="center"><h3>2 / 3</h3></div>
			<div class="col-lg-4" align="right"><button type="button" class="btn btn-primary">다음</button></div>
		</div>
	</div>
</div>
	
	</form>
</body>
</html>