<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style>
	#review{
		overflow-x : auto;
		overflow-y : scroll;
	}

</style>


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
<div class="panel panel-default" id="review">
	<div class="container"> 
		<div class="row">
			<div class="col-md-6" id="chart" style="min-width: 200px; max-width: 400px; height: 400px; margin: 0 auto"></div>
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

<!-- Highchart -->
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>

</body>
</html>