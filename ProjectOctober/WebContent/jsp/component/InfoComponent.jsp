<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>

<script src="//cdn.ckeditor.com/4.5.4/full/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript">
$(document).ready(function(){
	//textarea를 htmleditor로 대체, toolbar 설정
	CKEDITOR.replace('infoEdit', {
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
	
	//htmleditor modal on
	$('#infoModal').on('shown.bs.modal', function(){
		$('.modal-backdrop').css('z-index', -1);
		$('.modal-dialog').css('z-index', +1);
		$('.input-group-btn').css('z-index', 0);
		$('#etpBtBar').css('z-index', -1);
		$('#rsvBt').css('z-index', -1);
	});
	
	$('#infoModal').on('hidden.bs.modal', function(){
		$('#etpBtBar').css('z-index', 0);
	});
});

function saveInfo() {
	var editor = CKEDITOR.instances.infoEdit.getData();

	$.ajax({
		url: "${pageContext.request.contextPath}/enterprise/saveInfoDesc.action",
		dataType: 'json',
		type: 'POST',
		data: {"enterprise.etpDescription" : editor},
		contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
		success: function(data){
			console.log(data);
			var infoDesc = data.enterprise.etpDescription;
			$('#infoContentIn').html();
			$('#infoContentIn').html(infoDesc);
		},
		error: function(doc){
			console.log("insert Error");
		}
	});
};


function toInfoUploadPage() {
	window.open("${pageContext.request.contextPath}/enterprise/toInfoUploadPage.action","newwin","top=200,left=400,width=500,height=500,resizable=no,scrollbars=yes");
}
</script>
</head>

<body>

<div class="container-fluid" style="vertical-align: middle;">
	<!-- 사진, 설명 업로드 기능 필요 -->
	<%-- <s:form action="infoPhtUploadAction" method="POST" enctype="multipart/form-data"> --%>
	<div class="table-responsive">
	<div class="row-xs-12" align="left"><!-- row2 start -->
		<div class="col-xs-12">
			<!-- 주소, 영업시간 -->
			<span class="label label-success">주소</span> <s:property value="#session.enterprise.etpAddress"/>&nbsp;&nbsp;
			<span class="label label-success">영업시간</span> <s:property value="#session.enterprise.etpStartHour"/> ~ <s:property value="#session.enterprise.etpEndHour"/>
		</div>
	</div>
	<div class="row-xs-12">
			<!-- image 뿌리기 -->
			<!-- 리스트용 사진이 존재할 경우 -->
			<div class="col-xs-5"><!-- row2 left start -->
				<s:if test="#session.enterprise.infoPht != null">
		         	<!-- photoLocation 에서 각 항목에 맞는 사진 뿌리기 -->
		   			<img src='${pageContext.request.contextPath}/<s:property value="#session.enterprise.infoPht"/>' class='img-responsive'>
				</s:if>
				<s:else>
					<!-- 인포사진 부재시 기본적으로 뿌려지는 사진 -->
						<img src='${pageContext.request.contextPath}/image/wait.gif' class='img-responsive'>
				</s:else>
				
				<input type="hidden" name="etpNum" value="${enterprise.etpNum}" id="etpNumHidden"/>
				<input type="hidden" name="etpEmail" value="${enterprise.etpEmail}" id="etpEmailHidden" />
				<input type="hidden" name="infoPht" value="${enterprise.infoPht}" id="infoPhtHidden" />
				<input type="button" value="사진업로드" onclick="toInfoUploadPage()" class="edit">
			</div>

			<div class="col-xs-7">
				<div class="jumbotron">
		  			<!-- 입력된 내용을 바로 반영 -->
		  			<div id="infoContentIn">
		  				<s:if test='#session.enterprise.etpDescription == null'>
		  					<h3><s:property value="#session.enterprise.etpTitle"/>에 어서오세요</h3>
				  		</s:if>
				  		<s:if test='#session.enterprise.etpDescription != null'>
				  			<s:property value="#session.enterprise.etpDescription" escapeHtml="false"/>
				  		</s:if>
		  			</div>
					<p align="left">
						<a class="btn btn-default btn-md edit" href="#" 
						role="button" data-toggle="modal" data-target="#infoModal">편집</a>
					</p>
				</div>
			</div><!-- col-md-8 end -->
	</div><!-- row end -->
	</div>
	<%-- </s:form> --%>
</div>	

<!-- htmleditor modal -->
<div class="modal" id="infoModal" aria-hidden="true" tabindex="0" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">소개 작성</h4>
      </div>
      <div class="modal-body">
        <textarea id="infoEdit" name="infoEdit"> 
        	<s:if test='#session.enterprise.etpDescription == null'>
 				<h3>사장님 안녕하세요!</h3>
	  			<h5>이곳에 간단한 소개를 적어주세요</h5>
	  		</s:if>
	  		<s:if test='#session.enterprise.etpDescription != null'>
	  			<s:property value="#session.enterprise.etpDescription"/>
	  		</s:if>
        </textarea>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="saveInfo()">Save</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

