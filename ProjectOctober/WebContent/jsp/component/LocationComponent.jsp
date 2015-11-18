<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Daum Map -->
<script type="text/javascript" src="http://apis.daum.net/maps/maps3.js?apikey=dc4b9eca6f6c59278349f8b7add7e6b1&libraries=services"></script>
<script src="//cdn.ckeditor.com/4.5.4/full/ckeditor.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//textarea를 htmleditor로 대체, toolbar 설정
	CKEDITOR.replace('locaEdit', {
		toolbarGroups : [
   			{ name: 'document', groups: [ 'mode', 'document', 'doctools' ] },
   			{ name: 'editing', groups: [ 'find', 'selection', 'spellchecker', 'editing' ] },
   			{ name: 'forms', groups: [ 'forms' ] },
   			{ name: 'basicstyles', groups: [ 'basicstyles', 'cleanup' ] },
   			{ name: 'paragraph', groups: [ 'list', 'indent', 'blocks', 'align', 'bidi', 'paragraph' ] },
   			{ name: 'links', groups: [ 'links' ] },
   			{ name: 'insert', groups: [ 'insert' ] },
   			{ name: 'clipboard', groups: [ 'clipboard', 'undo' ] },
   			{ name: 'styles', groups: [ 'styles' ] },
   			{ name: 'colors', groups: [ 'colors' ] },
   			{ name: 'tools', groups: [ 'tools' ] },
   			{ name: 'others', groups: [ 'others' ] },
   			{ name: 'about', groups: [ 'about' ] }
   		],

   		removeButtons : 'Source,Save,Templates,NewPage,Preview,Print,SelectAll,Find,Replace,Form,Checkbox,Radio,TextField,Textarea,Select,Button,ImageButton,HiddenField,BidiLtr,BidiRtl,Language,CreateDiv,Link,Unlink,Anchor,PageBreak,ShowBlocks,Maximize',
   		language : 'ko'
	});
});


function saveLoca() {
	var editor = CKEDITOR.instances.locaEdit.getData();

	$.ajax({
		url: "${pageContext.request.contextPath}/enterprise/saveLocaDesc.action",
		dataType: 'json',
		type: 'POST',
		data: {"enterprise.etpDirection" : editor},
		contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
		success: function(data){
			console.log(data);
			var locaDesc = data.enterprise.etpDirection;
			$('#locaContentIn').html(locaDesc);
		},
		error: function(doc){
			console.log("insert Error");
		}
	});
};

</script>

</head>
<body>
<div class="panel panel-default">
	<div class="table-responsive"> 
		<div class="row">
			<div class="col-xs-6">
				<input type="hidden" id="address" value='${enterprise.etpAddress}'/>   
				<input type="hidden" id="map">
				<div id="map3" class="img-thumbnail image-responsive" style="width:100%; height:300px;width:300px;"></div>	
			</div>
			<div class="col-xs-6">
				<s:if test="#session.enterprise.etpDirection != null">
					<h1 style="text-decoration: underline; color: navy;">오시는 길</h1>
					<br>
					<s:property value="#session.enterprise.etpDirection" escapeHtml="false"/>
				</s:if>
				<p align="left">
					<div id="locaContentIn"></div>
					<a class="btn btn-default btn-md edit" href="#" 
					role="button" data-toggle="modal" data-target="#locaModal">편집</a>
				</p>
			</div>
		</div>
	</div>
</div>

<div class="modal" id="locaModal" aria-hidden="true" tabindex="0">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" data-dismiss="modal"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">오시는 길 편집</h4>
      </div>
      <div class="modal-body">
        <textarea id="locaEdit" name="locaEdit"> 
	  		<s:if test='#session.enterprise.etpDirection != null'>
	  			<s:property value="#session.enterprise.etpDirection"/>
	  		</s:if>
        </textarea>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="saveLoca()">Save</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
	
<script>
function mapMake() {
	var address = document.getElementById('address').value;
	var mapContainer = document.getElementById('map3'), // 지도를 표시할 div 
	    mapOption = {
	        center: new daum.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
	        level: 3 // 지도의 확대 레벨
	    };  
	
	// 지도를 생성합니다    
	var map = new daum.maps.Map(mapContainer, mapOption); 
	
	// 주소-좌표 변환 객체를 생성합니다
	var geocoder = new daum.maps.services.Geocoder();
	
	var coords = '';
	
	// 주소로 좌표를 검색합니다
	geocoder.addr2coord(address, function(status, result) {
	
	    // 정상적으로 검색이 완료됐으면 
	     if (status === daum.maps.services.Status.OK) {
	        coords = new daum.maps.LatLng(result.addr[0].lat, result.addr[0].lng);
	
	        // 결과값으로 받은 위치를 마커로 표시합니다
	        var marker = new daum.maps.Marker({
	            map: map,
	            position: coords
	        });
	
	        // 인포윈도우로 장소에 대한 설명을 표시합니다
	        var infowindow = new daum.maps.InfoWindow({
	            content: '<div style="padding:5px;">' + '${enterprise.etpTitle}' + '</div>'
	        });
	        infowindow.open(map, marker);
	        
	        //지도 가운데
	        map.setCenter(coords);
	    } 
	}); 
}
setTimeout(mapMake(), 1000);

</script>
</body>
</html>