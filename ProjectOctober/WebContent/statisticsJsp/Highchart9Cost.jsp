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
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45
            }
        },
        title: {
            text: '매출액 상위 10위 안에 드는 사업체'
        },
        subtitle: {
            text: 'Top 10'
        },
        plotOptions: {
            pie: {
                innerSize: 100,
                depth: 45
            }
        },
        series: [{
           name: '매출액', 
            data: [
                ['rank1', <s:iterator value="#request.rank1"><s:property value="sale1"/></s:iterator>],
                ['rank2', <s:iterator value="#request.rank2"><s:property value="sale2"/> </s:iterator>],
                ['rank3', <s:iterator value="#request.rank3"><s:property value="sale3"/></s:iterator>],
                ['rank4', <s:iterator value="#request.rank4"><s:property value="sale4"/></s:iterator>],
                ['rank5', <s:iterator value="#request.rank5"><s:property value="sale5"/></s:iterator>],
                ['rank6', <s:iterator value="#request.rank6"><s:property value="sale6"/></s:iterator>],
                ['rank7', <s:iterator value="#request.rank7"><s:property value="sale7"/></s:iterator>],
                ['rank8', <s:iterator value="#request.rank8"><s:property value="sale8"/></s:iterator>],
                ['rank9', <s:iterator value="#request.rank9"><s:property value="sale9"/></s:iterator>],
                ['rank10', <s:iterator value="#request.rank10"><s:property value="sale10"/></s:iterator>]
            ]
        }]
    });
});
 
</script>
<title>같은지역과 같은 업종내 매출액 상위 10위</title>
</head>
<body>
<div id="container9" style="height: 400px"></div>
</body>
</html>