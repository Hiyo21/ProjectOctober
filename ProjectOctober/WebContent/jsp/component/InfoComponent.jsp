<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
	console.log(editor);
	//htmleditor에서 편집된 값을 반영
	var div = document.getElementById("infoContentIn");
	div.innerHTML = editor;
};

</script>


</head>
<body>
<div class="container-fluid" style="vertical-align: middle;">
	<div class="row">
		<div class="col-md-4">
			<img src="http://mitsuraku.jp/files/photo/shop_top/7783/d950abc0aa7f062979756ae893d8824f.JPG?1429694028" class="img-responsive">
		</div>
		<div class="col-md-8">
			<div class="jumbotron">
	  			<!-- 입력된 내용을 바로 반영 -->
	  			<div id="infoContentIn">
			  		<h3>정보를 적어주세요</h3>
	  			</div>
				<p><a class="btn btn-default btn-md" href="#" role="button" data-toggle="modal" data-target="#infoModal">편집</a></p>
			</div>
		</div>
	</div>
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
        <textarea id="infoText" name="infoEdit"></textarea>
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