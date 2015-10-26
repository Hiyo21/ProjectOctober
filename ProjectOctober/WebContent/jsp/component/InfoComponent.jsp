<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
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
	$('#infoModal').on('shown.bs.modal', function () {
		$('#infoModal').focus();
	});
});

function saveInfo() {
	var editor=CKEDITOR.instances.infoText.getData();
	
	//htmleditor에서 편집된 값을 반영
	var div = document.getElementById("infoContentIn");
	div.innerHTML = editor;
};

</script>
<script type="text/javascript">
function uploadInfoOpen() {
	window.open("${pageContext.request.contextPath}/enterprise/toInfoUploadPage.action","newwin","top=200,left=400,width=500,height=500,resizable=no,scrollbars=yes");
}
</script>

</head>

<body>

<div class="container-fluid" style="vertical-align: middle;">
	<div class="row">
		<div class="col-md-4">
			<!-- image 뿌리기 -->
				<!-- 리스트용 사진이 존재할 경우 -->
				<div class="col-md-6" align="left"><!-- row2 left start -->
					<s:if test="infoPht != null">
			         	<!-- photoLocation 에서 각 항목에 맞는 사진 뿌리기 -->
			   			<img src='${pageContext.request.contextPath}/<s:property value="infoPht"/>' class='img-responsive'>
					</s:if>
					<s:else>
						<!-- 인포사진 부재시 기본적으로 뿌려지는 사진 -->
						<s:if test='enterprise.etpSuperclass.equals("마사지샵")'>
							<img src='http://coolmassage.net/data/apms/background/%EB%B6%84%EB%8B%B9%EB%A7%88%EC%82%AC%EC%A7%801.jpg' class='img-responsive'>
						</s:if>
						<s:if test='enterprise.etpSuperclass.equals("네일샵")'>
							<img src='http://img.kormedi.com/news/article/__icsFiles/afieldfile/2012/10/15/cc201210150001145.jpg' class='img-responsive'>
						</s:if>
					</s:else>
				</div>
			<div>
				<input type="button" value="사진업로드" onclick="uploadInfoOpen()" class="edit">
			</div>
		</div>
		<div class="col-md-8">
			<div class="jumbotron">
	  			<!-- 입력된 내용을 바로 반영 -->
	  			<div id="infoContentIn">
	  				<s:if test='enterprise.etpDescription == null'>
	  					<h3>사장님 안녕하세요!</h3>
			  			<h5>이곳에 간단한 소개를 적어주세요</h5>
			  		</s:if>
			  		<s:if test='enterprise.etpDescription != null'>
			  			<s:property value="enterprise.etpDescription"/>
			  		</s:if>
	  			</div>
				<p align="left"><a class="btn btn-default btn-md edit" href="#" role="button" data-toggle="modal" data-target="#infoModal">편집</a></p>
			</div>
		</div><!-- col-md-8 end -->
	</div><!-- row end -->
</div>	

<!-- htmleditor modal -->
<div class="modal fade" id="infoModal">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">소개 작성</h4>
      </div>
      <div class="modal-body">
        <textarea id="infoText" name="infoEdit"> <s:property value="enterprise.etpDescription"/> </textarea>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="saveInfo()">Save changes</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

</body>
</html>