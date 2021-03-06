<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<%-- <link rel="stylesheet"	href="${pageContext.request.contextPath}/css/freelancer/css/freelancer.css"> --%>

<!--  null 일때는 기본 css. -->

<!--  null이 아닐 때는. 이건 어떻게 보지? -->
<s:if test="etpThemeType != null">
	<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/lavish-bootstrap.css" /> --%>
</s:if>

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<style>
@font-face{
 font-family:'LotteMartHappy';
 font-style:normal;
 font-weight:400;
 src:url('//cdn.jsdelivr.net/korean-webfonts/1/corps/lottemart/LotteMartHappy/LotteMartHappyMedium.woff2') format('woff2'),
     url('//cdn.jsdelivr.net/korean-webfonts/1/corps/lottemart/LotteMartHappy/LotteMartHappyMedium.woff') format('woff');
}

#KoreaMap{
	margin : 10px;
	padding: 10px;
}
	
.vcenter {
    display: inline-block;
    vertical-align: middle;
    float: none;
	}
}
</style>

<script type="text/javascript">
	$(document).ready(function(){
	    $(".nav-tabs a").click(function(){
	        $(this).tab('show');
	    });
	    $('.nav-tabs a').on('shown.bs.tab', function(event){
	        var x = $(event.target).text();         // active tab
	        var y = $(event.relatedTarget).text();  // previous tab
	        $(".act span").text(x);
	        $(".prev span").text(y);
	    });
	});

</script>
<title>Main</title>
</head>
<body>
<s:include value="Header.jsp"></s:include>

<div class="container">
<div class="row marketing">	
<div class="col-md-4">
<s:if test="enterpriseList !=null">
<s:iterator value="enterpriseList">         		 	
<div class="panel-group">
<div class="panel panel-default">
<div class="panel-heading">
<h4 class="panel-title">
<a data-toggle="collapse" href="#<s:property value="etpNum"/>"><s:property value="etpTitle"/> <br> 영업개시시간 : <s:property value="etpStartHour"/>&nbsp;&nbsp; 영업종료시간 : <s:property value="etpEndHour"/></a>
</h4>
</div>
<div id="<s:property value="etpNum"/>" class="panel-collapse collapse">
<!-- 본문 내용 -->
<div class="panel-body">
<div class="section">
<div class="container">
<div class="row">
<div class="col-md-6">
<table>
<tr>
<th>전화번호 : </th>
<td><s:property value="etpPhone"/></td>
</tr>
<tr>
<th>주소 : </th>
<td><s:property value="etpAddress"/></td>
</tr>
<tr>
<th>이메일 : </th>
<td><s:property value="etpEmail"/></td>
</tr>
<tr>
<th>특이사항 : </th>
<td><s:property value="etpSpecialize"/></td>
</tr>															
</table>
</div>
<!--  <div class="col-md-6">
<h2>오시는 길</h2>
<img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false">
</div> -->
</div>
</div>
</div>
</div>
</div>
</div>										
</div>
<!-- 아랫 부분 
<s:form action="" method="post"  theme="simple">
<div class="panel-footer">
<s:submit value="예약"/> <input type="button" value="취소">
</div>
</s:form>-->
</s:iterator>
</s:if>
</div>	
<div class="col-md-12">
<div class ="well">
<div class="section">
<div class="container">
<div class="row">
<div class="col-md-6">

