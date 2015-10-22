<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script src="http://code.highcharts.com/modules/data.js"></script>
<script src="http://code.highcharts.com/modules/drilldown.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>유료 통계 서비스 화면</title>
</head>
<body>
<%@include file="Header.jsp"%>
<script type="text/javascript">
$(function(){
	// Ajax 파일 다운로드
	jQuery.download = function(url, data, method){
	    // url과 data를 입력받음
	    if( url && data ){ 
	        // data 는  string 또는 array/object 를 파라미터로 받는다.
	        data = typeof data == 'string' ? data : jQuery.param(data);
	        // 파라미터를 form의  input으로 만든다.
	        var inputs = '';
	        jQuery.each(data.split('&'), function(){ 
	            var pair = this.split('=');
	            inputs+='<input type="hidden" name="'+ pair[0] +'" value="'+ pair[1] +'" />'; 
	        });
	        // request를 보낸다.
	        jQuery('<form action="'+ url +'" method="'+ (method||'post') +'">'+inputs+'</form>')
	        .appendTo('body').submit().remove();
	    };
	};
	
	$("#pdfdown").click(function(){
		/*
		$.ajax({
			url:'./pdfdown.jsp',
			type:'post',
			dataType:'html',
			async: false,
			success:function(data){
				//alert(data);
				//download
				document.write(data);
			},
			error:function(request,status,error){
		        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
		    }
		});
		*/
		//$.download('pdfdown.jsp','','post' );
		$("#form").submit();
	});
});
</script>
<form action = "./statisticsJsp/pdfdown.jsp" method = "post" id="form">
</form>
<!-- 내가 작성할 부분 -->
<!-- pdf -->
<script type="text/javascript">
$(function(){
	// Ajax 파일 다운로드
	jQuery.download = function(url, data, method){
	    // url과 data를 입력받음
	    if( url && data ){ 
	        // data 는  string 또는 array/object 를 파라미터로 받는다.
	        data = typeof data == 'string' ? data : jQuery.param(data);
	        // 파라미터를 form의  input으로 만든다.
	        var inputs = '';
	        jQuery.each(data.split('&'), function(){ 
	            var pair = this.split('=');
	            inputs+='<input type="hidden" name="'+ pair[0] +'" value="'+ pair[1] +'" />'; 
	        });
	        // request를 보낸다.
	        jQuery('<form action="'+ url +'" method="'+ (method||'post') +'">'+inputs+'</form>')
	        .appendTo('body').submit().remove();
	    };
	};
	
	$("#pdfdown").click(function(){
		/*
		$.ajax({
			url:'./pdfdown.jsp',
			type:'post',
			dataType:'html',
			async: false,
			success:function(data){
				//alert(data);
				//download
				document.write(data);
			},
			error:function(request,status,error){
		        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
		    }
		});
		*/
		//$.download('pdfdown.jsp','','post' );
		$("#form").submit();
	});
});
</script>
<form action = "./statisticsJsp/pdfdown.jsp" method = "post" id="form">
<!-- 통계 -->
<div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-2"></div><!-- 안쓰는 부분 -->
          
          <div class="col-md-12">
          	<div class="container9">
		       <div class="row">
		         <div class="col-md-12">
		   		<!-- 유료 1통계 -->     
		   			<div class="panel panel-default">
						 <div class="panel-heading">
						    <h3 class="panel-title">같은업종, 같은지역 내 매출 상위 TOP10</h3>
						 </div>
						 <div class="panel-body">
						     <s:include value="Highchart9Cost.jsp"/>   
						     <p align="center">
						     <!-- 자동문구 -->
						     <s:iterator value="#request.listTai">아이고졸려<s:property value="differCost"/></s:iterator>
						     
						      귀사와 동종업계, 동일 지역(구 단위)에 위치한 매출액 상위 10위 업체를 선별하여 <br>
						      귀사가 가지고 있는 서비스와 상위 TOP10의 평균 서비스 가격대를 비교한 결과 <br>
							(타이마사지)는 (5000)원 정도 차이가 나며<br>
							(발마사지)는 (2000)원 정도 차이가 납니다.						     
						     </p>			 
						 </div>
				    </div>
		   		  <!-- 유료 1통계 -->    
		          </div>
        		</div>
     		</div>
         </div>
     
         <div class="col-md-4"></div><!-- 안쓰는 부분 -->
        </div>
      </div>
    </div>



 <div class="section2">
      <div class="container10">
        <div class="row">
          <div class="col-md-2"></div><!-- 안쓰는 부분 -->
          
          <div class="col-md-8">
          	<div class="container9">
		       <div class="row">
		         <div class="col-md-12">
		   		<!-- 유료 2통계 -->     
		   			<div class="panel panel-default">
						 <div class="panel-heading">
						    <h3 class="panel-title">같은업종, 같은지역 예약이 몰리는 시간대</h3>
						 </div>
						 <div class="panel-body">
						     <s:include value="Highchart10Cost.jsp"/>  
						     <p align="center">안녕하세요 김지희 입니다2. </p>			  
						 </div>
				    </div>
		   		  <!-- 유료2통계 -->    
		          </div>
        		</div>
     		</div>
         </div>
     
         <div class="col-md-4"></div><!-- 안쓰는 부분 -->
        </div>
      </div>
</div>
    
    
    
<div class="section3">
      <div class="container11">
        <div class="row">
          <div class="col-md-2"></div><!-- 안쓰는 부분 -->
          
          <div class="col-md-8">
          	<div class="container9">
		       <div class="row">
		         <div class="col-md-12">
		   		<!-- 유료 3통계 -->     
		   			<div class="panel panel-default">
						 <div class="panel-heading">
						    <h3 class="panel-title">같은 업종, 같은지격에 속한 업체들의 방문 고객 연령대</h3>
						 </div>
						 <div class="panel-body">
						    <s:include value="Highchart11Cost.jsp"/>
						   	<p align="center">안녕하세요 김지희 입니다3. </p>						   
						 </div>
				    </div>
		   		  <!-- 유료3통계 -->    
		          </div>
        		</div>
     		</div>
         </div>
     
         <div class="col-md-4"></div><!-- 안쓰는 부분 -->
        </div>
      </div>
</div>
<div align="center">
	<button type="button" class="btn btn-primary" id="pdfdown">PDF파일로 다운받기</button>
  </div>
  </form>
 <s:property value="etpEmail"/>
<s:property value='#session.loginId'/>
</body>
</html>