/*************************************************************************************************/
/* 0. Global Event 관련 함수 (Event)
/* 1)  onclick     : 
/* 2)  onmouseup   : 
/* 3)  onmousedown : datagrid 원클릭으로 edit모드, comboBox활성화
/* 4)  onentercell : datagrid 원클릭으로 edit모드, comboBox활성화
/* 5)  eventCheck  : datagrid 원클릭으로 edit모드, comboBox활성화
/* 6)  xforms-ready : page loading시 pageInfo(id,title,authority, button) setting
/*************************************************************************************************/

var gridObj = "";
var ObjstringId = "";
//var showProgressbar = "true";
/*-----------------------------------------------------------------------------------
 * NAME  : onclick()
 * DESC  : datagrid의 onclick 공통
 * PARAM : 
 * DATE  : 
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
function onclick() {
    if(eventCheck()) {
        model.addLog("onclick-Success");
    }
}


/*-----------------------------------------------------------------------------------
 * NAME  : onmouseup()
 * DESC  : datagrid의 onmouseup()
 * PARAM : 
 * DATE  : 
 * AUTH  :  comsquare
 *----------------------------------------------------------------------------------*/
function onmouseup()
{
    try {
        if(ObjstringId != "" && ObjstringId != null) {
            if( gridObj.combo.button.attribute("buttonCheck") == "false" ) {
                gridObj.combo.button.attribute("buttonCheck") = "true";
            }
            
            if( event.target == ObjstringId + ".combo" ) {
                gridObj.combo.button.dispatch("onmousedown");
            }else if( event.target == ObjstringId + ".combo.button" ) {
                if ( gridObj.combo.button.attribute("buttonCheck") == "true" ) {
                    gridObj.combo.button.dispatch("onmousedown");
                }
            }else if( gridObj.colType(gridObj.col) == "input") {
                gridObj.editCell();
            }
        }
    }catch(e){}
    
    grid_onmouseup();
}


/*-----------------------------------------------------------------------------------
 * NAME  : onmousedown()
 * DESC  : datagrid의 onmousedown()
 * PARAM : 
 * DATE  : 
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
function onmousedown()
{
    try {
        var target = event.ptarget;
        
        if( target.elementName == "xhtml:body" || target.elementName == "xhtml:html" ) {
                ObjstringId = "";
        }else if( target.parent.elementName == "xforms:datagrid") {// datagrid header & data
            ObjstringId = target.parent.attribute("id");
            gridObj = document.controls(ObjstringId);
        }else{
            ObjstringId = "";
        }
        
        if(event.target == ObjstringId + ".combo.button") {
            gridObj.combo.button.attribute("buttonCheck") = "false";
        }
    }catch(e){}
    
    grid_onmousedown();
}


/*-----------------------------------------------------------------------------------
 * NAME  : onentercell()
 * DESC  : datagrid의 onentercell()
 * PARAM : 
 * DATE  : 
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
function onentercell(){
    try {
        if(ObjstringId != "" && ObjstringId != null) {
            gridObj.combo.button.attribute("buttonCheck") = "true";
            ObjstringId = "";
            gridObj = "";
        }
    }catch(e){}
}


/*-----------------------------------------------------------------------------------
 * NAME  : eventCheck()
 * DESC  : onclick()시 영역 check하여 event 처리
 * PARAM : 
 * DATE  : 
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
function eventCheck() {
	try {
	    var currtarget = event.currentTarget;
	    if(currtarget.indexOf("_$") != -1) return false;
	    if(currtarget == "body" || currtarget == "html" ) return false;
	    
	    var obj = document.controls(currtarget);
	    var id = obj.attribute("id");
	    
	    if(obj.elementName == "xforms:datagrid") {
	        var ptarget = event.ptarget;
	        var ptargetElementName = ptarget.elementName;
	        if(ptargetElementName == "xforms:datagrid"){//공백부분 이벤트 취소
	            event.stoppropagation();
	            return false;
	        }else if(ptarget.parent.parent.elementName == "xforms:datagrid") {
	            if(ptargetElementName.indexOf("scroll") != -1 ){ event.stoppropagation();return false;}
	            if(ptargetElementName.indexOf("combo") != -1 ) { event.stoppropagation();return false;}
	        }
	        
	        if( obj.iscell(event.target)) {
	            if(obj.row < obj.fixedRows) { //header영역 클릭
	                if( obj.attribute("explorerbar") != "") return true;
	                    event.stopPropagation();
	                    return false;
	            }else {                       //data영역 click
	                if( obj.colattribute(obj.col, "type") == "input" ) {
	                    event.stoppropagation();
	                    return false;
	                }
	                return true;
	            }
	        }
	    }else if(obj.elementName == "xforms:button") {
	        if(obj.attribute("class") == "mybtn") {
	            htmlwindow.focus();
	            event.stopPropagation();
	            return false;
	        }
	    }else{}
	} catch(e) {
	}	    
}


/*-----------------------------------------------------------------------------------
 * NAME  : xforms_ready()
 * DESC  : 글로벌 xforms_ready() pageInfo(id,title,authority, button) setting
 * PARAM : 
 * DATE  : 2009-02-06
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
function xforms_ready(){

    //일반팝업은 패스
    if(window.type == "modal" || window.type == "modeless"){
        if(typeof(parent) != "undefined" && parent.type != "iviewer"){
            return;
        }
    }
    
    //event bubbling
    if ( event.currentTarget != event.target  ) return;
    event.propagate = "stop";
    
    //model.addLog("[CIIS] xforms_ready Start =====");
    var node = instance1.selectSingleNode("/root/initData");
    if ( node == null || node.getElementsByTagName("pageInfo").length < 1 )
    {
        model.makeNode("/root/initData/pageInfo");
    }
    
    //pagetitle
    if(typeof(parent) != "undefined") model.copyNode("/root/initData/pageInfo",parent.root.initData.pageInfo);
    if(typeof(iv_Title) != "undefined"){
	    iv_Title.group_tit.maintitle.text = iv_Title.group_tit.maintitle.value;
    }
    model.refresh();
    
    // 버튼그룹내의 각 버튼 권한별 설정
    btnDisabled();
    
    //model.addLog("[CIIS] xforms_ready End =====");
}

/*-----------------------------------------------------------------------------------
 * NAME  : submit_complete()
 * DESC  : send()가 정상처리여부 판단
 * PARAM : 
 * DATE  : 2009-02-06
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
 function submit_completed(){
    
    var nodeList = instance1.getElementsByTagName("errData");
    if(nodeList.length > 0){
        return false;
    }
    return true;
 }

/*-----------------------------------------------------------------------------------
 * NAME  : xforms_submit()
 * DESC  : 글로벌 xforms_submit progress bar 처리
 * PARAM : 
 * DATE  : 2009-02-06
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
 function xforms_submit(){
    //event bubbling 처리
    if ( event.currentTarget != event.target  ) return;
    
    var nodeList = instance1.getElementsByTagName("errData");
    if(nodeList.length > 0){
        var node = nodeList.item(0);
        var parent = node.parentNode;
        parent.removeChild(node);
    }
    
    var nodeList = instance1.getElementsByTagName("msgData");
    if(nodeList.length > 0){
        var node = nodeList.item(0);
        var parent = node.parentNode;
        parent.removeChild(node);
    }
        
    body.disabled = true;
/*    
    if(showProgressbar != "false"){
    	progressBarStart();
  	}else{
  		showProgressbar = "true";
  	} 
*/  	
	if(model.attribute("showProgressbar") == "true"){
    	progressBarStart();
  	}	  	   

}

/*-----------------------------------------------------------------------------------
 * NAME  : xforms_submit_done()
 * DESC  : 글로벌 submit 후 정상, 에러 메시지 처리
 * PARAM : 
 * DATE  : 2009-02-11
 * AUTH  : 
 *----------------------------------------------------------------------------------*/
function xforms_submit_done(){  //Chcek
    if ( event.currentTarget != event.target  ) return;
    
    body.disabled = false;
    progressBarEnd();

    var subm_id 	= eval(event.currentTarget);

    var subm_resref = subm_id.attribute("resultref");
  
    var tmpArr = subm_resref.split("/");
    var len = tmpArr.length;
    var lastlen = tmpArr[len-1].length;  
    
    var ref_root = "";
    if(subm_resref == "") ref_root = "/root/"
    else ref_root = subm_resref.substring(0, subm_resref.length-lastlen);

    var errCode = model.getValue(ref_root+"errData/errcode");
    var errMsg = model.getValue(ref_root+"errData/errmsg");
    var statusMsg = model.getValue(ref_root+"msgData/statusMsg");

    if(errCode != ""){
        //debugger;
        var refPath = ref_root+"errData";
        		
		if(errCode == "session-out"){
			showErrorMsgBox(refPath);
			//opener = self;
			//self.close();
			window.close();		
			//window.load("http://ciis.chosun.com/index.jsp", "htmlreplace", "", "");
			return;
		}else if(errCode == "system exception"){      //system err            
			showErrorMsgBox(refPath);			                          
            //model.removeNode(refPath);    
        }else{                                  //app err
            showErrorMsgBox(refPath);
            //model.removeNode(refPath);    
        }

    }   

    if(statusMsg == "OK"){
        var refPath = ref_root+"msgData";
        
        var resultMsg = model.getValue(refPath+"/resultMsg");
        //showResultMsgBox(refPath);
        commAlert(resultMsg);
        //model.removeNode(refPath);  
        doResult();
        
    }   
    event.stopPropagation();
    
    
}


function xforms_submit_error(){

    body.disabled = false;
    progressBarEnd();
    
    //var errcode = event.errCode;
    //var errmsg = event.description;

    var errcode = "xforms-submit-error";
    var errmsg = "submit 수행 오류";

    var subm_id = eval(event.currentTarget);
    var subm_resref = subm_id.attribute("resultref");
    
    var tmpArr = subm_resref.split("/");
    var len = tmpArr.length;
    var lastlen = tmpArr[len-1].length;  

    var ref_root = "";
    if(subm_resref == "") ref_root = "/root/"
    else ref_root = subm_resref.substring(0, subm_resref.length-lastlen);
    
    var refPath = ref_root+"errData";
    
    model.makeNode(ref_root+"errData/errcode");
    model.setValue(ref_root+"errData/errcode", errcode);
    model.makeNode(ref_root+"errData/errmsg");
    model.setValue(ref_root+"errData/errmsg", errmsg);

    showErrorMsgBox(refPath);
    model.removeNode(refPath);  

    event.stopPropagation();
    //event.preventDefault(); 

}

/*-----------------------------------------------------------------------------------
 * NAME  : btnDisabled()
 * DESC  : 모든 버튼 En/diable 적용
 * PARAM : groupID, controlID
 * DATE  : 2009-02-06
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
function btnDisabled(objName)
{
    model.addLog("[CIIS] btnDisabled Start =====");
    var obj;
    var childObj;
    var childObj2;
    var cnt;
    var cnt2;
    var id;
    var id2;
    var crud;
    var prevstate="";
    var pcrud = new Array;
    var strCrud = model.getValue("/root/initData/pageInfo/strCrud");
    
    if(objName == null){
        obj = document.body;
    }else{
        obj = document.controls(objName);
    }
    
    cnt = obj.children.length;
    for(var i=0; i<cnt; i++)
    {
        ChildObj = obj.children(i);
        if(ChildObj.elementName == "xforms:button")
        {
            id = ChildObj.attribute("id");
            crud = ChildObj.attribute("crud");
            prevstate = ChildObj.attribute("disabled");
            
            //개발자가 disabled를 true로 설정하여 사용불가능하도록 만든 경우
            //상태값이 변경되지 않도록 기능 추가
            //배상용 과장
            if (prevstate == "true") {
            	//아무것도 하지 않으면 기존 설정 유지
            }
            //crud가 정의되어 있지 않으면 활성화 시킴
            else if(id.indexOf("btnClose") != -1 || id.indexOf("btnReset") != -1){
                ChildObj.disabled = false;
            }else if(strCrud.indexOf(crud) != -1 && crud != ""){
                ChildObj.disabled = false;
            }else if(crud == ""){
                ChildObj.disabled = false;
            }else{
                ChildObj.disabled = true;
            }
                
        }else if(ChildObj.elementName == "xforms:group"){
            btnDisabled(ChildObj.attribute("id"));
        }else if(ChildObj.elementName == "xforms:switch"){
            btnDisabled(ChildObj.attribute("id"));
        }else if(ChildObj.elementName == "xforms:case"){
            btnDisabled(ChildObj.attribute("id"));
        }
    }
    model.addLog("[CIIS] btnDisabled End =====");
}

/***************************************************************************************************************/
/* 배상용 과장 추가
/* 숫자형식의 var 타입에서도 동작하도록 프로토타입 코딩
/* 1 . ProtoType 관련 함수 (Number)
/* 3)  String.prototype.CheckFloat         : 저장된 값이 Float 형인지 점검
/* 4)  String.prototype.GetRound           : 저장된 값을 지정한 자리에서 올림/반올림/버림 처리 GetRound( pPoint, pMode )   
/* 5)  String.prototype.GetTruncate        : 소수점 버리고 정수형 String으로 생성 (음수인경우에도 마찬가지 음수표시는 유효)   
*****************************************************************************************************************/      
Number.prototype.CheckFloat        = CheckFloat;
Number.prototype.GetRound          = GetRound;
Number.prototype.GetTruncate       = GetTruncate;

/***************************************************************************************************************/
/* 1 . ProtoType 관련 함수 (String)
/* 1)  String.prototype.ReplaceWord        : 문자열중의 특정 문자 또는 단어를 찾아 원하는 문자 또는 단어로 치환   
/* 2)  String.prototype.CheckNum           : 저장된 값이 Number 형인지 점검
/* 3)  String.prototype.CheckFloat         : 저장된 값이 Float 형인지 점검
/* 4)  String.prototype.GetRound           : 저장된 값을 지정한 자리에서 올림/반올림/버림 처리 GetRound( pPoint, pMode )   
/* 5)  String.prototype.GetTruncate        : 소수점 버리고 정수형 String으로 생성 (음수인경우에도 마찬가지 음수표시는 유효)   
/* 6)  String.prototype.GetZeroString      : 저장된 숫자 값에 원하는 길이만큼 '0'을 붙여 표현 GetZeroString( pLen )  
/* 7)  String.prototype.GetByteSize        : 파라미터 값의 Byte 크기를 리턴   
/* 8)  String.prototype.Trim               : 문자열 앞뒤에있는 공백 제거   
/* 9)  String.prototype.CheckByteSize      : 문자열의 Byte 크기가 제한값을 벗어나는지 체크 (벗어나면 false 리턴)   
/* 10) String.prototype.CheckEmpty         : 값이 없는지 체크     
/* 11) String.prototype.ReplaceString      : 문자열중의 특정 문자 또는 단어를 찾아 원하는 문자 또는 단어로 치환     
/* 12) String.prototype.TrimLeft           : 문자열 앞에 있는 공백 제거     
/* 13) String.prototype.TrimRight          : 문자열 뒤에 있는 공백 제거     
/* 14) String.prototype.ToLower            : 문자열을 모두 소문자로 변환     
/* 15) String.prototype.ToUpper            : 문자열을 모두 대문자로 변환     
/* 16) String.prototype.GetLength          : 문자열의 길이를 구한다.     
/* 17) String.prototype.IsNull             : 주어진 값이 null인지 확인한다.
/* 18) String.prototype.AmtToHangleName    :  금액을 한글금액으로 변경 
*****************************************************************************************************************/      

