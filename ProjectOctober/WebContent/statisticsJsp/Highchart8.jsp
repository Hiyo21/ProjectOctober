<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {
    // Create the chart
    $('#container8').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'Discount vs NotDiscount'
        },
        subtitle: {
            text: 'Coupon'
        },
        xAxis: {
            type: 'category'
        },
        yAxis: {
            title: {
                text: '매출액'
            }

        },
        legend: {
            enabled: false
        },
        plotOptions: {
            series: {
                borderWidth: 0,
                dataLabels: {
                    enabled: true,
                    format: '{point.y:f}원'
                }
            }
        },

        tooltip: {
            headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
            pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:f}원</b> of total<br/>'
        },

        series: [{
            name: "Brands",
            colorByPoint: true,
            data: [{
                name: "NotDiscount",
                y: 
                	<s:iterator value="#request.notDiscount">
           			 <s:property value="amountSum"/>
                </s:iterator>
                ,
                drilldown: "NotDiscount"
            }, {
                name: "Discount",
                y: <s:iterator value="#request.discount">
      			 <s:property value="amountSum"/>
                 </s:iterator>,
                drilldown: "Discount",
            }]
        }]
    });
});
</script> 
<title>할인 쿠폰 발행에 따른 매출액변화</title>
</head>
<body>
<div id="container8" style="min-width: 800px; height: 400px; margin: 0 auto"></div>
</body>
</html>