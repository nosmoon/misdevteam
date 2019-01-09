<%@ page contentType="text/html; charset=EUC-KR" %>
<html>

<script language="javascript">
var objTF=null;			//trustform object browser내부에서 개체를 가져올 방법은 없는가?
var loadComplete=false;	//load가 완료되었는지 여부.
function getAllHtml()
{
	return jw.AllHtml;
}

function getDummy()
{
	return "This is web editor";
}

function setLoadComplete()
{
	loadComplete=true;
}

//이 화면을 포함하고 있는(browser개체로) xrw 개체로 접근하기 위해서는 objTF 를 사용한다.
</script>

<body style="margin-left:0;margin-top:0" onload="jaascript:setLoadComplete();">
<div id="editorLocation" height="100" width="100">
  <script id="webeditorid" src="/js/webEditorControl.js"></script>
</div>
</body>
</html>