String.prototype.ReplaceWord       = ReplaceWord;
String.prototype.CheckNum          = CheckNum;
String.prototype.CheckFloat        = CheckFloat;
String.prototype.GetRound          = GetRound;
String.prototype.GetTruncate       = GetTruncate;
String.prototype.GetZeroString     = GetZeroString;
String.prototype.GetByteSize       = GetByteSize;
String.prototype.Trim              = Trim;
String.prototype.CheckByteSize     = CheckByteSize;
String.prototype.CheckEmpty        = CheckEmpty;
String.prototype.ReplaceString     = ReplaceString;
String.prototype.TrimLeft          = TrimLeft;
String.prototype.TrimRight         = TrimRight;
String.prototype.ToLower           = ToLower;
String.prototype.ToUpper           = ToUpper;
String.prototype.GetLength         = GetLength;
String.prototype.IsNull            = IsNull;
String.prototype.AmtToHangleName   = AmtToHangleName;

/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 문자열중의 특정 문자 또는 단어를 찾아 원하는 문자 또는 단어로 치환
 * <pre>
 *              1. 찾을 단어를 구분자로 분리한 문자열을 저장할 배열 변수지정
 *              2. 치환하여 리턴할 내용을 담을 변수 지정
 *              3. 원본 문자열을 찾을 단어를 구분자로 분리
 *              4. 찾을 단어의 수만큼 loop
 *                  - 찾을 단어 대신 대체 단어를 붙이면서 누적
 *              3. 마지막 찾을 단어의 뒷부분 내용 추가.
 *                  - 찾을 단어가 없었다면 원본 문자열 전체가 됨
 * </pre>
 * @param  : pFindWord    - 찾을 단어
 * @param  : pReplaceWord - 대체 단어
 * @return : String - 대체하고난 문자열
 * @---------------------------------------------------
 */
function ReplaceWord( pFindWord, pReplaceWord ) {
    var vTempArray;
    var vReturnString = "";

    vTempArray = this.split(pFindWord);

    for(var i=0; i<vTempArray.length-1; i++){
        vReturnString += vTempArray[i] + pReplaceWord;
    }

    vReturnString += vTempArray[vTempArray.length-1];

    return vReturnString;
}

//numArray.max( sint,mint )  --- (X)
//numArray.max( sint, mint ) --- (O)


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 저장된 값이 Number 형인지 점검
 * @param  : N/A
 * @return : true/false
 * @---------------------------------------------------
 */
function CheckNum()
{
    if( typeof( this ) == "undefined" ) return false;
    if( this.length == 0 ) return false;

    var vNumber = this.toString();
    for( var i=0; i < vNumber.length; i++ ) {
        var vTemp = vNumber.substring( i, i+1 );

        // 숫자가 아니면 FALSE 리턴
        if( isNaN( vTemp ) ) return false;

        // 공백이면 FALSE 리턴
        if( " " == vTemp ) return false;
    }

    return true;
}


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 저장된 값이 Float 형인지 점검
 * @param  : N/A
 * @return : true/false
 * @---------------------------------------------------
 */
function CheckFloat() {
    // 파라미터 값이 parseFloat()후에도 같으면 TRUE 리턴
    if( this == parseFloat( this ) ) {
    return true;
    } else {
    return false;
    }
}


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 저장된 값을 지정한 자리에서 올림/반올림/버림 처리
 * <pre>
 *           1.
 * </pre>
 * @param  : pPoint - 올림/반올림/버림 할 위치(2:10자리, 1:1자리, -1:소수점이하 첫째자리)
 * @param  : pMode  - 1:올림, 0:반올림, -1:버림
 * @return : Number
 * @---------------------------------------------------
 */
function GetRound( pPoint, pMode ) {
// 파라미터 값을 수치화 하여 변수에 저장
    var vNumber    = eval(this);

    // 소수점을 기준으로 숫자들만 취하여 배열 변수에 저장
    var vTempArray = eval(this).toString().ReplaceWord("-", "").split(".");

    // this 가 float 형이 아니면
    if( !this.CheckFloat() ) {
        //fAlertMessage(4, "파라미터");
        return "";
    }

    // pPoint 가 float 형이 아니면
    if( !pPoint.toString().CheckFloat() ) {
        //fAlertMessage(4, "파라미터");
        return "";
    }

    // 소수점 앞에서 처리하려면
    if(0 < eval( pPoint )) {
        // 소수점 이상 자리수보다 크면
        if( vTempArray[0].length < eval(pPoint) ) {
            // 메시지 처리후 리턴
            //fAlertMessage(1, "올림/반올림/버림 할 위치");
            return "";
        }
    }
    // 소수점 뒤에서 처리하려면
    else if(0 > eval(pPoint)) {
        // 소수점 이하값이 존재하지 않거나 자리수보다 크면
        if(vTempArray.length != 2 || vTempArray[1].length < eval(pPoint)*(-1)) {
        // 메시지 처리후 리턴
        //fAlertMessage(1, "올림/반올림/버림 할 위치");
        //return "";

        return this;
        }
    }

    // '올림'이고
    if(1 == eval(pMode)) {
        // 소수점 앞에서 처리하려면
        if(0 < eval(pPoint)) {
            // 해당 자리(pPoint)에서 올림 처리
            vNumber = Math.ceil(vNumber / Math.pow(10, pPoint)) * Math.pow(10, pPoint);

            return vNumber;
        }
        // 소수점 뒤에서 처리하려면
        else if(0 > eval(pPoint)) {
            // 해당 자리(pPoint)에서 올림 처리
            vNumber = Math.ceil(vNumber * Math.pow(10, pPoint*(-1)-1)) / Math.pow(10, pPoint*(-1)-1);

            return vNumber;
        }
        else {
            //fAlertMessage(4, "올림자리");
            return "";
        }
    }
    // '반올림'이고
    else if(0 == eval(pMode)) {
        // 소수점 앞에서 처리하려면
        if(0 < eval(pPoint)) {
            // 해당 자리(pPoint)에서 반올림 처리
            vNumber = Math.round(vNumber / Math.pow(10, pPoint)) * Math.pow(10, pPoint);

            return vNumber;
        }
        // 소수점 뒤에서 처리하려면
        else if(0 > eval(pPoint)) {
            // 해당 자리(pPoint)에서 반올림 처리
            vNumber = Math.round(vNumber * Math.pow(10, pPoint*(-1)-1)) / Math.pow(10, pPoint*(-1)-1);

            return vNumber;
        }
        else {
            //fAlertMessage(4, "올림자리");
            return "";
        }
    }
    // '버림'이고
    else if(-1 == eval(pMode)) {
        // 소수점 앞에서 처리하려면
        if(0 < eval(pPoint)) {
            // 해당 자리(pPoint)에서 내림 처리
            vNumber = Math.floor(vNumber / Math.pow(10, pPoint)) * Math.pow(10, pPoint);

            return vNumber;
        }
        // 소수점 뒤에서 처리하려면
        else if(0 > eval(pPoint)) {
            // 해당 자리(pPoint)에서 내림 처리
            vNumber = Math.floor(vNumber * Math.pow(10, pPoint*(-1)-1)) / Math.pow(10, pPoint*(-1)-1);

            return vNumber;
        }
        else {
        //fAlertMessage(4, "올림자리");
        return "";
        }
    }
    // 모두 아니면
    else {
        // 메시지 처리후 리턴
        //fAlertMessage(1, "모드('1'/'0'/'-1')");
        return "";
    }
}


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 소수점 버리고 정수형 String으로 생성 (음수인경우에도 마찬가지 음수표시는 유효)
 * @param  : N/A
 * @return : Number
 * @---------------------------------------------------
 */
function GetTruncate() {
    var TempArray = new Array();
    TempArray = this.split(".");
    return TempArray[0];
}


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   :  저장된 숫자 값에 원하는 길이만큼 '0'을 붙여 표현
 * @param  : pLen - 돌려받을 최종문자의 길이
 * @return : 지정길이보다 모자른경우 "0"값이 추가된 문자열
 * @return : 지정길이보다 큰경우 원래 문자열을 반환
 * @---------------------------------------------------
 */
function GetZeroString( pLen ) {
    var sTemp = eval(this);
    if (this.length > pLen) return this;

    for( var iCnt = this.length; iCnt < pLen; iCnt++){
        sTemp = "0" + sTemp;
    }

    return sTemp;
}


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 파라미터 값의 Byte 크기를 리턴
 * @param  : N/A
 * @return : 파라미터 값의 Byte 크기
 * @---------------------------------------------------
 */
function GetByteSize() {
    // Byte 수를 저장할 변수
    var vByteSize = 0;

    // Value 값의 길이만큼 loop
    for(var i=0; i<this.length; i++) {
        //한글이 들어오면 255보다 크다
        if(this.charCodeAt(i) > 255) vByteSize += 2;
        else vByteSize += 1;
    }

    return vByteSize;
}


/**
 * @group  : String 확장
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 문자열 앞뒤에있는 공백 제거
 * @param  : N/A
 * @return : 공백을 제거한 결과 문자열
 * @---------------------------------------------------
 */
function Trim() {
    return this.TrimRight().TrimLeft();
}


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 문자열의 Byte 크기가 제한값을 벗어나는지 체크 (벗어나면 false 리턴)
 * @param  : pSize - 제한크기
 * @return : TRUE or FALSE
 * @---------------------------------------------------
 */
function CheckByteSize(pSize) {
    if(this.GetByteSize() <= eval(pSize)) return true;
    return false;
}


/**
 * @group  : String 확장
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 값이 없는지 체크
 * @param  : N/A
 * @return : TRUE or FALSE
 * @---------------------------------------------------
 */
function CheckEmpty() {
    if(this.Trim() == "") {
        return false;
    }
    return true;   // 공백이 아니라면

}


/**
 * @group  : String 확장
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 문자열중의 특정 문자 또는 단어를 찾아 원하는 문자 또는 단어로 치환
 * @param  : pOldStr - 찾을 단어   pNewStr - 대체 단어
 * @return : 대체하고난 문자열
 * @---------------------------------------------------
 */
function ReplaceString(pOldStr, pNewStr) {
    var vTempArray;
    var vReturnString = "";

    vTempArray = this.split(pOldStr);

    for(var i=0; i<vTempArray.length-1; i++) {
        vReturnString += vTempArray[i] + pNewStr;
    }

    vReturnString += vTempArray[vTempArray.length-1];

    return vReturnString;
}


/**
 * @group  : String 확장
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 문자열 앞에 있는 공백 제거
 * @param  : N/A
 * @return : 공백을 제거한 결과 문자열
 * @---------------------------------------------------
 */
function TrimLeft() {
    return this.replace(/(^\s*)/g, "");
}


/**
 * @group  : String 확장
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 문자열 뒤에 있는 공백 제거
 * @param  : N/A
 * @return : 공백을 제거한 결과 문자열
 * @---------------------------------------------------
 */
function TrimRight() {
    return this.replace(/(\s*$)/g, "");
}


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 문자열을 모두 소문자로 변환
 * @param  : N/A
 * @return : 문자열
 * @---------------------------------------------------
 */
function ToLower(){
    return this.toLowerCase();
}


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 문자열을 모두 대문자로 변환
 * @param  : N/A
 * @return : 문자열
 * @---------------------------------------------------
 */
function ToUpper(){
    return this.toUpperCase();
}


/**
 * @group  : String 확장
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : 문자열의 길이를 구한다.
 * @param  : N/A
 * @return : 문자열의 길이
 * @---------------------------------------------------
 */
function GetLength() {
    return this.length;
}


/**
 * @type   : function
 * @access : public
 * @desc   : 주어진 값이 null인지 확인한다.
 *    <pre>
 *        IsNull();
 *    </pre>
 * @sig    : value
 * @param  : value   - null 체크할 값  
 * @return : boolean - true/false
 */
function IsNull() {
    if(this.indexOf("_") != -1) {
        return false;
    }
    
    var oMsg=null,bNull=true;
    if(this.indexOf("_") == -1) 
    return false;

    try {
        oMsg = eval("window."+this);
        bNull = (typeof oMsg == 'undefined')?true:false;
    } catch(e) {
        if(e =='[object Error]') {
            try {
                oMsg = eval(this);
                if(oMsg != null) bNull = false;
            } catch (e) {
                bNull = true;
            }
        } else
            bNull = false;
    }
    
    return bNull;
}


/*  
 * @type   : function
 * @access : public
 * @desc   : 금액을 한글금액으로 변경
 *    <pre>
 *        var amtNm = commamtToHangleName(amt);
 *    </pre>
 * @sig    : amt
 * @param  : amt    - 한글로 바꿀 금액 
 * @return : string - 한글금액
 */ 
function AmtToHangleName() {
    var amt = this;
    var unitNm = ["천","백","십","조","천", "백","십","억","천","백","십","만","천","백","십","원"] ;
    var numNm = ["","일","이","삼","사","오","육","칠","팔","구"];
    var amtNm = "";
    
    for ( var i = 0 ; i < amt.length ; i++ ){
        var num = numNm[amt.charAt(i)] ;
        var idx = unitNm.length - amt.length + i ;
        if ( num != "" || (idx+1)/4 == Math.ceil((idx+1)/4 )) {
            amtNm += num + unitNm[idx] ;
        }                       
    }                   
    return amtNm; //+ "정";
}


/***************************************************************************************************************/
/* 2 . Validation 관련 함수
/* 1)   commIsValidMonth    :  유효한(존재하는) 월(月)인지 체크.
/* 2)   commIsValidHour     :  유효한(존재하는) 시(時)인지 체크.
/* 3)   commIsValidMin      :  유효한(존재하는) 분(分)인지 체크.
/* 4)   commIsValidSecond   :  유효한(존재하는) 초(秒)인지 체크.
/* 5)   commGhkCal          :  날짜를 입력받는 input 컨트롤의 유효성 검사.
/* 6)   commGhkMonth        :  월을 입력받는 input 컨트롤의 유효성 검사
/* 7)   commGhkTerm         :  날짜를 입력받는 from~to input 컨트롤의 유효성 검사
/* 8)   commGhkDateHM       :  날짜형(일자와 시간, 분) input 컨트롤의 유효성 검사
/* 9)   commGhkDateHMS      :  날짜형(일자와 시간, 분, 초) input 컨트롤의 유효성 검사
/* 10)  commIsNull          :  주어진 값이 null인지 확인한다.
/* 11)  commCheckRrnoVal    :  주민번호 유효성 체크
/* 12)  commCheckBrnoVal    :  사업자 등록번호 유효성 체크
/* 13)  commCheckCrnoVal    :  법인번호 유효성 체크
/* 14)  commValidateTelNo   :  전화번호의 validation을 확인한다.
/* 15)  commValidateEmail   :  이메일주소의 validation을 확인한다.
/****************************************************************************************************************/

