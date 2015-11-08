<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript">
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	});
	$(function(){
		$('[data-toggle="tooltip"]').tooltip(); 
	});
	
	$(document).ready(function(){
	    $('[data-toggle="tooltip"]').tooltip();   
	});
	

	function insertCoupon() {
		var insertTitle = document.getElementById("insertTitle");
		var insertRate = document.getElementById("insertRate");
		var insertStartYear = document.getElementById("insertStartYear");
		var insertStartMonth = document.getElementById("insertStartMonth");
		var insertStartDay = document.getElementById("insertStartDay");
		var insertEndYear = document.getElementById("insertEndYear");
		var insertEndMonth = document.getElementById("insertEndMonth");
		var insertEndDay = document.getElementById("insertEndDay");
		location.href="${pageContext.request.contextPath}/enterprise/insertCoupon.action?title=" + insertTitle.value + "&rate=" + insertRate.value + "&startYear=" + insertStartYear.value + "&startMonth=" + insertStartMonth.value + "&startDay=" + insertStartDay.value + "&endYear=" + insertEndYear.value + "&endMonth=" + insertEndMonth.value + "&endDay=" + insertEndDay.value;
	}
	
	function updateCoupon() {
		var editCpnNum = document.getElementById("couponRadio").value;
		var editTitle = document.getElementById("editTitle").value;
		var editRate = document.getElementById("editRate").value;
		var editStartYear = document.getElementById("editStartYear").value;
		var editStartMonth = document.getElementById("editStartMonth").value;
		var editStartDay = document.getElementById("editStartDay").value;
		var editEndYear = document.getElementById("editEndYear").value;
		var editEndMonth = document.getElementById("editEndMonth").value;
		var editEndDay = document.getElementById("editEndDay").value;
		location.href="${pageContext.request.contextPath}/enterprise/updateCoupon.action?cpnNum=" + editCpnNum + "&title=" + editTitle + "&rate=" + editRate + "&startYear=" + editStartYear + "&startMonth=" + editStartMonth + "&startDay=" + editStartDay + "&endYear=" + editEndYear + "&endMonth=" + editEndMonth + "&endDay=" + editEndDay;
	}
	
	function deleteCoupon() {
		var deleteCpnNum = document.getElementById("couponRadio").value;
		location.href="${pageContext.request.contextPath}/enterprise/deleteCoupon.action?cpnNum=" + deleteCpnNum;
	}
</script>
</head>

