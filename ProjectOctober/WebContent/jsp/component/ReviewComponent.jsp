<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   	<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<script type="text/javascript">
$(function () {
    $('#chart').highcharts({
    	chart: {
            polar: true,
            type: 'line',
            backgroundColor: 'transparent'
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
<div class="container-fluid">
	<div class="panel panel-default" id="review"> 
		<div class="row">
			<div class="col-md-6" id="chart" style="min-width: 200px; max-width: 400px; height: 400px; margin: 0 auto">
						
			</div>
			<div class="col-md-5"><h1>종합평가 점수 / 정보</h1></div>
		</div> <!-- row1 end -->
		<div class="row">
			<div class="container-fluid">
			
			<form name="customerEvaluation" action="${pageContext.request.contextPath}/customer/customerEvaluation.action" method="post">
			
			<input type="hidden" name="review.etpNum" value="${etpNum}">			
			<table class="table table-striped" style="max-width: 1000px;">
				<tr>
					<th rowspan="14" style="vertical-align: middle">평가 요소</th>					
					<th colspan="6">코멘트 : <s:textfield size="80" /></th>					
				</tr>				
				<tr>
					<td>
						<label>■직업</label>
					</td>
				</tr>
				<tr>
					<td>
						<label class="radio-inline">
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="회사원"> 회사원
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="학생"> 학생
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="전문직"> 전문직
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="프리랜서"> 프리랜서
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="주부"> 주부
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="기타"> 기타
						</label>
					</td>
				</tr>	
				<tr>
					<td>
						<label>■청결</label>
					</td>
				</tr>
				<tr>
					<td>						
						<label class="radio-inline">
							<input type="radio" name="review.rvwHygiene" id="inlineRadio1" value="1"> 1
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwHygiene" id="inlineRadio2" value="2"> 2
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwHygiene" id="inlineRadio3" value="3"> 3
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwHygiene" id="inlineRadio4" value="4"> 4
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwHygiene" id="inlineRadio5" value="5"> 5
						</label>
					</td>
				</tr>
				<tr>
					<td>
						<label>■가격</label>
					</td>
				</tr>	
				<tr>	
					<td>
						<label class="radio-inline">
							<input type="radio" name="review.rvwComfort" id="inlineRadio1" value="1"> 1
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwComfort" id="inlineRadio2" value="2"> 2
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwComfort" id="inlineRadio3" value="3"> 3
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwComfort" id="inlineRadio4" value="4"> 4
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwComfort" id="inlineRadio5" value="5"> 5
						</label>
					</td>
				</tr>
						
				<tr>
					<td>
						<label>■분위기</label>
					</td>
				</tr>	
				<tr>	
					<td>
						<label class="radio-inline">
							<input type="radio" name="review.rvwTechnique" id="inlineRadio1" value="1"> 1
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwTechnique" id="inlineRadio2" value="2"> 2
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwTechnique" id="inlineRadio3" value="3"> 3
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwTechnique" id="inlineRadio4" value="4"> 4
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwTechnique" id="inlineRadio5" value="5"> 5
						</label>
					</td>
				<tr>
					<td>
						<label>■서비스</label>
					</td>
				</tr>
				<tr>	
					<td>
						<label class="radio-inline">
							<input type="radio" name="review.rvwPrice" id="inlineRadio1" value="1"> 1
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwPrice" id="inlineRadio2" value="2"> 2
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwPrice" id="inlineRadio3" value="3"> 3
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwPrice" id="inlineRadio2" value="4"> 4
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwPrice" id="inlineRadio3" value="5"> 5
						</label>
					</td>
				</tr>
				
				<tr>
					<td>										
						<label>■기술</label>
					</td>
				</tr>
				<tr>
					<td>
						<label class="radio-inline">
							<input type="radio" name="review.rvwService" id="inlineRadio1" value="1"> 1
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwService" id="inlineRadio2" value="2"> 2
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwService" id="inlineRadio3" value="3"> 3
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwService" id="inlineRadio2" value="4"> 4
						</label>
						<label class="radio-inline">
							<input type="radio" name="review.rvwService" id="inlineRadio3" value="5"> 5
						</label>
						
					</td>
					
				</tr>			
				
			</table>
			<input type="submit" value="평가">
			
			</form>
			</div>	
		</div> <!-- row2 end -->
	</div>
</div>

<!-- Highchart -->
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>

</body>
</html>