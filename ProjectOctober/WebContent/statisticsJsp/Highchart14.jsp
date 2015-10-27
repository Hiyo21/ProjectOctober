<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" >

$(function () {

    $('#container2').highcharts({

        chart: {
            polar: true,
            type: 'line'
        },

        title: {
            text: '연령별 고객평가 척도',
            x: -80
        },

        pane: {
            size: '80%'
        },

        xAxis: {
            categories: ['청결', '편안함', '기술', '가격',
                    '서비스'],
            tickmarkPlacement: 'on',
            lineWidth: 0
        },

        yAxis: {
            gridLineInterpolation: 'polygon',
            lineWidth: 0,
            min: 0
        },

        tooltip: {
            shared: true,
            pointFormat: '<span style="color:{series.color}">{series.name}: <b>{point.y:.0f}</b><br/>'
        },

        legend: {
            align: 'right',
            verticalAlign: 'top',
            y: 70,
            layout: 'vertical'
        },

        series: [{
            name: '10대',
            data: [
<s:iterator value="#request.list">
	<s:property value="hygiene"/>,<s:property value="comfort"/>,<s:property value="technique"/>,
	<s:property value="price"/>,<s:property value="service"/>
</s:iterator>  ]
            pointPlacement: 'on'
        }

    });
});





</script>
<title>연령대별 고객의 평가 척도</title>
</head>
<body>

<div id="container2" style="min-width: 700px; max-width: 500px; height: 500px; margin: 0 auto"></div>
</body>
</html>