<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>      

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {

    $('#container1').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '고객 성별 선호 staff'
        },
        subtitle: {
            text: 'Source: a.#'
        },
        xAxis: {
            categories: [
                '10대',
                '20대',
                '30대',
                '40대',
                '50대이상'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            max: 20,
            title: {
                text: 'staff(명)'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} 명</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        
        //남성이 선택한 남성 스텝
        series: [{
            name: '남성이 선택한 남성staff',
           /*  data: [parseInt($("[id$=first]").val()), parseInt($("[id$=second]").val()), parseInt($("[id$=third]").val()), parseInt($("[id$=forth]").val()), parseInt($("[id$=fifth]").val())] */
			data:[
<s:iterator value="#request.resultList1">  
<s:property value="first"/>,<s:property value="second"/>,<s:property value="third"/>,
<s:property value="forth"/>,<s:property value="fifth"/>
</s:iterator>
			]
        }, {
        	//남성이 선택한 여성스텝
            name: '남성이 선택한 여성staff',
            data: [
<s:iterator value="#request.resultList2">  
<s:property value="first"/>,<s:property value="second"/>,<s:property value="third"/>,
<s:property value="forth"/>,<s:property value="fifth"/>
</s:iterator>
			]

        }, {
        	//여성이 선택한 남성스텝
            name: '여성이 선택한 남성staff',
            data: [
<s:iterator value="#request.resultList3">  
<s:property value="first"/>,<s:property value="second"/>,<s:property value="third"/>,
<s:property value="forth"/>,<s:property value="fifth"/>
</s:iterator>
			]

        }, {
        	//여성이 선택한 여성스텝
            name: '여성이 선택한 여성staff',
            data: [
<s:iterator value="#request.resultList4">  
<s:property value="first"/>,<s:property value="second"/>,<s:property value="third"/>,
<s:property value="forth"/>,<s:property value="fifth"/>
</s:iterator>       
            ]

        }]
    });
});
</script>
<title>고객 성별에 따른 STAFF성별 선호도</title>
</head>
<body>
<div id="container1" style="width:100%; height:400px;"></div>
</body>
</html>