/**
 * @type   : function
 * @access : public
 * @desc   : 유효한(존재하는) 월(月)인지 체크.
 *    <pre>
 *        if (!commIsValidMonth("12"))
 *    </pre>
 * @sig    : mm
 * @param  : mm - 체크할 월
 * @return : boolean - 유효여부
 */ 
function commIsValidMonth(mm) {
    var m = parseInt(mm,10);
    return (m >= 1 && m <= 12);
}


/**
 * @type   : function
 * @access : public
 * @desc   : 유효한(존재하는) 시(時)인지 체크.
 *    <pre>
 *        if (!commIsValidHour("12")) 
 *    </pre> 
 * @sig    : hh
 * @param  : hh - 체크할 시
 * @return : boolean  유효여부
 */ 
function commIsValidHour(hh) {
    var h = parseInt(hh,10);
    return (h >= 0 && h <= 23);
}


/**
 * @type   : function
 * @access : public
 * @desc   : 유효한(존재하는) 분(分)인지 체크.
 *    <pre>
 *        if (!commIsValidMin("12")) 
 *    </pre> 
 * @sig    : mi
 * @param  : mi      - 체크할 분  
 * @return : boolean - 유효여부
 */ 
function commIsValidMin(mi) {
    var m = parseInt(mi,10);
    return (m >= 0 && m <= 59);
}


/**
 * @type   : function
 * @access : public
 * @desc   : 유효한(존재하는) 초(秒)인지 체크.
 *    <pre>
 *        if (!commIsValidSecond("12")) 
 *    </pre> 
 * @sig    : ss
 * @param  : ss      - 체크할 초
 * @return : boolean - 유효여부
 */
function commIsValidSecond(ss) {
    var m = parseInt(ss,10);
    return (m >= 0 && m <= 59);
}


/**
 * @type   : function
 * @access : public
 * @desc   : 날짜를 입력받는 input 컨트롤의 유효성 검사.
 *    <pre>
 *        if (!commGhkCal("/root/input_date")) 
 *    </pre> 
 * @sig    : chkRef
 * @param  : chkRef  - 체크할 control의 ref
 * @return : boolean - 유효여부
 */ 
function commGhkCal( chkRef ) {
    var s = model.getValue(chkRef);
    if ( s.length < 8 ) return false;
    
    var iYear = s.substr(0,4);
    var iMonth = s.substr(4,2);
    var iDay = s.substr(6,2);
    var monthArr = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
    
    if( iMonth == 2 ) {
        if ( ( (iYear % 4 == 0) && (iYear % 100 != 0) ) || (iYear % 400 == 0) ) {
            monthArr[1] = "29";
        }
    }
    
    if( iYear < 9999 && iYear > 0 && iMonth <= 12 && iMonth > 0 && iDay <= monthArr[iMonth-1] && iDay > 0 ) {
        return true;
    }
    
    return false;
}


/**
 * @type   : function
 * @access : public
 * @desc   : 월를 입력받는 input 컨트롤의 유효성 검사     
 *    <pre>
 *        if (!commchkMonth("/root/input_month")) 
 *    </pre>
 * @sig    : chkRef
 * @param  : chkRef  - 체크할 input의 Ref  
 * @return : boolean - 유효여부
 */
function commGhkMonth( chkRef ) {
    var s = model.getValue(chkRef);
    if ( s.length < 6 ) return false;
    
    var iYear = s.substr(0,4);
    var iMonth = s.substr(4,2);
    
    if( iYear < 9999 && iYear > 0 && iMonth <= 12 && iMonth > 0 ) {
        return true;
    }
    
    return false;
}

/**
 * @type   : function
 * @access : public
 * @desc   : 날짜를 입력받는 from~to input 컨트롤의 유효성 검사    
 *    <pre>
 *        if (!commchkTerm( "/root/inputFrom", "/root/inputTo" )) 
 *    </pre>
 * @sig    : chkRefFrom, chkRefTo
 * @param  : chkRefFrom  - 체크할 inputFrom의 Ref  
 * @param  : chkRefTo    - 체크할 inputTo의 Ref  
 * @return : boolean     - 유효여부
 */
function commGhkTerm( chkRefFrom, chkRefTo ) {

    var rtnVal = false;
    
    if ( commGhkCal(chkRefFrom) && commGhkCal(chkRefTo) ) {
        if ( model.getValue(chkRefFrom) <= model.getValue(chkRefTo) ) {
            rtnVal = true;
        }
    }
    return rtnVal;
}


/**
 * @type   : function
 * @access : public
 * @desc   : 날짜형(일자와 시간, 분) input 컨트롤의 유효성 검사    
 *    <pre>
 *        if (!commchkDateHM("/root/inputDate")) 
 *    </pre>
 * @sig    : chkRef
 * @param  : chkRef  - 체크할 inputFrom의 Ref  
 * @return : boolean - 유효여부
 */
function commGhkDateHM( chkRef ) {
    var rtnVal = false;
    var s = model.getValue(chkRef);
    if ( s.length < 12 ) return false;
    
    var iHour = s.substr(8,2); 
    var iMin  = s.substr(10,2); 
    
    if ( commGhkCal( chkRef ) && commIsValidHour(iHour) && commIsValidMin(iMin) ) {
        rtnVal = true ;
    }
    
    return rtnVal;
}


/**
 * @type   : function
 * @access : public
 * @desc   : 날짜형(일자와 시간, 분, 초) input 컨트롤의 유효성 검사    
 *    <pre>
 *        if (!commchkDateHMS("/root/inputDate")) 
 *    </pre>
 * @sig    : chkRef
 * @param  : chkRef  - 체크할 inputFrom의 Ref  
 * @return : boolean - 유효여부
 */
function commGhkDateHMS( chkRef ) {
    var rtnVal = false;
    var s = model.getValue(chkRef);
    if ( s.length < 14 ) return false;
    
    var iHour = s.substr(8,2); 
    var iMin  = s.substr(10,2); 
    var iSec  = s.substr(12,2); 
    
    if ( commGhkCal( chkRef ) && commIsValidHour(iHour) && commIsValidMin(iMin) && commIsValidSecond(iSec) ) {
        rtnVal = true ;
    }
    
    return rtnVal;
}


/**
 * @type   : function
 * @access : public
 * @desc   : 주민번호 유효성 체크 
 *    <pre>
 *        commcheckRrnoVal("6601011234567");
 *    </pre>
 * @sig    : val
 * @param  : val     - 체크할 주민등록번호값
 * @return : boolean - 유효여부
 */
function commCheckRrnoVal(val) {
    if ( val.length < 13 ) {
        commAlert("주민등록번호의 자릿수가 잘못 입력되었습니다.");
        return false;
    }
    
    var varCk1 = val.substring(0,6);
    var varCk2 = val.substring(6);
    
    var ckValue = new Array(13);
    var ckLastid,ckMod,ckMinus,ckLast;
    
    ckLastid    = parseFloat(varCk2.substring(6,7));
    ckValue[0]  = parseFloat(varCk1.substring(0,1))  * 2;
    ckValue[1]  = parseFloat(varCk1.substring(1,2))  * 3;
    ckValue[2]  = parseFloat(varCk1.substring(2,3))  * 4;
    ckValue[3]  = parseFloat(varCk1.substring(3,4))  * 5;
    ckValue[4]  = parseFloat(varCk1.substring(4,5))  * 6;
    ckValue[5]  = parseFloat(varCk1.substring(5,6))  * 7;
    ckValue[6]  = parseFloat(varCk2.substring(0,1))  * 8;
    ckValue[7]  = parseFloat(varCk2.substring(1,2))  * 9;
    ckValue[8]  = parseFloat(varCk2.substring(2,3))  * 2;
    ckValue[9]  = parseFloat(varCk2.substring(3,4))  * 3;
    ckValue[10] = parseFloat(varCk2.substring(4,5))  * 4;
    ckValue[11] = parseFloat(varCk2.substring(5,6))  * 5;
    ckValue[12] = 0;
    
    for (var i = 0; i<12;i++) {
        ckValue[12] = ckValue[12] + ckValue[i];
    }
    ckMod   = ckValue[12] %11;
    ckMinus = 11 - ckMod;
    ckLast  = ckMinus % 10;
    if (ckLast != ckLastid) {
        alert ("잘못된 주민등록번호입니다. 다시 확인해 주십시오");
        return false;
    } else {
        return true;
    }
}


/**
 * @type   : function
 * @access : public
 * @desc   : 사업자 등록번호 유효성 체크 
 *    <pre>
 *        commcheckBrnoVal("1231212345");
 *    </pre>
 * @sig    : val
 * @param  : val     - 체크할 사업자 등록번호
 * @return : boolean - 유효여부
 */
function commCheckBrnoVal(val) {
    
    if ( val.length < 10 ) {
        commAlert("사업자등록번호의 자릿수가 잘못 입력되었습니다.");
        return false;
    }
    
    var varCk1 = val.substring(0,3);
    var varCk2 = val.substring(3,5);
    var varCk3 = val.substring(5);
    
    var ckValue = new Array(10);
    
    ckValue[0] = ( parseFloat(varCk1.substring(0 ,1))  * 1 ) % 10;
    ckValue[1] = ( parseFloat(varCk1.substring(1 ,2))  * 3 ) % 10;
    ckValue[2] = ( parseFloat(varCk1.substring(2 ,3))  * 7 ) % 10;
    ckValue[3] = ( parseFloat(varCk2.substring(0 ,1))  * 1 ) % 10;
    ckValue[4] = ( parseFloat(varCk2.substring(1 ,2))  * 3 ) % 10;
    ckValue[5] = ( parseFloat(varCk3.substring(0 ,1))  * 7 ) % 10;
    ckValue[6] = ( parseFloat(varCk3.substring(1 ,2))  * 1 ) % 10;
    ckValue[7] = ( parseFloat(varCk3.substring(2 ,3))  * 3 ) % 10;
    ckTemp     = parseFloat(varCk3.substring(3 ,4))  * 5  + "0";
    ckValue[8] = parseFloat(ckTemp.substring(0,1)) + parseFloat(ckTemp.substring(1,2));
    ckValue[9] = parseFloat(varCk3.substring(4,5));
    ckLastid = ( 10 - ( ( ckValue[0]+ckValue[1]+ckValue[2]+ckValue[3]+ckValue[4]+ckValue[5]+ckValue[6]+ckValue[7]+ckValue[8] ) % 10 ) ) % 10;
    if (ckValue[9] != ckLastid) {
        alert ("잘못된 사업자등록번호입니다. 다시 확인해 주십시오");
        return false;
    } else {
        return true;
    }
}


/**
 * @type   : function
 * @access : public
 * @desc   : 법인번호 유효성 체크 
 *    <pre>
 *        commCheckCrnoVal("1231212345");
 *    </pre>
 * @sig    : varCk
 * @param  : varCk   - 체크할 법인번호
 * @return : boolean - 유효여부
 */
function commCheckCrnoVal(varCk) {
    
    if ( varCk.length < 13 ) {
        commAlert("법인번호의 자릿수가 잘못 입력되었습니다.");
        return false;
    }
    
    var checkNum = new Array("1","2","1","2","1","2","1","2","1","2","1","2");

    //등기관서별 분류번호, 법인종류별 분류번호 및 일련번호를 차례로 연결한 12자리
    //의 숫자를 만든다.
    var newNum = new Array();
    for(var i = 0; i < varCk.length -1; i++)
        newNum[i] = varCk.charAt(i);
    
    //각 숫자에 차례로 1과 2를 곱한 다.값을 모두 더하여 합을 구한다.
    var multiNum = new Array();
    for(var k = 0; k < newNum.length; k++)
        multiNum[k] = checkNum[k] * newNum[k];
    
    //alert("각 숫자에 차례로 1과 2를 곱한 다: "+ multiNum[11]);
    //곱한 값을 모두 더하여 합을 구한다.
    var addNum = 0;
    for(var y = 0; y < multiNum.length; y++)
        addNum = addNum + Number(multiNum[y]);
    
    //alert("곱한 값을 모두 더하여 합을 구한다: "+ addNum);
    //합을 10으로 나누어 몫과 나머지를 구한다.
    var remainder;
    var quota;
    remainder = Number(addNum) % 10;
    quota = Number(addNum) / 10;
    //10에서 나머지를 뺀 값을 오류검색번호로 한다. 다만, 10에서 나머지를 뺀 값이
    //10인 때에는 0을 오류검색번호로 한다.
    var failCheckNum;
    if( (10 - Number(remainder)) == 10 ) {
        failCheckNum = 0;
    } else {
        failCheckNum = 10 - Number(remainder);
    }
    //alert("오류검색번호: "+ failCheckNum);
    if(failCheckNum != varCk.charAt(12)) {
        alert ("잘못된 법인번호입니다. 다시 확인해 주십시오");
        return false;
    }
    return true;
}


/**
 * @type   : function
 * @access : public
 * @desc   : 전화번호의 validation을 확인한다.
 *    <pre>
 *         commvalidateTelNo("12-232-2323");
 *    </pre>
 * @sig    : tel
 * @param  : tel     - 전화번호
 * @return : boolean - 유효?
 */
function commValidateTelNo(tel) {  
    var re = new RegExp("^([0-9]{2,4})(-[0-9]{3,4})(-[0-9]{3,4})","g");
    var resultFind = re.exec(tel);
    return resultFind==null?false:true;
}


/**
 * @type   : function
 * @access : public
 * @desc   : 이메일주소의 validation을 확인한다.
 *    <pre>
 *         commvalidateEmail("doog@moe.com");
 *    </pre>
 * @sig    : tel
 * @param  : tel     - 전화번호
 * @return : boolean - 유효?
 */
function commValidateEmail(email) {
    var re = new RegExp("([\.a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(([a-zA-Z0-9_-])*\.([a-zA-Z0-9_-])+)+");
    var resultFind = re.exec(email);
    return resultFind==null?false:true;
}


