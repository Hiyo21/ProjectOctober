<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>사업자 회원가입 2</title>
</head>
<body>
<s:include value="../Header.jsp"></s:include>
<div align="center">
<h1><b>사업분류 및 특징</b></h1>
<h4>모두 필수 입력사항입니다</h4><br>
<form>
<div class="container">
	<div class="form-group" align="left">
		<div class="row">
			<div class="col-lg-6">
				<h3><b>업종</b></h3>
				<input type="radio" id="superclass" name="etp.superclass">마시지샵&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="radio" id="superclass" name="etp.superclass">네일샵
				<br><br>
				<h3><b>종류</b>&nbsp;&nbsp;<font pont size="2" color="orange">종류 선택 가능합니다</font></h3>
				<div class="row">
				<div class="col-lg-8">
				<div class="panel panel-default">
				<div class="panel-body">
					<table>
					<tr>
						<td><label><input type="checkbox" id="subclass" name="etp.subclass" value="타이마사지">타이마사지</label></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="subclass" name="etp.subclass" value="경락마사지">경락마사지</label></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="subclass" name="etp.subclass" value="카이로프랙틱">카이로프랙틱</label></td>
					</tr>
					<tr>
						<td><label><input type="checkbox" id="subclass" name="etp.subclass" value="발마사지">발마사지</label></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="subclass" name="etp.subclass" value="페이스마사지">페이스마사지</label></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="subclass" name="etp.subclass" value="바디마사지">바디마사지</label></td>
					</tr>
					<tr>
						<td><label><input type="checkbox" id="subclass" name="etp.subclass" value="아로마마사지">아로마마사지</label></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="subclass" name="etp.subclass" value="슬리밍케어">슬리밍케어</label></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="subclass" name="etp.subclass" value="웨딩관리">웨딩관리</label></td>
					</tr>
					</table>
				</div> <!-- panel-body -->
				</div> <!-- panel panel-default -->
				</div> <!-- col-lg-8 -->
				<div class="col-lg-4">
				<div class="panel panel-default">
				<div class="panel-body">
					<table>
					<tr>
						<td>&nbsp;&nbsp;<label><input type="checkbox" id="subclass" name="etp.subclass" value="네일케어">네일케어</label></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;<label><input type="checkbox" id="subclass" name="etp.subclass" value="랩핑/연장">랩핑/연장</label></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;<label><input type="checkbox" id="subclass" name="etp.subclass" value="프리미엄젤">프리미엄젤</label></td>
					</tr>
					</table>
				</div> <!-- panel-body -->
				</div> <!-- panel panel-default -->
				</div> <!-- col-lg-4 -->
				</div> <!-- row -->
				<br>
				<h3><b>특징</b>&nbsp;&nbsp;<font pont size="2" color="orange">종류 선택 가능합니다</font></h3>
				<div class="panel panel-default">
				<div class="panel-body">
				<table>
				<tr>
					<td><label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="여성전용">여성전용</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="남녀가능">남녀가능</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="커플룸">커플룸</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="주차가능">주차가능</label></td>
				</tr>
				<tr>
					<td><label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="연중무휴">연중무휴</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="심야영업">심야영업</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="24시간 운영">24시간 운영</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="회원권제도">회원권제도</label></td>
				</tr>
				<tr>
					<td><label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="샤워실">샤워실</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id="specialtyList" name="etp.specialtyList" value="파우더룸">파우더룸</label></td>
				</tr>
				</table>
				</div> <!-- panel-body -->
				</div> <!-- panel panel-default -->
			</div>
			<div class="col-lg-6">
				<h3><b>선택사항</b></h3>
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
</div>
<p>
<div class="container" align="center">
	<div class="row">
		<div class="col-lg-4" align="left"><button type="button" class="btn btn-primary">이전</button></div>
		<div class="col-lg-4" align="center"><h3>2 / 3</h3></div>
		<div class="col-lg-4" align="right"><button type="button" class="btn btn-primary">다음</button></div>
	</div>
</div>
</form></div>
</body>
</html>