<body>
	<s:include value="../Header.jsp"></s:include>

	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<p></p>
					<h2>할인 쿠폰 내역</h2>
					<table class="table table-hover">
						<thead>
						<tr>
							<td>쿠폰번호</td>
							<td>쿠폰이름</td>
							<td>할인율</td>
							<td>유효기간</td>
							<td>선택</td>
						</tr>
						</thead>
						<tbody align="center">
							<p>유효기간 내 할인 쿠폰 only</p>
							<br>
							<s:iterator value="couponList">
								<tr>
									<td><s:property value="cpnNum" /></td>
									<td><s:property value="cpnTitle" /></td>
									<td><s:property value="cpnRate" />%</td>
									<td><s:property value="cpnEndDate" /></td>
									<td><input type="radio" id="couponRadio" name="coupon.cpnNum" value='<s:property value="cpnNum"/>'></td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
					<div class="container">
						<!-- 쿠폰등록 -->
						<br>
						<a width="150" height="150" class="btn btn-info btn-lg"
							data-toggle="modal" data-target="#myModal1">쿠폰 등록</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<div class="modal fade" id="myModal1" role="dialog">
							<div class="modal-dialog">
								<!-- Modal content-->
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">&times;</button>
										<h4 class="modal-title">쿠폰 등록</h4>
									</div>
									<div class="modal-body">
										타이틀 <input type="text" name="coupon.cpnTitle" id="insertTitle">&nbsp;&nbsp;&nbsp;
										할인율 <select name="coupon.cpnRate" id="insertRate">
													<option value="">%</option>
													<option value="10">10%</option>
													<option value="15">15%</option>
													<option value="20">20%</option>
													<option value="25">25%</option>
												</select><br><br>
										기간 <select name="coupon.insertStartYear" id="insertStartYear">
												<option value="2015">2015년</option>
											</select>&nbsp;&nbsp;&nbsp;
											<select name="coupon.insertStartMonth" id="insertStartMonth">
												<option value="01">1월</option>
												<option value="02">2월</option>
												<option value="03">3월</option>
												<option value="04">4월</option>
												<option value="05">5월</option>
												<option value="06">6월</option>
												<option value="07">7월</option>
												<option value="08">8월</option>
												<option value="09">9월</option>
												<option value="10">10월</option>
												<option value="11">11월</option>
												<option value="12">12월</option>
											</select>
											<select name="insertStartDay" id="insertStartDay">
												<option value="01">01일</option>
												<option value="02">02일</option>
												<option value="03">03일</option>
												<option value="04">04일</option>
												<option value="05">05일</option>
												<option value="06">06일</option>
												<option value="07">07일</option>
												<option value="08">08일</option>
												<option value="09">09일</option>
												<option value="10">10일</option>
												<option value="11">11일</option>
												<option value="12">12일</option>
												<option value="13">13일</option>
												<option value="14">14일</option>
												<option value="15">15일</option>
												<option value="16">16일</option>
												<option value="17">17일</option>
												<option value="18">18일</option>
												<option value="19">19일</option>
												<option value="20">20일</option>
												<option value="21">21일</option>
												<option value="22">22일</option>
												<option value="23">23일</option>
												<option value="24">24일</option>
												<option value="25">25일</option>
												<option value="26">26일</option>
												<option value="27">27일</option>
												<option value="28">28일</option>
												<option value="29">29일</option>
												<option value="30">30일</option>
												<option value="31">31일</option>
										</select> 일 부터<br><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<select name="coupon.insertEndYear" id="insertEndYear">
											<option value="2015">2015년</option>
										</select>&nbsp;&nbsp;&nbsp;
										<select name="coupon.insertEndMonth" id="insertEndMonth">
											<option value="01">1월</option>
											<option value="02">2월</option>
											<option value="03">3월</option>
											<option value="04">4월</option>
											<option value="05">5월</option>
											<option value="06">6월</option>
											<option value="07">7월</option>
											<option value="08">8월</option>
											<option value="09">9월</option>
											<option value="10">10월</option>
											<option value="11">11월</option>
											<option value="12">12월</option>
										</select>
										<select name="coupon.insertEndDay" id="insertEndDay">
											<option value="01">01일</option>
											<option value="02">02일</option>
											<option value="03">03일</option>
											<option value="04">04일</option>
											<option value="05">05일</option>
											<option value="06">06일</option>
											<option value="07">07일</option>
											<option value="08">08일</option>
											<option value="09">09일</option>
											<option value="10">10일</option>
											<option value="11">11일</option>
											<option value="12">12일</option>
											<option value="13">13일</option>
											<option value="14">14일</option>
											<option value="15">15일</option>
											<option value="16">16일</option>
											<option value="17">17일</option>
											<option value="18">18일</option>
											<option value="19">19일</option>
											<option value="20">20일</option>
											<option value="21">21일</option>
											<option value="22">22일</option>
											<option value="23">23일</option>
											<option value="24">24일</option>
											<option value="25">25일</option>
											<option value="26">26일</option>
											<option value="27">27일</option>
											<option value="28">28일</option>
											<option value="29">29일</option>
											<option value="30">30일</option>
											<option value="31">31일</option>
										</select>일 까지
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default" onclick="javascript:insertCoupon()">전송</button>
										<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
									</div>
								</div>

							</div>
						</div>

						<!-- 쿠폰 수정 -->
						<a class="btn btn-info btn-lg" data-toggle="modal"
							data-target="#myModal2" width="150" height="150" href="#"
							data-placement="bottom" title="쿠폰 수정 시에는 할인 쿠폰 선택이 중복되어서는 안됩니다">쿠폰
							수정</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<div class="modal fade" id="myModal2" role="dialog">
							<div class="modal-dialog">

								<!-- Modal content-->
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">&times;</button>
										<h4 class="modal-title">쿠폰 수정</h4>
									</div>
									<div class="modal-body">
										타이틀 <input type="text" name="coupon.cpnTitle" id="editTitle">&nbsp;&nbsp;&nbsp;
										할인율 <select name="coupon.cpnRate" id="editRate">
											<option value="">%</option>
											<option value="10">10%</option>
											<option value="15">15%</option>
											<option value="20">20%</option>
											<option value="25">25%</option>
										</select><br>
										<br> 기간 <select name="editStartYear" id="editStartYear">
											<option value="2015">2015년</option>
										</select>&nbsp;&nbsp;&nbsp; <select id="editStartMonth" name="editStartMonth">
											<option value="1">1월</option>
											<option value="2">2월</option>
											<option value="3">3월</option>
											<option value="4">4월</option>
											<option value="5">5월</option>
											<option value="6">6월</option>
											<option value="7">7월</option>
											<option value="8">8월</option>
											<option value="9">9월</option>
											<option value="10">10월</option>
											<option value="11">11월</option>
											<option value="12">12월</option>
										</select> <select name="editStartDay" id="editStartDay">
											<option value="01">01일</option>
											<option value="02">02일</option>
											<option value="03">03일</option>
											<option value="04">04일</option>
											<option value="05">05일</option>
											<option value="06">06일</option>
											<option value="07">07일</option>
											<option value="08">08일</option>
											<option value="09">09일</option>
											<option value="10">10일</option>
											<option value="11">11일</option>
											<option value="12">12일</option>
											<option value="13">13일</option>
											<option value="14">14일</option>
											<option value="15">15일</option>
											<option value="16">16일</option>
											<option value="17">17일</option>
											<option value="18">18일</option>
											<option value="19">19일</option>
											<option value="20">20일</option>
											<option value="21">21일</option>
											<option value="22">22일</option>
											<option value="23">23일</option>
											<option value="24">24일</option>
											<option value="25">25일</option>
											<option value="26">26일</option>
											<option value="27">27일</option>
											<option value="28">28일</option>
											<option value="29">29일</option>
											<option value="30">30일</option>
											<option value="31">31일</option>
										</select> 일 부터<br>
										<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="editEndYear" id="editEndYear">
											<option value="2015">2015년</option>
										</select>&nbsp;&nbsp;&nbsp; <select name="editEndMonth" id="editEndMonth">
											<option value="01">1월</option>
											<option value="02">2월</option>
											<option value="03">3월</option>
											<option value="04">4월</option>
											<option value="05">5월</option>
											<option value="06">6월</option>
											<option value="07">7월</option>
											<option value="08">8월</option>
											<option value="09">9월</option>
											<option value="10">10월</option>
											<option value="11">11월</option>
											<option value="12">12월</option>
										</select> <select name="editEndDay" id="editEndDay">
											<option value="01">01일</option>
											<option value="02">02일</option>
											<option value="03">03일</option>
											<option value="04">04일</option>
											<option value="05">05일</option>
											<option value="06">06일</option>
											<option value="07">07일</option>
											<option value="08">08일</option>
											<option value="09">09일</option>
											<option value="10">10일</option>
											<option value="11">11일</option>
											<option value="12">12일</option>
											<option value="13">13일</option>
											<option value="14">14일</option>
											<option value="15">15일</option>
											<option value="16">16일</option>
											<option value="17">17일</option>
											<option value="18">18일</option>
											<option value="19">19일</option>
											<option value="20">20일</option>
											<option value="21">21일</option>
											<option value="22">22일</option>
											<option value="23">23일</option>
											<option value="24">24일</option>
											<option value="25">25일</option>
											<option value="26">26일</option>
											<option value="27">27일</option>
											<option value="28">28일</option>
											<option value="29">29일</option>
											<option value="30">30일</option>
											<option value="31">31일</option>
										</select>일 까지
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default" onclick="javascript:updateCoupon()">전송</button>
										<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
									</div>
								</div>

							</div>
						</div>

						<!-- 쿠폰 삭제 -->
						<a class="btn btn-info btn-lg" data-toggle="modal"
							data-target="#myModal3" title="쿠폰 삭제 시에는 할인 쿠폰 선택이 중복 허용">쿠폰
							삭제</a>
						<div class="modal fade" id="myModal3" role="dialog">
							<div class="modal-dialog">

								<!-- Modal content-->
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">&times;</button>
										<h4 class="modal-title">쿠폰 삭제</h4>
									</div>
									<div class="modal-body">
										정말로 삭제하시겠습니까?<br>
										<br>
										<br>
										<br>
										<button type="button" class="btn btn-default" onclick="javascript:deleteCoupon()">YES</button>
										<button type="button" class="btn btn-default" data-dismiss="modal">NO</button>
									</div>
								</div>

							</div>
						</div>
						<!-- 쿠폰 전송 -->
						&nbsp;&nbsp;&nbsp; <a class="btn btn-info btn-lg"
							data-toggle="modal" data-target="#myModal4" width="150"
							height="150" href="#" data-placement="bottom"
							title="쿠폰 수정 시에는 할인 쿠폰 선택이 중복되어서는 안됩니다">쿠폰 전송</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<div class="modal fade" id="myModal4" role="dialog">
							<div class="modal-dialog">

								<!-- Modal content-->
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">&times;</button>
										<h4 class="modal-title">이용 고객 리스트</h4>
									</div>
									<div class="modal-body">
									<table class="table table-hover">
										<thead>
										<tr>
											<td>고객이메일</td>
											<td>선택</td>
										</tr>
										</thead>
										<tbody align="center">
											<s:iterator value="couponSendList">
												<tr>
													<td><s:property value="cstEmail" /></td>
													<td><input type="radio" id="customerRadio" name="cstEmail" value='<s:property value="cstEmail"/>'></td>
												</tr>
											</s:iterator>
										</tbody>
									</table>
										<!-- <input type="checkbox" name="customer">이형익<br> <input
											type="checkbox" name="customer">조건<br> <input
											type="checkbox" name="customer">김소연<br> -->
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">전송</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>

							</div>
						</div>


					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>