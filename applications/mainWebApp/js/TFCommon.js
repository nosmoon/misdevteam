/**************************************************************************************************
* @function : getProperty()
* @param : key
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : property �����ϱ�
* 				key : property �̸�
**************************************************************************************************/
function getProperty(key)
{
	return model.property(key);
}

/**************************************************************************************************
* @function : setProperty()
* @param : key, value
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : property �����ϱ�
* 				key : property �̸�
* 				value : property ��
**************************************************************************************************/
function setProperty(key, value)
{
	model.property(key) = value;
}

/**************************************************************************************************
* @function : commSubmit
* @param submitID, action, refresh, type 
* @return 
* @wirter : �Ľ�����
* @write date : 2006-09-07
* @modify datae : 
* @description ����̼� ����
* 				submitID 	: ����̼�ID
* 				action		: url 
				[refresh]	: ����̼������� refresh ���� default �� true
				[type]		: ����̼� Ÿ������ ���Ͼ��ε�� 'file' ���� default post 
**************************************************************************************************/

function commSubmit(submitID,action,refresh,type) {
		
		body.disabled = true;
		var mediatype="";
		if(!body.isChild(submitID)) {
		model.createChild("xforms:submission","id:"+submitID+";"); //����̼� �������� ����
		}

		if(refresh=="" || refresh==null) {
			refresh=true;
		}else if (refresh =='file') {
			mediatype = "file";
			refresh= true;
		}
		
		if(type=="" || type ==null) type = mediatype;
		
		if(type=="file") {
			document.all(submitID).attribute("method") = "form-data-post";
			document.all(submitID).attribute("mediatype") = "multipart/form-data";
		}else {
			document.all(submitID).attribute("method") = "post";
			document.all(submitID).attribute("mediatype") = "application/x-www-form-urlencoded";
		}
		
		document.all(submitID).attribute("ref") ="/root/reqData";
		document.all(submitID).attribute("resultref") ="/root/resData";
		document.all(submitID).attribute("action") = action;
		document.all(submitID).attribute("encoding") = "euc-kr";
		
		model.send(submitID,refresh);
}

/**************************************************************************************************
* @function : showMsgBox()
* @param : str
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : �޼��� �ڽ�
* 				str : �޼���
**************************************************************************************************/
function showMsgBox(str)
{
	var msgBoxWidth = 300;
	var msgBoxHeight = 150;
	
	var pw = parseInt((window.width - msgBoxWidth) / 2) + window.left;
	var ph = parseInt((window.height - msgBoxHeight) / 2) + window.top;
	
	model.makeNode("/root/msgData/resultMsg");
	model.setValue("/root/msgData/resultMsg", str);

	var winprops = "caption:hidden; resize:false; align:center; width:"+msgBoxWidth+"px; height:"+msgBoxHeight+"px;";
	window.load("/common/xrw/showMsgBox.xrw", "modal", "msgBox", winprops, "root/msgData", "root/msgData");
}

function showResultMsgBox(refPath)
{
	var msgBoxWidth = 300;
	var msgBoxHeight = 150;
	
	var pw = parseInt((window.width - msgBoxWidth) / 2) + window.left;
	var ph = parseInt((window.height - msgBoxHeight) / 2) + window.top;
	
	var winprops = "caption:hidden; resize:false; align:center; width:"+msgBoxWidth+"px; height:"+msgBoxHeight+"px;";
	window.load("/common/xrw/showMsgBox.xrw", "modal", "msgBox", winprops, refPath, "root/msgData");
}

