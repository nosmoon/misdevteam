/**************************************************************************************************
* @function : getProperty()
* @param : key
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : property 가져하기
* 				key : property 이름
**************************************************************************************************/
function getProperty(key)
{
	return model.property(key);
}

/**************************************************************************************************
* @function : setProperty()
* @param : key, value
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : property 저장하기
* 				key : property 이름
* 				value : property 값
**************************************************************************************************/
function setProperty(key, value)
{
	model.property(key) = value;
}

/**************************************************************************************************
* @function : commSubmit
* @param submitID, action, refresh, type 
* @return 
* @wirter : 컴스퀘어
* @write date : 2006-09-07
* @modify datae : 
* @description 서브미션 실행
* 				submitID 	: 서브미션ID
* 				action		: url 
				[refresh]	: 서브미션이후의 refresh 여부 default 값 true
				[type]		: 서브미션 타입지정 파일업로드시 'file' 적용 default post 
**************************************************************************************************/

function commSubmit(submitID,action,refresh,type) {
		
		body.disabled = true;
		var mediatype="";
		if(!body.isChild(submitID)) {
		model.createChild("xforms:submission","id:"+submitID+";"); //서브미션 동적으로 생성
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
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : 메세지 박스
* 				str : 메세지
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
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : confirm 박스
* 				str : 메세지
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
* @wirter : 노상현
* @write date : 2010-03-26
* @modify datae :
* @description : Prompt 박스
* 				str : 메세지
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
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : 에러메세지 박스
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
* @wirter : 컴스퀘어 이재훈
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
* @wirter : 컴스퀘어 이재훈
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
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : 콤보의 아이템을 생성
*				콤보의 nodeset은 반드시 item/label, value 구조
				node : 콤보를 추가할 node
				label : 콤보의 Label
				value : 콤보의 value
**************************************************************************************************/
function createComboItem(node, label, value)
{			
	var ins = model.instances(0);
	
	var newItem = ins.createNode( "element", "item", "" );
	node.appendChild(newItem);	// item 노드 만들기
	
	var lastItem = node.lastChild;	// 항상 마지막 item 노드
	
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
* @wirter : 컴스퀘어 이재훈
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
	node.appendChild(newItem);	// data 노드 만들기
	
	var lastItem = node.lastChild;	// 항상 마지막 data 노드
	
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
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : keypress 시 입력 컨트롤에 대소문자 변환
*				event : event object
*				inputmode : U  대문자 입력시
*				inputmode : L  소문자 입력시
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
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : 문자열내의 왼쪽, 오른쪽의 공백을 제거
*				str  : 문자열
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
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : 현재 로컬 시스템의 날짜를 반환
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
		// 에러 처리
		ret = "";
	}

	return ret;
}

/**************************************************************************************************
* @function : getTime()
* @param :  (default: "hhnnss")
*			format : "hhnnss", "hhnn", "hh:nn:ss", "hh:nn" (default: "hhnnss")
* @wirter : 컴스퀘어 이재훈
* @write date : 2006-04-04
* @modify datae :
* @description : 현재 로컬 시스템의 시간을 반환
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
		// 에러 처리
		ret = "";
	}

	return ret;
}