/*******************************************************************************************/
/* 3. 날짜관련 및 기타 함수
/* 1)  commCurDate      :  현재날짜가져오기(( y-년, m-월, d-일  ym -년월 등)포맷지정가능
/* 2)  commLastDay      :  해당년월의 마지막 날짜를 구해온다.예)199802->28일 , 200002->29일      
/* 3)  commGetDay       :  yyyyMMdd 형식의 일자를 받아서 요일을 리턴해줌 
/* 4)  commCurDTime     :  현재날짜 + 시간 가져오기
/* 5)  commFirstDay     :  현재달의 첫번째 일을 가져오는 매소드
/* 6)  commLateDate     :  현재날자로 부터 정해진 지난날 가져오는 매소드        
/*******************************************************************************************/                   

/**
 * @type   : function
 * @access : public
 * @desc   : getDate날짜 가져오기( y-년, m-월, d-일  ym -년월 등)
 *    <pre>
 *        if ( commgetStringLength(str) > lgth ) 
 *    </pre>
 * @sig    : str
 * @param  : str     - 문자열
 * @return : int     - 문자열의 byte수
 */
function commCurDate(optSetting) {
    var dte, c_dte="",month;   // 화면의 Calendar 에 월초와  현재 날자를 Setting 한다
    var c_year,c_month,c_day
    dte = new Date();
    
    month = (dte.getMonth() + 1)+"" ;
    
    c_year = dte.getYear();
    
    if(month.length==1) {
        c_month = "0"+(dte.getMonth() + 1 ); 
    } else {
        c_month  = (dte.getMonth() + 1 ); 
    }
    
    var d_ay = dte.getDate()+"";
    
    if(d_ay.length == 1) {
        c_day= "0"+(dte.getDate()); 
    } else {
        c_day = (dte.getDate()); 
    }
    
    //년월일 구하기
    if(optSetting == "ymd" || optSetting == "" || optSetting == null) {
        c_dte =  c_year + "" +c_month +""+ c_day;
    } else if(optSetting == "ym") {
        c_dte = c_year +""+ c_month;
    } else if(optSetting == "y") {
        c_dte = c_year;
    } else if(optSetting == "m") {
        c_dte = c_month;
    } else if(optSetting == "d") {
        c_dte = c_day;
    } else {
        c_dte = false;
    }
    
    return c_dte;
}


//해당년월의 마지막 날짜를 구해온다.예)199802->28일 , 200002->29일
function commLastDay(date){
    
    var ny = date.substring(0,4);
    var nm = date.substring(4,6);
    nm = eval(nm);
    
    var arr_d = new Array('31','28','31','30','31','30','31','31','30','31','30','31');
    
    if(((ny % 4 == 0)&&(ny % 100 !=0)) || (ny % 400 == 0)){
        arr_d[1] = 29;
    }
    
    return arr_d[nm-1];
    
}


/**
 * @type   : function
 * @access : public
 * @desc   : yyyyMMdd 형식의 일자를 받아서 요일을 리턴해줌   
 *    <pre>
 *        var day = commgetDay("20061231");
 *    </pre>
 * @sig    : yyyyMMdd
 * @param  : yyyyMMdd  - 요일로 변환할 일자
 * @return : day       - 요일
 */
function commGetDay(yyyyMMdd)
{
    var week = new Array("일", "월", "화", "수", "목", "금", "토");
    if ( yyyyMMdd.length != 8 ) return;
    var year = yyyyMMdd.substring(0,4);
    var month = yyyyMMdd.substring(4,6);
    var date = yyyyMMdd.substring(6);
    //var day = new Date(parseInt(year),parseInt(month)-1,parseInt(date));
    var day = new Date(year,month-1,date);    
    return week[day.getDay()];
}

/**
 * @type   : function
 * @access : public
 * @desc   : 현재날짜+시간을 가져오는 매소드
 *    <pre>
 *        f_getDTime()
 *    </pre>
 * @sig    : 
 * @param  : 
 * @return : 
 */
function commCurDTime(){

    var now = new Date();
    var hour = now.getHours();
    var minute = now.getMinutes();
    var seconds = now.getSeconds();
    var ampm;
    now = null;
    
    if (hour >= 12) { 
        hour = hour - 12;
        ampm = "오후";
    } else 
        ampm = "오전";
        
        hour = (hour == 0) ? 12 : hour;
        
        if (minute < 10) 
            minute = "0" + minute;
            if (seconds < 10) 
            seconds = "0" + seconds;
            
    return hour + ":" + minute + ":"+seconds;
    // return ampm+" "+hour + ":" + minute + ":"+seconds;
}


/**
 * @type   : function
 * @access : public
 * @desc   : 현재달의 첫번째 일을 가져오는 매소드
 *    <pre>
 *        commFirstDay
 *    </pre>
 * @sig    : 
 * @param  : 
 * @return : 
 */
function commFirstDay(){
    var curDate = "";
    var d = new Date();
    var monString = (d.getMonth() + 1)+"";
    var dateString ="01";
    
    if(monString.length == 1){
        monString = "0" + monString;
    }
    
    curDate += d.getYear();
    curDate += monString;
    curDate += dateString;
    
    return curDate;
}

/**
 * @type   : function
 * @access : public
 * @desc   : 현재날자로 부터 정해진 지난날 가져오는 매소드
 *    <pre>
 *        commLateDate()
 *    </pre>
 * @sig    : 
 * @param  : 
 * @return : 
 */
function commLateDate(ldate){
    ldate =(typeof ldate == 'string')? Number(ldate) : ldate;                       
    var curDate = "";
    var d = new Date;
    d.setDate(d.getDate( ) + ldate);
    var monString = (d.getMonth() + 1)+"";
    var dateString = d.getDate()+"";
    if(monString.length == 1){
        monString = "0" + monString;
    }
    if(dateString.length == 1){
        dateString = "0"+ dateString;
    }
    curDate += d.getYear();
    curDate += monString;
    curDate += dateString;

    return curDate;
}


/***************************************************************************************************************/
/* 2. TF관련 공통함수 (공통개발)
/*
/* 01) commFwdPopClose : 팝업창을 닫으면서 부모창에 노드값을 넘겨준다
/* 02) commMsgCall     : 화면의 하단바에 메시지 생성(작업중)
/* 03) commGroupInit   : 그룹안 컨트롤 값 초기화
/* 04) commComfirmBox  : 확인경고창
/* 05) commGridInit    : 그리드 셀 스타일 초기화
/* 06) commAddRow      : 그리드 행 추가
/* 07) commDelRow      : 그리드 행 삭제
/* 10) commMsgBox      : 메시지 알림창호출
/* 11) commReqCheck    : 필수입력확인
/*****************************************************************************************************************/

/**
* @function    : commFwdPopClose() 
* @param       : arguments 넘겨줄 인스턴스 노드값 (/root/reqData/fwdData/ 밑에 생성됨) 
* @return      : 
* @wirter      : 
* @write date  : 
* @description : 부모창 노드(/root/reqData/fwdData/)으로 팝업창의 노드를 넘겨주고 팝업창을 닫는다.
*/
function commFwdPopClose(){
    try {
        var length = arguments.length;
        
        opener.model.removenode("/root/reqData/fwdData/infoData");
        opener.model.makeNode("/root/reqData/fwdData/infoData");
        
        for(var j = 0; j<length; j++){
            var node1 = instance1.selectSingleNode(arguments[j]);
            opener.model.duplicate("/root/reqData/fwdData/infoData",node1.cloneNode(true));
            }
    }catch (e){
        model.alert("Error", "해당노드의 선택이 잘못되었습니다");
        return false;
    }
    
    window.close()
}

/*
/**
* @function    : commMsgCall() 
* @param       : arguments 메시지코드, 인자값   
* @return      : 
* @wirter      : 
* @write date  : 
* @description : 메시지호출 테스트 하단 bar 에 Msg 설정
*/
function commMsgCall() {
    
    //실제화면작업시
    //  htmlwindow.document.Script.msgCall(msg);        
    //테스트 작업시 
    var msg =""
    var argLength = arguments.length;
    
    if (argLength>1) {
        
        var vTempArray;
        var vReturnString = "";
        
        vTempArray = arguments[0].split("@");
            
        if(vTempArray.length!=(argLength)) {commAlert('인자값의 수가 다릅니다!');  return; }
                
            for(var i=0; i<vTempArray.length-1; i++){
                vReturnString += vTempArray[i] + arguments[(i+1)];
            }
        
            vReturnString += vTempArray[vTempArray.length-1];

            msg = vReturnString;    

        } else {
            msg = arguments[0];
        }

        try {
            parent.capMsg.value= msg;
        }catch(e) {
            capMsg.value= msg;      
    }

        model.refresh();
}


/**
 * @function    :  commGroupInit
 * @access      : public
 * @description : 그룹하위 control 초기화
 * @sig         :
 * @param       :groupid
 * @return      : 없음. 
 */ 
function commGroupInit(groupid){
    var ctrCnt = groupid.children.length;

    for(var j=0 ;  j < ctrCnt ; j++){
    
        var ctr = groupid.children.item( j );
        
        if(ctr.elementName == "xforms:input" ||  ctr.elementName == "xforms:output" || ctr.elementName =="xforms:select1") {
            model.setValue(ctr.attribute("ref"),"");    
        } else if(ctr.elementName == "xforms:datagrid" ) {
            model.removeNodeset(ctr.attribute("nodeset"));
        } 
    }
    groupid.refresh();
}


/**
 * @function    : commConfirmBox
 * @access      : public
 * @description : 윈도우 comfirm 창
 * @sig         : str, title
 * @param       : str   - 나타낼 문자열
 * @param       : title - 제목 
 * @return      : yes 1 , no 0
 */ 
function commConfirmBox(str, title) {
    
    if(title == "" || title == null) title = "확인";
    var MyReturn = model.alert( str, title, 0x20 | 4 );   
    if( MyReturn == 6) return 1;
    else               return 0;
    return MyReturn;

}


/**
 * @function    : commGridInit
 * @access      : public
 * @description : 그리드 셀 스타일과 디세이블 상태를 초기화 시켜준다
 * @sig         : datagrid1
 * @param       : datagrid1   - 그리드 id
 * @return      : 
 */ 
function commGridInit(datagrid1) {
        if( typeof datagrid1 == 'string' ) datagrid1 = document.controls(datagrid1);
        datagrid1.allStyle("data","background-color")= initCellStyle;
        datagrid1.isReadOnly(0,0,(datagrid1.rows-1),(datagrid1.cols-1))=false;
}


/**
 * @function    : commAddRow
 * @access      : public
 * @description : 그리드 행추가
 * @sig         : datagrid1
 * @param       : datagrid1   - 그리드 id
 * @return      : 
 */ 
function commAddRow(datagrid1) {
    if( typeof datagrid1 == 'string' ) datagrid1 = document.controls(datagrid1);
    datagrid1.addRow();
    datagrid1.rowStyle(datagrid1.rows-1,"data","background-color") =insertRowStyle;
    datagrid1.row=datagrid1.rows-1;
    datagrid1.isSelected(datagrid1.rows)=true;
}   


/**
 * @function    : commDelRow
 * @access      : public
 * @description : 그리드 행삭제
 * @sig         : datagrid1
 * @param       : datagrid1   - 그리드 id
 * @return      : 
 */ 
function commDelRow(datagrid1,chkRef) {
    for(var i=datagrid1.rows; i>(datagrid1.fixedRows-1) ; i--) {
        if(datagrid1.valueMatrix(i,datagrid1.colRef(chkRef))=='true') {
            if( datagrid1.rowStatus(i)==1 ||datagrid1.rowStatus(i)==3 ) { 
                datagrid1.deleteRow(i); 
            }else if(datagrid1.rowStatus(i)==4 || datagrid1.rowStatus(i)==0) {
                datagrid1.isReadOnly(i,0,i,(datagrid1.cols-1))=true;
                datagrid1.rowStyle(i,"data","background-color") = deleteRowStyle; 
                datagrid1.addStatus(i,"delete");
            }
        }
    }
}


/**
 * @function    : commMsgBox
 * @access      : public
 * @description : 메시지 알림 창 
 * @sig         : str, title
 * @param       : arguments - 메시지코드, 인자값
 * @return      : 
 */ 
function commMsgBox() {
    var argLength = arguments.length;
    if(argLength==0) {
        
        if(instance1.selectSingleNode("/root/resData/errCode")!=null) {
            
            var msg = model.getValue("/root/resData/errMsg");
            
            if(msg!="" && msg!=null && msg.length>0) {
                model.alert( msg, "알림");   
            }
        }
    } else {
        var msg = arguments[0];
        var vTempArray;
        var vReturnString = "";
        
        vTempArray = arguments[0].split("@");
        
        if(vTempArray.length!=(argLength)) {commAlert('인자값의 수가 다릅니다!');  return; }
        
        for(var i=0; i<vTempArray.length-1; i++) {
            vReturnString += vTempArray[i] + arguments[(i+1)];
        }
        
        vReturnString += vTempArray[vTempArray.length-1];
        
        model.alert( vReturnString, "알림");
    }
}


/**
 * @function    : commReqCheck
 * @access      : public
 * @description : 필수입력 확인 
 * @sig         : 
 * @param       : group ID
 * @return      : 
 */ 
function commReqCheck(group1) {
    var chk =true;
    if( typeof group1 == 'string' ) group1 = document.controls(group1);
    var cnt = group1.children.length;
    
    for(i=0 ; i<cnt ; i++) {
        var ctr = group1.children.item(i);
        if(ctr.elementName=="xforms:input" || ctr.elementName=="xforms:select1") {
            
            if(ctr.attribute("class").substring(0,3)=="req" && model.getValue(ctr.attribute("ref"))=="") {
                commMsgBox(ctr.attribute("caption") + "은(는) 필수입력항목입니다.");
                model.setFocus(ctr.attribute("id"));    
                chk =false;
                break;
            }
        }
    }
    return chk;
}

function doResult(){
}   

 /**
 * @function    : progressBarStart()
 * @access      : public
 * @description : progressBarStart
 * @sig         : 
 * @param       : 
 * @return      : 
 */
function progressBarStart()
{
    var windowWidth = window.width; 
    var windowHeight = window.height; 

    var leftpos = windowWidth / 2 - 100;
    var toppos = windowHeight / 2 - 150;
    
    var flashUrl = model.property("ss_domainnm")+"/flash/progress.swf";
    body.createChild("xforms:object", "id:bar; clsid:{d27cdb6e-ae6d-11cf-96b8-444553540000}; Movie:"+ flashUrl +"; WMode:transparent; left:"+leftpos+"; top:"+toppos+";  width:150; height:150; "); 
    //body.createChild("xforms:img", "id:bar; src:/images/error_08.gif; left:"+leftpos+"; top:"+toppos+";  width:"+width+"; height:"+height+"; background-stretch:stretch; "); 
}


 /**
 * @function    : progressBarEnd()
 * @access      : public
 * @description : progressBarEnd
 * @sig         : 
 * @param       : 
 * @return      : 
 */
