<%@ page contentType="text/html; charset=EUC-KR" %>
<html>

<script language="javascript">
var objTF=null;			//trustform object browser���ο��� ��ü�� ������ ����� ���°�?
var loadComplete=false;	//load�� �Ϸ�Ǿ����� ����.
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

//�� ȭ���� �����ϰ� �ִ�(browser��ü��) xrw ��ü�� �����ϱ� ���ؼ��� objTF �� ����Ѵ�.
</script>

<body style="margin-left:0;margin-top:0" onload="jaascript:setLoadComplete();">
<div id="editorLocation" height="100" width="100">
  <script id="webeditorid" src="/js/webEditorControl.js"></script>
</div>
</body>
</html>