/**************************************************************************************************
* @function : showConfirmBox()
* @param : str
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : confirm �ڽ�
* 				str : �޼���
**************************************************************************************************/
function showConfirmBox(str)
{
	var msgBoxWidth = 300;
	var msgBoxHeight = 150;
	
	var pw = parseInt((window.width - msgBoxWidth) / 2) + window.left;
	var ph = parseInt((window.height - msgBoxHeight) / 2) + window.top;
	
	model.makeNode("/root/tempData/msg");
	model.makeNode("/root/tempData/confirm");
	model.setValue("/root/tempData/msg", str);
	
	var winprops = "caption:hidden; resize:false; align:center; width:"+msgBoxWidth+"px; height:"+msgBoxHeight+"px;";	
	window.load("/common/xrw/showConfirmBox.xrw", "modal", "msgBox", winprops, "root/tempData/msg", "root/tempData/msg");
}
/**************************************************************************************************
* @function : showPromptBox()
* @param : str
* @wirter : �����
* @write date : 2010-03-26
* @modify datae :
* @description : Prompt �ڽ�
* 				str : �޼���
**************************************************************************************************/
function showPromptBox(str)
{
	var msgBoxWidth = 300;
	var msgBoxHeight = 220;
	
	var pw = window.width / 2;
	var ph = window.height / 2;

	model.makeNode("/root/tempData/msg");
	model.makeNode("/root/tempData/confirm");
	model.makeNode("/root/tempData/result");
	model.setValue("/root/tempData/msg", str);
	
	var winprops = "caption:hidden; resize:false; left:"+pw+"; top:"+ph+"; width:"+msgBoxWidth+"px; height:"+msgBoxHeight+"px;";
	
	window.load("/common/xrw/showPromptBox.xrw", "modal", "msgBox", winprops, "root/tempData/msg", "root/tempData/msg");
}
/**************************************************************************************************
* @function : showErrorMsgBox()
* @param : code, str
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : �����޼��� �ڽ�
* 				code : error msg
*				str  : msg
**************************************************************************************************/
function showErrorMsgBox(refPath)
{
	var msgBoxWidth = 500;
	var msgBoxHeight = 300;

	var pw = parseInt((window.width - msgBoxWidth) / 2) + window.left;
	var ph = parseInt((window.height - msgBoxHeight) / 2) + window.top;

	var winprops = "caption:hidden; resize:false; align:center; width:"+msgBoxWidth+"px; height:"+msgBoxHeight+"px;";
	window.load("/common/xrw/showErrMsgBox.xrw", "modal", "msgBox", winprops, refPath, "root/errData");
}

/**************************************************************************************************
* @function : setStatusMsg()
* @param : str, code
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : status bar setting
* 				code : error msg
*				str  : msg
**************************************************************************************************/
function setStatusMsg(str, code)
{
	outStatus1.value = str;

	if (code == "ALERT") {
		outStatus1.attribute("background-image") = "/images/mainFrame/mdi_status_icon_a.gif";
		outStatus1.attribute("color") = "#FA4912";
	}
	else {
		outStatus1.attribute("background-image") = "/images/mainFrame/mdi_status_icon.gif";
		outStatus1.attribute("color") = "#19519B";
	}
}

/**************************************************************************************************
* @function : setStatusMsg()
* @param : str, code
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : status bar setting
**************************************************************************************************/
function setStatusBarInfo(){

	var obj = htmldocument.SessionInfo;
	
	model.setvalue("/root/initData/pageInfo/statusID",obj.ss_id.value);
	model.setvalue("/root/initData/pageInfo/statusName",obj.ss_nm.value);

	model.refresh();
}

/**************************************************************************************************
* @function : createComboItemsetStatusMsg()
* @param : node, label, value
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : �޺��� �������� ����
*				�޺��� nodeset�� �ݵ�� item/label, value ����
				node : �޺��� �߰��� node
				label : �޺��� Label
				value : �޺��� value
**************************************************************************************************/
function createComboItem(node, label, value)
{			
	var ins = model.instances(0);
	
	var newItem = ins.createNode( "element", "item", "" );
	node.appendChild(newItem);	// item ��� �����
	
	var lastItem = node.lastChild;	// �׻� ������ item ���
	
	var newValue = ins.createNode( "element", "value", "" );
	newValue.value = value;
	lastItem.appendChild(newValue);
	
	var newLabel = ins.createNode( "element", "label", "" );
	newLabel.value = label;
	lastItem.appendChild(newLabel);
}

/**************************************************************************************************
* @function : createGridRow()
* @param : nodeset, mdiTitle, mdiID
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : status bar setting
*				
**************************************************************************************************/
function createGridRow(nodeset, mdiTitle, mdiID)
{
	var ins = model.instances(0);
	var node = ins.selectSingleNode(nodeset);
	
	var newItem = ins.createNode("element", "data", "");
	node.appendChild(newItem);	// data ��� �����
	
	var lastItem = node.lastChild;	// �׻� ������ data ���
	
	var newID = ins.createNode( "element", "mdiID", "" );
	newID.text = mdiID;
	lastItem.appendChild(newID);
	
	var newTitle = ins.createNode( "element", "mdiTitle", "" );
	newTitle.text = mdiTitle;
	lastItem.appendChild(newTitle);
}

