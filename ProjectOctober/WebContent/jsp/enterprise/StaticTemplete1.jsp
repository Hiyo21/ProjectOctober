<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>      
  
<!DOCTYPE html>
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Static Templete 1</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script>
	$(document).ready(function(){
	    $(".nav-tabs a").click(function(){
	        $(this).tab('show');
	    });
	    $('.nav-tabs a').on('shown.bs.tab', function(event){
	        var x = $(event.target).text();         // active tab
	        var y = $(event.relatedTarget).text();  // previous tab
	        $(".act span").text(x);
	        $(".prev span").text(y);
	    });
	});
	
	$(function () {
	    $('#container').highcharts({
	    	chart: {
	            polar: true,
	            type: 'line'
	        },

	        title: {
	            text: '종합 고객 평가',
	            x: -80
	        },

	        pane: {
	            size: '80%'
	        },

	        xAxis: {
	            categories: ['청결', '가격', '분위기', '서비스', '기술'],
	            tickmarkPlacement: 'on',
	            lineWidth: 0
	        },

	        yAxis: {
	            gridLineInterpolation: 'polygon',
	            lineWidth: 0,
	            min: 0,
	            max: 5
	        },

	        tooltip: {
	            shared: true
	        },

	        legend: {
	            align: 'right',
	            verticalAlign: 'top',
	            y: 70,
	            layout: 'vertical'
	        },

	        series: [{
	        	type: 'area',
	            name: '종합 고객 평가',
	            data: [3, 4, 5, 3, 4],
	            pointPlacement: 'on'
	        }]

	    });
	});
</script>



</head>

<body>
<s:include value="../Header.jsp"></s:include>

<div class="page">

<!-- Save버튼 -->
<div class="navbar-header">
	<a class="btn btn-primary btn-lg" href="#" role="button" onclick="saveCP()">Save &raquo;</a>
