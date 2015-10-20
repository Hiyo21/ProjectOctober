<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="//cdn.ckeditor.com/4.5.4/full/ckeditor.js"></script>

<script type="text/javascript">

$(document).ready(function(){	
	//textarea를 htmleditor로 대체, toolbar 설정
	CKEDITOR.replace('outLineEdit', {
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
	
	$('#outlinemodal').on('shown.bs.modal', function () {
		$('#outlinemodal').focus();
	});
});

function saveOutline() {
	var editor=CKEDITOR.instances.outLineText.getData();
	
	console.log(editor);
	//htmleditor에서 편집된 값을 반영
	var div = document.getElementById("outLineContentIn");
	div.innerHTML = editor;
};

</script>

</head>
<body>

<!-- page-top -->
<div class='container-fluid'>
	<div class="panel panel-default">
	<div class="row" align="center">
		<div class="col-md-3">
			<div id='logoCP'>
			  	<div class="panel-body">
			  		<!-- img src에 업로드 된 파일이 바로 적용되도록 -->
			    	<img class="img-responsive" src="http://orig10.deviantart.net/2e58/f/2013/288/b/9/leaf_png_by_iheartsnsdforever-d6qjxl2.png" style="max-width: 200">
			    	<input type="file" name="datafile" size="40" class="edit">
			  	</div>
			</div>
		</div>
		
		<div class="col-md-6">
			<div id='outLineCP'>
			  	<div class="panel-body">
			  		<div class="jumbotron">
			  			<!-- 입력된 내용을 바로 반영 -->
			  			<div id="outLineContentIn">
			  				<s:if test='enterprise.etpDescription == null'>
			  					<h3>사장님 안녕하세요!</h3>
					  			<h5>이곳에 간단한 소개를 적어주세요</h5>
					  		</s:if>
					  		<s:if test='enterprise.etpDescription != null'>
					  			<s:property value="enterprise.etpDescription"/>
					  		</s:if>
			  			</div>
						<p><a class="btn btn-default btn-md edit" href="#" role="button" data-toggle="modal" data-target="#outLineModal">편집</a></p>
					</div>
			  	</div>
			</div>
		</div>
			
		<div class="col-md-3" id="spcialSpan">
			<script type="text/javascript">
				$(function(){
					var item = '<s:property value="enterprise.etpSpecialize"/>'
					var special = item.split(",");
					
					var specialBT = $('#specialBT').html();
						specialBT = '';
					$.each(special, function(i, item){
						specialBT += '<span class="label label-primary">'+item+'</span>&nbsp;&nbsp;';
					});
					
					$('#spcialSpan').html(specialBT);	
				});
			</script>

		</div>	
	</div><!-- row end -->
	</div>
</div><!-- page-top end -->

<!-- htmleditor modal -->
<div class="modal fade" id="outLineModal">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">소개 작성</h4>
      </div>
      <div class="modal-body">
        <textarea id="outLineText" name="outLineEdit"></textarea>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="saveOutline()">Save changes</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->



</body>
</html>