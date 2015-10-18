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


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/Polymer/components/bower_components/webcomponentsjs/webcomponents.min.js"></script>

<script>
	$(function(){
		$("#superclassRad1").click(function(){
			console.log($("#superclassGrp").attr("selected"));
			$('#group3').hide();
			$('#group2').hide();
			$('#group1').show();
		});
		$("#superclassRad2").click(function(){
			console.log($(this).attr("value"));
			$('#group3').hide();
			$('#group1').hide();
			$('#group2').show();
		});
		$('.subclassChkTds').click(function(){
			console.log($(this).attr('value'));
		});
	});
	
	$(function(){
		var x = '';
		$('.subclassChkTds').click(function(){
		var arr = $.map($(this), function(e,i) {
		    return e.value;
		});
		x.pus
		h(arr.join());
		console.log(x);
		});
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
						<div class="panel-heading"><h3><b>종류</b><font size="2" color="orange">당 업소에서 제공하는 서비스를 선택해 주세요</font></h3></div>
						<div class="panel-body" id="group1" hidden>
								<paper-checkbox name="etp.etpSubclass" value="타이마사지" id="subclassChk" class="subclassChkTds" checked><strong>타이마사지</strong></paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="경락마사지" id="subclassChk" class="subclassChkTds" toggles><strong>경락마사지</strong></paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="카이로프랙틱"id="subclassChk" class="subclassChkTds" toggles><strong>카이로프랙틱</strong> </paper-checkbox>
	
								<paper-checkbox name="etp.etpSubclass" value="발마사지" id="subclassChk" class="subclassChkTds" toggles><strong>발마사지</strong></paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="바디마사지" id="subclassChk" class="subclassChkTds" toggles><strong>바디마사지</strong></paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="페이스마사지" id="subclassChk" class="subclassChkTds" toggles><strong>페이스마사지</strong></paper-checkbox>
						
								<paper-checkbox name="etp.etpSubclass" value="아로마마사지" id="subclassChk" class="subclassChkTds" toggles><strong>아로마마사지</strong></paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="슬리밍케어" id="subclassChk" class="subclassChkTds" toggles><strong>슬리밍케어</strong></paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="웨딩관리" id="subclassChk" class="subclassChkTds" toggles><strong>웨딩관리</strong></paper-checkbox>
						</div>
						<div class="panel-body" id="group2" hidden>
								<paper-checkbox name="etp.etpSubclass" value="네일케어" id="subclassChk" class="subclassChkTds" toggles><strong>네일케어</strong></paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="랩핑 / 연장" id="subclassChk" class="subclassChkTds" toggles><strong>랩핑 / 연장</strong></paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="프리미엄젤" id="subclassChk" class="subclassChkTds" toggles><strong>프리미엄젤</strong></paper-checkbox>
						</div>
						<div class="panel-body" id="group3">
							<h4><i>왼쪽의 업종을 먼저 선택해 주세요</i></h4>
						</div>
					</div>
				</div>
			</div>
				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<div class="panel panel-info">
						<div class="panel-heading"><h3><b>특징</b>&nbsp;&nbsp;<font pont size="2" color="orange">종류 선택 가능합니다</font></h3></div>	
							<div class="panel-body">
								<paper-checkbox name="etp.etpSubclass" value="여성전용" name="member.enterprise.etpSpecialize" id="specialtyList1" class="specialtyChkTds">여성전용</paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="남녀전용" name="member.enterprise.etpSpecialize" id="specialtyList2" class="specialtyChkTds">남녀가능</paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="커플룸" name="member.enterprise.etpSpecialize" id="specialtyList3" class="specialtyChkTds">커플룸</paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="주차가능" name="member.enterprise.etpSpecialize" id="specialtyList4" class="specialtyChkTds">주차가능</paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="연중무휴" name="member.enterprise.etpSpecialize" id="specialtyList5" class="specialtyChkTds">연중무휴</paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="심야영업" name="member.enterprise.etpSpecialize" id="specialtyList6" class="specialtyChkTds">심야영업</paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="24시간 운영" name="member.enterprise.etpSpecialize" id="specialtyList7" class="specialtyChkTds">24시간 운영</paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="회원권 제도" name="member.enterprise.etpSpecialize" id="specialtyList8" class="specialtyChkTds">회원권 제도</paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="샤워실" name="member.enterprise.etpSpecialize" id="specialtyList9" class="specialtyChkTds">샤워실</paper-checkbox>
								<paper-checkbox name="etp.etpSubclass" value="파우더룸" name="member.enterprise.etpSpecialize" id="specialtyList10" class="specialtyChkTds">파우더룸</paper-checkbox>
							</div> <!-- panel-body -->
						</div> <!-- panel panel-default -->
					</div>	
				</div>
					<h3><b>선택사항</b></h3>
					<div class="col-lg-6">
					<table>
					<tr>
						<td><h4><b>사업장 규모</b></h4></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;남성 staff&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>
							<select class="form-control" id="maleStaffCount" name="etp.maleStaffCount">
								<option>0</option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</select></td>
					</tr>
					<tr>
						<td></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;여성 staff&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td><select class="form-control" id="femaleStaffCount" name="etp.femaleStaffCount">
							<option>0</option>
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select></td>
					</tr>
					</table>
					<br><br>
					<h4><b>영업일</b></h4>
						<label><input type="checkbox" value="">월</label>&nbsp;&nbsp;
						<label><input type="checkbox" value="">화</label>&nbsp;&nbsp;
						<label><input type="checkbox" value="">수</label>&nbsp;&nbsp;
						<label><input type="checkbox" value="">목</label>&nbsp;&nbsp;
						<label><input type="checkbox" value="">금</label>&nbsp;&nbsp;
						<label><input type="checkbox" value="">토</label>&nbsp;&nbsp;
						<label><input type="checkbox" value="">일</label>&nbsp;&nbsp;
					<br>
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
			
	<div class="container" align="center">
		<div class="row">
			<div class="col-lg-4" align="left"><button type="button" class="btn btn-primary">이전</button></div>
			<div class="col-lg-4" align="center"><h3>2 / 3</h3></div>
			<div class="col-lg-4" align="right"><button type="button" class="btn btn-primary">다음</button></div>
		</div>
	</div>
	</div>
	
	</form>
	
  <paper-checkbox checked="{{checked}}"></paper-checkbox>
  <br>
  <paper-checkbox id="box"></paper-checkbox>
  <br>
  <button on-tap="{{doIt}}">{{text}}</button>
</body>
</html>