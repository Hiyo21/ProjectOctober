<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {
    $('#container5').highcharts({
        chart: {
            type: 'line'
        },
        title: {
            text: '요일별 예약수(평일과 주말의 차이)'
        },
       
        xAxis: {
            categories: ['월', '화', '수', '목', '금', '토', '일']
        },
        yAxis: {
            title: {
                text: '예약수'
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
           name: '요일별 예약수(평일과 주말의 차이)', 
            data: [
                   <s:iterator value="#request.dayForReservation">
            			<s:property value="mon"/>
            			,<s:property value="tue"/>
            			,<s:property value="wed"/>
            			,<s:property value="thur"/>
            			,<s:property value="fri"/>
            			,<s:property value="sat"/>
            			,<s:property value="sun"/>
            		</s:iterator>  
            	]
        }]
    });
});
</script>
<title>요일별 예약수(평일 vs 주말)</title>
</head>
<body>
<div id="container5" style="min-width: 1000px; height: 500px; margin: 0 auto"></div>

</body>
</html>