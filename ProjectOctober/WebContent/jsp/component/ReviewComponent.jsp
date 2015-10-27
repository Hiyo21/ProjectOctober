<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Highchart -->
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>

<script type="text/javascript">


$(function(){	
    $('#chart').highcharts({
    	chart: {
            polar: true,
            type: 'line',
            backgroundColor: 'transparent'
        },

        title: {
            text: '업체 평점',
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
        
        tooltip: {
            valueDecimals: 2
        },

        series: [{
            name: '이용자 평가',
            data: [
                   <s:iterator value="gunList">
                   		<s:property value="average2"/>,
                   		<s:property value="hygiene2"/>,
                   		<s:property value="comfort2"/>,
                   		<s:property value="technique2"/>,
                   		<s:property value="price2"/>,
                   		<s:property value="service2"/>
                   </s:iterator>
                  ]
        }]
    });
});
   
</script>
</head>


<body>
<div class="container">
		<div class="row">
			<div class="col-md-6" align="center">
				<h1>종합평가 점수 / 정보</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6" id="chart" style="min-width: 200px; max-width: 400px; height: 400px; margin: 0 auto;" align="center">
				
			</div>
		</div>
	<s:if test="#session.memCode == 1">
		<div>
			<table class="table table-row table-hover">
				<tr>
					<th>이용자 email</th>
					<th>이용자 코멘트</th>
					<th>작성일</th>
					<th>청결함</th>
					<th>편안함</th>
					<th>기술</th>
					<th>가격대</th>
					<th>서비스</th>
				</tr>
				<s:iterator value="reviewList">
				<tr>
					<td><s:property value="cstEmail"/></td>
					<td><s:property value="rvwContent"/></td>
					<td><s:property value="rvwInputDate"/></td>
					<td><s:property value="rvwHygiene"/></td>
					<td><s:property value="rvwComfort"/></td>
					<td><s:property value="rvwTechnique"/></td>
					<td><s:property value="rvwPrice"/></td>
					<td><s:property value="rvwService"/></td>
				</tr>
				</s:iterator>
			</table>
		</div>
	</s:if>
</div>



<s:if test="#session.memCode == 2">
		<form name="customerEvaluation" id="customerEvaluation" action="${pageContext.request.contextPath}/customer/customerEvaluation.action" method="post">
			<input type="hidden" name="review.etpEmail" value="${enterprise.etpEmail}">
			<input type="hidden" name="review.etpNum" value="${etpNum}">	
					
				
				<table class="table table-striped">					 	
					<tr>
						<td><label>■리뷰 : </label></td>					
						<td><input type="text" size="100" name="review.rvwContent"	></td>				
					</tr>				
					<tr>
						<td><label>■직업</label></td>
						<td><input type="radio" name="review.cstJob" id="inlineRadio1" value="회사원"> 회사원
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="학생"> 학생
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="전문직"> 전문직
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="프리랜서"> 프리랜서
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="주부"> 주부
							<input type="radio" name="review.cstJob" id="inlineRadio1" value="기타"> 기타							
						</td>
					</tr>
						
					<tr>
						<td>
							<label>■청결</label>
						</td>
						<td><input type="radio" name="review.rvwHygiene" id="inlineRadio1" value="1"> 1
							<input type="radio" name="review.rvwHygiene" id="inlineRadio2" value="2"> 2
							<input type="radio" name="review.rvwHygiene" id="inlineRadio3" value="3"> 3
							<input type="radio" name="review.rvwHygiene" id="inlineRadio4" value="4"> 4
							<input type="radio" name="review.rvwHygiene" id="inlineRadio5" value="5"> 5							
						</td>
					</tr>				
					<tr>
						<td>
							<label>■가격</label>
							<td><input type="radio" name="review.rvwComfort" id="inlineRadio1" value="1"> 1
								<input type="radio" name="review.rvwComfort" id="inlineRadio2" value="2"> 2
								<input type="radio" name="review.rvwComfort" id="inlineRadio3" value="3"> 3
								<input type="radio" name="review.rvwComfort" id="inlineRadio4" value="4"> 4
								<input type="radio" name="review.rvwComfort" id="inlineRadio5" value="5"> 5							
						</td>			
					</tr>					
							
					<tr>
						<td>
							<label>■분위기</label>				
						</td>
							<td><input type="radio" name="review.rvwTechnique" id="inlineRadio1" value="1"> 1
								<input type="radio" name="review.rvwTechnique" id="inlineRadio2" value="2"> 2
								<input type="radio" name="review.rvwTechnique" id="inlineRadio3" value="3"> 3
								<input type="radio" name="review.rvwTechnique" id="inlineRadio4" value="4"> 4
								<input type="radio" name="review.rvwTechnique" id="inlineRadio5" value="5"> 5							
						</td>				
					</tr>					
					<tr>
						<td><label>■서비스</label></td>
							<td><input type="radio" name="review.rvwPrice" id="inlineRadio1" value="1"> 1
							<input type="radio" name="review.rvwPrice" id="inlineRadio2" value="2"> 2
							<input type="radio" name="review.rvwPrice" id="inlineRadio3" value="3"> 3
							<input type="radio" name="review.rvwPrice" id="inlineRadio2" value="4"> 4
							<input type="radio" name="review.rvwPrice" id="inlineRadio3" value="5"> 5							
						</td>					
					</tr>				
					
					<tr>
						<td>										
							<label>■기술</label>
						</td>
							<td><input type="radio" name="review.rvwService" id="inlineRadio1" value="1"> 1
							<input type="radio" name="review.rvwService" id="inlineRadio2" value="2"> 2
							<input type="radio" name="review.rvwService" id="inlineRadio3" value="3"> 3
							<input type="radio" name="review.rvwService" id="inlineRadio2" value="4"> 4
							<input type="radio" name="review.rvwService" id="inlineRadio3" value="5"> 5		
						</td>
						
					</tr>			
				</table>
				<center><input type="submit" value="평가"></center><br> 
				</form>
				<!-- row2 end -->
	
	

</s:if>

<!-- Highchart -->
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>

<script type="text/javascript">


$(function(){	
    $('#chart').highcharts({
    	chart: {
            polar: true,
            type: 'line',
            backgroundColor: 'transparent'
        },

        title: {
            text: '업체 평점',
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
        
        tooltip: {
            valueDecimals: 2
        },

        series: [{
            name: '이용자 평가',
            data: [
                   <s:iterator value="gunList">
                   		<s:property value="average2"/>,
                   		<s:property value="hygiene2"/>,
                   		<s:property value="comfort2"/>,
                   		<s:property value="technique2"/>,
                   		<s:property value="price2"/>,
                   		<s:property value="service2"/>
                   </s:iterator>
                  ]
        }]
    });
});
   
</script>

</body>
</html>