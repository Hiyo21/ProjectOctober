
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar Page</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lib/smoothness/jquery-ui.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/fullcalendar.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link href="https://gitcdn.github.io/bootstrap-toggle/2.2.0/css/bootstrap-toggle.min.css" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/calendar/FontTest.css"/>

<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lib/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lib/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/fullcalendar.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lang-all.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/gcal.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/listview.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="https://gitcdn.github.io/bootstrap-toggle/2.2.0/js/bootstrap-toggle.min.js"></script>


<style>
	* {font-family: 'Spoqa Han Sans', 'Spoqa Han Sans JP', 'Sans-serif'; }
	.fc-sat { color:blue; }
	.fc-sun { color:red;  }
</style>

<script>
	var enterpriseInfo = {};
	var serviceInfo = {};

	
	$(function(){
		
		//--------------삭제시, event 객체 드래그 할 때 좌표 읽는 데 사용 -------------//
		
		var currentMousePos = {x: -1, y: -1};
		
		$(document).mousemove(function (event) {
			currentMousePos.x = event.pageX;
		 	currentMousePos.y = event.pageY;
		});
		
		$("#inputEmployeeGenderCheckBox").bootstrapToggle({
			on: "여성",
			off: "남성"
		}).change(function(){
			if($(this).prop('checked')){
				$('#genderCheckField').html($(this).attr('data-on'));
			}else{
				$('#genderCheckField').html($(this).attr('data-off'));
			}
		});
		
		//-----------------------사전에 정보 불러오기 : Enterprise 정보 --------------------------------//
		
		enterpriseInfo = $.ajax({
			url: '${pageContext.request.contextPath}/enterprise/retrieveEnterpriseInfoForCalendar.action',
			type: 'POST',
			data: {"etpNum":${etpNum}},
			async: false,
			contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
			success: function retrieveEnt(data){
				enterpriseInfo = data.enterprise;
				console.log('received enterpriseinfo!');
				console.log(enterpriseInfo);
				$('#templateType').attr('value', data.enterprise.etpTemplateType); 
				
				var colorTheme = enterpriseInfo.etpThemeType;
					if(colorTheme == 1) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/cherry.css'/>");
					if(colorTheme == 2) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/color.css'/>"); 
					if(colorTheme == 3) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/creature.css'/>"); 
					if(colorTheme == 4) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/frame.css'/>"); 
					if(colorTheme == 5) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/grass.css'/>"); 
					if(colorTheme == 6) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/maple.css'/>"); 
					if(colorTheme == 7) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/mineral.css'/>"); 
					if(colorTheme == 8) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/sliced.css'/>"); 
					if(colorTheme == 9) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/spring.css'/>"); 
					if(colorTheme == 10) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/sunset.css'/>"); 
					if(colorTheme == 11) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/tile.css'/>"); 
					if(colorTheme == 12) $('head').append("<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>");

				
			},error: function(request, status, error){
				console.log('retrieveEnterpriseInfoForCalendar failed!');
				console.log(request);
				console.log(status);
				console.log(error);
			}
		});
		
		serviceInfo = $.ajax({
			url: '${pageContext.request.contextPath}/enterprise/receiveServiceList.action',
			dataType: 'json',
			data: {'etpNum':${etpNum}},
			async: false,
			success: function(data){
				svcList = data.serviceList;
				$("#inputServiceList").html('');
				$("#inputServiceList").append("<option value='' disabled selected hidden>선택하세요.</option>");
				
				$.each(svcList, function(i, d){
					$("#inputServiceList").append("<option value='" + d.svcNum + "'>" + d.svcTitle + "</option>");
					$("#externalServiceList").append("<div class='fc-event' id='external" + i + "' value='" + d.svcNum + "' duration='" + d.svcTime + "'>" + d.svcTitle + "</div><br>");
					console.log($("#externalServiceList"));
				});
			},
			error: function(){
				console.log("receive service list error");
			}
		});
		
		console.log(enterpriseInfo.responseJSON.enterprise.workingDays.dow);
		
		//업체 영업 시작 시간 설정
		var startTT = enterpriseInfo.responseJSON.enterprise.start;
		//업체 영업 끝 시간 설정
		var endTT = enterpriseInfo.responseJSON.enterprise.end;
		//업체 휴무일 설정
		var dowTT = enterpriseInfo.responseJSON.enterprise.workingDays.dow;
		var etpNumCheck = '' + enterpriseInfo.responseJSON.enterprise.etpNum;
		var etpNumCheckSt = '<s:property value="#session.loginEtpNum"/>';

		var etpNameCheck = '' + enterpriseInfo.responseJSON.enterprise.etpOwner;
		var etpNameCheck = '<s:property value="#session.enterprise.etpOwner"/>';

		var etpMemCodeCheckSt = '<s:property value="#session.memCode"/>';
		
		//----------------------------------Full Calendar 시작.------------------------------------//
		if(etpNumCheckSt == etpNumCheck){
		
			//TODO: session 검사해서, 사업자 일때랑, 일반 이용자일 때, 그리고 아무것도 안 했을 때 구분.
			var calendar = $('#calendar').fullCalendar({
				header: {
					left:'prev,next today',
					center: 'title',
					right: 'month, agendaWeek, agendaDay,list'
				},
				lang: 'ko',
				theme: true,
				defaultView : 'agendaWeek',
				selectable: true,
				selectHelper: true,
				scrollTime: '09:00:00',
				dragRevertDuration: 10,
				draggable : true,
				minTime: startTT,
				maxTime: endTT,
				businessHours : {
					start: startTT,
					end: endTT,
					dow: dowTT,
				},
				eventConstraint: "businessHours",
				
				
				//----------------- 기존 존재하는 이벤트 클릭 시 -----------------------//
				
				eventClick: function(event, jsEvent, view){
					$("#reservationUpdateBody").hide();
			        
					//---------------------각 예약당 회원 정보  가지고 오기 ----------------//
	
					$(this).click(function(){
			        	$.ajax({
		        			url: '${pageContext.request.contextPath}/member/retrieveCustomerInfoPerReservation.action',
		        			dataType: 'json',
		        			async: false,
		        			data: {"cstEmail": event.cstEmail,
		        					"rsvNum": event.id
		        				},
		        			success: function(data){
								event.cstPhone = data.member.memPhone;
								event.cstAddress = data.member.customer.cstAddress;
								event.cstZipcode = data.member.customer.cstZipcode;
								event.cstOneclick = data.member.customer.cstOneclick;
								event.cstGender = data.member.customer.cstGender;
								event.cstName = data.member.memName;
		        			},
		        			error: function(){
		        				console.log("receive service list error");
		        			}
		        		});
			        	
			        	//--------------- 업체 당 변경 가능한 서비스 리스트 가져오기 --------------//
			        	
			        	$.ajax({
		        			url: '${pageContext.request.contextPath}/enterprise/receiveServiceList.action',
		        			//dataType: 'json',
		        			data: {"etpNum" : ${etpNum}},
		        			async: false,
		        			contentType: 'application/json; charset=UTF-8',
		        			success: function(data){
		        				var services = data.serviceList;
		        				$("#reservationUpdateSelectService").html('');
		        				$("#reservationUpdateSelectService").append("<option value='' disabled selected>선택하세요.</option>");
		        				$.each(services, function(i, d){
		        					$("#reservationUpdateSelectService").append("<option value='" + d.svcNum + "'>" + d.svcTitle + "</option>");
		        					$("#externalServiceList").append("<span class='label label-default externals' id='external" + i + "' value='" + d.svcNum + "' duration='" + d.svcTime + "'>" + d.svcTitle + "</span><br>");
		        					console.log($("#externalServiceList"));
		        				});
		        				
		        			},
		        			error: function(request, status, error){
		        				console.log("receive service list error");
		        				console.log(request);
		        				console.log(status);
		        				console.log(error);
		        			}
		        		});
			        	
			        	//--------------external event 받아오기? ----------//
			        			
			        	
			        	//--------------------- 받아온 값들로 기존 예약 상세내용 리스트 뿌리기 -----------------------//
			        	
			        	console.log(event);
			        	//$("#calendar").fullCalendar('removeEvents');
						//$("#calendar").fullCalendar('removeEventSource', event);
						//$('#calendar').fullCalendar('addEventSource', event);
						$('#calendar').fullCalendar('refetchEvents');
						$('#calendar').fullCalendar('rerenderEvents');
			        	$("#updateModalTitle").html(event.title);
			        	$("#updateModalEventId").html(event.id);
			        	$("#updateModalCustomerEmail").html(event.cstEmail);
			        	$('#updateModalCustomerPhone').html(event.cstPhone);
			            $("#updateModalStartTime").html(moment(event.start).format('MMM Do A h:mm '));
			            $("#updateModalEndTime").html(moment(event.end).format('MMM Do A h:mm '));
			            $('#updateModalCustomerName').html(event.cstName);
			            $("#updateModalSvcTitle").html(event.svcTitle);
			            $('#updateModalSvcCost').html(event.svcCost + "원");
			            $("#reservationUpdateTitle").attr("value", event.title);
			            $("#reservationUpdateDescription").html(event.svcDescription);
			            $("#reservationDescription2").html(event.description);
			            $("#reservationCost").html(event.rsvCost + "");
			            $('#updateModal').modal();
			        });
	
					
					//----------------------변경 가능한 내용들 토글로 보이게 하기 --------------------------//
					$("#updateReservationShowBtn").off("click");
			        $("#updateReservationShowBtn").click(function(){
			        	var options ={};
			            $("#reservationUpdateBody").toggle("clip",options,500);
			        });
					
					//---------------------- 변경 내용 중 서비스 리스트 클릭 하면 그 값 가져가는 거 확인 하는 곳 ----------------//
			        $("#reservationUpdateSelectService").off("change");
			        $("#reservationUpdateSelectService").change(function(){
			        	console.log($(this).val());
			        	console.log($("#reservationUpdateTitle").val());
			        });
					
					$("#closeReservationBtn").click(function(event){
						$('#insertModal').modal('hide');
						$("#calendar").fullCalendar('removeEvents');
						$("#calendar").fullCalendar('removeEventSource', event);
						$('#calendar').fullCalendar('addEventSource', event);
						$('#calendar').fullCalendar('refetchEvents');
						$('#calendar').fullCalendar('rerenderEvents');
					});
					
			        //--------------------- 예약 내용 변경 신청 AJAX로 하는 기능 ---------------------------------//
	     
			        $("#updateReservationBtnGo").off("click");
			        $("#updateReservationBtnGo").click(function(){
			        	console.log($("#reservationUpdateDateStartTime").val());
			        	
						 var reservation = {
								"reservation.rsvNum" : event.id,
								"reservation.svcNum" : $("#reservationUpdateSelectService").val(),
								"reservation.cpnNum" : event.cpnNum,
								"reservation.etpNum" : event.etpNum,
								"reservation.etpEmail" : event.etpEmail,
								"reservation.cstEmail" : event.cstEmail,
								"reservation.rsvStatus" : event.rsvStatus,
								"reservation.rsvTitle": $("#reservationUpdateTitle").val(),
								"reservation.start" : event.start.toISOString(),
								"reservation.end" : event.end.toISOString(),
								"reservation.status" : event.status,
								"reservation.employeeGender" : event.employeeGender,
								"reservation.rsvDesc" : $("#reservationUpdateDescription2").val(),
								"reservation.rsvCost" : event.rsvCost
							};
						
						console.log(reservation);
						$.ajax({
							url: '${pageContext.request.contextPath}/enterprise/updateReservationDetailsByEnterprise.action',
							dataType: 'json',
							data: reservation,
							contentType: 'application/json; charset=UTF-8',
							success: function(data){
								alert('success!');
								console.log(event);
								//$("#calendar").fullCalendar('removeEvents');
								//$("#calendar").fullCalendar('removeEventSource', event);
								//$('#calendar').fullCalendar('addEventSource', event);
								$('#calendar').fullCalendar('refetchEvents');
								$('#calendar').fullCalendar('rerenderEvents');
								$('#updateModal').modal('hide');
							},
							error: function(){
								console.log('fail!');
							}
						});	
			        });
				},
				//----------------------------------------------------------------------------------------//
				
				eventRender: function(event, element){
					console.log(event);
					if(event.rendering == 'background'){
						alert('hello?');
					}
				},
				//select: 빈 칸에 눌렀을 때  
				select: function(start, end, jsEvent, view, allDay){	
					console.log(start._d.toJSON().slice(0,16));
					var check = start._d.toJSON().slice(0,16); 
					var today = new Date().toJSON().slice(0,16);
					if(check < today ){
						alert('이미 지난 시간대에는 예약할 수 없습니다!');
						$('#calendar').fullCalendar('rerenderEvents');
						return false;
					}else{
						console.log(jsEvent);
						console.log(view);
					  var coupons ={};
					  var camUseCoupon = false;
					  var cpnNum = '';
					  var cpnCodeInput = '';
					  var svcList =[];
					  var svcDetailList =[];
					  
					  
					//------------------------------Insert 기능 시작 ----------------------------//
						$.ajax({
		        			url: '${pageContext.request.contextPath}/enterprise/receiveServiceList.action',
		        			dataType: 'json',
		        			data: {'etpNum':${etpNum}},
		        			async: false,
		        			success: function(data){
		        				svcList = data.serviceList;
		        				$("#inputServiceList").html('');
		        				$("#inputServiceList").append("<option value='' disabled selected hidden>선택하세요.</option>");
		        				
		        				$.each(svcList, function(i, d){
		        					$("#inputServiceList").append("<option value='" + d.svcNum + "'>" + d.svcTitle + "</option>");
		        					svcDetailList.push(d);
		        					$("#externalServiceList").append("<span class='label label-default externals' id='external" + i + "' value='" + d.svcNum + "' duration='" + d.svcTime + "'>" + d.svcTitle + "</span><br>");
		        					console.log($("#externalServiceList"));
		        				});
		        			},
		        			error: function(request, status, error){
		        				console.log("receive service list error");
		        				console.log(request);
		        				console.log(status);
		        				console.log(error);
		        			}
		        		});
						
						$.ajax({
							  url: '${pageContext.request.contextPath}/enterprise/retrieveCouponList.action',
							  dataType: 'json',
							  data: {'etpNum':${etpNum}},
							  success: function(data){
								  cpnList = [];
								  cpnList = data.couponList;
								  console.log(cpnList);
								  $("#cpnList").html('');
								  $("#cpnList").append("<option value='' disabled selected>선택하세요</option>");
								  $("#inputCpnCodeField").prop("disabled", true);
								  $.each(cpnList, function(i, d){
									  $("#cpnList").append("<option value='" + d.cpnNum + "' cpnRate=''>" + d.cpnTitle + "</option>");
								  });
							  },
							  error: function(){
								  console.log("coupon retrieval error!");
							  }
						  });
						  
					//----------------------------------------------------------------------------------//
					
					
					$("#inputStartTime").attr('value', start.format("MM월 DD일 a hh시 mm분"));
					document.getElementById("inputStartTimeHidden").value = start.toISOString();
					$("#inputEndTime").attr('value', end.format("MM월 DD일 a hh시 mm분"));
					document.getElementById("inputEndTimeHidden").value = end.toISOString();
					
					console.log($("#inputStartTime").attr('value'));
					console.log(document.getElementById("inputStartTimeHidden").value);
					console.log($("#inputEndTime").attr('value'));
					console.log(document.getElementById("inputEndTimeHidden").value);
	
					//$("#cpnList").off("click");
					$(document).on('change',"#cpnList",function(){
						console.log($("#cpnList").val());
						$("#inputCpnCodeField").prop("disabled", false);
						 cpnNum = $("#cpnList").val();
					});
					
					//$("#inputServiceList").off("change");
					$(document).on("change","#inputServiceList",function(){
						var x = $('#inputServiceList > option:selected').index();
						document.getElementById("inputDescription").value = svcDetailList[x-1].svcDescription;
						document.getElementById("inputPrice").value = svcDetailList[x-1].svcCost;
					});
					
					
					//---------------미완성!-------------------//	
					$(document).on('click',"#inputCpnCodeButtonGo",function(){
						cpnCodeInput = document.getElementById("inputCpnCodeField").value;
						console.log(cpnCodeInput);
						console.log(cpnNum);
						$.ajax({
							url: '${pageContext.request.contextPath}/enterprise/checkCoupon.action',
							data: {'coupon.cpnNum' : cpnNum,
								   'coupon.cpnCode' : cpnCodeInput},
							success: function(data){
									canUseCoupon = data.coupon.canUseCoupon;
								if(canUseCoupon){
									console.log(data);
									var cpnOK = data.coupon;
									console.log(cpnOK);
									document.getElementById('inputPrice').value = document.getElementById('inputPrice').value * (1-((cpnOK.cpnRate)/100)); 
								}else{
									console.log('say what?');
								}
							}, 
							error: function(request, status, error){
								console.log(request);
								console.log(status);
								console.log(error);
								console.log("can't apply coupon");
							}
						 });
				    });
		
					/* $('#insertModalBody').html('');
					$('#insertModalBody').html($("#inputDetailTable")); */
	
					//$("#insertModal").off("modal");
					$('#insertModal').modal('show');
						
						//-------------------------------------------//
							
				//-------------------------------- 폼에서 받은 값 대응하는 그릇에 집어 넣기. -------------------------//
						var inputTitle = $('#inputTitle').val();
						var colorTemp = 0;
						/* var inputDescription = $('#inputDescription').val(); */
						var inputStartTime = $('#inputStartTimeHidden').val();
						var inputEndTime = $('#inputEndTimeHidden').val();
						var inputServiceList = document.getElementById('inputServiceList').value;
						var inputEmployeeGender = ''; 
							if($('#genderCheckField').html() == '남성') {
								$('#genderCheckField').val('m');
								inputEmployeeGender = 'm';
							}else{
								$('#genderCheckField').val('f');
								inputEmployeeGender = 'f';
							}
							console.log(inputEmployeeGender);
							
						var inputStatus = $('#inputStatus').val();
							
						$("#inputStatus").change(function(){
							colorTemp = $(this).val();
						});
						var reservation = {};			
			
					$('#insertReservationBtnClose').off("click");
					$("#insertReservationBtnClose").click(function(e){
						location.reload();
					});
					
					$("#closingUpdateBtn, #closingInsertButton").click(function(){
						location.reload();
					});
							
				//----------------------------- Form 안의 값들을 Java로 보내는 기능 --------------------------------//
					
					$("#insertReservationBtn").click(function(revertFunc){					
						if($('#insertAgreementCheckbox').prop('checked') == false){
							alert('약관에 동의해 주셔야 합니다.');
							$('#insertModal').modal('hide');
							revertFunc();
							event.off();
							calendar.fullCalendar('unselect');
							return false;
						}
						
						//-----------------약관 동의하면 DB에 reservation 집어 넣자! -----------------//
						
						console.log(colorTemp);
						
						//---------------예약인데 휴일용 예약일때! ------------------//
						if(colorTemp == 3){
							$.ajax({
								url: "${pageContext.request.contextPath}/enterprise/insertDayOff.action",
								dataType: 'json',
								type: 'POST',
								data: $('#inputForm').serialize(),
								contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
								success: function(data){
									$("#insertModal").modal('hide');
									console.log(data);
								},error: function(request, status, error){
									console.log(request);
									console.log(status);
									console.log(error);
								}
							});
						}else{
							$.ajax({
								url: "${pageContext.request.contextPath}/enterprise/insertReservation.action",
								dataType: 'json',
								type: 'POST',
								data: $('#inputForm').serialize(),
								contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
								success: function(doc){
									$('#insertModal').modal('hide');
									var dors = doc.reservation;
									var pmtNum = 0;
									var paymentRecord = {};
									
									console.log(dors);
									var reservation = {
											"reservation.svcNum" : dors.svcNum,
											"reservation.cpnNum" : dors.cpnNum,
											"reservation.etpNum" : doc.reservation.etpNum,
											"reservation.etpEmail" : dors.etpEmail,
											"reservation.cstEmail" : dors.cstEmail,
											"reservation.rsvStatus" : dors.rsvStatus,
											"reservation.rsvTitle" : dors.rsvTitle,
											"reservation.start" : dors.start,
											"reservation.end": dors.end,
											"reservation.rsvDesc" : dors.rsvDesc,
											"reservation.rsvCost" : dors.rsvCost,
											"service.svcCost" : dors.service.svcCost
									};
									console.log(reservation);
									
									$.ajax({
										url: "${pageContext.request.contextPath}/enterprise/retrieveReservationFromOtherInfo.action",
										type: 'POST',
										async: false,
										data: reservation,
										success: function(data){
											console.log('retreiveReservationInfo Success!');
											console.log(data);
											console.log(data.reservation);
											paymentRecord = {
												"paymentRecord.rsvNum" : data.reservation.rsvNum,
												"paymentRecord.pmtAmount" : data.reservation.rsvCost
											};
										},error: function(request, status, error){
											console.log(request.status);
											console.log(status);
											console.log(error);
											console.log('retrieveReservationFromOtherInfo error!');
										}
									});
									
									//----------------예약 들어가면 일단 소비자 Payment Record에 입력 ---------------//
									// 이벤트 아이디는 받아올 수 있는게냐?
									console.log(paymentRecord);
									$.ajax({
										url:"${pageContext.request.contextPath}/customer/insertPaymentRecord.action",
										type: 'POST',
										async:false,
										data: paymentRecord,
										success: function(data){
											console.log('insertPaymentRecord success!');
											console.log(data);
											paymentRecordReceived = data.paymentRecord;
										},error: function(request, status, error){
											console.log("payment record insertion failed!");
											console.log(request.status);
											console.log(request);
											console.log(status);
											console.log(error);
										}
									});
									
									 
									//------------------Payment Record 입력 후 Sale Record에 입력 --------------//
									console.log(enterpriseInfo);
									console.log(paymentRecordReceived);
									var saleRecord = {
										"saleRecord.pmtNum" : paymentRecordReceived.pmtNum,
										"saleRecord.etpNum" : enterpriseInfo.responseJSON.enterprise.etpNum,
										"saleRecord.etpEmail" : enterpriseInfo.responseJSON.enterprise.etpEmail,
										"saleRecord.saleAmount" : paymentRecordReceived.pmtAmount
									};
									
									$.ajax({
										url:"${pageContext.request.contextPath}/enterprise/insertSaleRecord.action",
										type: 'POST',
										data: saleRecord, 
										success: function(data){
											$("#calendar").fullCalendar('removeEventSource', event);
											$('#calendar').fullCalendar('addEventSource', event);
											$('#calendar').fullCalendar('refetchEvents');
											$('#calendar').fullCalendar('rerenderEvents');
										},
										error:function(request, status, error){
											console.log("sale record insertion failed!");
											console.log(request.status);
											console.log(request);
											console.log(status);
											console.log(error);
										}
									});
								},
								error: function(doc){
									console.log("insert Error");
								}
							});
						}
						$(this).unbind();
						calendar.fullCalendar('unselect');
					});
				}
			},
				
				//------------------------------ insert 마무리 작업  -----------------------------------//
				
				themeButtonIcons: {
					prev: 'circle-triangle-w',
					next: 'circle-triangle-e'
				},
				weekNumbers: true,
				fixedWeekCount: true,
				slotLabelFormat: 'a h(:mm)시',
				contentHeight: 600,
				editable: true,
				eventLimit: true,
				timezone: false,
				selectble: false,
				selectHelper: true,
				googleCalendarApiKey: 'AIzaSyB0_Qo7SZ6u722nhCjpKzjrHJ2gPWr_cTA',
				
				//------------------------------------- 각 사업자당 예약들 불러오는 기능  -------------------------------------------//
				eventSources: [
				              //사업자가 한 예약 가져오기~!
				             	{
				             		backgroundColor: '#DCD',
				      				textColor: 'black',
				            		events: function(start, end, timezone, callback){
					      				$.ajax({
					      					url: '${pageContext.request.contextPath}/enterprise/retrieveReservations.action',
					      					type: 'POST',
					      					data: {"etpNum":${etpNum}},
					      					dataType: 'json',
					      					success: function(doc, index, value){			
					      						var resList = doc.reservationList;
					      						var events = [];
					      						
					      						$(resList).each(function(index,item){
					      							events.push({
					      								id: item.rsvNum,
					      								start: item.start,
					      								end: item.end,
					      								title: item.rsvTitle,
					      								timezone: false,
					      								rendering: event.rendering,
					      								svcNum: item.svcNum,
					      								cpnNum: item.cpnNum,
					      								etpNum: item.etpNum,
					      								etpEmail: item.etpEmail,
					      								cstEmail: item.cstEmail,
					      								startDate: item.rsvStartDate,
					      								endDate: item.rsvEndDate,
					      								status: item.rsvStatus,
					      								employeeGender: item.employeeGender,
					      								description : item.rsvDesc,
					      								rsvCost: item.rsvCost,
					      								
					      								etpOwner: item.enterprise.etpOwner,
					      								etpSuperclass: item.enterprise.etpSuperclass,
					      								etpAddress: item.enterprise.etpAddress,
					      								etpZipcode: item.enterprise.etpZipcode,
					      								etpTitle: item.enterprise.etpTitle,
					      								etpPhone: item.enterprise.etpPhone,
					      								etpMaleStaff: item.enterprise.etpMaleStaff,
					      								etpFemaleStaff: item.enterprise.etpFemalStaff,
					      								etpCapacity: item.enterprise.etpCapacity,
					      								etpRsvDeadline: item.enterprise.etpRsvDeadline,
					      								etpSelfNotification: item.enterprise.etpSelfNotification,
					      								etpCstNotification: item.enterprise.etpCstNotification,
					      								//etpTemplateType: item.enterprise.etpTemplateType,
					      								etpThemeType: item.enterprise.etpThemeType,
					      								etpSvcOffered: item.enterprise.etpSvcOffered,
					      								etpSubclass: item.enterprise.etpSubclass,
					      								etpSpecialize: item.enterprise.specialize,
					      								etpDescription: item.enterprise.etpDescription,
					      								
					      								svcTitle: item.service.svcTitle,
					      								svcCost: item.service.svcCost,
					      								svcDescription: item.service.svcDescription,
					      								svcCategory: item.service.svcCategory,
					      								svcSpecialize: item.service.svcSpecialize,
					      								svcCount: item.service.svcCount,
					      								svcCode: item.service.Code,
					      							});
					      						});
					      						callback(events);				      				
					      					},
					      					error: function(doc){
					      						console.log("Error");
					      					}
					      				});
				      				} 
							}
				            ,{
				            	googleCalendarId: "ko.south_korea#holiday@group.v.calendar.google.com",
				            	//googleCalendarId: '1fl6hu36lp3f7334i5fq10g18g@group.calendar.google.com',
				                className: 'holidays',
				                color: 'red',
				               // backgroundColor:'red',
				                borderColor:'green',
				                textColor:'gray',
				                timezone: false,
				                editable: false,
				                //rendering: 'background',
				                //allDay: false,
				                overlap: false
							},{
								backgroundColor: 'red',
			      				textColor: 'green',
			      				events: function(start,end,timezone,callback){
			      					$.ajax({
			      					url: '${pageContext.request.contextPath}/enterprise/retrieveOffDays.action',
			      					type: 'POST',
			      					data: {"etpNum":${etpNum}},
			      					success: function(doc, index, value){
			      						var offDayList = doc.reservationList;
			      						console.log("getting off days success!");
			      					},error: function(request, status, error){
			      						console.log(request);
			      						console.log(status);
			      						console.log(error);
			      					}
			      					});
			      				},overlap: false,
			      				editable: false,
			      				timezone: false,
			      				className: 'offdays'
							}
						]
				,
				eventDrop: function(event, delta, revertFunc, jsEvent, view) {
					$(this).unbind();
					if (!confirm("시간대를 변경하시겠습니까?")) {
						revertFunc();
					}else{
						var reservation = {
							"reservation.rsvNum" : event.id, 
							"reservation.rsvTitle": event.description,
							"reservation.start" : event.start.toISOString(),
							"reservation.end" : event.end.toISOString(),
						}
						
						console.log(reservation);
	
						$.ajax({
							url: '${pageContext.request.contextPath}/enterprise/changeReservationTime.action',
							dataType: 'json',
							data: reservation,
							contentType: 'application/json',
							success: function(data){
								alert('시간대가 변경되었습니다.');
								$('#calendar').fullCalendar('refetchEvents');
							},
							error: function(){
								console.log('fail!');						
							}
						});
					}
					$('#calendar').fullCalendar('unselect');
					//$('#calendar').fullCalendar('addEventSource', event);
					$('#calendar').fullCalendar('rerenderEvents');
					 
				},
				eventResize: function(event, delta, revertFunc, jsEvent, ui, view){
					$(this).unbind();
					if(! confirm("시간대를 변경하시겠습니까?")){
						revertFunc();
					}else{
						var reservation = {
								"reservation.rsvNum" : event.id, 
								"reservation.rsvTitle": event.description,
								"reservation.start" : event.start.toISOString(),
								"reservation.end" : event.end.toISOString(),
							}
						
						console.log(reservation);
						$.ajax({
							url: '${pageContext.request.contextPath}/enterprise/changeReservationTime.action',
							dataType: 'json',
							data: reservation,
							contentType: 'application/json',
							success: function(data){
								alert('success!');
								//$('#calendar').fullCalendar('removeEvents');
								//$('#calendar').fullCalendar('addEventSource', event);
								$('#calendar').fullCalendar('refetchEvents');
							},
							error: function(){
								console.log('fail!');
								
							}
						});
					}
					$('#calendar').fullCalendar('unselect');
				},
			 	eventDragStop: function(event, jsEvent, ui, view){
					console.log(currentMousePos);
					
					var isElementOverDiv = function(){
						var trashEl = $('#trash');
						var ofs = trashEl.offset();
						console.log(ofs);
						console.log(trashEl);
					    var x1 = ofs.left;
					    var x2 = ofs.left + trashEl.outerWidth(true);
					    var y1 = ofs.top;
					    var y2 = ofs.top + trashEl.outerHeight(true);
					   	
					    if (currentMousePos.x>=x1 && currentMousePos.x<=x2 && currentMousePos.y>=y1 && currentMousePos.y<=y2) {
					    	
					    	return true;
					    }else{
							return false;
					    }
					}
					console.log(event);
					if(isElementOverDiv()){
						if(confirm('지우시겠습니까?')){
							$.ajax({
								url: '${pageContext.request.contextPath}/enterprise/deleteReservation.action',
								dataType: 'json',
								data: {"reservation.rsvNum" : event.id},
								contentType: 'application/json',
								success: function(data){
									alert('삭제되었습니다.');
									//$('#calendar').fullCalendar('removeEvents');
									//$('#calendar').fullCalendar('addEventSource', event);
									$('#calendar').fullCalendar('refetchEvents');
								},
								error: function(){
									console.log("deletion error");
								},
							});
						};
					};
					$('#calendar').fullCalendar('unselect');
				},
				drop: function(date, jsEvent, ui){
					alert(date);
				}
			});
			
			$(function(){
				$("#external-events .fc-event").draggable({
					revert: true,
					revertDuration : 0
				});
			});
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		// ===================== 일반 이용자! =============================== //
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}else if(etpMemCodeCheckSt == '2'){
			//TODO: session 검사해서, 사업자 일때랑, 일반 이용자일 때, 그리고 아무것도 안 했을 때 구분.
			var calendar = $('#calendar').fullCalendar({
				header: {
					left:'prev,next today',
					center: 'title',
					right: 'month, agendaWeek, agendaDay,list'
				},
				lang: 'ko',
				theme: true,
				defaultView : 'agendaWeek',
				selectable: true,
				selectHelper: true,
				scrollTime: '09:00:00',
				dragRevertDuration: 10,
				draggable : true,
				minTime: startTT,
				maxTime: endTT,
				businessHours : {
					start: startTT,
					end: endTT,
					dow: dowTT,
				},
				eventConstraint: "businessHours",
				
				
				//----------------- 기존 존재하는 이벤트 클릭 시 -----------------------//
				
				eventClick: function(event, jsEvent, view){
					$("#reservationUpdateBody").hide();
			        
					//---------------------각 예약당 회원 정보  가지고 오기 ----------------//
	
					$(this).click(function(){
			        	$.ajax({
		        			url: '${pageContext.request.contextPath}/member/retrieveCustomerInfoPerReservation.action',
		        			dataType: 'json',
		        			async: false,
		        			data: {"cstEmail": event.cstEmail,
		        					"rsvNum": event.id
		        				},
		        			success: function(data){
								event.cstPhone = data.member.memPhone;
								event.cstAddress = data.member.customer.cstAddress;
								event.cstZipcode = data.member.customer.cstZipcode;
								event.cstOneclick = data.member.customer.cstOneclick;
								event.cstGender = data.member.customer.cstGender;
								event.cstName = data.member.memName;
		        			},
		        			error: function(){
		        				console.log("receive service list error");
		        			}
		        		});
			        	
			        	//--------------- 업체 당 변경 가능한 서비스 리스트 가져오기 --------------//
			        	
			        	$.ajax({
		        			url: '${pageContext.request.contextPath}/enterprise/receiveServiceList.action',
		        			dataType: 'json',
		        			data: {"etpNum" : ${etpNum}},
		        			async: false,
		        			success: function(data){
		        				var services = data.serviceList;
		        				$("#reservationUpdateSelectService").html('');
		        				$("#reservationUpdateSelectService").append("<option value='' disabled selected>선택하세요.</option>");
		        				$.each(services, function(i, d){
		        					$("#reservationUpdateSelectService").append("<option value='" + d.svcNum + "'>" + d.svcTitle + "</option>");
		        					$("#externalServiceList").append("<span class='label label-default externals' id='external" + i + "' value='" + d.svcNum + "' duration='" + d.svcTime + "'>" + d.svcTitle + "</span><br>");
		        					console.log($("#externalServiceList"));
		        				});
		        				
		        			},
		        			error: function(){
		        				console.log("receive service list error");
		        			}
		        		});
			        	
			        	//--------------external event 받아오기? ----------//
			        			
			        	
			        	//--------------------- 받아온 값들로 기존 예약 상세내용 리스트 뿌리기 -----------------------//
			        	
			        	console.log(event);
			        	//$("#calendar").fullCalendar('removeEvents');
						//$("#calendar").fullCalendar('removeEventSource', event);
						//$('#calendar').fullCalendar('addEventSource', event);
						$('#calendar').fullCalendar('refetchEvents');
						$('#calendar').fullCalendar('rerenderEvents');
			        	$("#updateModalTitle").html(event.title);
			        	$("#updateModalEventId").html(event.id);
			        	$("#updateModalCustomerEmail").html(event.cstEmail);
			        	$('#updateModalCustomerPhone').html(event.cstPhone);
			            $("#updateModalStartTime").html(moment(event.start).format('MMM Do A h:mm '));
			            $("#updateModalEndTime").html(moment(event.end).format('MMM Do A h:mm '));
			            $('#updateModalCustomerName').html(event.cstName);
			            $("#updateModalSvcTitle").html(event.svcTitle);
			            $('#updateModalSvcCost').html(event.svcCost + "원");
			            $("#reservationUpdateTitle").attr("value", event.title);
			            $("#reservationUpdateDescription").html(event.svcDescription);
			            $("#reservationDescription2").html(event.description);
			            $("#reservationCost").html(event.rsvCost + "");
			            $('#updateModal').modal();
			        });
	
					
					//----------------------변경 가능한 내용들 토글로 보이게 하기 --------------------------//
					$("#updateReservationShowBtn").off("click");
			        $("#updateReservationShowBtn").click(function(){
			        	var options ={};
			            $("#reservationUpdateBody").toggle("clip",options,500);
			        });
					
					//---------------------- 변경 내용 중 서비스 리스트 클릭 하면 그 값 가져가는 거 확인 하는 곳 ----------------//
			        $("#reservationUpdateSelectService").off("change");
			        $("#reservationUpdateSelectService").change(function(){
			        	console.log($(this).val());
			        	console.log($("#reservationUpdateTitle").val());
			        });
					
					$("#closeReservationBtn").click(function(event){
						$('#insertModal').modal('hide');
						$("#calendar").fullCalendar('removeEvents');
						$("#calendar").fullCalendar('removeEventSource', event);
						$('#calendar').fullCalendar('addEventSource', event);
						$('#calendar').fullCalendar('refetchEvents');
						$('#calendar').fullCalendar('rerenderEvents');
					});
					
			        //--------------------- 예약 내용 변경 신청 AJAX로 하는 기능 ---------------------------------//
	     
			        $("#updateReservationBtnGo").off("click");
			        $("#updateReservationBtnGo").click(function(){
			        	console.log($("#reservationUpdateDateStartTime").val());
			        	
						 var reservation = {
								"reservation.rsvNum" : event.id,
								"reservation.svcNum" : $("#reservationUpdateSelectService").val(),
								"reservation.cpnNum" : event.cpnNum,
								"reservation.etpNum" : event.etpNum,
								"reservation.etpEmail" : event.etpEmail,
								"reservation.cstEmail" : event.cstEmail,
								"reservation.rsvStatus" : event.rsvStatus,
								"reservation.rsvTitle": $("#reservationUpdateTitle").val(),
								"reservation.start" : event.start.toISOString(),
								"reservation.end" : event.end.toISOString(),
								"reservation.status" : event.status,
								"reservation.employeeGender" : event.employeeGender,
								"reservation.rsvDesc" : $("#reservationUpdateDescription2").val(),
								"reservation.rsvCost" : event.rsvCost
							};
						
						console.log(reservation);
						$.ajax({
							url: '${pageContext.request.contextPath}/enterprise/updateReservationDetailsByEnterprise.action',
							dataType: 'json',
							data: reservation,
							contentType: 'application/json; charset=UTF-8',
							success: function(data){
								alert('success!');
								console.log(event);
								//$("#calendar").fullCalendar('removeEvents');
								//$("#calendar").fullCalendar('removeEventSource', event);
								//$('#calendar').fullCalendar('addEventSource', event);
								$('#calendar').fullCalendar('refetchEvents');
								$('#calendar').fullCalendar('rerenderEvents');
								$('#updateModal').modal('hide');
							},
							error: function(){
								console.log('fail!');
							}
						});	
			        });
				},
				//----------------------------------------------------------------------------------------//
				
				eventRender: function(event, element){
					console.log(event);
					if(event.rendering == 'background'){
						alert('hello?');
					}
				},
				//select: 빈 칸에 눌렀을 때  
				select: function(start, end, jsEvent, view, allDay, e){	
					console.log(start._d.toJSON().slice(0,16));
					var check = start._d.toJSON().slice(0,16); 
					var today = new Date().toJSON().slice(0,16);
					if(check < today ){
						alert('이미 지난 시간대에는 예약할 수 없습니다!');
						$('#calendar').fullCalendar('rerenderEvents');
						return false;
					}else{
						console.log(jsEvent);
						console.log(view);
						console.log(e);
					  var coupons ={};
					  var camUseCoupon = false;
					  var cpnNum = '';
					  var cpnCodeInput = '';
					  var svcList =[];
					  var svcDetailList =[];
					  
					  
					//------------------------------Insert 기능 시작 ----------------------------//
						$.ajax({
		        			url: '${pageContext.request.contextPath}/enterprise/receiveServiceList.action',
		        			dataType: 'json',
		        			data: {'etpNum':${etpNum}},
		        			async: false,
		        			success: function(data){
		        				svcList = data.serviceList;
		        				$("#inputServiceList").html('');
		        				$("#inputServiceList").append("<option value='' disabled selected hidden>선택하세요.</option>");
		        				
		        				$.each(svcList, function(i, d){
		        					$("#inputServiceList").append("<option value='" + d.svcNum + "'>" + d.svcTitle + "</option>");
		        					svcDetailList.push(d);
		        					$("#externalServiceList").append("<span class='label label-default externals' id='external" + i + "' value='" + d.svcNum + "' duration='" + d.svcTime + "'>" + d.svcTitle + "</span><br>");
		        					console.log($("#externalServiceList"));
		        				});
		        			},
		        			error: function(){
		        				console.log("receive service list error");
		        			}
		        		});
						
						$.ajax({
							  url: '${pageContext.request.contextPath}/enterprise/retrieveCouponList.action',
							  dataType: 'json',
							  data: {'etpNum':${etpNum}},
							  success: function(data){
								  cpnList = [];
								  cpnList = data.couponList;
								  console.log(cpnList);
								  $("#cpnList").html('');
								  $("#cpnList").append("<option value='' disabled selected>선택하세요</option>");
								  $("#inputCpnCodeField").prop("disabled", true);
								  $.each(cpnList, function(i, d){
									  $("#cpnList").append("<option value='" + d.cpnNum + "' cpnRate=''>" + d.cpnTitle + "</option>");
								  });
							  },
							  error: function(){
								  console.log("coupon retrieval error!");
							  }
						  });
						  
					//----------------------------------------------------------------------------------//
					
					
					$("#inputStartTime").attr('value', start.format("MM월 DD일 a hh시 mm분"));
					document.getElementById("inputStartTimeHidden").value = start.toISOString();
					$("#inputEndTime").attr('value', end.format("MM월 DD일 a hh시 mm분"));
					document.getElementById("inputEndTimeHidden").value = end.toISOString();
					
					console.log($("#inputStartTime").attr('value'));
					console.log(document.getElementById("inputStartTimeHidden").value);
					console.log($("#inputEndTime").attr('value'));
					console.log(document.getElementById("inputEndTimeHidden").value);
	
					//$("#cpnList").off("click");
					$(document).on('change',"#cpnList",function(){
						console.log($("#cpnList").val());
						$("#inputCpnCodeField").prop("disabled", false);
						 cpnNum = $("#cpnList").val();
					});
					
					//$("#inputServiceList").off("change");
					$(document).on("change","#inputServiceList",function(){
						var x = $('#inputServiceList > option:selected').index();
						document.getElementById("inputDescription").value = svcDetailList[x-1].svcDescription;
						document.getElementById("inputPrice").value = svcDetailList[x-1].svcCost;
					});
					
					
					//---------------미완성!-------------------//	
					$(document).on('click',"#inputCpnCodeButtonGo",function(){
						cpnCodeInput = document.getElementById("inputCpnCodeField").value;
						console.log(cpnCodeInput);
						console.log(cpnNum);
						$.ajax({
							url: '${pageContext.request.contextPath}/enterprise/checkCoupon.action',
							data: {'coupon.cpnNum' : cpnNum,
								   'coupon.cpnCode' : cpnCodeInput},
							success: function(data){
									canUseCoupon = data.coupon.canUseCoupon;
								if(canUseCoupon){
									console.log(data);
									var cpnOK = data.coupon;
									console.log(cpnOK);
									document.getElementById('inputPrice').value = document.getElementById('inputPrice').value * (1-((cpnOK.cpnRate)/100)); 
								}else{
									console.log('say what?');
								}
							}, 
							error: function(request, status, error){
								console.log(request);
								console.log(status);
								console.log(error);
								console.log("can't apply coupon");
							}
						 });
				    });
		
					/* $('#insertModalBody').html('');
					$('#insertModalBody').html($("#inputDetailTable")); */
	
					//$("#insertModal").off("modal");
					$('#insertModal').modal('show');
						
						//-------------------------------------------//
							
				//-------------------------------- 폼에서 받은 값 대응하는 그릇에 집어 넣기. -------------------------//
						var inputTitle = $('#inputTitle').val();
						var colorTemp = 0;
						/* var inputDescription = $('#inputDescription').val(); */
						var inputStartTime = $('#inputStartTimeHidden').val();
						var inputEndTime = $('#inputEndTimeHidden').val();
						var inputServiceList = document.getElementById('inputServiceList').value;
						var inputEmployeeGender = ''; 
							if($('#genderCheckField').html() == '남성') {
								$('#genderCheckField').val('m');
								inputEmployeeGender = 'm';
							}else{
								$('#genderCheckField').val('f');
								inputEmployeeGender = 'f';
							}
							console.log(inputEmployeeGender);
							
						var inputStatus = $('#inputStatus').val();
							
						$("#inputStatus").change(function(){
							colorTemp = $(this).val();
						});
						var reservation = {};			
			
					$('#insertReservationBtnClose').off("click");
					$("#insertReservationBtnClose").click(function(e){
						location.reload();
					});
					
					$("#closingUpdateBtn, #closingInsertButton").click(function(){
						location.reload();
					});
							
				//----------------------------- Form 안의 값들을 Java로 보내는 기능 --------------------------------//
					
					$("#insertReservationBtn").click(function(revertFunc){					
						if($('#insertAgreementCheckbox').prop('checked') == false){
							alert('약관에 동의해 주셔야 합니다.');
							$('#insertModal').modal('hide');
							revertFunc();
							event.off();
							calendar.fullCalendar('unselect');
							return false;
						}
						
						//-----------------약관 동의하면 DB에 reservation 집어 넣자! -----------------//
						
						console.log(colorTemp);
						
						$.ajax({
							url: "${pageContext.request.contextPath}/enterprise/insertReservation.action",
							dataType: 'json',
							type: 'POST',
							data: $('#inputForm').serialize(),
							contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
							success: function(doc){
								$('#insertModal').modal('hide');
								var dors = doc.reservation;
								var pmtNum = 0;
								var paymentRecord = {};
								
								console.log(dors);
								var reservation = {
										"reservation.svcNum" : dors.svcNum,
										"reservation.cpnNum" : dors.cpnNum,
										"reservation.etpNum" : doc.reservation.etpNum,
										"reservation.etpEmail" : dors.etpEmail,
										"reservation.cstEmail" : dors.cstEmail,
										"reservation.rsvStatus" : dors.rsvStatus,
										"reservation.rsvTitle" : dors.rsvTitle,
										"reservation.start" : dors.start,
										"reservation.end": dors.end,
										"reservation.rsvDesc" : dors.rsvDesc,
										"reservation.rsvCost" : dors.rsvCost,
										"service.svcCost" : dors.service.svcCost
								};
								console.log(reservation);
								
								$.ajax({
									url: "${pageContext.request.contextPath}/enterprise/retrieveReservationFromOtherInfo.action",
									type: 'POST',
									async: false,
									data: reservation,
									success: function(data){
										console.log('retreiveReservationInfo Success!');
										console.log(data);
										console.log(data.reservation);
										paymentRecord = {
											"paymentRecord.rsvNum" : data.reservation.rsvNum,
											"paymentRecord.pmtAmount" : data.reservation.rsvCost
										};
									},error: function(request, status, error){
										console.log(request.status);
										console.log(status);
										console.log(error);
										console.log('retrieveReservationFromOtherInfo error!');
									}
								});
								
								//----------------예약 들어가면 일단 소비자 Payment Record에 입력 ---------------//
								// 이벤트 아이디는 받아올 수 있는게냐?
								console.log(paymentRecord);
								$.ajax({
									url:"${pageContext.request.contextPath}/customer/insertPaymentRecord.action",
									type: 'POST',
									async:false,
									data: paymentRecord,
									success: function(data){
										console.log('insertPaymentRecord success!');
										console.log(data);
										paymentRecordReceived = data.paymentRecord;
									},error: function(request, status, error){
										console.log("payment record insertion failed!");
										console.log(request.status);
										console.log(request);
										console.log(status);
										console.log(error);
									}
								});
								
								 
								//------------------Payment Record 입력 후 Sale Record에 입력 --------------//
								console.log(enterpriseInfo);
								console.log(paymentRecordReceived);
								var saleRecord = {
									"saleRecord.pmtNum" : paymentRecordReceived.pmtNum,
									"saleRecord.etpNum" : enterpriseInfo.responseJSON.enterprise.etpNum,
									"saleRecord.etpEmail" : enterpriseInfo.responseJSON.enterprise.etpEmail,
									"saleRecord.saleAmount" : paymentRecordReceived.pmtAmount
								};
								
								$.ajax({
									url:"${pageContext.request.contextPath}/enterprise/insertSaleRecord.action",
									type: 'POST',
									data: saleRecord, 
									success: function(data){
										$("#calendar").fullCalendar('removeEventSource', event);
										$('#calendar').fullCalendar('addEventSource', event);
										$('#calendar').fullCalendar('refetchEvents');
										$('#calendar').fullCalendar('rerenderEvents');
									},
									error:function(request, status, error){
										console.log("sale record insertion failed!");
										console.log(request.status);
										console.log(request);
										console.log(status);
										console.log(error);
									}
								});
							},
							error: function(doc){
								console.log("insert Error");
							}
						});
						$(this).unbind();
						calendar.fullCalendar('unselect');
					});
				}
			},
				
				//------------------------------ insert 마무리 작업  -----------------------------------//
				
				themeButtonIcons: {
					prev: 'circle-triangle-w',
					next: 'circle-triangle-e'
				},
				weekNumbers: true,
				fixedWeekCount: true,
				slotLabelFormat: 'a h(:mm)시',
				contentHeight: 600,
				editable: true,
				eventLimit: true,
				timezone: false,
				selectble: false,
				selectHelper: true,
				googleCalendarApiKey: 'AIzaSyB0_Qo7SZ6u722nhCjpKzjrHJ2gPWr_cTA',
				
				//------------------------------------- 각 사업자당 예약들 불러오는 기능  -------------------------------------------//
				eventSources: [
				              //사업자가 한 예약 가져오기~!
				             	{
				             		backgroundColor: '#DCD',
				      				textColor: 'black',
				            		events: function(start, end, timezone, callback){
					      				$.ajax({
					      					url: '${pageContext.request.contextPath}/enterprise/retrieveReservations.action',
					      					type: 'POST',
					      					data: {"etpNum":${etpNum}},
					      					dataType: 'json',
					      					success: function(doc, index, value){			
					      						var resList = doc.reservationList;
					      						var events = [];
					      						
					      						$(resList).each(function(index,item){
					      							events.push({
					      								id: item.rsvNum,
					      								start: item.start,
					      								end: item.end,
					      								title: item.rsvTitle,
					      								timezone: false,
					      								rendering: event.rendering,
					      								svcNum: item.svcNum,
					      								cpnNum: item.cpnNum,
					      								etpNum: item.etpNum,
					      								etpEmail: item.etpEmail,
					      								cstEmail: item.cstEmail,
					      								startDate: item.rsvStartDate,
					      								endDate: item.rsvEndDate,
					      								status: item.rsvStatus,
					      								employeeGender: item.employeeGender,
					      								description : item.rsvDesc,
					      								rsvCost: item.rsvCost,
					      								
					      								etpOwner: item.enterprise.etpOwner,
					      								etpSuperclass: item.enterprise.etpSuperclass,
					      								etpAddress: item.enterprise.etpAddress,
					      								etpZipcode: item.enterprise.etpZipcode,
					      								etpTitle: item.enterprise.etpTitle,
					      								etpPhone: item.enterprise.etpPhone,
					      								etpMaleStaff: item.enterprise.etpMaleStaff,
					      								etpFemaleStaff: item.enterprise.etpFemalStaff,
					      								etpCapacity: item.enterprise.etpCapacity,
					      								etpRsvDeadline: item.enterprise.etpRsvDeadline,
					      								etpSelfNotification: item.enterprise.etpSelfNotification,
					      								etpCstNotification: item.enterprise.etpCstNotification,
					      								//etpTemplateType: item.enterprise.etpTemplateType,
					      								etpThemeType: item.enterprise.etpThemeType,
					      								etpSvcOffered: item.enterprise.etpSvcOffered,
					      								etpSubclass: item.enterprise.etpSubclass,
					      								etpSpecialize: item.enterprise.specialize,
					      								etpDescription: item.enterprise.etpDescription,
					      								
					      								svcTitle: item.service.svcTitle,
					      								svcCost: item.service.svcCost,
					      								svcDescription: item.service.svcDescription,
					      								svcCategory: item.service.svcCategory,
					      								svcSpecialize: item.service.svcSpecialize,
					      								svcCount: item.service.svcCount,
					      								svcCode: item.service.Code,
					      							});
					      						});
					      						callback(events);				      				
					      					},
					      					error: function(doc){
					      						console.log("Error");
					      					}
					      				});
				      				} 
							}
				            ,{
				            	googleCalendarId: "ko.south_korea#holiday@group.v.calendar.google.com",
				            	//googleCalendarId: '1fl6hu36lp3f7334i5fq10g18g@group.calendar.google.com',
				                className: 'holidays',
				                color: 'red',
				               // backgroundColor:'red',
				                borderColor:'green',
				                textColor:'gray',
				                timezone: false,
				                editable: false,
				                //rendering: 'background',
				                //allDay: false,
				                overlap: false
							}
						]
				,
				eventDrop: function(event, delta, revertFunc, jsEvent, view) {
					$(this).unbind();
					if (!confirm("시간대를 변경하시겠습니까?")) {
						revertFunc();
					}else{
						var reservation = {
							"reservation.rsvNum" : event.id, 
							"reservation.rsvTitle": event.description,
							"reservation.start" : event.start.toISOString(),
							"reservation.end" : event.end.toISOString(),
						}
						
						console.log(reservation);
	
						$.ajax({
							url: '${pageContext.request.contextPath}/enterprise/changeReservationTime.action',
							dataType: 'json',
							data: reservation,
							contentType: 'application/json',
							success: function(data){
								alert('시간대가 변경되었습니다.');
								$('#calendar').fullCalendar('refetchEvents');
							},
							error: function(){
								console.log('fail!');						
							}
						});
					}
					$('#calendar').fullCalendar('unselect');
					//$('#calendar').fullCalendar('addEventSource', event);
					$('#calendar').fullCalendar('rerenderEvents');
					 
				},
				eventResize: function(event, delta, revertFunc, jsEvent, ui, view){
					$(this).unbind();
					if(! confirm("시간대를 변경하시겠습니까?")){
						revertFunc();
					}else{
						var reservation = {
								"reservation.rsvNum" : event.id, 
								"reservation.rsvTitle": event.description,
								"reservation.start" : event.start.toISOString(),
								"reservation.end" : event.end.toISOString(),
							}
						
						console.log(reservation);
						$.ajax({
							url: '${pageContext.request.contextPath}/enterprise/changeReservationTime.action',
							dataType: 'json',
							data: reservation,
							contentType: 'application/json',
							success: function(data){
								alert('success!');
								//$('#calendar').fullCalendar('removeEvents');
								//$('#calendar').fullCalendar('addEventSource', event);
								$('#calendar').fullCalendar('refetchEvents');
							},
							error: function(){
								console.log('fail!');
								
							}
						});
					}
					$('#calendar').fullCalendar('unselect');
				},
			 	eventDragStop: function(event, jsEvent, ui, view){
					console.log(currentMousePos);
					
					var isElementOverDiv = function(){
						var trashEl = $('#trash');
						var ofs = trashEl.offset();
						console.log(ofs);
						console.log(trashEl);
					    var x1 = ofs.left;
					    var x2 = ofs.left + trashEl.outerWidth(true);
					    var y1 = ofs.top;
					    var y2 = ofs.top + trashEl.outerHeight(true);
					   	
					    if (currentMousePos.x>=x1 && currentMousePos.x<=x2 && currentMousePos.y>=y1 && currentMousePos.y<=y2) {
					    	
					    	return true;
					    }else{
							return false;
					    }
					}
					console.log(event);
					if(isElementOverDiv()){
						if(confirm('지우시겠습니까?')){
							$.ajax({
								url: '${pageContext.request.contextPath}/enterprise/deleteReservation.action',
								dataType: 'json',
								data: {"reservation.rsvNum" : event.id},
								contentType: 'application/json',
								success: function(data){
									alert('삭제되었습니다.');
									//$('#calendar').fullCalendar('removeEvents');
									//$('#calendar').fullCalendar('addEventSource', event);
									$('#calendar').fullCalendar('refetchEvents');
								},
								error: function(){
									console.log("deletion error");
								},
							});
						};
					};
					$('#calendar').fullCalendar('unselect');
				},
				drop: function(date, jsEvent, ui){
					alert(date);
				}
			});
			
			$(function(){
				$("#external-events .fc-event").draggable({
					revert: true,
					revertDuration : 0
				});
			});
		}
	});
	
