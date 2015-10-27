<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {
    $('#container9').highcharts({
        chart: {
            type: 'line'
        },
        title: {
            text: '시간대에 따른 고객 수'
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
           name: '시간대에 따른 매출액', 
            data: [
                   <s:iterator value="#request.timelist2">
            			<s:property value="time0"/>
            			,<s:property value="time1"/>
            			,<s:property value="time2"/>
            			,<s:property value="time3"/>
            			,<s:property value="time4"/>
            			,<s:property value="time5"/>
            			,<s:property value="time6"/>
            			,<s:property value="time7"/>
            			,<s:property value="time8"/>
            			,<s:property value="time9"/>
            			,<s:property value="time10"/>
            			,<s:property value="time11"/>
            			,<s:property value="time12"/>
            			,<s:property value="time13"/>
            			,<s:property value="time14"/>
            			,<s:property value="time15"/>
            			,<s:property value="time16"/>
            			,<s:property value="time17"/>
            			,<s:property value="time18"/>
            			,<s:property value="time19"/>
            			,<s:property value="time20"/>
            			,<s:property value="time21"/>
            			,<s:property value="time22"/>
            			,<s:property value="time23"/>
            			,<s:property value="time24"/>
            			
            		</s:iterator>  
            	]
        }]
    });
});
</script>
<title>시간대별 고객 수 변화</title>
</head>
<body>
<div id="container9" style="min-width: 1000px; height: 500px; margin: 0 auto"></div>
</body>
</html>