</div>

	<div class="container">
		<div id="top">
			<div class="row">
				<div class="col-md-3">
				<div id='logoCP' class='panel panel-success'>
				  	<div class="panel-body">
				    	<img src="http://orig10.deviantart.net/2e58/f/2013/288/b/9/leaf_png_by_iheartsnsdforever-d6qjxl2.png" width="100px">
				    	<span>NatureMassage</span>
				  	</div>
				</div>
					<span class="label label-primary">특징1</span>
					<span class="label label-primary">특징2</span>
					<span class="label label-primary">특징3</span>
					<br><br>
				</div>
				<div class="col-md-5">
				<div id='outLineCP' class='panel panel-success'>
				  	<div class="panel-body">
				    	<p>OutLine Component</p>
				  	</div>
				</div>
				</div>
				<div class="col-md-4" id="eptBT">
					<div class="row">
						<div class="col-md-4">
						<button type="button" class="btn btn-danger btn-lg" id="rsvBT" style="width: 110px">예약 관리</button>
						</div>
						<div class="col-md-4">
						<button type="button" class="btn btn-success btn-lg" id="miscSetBT" style="width: 110px">기타설정</button>
						</div>
					</div>
				</div>
			</div>
			
			<ul class="nav nav-tabs">
	            <li role="presentation" class="active"><a href="#infoCP">업체 정보</a></li>
	            <li role="presentation"><a href="#svcListCP">서비스 메뉴</a></li>
	            <li role="presentation"><a href="#galCP">갤러리</a></li>
	            <li role="presentation"><a href="#locationCP">오시는 길</a></li>
	            <li role="presentation"><a href="#reviewCP">고객 평가</a></li>
	        </ul>
			<div class="tab-content">
				<div id="infoCP" class="tab-pane fade in active">
					<div class="panel panel-default">
						<div class="row">
						<div class="col-md-4">
							<img src="http://mitsuraku.jp/files/photo/shop_top/7783/d950abc0aa7f062979756ae893d8824f.JPG?1429694028" class="img-responsive">
						</div>
						<div class="col-md-8">
							<h2>내용내용내용내용소개소개소개소개</h2>
						</div>
						</div>
					</div>
				</div>
  				<div id="svcListCP" class="tab-pane fade">
  					<div class="panel panel-success">
					  	<div class="panel-heading">
					    	서비스 메뉴 1
					  	</div>
					  	<table class="table">
					  		<tr>
					  			<td>
					  				서비스 타이틀
					  			</td>
					  			<td>
					  				서비스 상세 내용(시간, 금액)
					  			</td>
					  			<td>
					  				<button type="button" class="btn btn-success btn-md" id="rsvBT" style="width: 100px">예약 하기</button>
					  			</td>
					  		</tr>
					  		<tr>
					  			<td>
					  				서비스 타이틀
					  			</td>
					  			<td>
					  				서비스 상세 내용(시간, 금액)
					  			</td>
					  			<td>
					  				<button type="button" class="btn btn-success btn-md" id="rsvBT" style="width: 100px">예약 하기</button>
					  			</td>
					  		</tr>
					  		<tr>
					  			<td>
					  				서비스 타이틀
					  			</td>
					  			<td>
					  				서비스 상세 내용(시간, 금액)
					  			</td>
					  			<td>
					  				<button type="button" class="btn btn-success btn-md" id="rsvBT" style="width: 100px">예약 하기</button>
					  			</td>
					  		</tr>
 						</table>					
					</div>	
					<div class="panel panel-success">
					  	<div class="panel-heading">
					    	서비스 메뉴 2
					  	</div>
					  	<table class="table">
					  		<tr>
					  			<td>
					  				서비스 타이틀
					  			</td>
					  			<td>
					  				서비스 상세 내용(시간, 금액)
					  			</td>
					  			<td>
					  				<button type="button" class="btn btn-success btn-md" id="rsvBT" style="width: 100px">예약 하기</button>
					  			</td>
					  		</tr>
					  		<tr>
					  			<td>
					  				서비스 타이틀
					  			</td>
					  			<td>
					  				서비스 상세 내용(시간, 금액)
					  			</td>
					  			<td>
					  				<button type="button" class="btn btn-success btn-md" id="rsvBT" style="width: 100px">예약 하기</button>
					  			</td>
					  		</tr>
					  		<tr>
					  			<td>
					  				서비스 타이틀
					  			</td>
					  			<td>
					  				서비스 상세 내용(시간, 금액)
					  			</td>
					  			<td>
					  				<button type="button" class="btn btn-success btn-md" id="rsvBT" style="width: 100px">예약 하기</button>
					  			</td>
					  		</tr>
 						</table>					
					</div>	
				</div>
  				<div id="galCP" class="tab-pane fade">
    				<div class="panel panel-default">
						<h1>갤러리</h1>
						<div class="container"> 
							<div class="row"> 
								<div class="col-md-4"> 
									<a><img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive"></a> 
									<h3>A title</h3> <p>내용</p>
								</div>
								<div class="col-md-4"> 
									<a><img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive"></a> 
									<h3>A title</h3> <p>내용</p>
								</div>
								<div class="col-md-4"> 
									<a><img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive"></a> 
									<h3>A title</h3> <p>내용</p>
								</div>
							</div>
						</div>
					</div>
  				</div>
  				<div id="locationCP" class="tab-pane fade">
    				<div class="panel panel-default">
    					<div class="row">
    						<div class="col-md-6">
								<img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Seoul,Mali&amp;zoom=12&amp;size=400x400&amp;sensor=false">
							</div>
							<div class="col-md-6">
								<h1>오시는 길</h1>
							</div>
						</div>
					</div>
  				</div>
  				<div id="reviewCP" class="tab-pane fade">
    				<div class="panel panel-default">
						<div class="row">
							<div class="col-md-6" id="container" style="min-width: 400px; max-width: 600px; height: 600px; margin: 0 auto"></div>
							<div class="col-md-5"><h1>종합평가 점수 / 정보</h1></div>
						</div>
						<div class="row">
							<table class="table table-striped" style="max-width: 1000px;">
								<tr>
									<td rowspan="2" style="vertical-align: middle;">글쓴이</td>
									<td>코멘트코멘트코멘트코멘트코멘트</td>
								</tr>
								<tr>
									<td>
										<p>종합 점수 : 넣어라</p>
										<table>
										<tr>
										<td>
										<label class="radio-inline">청결</label>
										</td>
										<td>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 1
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 2
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 3
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 4
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 5
										</label>
										</td>
										<td>
										<label class="radio-inline">가격</label>
										</td>
										<td>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 1
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 2
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 3
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 4
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 5
										</label>
										</td>
										</tr>
										
										<tr>
										<td>
										<label class="radio-inline">분위기</label>
										</td>
										<td>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 1
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 2
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 3
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 4
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 5
										</label>
										</td>
										<td>
										<label class="radio-inline">서비스</label>
										</td>
										<td>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 1
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 2
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 3
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 4
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 5
										</label>
										</td>
										
										<td>										
										<label class="radio-inline">기술</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 1
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 2
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 3
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 4
										</label>
										<label class="radio-inline">
											<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 5
										</label>
										</td>
										</tr>	
										</table>
									</td>
								</tr>
							</table>	
						</div>
					</div>
  				</div>
			</div>
	</div>
</div>	
</div>

<!-- Highchart -->
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
</body>
</html>