/**************************************************************************************************
* @function : convertCase()
* @param : event, inputmode
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : keypress �� �Է� ��Ʈ�ѿ� ��ҹ��� ��ȯ
*				event : event object
*				inputmode : U  �빮�� �Է½�
*				inputmode : L  �ҹ��� �Է½�
**************************************************************************************************/
function convertCase(event, inputmode)
{
   if ( (inputmode == "U") && (97 <= event.keyCode && event.keyCode <= 122) ) {
       event.keyCode -= 32;
       return;
   }
   else if ( (inputmode == "L") && (65 <= event.keyCode && event.keyCode <= 90) ) {
       event.keyCode += 32;
       return;
   }
}

/**************************************************************************************************
* @function : trim(), ltrim(), rtrim()
* @param : str
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : ���ڿ����� ����, �������� ������ ����
*				str  : ���ڿ�
**************************************************************************************************/
/*
function trim(str)
{
	return str;
//	return str.replace(/(^\s*)|(\s*$)/g, "");
}
*/

function ltrim(str)
{
	return str.replace(/(^\s*)/g, "");
}

function rtrim(str)
{
	return str.replace(/(\s*$)/g, "");
}

/**************************************************************************************************
* @function : getDate()
* @param :  (default: "yyyymmdd")
*			format : "yyyymmdd", "yyyy-mm-dd", "yyyy/mm/dd", yyyymm, yyyy-mm, yyyy/mm
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : ���� ���� �ý����� ��¥�� ��ȯ
**************************************************************************************************/
function getDate(format)
{
	var date = new Date();

	var y = date.getYear();
	var m = date.getMonth() + 1;
	var d = date.getDate();

	var ret = "";

	if (format == "yyyymmdd" || format == null)
	{
		ret += y;
		ret += (m < 10 ) ? "0" + m : m;
		ret += (d < 10 ) ? "0" + d : d;
	}
	else if (format == "yyyy-mm-dd")
	{
		ret += y;
		ret += "-";
		ret += (m < 10 ) ? "0" + m : m;
		ret += "-";
		ret += (d < 10 ) ? "0" + d : d;
	}
	else if (format == "yyyy/mm/dd")
	{
		ret += y;
		ret += "/";
		ret += (m < 10 ) ? "0" + m : m;
		ret += "/";
		ret += (d < 10 ) ? "0" + d : d;
	}	
	else if (format == "yyyymm")
	{
		ret += y;
		ret += (m < 10 ) ? "0" + m : m;
	}
	else if (format == "yymmdd")
	{
		ret += y;
		ret = ret.substr(2);
		ret += (m < 10 ) ? "0" + m : m;
		ret += (d < 10 ) ? "0" + d : d;
	}
	else {
		// ���� ó��
		ret = "";
	}

	return ret;
}

/**************************************************************************************************
* @function : getTime()
* @param :  (default: "hhnnss")
*			format : "hhnnss", "hhnn", "hh:nn:ss", "hh:nn" (default: "hhnnss")
* @wirter : �Ľ����� ������
* @write date : 2006-04-04
* @modify datae :
* @description : ���� ���� �ý����� �ð��� ��ȯ
**************************************************************************************************/
function getTime(format)
{
	var date = new Date();

	var h = date.getHours();
	var n = date.getMinutes();
	var s = date.getSeconds();

	var ret = "";

	if (format == "hhnnss" || format == null)
	{
		ret += (h < 10 ) ? "0" + h : h;
		ret += (n < 10 ) ? "0" + n : n;
		ret += (s < 10 ) ? "0" + s : s;
	}
	else if (format == "hhnn")
	{
		ret += (h < 10 ) ? "0" + h : h;
		ret += (n < 10 ) ? "0" + n : n;
	}
	else if (format == "hh:nn:ss")
	{
		ret += (h < 10 ) ? "0" + h : h;
		ret += ":";
		ret += (n < 10 ) ? "0" + n : n;
		ret += ":";
		ret += (s < 10 ) ? "0" + s : s;
	}
	else if (format == "hh:nn")
	{
		ret += (h < 10 ) ? "0" + h : h;
		ret += ":";
		ret += (n < 10 ) ? "0" + n : n;
	}
	else {
		// ���� ó��
		ret = "";
	}

	return ret;
}