function progressBarEnd()
{
    if(document.controls("bar") == null) return;
    body.removeChild("bar");
}

function dateAdd(ymd, shift, currentDate) { 

    var year  = currentDate.substr(0,4);
    var month = currentDate.substr(4,2) - 1; 
    var date  = currentDate.substr(6,2);
    
    var tmp_date = new Date(year, month, date);
            
    if(ymd == 'y'){
        tmp_date.setFullYear(tmp_date.getFullYear() + shift); //y년을 더함
    }else if(ymd == 'm'){
        tmp_date.setMonth(tmp_date.getMonth() + shift);
    }else if(ymd == 'd'){
        tmp_date.setDate(tmp_date.getDate() + shift);  
    }
    
    return toTimeString(tmp_date);
}


/**
 * 자바스크립트 Date 객체를 Time 스트링으로 변환
 * parameter date: JavaScript Date Object
 */
function toTimeString(date) { //formatTime(date)
    var year  = date.getFullYear();
    var month = date.getMonth() + 1; // 1월=0,12월=11이므로 1 더함
    var date  = date.getDate();

    if (("" + month).length == 1) { month = "0" + month; }
    if (("" + date).length   == 1) { date  = "0" + date;   }

    return ("" + year + month + date)
}
    
function getCurrentDate(){
    var date = new Date();
    return toTimeString(date);
}   


function getCurrentMonth(){
    var date = new Date();
    
    var year  = date.getFullYear();
    var month = date.getMonth() + 1; // 1월=0,12월=11이므로 1 더함

    if (("" + month).length == 1) { month = "0" + month; }

    return ("" + year + month);
}   


function validateReq() {

    var chk =true;
    
    var cnt = document.body.children.length;

    for(i=0 ; i<cnt ; i++) {
        var ctr = document.body.children.item(i);

        if(ctr.elementName=="xforms:input" || ctr.elementName=="xforms:select1") {
            if(ctr.attribute("class").substring(0,3)=="req" && model.getValue(ctr.attribute("ref"))=="") {
                commMsgBox(ctr.attribute("caption") + ": 필수 입력사항이 누락되었습니다.");
                model.setFocus(ctr.attribute("id"));    
                chk = false;
                break;
            }
        }
    }
    return chk;
}


function lpad(str, len, pad_str){
    
    if(trim(str.length) == 0) return trim(str);
    
    var rv = "";
    if(str.length < len){
        var tmp = "";
        for(var i=0; i<len-str.length; i++){
            tmp = pad_str + tmp;
        }
        rv = tmp+str;
    }else{
        rv = str;
    }

    return rv;
}
/**
 * trim
 *
 * @param   text
 * @return  string
 */
function trim(text) {
    if (text == "" || text==null) {
        return  text;
    }

    var len = text.length;
    var st = 0;

    while ((st < len) && (text.charAt(st) <= ' ')) {
        st++;
    }

    while ((st < len) && (text.charAt(len - 1) <= ' ')) {
        len--;
    }

    return  ((st > 0) || (len < text.length)) ? text.substring(st, len) : text;
}

/**
 * submission 객체를 스크립트로 만들어서 submit한다.
 * parameter strPath : submit id, action명, ref node, resultref node
 */
function modelSendNoMake(id, action, ref_value, resultref_value) {
    var submissionID = "sub" + id;
    model.createChild("xforms:submission", "id:"+submissionID+"; replace:instance; encoding:utf-8");
    
    // 파라미터  값 세팅
    eval(submissionID).attribute("ref") = ref_value;
    // 리턴받을 res 노드 세팅
    eval(submissionID).attribute("resultref") = resultref_value;
    // 호출할 Actin Class 명 세팅
    eval(submissionID).attribute("action") = action;
    // 기타 세팅
    eval(submissionID).attribute("method") = "post";
    eval(submissionID).attribute("mediatype") = "application/x-www-form-urlencoded";
    model.send(submissionID);
}


/**
 * 콤보 박스에 전체(A), 선택(S), ""의 값을 넣는다.
 * parameter 
 *  - gubun : 전체(A), 선택(S), 공백("") -> value는 ""
 *  - ref_combo_root : 콤보셋 홈경로 xPath
 *  - item_nm : 콤보리스트 레코드명
 *  - ref_label : label명
 *  - ref_value : value명
 * ex) makeComboGubun("A", "/root/initData/comboSet/medi_cd", "item", "label", "value")
 */ 
function makeComboGubun(gubun, ref_combo_root, item_nm, ref_label, ref_value){
    var tempNode = "/root/tempCombo";
    var desNode = ref_combo_root + "/" + item_nm;
    
    var label, value;
    
    model.makeNode(tempNode);
    
    //원 데이타를 임시 노드에 옮긴다.
    model.copyNode(tempNode, ref_combo_root);
    
    if ( gubun == "A" ) {
        label = "전체";
        value = "";
    } else if ( gubun == "S" ){
        label = "선택";
        value = "";
    } else {
        label = " ";
        value = "";
    }
    
    //원 노드를 삭제하고 전체, 선택, ""을 셋팅한다.
    model.removeNodeset(desNode);
    
    model.makeNode(desNode + "/" + ref_label);
    model.makeNode(desNode + "/" + ref_value);
    
    model.setValue(desNode + "/" + ref_label, label);
    model.setValue(desNode + "/" + ref_value, value) ;
    
    //전체, 선택 다음 노드에 원자료를 셋팅한다.
    if ( instance1.selectSingleNode(tempNode + "/" + item_nm) != null ) {
        var arr        = instance1.selectSingleNode(tempNode + "/" + item_nm); 
        var len        = arr.length;
        
        if ( len > 0 ) {
            for ( var i = 1 ; i <= len ; i++ ) {
                model.duplicate(ref_combo_root, tempNode + "/" + item_nm + "[" + i + "]");
            }
        } else {
                model.duplicate(ref_combo_root, tempNode + "/" + item_nm);
        }
    } 
    //임시 노드는 삭제한다.
    model.removeNodeset(tempNode);
    //model.refresh();
    
}


/*
    구우정보기술 배상용(수정이 필요하면 수정 후 전체 공지 해주세요)
    
    특정 날짜에 대해 지정한 값만큼 가감(+-)한 날짜를 반환
    
    입력 파라미터
        pInterval : "y" 는 연도 가감, "m" 은 월 가감, "d" 는 일 가감
        pAddVal  : 가감 하고자 하는 값 (정수형)
        pYyyymmdd : 가감의 기준이 되는 날짜
        pDelimiter : pYyyymmdd 값에 사용된 구분자를 설정 (없으면 "" 입력)
        pDayOpt : "1" 1일, "0" 마지막 날짜, 그외 처리 하지 않음 (옵션처리)

    반환값
        yyyymmdd 또는 함수 입력시 지정된 구분자를 가지는 yyyy?mm?dd 값

    사용예
        2008-01-01 에 3 일 더하기 ==> addDate("d", 3, "2008-08-01", "-");
        20080301 에 8 개월 더하기 ==> addDate("m", 8, "20080301", "");
 --------------------------------------------------------------------------- */
 function addDate(pInterval, pAddVal, pYyyymmdd, pDelimiter, pDayOpt)
 {
     var yyyy;
     var mm;
     var dd;
     var cDate;
     var oDate;
     var cYear, cMonth, cDay;
     var yyyymmdd = "";
     
     //구분자를 제외한 문자열 생성
     if (pDelimiter != "") {
     	yyyymmdd = pYyyymmdd.replace(eval("/\\" + pDelimiter + "/g"),"").Trim();
     }
     else {
     	yyyymmdd = pYyyymmdd;
     }
     
     if (yyyymmdd == "" || yyyymmdd.length < 8) {
     	return "";
     }

     yyyy = yyyymmdd.substr(0, 4);
     mm  = yyyymmdd.substr(4, 2);
     dd  = yyyymmdd.substr(6, 2);
     
     if (pInterval == "y") {
         yyyy = (yyyy * 1) + (pAddVal * 1);
     } else if (pInterval == "m") {
         mm  = (mm * 1) + (pAddVal * 1);
     } else if (pInterval == "d") {
         dd  = (dd * 1) + (pAddVal * 1);
     }

     //날짜 계산을 Date 개체를 생성하면서 자동으로 처리
     //년이나 날짜를 +- 형태로 초과하는 경우 자동 계산됨
     cDate = new Date(yyyy,mm - 1,dd)

     //옵션으로 0 마지막 날, 1 처음 날을 처리한다.
     if (pDayOpt == "0") {
         dd = 0;
         //마지막 날인 경우 이전 월로 바뀌므로 +1
         mm = cDate.getMonth() + 1;
         yyyy = cDate.getFullYear();
     }
     else if (pDayOpt == "1") {
         dd = 1;
         mm = cDate.getMonth();
         yyyy = cDate.getFullYear();
     }
     else {
         dd = cDate.getDate();
         mm = cDate.getMonth();
         yyyy = cDate.getFullYear();
     }
     
     //계산된 날짜로 다시 날짜 개체를 생성하고
     cDate = new Date(yyyy,mm,dd);
     //각각 값을 변수처리 한 뒤
     cYear = cDate.getFullYear();
     cMonth = cDate.getMonth() + 1;
     cDay = cDate.getDate();
     //앞에 0을 붙여서 넘겨야 할 필요가 있으면 처리
     cMonth = cMonth < 10 ? "0" + cMonth : cMonth;
     cDay = cDay < 10 ? "0" + cDay : cDay;
     
     if (pDelimiter != "") {
         //입력된 구분자를 추가하거나
         return cYear.toString() + pDelimiter + cMonth.toString() + pDelimiter + cDay.toString();
     } else {
         //제외하여 반환 문자열 생성
         return cYear.toString() + cMonth.toString() + cDay.toString();
     }
     //그냥 리턴 유지하기 위해
     return pYyyymmdd;
 }

function showCommonCodePopup1(job_clsf, cd_clsf, cd, cdnm, cd_abrv_yn, resultRef1, resultRef2, mang_cd_1, mang_cd_2, mang_cd_3, mang_cd_4, mang_cd_5, mang_cd_6, mang_cd_7, mang_cd_8, mang_cd_9, mang_cd_10, mang_cd_11, mang_cd_12){
	
	if(job_clsf == ""){
		commAlert("업무구분은 필수사항입니다.");
		return;
	}
	if(cd_clsf == ""){
		commAlert("코드구분은 필수사항입니다.");
		return;
	}
	if(resultRef1 == ""){
		commAlert("REF1 은 필수사항입니다.");
		return;
	}
	if(resultRef2 == ""){
		commAlert("REF2 은 필수사항입니다.");
		return;
	}

	makeFwdDataNodes();
	
	model.setValue("/root/reqData/fwdData/job_clsf", job_clsf); //필수항목
	model.setValue("/root/reqData/fwdData/cd_clsf", cd_clsf); //필수항목
	model.setValue("/root/reqData/fwdData/cd", cd);
	model.setValue("/root/reqData/fwdData/cdnm", cdnm);
	model.setValue("/root/reqData/fwdData/cd_abrv_yn", cd_abrv_yn);
	model.setValue("/root/reqData/fwdData/mang_cd_1", mang_cd_1);
	model.setValue("/root/reqData/fwdData/mang_cd_2", mang_cd_2);
	model.setValue("/root/reqData/fwdData/mang_cd_3", mang_cd_3);
	model.setValue("/root/reqData/fwdData/mang_cd_4", mang_cd_4);
	model.setValue("/root/reqData/fwdData/mang_cd_5", mang_cd_5);
	model.setValue("/root/reqData/fwdData/mang_cd_6", mang_cd_6);
	model.setValue("/root/reqData/fwdData/mang_cd_7", mang_cd_7);
	model.setValue("/root/reqData/fwdData/mang_cd_8", mang_cd_8);
	model.setValue("/root/reqData/fwdData/mang_cd_9", mang_cd_9);
	model.setValue("/root/reqData/fwdData/mang_cd_10", mang_cd_10);
	model.setValue("/root/reqData/fwdData/mang_cd_11", mang_cd_11);
	model.setValue("/root/reqData/fwdData/mang_cd_12", mang_cd_12);		
	
	model.setValue("/root/reqData/fwdData/resultRef1", resultRef1);
	model.setValue("/root/reqData/fwdData/resultRef2", resultRef2);																																						
	
	window.load(
		 "/xrw/co/cocd/CO_COCD_1250.xrw"
		,"modal"
		,""
		,"caption:hidden;align:center;width:455px; height:425px;"
		,"/root/reqData/fwdData"
		,"/root/reqData/searchData"
	);
		
}

function showCommonCodePopup3(job_clsf, cd_clsf, cd, cdnm, cd_abrv_yn, resultRef1, resultRef2, mang_cd_1, mang_cd_2, mang_cd_3, mang_cd_4, mang_cd_5, mang_cd_6, mang_cd_7, mang_cd_8, mang_cd_9, mang_cd_10, mang_cd_11, mang_cd_12){
	
	if(job_clsf == ""){
		commAlert("업무구분은 필수사항입니다.");
		return;
	}
	if(cd_clsf == ""){
		commAlert("코드구분은 필수사항입니다.");
		return;
	}
	if(resultRef1 == ""){
		commAlert("REF1 은 필수사항입니다.");
		return;
	}
	if(resultRef2 == ""){
		commAlert("REF2 은 필수사항입니다.");
		return;
	}

	makeFwdDataNodes();
	
	model.setValue("/root/reqData/fwdData/job_clsf", job_clsf); //필수항목
	model.setValue("/root/reqData/fwdData/cd_clsf", cd_clsf); //필수항목
	model.setValue("/root/reqData/fwdData/cd", cd);
	model.setValue("/root/reqData/fwdData/cdnm", cdnm);
	model.setValue("/root/reqData/fwdData/cd_abrv_yn", cd_abrv_yn);
	model.setValue("/root/reqData/fwdData/mang_cd_1", mang_cd_1);
	model.setValue("/root/reqData/fwdData/mang_cd_2", mang_cd_2);
	model.setValue("/root/reqData/fwdData/mang_cd_3", mang_cd_3);
	model.setValue("/root/reqData/fwdData/mang_cd_4", mang_cd_4);
	model.setValue("/root/reqData/fwdData/mang_cd_5", mang_cd_5);
	model.setValue("/root/reqData/fwdData/mang_cd_6", mang_cd_6);
	model.setValue("/root/reqData/fwdData/mang_cd_7", mang_cd_7);
	model.setValue("/root/reqData/fwdData/mang_cd_8", mang_cd_8);
	model.setValue("/root/reqData/fwdData/mang_cd_9", mang_cd_9);
	model.setValue("/root/reqData/fwdData/mang_cd_10", mang_cd_10);
	model.setValue("/root/reqData/fwdData/mang_cd_11", mang_cd_11);
	model.setValue("/root/reqData/fwdData/mang_cd_12", mang_cd_12);		
	
	model.setValue("/root/reqData/fwdData/resultRef1", resultRef1);
	model.setValue("/root/reqData/fwdData/resultRef2", resultRef2);																																						
	
	window.load(
		 "/xrw/co/cocd/CO_COCD_1500.xrw"
		,"modal"
		,""
		,"caption:hidden;align:center;width:455px; height:425px;"
		,"/root/reqData/fwdData"
		,"/root/reqData/searchData"
	);
		
}

