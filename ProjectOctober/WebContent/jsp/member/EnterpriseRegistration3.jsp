<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>사업자 회원가입 3</title>
</head>
<body>
<s:include value="../Header.jsp"></s:include>
<center><h1><b>자동화 설정</b></h1>
<h4>선택 입력사항입니다</h4><br>
</center>
<div class="container">
	<h3><b>예약접수 마감 시간 설정</b></h3><br>
	<table>
	<tr>
		<td><input type="radio" id="modificationDeadline" name="etp.modificationDeadline">하루전</td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="modificationDeadline" name="etp.modificationDeadline">시간설정&nbsp;&nbsp;</td>
		<td><select class="form-control" id="modificationDeadline" name="etp.modificationDeadline">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
				<option>5</option>
			</select></td>
		<td>&nbsp;&nbsp;시간 전</td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="modificationDeadline" name="etp.modificationDeadline">언제든지가능</td>
	</tr>
	</table>
	<br><br><br>
	<h3><b>알림서비스</b></h3><br>
	<h4><b>사업자</b></h4>
	<input type="radio" id="ntfFrequencyToEtp" name="etp.ntfFrequencyToEtp">YES&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<label>
		&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="ntfFrequencyToEtp" name="etp.ntfFrequencyToEtp" value="option1">예약직후
	</label>
	<label>
		&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="ntfFrequencyToEtp" name="etp.ntfFrequencyToEtp" value="option2">한시간전
	</label>
	<label>
		&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="ntfFrequencyToEtp" name="etp.ntfFrequencyToEtp" value="option3">30분전
	</label>
	<br>
	<input type="radio" id="ntfFrequencyToEtp" name="etp.ntfFrequencyToEtp">NO
	<br><br>
	<h4><b>고객</b></h4>
	<input type="radio" id="ntfFrequencyToCst" name="etp.ntfFrequencyToCst">YES&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<label>
		&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="ntfFrequencyToCst" name="etp.ntfFrequencyToCst" value="option1">예약직후
	</label>
	<label>
		&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="ntfFrequencyToCst" name="etp.ntfFrequencyToCst" value="option2">한시간전
	</label>
	<label>
		&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="ntfFrequencyToCst" name="etp.ntfFrequencyToCst" value="option3">30분전
	</label>
	<br>
	<input type="radio" id="ntfFrequencyToCst" name="etp.ntfFrequencyToCst">NO
	<br><br><br><br>
	<div class="row">
		<div class="col-lg-4" align="left"><button type="button" class="btn btn-primary">이전</button></div>
		<div class="col-lg-4" align="center"><h3>3 / 3</h3></div>
		<div class="col-lg-4" align="right"><button type="button" class="btn btn-success">관리자에게 전송</button></div>
	</div>
</div>
</body>
</html>