</div>				       
</div>
</div>
</div>
          
            	
            
	        <div class="tab-content">
	        	<div id="location" class="tab-pane fade in active">
    				<div class="row">
    					<div class="col-xs-5" style="vertical-align: " align="center">
		     				<div id="mapPage">
    					<div class="mapImgD">
							<br><br><br><br>
							<a href="#"><img src="${pageContext.request.contextPath}/image/KoreaMap.jpg" alt="KoreaMap" usemap="#KoreaMap" class="mapImg img-round vcenter"/></a>
							<map name="KoreaMap" id="KoreaMap">	
								<area shape="rect" coords="58,43,72,59" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=서울" alt="Seoul" />
								<area shape="rect" coords="37,45,57,62" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=인천" alt="Incheon" />
								<area shape="rect" coords="31,18,93,87" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=경기도" alt="GyungGi" />
								<area shape="rect" coords="95,4,192,85" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=강원도" alt="kangwon" />
								<area shape="rect" coords="89,90,124,149" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=충청북도" alt="ChungBuk" />
								<area shape="rect" coords="21,92,72,147" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=충청남도" alt="ChungNam" />
								<area shape="rect" coords="73,123,89,144" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=대전" alt="Deajun" />
								<area shape="rect" coords="31,150,102,194" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=전라북도" alt="Junbuk" />
								<area shape="rect" coords="34,204,60,218" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=광주" alt="GwangJu" />
								<area shape="rect" coords="17,195,97,256" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=전라남도" alt="JunNam" />
								<area shape="rect" coords="138,154,165,178" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=대구" alt="Deagu" />
								<area shape="rect" coords="126,87,205,164" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=경상북도" alt="GyeongBuk" />
								<area shape="rect" coords="102,164,177,229" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=경상남도" alt="GyungNam" />
								<area shape="rect" coords="178,169,205,196" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=울산" alt="Ulsan" />
								<area shape="rect" coords="178,196,201,220" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=부산" alt="Busan" />
								<area shape="rect" coords="10,270,54,289" href="${pageContext.request.contextPath}/search/areaMapSearch.action?searchKeyword=제주" alt="Jeju" />

							</map>			
						</div><!-- 지도 UI -->
										<script type="text/javascript">	
											$('#KoreaMap area').mouseover(function(){
												mapTxt = $(this).attr("alt");
												mapSrc = "${pageContext.request.contextPath}/image/img_map_" + mapTxt + ".png";		
												$(".mapImg").attr("src", mapSrc);
												
												return false;
											})
											$('#KoreaMap area').focus(function(){
												mapTxt = $(this).attr("alt");
												mapSrc = "${pageContext.request.contextPath}/image/img_map_" + mapTxt + ".png";		
												$(".mapImg").attr("src", mapSrc);
												
												return false;
											})
											$('.mapImg').mouseout(function(){
												
												mapSrc = "${pageContext.request.contextPath}/image/KoreaMap.jpg";

												
												
												$(".mapImg").attr("src", mapSrc);
												return false;
											})			
										
										</script>
							</div>
		     				
		     			
							<%-- <img src="${pageContext.request.contextPath}/image/Korea2.png" width="400" height="400" /> --%>
		    			</div> 		
    				
				     
				      	<br><br>
				      		<!-- 실제로 사용할 때는 DB에서 구역명을 가져와서 뿌리기 -->
				      		<div class="container">	
				      			<div class="col-xs-3">
				      								  
								  <button type="button" class="btn btn-link" data-toggle="collapse" data-target="#seoul"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>서울 특별시</button>
									  <div id="seoul" class="collapse">								  
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=강남구"/>">강남구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=강동구"/>">강동구</a>
									 	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=강북구"/>">강북구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=강서구"/>">강서구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=관악구"/>">관악구</a><br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=광진구"/>">광진구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=구로구"/>">구로구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=금천구"/>">금천구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=관악구"/>">관악구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=구로구"/>">구로구</a><br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=노원구"/>">노원구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=도봉구"/>">도봉구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=동대문구"/>">동대문구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=동작구"/>">동작구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=마포구"/>">마포구</a><br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=부평구"/>">부평구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=서대문구"/>">서대문구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=성동구"/>">성동구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=성북구"/>">성북구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=송파구"/>">송파구</a>&nbsp;<br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=양천구"/>">양천구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=영등포구"/>">영등포구</a>
									    <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=울산구"/>">용산구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=은평구"/>">은평구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=종로구"/>">종로구</a><Br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=중랑구"/>">중랑구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=중원구"/>">중원구</a>					  								  							  									    
									  </div>
								  <br><br>
								   <button type="button" class="btn btn-link" data-toggle="collapse" data-target="#busan"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>부산 광역시</button>
								  	<div id="busan" class="collapse">
								  		<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=권선구"/>">강서구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=기흥구"/>">금정구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=단원구"/>">기장군</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=덕양구"/>">남구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=동안구"/>">동구</a>&nbsp;<br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=만안구"/>">부산진구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=분당구"/>">동래구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=상록구"/>">사상구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=소사구"/>">북구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=수정구"/>">서구</a><br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=수지구"/>">연제</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=영통구"/>">사하구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=오정구"/>">중구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=원미구"/>">수영</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=장안구"/>">해운대</a><br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=처인구"/>">영도</a>
									  								    
								 	</div>
								  <br><br>
								   <button type="button" class="btn btn-link" data-toggle="collapse" data-target="#incheon"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>인천 광역시</button>
								  	<div id="incheon" class="collapse">
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=강화군"/>">강화군</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=계양구"/>">계양구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=남구"/>">남구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=남동구"/>">남동구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=동구"/>">동구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=부평구"/>">부평구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=서구"/>">서구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=연수구"/>">연수구</a>
								   </div>								
								  <br><br>		
								   <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=대구"/>"><button type="button" class="btn btn-link" data-target="#deagu"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>대구 광역시</button></a>
									 
								  <br><br>	
								   <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=울산"/>"><button type="button" class="btn btn-link" data-target="#ulsan"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>울산 광역시</button></a>
									  
								  <br><br>	
								   <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=광주"/>"><button type="button" class="btn btn-link"  data-target="#gwangju"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>광주 광역시</button></a>
									  
								  <br><br>	
								   <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=대전"/>"><button type="button" class="btn btn-link" data-target="#deajun"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>대전 광역시</button></a>
									 
								  <br><br>	
								   <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=세종"/>"><button type="button" class="btn btn-link"  data-target="#sejong"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>세종특별자치시</button></a>
									 
								  <br><br>	
								  				  
								</div>	<!-- 왼쪽map옆 -->
								<div class="col-md-3">
								<!-- 도 구역 -->					
								 <button type="button" class="btn btn-link" data-toggle="collapse" data-target="#gyungido"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>경기도</button>
								  	<div id="gyungido" class="collapse">
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=권선구"/>">권선구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=기흥구"/>">기흥구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=단원구"/>">단원구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=덕양구"/>">덕양구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=동안구"/>">동안구</a>&nbsp;<br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=만안구"/>">만안구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=분당구"/>">분당구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=상록구"/>">상록구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=소사구"/>">소사구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=수정구"/>">수정구</a><br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=수지구"/>">수지구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=영통구"/>">영통구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=오정구"/>">오정구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=원미구"/>">원미구</a><br>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=장안구"/>">장안구</a>&nbsp;<a href="<s:url value="/search/searchFreeKeyword.action?searchKeyword=처인구"/>">처인구</a>
									  	<a href="<s:url value="/search/areaMapSearch.action?searchKeyword=팔달구"/>">팔달구</a>
								   </div>
								  <br><br>							 
								  <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=강화도"/>"><button type="button" class="btn btn-link"  data-target="#kangwondo"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>강원도</button></a>
								  	
								  <br><br>
								 <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=충청북도"/>"> <button type="button" class="btn btn-link"  data-target="#chungcheongbukdo"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>충청북도</button></a>
								  	
								  <br><br>
								 <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=충청남도"/>"> <button type="button" class="btn btn-link" data-target="#chungcheongnamdo"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>충청남도</button></a>
								  			
								  <br><br>
								  <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=경상북도"/>"><button type="button" class="btn btn-link" data-target="#gyeongsangbukdo"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>경상북도</button></a>
								  				
								  <br><br>
								 <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=경상남도"/>"> <button type="button" class="btn btn-link" data-target="#gyeongsangnamdo"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>경상남도</button></a>
								  					
								  <br><br>
								  <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=전라북도"/>"><button type="button" class="btn btn-link" data-target="#jeonrabukdo"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>전라북도</button></a>
								  				
								  <br><br>
								 <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=전라남도"/>"> <button type="button" class="btn btn-link"  data-target="#jeonranamdo"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>전라남도</button></a>
								  			
								  <br><br>
								 <a href="<s:url value="/search/areaMapSearch.action?searchKeyword=제주"/>"> <button type="button" class="btn btn-link" data-target="#jejudo"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>제주특별자치도</button></a>
								  			
								  <br><br>
							</div>			
				      	</div>     		
					</div>   					
   				</div>   				
 			</div>
  		</div>
  	</div>
 </div>
 </div>
</body>
</html>