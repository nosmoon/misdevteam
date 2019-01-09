/*************************************************************************************************/
/* 0. Global Event ���� �Լ� (Event)
/* 1)  onclick     : 
/* 2)  onmouseup   : 
/* 3)  onmousedown : datagrid ��Ŭ������ edit���, comboBoxȰ��ȭ
/* 4)  onentercell : datagrid ��Ŭ������ edit���, comboBoxȰ��ȭ
/* 5)  eventCheck  : datagrid ��Ŭ������ edit���, comboBoxȰ��ȭ
/* 6)  xforms-ready : page loading�� pageInfo(id,title,authority, button) setting
/*************************************************************************************************/

var gridObj = "";
var ObjstringId = "";
//var showProgressbar = "true";
/*-----------------------------------------------------------------------------------
 * NAME  : onclick()
 * DESC  : datagrid�� onclick ����
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
 * DESC  : datagrid�� onmouseup()
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
 * DESC  : datagrid�� onmousedown()
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
 * DESC  : datagrid�� onentercell()
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
 * DESC  : onclick()�� ���� check�Ͽ� event ó��
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
	        if(ptargetElementName == "xforms:datagrid"){//����κ� �̺�Ʈ ���
	            event.stoppropagation();
	            return false;
	        }else if(ptarget.parent.parent.elementName == "xforms:datagrid") {
	            if(ptargetElementName.indexOf("scroll") != -1 ){ event.stoppropagation();return false;}
	            if(ptargetElementName.indexOf("combo") != -1 ) { event.stoppropagation();return false;}
	        }
	        
	        if( obj.iscell(event.target)) {
	            if(obj.row < obj.fixedRows) { //header���� Ŭ��
	                if( obj.attribute("explorerbar") != "") return true;
	                    event.stopPropagation();
	                    return false;
	            }else {                       //data���� click
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
 * DESC  : �۷ι� xforms_ready() pageInfo(id,title,authority, button) setting
 * PARAM : 
 * DATE  : 2009-02-06
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
function xforms_ready(){

    //�Ϲ��˾��� �н�
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
    
    // ��ư�׷쳻�� �� ��ư ���Ѻ� ����
    btnDisabled();
    
    //model.addLog("[CIIS] xforms_ready End =====");
}

/*-----------------------------------------------------------------------------------
 * NAME  : submit_complete()
 * DESC  : send()�� ����ó������ �Ǵ�
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
 * DESC  : �۷ι� xforms_submit progress bar ó��
 * PARAM : 
 * DATE  : 2009-02-06
 * AUTH  : comsquare
 *----------------------------------------------------------------------------------*/
 function xforms_submit(){
    //event bubbling ó��
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
 * DESC  : �۷ι� submit �� ����, ���� �޽��� ó��
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
    var errmsg = "submit ���� ����";

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
 * DESC  : ��� ��ư En/diable ����
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
            
            //�����ڰ� disabled�� true�� �����Ͽ� ���Ұ����ϵ��� ���� ���
            //���°��� ������� �ʵ��� ��� �߰�
            //���� ����
            if (prevstate == "true") {
            	//�ƹ��͵� ���� ������ ���� ���� ����
            }
            //crud�� ���ǵǾ� ���� ������ Ȱ��ȭ ��Ŵ
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
/* ���� ���� �߰�
/* ���������� var Ÿ�Կ����� �����ϵ��� ������Ÿ�� �ڵ�
/* 1 . ProtoType ���� �Լ� (Number)
/* 3)  String.prototype.CheckFloat         : ����� ���� Float ������ ����
/* 4)  String.prototype.GetRound           : ����� ���� ������ �ڸ����� �ø�/�ݿø�/���� ó�� GetRound( pPoint, pMode )   
/* 5)  String.prototype.GetTruncate        : �Ҽ��� ������ ������ String���� ���� (�����ΰ�쿡�� �������� ����ǥ�ô� ��ȿ)   
*****************************************************************************************************************/      
Number.prototype.CheckFloat        = CheckFloat;
Number.prototype.GetRound          = GetRound;
Number.prototype.GetTruncate       = GetTruncate;

/***************************************************************************************************************/
/* 1 . ProtoType ���� �Լ� (String)
/* 1)  String.prototype.ReplaceWord        : ���ڿ����� Ư�� ���� �Ǵ� �ܾ ã�� ���ϴ� ���� �Ǵ� �ܾ�� ġȯ   
/* 2)  String.prototype.CheckNum           : ����� ���� Number ������ ����
/* 3)  String.prototype.CheckFloat         : ����� ���� Float ������ ����
/* 4)  String.prototype.GetRound           : ����� ���� ������ �ڸ����� �ø�/�ݿø�/���� ó�� GetRound( pPoint, pMode )   
/* 5)  String.prototype.GetTruncate        : �Ҽ��� ������ ������ String���� ���� (�����ΰ�쿡�� �������� ����ǥ�ô� ��ȿ)   
/* 6)  String.prototype.GetZeroString      : ����� ���� ���� ���ϴ� ���̸�ŭ '0'�� �ٿ� ǥ�� GetZeroString( pLen )  
/* 7)  String.prototype.GetByteSize        : �Ķ���� ���� Byte ũ�⸦ ����   
/* 8)  String.prototype.Trim               : ���ڿ� �յڿ��ִ� ���� ����   
/* 9)  String.prototype.CheckByteSize      : ���ڿ��� Byte ũ�Ⱑ ���Ѱ��� ������� üũ (����� false ����)   
/* 10) String.prototype.CheckEmpty         : ���� ������ üũ     
/* 11) String.prototype.ReplaceString      : ���ڿ����� Ư�� ���� �Ǵ� �ܾ ã�� ���ϴ� ���� �Ǵ� �ܾ�� ġȯ     
/* 12) String.prototype.TrimLeft           : ���ڿ� �տ� �ִ� ���� ����     
/* 13) String.prototype.TrimRight          : ���ڿ� �ڿ� �ִ� ���� ����     
/* 14) String.prototype.ToLower            : ���ڿ��� ��� �ҹ��ڷ� ��ȯ     
/* 15) String.prototype.ToUpper            : ���ڿ��� ��� �빮�ڷ� ��ȯ     
/* 16) String.prototype.GetLength          : ���ڿ��� ���̸� ���Ѵ�.     
/* 17) String.prototype.IsNull             : �־��� ���� null���� Ȯ���Ѵ�.
/* 18) String.prototype.AmtToHangleName    :  �ݾ��� �ѱ۱ݾ����� ���� 
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
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���ڿ����� Ư�� ���� �Ǵ� �ܾ ã�� ���ϴ� ���� �Ǵ� �ܾ�� ġȯ
 * <pre>
 *              1. ã�� �ܾ �����ڷ� �и��� ���ڿ��� ������ �迭 ��������
 *              2. ġȯ�Ͽ� ������ ������ ���� ���� ����
 *              3. ���� ���ڿ��� ã�� �ܾ �����ڷ� �и�
 *              4. ã�� �ܾ��� ����ŭ loop
 *                  - ã�� �ܾ� ��� ��ü �ܾ ���̸鼭 ����
 *              3. ������ ã�� �ܾ��� �޺κ� ���� �߰�.
 *                  - ã�� �ܾ �����ٸ� ���� ���ڿ� ��ü�� ��
 * </pre>
 * @param  : pFindWord    - ã�� �ܾ�
 * @param  : pReplaceWord - ��ü �ܾ�
 * @return : String - ��ü�ϰ��� ���ڿ�
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
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ����� ���� Number ������ ����
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

        // ���ڰ� �ƴϸ� FALSE ����
        if( isNaN( vTemp ) ) return false;

        // �����̸� FALSE ����
        if( " " == vTemp ) return false;
    }

    return true;
}


/**
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ����� ���� Float ������ ����
 * @param  : N/A
 * @return : true/false
 * @---------------------------------------------------
 */
function CheckFloat() {
    // �Ķ���� ���� parseFloat()�Ŀ��� ������ TRUE ����
    if( this == parseFloat( this ) ) {
    return true;
    } else {
    return false;
    }
}


/**
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ����� ���� ������ �ڸ����� �ø�/�ݿø�/���� ó��
 * <pre>
 *           1.
 * </pre>
 * @param  : pPoint - �ø�/�ݿø�/���� �� ��ġ(2:10�ڸ�, 1:1�ڸ�, -1:�Ҽ������� ù°�ڸ�)
 * @param  : pMode  - 1:�ø�, 0:�ݿø�, -1:����
 * @return : Number
 * @---------------------------------------------------
 */
function GetRound( pPoint, pMode ) {
// �Ķ���� ���� ��ġȭ �Ͽ� ������ ����
    var vNumber    = eval(this);

    // �Ҽ����� �������� ���ڵ鸸 ���Ͽ� �迭 ������ ����
    var vTempArray = eval(this).toString().ReplaceWord("-", "").split(".");

    // this �� float ���� �ƴϸ�
    if( !this.CheckFloat() ) {
        //fAlertMessage(4, "�Ķ����");
        return "";
    }

    // pPoint �� float ���� �ƴϸ�
    if( !pPoint.toString().CheckFloat() ) {
        //fAlertMessage(4, "�Ķ����");
        return "";
    }

    // �Ҽ��� �տ��� ó���Ϸ���
    if(0 < eval( pPoint )) {
        // �Ҽ��� �̻� �ڸ������� ũ��
        if( vTempArray[0].length < eval(pPoint) ) {
            // �޽��� ó���� ����
            //fAlertMessage(1, "�ø�/�ݿø�/���� �� ��ġ");
            return "";
        }
    }
    // �Ҽ��� �ڿ��� ó���Ϸ���
    else if(0 > eval(pPoint)) {
        // �Ҽ��� ���ϰ��� �������� �ʰų� �ڸ������� ũ��
        if(vTempArray.length != 2 || vTempArray[1].length < eval(pPoint)*(-1)) {
        // �޽��� ó���� ����
        //fAlertMessage(1, "�ø�/�ݿø�/���� �� ��ġ");
        //return "";

        return this;
        }
    }

    // '�ø�'�̰�
    if(1 == eval(pMode)) {
        // �Ҽ��� �տ��� ó���Ϸ���
        if(0 < eval(pPoint)) {
            // �ش� �ڸ�(pPoint)���� �ø� ó��
            vNumber = Math.ceil(vNumber / Math.pow(10, pPoint)) * Math.pow(10, pPoint);

            return vNumber;
        }
        // �Ҽ��� �ڿ��� ó���Ϸ���
        else if(0 > eval(pPoint)) {
            // �ش� �ڸ�(pPoint)���� �ø� ó��
            vNumber = Math.ceil(vNumber * Math.pow(10, pPoint*(-1)-1)) / Math.pow(10, pPoint*(-1)-1);

            return vNumber;
        }
        else {
            //fAlertMessage(4, "�ø��ڸ�");
            return "";
        }
    }
    // '�ݿø�'�̰�
    else if(0 == eval(pMode)) {
        // �Ҽ��� �տ��� ó���Ϸ���
        if(0 < eval(pPoint)) {
            // �ش� �ڸ�(pPoint)���� �ݿø� ó��
            vNumber = Math.round(vNumber / Math.pow(10, pPoint)) * Math.pow(10, pPoint);

            return vNumber;
        }
        // �Ҽ��� �ڿ��� ó���Ϸ���
        else if(0 > eval(pPoint)) {
            // �ش� �ڸ�(pPoint)���� �ݿø� ó��
            vNumber = Math.round(vNumber * Math.pow(10, pPoint*(-1)-1)) / Math.pow(10, pPoint*(-1)-1);

            return vNumber;
        }
        else {
            //fAlertMessage(4, "�ø��ڸ�");
            return "";
        }
    }
    // '����'�̰�
    else if(-1 == eval(pMode)) {
        // �Ҽ��� �տ��� ó���Ϸ���
        if(0 < eval(pPoint)) {
            // �ش� �ڸ�(pPoint)���� ���� ó��
            vNumber = Math.floor(vNumber / Math.pow(10, pPoint)) * Math.pow(10, pPoint);

            return vNumber;
        }
        // �Ҽ��� �ڿ��� ó���Ϸ���
        else if(0 > eval(pPoint)) {
            // �ش� �ڸ�(pPoint)���� ���� ó��
            vNumber = Math.floor(vNumber * Math.pow(10, pPoint*(-1)-1)) / Math.pow(10, pPoint*(-1)-1);

            return vNumber;
        }
        else {
        //fAlertMessage(4, "�ø��ڸ�");
        return "";
        }
    }
    // ��� �ƴϸ�
    else {
        // �޽��� ó���� ����
        //fAlertMessage(1, "���('1'/'0'/'-1')");
        return "";
    }
}


/**
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : �Ҽ��� ������ ������ String���� ���� (�����ΰ�쿡�� �������� ����ǥ�ô� ��ȿ)
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
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   :  ����� ���� ���� ���ϴ� ���̸�ŭ '0'�� �ٿ� ǥ��
 * @param  : pLen - �������� ���������� ����
 * @return : �������̺��� ���ڸ���� "0"���� �߰��� ���ڿ�
 * @return : �������̺��� ū��� ���� ���ڿ��� ��ȯ
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
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : �Ķ���� ���� Byte ũ�⸦ ����
 * @param  : N/A
 * @return : �Ķ���� ���� Byte ũ��
 * @---------------------------------------------------
 */
function GetByteSize() {
    // Byte ���� ������ ����
    var vByteSize = 0;

    // Value ���� ���̸�ŭ loop
    for(var i=0; i<this.length; i++) {
        //�ѱ��� ������ 255���� ũ��
        if(this.charCodeAt(i) > 255) vByteSize += 2;
        else vByteSize += 1;
    }

    return vByteSize;
}


/**
 * @group  : String Ȯ��
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���ڿ� �յڿ��ִ� ���� ����
 * @param  : N/A
 * @return : ������ ������ ��� ���ڿ�
 * @---------------------------------------------------
 */
function Trim() {
    return this.TrimRight().TrimLeft();
}


/**
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���ڿ��� Byte ũ�Ⱑ ���Ѱ��� ������� üũ (����� false ����)
 * @param  : pSize - ����ũ��
 * @return : TRUE or FALSE
 * @---------------------------------------------------
 */
function CheckByteSize(pSize) {
    if(this.GetByteSize() <= eval(pSize)) return true;
    return false;
}


/**
 * @group  : String Ȯ��
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���� ������ üũ
 * @param  : N/A
 * @return : TRUE or FALSE
 * @---------------------------------------------------
 */
function CheckEmpty() {
    if(this.Trim() == "") {
        return false;
    }
    return true;   // ������ �ƴ϶��

}


/**
 * @group  : String Ȯ��
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���ڿ����� Ư�� ���� �Ǵ� �ܾ ã�� ���ϴ� ���� �Ǵ� �ܾ�� ġȯ
 * @param  : pOldStr - ã�� �ܾ�   pNewStr - ��ü �ܾ�
 * @return : ��ü�ϰ��� ���ڿ�
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
 * @group  : String Ȯ��
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���ڿ� �տ� �ִ� ���� ����
 * @param  : N/A
 * @return : ������ ������ ��� ���ڿ�
 * @---------------------------------------------------
 */
function TrimLeft() {
    return this.replace(/(^\s*)/g, "");
}


/**
 * @group  : String Ȯ��
 * @ver    :  
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���ڿ� �ڿ� �ִ� ���� ����
 * @param  : N/A
 * @return : ������ ������ ��� ���ڿ�
 * @---------------------------------------------------
 */
function TrimRight() {
    return this.replace(/(\s*$)/g, "");
}


/**
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���ڿ��� ��� �ҹ��ڷ� ��ȯ
 * @param  : N/A
 * @return : ���ڿ�
 * @---------------------------------------------------
 */
function ToLower(){
    return this.toLowerCase();
}


/**
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���ڿ��� ��� �빮�ڷ� ��ȯ
 * @param  : N/A
 * @return : ���ڿ�
 * @---------------------------------------------------
 */
function ToUpper(){
    return this.toUpperCase();
}


/**
 * @group  : String Ȯ��
 * @ver    : 
 * @by     : comsquare.
 * @---------------------------------------------------
 * @type   : function
 * @access : public
 * @desc   : ���ڿ��� ���̸� ���Ѵ�.
 * @param  : N/A
 * @return : ���ڿ��� ����
 * @---------------------------------------------------
 */
function GetLength() {
    return this.length;
}


/**
 * @type   : function
 * @access : public
 * @desc   : �־��� ���� null���� Ȯ���Ѵ�.
 *    <pre>
 *        IsNull();
 *    </pre>
 * @sig    : value
 * @param  : value   - null üũ�� ��  
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
 * @desc   : �ݾ��� �ѱ۱ݾ����� ����
 *    <pre>
 *        var amtNm = commamtToHangleName(amt);
 *    </pre>
 * @sig    : amt
 * @param  : amt    - �ѱ۷� �ٲ� �ݾ� 
 * @return : string - �ѱ۱ݾ�
 */ 
function AmtToHangleName() {
    var amt = this;
    var unitNm = ["õ","��","��","��","õ", "��","��","��","õ","��","��","��","õ","��","��","��"] ;
    var numNm = ["","��","��","��","��","��","��","ĥ","��","��"];
    var amtNm = "";
    
    for ( var i = 0 ; i < amt.length ; i++ ){
        var num = numNm[amt.charAt(i)] ;
        var idx = unitNm.length - amt.length + i ;
        if ( num != "" || (idx+1)/4 == Math.ceil((idx+1)/4 )) {
            amtNm += num + unitNm[idx] ;
        }                       
    }                   
    return amtNm; //+ "��";
}


/***************************************************************************************************************/
/* 2 . Validation ���� �Լ�
/* 1)   commIsValidMonth    :  ��ȿ��(�����ϴ�) ��(��)���� üũ.
/* 2)   commIsValidHour     :  ��ȿ��(�����ϴ�) ��(��)���� üũ.
/* 3)   commIsValidMin      :  ��ȿ��(�����ϴ�) ��(��)���� üũ.
/* 4)   commIsValidSecond   :  ��ȿ��(�����ϴ�) ��(��)���� üũ.
/* 5)   commGhkCal          :  ��¥�� �Է¹޴� input ��Ʈ���� ��ȿ�� �˻�.
/* 6)   commGhkMonth        :  ���� �Է¹޴� input ��Ʈ���� ��ȿ�� �˻�
/* 7)   commGhkTerm         :  ��¥�� �Է¹޴� from~to input ��Ʈ���� ��ȿ�� �˻�
/* 8)   commGhkDateHM       :  ��¥��(���ڿ� �ð�, ��) input ��Ʈ���� ��ȿ�� �˻�
/* 9)   commGhkDateHMS      :  ��¥��(���ڿ� �ð�, ��, ��) input ��Ʈ���� ��ȿ�� �˻�
/* 10)  commIsNull          :  �־��� ���� null���� Ȯ���Ѵ�.
/* 11)  commCheckRrnoVal    :  �ֹι�ȣ ��ȿ�� üũ
/* 12)  commCheckBrnoVal    :  ����� ��Ϲ�ȣ ��ȿ�� üũ
/* 13)  commCheckCrnoVal    :  ���ι�ȣ ��ȿ�� üũ
/* 14)  commValidateTelNo   :  ��ȭ��ȣ�� validation�� Ȯ���Ѵ�.
/* 15)  commValidateEmail   :  �̸����ּ��� validation�� Ȯ���Ѵ�.
/****************************************************************************************************************/

/**
 * @type   : function
 * @access : public
 * @desc   : ��ȿ��(�����ϴ�) ��(��)���� üũ.
 *    <pre>
 *        if (!commIsValidMonth("12"))
 *    </pre>
 * @sig    : mm
 * @param  : mm - üũ�� ��
 * @return : boolean - ��ȿ����
 */ 
function commIsValidMonth(mm) {
    var m = parseInt(mm,10);
    return (m >= 1 && m <= 12);
}


/**
 * @type   : function
 * @access : public
 * @desc   : ��ȿ��(�����ϴ�) ��(��)���� üũ.
 *    <pre>
 *        if (!commIsValidHour("12")) 
 *    </pre> 
 * @sig    : hh
 * @param  : hh - üũ�� ��
 * @return : boolean  ��ȿ����
 */ 
function commIsValidHour(hh) {
    var h = parseInt(hh,10);
    return (h >= 0 && h <= 23);
}


/**
 * @type   : function
 * @access : public
 * @desc   : ��ȿ��(�����ϴ�) ��(��)���� üũ.
 *    <pre>
 *        if (!commIsValidMin("12")) 
 *    </pre> 
 * @sig    : mi
 * @param  : mi      - üũ�� ��  
 * @return : boolean - ��ȿ����
 */ 
function commIsValidMin(mi) {
    var m = parseInt(mi,10);
    return (m >= 0 && m <= 59);
}


/**
 * @type   : function
 * @access : public
 * @desc   : ��ȿ��(�����ϴ�) ��(��)���� üũ.
 *    <pre>
 *        if (!commIsValidSecond("12")) 
 *    </pre> 
 * @sig    : ss
 * @param  : ss      - üũ�� ��
 * @return : boolean - ��ȿ����
 */
function commIsValidSecond(ss) {
    var m = parseInt(ss,10);
    return (m >= 0 && m <= 59);
}


/**
 * @type   : function
 * @access : public
 * @desc   : ��¥�� �Է¹޴� input ��Ʈ���� ��ȿ�� �˻�.
 *    <pre>
 *        if (!commGhkCal("/root/input_date")) 
 *    </pre> 
 * @sig    : chkRef
 * @param  : chkRef  - üũ�� control�� ref
 * @return : boolean - ��ȿ����
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
 * @desc   : ���� �Է¹޴� input ��Ʈ���� ��ȿ�� �˻�     
 *    <pre>
 *        if (!commchkMonth("/root/input_month")) 
 *    </pre>
 * @sig    : chkRef
 * @param  : chkRef  - üũ�� input�� Ref  
 * @return : boolean - ��ȿ����
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
 * @desc   : ��¥�� �Է¹޴� from~to input ��Ʈ���� ��ȿ�� �˻�    
 *    <pre>
 *        if (!commchkTerm( "/root/inputFrom", "/root/inputTo" )) 
 *    </pre>
 * @sig    : chkRefFrom, chkRefTo
 * @param  : chkRefFrom  - üũ�� inputFrom�� Ref  
 * @param  : chkRefTo    - üũ�� inputTo�� Ref  
 * @return : boolean     - ��ȿ����
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
 * @desc   : ��¥��(���ڿ� �ð�, ��) input ��Ʈ���� ��ȿ�� �˻�    
 *    <pre>
 *        if (!commchkDateHM("/root/inputDate")) 
 *    </pre>
 * @sig    : chkRef
 * @param  : chkRef  - üũ�� inputFrom�� Ref  
 * @return : boolean - ��ȿ����
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
 * @desc   : ��¥��(���ڿ� �ð�, ��, ��) input ��Ʈ���� ��ȿ�� �˻�    
 *    <pre>
 *        if (!commchkDateHMS("/root/inputDate")) 
 *    </pre>
 * @sig    : chkRef
 * @param  : chkRef  - üũ�� inputFrom�� Ref  
 * @return : boolean - ��ȿ����
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
 * @desc   : �ֹι�ȣ ��ȿ�� üũ 
 *    <pre>
 *        commcheckRrnoVal("6601011234567");
 *    </pre>
 * @sig    : val
 * @param  : val     - üũ�� �ֹε�Ϲ�ȣ��
 * @return : boolean - ��ȿ����
 */
function commCheckRrnoVal(val) {
    if ( val.length < 13 ) {
        commAlert("�ֹε�Ϲ�ȣ�� �ڸ����� �߸� �ԷµǾ����ϴ�.");
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
        alert ("�߸��� �ֹε�Ϲ�ȣ�Դϴ�. �ٽ� Ȯ���� �ֽʽÿ�");
        return false;
    } else {
        return true;
    }
}


/**
 * @type   : function
 * @access : public
 * @desc   : ����� ��Ϲ�ȣ ��ȿ�� üũ 
 *    <pre>
 *        commcheckBrnoVal("1231212345");
 *    </pre>
 * @sig    : val
 * @param  : val     - üũ�� ����� ��Ϲ�ȣ
 * @return : boolean - ��ȿ����
 */
function commCheckBrnoVal(val) {
    
    if ( val.length < 10 ) {
        commAlert("����ڵ�Ϲ�ȣ�� �ڸ����� �߸� �ԷµǾ����ϴ�.");
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
        alert ("�߸��� ����ڵ�Ϲ�ȣ�Դϴ�. �ٽ� Ȯ���� �ֽʽÿ�");
        return false;
    } else {
        return true;
    }
}


/**
 * @type   : function
 * @access : public
 * @desc   : ���ι�ȣ ��ȿ�� üũ 
 *    <pre>
 *        commCheckCrnoVal("1231212345");
 *    </pre>
 * @sig    : varCk
 * @param  : varCk   - üũ�� ���ι�ȣ
 * @return : boolean - ��ȿ����
 */
function commCheckCrnoVal(varCk) {
    
    if ( varCk.length < 13 ) {
        commAlert("���ι�ȣ�� �ڸ����� �߸� �ԷµǾ����ϴ�.");
        return false;
    }
    
    var checkNum = new Array("1","2","1","2","1","2","1","2","1","2","1","2");

    //�������� �з���ȣ, ���������� �з���ȣ �� �Ϸù�ȣ�� ���ʷ� ������ 12�ڸ�
    //�� ���ڸ� �����.
    var newNum = new Array();
    for(var i = 0; i < varCk.length -1; i++)
        newNum[i] = varCk.charAt(i);
    
    //�� ���ڿ� ���ʷ� 1�� 2�� ���� ��.���� ��� ���Ͽ� ���� ���Ѵ�.
    var multiNum = new Array();
    for(var k = 0; k < newNum.length; k++)
        multiNum[k] = checkNum[k] * newNum[k];
    
    //alert("�� ���ڿ� ���ʷ� 1�� 2�� ���� ��: "+ multiNum[11]);
    //���� ���� ��� ���Ͽ� ���� ���Ѵ�.
    var addNum = 0;
    for(var y = 0; y < multiNum.length; y++)
        addNum = addNum + Number(multiNum[y]);
    
    //alert("���� ���� ��� ���Ͽ� ���� ���Ѵ�: "+ addNum);
    //���� 10���� ������ ��� �������� ���Ѵ�.
    var remainder;
    var quota;
    remainder = Number(addNum) % 10;
    quota = Number(addNum) / 10;
    //10���� �������� �� ���� �����˻���ȣ�� �Ѵ�. �ٸ�, 10���� �������� �� ����
    //10�� ������ 0�� �����˻���ȣ�� �Ѵ�.
    var failCheckNum;
    if( (10 - Number(remainder)) == 10 ) {
        failCheckNum = 0;
    } else {
        failCheckNum = 10 - Number(remainder);
    }
    //alert("�����˻���ȣ: "+ failCheckNum);
    if(failCheckNum != varCk.charAt(12)) {
        alert ("�߸��� ���ι�ȣ�Դϴ�. �ٽ� Ȯ���� �ֽʽÿ�");
        return false;
    }
    return true;
}


/**
 * @type   : function
 * @access : public
 * @desc   : ��ȭ��ȣ�� validation�� Ȯ���Ѵ�.
 *    <pre>
 *         commvalidateTelNo("12-232-2323");
 *    </pre>
 * @sig    : tel
 * @param  : tel     - ��ȭ��ȣ
 * @return : boolean - ��ȿ?
 */
function commValidateTelNo(tel) {  
    var re = new RegExp("^([0-9]{2,4})(-[0-9]{3,4})(-[0-9]{3,4})","g");
    var resultFind = re.exec(tel);
    return resultFind==null?false:true;
}


/**
 * @type   : function
 * @access : public
 * @desc   : �̸����ּ��� validation�� Ȯ���Ѵ�.
 *    <pre>
 *         commvalidateEmail("doog@moe.com");
 *    </pre>
 * @sig    : tel
 * @param  : tel     - ��ȭ��ȣ
 * @return : boolean - ��ȿ?
 */
function commValidateEmail(email) {
    var re = new RegExp("([\.a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(([a-zA-Z0-9_-])*\.([a-zA-Z0-9_-])+)+");
    var resultFind = re.exec(email);
    return resultFind==null?false:true;
}


/*******************************************************************************************/
/* 3. ��¥���� �� ��Ÿ �Լ�
/* 1)  commCurDate      :  ���糯¥��������(( y-��, m-��, d-��  ym -��� ��)������������
/* 2)  commLastDay      :  �ش����� ������ ��¥�� ���ؿ´�.��)199802->28�� , 200002->29��      
/* 3)  commGetDay       :  yyyyMMdd ������ ���ڸ� �޾Ƽ� ������ �������� 
/* 4)  commCurDTime     :  ���糯¥ + �ð� ��������
/* 5)  commFirstDay     :  ������� ù��° ���� �������� �żҵ�
/* 6)  commLateDate     :  ���糯�ڷ� ���� ������ ������ �������� �żҵ�        
/*******************************************************************************************/                   

/**
 * @type   : function
 * @access : public
 * @desc   : getDate��¥ ��������( y-��, m-��, d-��  ym -��� ��)
 *    <pre>
 *        if ( commgetStringLength(str) > lgth ) 
 *    </pre>
 * @sig    : str
 * @param  : str     - ���ڿ�
 * @return : int     - ���ڿ��� byte��
 */
function commCurDate(optSetting) {
    var dte, c_dte="",month;   // ȭ���� Calendar �� ���ʿ�  ���� ���ڸ� Setting �Ѵ�
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
    
    //����� ���ϱ�
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


//�ش����� ������ ��¥�� ���ؿ´�.��)199802->28�� , 200002->29��
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
 * @desc   : yyyyMMdd ������ ���ڸ� �޾Ƽ� ������ ��������   
 *    <pre>
 *        var day = commgetDay("20061231");
 *    </pre>
 * @sig    : yyyyMMdd
 * @param  : yyyyMMdd  - ���Ϸ� ��ȯ�� ����
 * @return : day       - ����
 */
function commGetDay(yyyyMMdd)
{
    var week = new Array("��", "��", "ȭ", "��", "��", "��", "��");
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
 * @desc   : ���糯¥+�ð��� �������� �żҵ�
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
        ampm = "����";
    } else 
        ampm = "����";
        
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
 * @desc   : ������� ù��° ���� �������� �żҵ�
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
 * @desc   : ���糯�ڷ� ���� ������ ������ �������� �żҵ�
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
/* 2. TF���� �����Լ� (���밳��)
/*
/* 01) commFwdPopClose : �˾�â�� �����鼭 �θ�â�� ��尪�� �Ѱ��ش�
/* 02) commMsgCall     : ȭ���� �ϴܹٿ� �޽��� ����(�۾���)
/* 03) commGroupInit   : �׷�� ��Ʈ�� �� �ʱ�ȭ
/* 04) commComfirmBox  : Ȯ�ΰ��â
/* 05) commGridInit    : �׸��� �� ��Ÿ�� �ʱ�ȭ
/* 06) commAddRow      : �׸��� �� �߰�
/* 07) commDelRow      : �׸��� �� ����
/* 10) commMsgBox      : �޽��� �˸�âȣ��
/* 11) commReqCheck    : �ʼ��Է�Ȯ��
/*****************************************************************************************************************/

/**
* @function    : commFwdPopClose() 
* @param       : arguments �Ѱ��� �ν��Ͻ� ��尪 (/root/reqData/fwdData/ �ؿ� ������) 
* @return      : 
* @wirter      : 
* @write date  : 
* @description : �θ�â ���(/root/reqData/fwdData/)���� �˾�â�� ��带 �Ѱ��ְ� �˾�â�� �ݴ´�.
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
        model.alert("Error", "�ش����� ������ �߸��Ǿ����ϴ�");
        return false;
    }
    
    window.close()
}

/*
/**
* @function    : commMsgCall() 
* @param       : arguments �޽����ڵ�, ���ڰ�   
* @return      : 
* @wirter      : 
* @write date  : 
* @description : �޽���ȣ�� �׽�Ʈ �ϴ� bar �� Msg ����
*/
function commMsgCall() {
    
    //����ȭ���۾���
    //  htmlwindow.document.Script.msgCall(msg);        
    //�׽�Ʈ �۾��� 
    var msg =""
    var argLength = arguments.length;
    
    if (argLength>1) {
        
        var vTempArray;
        var vReturnString = "";
        
        vTempArray = arguments[0].split("@");
            
        if(vTempArray.length!=(argLength)) {commAlert('���ڰ��� ���� �ٸ��ϴ�!');  return; }
                
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
 * @description : �׷����� control �ʱ�ȭ
 * @sig         :
 * @param       :groupid
 * @return      : ����. 
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
 * @description : ������ comfirm â
 * @sig         : str, title
 * @param       : str   - ��Ÿ�� ���ڿ�
 * @param       : title - ���� 
 * @return      : yes 1 , no 0
 */ 
function commConfirmBox(str, title) {
    
    if(title == "" || title == null) title = "Ȯ��";
    var MyReturn = model.alert( str, title, 0x20 | 4 );   
    if( MyReturn == 6) return 1;
    else               return 0;
    return MyReturn;

}


/**
 * @function    : commGridInit
 * @access      : public
 * @description : �׸��� �� ��Ÿ�ϰ� ���̺� ���¸� �ʱ�ȭ �����ش�
 * @sig         : datagrid1
 * @param       : datagrid1   - �׸��� id
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
 * @description : �׸��� ���߰�
 * @sig         : datagrid1
 * @param       : datagrid1   - �׸��� id
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
 * @description : �׸��� �����
 * @sig         : datagrid1
 * @param       : datagrid1   - �׸��� id
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
 * @description : �޽��� �˸� â 
 * @sig         : str, title
 * @param       : arguments - �޽����ڵ�, ���ڰ�
 * @return      : 
 */ 
function commMsgBox() {
    var argLength = arguments.length;
    if(argLength==0) {
        
        if(instance1.selectSingleNode("/root/resData/errCode")!=null) {
            
            var msg = model.getValue("/root/resData/errMsg");
            
            if(msg!="" && msg!=null && msg.length>0) {
                model.alert( msg, "�˸�");   
            }
        }
    } else {
        var msg = arguments[0];
        var vTempArray;
        var vReturnString = "";
        
        vTempArray = arguments[0].split("@");
        
        if(vTempArray.length!=(argLength)) {commAlert('���ڰ��� ���� �ٸ��ϴ�!');  return; }
        
        for(var i=0; i<vTempArray.length-1; i++) {
            vReturnString += vTempArray[i] + arguments[(i+1)];
        }
        
        vReturnString += vTempArray[vTempArray.length-1];
        
        model.alert( vReturnString, "�˸�");
    }
}


/**
 * @function    : commReqCheck
 * @access      : public
 * @description : �ʼ��Է� Ȯ�� 
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
                commMsgBox(ctr.attribute("caption") + "��(��) �ʼ��Է��׸��Դϴ�.");
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
        tmp_date.setFullYear(tmp_date.getFullYear() + shift); //y���� ����
    }else if(ymd == 'm'){
        tmp_date.setMonth(tmp_date.getMonth() + shift);
    }else if(ymd == 'd'){
        tmp_date.setDate(tmp_date.getDate() + shift);  
    }
    
    return toTimeString(tmp_date);
}


/**
 * �ڹٽ�ũ��Ʈ Date ��ü�� Time ��Ʈ������ ��ȯ
 * parameter date: JavaScript Date Object
 */
function toTimeString(date) { //formatTime(date)
    var year  = date.getFullYear();
    var month = date.getMonth() + 1; // 1��=0,12��=11�̹Ƿ� 1 ����
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
    var month = date.getMonth() + 1; // 1��=0,12��=11�̹Ƿ� 1 ����

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
                commMsgBox(ctr.attribute("caption") + ": �ʼ� �Է»����� �����Ǿ����ϴ�.");
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
 * submission ��ü�� ��ũ��Ʈ�� ���� submit�Ѵ�.
 * parameter strPath : submit id, action��, ref node, resultref node
 */
function modelSendNoMake(id, action, ref_value, resultref_value) {
    var submissionID = "sub" + id;
    model.createChild("xforms:submission", "id:"+submissionID+"; replace:instance; encoding:utf-8");
    
    // �Ķ����  �� ����
    eval(submissionID).attribute("ref") = ref_value;
    // ���Ϲ��� res ��� ����
    eval(submissionID).attribute("resultref") = resultref_value;
    // ȣ���� Actin Class �� ����
    eval(submissionID).attribute("action") = action;
    // ��Ÿ ����
    eval(submissionID).attribute("method") = "post";
    eval(submissionID).attribute("mediatype") = "application/x-www-form-urlencoded";
    model.send(submissionID);
}


/**
 * �޺� �ڽ��� ��ü(A), ����(S), ""�� ���� �ִ´�.
 * parameter 
 *  - gubun : ��ü(A), ����(S), ����("") -> value�� ""
 *  - ref_combo_root : �޺��� Ȩ��� xPath
 *  - item_nm : �޺�����Ʈ ���ڵ��
 *  - ref_label : label��
 *  - ref_value : value��
 * ex) makeComboGubun("A", "/root/initData/comboSet/medi_cd", "item", "label", "value")
 */ 
function makeComboGubun(gubun, ref_combo_root, item_nm, ref_label, ref_value){
    var tempNode = "/root/tempCombo";
    var desNode = ref_combo_root + "/" + item_nm;
    
    var label, value;
    
    model.makeNode(tempNode);
    
    //�� ����Ÿ�� �ӽ� ��忡 �ű��.
    model.copyNode(tempNode, ref_combo_root);
    
    if ( gubun == "A" ) {
        label = "��ü";
        value = "";
    } else if ( gubun == "S" ){
        label = "����";
        value = "";
    } else {
        label = " ";
        value = "";
    }
    
    //�� ��带 �����ϰ� ��ü, ����, ""�� �����Ѵ�.
    model.removeNodeset(desNode);
    
    model.makeNode(desNode + "/" + ref_label);
    model.makeNode(desNode + "/" + ref_value);
    
    model.setValue(desNode + "/" + ref_label, label);
    model.setValue(desNode + "/" + ref_value, value) ;
    
    //��ü, ���� ���� ��忡 ���ڷḦ �����Ѵ�.
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
    //�ӽ� ���� �����Ѵ�.
    model.removeNodeset(tempNode);
    //model.refresh();
    
}


/*
    ����������� ����(������ �ʿ��ϸ� ���� �� ��ü ���� ���ּ���)
    
    Ư�� ��¥�� ���� ������ ����ŭ ����(+-)�� ��¥�� ��ȯ
    
    �Է� �Ķ����
        pInterval : "y" �� ���� ����, "m" �� �� ����, "d" �� �� ����
        pAddVal  : ���� �ϰ��� �ϴ� �� (������)
        pYyyymmdd : ������ ������ �Ǵ� ��¥
        pDelimiter : pYyyymmdd ���� ���� �����ڸ� ���� (������ "" �Է�)
        pDayOpt : "1" 1��, "0" ������ ��¥, �׿� ó�� ���� ���� (�ɼ�ó��)

    ��ȯ��
        yyyymmdd �Ǵ� �Լ� �Է½� ������ �����ڸ� ������ yyyy?mm?dd ��

    ��뿹
        2008-01-01 �� 3 �� ���ϱ� ==> addDate("d", 3, "2008-08-01", "-");
        20080301 �� 8 ���� ���ϱ� ==> addDate("m", 8, "20080301", "");
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
     
     //�����ڸ� ������ ���ڿ� ����
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

     //��¥ ����� Date ��ü�� �����ϸ鼭 �ڵ����� ó��
     //���̳� ��¥�� +- ���·� �ʰ��ϴ� ��� �ڵ� ����
     cDate = new Date(yyyy,mm - 1,dd)

     //�ɼ����� 0 ������ ��, 1 ó�� ���� ó���Ѵ�.
     if (pDayOpt == "0") {
         dd = 0;
         //������ ���� ��� ���� ���� �ٲ�Ƿ� +1
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
     
     //���� ��¥�� �ٽ� ��¥ ��ü�� �����ϰ�
     cDate = new Date(yyyy,mm,dd);
     //���� ���� ����ó�� �� ��
     cYear = cDate.getFullYear();
     cMonth = cDate.getMonth() + 1;
     cDay = cDate.getDate();
     //�տ� 0�� �ٿ��� �Ѱܾ� �� �ʿ䰡 ������ ó��
     cMonth = cMonth < 10 ? "0" + cMonth : cMonth;
     cDay = cDay < 10 ? "0" + cDay : cDay;
     
     if (pDelimiter != "") {
         //�Էµ� �����ڸ� �߰��ϰų�
         return cYear.toString() + pDelimiter + cMonth.toString() + pDelimiter + cDay.toString();
     } else {
         //�����Ͽ� ��ȯ ���ڿ� ����
         return cYear.toString() + cMonth.toString() + cDay.toString();
     }
     //�׳� ���� �����ϱ� ����
     return pYyyymmdd;
 }

function showCommonCodePopup1(job_clsf, cd_clsf, cd, cdnm, cd_abrv_yn, resultRef1, resultRef2, mang_cd_1, mang_cd_2, mang_cd_3, mang_cd_4, mang_cd_5, mang_cd_6, mang_cd_7, mang_cd_8, mang_cd_9, mang_cd_10, mang_cd_11, mang_cd_12){
	
	if(job_clsf == ""){
		commAlert("���������� �ʼ������Դϴ�.");
		return;
	}
	if(cd_clsf == ""){
		commAlert("�ڵ屸���� �ʼ������Դϴ�.");
		return;
	}
	if(resultRef1 == ""){
		commAlert("REF1 �� �ʼ������Դϴ�.");
		return;
	}
	if(resultRef2 == ""){
		commAlert("REF2 �� �ʼ������Դϴ�.");
		return;
	}

	makeFwdDataNodes();
	
	model.setValue("/root/reqData/fwdData/job_clsf", job_clsf); //�ʼ��׸�
	model.setValue("/root/reqData/fwdData/cd_clsf", cd_clsf); //�ʼ��׸�
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
		commAlert("���������� �ʼ������Դϴ�.");
		return;
	}
	if(cd_clsf == ""){
		commAlert("�ڵ屸���� �ʼ������Դϴ�.");
		return;
	}
	if(resultRef1 == ""){
		commAlert("REF1 �� �ʼ������Դϴ�.");
		return;
	}
	if(resultRef2 == ""){
		commAlert("REF2 �� �ʼ������Դϴ�.");
		return;
	}

	makeFwdDataNodes();
	
	model.setValue("/root/reqData/fwdData/job_clsf", job_clsf); //�ʼ��׸�
	model.setValue("/root/reqData/fwdData/cd_clsf", cd_clsf); //�ʼ��׸�
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
 *  ������ȣ �˻� ���� �˾�
 * _ref : request data node path
          zip - �˻��ܾ�, job_flag - Ư������/��ü������ȣ �˻����� ����
 * _resRef : �˻���� �����͸� ������ data node path
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
 *  ������ȣ �˻� ���� submission
 * _ref : request data node path
          zip - �˻��ܾ�, job_flag - Ư������/��ü������ȣ �˻����� ����
 * _resRef : �˻���� �����͸� ������ data node path
 */
function searchZip(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchZip", "/co/post/1152", _ref, _resRef);
}

//���������� �������� �ʰ� ��� �ּҸ� ��ȸ�ϴ� �ּ��˾�â �߰�����(20090827 ������)
//url���� ���ν������� �����и� 
/**
*  ������ȣ �˻� ���� �˾�
* _ref : request data node path
       zip - �˻��ܾ�, job_flag - Ư������/��ü������ȣ �˻����� ����
* _resRef : �˻���� �����͸� ������ data node path
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
*  ������ȣ �˻� ���� submission
* _ref : request data node path
       zip - �˻��ܾ�, job_flag - Ư������/��ü������ȣ �˻����� ����
* _resRef : �˻���� �����͸� ������ data node path
*/
function searchZipAll(_ref, _resRef)
{
remakeNode(_resRef);
modelSendNoMake("commSearchZip", "/co/post/1162", _ref, _resRef);
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	TrustForm�� child window�� ���� �� �� MID TAB�� �Բ� ���� �ǵ��� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	import�Ǵ� iv_Title ��ü�� ���� �̺�Ʈ�� dispatch�Ͽ�
//	import ���� �����ư(X)�� �����Ͱ� ���� ȿ���� ������ �ۼ�
//--------------------------------------------------------------------------------------------------
//����
//	formClose();
//==================================================================================================
function formClose() {
	iv_Title.group_tit.btnClose.dispatch("onclick");
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	String Type�� prototype ����
//	���ڿ��� ��¥���� ������ ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	Date type�� ���ڿ��� ��ȯ�� ��¥
//	������� ��Ȯ�� ���ڿ� �������� �ʴ� ��� null ��ȯ
//--------------------------------------------------------------------------------------------------
//����
//	��¥������ ���ڿ��� �ּ� 8�ڸ� �ִ� 10�ڸ��̸�
//	8�ڸ��� ��� �⵵�� 4�ڸ� ���� 2�ڸ� ���� 2�ڸ� ���¸� �����ؾ� �Ѵ�.
//	10�ڸ��� ��쵵 ��.��.���� �ڸ����� ��ġ�ؾ� �ϸ�
//	�߰��� �ִ� ���ڴ� ������ �����ϰ� ��¥�� ��ȯ �� �� �ִ� ��� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//	"20090101".ToDate();
//	"2009/01/01".ToDate();
//	"2009#01*01".ToDate();
//==================================================================================================
String.prototype.ToDate            = StringPrototypeToDate;
function StringPrototypeToDate() {
	vDate = null;
	vStr = this.Trim();
	
	//8�ڸ��� ����
	if (vStr.length == 8) {
		vYear = vStr.substr(0,4);
		vMonth = vStr.substr(4,2);
		vDay = vStr.substr(6,2);
	}
	//10�ڸ��� ���
	else if (vStr.length == 10) {
		vYear = vStr.substr(0,4);
		vMonth = vStr.substr(5,2);
		vDay = vStr.substr(8,2);
	}
	else {
		return null;
	}
	
	//ó���� ���� ���� ��ȯ �������� Ȯ��
	if (isNaN(vYear) || isNaN(vMonth) || isNaN(vDay)) {
		return null;
	}
	else {
		//���������� ��ȯ
		vYear = parseInt(vYear,10);
		vMonth = parseInt(vMonth,10);
		vDay = parseInt(vDay,10);
	}
	
	//����� üũ�ؼ� ��ȿ�ϸ�
	if ((vYear >= 1000 && vYear <= 9999) && (vMonth >= 1 && vMonth <= 12)) {
		//������ ��¥�� ���ؼ�
		vLastDay = (new Date(vYear,vMonth,0)).getDate();
		//1�Ϻ��� ������ �������� �ش��ϴ��� Ȯ���ؼ�
		if (vDay <= 0 || vDay > vLastDay) {
			//������ �ʰ��ϸ� ���� ó��
			return null;
		}
	}
	//����� üũ�ؼ� ��ȿȭ�� ������
	else {
		return null;
	}

	return new Date(vYear,vMonth - 1,vDay);
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	Date Type�� prototype ����
//	���� ��¥���� ������ ��¥�� �� �ϼ��� ���Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	Date type�� ��¥
//--------------------------------------------------------------------------------------------------
//���
//	Integer type�� �ϼ� ���� ��
//--------------------------------------------------------------------------------------------------
//����
//	Date type�� getTime() �Լ��� �̿��� millisecond ���̸� ���ϰ�
//	1000�� ���ؼ� �ʴ����� �ٲ۵�
//	60�� ���ؼ� �д���
//	60�� ���ؼ� �ô����� �����
//	24�� ���ؼ� �ϴ����� ���� ��ȯ�Ͽ� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//	"2009/02/28".ToDate().Diff("20090301".ToDate());
//==================================================================================================
Date.prototype.Diff                = DatePrototypeDiff;
function DatePrototypeDiff(p_date) {
	return ((this.getTime() - p_date.getTime()) / (1000*60*60*24));
}


/**
 *  �ܼ� �˷�(Ȯ�� Ÿ��Ʋ)
 *  strMsg : �޼���
 */
function commAlert(strMsg)
{
   model.alert(strMsg, "Ȯ��");
}

/**
 * �׸����� �ʼ��Է� Ȯ��
 * param : gridID(�׸��� ID ���ڿ�)
 * �׸��� ���û��� : �Ϲ� input�׸�� ���������� �׸����� �÷��� class="req" �� caption="�÷���" ����
 * ���࿹ : if(!commGridReqCheck("datagrid1")) return;
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
	                commMsgBox(grid.colAttribute(j, "caption") + "��(��) �ʼ��Է��׸��Դϴ�.");
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
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�׸��忡�� Copy&Pate ó�� 
//	�޺��ڽ� �巡�� ����� display text ��� value�� ����Ǵ� ���
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	���� �Լ� �� ���������� ����ϸ�
//	onmousedown,onmouseup,onkeypress,oncopy,onpaste ���� ���� �̺�Ʈ ���
//	���� ���� ��� �߰� ���� ��ϵ� ���� �̺�Ʈ ��ũ��Ʈ�� �ټ� �����Ǿ���...
//--------------------------------------------------------------------------------------------------
//����
//
//==================================================================================================
 
//grid���� ���Ͻ� ��ġ��(������ ��ġ�� grid�� ����� ��Ƴ��� ����)
 var startRow;
 var startCol;
 var endRow;
 var endCol;

 //label������ ���ϴ� ���� �����´�..(select�迭) select�� itemset�� label-value�����ϰ��
 function getParmByLabel( nodeSetName, label , param)
 {
 	var ins = document.models(0).instances(0);					
 	
 	var selNode = ins.selectSingleNode( "//"+nodeSetName+"[label = '"+label+"']/"+param);
 											
 	if ( selNode == null ){
 	//	alert("���� �����ϴ�");
 		return "";
 	}
 						
 	return selNode.text;
 }

 //value������ ���ϴ� ���� �����´�..(select�迭) select�� itemset�� label-value�����ϰ��
 function getParmByValue( nodeSetName, value , param)
 {
 	var ins = document.models(0).instances(0);					
 	
 	var selNode = ins.selectSingleNode( "//"+nodeSetName+"[value = '"+value+"']/"+param);
 											
 	if ( selNode == null ){
 	//	alert("���� �����ϴ�");
 		return "";
 	}
 						
 	return selNode.text;
 }

 //�ѱ����� üũ..
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

 //�������� üũ
 function isEng(str){
 	
 	return (/^[a-z]*$/gi).test(str);

 }

 //�������� üũ
 function isNumber(str){
 	
 	return (/^[0-9]*$/gi).test(str);

 }




 // remove row ��ũ(�������� ��Ÿ����Ÿ Ưȭ�Լ�)
 function removeRowsMarkStatius(grid, id){
 	var totalCnt = grid.selectedRows;
 	var grid_elements =  Array();
 	var cnt = 0;
 	var grid_node = grid.attribute("nodeset");
 	for(var i=totalCnt-1; i>=0; i--) {
 		var row = grid.selectedRow(i);
 		if(grid.valueMatrix(row, grid.colRef(id))!="") {
 			grid.rowStatus(row) = 4;								//�������� ����			
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


 //grid�� onmousedown
 function grid_onmousedown(){
	try{
	 	//���� focus�� control�� target
	 	var target = event.ptarget;
	
	 	//���� control�� ID
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

 //keypress�̺�Ʈ()
 function onkeypress(){
 	
 	//���ڿ�convert(��ҹ���)
 	toConvertChar("keypress");

 	//grid�϶�
 	
 	if(event.ptarget.parent.elementName == "xforms:datagrid"){
 	
 		//esc�� ��������
 		if( event.keyCode == 27 ){
 		
 			grid_blockClear();
 		
 		}
 	
 	}
 	//onkeypress�� event.stopPropagation()�� ������ �Է��� �ȵ�...
 	//event.stopPropagation();
 	
 }


 //���ڿ�convert
 function toConvertChar(action,g_row,g_col){
 	
 	//���� focus�� control�� target
 	var target = event.ptarget;

 	//���� control�� ID
 	var ctrl_id = document.all(event.currentTarget);
 	
 	//target�� �׸�����..(�׸���� ����Ÿ������ parent�� ã�ƾߵ�..�׸���ȿ� ��Ʈ�ѵ��� �ֱ⶧��)
 	//                              ����target�� grid�ȿ� input��Ʈ���̱⶧��(����� xforms:gridinput)                                 
 	//�׸����ϰ��
 	
 	var target_name = "";
 	
 	if(action == "keypress"){
 		target_name = target.parent.elementName;
 	}else if(action == "paste"){
 		target_name = target.elementName;
 	}
 	
 	if( target_name  == "xforms:datagrid" ){
 	
 		
 		if(action == "keypress"){
 			//���� grid�� ID
 			var grid = target.parent;
 			// �׸��� col�� _uppercase �� �˻���.
 			var col     = grid.col;
 		}else if(action == "paste"){
 			//���� grid�� ID
 			var grid = target;
 			// �׸��� col�� _uppercase �� �˻���.
 			var col     = g_col;	
 		}
 													
 		var index = 0;
 			
 		//for������ grid�� children�� ����(col�� �����ϱ�����..)
 		for(var i=0; i<grid.children.length; i++)
 		{
 			var colobj = grid.children(i);
 			
 			//col�̶��..
 			if(colobj.elementName == "xforms:col")
 			{
 				//col�� attribute�� _chartype�� upper���.. index�� ���� �Է��ϴ� �ʵ�� ����������� üũ�ϱ�����..
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
 				//col�� attribute�� _chartype�� lower���..
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
 	//�׸��尡 �ƴҰ��
 	}else{
 		
 		//alert("�׸���ƴ�, target_name=" + target_name + ", ctrl_id=" + ctrl_id);	
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



 //grid clear(CtrlŰ ������)
 function grid_blockClear(){

 	var i, j;
 	var tempClip = "";
 	var temp = "";

 	//���� control�� ID
 	var ctrl_id = document.all(event.ptarget.parent.attribute("id"));
 	
 	//selectinoMode
 	var selectionMode = ctrl_id.attribute("selectionmode");
 			
 	//mouse�� block�� �Ʒ����� ���� �������� �����Ƿ�..
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
 	
 	//�׸����� title�� �������°� �����ϱ�����..
 	if( startRow < ctrl_id.fixedrows ){
 		startRow = ctrl_id.fixedrows;
 	}

 	//selectionmode������ block������ �ٸ��� ����..
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

 //keypress�̺�Ʈ()
 function onkeypress(){
 	
 	//���ڿ�convert(��ҹ���)
 	toConvertChar("keypress");

 	//grid�϶�
 	
 	if(event.ptarget.parent.elementName == "xforms:datagrid"){
 	
 		//esc�� ��������
 		if( event.keyCode == 27 ){
 		
 			grid_blockClear();
 		
 		}
 	
 	}
 	//onkeypress�� event.stopPropagation()�� ������ �Է��� �ȵ�...
 	//event.stopPropagation();
 	
 }

 //grid�� onmouseup
 function grid_onmouseup(){
	try{
	 	//���� focus�� control�� target
	 	var target = event.ptarget;
	
	 	//���� control�� ID
	 	var ctrl_id = document.all(target.parent.attribute("id"));
	 	
	 	if(target.parent.elementName == "xforms:datagrid"){
	
	 		if(event.shiftKey != 1)
	 		{
	 			endRow = ctrl_id.mouseRow;
	 			endCol = ctrl_id.mouseCol;
	 		}
	 	
	 	}else{
	 		//���콺�� �׸��念���� ����� ��ġ�� ��Ƴ��� ����..
	 	}
 	} catch(e){
 	}
 }

 //onpaste
 function onpaste(){
 						
 	grid_onpaste();

 	event.stopPropagation();

 }

 //drag�� start
 function ondragstart(){

 	dragStart();

 	event.stopPropagation();
 	
 }

 //grid_ondragstart
 function dragStart(){

 	var ctrl_id = event.target
 		
 	model.property("dragTarget") = ctrl_id;
 	
 	//grid���..
 	if(event.ptarget.elementName == "xforms:datagrid"){
 				
 		model.property("dragRow") = document.all(ctrl_id).mouseRow;
 		model.property("dragCol") = document.all(ctrl_id).mouseCol;

 	}else{
 	
 		model.property("dragRow") = "";
 		model.property("dragCol") = "";
 	
 	}

 }


 //drop�� �̺�Ʈ
 function ondrop(){

 	drop();

 	event.stopPropagation();

 }

 //grid_ondrop
 function drop(){

 	var dragTarget = model.property("dragTarget");
 	var dropTarget = "";
 					
 	//grid���..
 	if( event.ptarget.parent.elementName == "xforms:datagrid"){
 	
 		dropTarget = event.ptarget.parent.attribute("id");
 		
 		var dragRow = model.property("dragRow");
 		var dropRow = document.all(dropTarget).mouseRow;

 		//����grid���� drag&drop�̸�
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
 			
 				commAlert("cell�� ������ �ƴ�");
 				//alert("���� alert�� ���� ����ִ°ų�..");
 				return;
 			
 			}
 	
 		//�ٸ��ٸ�..
 		}else{
 		
 			//dragTarget�� grid���..
 			if( dragRow != ""){
 			
 				//alert("�׸��尡 �޶�");
 				dropTarget = document.all(dropTarget);
 				dragTarget = document.all(dragTarget);
 												
 				if( (dropTarget.isCell(event.target)) && (dropTarget.mouseRow >= dropTarget.fixedrows) ){
 					
 					commAlert("�׸��尡 �ٸ��Ƿ� insert���� ����Ÿ������ ���ؿ�!!");
 					if(dragRow != dropRow){
 					
 						dropTarget.insertItem(dropRow);
 																						
 						for(var i = 0;i<dropTarget.cols;i++){
 							dropTarget.valueMatrix(dropTarget.mouseRow,i) = dragTarget.valueMatrix(dragRow,i);	
 						}
 																				
 						dropTarget.select(dropRow,0,dropRow,dropTarget.cols-1) = true;
 						
 					}

 				}else{
 				
 					commAlert("�׸��尡 �ٸ��Ƿ� �������� insert�� ������ ����Ÿ������ ���ؿ�!!");
 					dropTarget.addItem();
 																						
 					for(var i = 0;i<dropTarget.cols;i++){
 						dropTarget.valueMatrix(dropTarget.rows-1,i) = dragTarget.valueMatrix(dragRow,i);	
 					}
 																			
 					dropTarget.select(dropTarget.rows-1,0,dropTarget.rows-1,dropTarget.cols-1) = true;
 				
 				}

 			//�ƴ϶��..
 			}else{
 			
 				commAlert("grid�� �ƴ� ��Ʈ���� ����Ÿ�� �����Ҽ� �����Ƿ� return");
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
 				
 				commAlert("grid�� �ƴ� ��Ʈ���� ����Ÿ�� �����Ҽ� �����Ƿ� return");
 				return;

 			}else{
 			
 				var dragData = dragTarget.value;
 				dropTarget.value = "";//defalut������ �ϹǷ�..
 			
 			}

 		}else{ 
 		
 			if(event.ptarget.elementName == "xforms:datagrid"){
 				
 				dragTarget = model.property("dragTarget");
 				dropTarget = event.ptarget.attribute("id");
 						
 				//����grid���� drag&drop�̸�
 				if( (dragTarget != "") && (dragTarget == dropTarget) ){
 					commAlert("cell�� ������ �ƴ�");
 					return;
 				}else{
 				
 					commAlert("�׸��尡 �ٸ��Ƿ� �������� insert�� ������ ����Ÿ������ ���ؿ�!!");
 					
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

 //grid�� onpaste
 function grid_onpaste(){

 	//���� focus�� control�� target
 	var target = event.ptarget;

 	//���� control�� ID
 	var ctrl_id = document.all(event.currentTarget);
 	
 	var data = window.clipBoardData;// clipBoard�� �ִ� ����Ÿ��

 	if(target.elementName == "xforms:datagrid" && (ctrl_id.row >= ctrl_id.fixedrows) ){
 			
 		if(data != ""){
 			var arrdata = data.split("\n");
 													
 			for(var i = 0; i < arrdata.length-1 ; i++ )// ���� ����
 			{
 				var arrdata1 = arrdata[i].split("\t");
 				
 				for(var j=0;j< arrdata1.length;j++){//���� ����					
 					var index = 0;					
 				
 					for(var k=0; k<target.children.length; k++)
 					{
 						var colobj = target.children(k);						
 						//col�̶��..
 						if(colobj.elementName == "xforms:col")
 						{							
 							//col�� attribute�� type�� combo���.. 
 							if( (index == ctrl_id.col+j) && colobj.attribute("type") == "combo"){					
 								
 								if( arrdata1[j].substring(arrdata1[j].length-1,arrdata1[j].length) == "\r"){
 									
 									var label = arrdata1[j].substring(0,arrdata1[j].length-1);
 								}
 								else{
 									if( isNumber(arrdata1[j]) ){//�����̸�..
 										var label = eval(arrdata1[j]);	
 									}else{//���ڰ��ƴϸ�..
 										var label = arrdata1[j];	
 									}
 								}								
 								ctrl_id.valueMatrix(ctrl_id.row+i, ctrl_id.col+j) = getParmByLabel( "itemset" , label , "value");
 								break;

 							}else{//�޺��� �ƴҰ��						
 							
                                var nRowheader = 0;
                                if(ctrl_id.attribute("rowheader") != "")
                                {
                                 nRowheader = 1;
                                }
                                if( (index == ctrl_id.col+j-nRowheader) && colobj.attribute("type") != ""){//output�̸� �������..
 							
 									if( arrdata1[j].substring(arrdata1[j].length-1,arrdata1[j].length) == "\r"){
 										ctrl_id.valueMatrix(ctrl_id.row+i, ctrl_id.col+j) = arrdata1[j].substring(0,arrdata1[j].length-1);
 									}else{
 										if( isNumber(arrdata1[j]) ){//�����̸�..
 											ctrl_id.valueMatrix(ctrl_id.row+i, ctrl_id.col+j) = eval(arrdata1[j]);	
 										}else{//���ڰ� �ƴϸ�..
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
 		
 	//	alert("�׸��尡 �ƴϹǷ�...");	
 		
 	}	
 }

 //oncopy�϶�
 function oncopy(){

 	grid_oncopy();

 	event.stopPropagation();
 	
 }

 //grid�� oncopy
 function grid_oncopy(){

 	//���� focus�� control�� target
 	var target = event.ptarget;

 	//���� control�� ID
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
  * �����Աݳ����˾� ����
  * param : /root/reqData/fwdData(�����ϴ� ȭ�鿡�� �ʿ��� ���� ���� �� �ѱ�)
  * 
  * /root/reqData/fwdData/system 			: IN(�ʼ�): �ý��۱��б��� : �����ڵ�[00-08]  
  * /root/reqData/fwdData/acct_mang_no 		: IN: ���°�����ȣ    : [02-68] 
  * /root/reqData/fwdData/biz_reg_no_ref 	: OUT(�ʼ�) : ������ ����ڹ�ȣ_XPATH
  * /root/reqData/fwdData/bank_id_ref 		: OUT(�ʼ�) : �����ڵ�_XPATH
  * /root/reqData/fwdData/acct_num_ref 	 	: OUT(�ʼ�) : ���¹�ȣ_XPATH
  * /root/reqData/fwdData/tran_date_ref 	: OUT(�ʼ�) : �ŷ�����_XPATH
  * /root/reqData/fwdData/tran_date_seq_ref : OUT(�ʼ�) : �ŷ��� �Ϸù�ȣ_XPATH
  *
  * /root/reqData/fwdData/current_clsf_ref  : OUT(�ʼ�) : D:��ȭ�Ա�, F:��ȯ�Ա�
  *
  * /root/reqData/fwdData/acct_mang_no_ref 	: OUT : ���°�����ȣ_XPATH
  * /root/reqData/fwdData/acct_mang_nm_ref	: OUT : ���°��������_XPATH
  * /root/reqData/fwdData/tran_amt_ref 	 	: OUT : �ŷ��ݾ�_XPATH
  * /root/reqData/fwdData/tran_content_ref 	: OUT : �Ա�ó_XPATH
  * /root/reqData/fwdData/cms_code_ref 	 	: OUT : �������_XPATH
  *
  * /root/reqData/fwdData/acct_tonghwa_ref	: OUT : ��ȭ����_XPATH
  * /root/reqData/fwdData/flex_amt_ref 	 	: OUT : ��ȯ�ݾ�_XPATH
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
							
//�������ȭ�� ȣ��.							
function openOzwin(p_node) {						
	window.load("/common/xrw/oz_popup.xrw"					
		,"new"				
		,"oz_popup"				
		,"resize:false;width:987px;height:" + window.height + "px;top:20px;left:100px;align:center;"				
		,p_node				
		,p_node);				
}						
							
// ������� ��� ����							
function resetOznode() {						
	model.removenode("/root/oz_data");
	model.makeNode("/root/oz_data/preview");
	model.makeNode("/root/oz_data/printsize");
	model.makeNode("/root/oz_data/conParam");
	model.makeNode("/root/oz_data/odiParam");
	model.makeNode("/root/oz_data/expParam");
}						

// �� �׸��忡�� ����
function deleteRows(datagrid){
	var i = 0;
	for(i; i < datagrid.rows; i++){
		if(datagrid.rowStatus(i) == "1"){
			datagrid.deleteRow(i);
			i = 0;
		}
	}
}
// �׸��� Ŭ���� ���°� �ٲٱ� 
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
		    if (window.alert("�����Ͻ� ���� �ʱ�ȭ �Ͻðڽ��ϱ�?", "", 1) == 1) {
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
// ���� (new, delete�� �����ϰ� �ʱ�ȭ)
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
		//��������� �����ϸ� ���ϰ� True
		if(datagrid.rowStatus(i) == "4"){
			rtn_value = true;
		}
	}
	
	if (!rtn_value)
		alert("������ ����� �����ϴ�.");	
		
	return rtn_value;
}
// ���� (new, insert, update, insert & new�� �����ϰ� �ʱ�ȭ)
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
		//�������� �����ϸ� ���ϰ� True
		if(datagrid.rowStatus(i) == "2" || datagrid.rowStatus(i) == "3"){
			rtn_value = true;
		}
	}
	
	if (!rtn_value)
		alert("������ ����� �����ϴ�.");	
		
	return rtn_value;
}
// ���, ����, �ֹι�ȣ�� �˻�
function setInfoSearchInput(emp_no, nm_korn, prn, retFunc){

	makeNodeValue("/root/searchData/emp_no", emp_no);
	makeNodeValue("/root/searchData/nm_korn", nm_korn);
	makeNodeValue("/root/searchData/prn", prn);
	modelSendNoMake("hd_co_1001_s", "/hd/co/1001", "/root/searchData", "/root/tempData");
	model.removenode("/root/searchData");

	var chk_cnt = model.getValue("/root/tempData/totalcnt");

	if(chk_cnt == 0){
		alert("��ȸ ������ ��ġ�ϴ� ����� �����ϴ�.");			
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

//orgStr : ���� ���ڿ�
//cmpStr : ���ԵǾ� �ִ��� ã�� ���� ���ڿ�
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