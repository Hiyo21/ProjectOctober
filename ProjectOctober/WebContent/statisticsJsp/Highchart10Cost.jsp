<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
	#container100 {
		height: 400px; 
		position: relative; 
		width: 1000px;
		font-size: 150%;
	}
	
	.container {
		width: 70%;
  		height: 70%;
  		margin: 40px auto;
	}
</style>
<script type="text/javascript">
$(function () {
    $('#container100').highcharts({
        chart: {
            type: 'line'
        },
        title: {
            text: '같은지역&업종 고객 방문 시간'
        },
       
        xAxis: {
            categories: ['00', '01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24']
        },
        yAxis: {
            title: {
                text: '매출액'
            }
        },
        plotOptions: {
            line: {
                dataLabels: {
                    enabled: true
                },
                enableMouseTracking: false
            }
        },
        series: [{
           name: '시간대에 따른 고객 수', 
            data: [
                   <s:iterator value="#request.timelist3">
            			<s:property value="time000"/>
            			,<s:property value="time001"/>
            			,<s:property value="time002"/>
            			,<s:property value="time003"/>
            			,<s:property value="time004"/>
            			,<s:property value="time005"/>
            			,<s:property value="time006"/>
            			,<s:property value="time007"/>
            			,<s:property value="time008"/>
            			,<s:property value="time009"/>
            			,<s:property value="time0010"/>
            			,<s:property value="time0011"/>
            			,<s:property value="time0012"/>
            			,<s:property value="time0013"/>
            			,<s:property value="time0014"/>
            			,<s:property value="time0015"/>
            			,<s:property value="time0016"/>
            			,<s:property value="time0017"/>
            			,<s:property value="time0018"/>
            			,<s:property value="time0019"/>
            			,<s:property value="time0020"/>
            			,<s:property value="time0021"/>
            			,<s:property value="time0022"/>
            			,<s:property value="time0023"/>
            			,<s:property value="time0024"/>
            			
            		</s:iterator>  
            	]
        }]
    });
});

</script>
<title>같은지역, 같은업종 예약이 몰리는 시간대</title>
</head>
<body>
<div id="container100" class="container"></div>
</body>
</html>