function makeFwdDataNodes(){
		
	if(instance1.selectSingleNode("/root/reqData/fwdData/job_clsf") == null){
		model.makeNode("/root/reqData/fwdData/job_clsf");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/cd_clsf") == null){
		model.makeNode("/root/reqData/fwdData/cd_clsf");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/cd") == null){
		model.makeNode("/root/reqData/fwdData/cd");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/cdnm") == null){
		model.makeNode("/root/reqData/fwdData/cdnm");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/cd_abrv_yn") == null){
		model.makeNode("/root/reqData/fwdData/cd_abrv_yn");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_1") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_1");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_2") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_2");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_3") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_3");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_4") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_4");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_5") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_5");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_6") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_6");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_7") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_7");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_8") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_8");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_9") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_9");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_10") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_10");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_11") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_11");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/mang_cd_12") == null){
		model.makeNode("/root/reqData/fwdData/mang_cd_12");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/resultRef1") == null){
		model.makeNode("/root/reqData/fwdData/resultRef1");
	}
	if(instance1.selectSingleNode("/root/reqData/fwdData/resultRef2") == null){
		model.makeNode("/root/reqData/fwdData/resultRef2");
	}
}

function showCommonCodePopup2(job_clsf, cd_clsf, cd, cdnm, cd_abrv_yn, resultRef1, resultRef2, mang_cd_1, mang_cd_2, mang_cd_3, mang_cd_4, mang_cd_5, mang_cd_6, mang_cd_7, mang_cd_8, mang_cd_9, mang_cd_10, mang_cd_11, mang_cd_12){
	
	makeFwdDataNodes();
	
	model.setValue("/root/reqData/fwdData/job_clsf", job_clsf); 
	model.setValue("/root/reqData/fwdData/cd_clsf", cd_clsf); 
	model.setValue("/root/reqData/fwdData/cd", cd);
	model.setValue("/root/reqData/fwdData/cdnm", cdnm);
	model.setValue("/root/reqData/fwdData/cd_abrv_yn", cd_abrv_yn);
	model.setValue("/root/reqData/fwdData/mang_cd_1", mang_cd_1);
	model.setValue("/root/reqData/fwdData/mang_cd_2", mang_cd_2);
	model.setValue("/root/reqData/fwdData/mang_cd_3", mang_cd_3);
	model.setValue("/root/reqData/fwdData/mang_cd_4", mang_cd_4);
	model.setValue("/root/reqData/fwdData/mang_cd_5", mang_cd_5);
	model.setValue("/root/reqData/fwdData/mang_cd_6", mang_cd_6);
	model.setValue("/root/reqData/fwdData/mang_cd_7", mang_cd_7);
	model.setValue("/root/reqData/fwdData/mang_cd_8", mang_cd_8);
	model.setValue("/root/reqData/fwdData/mang_cd_9", mang_cd_9);
	model.setValue("/root/reqData/fwdData/mang_cd_10", mang_cd_10);
	model.setValue("/root/reqData/fwdData/mang_cd_11", mang_cd_11);
	model.setValue("/root/reqData/fwdData/mang_cd_12", mang_cd_12);		
	
	model.setValue("/root/reqData/fwdData/resultRef1", resultRef1);
	model.setValue("/root/reqData/fwdData/resultRef2", resultRef2);																																						
	
	window.load(
		 "/xrw/co/cocd/CO_COCD_1200.xrw"
		,"modal"
		,""
		,"align:center;width:650px; height:500px;"
		,"/root/reqData/fwdData"
		,"/root/reqData/searchData"
	);
}

function setCommonCodeData(cd, cdnm){
							
	if(opener.instance1.selectSingleNode(model.getValue("/root/reqData/searchData/resultRef1")) != null){
		opener.model.setValue(model.getValue("/root/reqData/searchData/resultRef1"), cd);	
	}
	if(opener.instance1.selectSingleNode(model.getValue("/root/reqData/searchData/resultRef2")) != null){
		opener.model.setValue(model.getValue("/root/reqData/searchData/resultRef2"), cdnm);	
	}
	opener.model.refresh();
		
}

/**
 *  우편번호 검색 공통 팝업
 * _ref : request data node path
          zip - 검색단어, job_flag - 특정지국/전체우편번호 검색범위 지정
 * _resRef : 검색결과 데이터를 저장할 data node path
 */
