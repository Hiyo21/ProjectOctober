<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

  <script src="bower_components/jquery/dist/jquery.min.js"></script>

<script src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css"></script>
<style type="text/css">
#example_paginate {
	text-align: center;
	 cursor: pointer; 
}

</style>
  <script>

	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	});
	
	$(function(){
		$('[data-toggle="tooltip"]').tooltip(); 
	});		

$(document).ready(function(){
	//$('#reservation').on('click', goReservation);
	$('[data-toggle="tooltip"]').tooltip();	
    $(".nav-tabs a").click(function(){
        $(this).tab('show');
    });
    $('#example').DataTable( {
        "order": [[ 3, "desc" ]]
    } );
    
    $('.nav-tabs a').on('shown.bs.tab', function(event){
        var x = $(event.target).text();         // active tab
        var y = $(event.relatedTarget).text();  // previous tab
        $(".act span").text(x);
        $(".prev span").text(y);
    });
});

function reservation() {
	location.href="${pageContext.request.contextPath}/enterprise/toEptReservationHistoryPage.action";
}

function goReservation(){
	alert('goHistory');
	//location.href="${pageContext.request.contextPath}/enterprise/toEptReservationHistoryPage.action";
	$.ajax({
		url:'toEptReservationHistoryPage.action'
		, dataType:'json'
		, Type:'post'
		, success: output
	});
}

function output(msg){
	alert('성공');
	var str = '<table>';
	$.each(msg.saleRecords, function(key, item) {
		str += '<tr>';
		str += '<td class=tbNum>'+ item.saleNum +'</td>';
		str += '<td class=tbName>'+ item.reservation.rsvNum +'</td>';
		str += '<td class=tbText>'+ item.reservation.cstEmail +'</td>';
		str += '<td class=tbNum>'+ service.svcTitle +'</td>';
		str += '<td class=tbNum>'+ reservation.rsvStartDate +'</td>';
		str += '<td class=tbNum>'+ saleAmount +'</td>';
		//str += '<td><input type="button" value="DELETE" class="btDel" num="'+item.num+'"></td>';
		str += '</tr>';
	});
	str += '</table>';
	$('#listDiv').html(str);
	$('.btDel').on('click', deleteComment);
}


/* 쿠폰용 */
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
/* 
function goCouponEvent(){
	$.ajax({
		url: 'enterprise/toEnterpriseCouponManagement.action',
		success: function(obj){
			alert(obj);
			$('#CouponEvent').html(obj);
			location.href="#CouponEvent";
		}
	});
	
} */

</script>
<title>CustomerMypage.jsp</title>
</head>
<body>
<!-- 헤더시작 -->
<s:include value="../Header.jsp"></s:include>
<!-- 헤더 끝 -->

<!-- 탭 시작 -->
<div class="container">
<h2>마이 페이지</h2><br>
<ul class="nav nav-tabs">
<li class="active"><a href="#InformationUpdate">정보수정</a></li>
<!-- <li><a href="javascript:couponEvent('${pageContext.request.contextPath}')">쿠폰 및 이벤트</a></li>-->
<li><a href="#CouponEvent">쿠폰 및 이벤트</a></li>
<li><a href="#OneClick">OneClick 결제</a></li>
<%-- <li><a href="${pageContext.request.contextPath}/enterprise/toEptReservationHistoryPage.action" id="reservation">예약 내역</a></li> --%>
<li><a href="#reservationDiv">예약 내역</a></li>
</ul>

