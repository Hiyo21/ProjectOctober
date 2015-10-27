<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {
    $('#container6').highcharts({
        chart: {
            type: 'line'
        },
        title: {
            text: '시간대에 따른 매출액'
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
                   <s:iterator value="#request.timelist1">
            			<s:property value="time00"/>
            			,<s:property value="time01"/>
            			,<s:property value="time02"/>
            			,<s:property value="time03"/>
            			,<s:property value="time04"/>
            			,<s:property value="time05"/>
            			,<s:property value="time06"/>
            			,<s:property value="time07"/>
            			,<s:property value="time08"/>
            			,<s:property value="time09"/>
            			,<s:property value="time010"/>
            			,<s:property value="time011"/>
            			,<s:property value="time012"/>
            			,<s:property value="time013"/>
            			,<s:property value="time014"/>
            			,<s:property value="time015"/>
            			,<s:property value="time016"/>
            			,<s:property value="time017"/>
            			,<s:property value="time018"/>
            			,<s:property value="time019"/>
            			,<s:property value="time020"/>
            			,<s:property value="time021"/>
            			,<s:property value="time022"/>
            			,<s:property value="time023"/>
            			,<s:property value="time024"/>
            			
            		</s:iterator>  
            	]
        
        }] 
   
    }); 
});

</script>

<title>시간대별 매출액 변화</title>
</head>
<body>
<div id="container6" style="min-width: 1000px; height: 500px; margin: 0 auto"></div>

</body>
</html>