function openZip(_ref, _resRef, _oldNewClsf)
{
   var style = "width:560px; height:480; align:center; caption:hidden";
   model.property("ZIP_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   //window.load("/xrw/ss/common/ss_common_1150_p.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
   //window.load("/xrw/co/post/co_common_1150_p.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
   if(_oldNewClsf == "new"){
   		window.load("/xrw/co/cocd/CO_COCD_2000.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
   }else{
		window.load("/xrw/ss/common/ss_common_1150_p.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
   }

}

/**
 *  우편번호 검색 공통 submission
 * _ref : request data node path
          zip - 검색단어, job_flag - 특정지국/전체우편번호 검색범위 지정
 * _resRef : 검색결과 데이터를 저장할 data node path
 */
function searchZip(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchZip", "/co/post/1152", _ref, _resRef);
}

//가동지국을 조인하지 않고 모든 주소를 조회하는 주소팝업창 추가개발(20090827 권정윤)
//url부터 프로시져까지 완전분리 
/**
*  우편번호 검색 공통 팝업
* _ref : request data node path
       zip - 검색단어, job_flag - 특정지국/전체우편번호 검색범위 지정
* _resRef : 검색결과 데이터를 저장할 data node path
*/
function openZipAll(_ref, _resRef)
{
var style = "width:410px; height:415; align:center; caption:hidden";
model.property("ZIP_RES_XPATH") = _resRef;
remakeNode(_resRef);
//window.load("/xrw/ss/common/ss_common_1150_p.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
window.load("/xrw/co/post/co_common_1160_p.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
}

/**
*  우편번호 검색 공통 submission
* _ref : request data node path
       zip - 검색단어, job_flag - 특정지국/전체우편번호 검색범위 지정
* _resRef : 검색결과 데이터를 저장할 data node path
*/
function searchZipAll(_ref, _resRef)
{
remakeNode(_resRef);
modelSendNoMake("commSearchZip", "/co/post/1162", _ref, _resRef);
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	TrustForm의 child window를 종료 할 때 MID TAB도 함께 제거 되도록 동작한다.
//--------------------------------------------------------------------------------------------------
//입력
//	없음
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	import되는 iv_Title 개체의 종료 이벤트를 dispatch하여
//	import 폼의 종료버튼(X)을 누른것과 같은 효과를 내도록 작성
//--------------------------------------------------------------------------------------------------
//예제
//	formClose();
//==================================================================================================
function formClose() {
	iv_Title.group_tit.btnClose.dispatch("onclick");
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	String Type의 prototype 정의
//	문자열을 날짜형식 변수로 변환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	없음
//--------------------------------------------------------------------------------------------------
//출력
//	Date type의 문자열이 변환된 날짜
//	년월일의 정확한 숫자에 충족되지 않는 경우 null 반환
//--------------------------------------------------------------------------------------------------
//설명
//	날짜형식의 문자열을 최소 8자리 최대 10자리이며
//	8자리의 경우 년도는 4자리 월은 2자리 일은 2자리 형태를 유지해야 한다.
//	10자리의 경우도 년.월.일의 자리수는 일치해야 하며
//	중간에 있는 문자는 무조건 무시하고 날짜로 변환 할 수 있는 경우 변환한다.
//--------------------------------------------------------------------------------------------------
//예제
//	"20090101".ToDate();
//	"2009/01/01".ToDate();
//	"2009#01*01".ToDate();
//==================================================================================================
String.prototype.ToDate            = StringPrototypeToDate;
function StringPrototypeToDate() {
	vDate = null;
	vStr = this.Trim();
	
	//8자리일 경우와
	if (vStr.length == 8) {
		vYear = vStr.substr(0,4);
		vMonth = vStr.substr(4,2);
		vDay = vStr.substr(6,2);
	}
	//10자리일 경우
	else if (vStr.length == 10) {
		vYear = vStr.substr(0,4);
		vMonth = vStr.substr(5,2);
		vDay = vStr.substr(8,2);
	}
	else {
		return null;
	}
	
	//처리된 값이 숫자 변환 가능한지 확인
	if (isNaN(vYear) || isNaN(vMonth) || isNaN(vDay)) {
		return null;
	}
	else {
		//숫자형으로 변환
		vYear = parseInt(vYear,10);
		vMonth = parseInt(vMonth,10);
		vDay = parseInt(vDay,10);
	}
	
	//년월을 체크해서 유효하면
	if ((vYear >= 1000 && vYear <= 9999) && (vMonth >= 1 && vMonth <= 12)) {
		//마지막 날짜를 구해서
		vLastDay = (new Date(vYear,vMonth,0)).getDate();
		//1일부터 마지막 날까지에 해당하는지 확인해서
		if (vDay <= 0 || vDay > vLastDay) {
			//범위를 초과하면 오류 처리
			return null;
		}
	}
	//년월을 체크해서 유효화지 않으면
	else {
		return null;
	}

	return new Date(vYear,vMonth - 1,vDay);
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	Date Type의 prototype 정의
//	현재 날짜에서 지정된 날짜를 뺀 일수를 구한다.
//--------------------------------------------------------------------------------------------------
//입력
//	Date type의 날짜
//--------------------------------------------------------------------------------------------------
//출력
//	Integer type의 일수 차이 값
//--------------------------------------------------------------------------------------------------
//설명
//	Date type의 getTime() 함수를 이용해 millisecond 차이를 구하고
//	1000을 곱해서 초단위로 바꾼뒤
//	60을 곱해서 분단위
//	60을 곱해서 시단위로 만들고
//	24를 곱해서 일단위로 최종 변환하여 반환한다.
//--------------------------------------------------------------------------------------------------
//예제
//	"2009/02/28".ToDate().Diff("20090301".ToDate());
//==================================================================================================
Date.prototype.Diff                = DatePrototypeDiff;
function DatePrototypeDiff(p_date) {
	return ((this.getTime() - p_date.getTime()) / (1000*60*60*24));
}


/**
 *  단순 알럿(확인 타이틀)
 *  strMsg : 메세지
 */
function commAlert(strMsg)
{
   model.alert(strMsg, "확인");
}

/**
 * 그리드의 필수입력 확인
 * param : gridID(그리드 ID 문자열)
 * 그리드 세팅사항 : 일반 input항목과 마찬가지로 그리드의 컬럼에 class="req" 및 caption="컬럼명" 세팅
 * 실행예 : if(!commGridReqCheck("datagrid1")) return;
 */ 
function commGridReqCheck(gridID){
	
	var reqclass = "";
	var reqcaption = "";
	var grid;
    if( typeof gridID == 'string' ) grid = document.controls(gridID);
    else grid = gridID;

    var strid = grid.attribute("id");
	var rowcnt = grid.rows;
	var colcnt = grid.cols;
	
	for(var i=grid.fixedRows ; i< rowcnt ; i++){
		
		rstatus = grid.rowStatus(i);
		
		if((rstatus!=0) && (rstatus!=5) && (rstatus!=7)){
		
			for(var j=grid.fixedCols ; j< colcnt ; j++){
			
				reqclass = grid.colAttribute(j, "class");
				if(rstatus!=0 && reqclass == "req" && grid.valueMatrix(i,j) == ""){
	                commMsgBox(grid.colAttribute(j, "caption") + "은(는) 필수입력항목입니다.");
					model.setFocus(strid);
					grid.row = i;
					grid.col = j;
					grid.editCell();
					return false;
				}		
			}
		}
		
	}
    return true;
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	그리드에서 Copy&Pate 처리 
//	콤보박스 드래그 복사시 display text 대신 value가 복사되는 기능
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	이하 함수 및 전역변수를 사용하며
//	onmousedown,onmouseup,onkeypress,oncopy,onpaste 등의 전역 이벤트 사용
//	따라서 엑셀 기능 추가 전에 등록된 전역 이벤트 스크립트도 다소 수정되었음...
//--------------------------------------------------------------------------------------------------
//예제
//
//==================================================================================================
 
//grid에서 블록시 위치값(블록의 위치가 grid를 벗어나면 잡아낼수 없음)
 var startRow;
 var startCol;
 var endRow;
 var endCol;

 //label값으로 원하는 값을 가져온다..(select계열) select의 itemset이 label-value구조일경우
 function getParmByLabel( nodeSetName, label , param)
 {
 	var ins = document.models(0).instances(0);					
 	
 	var selNode = ins.selectSingleNode( "//"+nodeSetName+"[label = '"+label+"']/"+param);
 											
 	if ( selNode == null ){
 	//	alert("값이 없습니다");
 		return "";
 	}
 						
 	return selNode.text;
 }

 //value값으로 원하는 값을 가져온다..(select계열) select의 itemset이 label-value구조일경우
 function getParmByValue( nodeSetName, value , param)
 {
 	var ins = document.models(0).instances(0);					
 	
 	var selNode = ins.selectSingleNode( "//"+nodeSetName+"[value = '"+value+"']/"+param);
 											
 	if ( selNode == null ){
 	//	alert("값이 없습니다");
 		return "";
 	}
 						
 	return selNode.text;
 }

 //한글인지 체크..
 function isKor(value){
 	
 	if(value.length < 1){
 		return false;	
 	}
 	
 	for(var i=0;i<value.length;i++){
 		
 		var chr = value.substr(i,1);
 		chr = escape(chr);
 		if(chr.charAt(1) == "u"){
 			chr = chr.substr(2, (chr.length-1));
 			if( (chr < "AC00") || (chr > "D7A3") ){
 				return false;
 				break;	
 			}	
 		}else{
 			return false;
 			break;	
 		}
 	}
 	
 	return true;				
 }

 //영문인지 체크
 function isEng(str){
 	
 	return (/^[a-z]*$/gi).test(str);

 }

 //숫자인지 체크
 function isNumber(str){
 	
 	return (/^[0-9]*$/gi).test(str);

 }




 // remove row 마크(국민은행 메타데이타 특화함수)
 function removeRowsMarkStatius(grid, id){
 	var totalCnt = grid.selectedRows;
 	var grid_elements =  Array();
 	var cnt = 0;
 	var grid_node = grid.attribute("nodeset");
 	for(var i=totalCnt-1; i>=0; i--) {
 		var row = grid.selectedRow(i);
 		if(grid.valueMatrix(row, grid.colRef(id))!="") {
 			grid.rowStatus(row) = 4;								//삭제모드로 설정			
 			grid.rowStyle(row, "data", "color") = "#b0b0b0";
 			grid.rowStyle(row, "data", "background-color") = "#FFFFFF";
 			grid.isReadOnly(row, 0, row, grid.cols-1) = true;
 		} else {
 			grid_elements[cnt] = row;
 			//entetyGrid.deleteItem(row);
 		}
 		cnt++
 	}
 	
 	for(var i=0; i<grid_elements.length; i++) {
 		
 		//grid.deleteItem(grid_elements[i]);
 		model.removeNodeSet(grid_node+"["+grid_elements[i]+"]");

 	}
 	grid.rebuild();
 }


 //grid의 onmousedown
 function grid_onmousedown(){
	try{
	 	//현재 focus인 control의 target
	 	var target = event.ptarget;
	
	 	//현재 control의 ID
	 	var ctrl_id = document.all(target.parent.attribute("id"));
	 	
	 	if(target.parent.elementName == "xforms:datagrid"){
	 		
	 		if(event.shiftKey != 1)
	 		{
	 			startRow = ctrl_id.mouseRow;
	 			startCol = ctrl_id.mouseCol;
	 		}
	 		else if(event.shiftKey == 1)
	 		{
	 			endRow = ctrl_id.mouseRow;
	 			endCol = ctrl_id.mouseCol;
	 		}
	 	}
	 } catch (e){
	 }
 }

 //keypress이벤트()
 function onkeypress(){
 	
 	//문자열convert(대소문자)
 	toConvertChar("keypress");

 	//grid일때
 	
 	if(event.ptarget.parent.elementName == "xforms:datagrid"){
 	
 		//esc를 눌렀을때
 		if( event.keyCode == 27 ){
 		
 			grid_blockClear();
 		
 		}
 	
 	}
 	//onkeypress에 event.stopPropagation()이 있으면 입력이 안됨...
 	//event.stopPropagation();
 	
 }


 //문자열convert
 function toConvertChar(action,g_row,g_col){
 	
 	//현재 focus인 control의 target
 	var target = event.ptarget;

 	//현재 control의 ID
 	var ctrl_id = document.all(event.currentTarget);
 	
 	//target이 그리드라면..(그리드는 데이타구조상 parent로 찾아야됨..그리드안에 컨트롤들이 있기때문)
 	//                              현재target은 grid안에 input컨트롤이기때문(스펙상 xforms:gridinput)                                 
 	//그리드일경우
 	
 	var target_name = "";
 	
 	if(action == "keypress"){
 		target_name = target.parent.elementName;
 	}else if(action == "paste"){
 		target_name = target.elementName;
 	}
 	
 	if( target_name  == "xforms:datagrid" ){
 	
 		
 		if(action == "keypress"){
 			//현재 grid의 ID
 			var grid = target.parent;
 			// 그리드 col에 _uppercase 를 검색함.
 			var col     = grid.col;
 		}else if(action == "paste"){
 			//현재 grid의 ID
 			var grid = target;
 			// 그리드 col에 _uppercase 를 검색함.
 			var col     = g_col;	
 		}
 													
 		var index = 0;
 			
 		//for문으로 grid의 children을 돌림(col을 접근하기위해..)
 		for(var i=0; i<grid.children.length; i++)
 		{
 			var colobj = grid.children(i);
 			
 			//col이라면..
 			if(colobj.elementName == "xforms:col")
 			{
 				//col의 attribute의 _chartype이 upper라면.. index는 현재 입력하는 필드와 같은경우인지 체크하기위해..
 				if( index == col && colobj.attribute("_chartype") == "upper")
 				{
 					if( action == "keypress"){
 						
 						if(event.keyCode >= 97 && event.keyCode <= 122)
 						{
 							event.keyCode = event.keyCode - 32;
 							break;
 						}
 						
 					}else if( action == "paste"){
 						
 						ctrl_id.valuematrix(g_row,g_col) = ctrl_id.valuematrix(g_row,g_col).toUpperCase();										
 					
 					}
 				}
 				//col의 attribute의 _chartype이 lower라면..
 				else if( index == col && colobj.attribute("_chartype") == "lower" )
 				{
 					if( action == "keypress"){
 					
 						if(event.keyCode >= 65 && event.keyCode <= 90)
 						{
 							event.keyCode = event.keyCode + 32;
 							break;
 						}
 						
 					}else if( action == "paste"){
 						
 						ctrl_id.valuematrix(g_row,g_col) = ctrl_id.valuematrix(g_row,g_col).toLowerCase();										
 						
 					}
 				}			
 											
 				index++;
 			}
 		}
 	//그리드가 아닐경우
 	}else{
 		
 		//alert("그리드아님, target_name=" + target_name + ", ctrl_id=" + ctrl_id);	
 		if(ctrl_id == null) return;
 		
 		if( ctrl_id.attribute("_chartype") == "upper")
 		{
 			
 			if(event.keyCode >= 97 && event.keyCode <= 122)
 			{
 				event.keyCode = event.keyCode - 32;
 			}
 										
 		}
 		else if( ctrl_id.attribute("_chartype") == "lower" )
 		{
 			
 			if(event.keyCode >= 65 && event.keyCode <= 90)
 			{
 				event.keyCode = event.keyCode + 32;
 			}
 									
 		}									
 		
 	}
 						
 }



 //grid clear(Ctrl키 사용배제)
 function grid_blockClear(){

 	var i, j;
 	var tempClip = "";
 	var temp = "";

 	//현재 control의 ID
 	var ctrl_id = document.all(event.ptarget.parent.attribute("id"));
 	
 	//selectinoMode
 	var selectionMode = ctrl_id.attribute("selectionmode");
 			
 	//mouse로 block을 아래에서 위로 잡을때도 있으므로..
 	if(startRow > endRow)
 	{
 		temp = endRow;
 		endRow = startRow;
 		startRow = temp;
 		if(startCol >endCol)
 		{
 			temp = endCol;
 			endCol = startCol;
 			startCol = temp;
 		}
 	
 	}
 	
 	//그리드의 title이 지워지는걸 방지하기위해..
 	if( startRow < ctrl_id.fixedrows ){
 		startRow = ctrl_id.fixedrows;
 	}

 	//selectionmode에따라서 block지정이 다르기 때문..
 	if(selectionMode != "free"){
 		
 		startCol = 0;
 		endCol = ctrl_id.cols-1;
 			
 	}
 			
 	for(i=startRow; i<=endRow; i++)
 	{
 		
 		for(j=startCol; j<=endCol; j++)
 		{
 			ctrl_id.valueMatrix(i,j) = "";
 			
 		}
 		
 	}
 	
 }

 //keypress이벤트()
 function onkeypress(){
 	
 	//문자열convert(대소문자)
 	toConvertChar("keypress");

 	//grid일때
 	
 	if(event.ptarget.parent.elementName == "xforms:datagrid"){
 	
 		//esc를 눌렀을때
 		if( event.keyCode == 27 ){
 		
 			grid_blockClear();
 		
 		}
 	
 	}
 	//onkeypress에 event.stopPropagation()이 있으면 입력이 안됨...
 	//event.stopPropagation();
 	
 }

 //grid의 onmouseup
 function grid_onmouseup(){
	try{
	 	//현재 focus인 control의 target
	 	var target = event.ptarget;
	
	 	//현재 control의 ID
	 	var ctrl_id = document.all(target.parent.attribute("id"));
	 	
	 	if(target.parent.elementName == "xforms:datagrid"){
	
	 		if(event.shiftKey != 1)
	 		{
	 			endRow = ctrl_id.mouseRow;
	 			endCol = ctrl_id.mouseCol;
	 		}
	 	
	 	}else{
	 		//마우스가 그리드영역을 벗어나면 위치를 잡아낼수 없음..
	 	}
 	} catch(e){
 	}
 }

 //onpaste
 function onpaste(){
 						
 	grid_onpaste();

 	event.stopPropagation();

 }

 //drag시 start
 function ondragstart(){

 	dragStart();

 	event.stopPropagation();
 	
 }

 //grid_ondragstart
 function dragStart(){

 	var ctrl_id = event.target
 		
 	model.property("dragTarget") = ctrl_id;
 	
 	//grid라면..
 	if(event.ptarget.elementName == "xforms:datagrid"){
 				
 		model.property("dragRow") = document.all(ctrl_id).mouseRow;
 		model.property("dragCol") = document.all(ctrl_id).mouseCol;

 	}else{
 	
 		model.property("dragRow") = "";
 		model.property("dragCol") = "";
 	
 	}

 }


 //drop시 이벤트
 function ondrop(){

 	drop();

 	event.stopPropagation();

 }

 //grid_ondrop
 function drop(){

 	var dragTarget = model.property("dragTarget");
 	var dropTarget = "";
 					
 	//grid라면..
 	if( event.ptarget.parent.elementName == "xforms:datagrid"){
 	
 		dropTarget = event.ptarget.parent.attribute("id");
 		
 		var dragRow = model.property("dragRow");
 		var dropRow = document.all(dropTarget).mouseRow;

 		//같은grid에서 drag&drop이면
 		if( (dragTarget != "") && (dragTarget == dropTarget) ){
 			
 			dropTarget = document.all(dropTarget);
 			dragTarget = document.all(dragTarget);
 			
 			var dragTarget_nodeset = event.ptarget.parent.attribute("nodeset");
 			var row_flag = true;
 			
 			if( (dropTarget.isCell(event.target)) && (dropTarget.mouseRow >= dropTarget.fixedrows) ){
 				
 				if(dragRow != dropRow){
 				
 					dropTarget.insertItem(dropRow);
 																					
 					if(dragRow > dropRow){
 						dragRow++;	
 					}else{
 						row_flag = false;	
 					}
 											
 					for(var i = 0;i<dropTarget.cols;i++){
 						dropTarget.valueMatrix(dropTarget.mouseRow,i) = dragTarget.valueMatrix(dragRow,i);	
 					}
 																			
 					model.removeNodeset(dragTarget_nodeset+"["+dragRow+"]");
 					dropTarget.rebuild();
 					
 					if(row_flag){
 						dropTarget.select(dropRow,0,dropRow,dropTarget.cols-1) = true;
 					}else{
 						dropTarget.select(dropRow-1,0,dropRow-1,dropTarget.cols-1) = true;	
 					}	
 					
 				}

 			}else{
 			
 				commAlert("cell의 영역이 아님");
 				//alert("여기 alert은 언제 찍어주는거냐..");
 				return;
 			
 			}
 	
 		//다르다면..
 		}else{
 		
 			//dragTarget이 grid라면..
 			if( dragRow != ""){
 			
 				//alert("그리드가 달라");
 				dropTarget = document.all(dropTarget);
 				dragTarget = document.all(dragTarget);
 												
 				if( (dropTarget.isCell(event.target)) && (dropTarget.mouseRow >= dropTarget.fixedrows) ){
 					
 					commAlert("그리드가 다르므로 insert지만 데이타보장은 못해요!!");
 					if(dragRow != dropRow){
 					
 						dropTarget.insertItem(dropRow);
 																						
 						for(var i = 0;i<dropTarget.cols;i++){
 							dropTarget.valueMatrix(dropTarget.mouseRow,i) = dragTarget.valueMatrix(dragRow,i);	
 						}
 																				
 						dropTarget.select(dropRow,0,dropRow,dropTarget.cols-1) = true;
 						
 					}

 				}else{
 				
 					commAlert("그리드가 다르므로 마지막에 insert가 되지만 데이타보장은 못해요!!");
 					dropTarget.addItem();
 																						
 					for(var i = 0;i<dropTarget.cols;i++){
 						dropTarget.valueMatrix(dropTarget.rows-1,i) = dragTarget.valueMatrix(dragRow,i);	
 					}
 																			
 					dropTarget.select(dropTarget.rows-1,0,dropTarget.rows-1,dropTarget.cols-1) = true;
 				
 				}

 			//아니라면..
 			}else{
 			
 				commAlert("grid가 아닌 컨트롤의 데이타는 보장할수 없으므로 return");
 				return;
 			
 			}
 		
 		}
 	
 	}else{
 	
 		var dragRow = model.property("dragRow");
 		var dragCol = model.property("dragCol");
 		var dragTarget = document.all(model.property("dragTarget"));
 		var dropTarget = document.all(event.currentTarget);

 		if( dragRow == ""){
 		
 			if(event.ptarget.elementName == "xforms:datagrid"){
 				
 				commAlert("grid가 아닌 컨트롤의 데이타는 보장할수 없으므로 return");
 				return;

 			}else{
 			
 				var dragData = dragTarget.value;
 				dropTarget.value = "";//defalut수행을 하므로..
 			
 			}

 		}else{ 
 		
 			if(event.ptarget.elementName == "xforms:datagrid"){
 				
 				dragTarget = model.property("dragTarget");
 				dropTarget = event.ptarget.attribute("id");
 						
 				//같은grid에서 drag&drop이면
 				if( (dragTarget != "") && (dragTarget == dropTarget) ){
 					commAlert("cell의 영역이 아님");
 					return;
 				}else{
 				
 					commAlert("그리드가 다르므로 마지막에 insert가 되지만 데이타보장은 못해요!!");
 					
 					dragTarget = document.all(dragTarget);
 					dropTarget = document.all(dropTarget);
 					dropTarget.addItem();
 																						
 					for(var i = 0;i<dropTarget.cols;i++){
 						dropTarget.valueMatrix(dropTarget.rows-1,i) = dragTarget.valueMatrix(dragRow,i);	
 					}
 																			
 					dropTarget.select(dropTarget.rows-1,0,dropTarget.rows-1,dropTarget.cols-1) = true;
 				
 				}

 			}else{
 			
 				var dragData = dragTarget.valueMatrix(dragRow,dragCol);
 				dropTarget.value = dragData;
 			
 			}

 		}
 					
 	}

 }

 //grid의 onpaste
 function grid_onpaste(){

 	//현재 focus인 control의 target
 	var target = event.ptarget;

 	//현재 control의 ID
 	var ctrl_id = document.all(event.currentTarget);
 	
 	var data = window.clipBoardData;// clipBoard에 있는 데이타들

 	if(target.elementName == "xforms:datagrid" && (ctrl_id.row >= ctrl_id.fixedrows) ){
 			
 		if(data != ""){
 			var arrdata = data.split("\n");
 													
 			for(var i = 0; i < arrdata.length-1 ; i++ )// 행의 갯수
 			{
 				var arrdata1 = arrdata[i].split("\t");
 				
 				for(var j=0;j< arrdata1.length;j++){//열의 갯수					
 					var index = 0;					
 				
 					for(var k=0; k<target.children.length; k++)
 					{
 						var colobj = target.children(k);						
 						//col이라면..
 						if(colobj.elementName == "xforms:col")
 						{							
 							//col의 attribute의 type이 combo라면.. 
 							if( (index == ctrl_id.col+j) && colobj.attribute("type") == "combo"){					
 								
 								if( arrdata1[j].substring(arrdata1[j].length-1,arrdata1[j].length) == "\r"){
 									
 									var label = arrdata1[j].substring(0,arrdata1[j].length-1);
 								}
 								else{
 									if( isNumber(arrdata1[j]) ){//숫자이면..
 										var label = eval(arrdata1[j]);	
 									}else{//숫자가아니면..
 										var label = arrdata1[j];	
 									}
 								}								
 								ctrl_id.valueMatrix(ctrl_id.row+i, ctrl_id.col+j) = getParmByLabel( "itemset" , label , "value");
 								break;

 							}else{//콤보가 아닐경우						
 							
                                var nRowheader = 0;
                                if(ctrl_id.attribute("rowheader") != "")
                                {
                                 nRowheader = 1;
                                }
                                if( (index == ctrl_id.col+j-nRowheader) && colobj.attribute("type") != ""){//output이면 복사금지..
 							
 									if( arrdata1[j].substring(arrdata1[j].length-1,arrdata1[j].length) == "\r"){
 										ctrl_id.valueMatrix(ctrl_id.row+i, ctrl_id.col+j) = arrdata1[j].substring(0,arrdata1[j].length-1);
 									}else{
 										if( isNumber(arrdata1[j]) ){//숫자이면..
 											ctrl_id.valueMatrix(ctrl_id.row+i, ctrl_id.col+j) = eval(arrdata1[j]);	
 										}else{//숫자가 아니면..
 											ctrl_id.valueMatrix(ctrl_id.row+i, ctrl_id.col+j) = arrdata1[j];	
 										}
 									}
 									toConvertChar("paste",ctrl_id.row+i,ctrl_id.col+j);
 									break;
 								}								
 							}
 							index++;
 							
 						}
 					}								
 				}
                if(ctrl_id.rowStatus(ctrl_id.row+i) == "0"){
                    ctrl_id.rowStatus(ctrl_id.row+i) = "2";
                }else if(ctrl_id.rowStatus(ctrl_id.row+i) == "1"){
                    ctrl_id.rowStatus(ctrl_id.row+i) = "3";
                }
                //ctrl_id.rowStatus(ctrl_id.row+i) = "2";               			
 			}		
 		}	
 	}else{
 		
 	//	alert("그리드가 아니므로...");	
 		
 	}	
 }

 //oncopy일때
 function oncopy(){

 	grid_oncopy();

 	event.stopPropagation();
 	
 }

 //grid의 oncopy
 function grid_oncopy(){

 	//현재 focus인 control의 target
 	var target = event.ptarget;

 	//현재 control의 ID
 	var ctrl_id = document.all(event.currentTarget);
 	
 	var i, j;
 	var tempClip = "";
 	var temp = "";
 	
 	if( target.elementName == "xforms:datagrid"){
 		
 		if(startRow > endRow)
 		{
 			temp = endRow;
 			endRow = startRow;
 			startRow = temp;
 			if(startCol >endCol)
 			{
 				temp = endCol;
 				endCol = startCol;
 				startCol = temp;
 			}
 		}	
 			
 		for(i=startRow; i<=endRow; i++)
 		{
 			for(j=startCol; j<=endCol; j++)
 			{
 				tempClip += ctrl_id.valueMatrix(i,j);
 				tempClip += "\t";
 			}
 			tempClip += "\n";
 		}
 		window.clipBoardData = tempClip;
 		
 	}
 }
 

 /*
  * 통장입금내역팝업 오픈
  * param : /root/reqData/fwdData(오픈하는 화면에서 필요한 값을 셋팅 후 넘김)
  * 
  * /root/reqData/fwdData/system 			: IN(필수): 시스템구분구분 : 공통코드[00-08]  
  * /root/reqData/fwdData/acct_mang_no 		: IN: 계좌관리번호    : [02-68] 
  * /root/reqData/fwdData/biz_reg_no_ref 	: OUT(필수) : 계좌주 사업자번호_XPATH
  * /root/reqData/fwdData/bank_id_ref 		: OUT(필수) : 은행코드_XPATH
  * /root/reqData/fwdData/acct_num_ref 	 	: OUT(필수) : 계좌번호_XPATH
  * /root/reqData/fwdData/tran_date_ref 	: OUT(필수) : 거래일자_XPATH
  * /root/reqData/fwdData/tran_date_seq_ref : OUT(필수) : 거래일 일련번호_XPATH
  *
  * /root/reqData/fwdData/current_clsf_ref  : OUT(필수) : D:원화입금, F:외환입금
  *
  * /root/reqData/fwdData/acct_mang_no_ref 	: OUT : 계좌관리번호_XPATH
  * /root/reqData/fwdData/acct_mang_nm_ref	: OUT : 계좌관리은행명_XPATH
  * /root/reqData/fwdData/tran_amt_ref 	 	: OUT : 거래금액_XPATH
  * /root/reqData/fwdData/tran_content_ref 	: OUT : 입금처_XPATH
  * /root/reqData/fwdData/cms_code_ref 	 	: OUT : 가상계좌_XPATH
  *
  * /root/reqData/fwdData/acct_tonghwa_ref	: OUT : 통화구분_XPATH
  * /root/reqData/fwdData/flex_amt_ref 	 	: OUT : 외환금액_XPATH
  *
 */
 function loadRcpmDtlsPop(sys_clsf
 					     ,acct_mang_no
 					     ,biz_reg_no_ref
 					     ,bank_id_ref
 					     ,acct_num_ref
 					     ,tran_date_ref
 					     ,tran_date_seq_ref
 					     ,current_clsf_ref
 					     ,fwdData){

	model.makeNode("/root/reqData/fwdData/sys_clsf");
	model.makeNode("/root/reqData/fwdData/acct_mang_no");
	model.makeNode("/root/reqData/fwdData/biz_reg_no_ref");
	model.makeNode("/root/reqData/fwdData/bank_id_ref");
	model.makeNode("/root/reqData/fwdData/acct_num_ref");
	model.makeNode("/root/reqData/fwdData/tran_date_ref");
	model.makeNode("/root/reqData/fwdData/tran_date_seq_ref");
	model.makeNode("/root/reqData/fwdData/current_clsf_ref");
	
	model.setValue("/root/reqData/fwdData/sys_clsf"			,sys_clsf);	
	model.setValue("/root/reqData/fwdData/acct_mang_no"		,acct_mang_no);	
	model.setValue("/root/reqData/fwdData/biz_reg_no_ref"	,biz_reg_no_ref);	
	model.setValue("/root/reqData/fwdData/bank_id_ref"		,bank_id_ref);	
	model.setValue("/root/reqData/fwdData/acct_num_ref"		,acct_num_ref);	
	model.setValue("/root/reqData/fwdData/tran_date_ref"	,tran_date_ref);	
	model.setValue("/root/reqData/fwdData/tran_date_seq_ref",tran_date_seq_ref);
	model.setValue("/root/reqData/fwdData/current_clsf_ref" ,current_clsf_ref);

	window.load("/xrw/co/bank/CO_BANK_1000.xrw"
				, "modal"
				, ""
				, "align:center; left:100; top:100; width:770; height:490; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;"
				,"/root/reqData/fwdData"
				,"/root/reqData/fwdData"
	);	
 }
 

 
function makeNodeValue(p_node,p_value) {						
		p_node = p_node.Trim();					
							
		if (p_node != "") {					
			model.removenode(p_node);				
			model.makeNode(p_node);				
			model.setValue(p_node,p_value);				
			return true;				
		}					
		return false;					
}						
							
//오즈공통화면 호출.							
function openOzwin(p_node) {						
	window.load("/common/xrw/oz_popup.xrw"					
		,"new"				
		,"oz_popup"				
		,"resize:false;width:987px;height:" + window.height + "px;top:20px;left:100px;align:center;"				
		,p_node				
		,p_node);				
}						
							
// 오즈관련 노드 리셋							
function resetOznode() {						
	model.removenode("/root/oz_data");
	model.makeNode("/root/oz_data/preview");
	model.makeNode("/root/oz_data/printsize");
	model.makeNode("/root/oz_data/conParam");
	model.makeNode("/root/oz_data/odiParam");
	model.makeNode("/root/oz_data/expParam");
}						

// 행 그리드에서 삭제
function deleteRows(datagrid){
	var i = 0;
	for(i; i < datagrid.rows; i++){
		if(datagrid.rowStatus(i) == "1"){
			datagrid.deleteRow(i);
			i = 0;
		}
	}
}
// 그리드 클릭시 상태값 바꾸기 
function rowStatus(datagrid){
	var row = datagrid.row;
	var col = datagrid.col;

	if(col == 0){
		if(datagrid.rowStatus(row)=="4" 
		|| datagrid.rowStatus(row)=="5" || datagrid.rowStatus(row)=="6"){
			datagrid.removeStatus(row,"delete");
		}else if (datagrid.rowStatus(row)=="0"){
			datagrid.addStatus(row, "delete");
		}
		/*if(datagrid.rowStatus(row)=="3" || datagrid.rowStatus(row)=="1"){
			datagrid.removeStatus(datagrid.row,"insert");
			datagrid.addStatus(datagrid.row, "delete");
		}*/
		if (datagrid.rowStatus(row) == "3") {
			datagrid.rowstyle(row, "all", "background-color") = "#FFF000";
		    if (window.alert("선택하신 행을 초기화 하시겠습니까?", "", 1) == 1) {
		    	for(var i = 1; i < datagrid.cols - 1; i++){
		    		//datagrid.valueMatrix(row, i) = "";
		    		if(datagrid.isReadOnly(row, i) == false) {
			        	datagrid.valueMatrix(row, i) = "";
			        }
		    	}
		        //model.resetInstanceNode(grid_node + "[" + row + "]");
		        //var grid_node_tm = grid_node + "[" + row + "]";
		        //model.removeNodeset(grid_node_tm);
		        //makeNodeValue(grid_node_tm);
		        //datagrid.setValue(grid_node_tm, "");
				datagrid.removeStatus(datagrid.row,"update");
		        //datagrid.rowStatus(row) == "1";
		        //datagrid.deleteRow(row);
		    }
			//datagrid.rowstyle(row, "fixed", "background-color") = "#e3e3e3";
			datagrid.rebuildStyle(row, 0, row, datagrid.cols-1);
		}
		if(datagrid.rowStatus(row)=="2"){
			datagrid.removeStatus(row,"update");
			datagrid.addStatus(row, "delete");
		}
	}
}
// 삭제 (new, delete를 제외하고 초기화)
function rowDelSubmit(datagrid){
	var rows = datagrid.rows;
	var rtn_value = false;
	var a = 0;
	for(a; a < rows; a++){
		if(datagrid.rowStatus(a) == "1" || datagrid.rowStatus(a) == "3"){
			datagrid.deleteRow(a);
			a = 0;
		}
	}
	for(var j = 1; j < rows; j++){
		if(datagrid.rowStatus(j) != "4" && datagrid.rowStatus(j) != "0"){
			datagrid.rowStatus(j) = "0";
			//datagrid.deleteRow(i);
		}
	}
	for(var i = 1; i < rows; i++){
		//삭제대상이 존재하면 리턴값 True
		if(datagrid.rowStatus(i) == "4"){
			rtn_value = true;
		}
	}
	
	if (!rtn_value)
		alert("삭제할 대상이 없습니다.");	
		
	return rtn_value;
}
// 저장 (new, insert, update, insert & new를 제외하고 초기화)
function rowInSubmit(datagrid){
	var rows = datagrid.rows;
	var rtn_value = false;
	var a = 0;
	for(a; a < rows; a++){
		if(datagrid.rowStatus(a) == "1"){
			datagrid.deleteRow(a);
			a = 0;
		}
	}
	for(var i = 1; i < rows; i++){
		if(datagrid.rowStatus(i) != "0" && datagrid.rowStatus(i) != "2" && datagrid.rowStatus(i) != "3"){
			datagrid.rowStatus(i) = "0";
		}
	}
	for(var i = 1; i < rows; i++){
		//저장대상이 존재하면 리턴값 True
		if(datagrid.rowStatus(i) == "2" || datagrid.rowStatus(i) == "3"){
			rtn_value = true;
		}
	}
	
	if (!rtn_value)
		alert("저장할 대상이 없습니다.");	
		
	return rtn_value;
}
// 사번, 성명, 주민번호로 검색
function setInfoSearchInput(emp_no, nm_korn, prn, retFunc){

	makeNodeValue("/root/searchData/emp_no", emp_no);
	makeNodeValue("/root/searchData/nm_korn", nm_korn);
	makeNodeValue("/root/searchData/prn", prn);
	modelSendNoMake("hd_co_1001_s", "/hd/co/1001", "/root/searchData", "/root/tempData");
	model.removenode("/root/searchData");

	var chk_cnt = model.getValue("/root/tempData/totalcnt");

	if(chk_cnt == 0){
		alert("조회 정보와 일치하는 사원이 없습니다.");			
	}else if(chk_cnt == 1){
	}else if(chk_cnt > 1) {
		model.removeNodeset("/root/reqData/fwdData");  
		model.makeNode("/root/reqData/fwdData/func_nm");
		model.setValue("/root/reqData/fwdData/func_nm", retFunc);
		model.makeNode("/root/reqData/fwdData/nm_korn");
		model.setValue("/root/reqData/fwdData/nm_korn", nm_korn);
		model.makeNode("/root/reqData/fwdData/emp_no");
		model.setValue("/root/reqData/fwdData/emp_no", emp_no);
		window.load("/xrw/hd/com/HD_COM_1200.xrw","modal", "hd_com_1200", "align:center; caption:hidden;", "/root/reqData/fwdData", "/root/reqData/fwdData");																			
	}
}

//orgStr : 원본 문자열
//cmpStr : 포함되어 있는지 찾고 싶은 문자열
//return : true, false
function instr_yn(orgStr, cmpStr) {
	tmpStr = "" + orgStr.Trim();
	tmpStrCmp = "" + cmpStr.Trim();
	//alert(tmpStr+'*'+tmpStr.length+'//'+tmpStrCmp+'*'+tmpStrCmp.length);
	
	if(tmpStr.length == 0 && tmpStrCmp.length == 0) return true;
	if(tmpStr.length != 0 && tmpStrCmp.length == 0) return false;
	
	if (tmpStr.indexOf(tmpStrCmp) > -1) {
		//pos= tmpStr.indexOf(tmpStrCmp);
		return true;
	}
	return false;
}