<div class="tab-content">
<!-- 정보수정 탭 시작 -->
<div id="InformationUpdate" class="tab-pane fade in active">
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<table class="table table-hover">
						<tr><td>이름</td><td><input type="text" name="name" id="vo.name"><br></td><tr>          			        			         		
						<tr><td>이메일</td><td><input type="email" name="email" id="vo.email"><br></td></tr>
						<tr><td>P/W</td><td><input type="password" name="pwd1" id="vo.password"></td></tr>
						<tr><td>P/W 재확인</td><td><input type="password" name="pwd2"></td></tr>
						<tr><td>전화번호</td><td><input type="text" name="phone" id="vo.phone"></td></tr>
						<tr><td>성별</td><td><input type="radio" name="sex">남 &nbsp;&nbsp;&nbsp;<input type="radio" name="sex">여</td></tr>          		
					</table>          	
				</div>
         
				<div class="col-md-6">
					<table class="table table-hover">  	
						<tr>
							<td>생년월일&nbsp;</td>
							<td><select name="year">
								<option value="1960">1960년</option>
								<option value="1961">1961년</option>
								<option value="1962">1962년</option>
								<option value="1963">1963년</option>
								<option value="1964">1964년</option>
								<option value="1965">1965년</option>
								<option value="1966">1966년</option>
								<option value="1967">1967년</option>
								<option value="1968">1968년</option>
								<option value="1969">1969년</option>
								<option value="1970">1970년</option>
								<option value="1971">1971년</option>
								<option value="1972">1972년</option>
								<option value="1973">1973년</option>
								<option value="1974">1974년</option>
								<option value="1975">1975년</option>
								<option value="1976">1976년</option>
								<option value="1977">1977년</option>
								<option value="1978">1978년</option>
								<option value="1979">1979년</option>
								<option value="1980">1980년</option>
								<option value="1981">1981년</option>
								<option value="1982">1982년</option>
								<option value="1983">1983년</option>
								<option value="1984">1984년</option>
								<option value="1985">1985년</option>
								<option value="1986">1986년</option>
								<option value="1987">1987년</option>          				
							</select>&nbsp;&nbsp;
          			
          			<select name="month">
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
          			</select>&nbsp;&nbsp;         			
          			
          			<select name="month">
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
          			</select>
          			
          			</td>
          		</tr>
          		<tr>
          			<td>우편번호</td>
          			<td><input type="text" name="zipcode" id="vo.zipcode" value="우편번호" onfocus="this.value=''" readOnly>&nbsp;<input type="button" value="우편번호 검색"></td>
          		</tr> 
          		<tr>
          			<td>주소</td>
          			<td><input type="text" name="address1" id="vo.address1">&nbsp;&nbsp;&nbsp;<input type="text" name="address2" id="vo.address2"></td>
          		</tr>  
          	</table>
          </div>        
        </div>
        <div class="modal-footer">
		  	<button type="button" class="btn btn-default">수정하기</button>
		  	<button type="button" class="btn btn-default">취소</button>		          
		  </div>
      </div>
    </div>	       
    </div>    
    <!-- 정보수정 탭 끝 -->   
    
    <!-- 예약 탭 시작 -->
    <div id="Reservation" class="tab-pane fade">
     <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-6" style="display: inline-block;text-align: center;">
            <h2>지난 한 달간 예약내역</h2>
            <div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					      
		<!-- 코랩스를 쓰려면 href와 id를 연결해 줘야 하는데 href="#<s:property value=""/>"값으로 href값을 줘야함 -->
					        <a data-toggle="collapse" href="#reservation1">15/09/20 릴렉스 마사지</a>
					      </h4>      
					      </div>
					      
					    <div id="reservation1" class="panel-collapse collapse">
					      <div class="panel-body">
								<h2>릴렉스 마사지</h2>
								<p>시술 일자 : 2015.10.13</p>
								<p>시술 내용 : 얼굴 축소 마사지</p>
								<p></p>						
							</div>					      
					    </div>
					  </div>
				</div>						
          </div>
          <div class="col-md-6" style="display: inline-block;text-align: center;">
            <h2>예약확인</h2>
            	<div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" href="#rsvConfirm1">15/10/10 릴렉스 마사지</a>
					      </h4>      
					      </div>
					      
					    <div id="rsvConfirm1" class="panel-collapse collapse">
					      <div class="panel-body">
								<h2>릴렉스 마사지</h2>
								<p>시술 예정 일자 : 2015.10.10</p>
								<p>시술 내용 : 발마닥 마사지</p>							
								<p align="center">오시는 길 :  <img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false"></p>
							</div>					      
					    </div>
					  </div>
					  
				</div>
				
						<div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" href="#reservation2">15/10/30 이형익 이발소</a>
					      </h4>      
					      </div>
					      
					    <div id="reservation2" class="panel-collapse collapse">
					      <div class="panel-body">
								<h2>이형익 이발소</h2>
								<p>시술 예정 일자 : 2015.10.30</p>
								<p>시술 내용 : 볼륨펌+갈색 염색</p>
								<p align="center">오시는 길 :  <img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false"></p>						
							</div>					      
					    </div>
					  </div>
					  
				</div>		
          </div>
        </div>
      </div>
    </div>
    </div>
    <!-- 예약 탭 끝 -->
    
    <!-- 쿠폰 및 이벤트 탭 시작  -->
    <div id="CouponEvent" class="tab-pane fade">
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
    </div>
    <!-- 쿠폰 및 이벤트 탭 끝 -->
    
    <!-- 원클릭 결제 탭 시작 -->
    <div id="OneClick" class="tab-pane fade" >
      <h2>OneClick 카드등록</h2>
      <table class="table table-hover">
          		<tr>
          			<td>카드번호</td>
          			<td><input type="password" name="cardNumber" id="vo.cardNum"><br></td>
          		</tr>
          		<tr>
          			<td>유효기간</td>
          			<td><select name="month">
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
          				</select>&nbsp;&nbsp;
          				
          				<select name="day">
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
          				</select>        				
          			</td>
          		</tr>
          		<tr>
          			<td>CVC</td>
          			<td><input type="text" id="cvc" size="5"/></td>
          		</tr>        		
       </table>  
		       <div class="container" style="display: inline-block;text-align: center;">
		          			<button type="button" class="btn btn-primary">등록</button>
		          		</div>
    </div>
    <!-- 원클릭 결제 탭 끝 -->   
    <div id="reservationDiv" class="tab-pane fade">
	    <div class="container">
			<h1><s:property value="#session.loginName"/>님의 고객 예약 내역</h1>
			<table id="example" class="display" cellspacing="0" width="100%" border="1">
				<thead>
					<tr>
						<th>매출번호</th>
						<th>예약번호</th>
						<th>고객아이디</th>
						<th>서비스이름</th>
						<th>예약날짜</th>
						<th>가격</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="saleRecords">
					<tr>
						<td><s:property value="saleNum"/></td>
						<td><s:property value="reservation.rsvNum"/></td>
						<td><s:property value="reservation.cstEmail"/></td>
						<td><s:property value="service.svcTitle"/></td>
						<td><s:property value="reservation.rsvStartDate"/></td>
						<td><s:property value="saleAmount"/></td>
					</tr>
					</s:iterator>
				</tbody>
			</table>
			<div align="right">
				<button type="button" class="btn btn-default" onclick="goBack()">뒤로가기</button>
			</div>
		</div>
    </div>  
  	
	</div>
	</div>
<!-- 탭 끝 -->

</body>
</html>