</script>

</head>
<body>
	<jsp:include page="/jsp/Header.jsp"></jsp:include>
	<h1>예약 스케쥴러(테스팅 중)</h1>
	<br>
	<div>
		<a href="${pageContext.request.contextPath}/toMainPage.action"><button class="btn btn-info" >메인 메뉴로</button></a>
		<!-- enterprise 값을 action으로 다 넘겨야 할듯? 아니면 적어도 이메일이랑 템플릿 타입이라도. -->
		<a href="takeEtp.action?etpNum=<s:property value='#session.loginEtpNum'/>"><button class="btn btn-primary">사업자 메뉴로</button></a>
		<a href="${pageContext.request.contextPath}/highchart1.action?etpEmail=<s:property value="#session.loginId"/>"><button class="btn btn-primary">통계</button></a>
	</div>
	<div id='external-events'>
		<input type="hidden" id="starttt" />
		<input type="hidden" id="endtt" />
    	<div class="nav nav-tabs nav-stacked" data-spy="affix" data-offset-top="195">
    		<div>
	      		<img src="${pageContext.request.contextPath}/image/trash-can1.jpg" class="img-thumbnail" id="trash" alt="쓰레기통" style="width: 100px; height: 100px;">
	      		<div id="externalServiceList" class="external-events"></div>
      		</div>
      		
    	</div>
	</div>
	<div id='calendar' class='container'></div>
	<br><br><br><br><br><br><br><br><br><br><br>
	
	
	<div id="insertModal" class="modal fade">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" id="closingInsertButton"><span aria-hidden="true">×</span> <span class="sr-only">close</span></button>
	                <h4 id="insertModalTitle" class="modal-title"></h4>
	            </div>
		            <div id="insertModalBody" class="modal-body">
		            
		            	<form action='test' id='inputForm' data-toggle='validator' role='form'>
		            		<table class='table table-striped table-bordered' id="inputDetailTable">
								<tr>
									<td><label for='inputTitle' class='control-label'>일정 제목: </label></td>
									<td><input type='text' id='inputTitle' name='reservation.rsvTitle' required class='form-control'></td>
								</tr>
								
								<tr>
									<td><label for='inputServiceList' class='control-label'>서비스 선택: </label></td>
									<td><select id="inputServiceList" name='reservation.svcNum' class="form-control" required></select></td>
								</tr>
								
								<tr>
									<td><label for="inputCpnCodeButtonShow" class="control-label">쿠폰 적용: </label></td>
									<td>
										<select id="cpnList" class="form-control" name='reservation.cpnNum' required></select>
										<input type="text" id="inputCpnCodeField" name="coupon.cpnCode" class="form-control"/>
										<button id="inputCpnCodeButtonGo" class="btn btn-warning">쿠폰 적용</button>
										
									</td>
								</tr>
								
								<tr>
									<td><label for='inputDescription' class='control-label'>서비스 Description: </label></td>
									<td><input type='text' id='inputDescription' name='reservation.service.svcDescription' readonly class='form-control'/><span class='glyphicon form-control-feedback' aria-hidden='true'></span>
								</tr>
								
								<tr>
									<td><label for='inputStartTime' class='control-label'>서비스 시작 시간: </label></td>
									<td><input type='text' id='inputStartTime' value='' readonly class='form-control'/><input type='hidden' name='reservation.start' id='inputStartTimeHidden' value=''/></td>
								</tr>
								
								<tr>
									<td><label for='inputEndTime' class='control-label'>서비스 끝 시간: </label></td>
									<td><input type='text' id='inputEndTime' value='" + end.format("MM월 DD일 a hh시 mm분") + "' readonly class='form-control'/><input type='hidden' name='reservation.end' id='inputEndTimeHidden' value=''/></td>
								</tr>
									<!-- 서비스 버튼 클릭시 받아오는 값이 된다 : 서비스 비용 -->
								<tr>
									<td><label for='inputPrice' class='control-label'>결제금: </label></td>
									<td><input type='text' id='inputPrice' name='reservation.rsvCost' readonly class='form-control'/></td>
								</tr>
								
								<tr>
									<td><label for='inputCstEmail' class='control-label'>고객 이메일 주소: </label></td>
									<td><input type='text' id='inputPrice' name='reservation.cstEmail' required class='form-control'/></td>
								</tr>
								<!-- 성별 -->
								<tr>
									<td><label for='inputEmployeeGenderCheckBox' class='control-label'>희망 종업원 성별: </label></td>
									<td><input type='checkbox' checked data-toggle='toggle' data-on='"여성"' data-off='"남성"' data-onstyle='primary' data-offstyle='warning' id='inputEmployeeGenderCheckBox' class='form-control'/></td>
								</tr>
								
								<tr>
									<td><label for="inputStatus">예약 상태</label></td>
									<td>
									<select name='reservation.rsvStatus' id="inputStatus" class="form-control">
										<option value="0">예약 컨펌 미정</option>
										<option value="1">예약 경과(실행됨)</option>
										<option value="2">예약 경과(실행 되지 않음)</option>
										<option value="3">휴일</option>
									</select>
									</td>
								</tr>
								<tr>
								<td colspan='2' align='center'><textarea rows='4' cols='50' id='insertRsvDesc' class='form-control' name="reservation.rsvDesc" placeholder="예약 관련 메모란"></textarea></td>
								</tr>
						
								<tr>
									<td colspan='2' align='center'><textarea rows='4' cols='50' id='insertAgreementTextArea' class='form-control'>이용약관입니다. </textarea></td>
								</tr>
								
								<tr>
									<td align='center' colspan='2'>서비스 약관에 동의합니다.<input type='checkbox' id='insertAgreementCheckbox'/></td>
								</tr>
								
							</table>
							<input type='hidden' id='genderCheckField' name='reservation.employeeGender' value=''>
							<input type="hidden" id='templateType' name='enterprise.etpTemplateType' value=''>
						</form>
		            	
		            	<div class="hidden">
		            	*메뉴: <span id="insertModalEventTitle"> </span><br>
		   	 			*예약 시작: <span id="insertModalStartTime"> </span><br>
		   				*예약 소요시간:<span id="insertModalDuration"> </span><br>
		   				*쿠폰 :<span id="insertModalCoupon"> </span><br>
		   				*총 결제금:<span id="insertModalPrice"> </span><br>
		   				<span id="insertModalCheckBox"></span>예약 수정/ 취소 관련 주의사항<br>
		   				<span id="insertModalTextArea"></span><br>
		   				<p id="insertModalEventInfo"></p>
		   				</div>
		   				<hr>
		   				<br>
		            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" id="insertReservationBtnClose">Close</button>
	                <button class="btn btn-primary" id="insertReservationBtnOneClick">One-click 예약</button>
	                <button class="btn btn-info" id="insertReservationBtn">예약 결제</button>
	            </div>
	        </div>
		</div>
	</div>
	
	
	<div id="updateModal" class="modal fade">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" id="closingUpdateBtn"><span aria-hidden="true">×</span> <span class="sr-only">close</span></button>
	                <h4 id="updateModalTitle" class="modal-title"></h4>
	            </div>
	            <div id="updateModalBody" class="modal-body">
	            	<table class="table table-condensed">
	            		<tr>
	            			<td><label for="updateModalEventId">예약 일련번호:</label></td>
	            			<td><span id="updateModalEventId"></span></td>
	            		</tr>
		            	<tr>
		            		<td><label for="updateModalStartTime">시작 시간:</label></td>
		            		<td><span id="updateModalStartTime" data-dismiss="modal"></span></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalEndTime">종료 시간:</label></td>
		            		<td><span id="updateModalEndTime"></span></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalCustomerEmail">회원 이메일:</label></td>
		            		<td><span id="updateModalCustomerEmail"></span></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalCustomerName">회원 이름:</label></td>
		            		<td><p id="updateModalCustomerName"></p></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalCustomerPhone">회원 전화번호:</label></td>
		            		<td><p id="updateModalCustomerPhone"></p></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalSvcTitle">서비스 명:</label></td>
		            		<td><span id="updateModalSvcTitle"></span></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalSvcCost">서비스 가격:</label></td>
		            		<td><span id="updateModalSvcCost"></span></td>
		            	</tr>
		            	<tr>
		            		<td><label for="reservationCost">결제 가격:</label></td>
		            		<td><span id="reservationCost"></span></td>
		            	</tr>
		            	<tr>
		   					<td><label for="reservationUpdateDescription">서비스 상세 설명:</label>
		   					<td><span id="reservationUpdateDescription"></span></td>
		   				</tr>
		   				<tr>
		   					<td><label for="reservationDescription2">예약 메모:</label></td>
		   					<td><span id="reservationDescription2"></span></td>
		   				</tr>
		            	<!-- TODO: 여기에 HTML 에디터 넣기!!!!! -->
	   				</table>
	   				<hr>
	   				<div id="reservationUpdateField" class="form-group">
 	   					<div class="panel" id="reservationUpdateBody" >
	 	   					<table class="table table-condensed">
		   						<!-- TODO: 그 업체가 제공하는 서비스 목록을 AJAX로 받아오고, select로 뿌려주고,  -->
		   						<tr>
		   							<td><label for="reservationUpdateTitle">예약건 제목을 변경해 주세요:</label>
		   							<td><input type="text" id="reservationUpdateTitle" class="form-control"></input></td>
		   						</tr>
		   						<tr>
		   							<td><label for="reservationUpdateSelectService">변경하실 서비스를 선택해 주세요:</label></td>
		   							<td><select id="reservationUpdateSelectService" class="form-control"></select></td>
		   						</tr>
		   						<tr>
		   							<td><label for="reservationUpdateDescription2">메모 내역을 변경해 주세요:</label></td>
		   							<td><textarea id="reservationUpdateDescription2" class="form-control"></textarea></td>
		   						</tr>
		   					</table>
	   					</div>
	   				</div>
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal" id="closeReservationBtn">Close</button>
	               	<button class="btn btn-primary" id="updateReservationShowBtn">예약 정보 수정란 활성화</button>
	               	<button class="btn btn-warning" id="updateReservationBtnGo">예약 정보 수정 확인</button>
	            </div>
	        </div>
		</div>
	</div>
</body>
</html>