/**
 * ���ǽý��� �������� �κ�
 * :�׸����� selectionmode�� free�� ����Ʈ ����
 */	
setGridFree();

//�׸��� ȭ��ǥ �̵��� ���� üũ ����
var grid_col_type = "";
			
/*************************************************************************************************/
/* 0. ���� Global Event ���� �Լ� (Event)
/* 1)  onkeydown   		: ȭ��ǥŰ üũ
/* 2)  onentercell 		: �÷��̵� �� �÷�Ÿ���� ����Ʈ���� ��� ������ �� ����
/* 3)  xforms_next 		: �÷��̵��� �̵� �� �÷�Ÿ���� ���������� set
/* 4)  xforms_previous	: �÷��̵��� �̵� �� �÷�Ÿ���� ���������� set
/*************************************************************************************************/
/*-----------------------------------------------------------------------------------
 * NAME  : onkeydown()
 * DESC  : keydown�� ȭ��ǥ üũ�Ͽ� �̺�Ʈ ó��
 * PARAM : 
 * DATE  : 
 * AUTH  : ����
 *----------------------------------------------------------------------------------*/
function onkeydown() {
    var currtarget = event.currentTarget;
    if(currtarget.indexOf("_$") != -1) return false;
    if(currtarget == "body" || currtarget == "html" ) return false;

    var obj = document.controls(currtarget);
    var id = obj.attribute("id");
    var arrowkey = obj.attribute("arrowkey");
    var grid = document.all(id);

	var fixcol;		//��������
	var fixrow;		//�������
	var totcol;		//�ѿ���
	var nowcol;		//���翭��ġ
	var totrow;		//�����
	var nowrow;		//��������ġ

    if(obj.elementName == "xforms:datagrid") {
		//ȭ��ǥŰ �̺�Ʈ ��� üũ
		if(arrowkey == "Y"){
			//ȭ��ǥŰ
			if(event.keyCode == 37 || event.keyCode == 38 || event.keyCode == 39 || event.keyCode == 40){
				fixcol = grid.fixedCols;
				fixrow = grid.fixedRows;
				totcol = grid.cols;
				nowcol = grid.col;
				totrow = grid.rows;
				nowrow = grid.row;

				//ȭ��ǥ Ű�� ���� ó��
				if      (event.keyCode == 37){
					//���� ȭ��ǥ
					if(nowcol > fixcol){
						if((grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate") && grid_col_type != "combo"){
							model.setFocus(id);
							grid.col = nowcol-1;
							grid.row = nowrow;
							grid.editCell();
						}
					}
			
				}else if(event.keyCode == 38){
					//���� ȭ��ǥ
					if(nowrow > fixrow){
						if(grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate"){
							model.setFocus(id);
							grid.col = nowcol;
							grid.row = nowrow-1;
							grid.editCell();
						}
					}
			
				}else if(event.keyCode == 39){
					//������ ȭ��ǥ
					if(nowcol+1 < totcol){
						if((grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate") && grid_col_type != "combo"){
							model.setFocus(id);
							grid.col = nowcol+1;
							grid.row = nowrow;
							grid.editCell();
						}
					}
			
				}else if(event.keyCode == 40){
					//�Ʒ��� ȭ��ǥ
					if(nowrow+1 < totrow){
						if(grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate"){
							model.setFocus(id);
							grid.col = nowcol;
							grid.row = nowrow+1;
							grid.editCell();
						}
					}
				}
			
				grid_col_type	=	"";
			}
		}
    }

}

/*-----------------------------------------------------------------------------------
 * NAME  : onentercell()
 * DESC  : �÷��̵� �� �÷�Ÿ���� ����Ʈ���� ��� ������ �� ����
 * PARAM : 
 * DATE  : 
 * AUTH  : ����
 *----------------------------------------------------------------------------------*/
function onentercell() {
    var currtarget = event.currentTarget;
    if(currtarget.indexOf("_$") != -1) return false;
    if(currtarget == "body" || currtarget == "html" ) return false;
    
    var obj = document.controls(currtarget);
    var id = obj.attribute("id");
    var arrowkey = obj.attribute("arrowkey");
    var grid = document.all(id);

	var nowcol;

    if(obj.elementName == "xforms:datagrid") {
		//ȭ��ǥŰ �̺�Ʈ ��� üũ
		if(arrowkey == "Y"){
			nowcol = grid.col;		//�����÷� ��ġ

			if(grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate"){
				grid.editCell();
			}
		}
    }
}

/*-----------------------------------------------------------------------------------
 * NAME  : xforms_next()
 * DESC  : �÷��̵��� �̵� �� �÷�Ÿ���� ���������� set
 * PARAM : 
 * DATE  : 
 * AUTH  : ����
 *----------------------------------------------------------------------------------*/
function xforms_next() {
    var currtarget = event.currentTarget;
    if(currtarget.indexOf("_$") != -1) return false;
    if(currtarget == "body" || currtarget == "html" ) return false;
    
    var obj = document.controls(currtarget);
    var id = obj.attribute("id");
    var arrowkey = obj.attribute("arrowkey");
    var grid = document.all(id);

    if(obj.elementName == "xforms:datagrid") {
		//ȭ��ǥŰ �̺�Ʈ ��� üũ
		if(arrowkey == "Y"){
			grid_col_type = grid.colType(grid.col);
		}
    }
}

/*-----------------------------------------------------------------------------------
 * NAME  : xforms_previous()
 * DESC  : �÷��̵��� �̵� �� �÷�Ÿ���� ���������� set
 * PARAM : 
 * DATE  : 
 * AUTH  : ����
 *----------------------------------------------------------------------------------*/
function xforms_previous() {
    var currtarget = event.currentTarget;
    if(currtarget.indexOf("_$") != -1) return false;
    if(currtarget == "body" || currtarget == "html" ) return false;
    
    var obj = document.controls(currtarget);
    var id = obj.attribute("id");
    var arrowkey = obj.attribute("arrowkey");
    var grid = document.all(id);

    if(obj.elementName == "xforms:datagrid") {
		//ȭ��ǥŰ �̺�Ʈ ��� üũ
		if(arrowkey == "Y"){
			grid_col_type = grid.colType(grid.col);
		}
    }
}

/**
 * ��� �׸����� selectionmode�� free�� ����Ʈ ����
 * parameter objName : 
 */
function setGridFree(objName){
    var obj;
    var childObj;
    var cnt;
	
    if(objName == null){
        obj = document.body;
    }else{
        obj = document.controls(objName);
    }
    
    cnt = obj.children.length;
    for(var i=0; i<cnt; i++){
        ChildObj = obj.children(i);
        
        if(ChildObj.elementName == "xforms:datagrid"){
			if ( ChildObj.attribute("selectionmode") != "byrow" ){
				ChildObj.attribute("selectionmode") = "free";
			}
		}else if(ChildObj.elementName == "xforms:group"){
	            setGridFree(ChildObj.attribute("id"));
	 	}else if(ChildObj.elementName == "xforms:switch"){
	            setGridFree(ChildObj.attribute("id"));
        }else if(ChildObj.elementName == "xforms:case"){
	            setGridFree(ChildObj.attribute("id"));
        }
    }
}	
  
/**
 * ������ ����� ���� ������Ʈ���� ���� ���(1 depth ������ �ش�)
 * parameter strPath : XPath
 */
function clearNode(strPath){ 	
	
	var node = root.selectSingleNode(strPath);

	var nodeList = node.childNodes;

	while (childNode = nodeList.nextNode()){
		childNode.value = "";
	}
	model.refresh();
}

/**
 * �׸����� ù��° ���� ������ ������ �ϰ� �����Ѵ�.
 * ������ ���� ���� �����߱� ������ ��ȸ�� ������ �ٽ� grid.clearStatus()�� �ؾ���.
 * parameter strPath : 
 */
function setLumpChg(grid, index){
	if ( eval(grid+".rows") <= eval(grid + ".fixedRows") ){
		alert("��ȸ�� �̿��� �� �ֽ��ϴ�.");
		return;
	}
	var keyVal		= eval(grid + ".valueMatrix(1, " + index + ")");
	var len			= eval(grid + ".rows");
	var status      = "";
	var oriVal      = "";
	for ( var i = 2 ; i <= len ; i++ ){
		oriVal      = eval(grid + ".valueMatrix(" + i + ", " + index + ")");
		if ( keyVal != oriVal )
		{
			eval(grid + ".valueMatrix(" + i + ", " + index + ") = '" + keyVal + "'");
			//���� ���� ������ �ʾƼ� ������ ���� ���� ������Ʈ�� ����. �� �μ�Ʈ�� ���� �μ�Ʈ �״�� �д�.
			status      = eval(grid + ".rowStatus(" + i + ")")
			if ( status == "1" )
			{
				status = "insert";
			} else {
				status = "update";
			}
			eval(grid + ".addStatus(" + i + ", '" + status + "')");
		}
	}

	model.refresh();
}

/**
 * ����ŷ�ó�ڵ� ��� �˾�
 * 
 * parameter strPath : 
 */
function regDlcoInfo(){

    viewer("mainFrame").window.javaScript.onLoadPopupPage("CO_DLCO_1000");
}

/**
 * ����ŷ�ó�ڵ� �˻� �˾�
 * 
 * parameter strPath : 
 */
function showDlcoSearchPopup(){
	if(instance1.selectSingleNode("/root/reqData/fwdData/func_nm") == null){
		model.makeNode("/root/reqData/fwdData/func_nm");
	}
	model.setValue("/root/reqData/fwdData/func_nm", "setDlcoInfo");
	
	window.load("/xrw/co/dlco/CO_DLCO_1100.xrw"
	            ,"modal"
	            ,""
	            ,"align:center; width:650px; height:490px; caption:hidden;"
	            ,"/root/reqData/fwdData"
   	            ,"/root/reqData/fwdData"
	);
}

/**
 * �׸����� ������ ���°��� ���� ���·� �����Ѵ�.
 * 
 * parameter strPath : 
 */
function pl_grid_update(grid){
	var rowcnt = eval(grid + ".rows") - 1;
	for ( var i = 1 ; i <= rowcnt ; i++ )
	{
		eval(grid + ".rowStatus(" + i + ") = 2");
	}
}

/**
 * ������ �׸����� �� ���°��� ���� ���·� �����Ѵ�.
 * 
 * parameter strPath : 
 */
function pl_grid_select(grid){
	var len = eval(grid + ".row");
	eval(grid + ".rowStatus(" + len + ") = 4");
	//var len = eval(grid + ".selectedRows");
	//var index;
	//for ( var i = 0 ; i < len ; i++ )
	//{
	//	index	= eval(grid + ".selectedRow(" + i + ")");
	//	eval(grid + ".rowStatus(" + index + ") = 4");
	//}
}

/**
 * ������ �׸����� ������ ���°��� ���� ���·� �����Ѵ�.
 * 
 * parameter strPath : 
 */
function pl_grid_select_del(grid){
	var rowcnt = eval(grid + ".selectedRows");
	var rowIdx;
	for ( var i = 0 ; i < rowcnt ; i++ )
	{
		rowIdx = eval(grid + ".selectedRow(" + i + ")");
		eval(grid + ".rowStatus(" + rowIdx + ") = 4");
	}
}

/**
 * �����ȣ ȣ��(�Ϲݿ�, �����ȣ �׸��� �ΰ�¥��)
 * parameter
 *  - bogb : ������ ����������(L�̸� �Ⱥ���)
 *  - zip1Ref : �����ȣ1 xPath
 *  - zip2Ref : �����ȣ2 xPath
 *  - addrRef : �ּ� xPath
*/
function pl_openZip(bogb, zip1Ref, zip2Ref, addrRef){

	var tempReq = "/root/tempData/posttemp";
	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	tempReq = "/root/tempData/posttemp/send";
	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	tempReq = "/root/tempData/posttemp/send/zip";
	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	tempReq = "/root/tempData/posttemp/send/disp_flag";
	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	tempReq = "/root/tempData/posttemp/recv";
	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	
	//"L"�̸� �����׸� �Ⱥ���
	model.setValue("/root/tempData/posttemp/send/disp_flag", bogb);
	model.setValue("/root/tempData/posttemp/send/zip", model.getValue(addrRef));
	
	openZip("/root/tempData/posttemp/send", "/root/tempData/posttemp/recv");
	
	model.setValue(zip1Ref, model.getValue("/root/tempData/posttemp/recv/zip1"));
	model.setValue(zip2Ref, model.getValue("/root/tempData/posttemp/recv/zip2"));
	model.setValue(addrRef, model.getValue("/root/tempData/posttemp/recv/addr"));
	
	model.refresh();

}

/**
 * ���õ� �׸����� ������ ���°��� ���� ���·� �����Ѵ�.
 * 
 * parameter strPath : 
 */
function pl_grid_delete(grid){
	var len = eval(grid + ".row");
	eval(grid + ".rowStatus(" + len + ") = 4");
	//var len = eval(grid + ".selectedRows");
	//var index;
	//for ( var i = 0 ; i < len ; i++ )
	//{
	//	index	= eval(grid + ".selectedRow(" + i + ")");
	//	eval(grid + ".rowStatus(" + index + ") = 4");
	//}
}

/**
 * �׸����� ���� ������ �����Ѵ�.
 * 
 * parameter strPath : 
*/
function checkChg(grid){
	var retVal = false;
	var rows = eval(grid + ".rows");
	var status
	for ( var i = 1 ; i < rows ; i++ ){
		status = eval(grid + ".rowStatus(" + i + ")");
		if ( status != 0 ){
			retVal = true;
			break;
		}
	}
	return retVal;
}

/**
 * �ŷ�ó������ ������ 1�ǰ˻� �Ǵ� �˾� �ٿ�� 
 * parameter 
 * - btnChk(��ưüũ) : B-��ưŬ��, P-��ưŬ����(INPUT BOX OR ENTER)
 * - flag(���±���)   : N-�Ϲ� ������Ʈ, G-�׸��� ���۳�Ʈ
 * - rootPath         : ������� xpath  
 * - grid             : grid ȣ���ϰ�� grid id��(String)
 * - dlco_cdReq       : �ŷ�ó�ڵ� Element��
 * - dlco_seqReq      : �ŷ�ó���� Element��
 * - dlco_nmReq       : �ŷ�ó�� Element��
 * - dlco_clsfReq     : �ŷ�ó���� Element��
 * - areaReq          : ���� Element��
 * - prv_curr_clsfReq : �����ӱ��� Element��
 */
function pl_getDlcoInfo_p(btnChk, flag, rootPath, grid, dlco_cdReq, dlco_seqReq, dlco_nmReq, dlco_clsfReq, areaReq, prv_curr_clsfReq){
	//Data Set node
	var Xp_dlco_cd		=	"";
	var Xp_dlco_seq		=	"";
	var Xp_dlco_nm		=	"";
	var Xp_dlco_clsf	=	"";
	var Xp_area			=	"";
	var Xp_prv_curr_clsf=	"";

	//req�� ������
	var tempReq = "/root/tempData/keyData/tempReq";

	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	if(instance1.selectSingleNode(tempReq+"/dlco_nm") == null){
		model.makeNode(tempReq+"/dlco_nm");
	}
	if(instance1.selectSingleNode(tempReq+"/dlco_clsf") == null){
		model.makeNode(tempReq+"/dlco_clsf");
	}
	if(instance1.selectSingleNode(tempReq+"/area") == null){
		model.makeNode(tempReq+"/area");
	}
	if(instance1.selectSingleNode(tempReq+"/prv_curr_clsf") == null){
		model.makeNode(tempReq+"/prv_curr_clsf");
	}

	//res�� ������
	var tempRes = "/root/tempData/keyData/tempRes";

	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}

	//�׸����� ��� row �ʱ�ȭ
	var row		=	"";
	
	//�׸��忡���� ȣ���ϰ�� row ����
	if(flag == "G"){
		var rows		=	eval(grid + ".rows");
		var selectRow	=	eval(grid + ".row");

		if(rows == eval(grid + ".fixedRows") + 1){
			row			=	"";
		} else {
			row			=	"[" + selectRow + "]";
		}
	}

	//Data Set node ������ �� ��ȸ���� Set
	if(dlco_cdReq.length > 0){
		Xp_dlco_cd		=	rootPath + row + "/" + dlco_cdReq;
	}
	if(dlco_seqReq.length > 0){
		Xp_dlco_seq		=	rootPath + row + "/" + dlco_seqReq;
	}
	if(dlco_nmReq.length > 0){
		Xp_dlco_nm		=	rootPath + row + "/" + dlco_nmReq;
		model.setValue(tempReq+"/dlco_nm", model.getValue(Xp_dlco_nm));
	}else{
		model.setValue(tempReq+"/dlco_nm", "");
	}
	if(dlco_clsfReq.length > 0){
		Xp_dlco_clsf	=	rootPath + row + "/" + dlco_clsfReq;
		model.setValue(tempReq+"/dlco_clsf", model.getValue(Xp_dlco_clsf));
	}else{
		model.setValue(tempReq+"/dlco_clsf", "");
	}
	if(areaReq.length > 0){
		Xp_area			=	rootPath + row + "/" + areaReq;
		model.setValue(tempReq+"/area", model.getValue(Xp_area));
	}else{
		model.setValue(tempReq+"/area", "");
	}
	if(prv_curr_clsfReq.length > 0){
		Xp_prv_curr_clsf=	rootPath + row + "/" + prv_curr_clsfReq;
		model.setValue(tempReq+"/prv_curr_clsf", model.getValue(Xp_prv_curr_clsf));
	}else{
		model.setValue(tempReq+"/prv_curr_clsf", "");
	}

	//�Ǽ� �ʱ�ȭ
	var rsltCnt = 0;

	//��ưüũ
	if(btnChk == "P"){
		//�Ǽ��˻� ��ȸ submit
		modelSendNoMake("pl_com_1020_s", "/pl/com/1020", tempReq, tempRes);
		rsltCnt = parseInt(model.getValue(tempRes+"/rsltcnt"));
	}

	//�Ǽ� �� ��ư�� ���� ó��
	if(rsltCnt == 0 && btnChk == "P"){
		if(dlco_cdReq.length > 0){
			model.setValue(Xp_dlco_cd, "");
		}
		if(dlco_seqReq.length > 0){
			model.setValue(Xp_dlco_seq, "");
		}
		if(dlco_nmReq.length > 0){
			model.setValue(Xp_dlco_nm, "");
		}
		if(dlco_clsfReq.length > 0){
			model.setValue(Xp_dlco_clsf, "");
		}
		if(areaReq.length > 0){
			model.setValue(Xp_area, "");
		}
		if(prv_curr_clsfReq.length > 0){
			model.setValue(Xp_prv_curr_clsf, "");
		}
	}else if(rsltCnt == 1 && btnChk == "P"){
		if(dlco_cdReq.length > 0){
			model.setValue(Xp_dlco_cd, model.getValue(tempRes+"/dlco_cd"));
		}
		if(dlco_seqReq.length > 0){
			model.setValue(Xp_dlco_seq, model.getValue(tempRes+"/dlco_seq"));
		}
		if(dlco_nmReq.length > 0){
			model.setValue(Xp_dlco_nm, model.getValue(tempRes+"/dlco_nm"));
		}
		if(dlco_clsfReq.length > 0){
			model.setValue(Xp_dlco_clsf, model.getValue(tempRes+"/dlco_clsf"));
		}
		if(areaReq.length > 0){
			model.setValue(Xp_area, model.getValue(tempRes+"/area"));
		}
		if(prv_curr_clsfReq.length > 0){
			model.setValue(Xp_prv_curr_clsf, model.getValue(tempRes+"/prv_curr_clsf"));
		}
	}else if(rsltCnt > 1 || btnChk == "B"){
		//property �ʱ�ȭ
		model.property("dlco_cd")				=	"";
		model.property("dlco_seq")				=	"";
		model.property("dlco_nm")				=	"";
		model.property("dlco_clsf")				=	"";
		model.property("area")					=	"";
		model.property("prv_curr_clsf")			=	"";

		model.property("dlco_cd_path")			=	"";
		model.property("dlco_seq_path")			=	"";
		model.property("dlco_nm_path")			=	"";
		model.property("dlco_clsf_path")		=	"";
		model.property("area_path")				=	"";
		model.property("prv_curr_clsf_path")	=	"";

		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		if(dlco_cdReq.length > 0){
			model.property("dlco_cd_path")			=	Xp_dlco_cd;
		}
		if(dlco_seqReq.length > 0){
			model.property("dlco_seq_path")			=	Xp_dlco_seq;
		}
		if(dlco_nmReq.length > 0){
			model.property("dlco_nm")				=	model.getValue(Xp_dlco_nm);
			model.property("dlco_nm_path")			=	Xp_dlco_nm;
		}
		if(dlco_clsfReq.length > 0){
			model.property("dlco_clsf")				=	model.getValue(Xp_dlco_clsf);
			model.property("dlco_clsf_path")		=	Xp_dlco_clsf;
		}
		if(areaReq.length > 0){
			model.property("area")					=	model.getValue(Xp_area);
			model.property("area_path")				=	Xp_area;
		}
		if(prv_curr_clsfReq.length > 0){
			model.property("prv_curr_clsf")			=	model.getValue(Xp_prv_curr_clsf);
			model.property("prv_curr_clsf_path")	=	Xp_prv_curr_clsf;
		}

		//�ŷ�ó �˻� �˾� ȣ��
		window.load(
				 "/xrw/pl/com/PL_COM_1000.xrw" 
				,"modal"
				,""
				,"left:200px; top:200px; width:650px; height:490px; align:center; caption:hidden;"
				,""
				,""
			);
	}
}

/**
 * �ŷ�ó������ ������ 1�ǰ˻� �Ǵ� �˾� �ٿ��(�߼�ó����)
 * parameter 
 * - btnChk(��ưüũ) : B-��ưŬ��, P-��ưŬ����(INPUT BOX OR ENTER)
 * - flag(���±���)   : N-�Ϲ� ������Ʈ, G-�׸��� ���۳�Ʈ
 * - rootPath         : ������� xpath  
 * - grid             : grid ȣ���ϰ�� grid id��(String)
 * - dlco_cdReq       : �ŷ�ó�ڵ� Element��
 * - dlco_seqReq      : �ŷ�ó���� Element��
 * - dlco_nmReq       : �ŷ�ó�� Element��
 * - send_plac_seqReq : �߼�ó���� Element��
 * - send_plac_nmReq  : �߼�ó�� Element��
 * - dlco_clsfReq     : �ŷ�ó���� Element��
 * - areaReq          : ���� Element��
 * - prv_curr_clsfReq : �����ӱ��� Element��
 */
function pl_getDlcoSendPlac_p(btnChk, flag, rootPath, grid, dlco_cdReq, dlco_seqReq, dlco_nmReq, send_plac_seqReq, send_plac_nmReq, dlco_clsfReq, areaReq, prv_curr_clsfReq){
	//Data Set node
	var Xp_dlco_cd			=	"";
	var Xp_dlco_seq			=	"";
	var Xp_dlco_nm			=	"";
	var Xp_send_plac_seq	=	"";
	var Xp_send_plac_nm		=	"";
	var Xp_dlco_clsf		=	"";
	var Xp_area				=	"";
	var Xp_prv_curr_clsf	=	"";

	//req�� ������
	var tempReq = "/root/tempData/keyData/tempReq";

	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	if(instance1.selectSingleNode(tempReq+"/dlco_nm") == null){
		model.makeNode(tempReq+"/dlco_nm");
	}
	if(instance1.selectSingleNode(tempReq+"/dlco_clsf") == null){
		model.makeNode(tempReq+"/dlco_clsf");
	}
	if(instance1.selectSingleNode(tempReq+"/area") == null){
		model.makeNode(tempReq+"/area");
	}
	if(instance1.selectSingleNode(tempReq+"/prv_curr_clsf") == null){
		model.makeNode(tempReq+"/prv_curr_clsf");
	}

	//res�� ������
	var tempRes = "/root/tempData/keyData/tempRes";

	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}

	//�׸����� ��� row �ʱ�ȭ
	var row		=	"";
	
	//�׸��忡���� ȣ���ϰ�� row ����
	if(flag == "G"){
		var rows		=	eval(grid + ".rows");
		var selectRow	=	eval(grid + ".row");

		if(rows == eval(grid + ".fixedRows") + 1){
			row			=	"";
		} else {
			row			=	"[" + selectRow + "]";
		}
	}

	//Data Set node ������ �� ��ȸ���� Set
	if(dlco_cdReq.length > 0){
		Xp_dlco_cd		=	rootPath + row + "/" + dlco_cdReq;
	}
	if(dlco_seqReq.length > 0){
		Xp_dlco_seq		=	rootPath + row + "/" + dlco_seqReq;
	}
	if(dlco_nmReq.length > 0){
		Xp_dlco_nm		=	rootPath + row + "/" + dlco_nmReq;
		model.setValue(tempReq+"/dlco_nm", model.getValue(Xp_dlco_nm));
	}else{
		model.setValue(tempReq+"/dlco_nm", "");
	}
	if(send_plac_seqReq.length > 0){
		Xp_send_plac_seq=	rootPath + row + "/" + send_plac_seqReq;
	}
	if(send_plac_nmReq.length > 0){
		Xp_send_plac_nm	=	rootPath + row + "/" + send_plac_nmReq;
	}
	if(dlco_clsfReq.length > 0){
		Xp_dlco_clsf	=	rootPath + row + "/" + dlco_clsfReq;
		model.setValue(tempReq+"/dlco_clsf", model.getValue(Xp_dlco_clsf));
	}else{
		model.setValue(tempReq+"/dlco_clsf", "");
	}
	if(areaReq.length > 0){
		Xp_area			=	rootPath + row + "/" + areaReq;
		model.setValue(tempReq+"/area", model.getValue(Xp_area));
	}else{
		model.setValue(tempReq+"/area", "");
	}
	if(prv_curr_clsfReq.length > 0){
		Xp_prv_curr_clsf=	rootPath + row + "/" + prv_curr_clsfReq;
		model.setValue(tempReq+"/prv_curr_clsf", model.getValue(Xp_prv_curr_clsf));
	}else{
		model.setValue(tempReq+"/prv_curr_clsf", "");
	}

	//�Ǽ� �ʱ�ȭ
	var rsltCnt = 0;

	//��ưüũ
	if(btnChk == "P"){
		//�Ǽ��˻� ��ȸ submit
		modelSendNoMake("pl_com_1420_s", "/pl/com/1420", tempReq, tempRes);
		rsltCnt = parseInt(model.getValue(tempRes+"/rsltcnt"));
	}

	//�Ǽ� �� ��ư�� ���� ó��
	if(rsltCnt == 0 && btnChk == "P"){
		if(dlco_cdReq.length > 0){
			model.setValue(Xp_dlco_cd, "");
		}
		if(dlco_seqReq.length > 0){
			model.setValue(Xp_dlco_seq, "");
		}
		if(dlco_nmReq.length > 0){
			model.setValue(Xp_dlco_nm, "");
		}
		if(send_plac_seqReq.length > 0){
			model.setValue(Xp_send_plac_seq, "");
		}
		if(send_plac_nmReq.length > 0){
			model.setValue(Xp_send_plac_nm, "");
		}
		if(dlco_clsfReq.length > 0){
			model.setValue(Xp_dlco_clsf, "");
		}
		if(areaReq.length > 0){
			model.setValue(Xp_area, "");
		}
		if(prv_curr_clsfReq.length > 0){
			model.setValue(Xp_prv_curr_clsf, "");
		}
	}else if(rsltCnt == 1 && btnChk == "P"){
		if(dlco_cdReq.length > 0){
			model.setValue(Xp_dlco_cd, model.getValue(tempRes+"/dlco_cd"));
		}
		if(dlco_seqReq.length > 0){
			model.setValue(Xp_dlco_seq, model.getValue(tempRes+"/dlco_seq"));
		}
		if(dlco_nmReq.length > 0){
			model.setValue(Xp_dlco_nm, model.getValue(tempRes+"/dlco_nm"));
		}
		if(send_plac_seqReq.length > 0){
			model.setValue(Xp_send_plac_seq, model.getValue(tempRes+"/send_plac_seq"));
		}
		if(send_plac_nmReq.length > 0){
			model.setValue(Xp_send_plac_nm, model.getValue(tempRes+"/send_plac_nm"));
		}
		if(dlco_clsfReq.length > 0){
			model.setValue(Xp_dlco_clsf, model.getValue(tempRes+"/dlco_clsf"));
		}
		if(areaReq.length > 0){
			model.setValue(Xp_area, model.getValue(tempRes+"/area"));
		}
		if(prv_curr_clsfReq.length > 0){
			model.setValue(Xp_prv_curr_clsf, model.getValue(tempRes+"/prv_curr_clsf"));
		}
	}else if(rsltCnt > 1 || btnChk == "B"){
		//property �ʱ�ȭ
		model.property("dlco_cd")				=	"";
		model.property("dlco_seq")				=	"";
		model.property("dlco_nm")				=	"";
		model.property("send_plac_seq")			=	"";
		model.property("send_plac_nm")			=	"";
		model.property("dlco_clsf")				=	"";
		model.property("area")					=	"";
		model.property("prv_curr_clsf")			=	"";

		model.property("dlco_cd_path")			=	"";
		model.property("dlco_seq_path")			=	"";
		model.property("dlco_nm_path")			=	"";
		model.property("send_plac_seq_path")	=	"";
		model.property("send_plac_nm_path")		=	"";
		model.property("dlco_clsf_path")		=	"";
		model.property("area_path")				=	"";
		model.property("prv_curr_clsf_path")	=	"";

		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		if(dlco_cdReq.length > 0){
			model.property("dlco_cd_path")			=	Xp_dlco_cd;
		}
		if(dlco_seqReq.length > 0){
			model.property("dlco_seq_path")			=	Xp_dlco_seq;
		}
		if(dlco_nmReq.length > 0){
			model.property("dlco_nm")				=	model.getValue(Xp_dlco_nm);
			model.property("dlco_nm_path")			=	Xp_dlco_nm;
		}
		if(send_plac_seqReq.length > 0){
			model.property("send_plac_seq_path")	=	Xp_send_plac_seq;
		}
		if(send_plac_nmReq.length > 0){
			model.property("send_plac_nm_path")		=	Xp_send_plac_nm;
		}
		if(dlco_clsfReq.length > 0){
			model.property("dlco_clsf")				=	model.getValue(Xp_dlco_clsf);
			model.property("dlco_clsf_path")		=	Xp_dlco_clsf;
		}
		if(areaReq.length > 0){
			model.property("area")					=	model.getValue(Xp_area);
			model.property("area_path")				=	Xp_area;
		}
		if(prv_curr_clsfReq.length > 0){
			model.property("prv_curr_clsf")			=	model.getValue(Xp_prv_curr_clsf);
			model.property("prv_curr_clsf_path")	=	Xp_prv_curr_clsf;
		}

		//�ŷ�ó �˻� �˾� ȣ��
		window.load(
				 "/xrw/pl/com/PL_COM_1400.xrw"
				,"modal"
				,""
				,"left:200px; top:200px; width:650px; height:490px; align:center; caption:hidden;"
				,""
				,""
			);
	}
}

/**
 * ��ü������ ������ 1�ǰ˻� �Ǵ� �˾� �ٿ�� 
 * parameter 
 * - btnChk(��ưüũ) : B-��ưŬ��, P-��ưŬ����(INPUT BOX OR ENTER)
 * - flag(���±���)   : N-�Ϲ� ������Ʈ, G-�׸��� ���۳�Ʈ
 * - rootPath         : ������� xpath  
 * - grid             : grid ȣ���ϰ�� grid id��(String)
 * - dynmstat         : ��ü���� ����,���� üũ(D:����   S:����)
 * - medi_cdReq     : ��ü���� Element��
 * - medi_ser_noReq       : ��ü�ڵ� Element��
 * - medi_nmReq       : ��ü�� Element��
 * - issu_cmpyReq     : ����� Element��
 * - medi_clsfReq     : ��ü���� Element��
 * - absence_clsfReq  : ���Ǳ��� Element��
 * - uprcReq 		  : �ܰ� Element��
 * - dcrateReq        : ���� Element��
 * - ser_no_basiReq   : ȣ������ Element��
 * - issu_clsfReq     : ���౸�� Element��
 * - end_ser_noReq    : ��������ȣ�� Element��
 */
function pl_getMediInfo_p(btnChk, flag, rootPath, grid, dynmstat, medi_cdReq, medi_ser_noReq, medi_nmReq, issu_cmpyReq, medi_clsfReq, absence_clsfReq, uprcReq, dcrateReq, ser_no_basiReq, issu_clsfReq, end_ser_noReq){
	//Data Set node
	var Xp_medi_cd		=	"";
	var Xp_medi_ser_no	=	"";
	var Xp_medi_nm		=	"";
	var Xp_issu_cmpy	=	"";
	var Xp_medi_clsf	=	"";
	var Xp_absence_clsf	=	"";
	var Xp_uprc			=	"";
	var Xp_dcrate		=	"";
	var Xp_ser_no_basi	=	"";
	var Xp_issu_clsf	=	"";
	var Xp_end_ser_no	=	"";

	//req�� ������
	var tempReq = "/root/tempData/keyData/tempReq";

	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	if(instance1.selectSingleNode(tempReq+"/medi_cd") == null){
		model.makeNode(tempReq+"/medi_cd");
	}
	if(instance1.selectSingleNode(tempReq+"/medi_nm") == null){
		model.makeNode(tempReq+"/medi_nm");
	}
	if(instance1.selectSingleNode(tempReq+"/medi_clsf") == null){
		model.makeNode(tempReq+"/medi_clsf");
	}
	if(instance1.selectSingleNode(tempReq+"/absence_clsf") == null){
		model.makeNode(tempReq+"/absence_clsf");
	}

	//res�� ������
	var tempRes = "/root/tempData/keyData/tempRes";

	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}

	//�׸����� ��� row �ʱ�ȭ
	var row		=	"";
	
	//�׸��忡���� ȣ���ϰ�� row ����
	if(flag == "G"){
		var rows		=	eval(grid + ".rows");
		var selectRow	=	eval(grid + ".row");

		if(rows == eval(grid + ".fixedRows") + 1){
			row			=	"";
		} else {
			row			=	"[" + selectRow + "]";
		}
	}

	//Data Set node ������ �� ��ȸ���� Set
	if(medi_ser_noReq.length > 0){
		Xp_medi_ser_no	=	rootPath + row + "/" + medi_ser_noReq;
	}
	if(issu_cmpyReq.length > 0){
		Xp_issu_cmpy	=	rootPath + row + "/" + issu_cmpyReq;
	}
	if(uprcReq.length > 0){
		Xp_uprc			=	rootPath + row + "/" + uprcReq;
	}
	if(dcrateReq.length > 0){
		Xp_dcrate		=	rootPath + row + "/" + dcrateReq;
	}
	if(ser_no_basiReq.length > 0){
		Xp_ser_no_basi	=	rootPath + row + "/" + ser_no_basiReq;
	}
	if(issu_clsfReq.length > 0){
		Xp_issu_clsf	=	rootPath + row + "/" + issu_clsfReq;
	}
	if(end_ser_noReq.length > 0){
		Xp_end_ser_no	=	rootPath + row + "/" + end_ser_noReq;
	}
	if(medi_cdReq.length > 0){
		Xp_medi_cd		=	rootPath + row + "/" + medi_cdReq;
		model.setValue(tempReq+"/medi_cd", model.getValue(Xp_medi_cd));
	}else{
		model.setValue(tempReq+"/medi_cd", "");
	}
	if(medi_nmReq.length > 0){
		Xp_medi_nm		=	rootPath + row + "/" + medi_nmReq;
		model.setValue(tempReq+"/medi_nm", model.getValue(Xp_medi_nm));
	}else{
		model.setValue(tempReq+"/medi_nm", "");
	}
	if(medi_clsfReq.length > 0){
		Xp_medi_clsf	=	rootPath + row + "/" + medi_clsfReq;
		model.setValue(tempReq+"/medi_clsf", model.getValue(Xp_medi_clsf));
	}else{
		model.setValue(tempReq+"/medi_clsf", "");
	}
	if(absence_clsfReq.length > 0){
		Xp_absence_clsf	=	rootPath + row + "/" + absence_clsfReq;
		model.setValue(tempReq+"/absence_clsf", model.getValue(Xp_absence_clsf));
	}else{
		model.setValue(tempReq+"/absence_clsf", "");
	}

	//�Ǽ� �ʱ�ȭ
	var rsltCnt = 0;

	//��ưüũ
	if(btnChk == "P"){
		//�Ǽ��˻� ��ȸ submit
		modelSendNoMake("pl_com_1120_s", "/pl/com/1120", tempReq, tempRes);
		rsltCnt = parseInt(model.getValue(tempRes+"/rsltcnt"));
	}

	//�Ǽ� �� ��ư�� ���� ó��
	if(rsltCnt == 0 && btnChk == "P"){
		if(medi_ser_noReq.length > 0){
			model.setValue(Xp_medi_ser_no, "");
		}
		if(issu_cmpyReq.length > 0){
			model.setValue(Xp_issu_cmpy, "");
		}
		if(uprcReq.length > 0){
			model.setValue(Xp_uprc, "");
		}
		if(dcrateReq.length > 0){
			model.setValue(Xp_dcrate, "");
		}
		if(ser_no_basiReq.length > 0){
			model.setValue(Xp_ser_no_basi, "");
		}
		if(issu_clsfReq.length > 0){
			model.setValue(Xp_issu_clsf, "");
		}
		if(end_ser_noReq.length > 0){
			model.setValue(Xp_end_ser_no, "");
		}
		if(medi_cdReq.length > 0){
			model.setValue(Xp_medi_cd, "");
		}
		if(medi_nmReq.length > 0){
			model.setValue(Xp_medi_nm, "");
		}
		if(medi_clsfReq.length > 0 && dynmstat == "D"){
			model.setValue(Xp_medi_clsf, "");
		}
		if(absence_clsfReq.length > 0){
			model.setValue(Xp_absence_clsf, "");
		}
	}else if(rsltCnt == 1 && btnChk == "P"){
		if(medi_ser_noReq.length > 0){
			model.setValue(Xp_medi_ser_no, model.getValue(tempRes+"/medi_ser_no"));
		}
		if(issu_cmpyReq.length > 0){
			model.setValue(Xp_issu_cmpy, model.getValue(tempRes+"/issu_cmpy"));
		}
		if(uprcReq.length > 0){
			model.setValue(Xp_uprc, model.getValue(tempRes+"/uprc"));
		}
		if(dcrateReq.length > 0){
			model.setValue(Xp_dcrate, model.getValue(tempRes+"/dcrate"));
		}
		if(ser_no_basiReq.length > 0){
			model.setValue(Xp_ser_no_basi, model.getValue(tempRes+"/ser_no_basi"));
		}
		if(issu_clsfReq.length > 0){
			model.setValue(Xp_issu_clsf, model.getValue(tempRes+"/issu_clsf"));
		}
		if(end_ser_noReq.length > 0){
			model.setValue(Xp_end_ser_no, model.getValue(tempRes+"/end_ser_no"));
		}
		if(medi_cdReq.length > 0){
			model.setValue(Xp_medi_cd, model.getValue(tempRes+"/medi_cd"));
		}
		if(medi_nmReq.length > 0){
			model.setValue(Xp_medi_nm, model.getValue(tempRes+"/medi_nm"));
		}
		if(medi_clsfReq.length > 0){
			model.setValue(Xp_medi_clsf, model.getValue(tempRes+"/medi_clsf"));
		}
		if(absence_clsfReq.length > 0){
			model.setValue(Xp_absence_clsf, model.getValue(tempRes+"/absence_clsf"));
		}
	}else if(rsltCnt > 1 || btnChk == "B"){
		//property �ʱ�ȭ
		model.property("dynmstat")			=	"";
		model.property("medi_ser_no")		=	"";
		model.property("issu_cmpy")			=	"";
		model.property("uprc")				=	"";
		model.property("dcrate")			=	"";
		model.property("ser_no_basi")		=	"";
		model.property("issu_clsf")			=	"";
		model.property("end_ser_no")		=	"";
		model.property("medi_cd")			=	"";
		model.property("medi_nm")			=	"";
		model.property("medi_clsf")			=	"";
		model.property("absence_clsf")		=	"";

		model.property("medi_ser_no_path")	=	"";
		model.property("issu_cmpy_path")	=	"";
		model.property("uprc_path")			=	"";
		model.property("dcrate_path")		=	"";
		model.property("ser_no_basi_path")	=	"";
		model.property("issu_clsf_path")	=	"";
		model.property("end_ser_no_path")	=	"";
		model.property("medi_cd_path")		=	"";
		model.property("medi_nm_path")		=	"";
		model.property("medi_clsf_path")	=	"";
		model.property("absence_clsf_path")	=	"";

		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		model.property("dynmstat")					=	dynmstat;
		if(medi_ser_noReq.length > 0){
			model.property("medi_ser_no_path")		=	Xp_medi_ser_no;
		}
		if(issu_cmpyReq.length > 0){
			model.property("issu_cmpy_path")		=	Xp_issu_cmpy;
		}
		if(uprcReq.length > 0){
			model.property("uprc_path")				=	Xp_uprc;
		}
		if(dcrateReq.length > 0){
			model.property("dcrate_path")			=	Xp_dcrate;
		}
		if(ser_no_basiReq.length > 0){
			model.property("ser_no_basi_path")		=	Xp_ser_no_basi;
		}
		if(issu_clsfReq.length > 0){
			model.property("issu_clsf_path")		=	Xp_issu_clsf;
		}
		if(end_ser_noReq.length > 0){
			model.property("end_ser_no_path")		=	Xp_end_ser_no;
		}
		if(medi_cdReq.length > 0){
			model.property("medi_cd")				=	model.getValue(Xp_medi_cd);
			model.property("medi_cd_path")			=	Xp_medi_cd;
		}
		if(medi_nmReq.length > 0){
			model.property("medi_nm")				=	model.getValue(Xp_medi_nm);
			model.property("medi_nm_path")			=	Xp_medi_nm;
		}
		if(medi_clsfReq.length > 0){
			model.property("medi_clsf")				=	model.getValue(Xp_medi_clsf);
			model.property("medi_clsf_path")		=	Xp_medi_clsf;
		}
		if(absence_clsfReq.length > 0){
			model.property("absence_clsf")			=	model.getValue(Xp_absence_clsf);
			model.property("absence_clsf_path")		=	Xp_absence_clsf;
		}

		//��ü �˻� �˾� ȣ��
		window.load(
				 "/xrw/pl/com/PL_COM_1100.xrw"
				,"modal"
				,""
				,"left:200px; top:200px; width:650px; height:490px; align:center; caption:hidden;"
				,""
				,""
			);
	}
}

/**
 * �����ڵ�� ������ 1�ǰ˻� �Ǵ� �˾� �ٿ�� 
 * parameter 
 * - btnChk(��ưüũ) : B-��ưŬ��, P-��ưŬ����(INPUT BOX OR ENTER)
 * - flag(���±���)   : N-�Ϲ� ������Ʈ, G-�׸��� ���۳�Ʈ
 * - rootPath         : ������� xpath  
 * - grid             : grid ȣ���ϰ�� grid id��(String)
 * - bank_cdReq       : �����ڵ� Element��
 * - bank_nmReq       : ���������� Element��
 */
function pl_getBankInfo_p(btnChk, flag, rootPath, grid, bank_cdReq, bank_nmReq){
	//Data Set node
	var Xp_bank_cd		=	"";
	var Xp_bank_nm		=	"";

	//req�� ������
	var tempReq = "/root/tempData/keyData/tempReq";

	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	if(instance1.selectSingleNode(tempReq+"/bank_cd") == null){
		model.makeNode(tempReq+"/bank_cd");
	}

	//res�� ������
	var tempRes = "/root/tempData/keyData/tempRes";

	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}

	//�׸����� ��� row �ʱ�ȭ
	var row		=	"";
	
	//�׸��忡���� ȣ���ϰ�� row ����
	if(flag == "G"){
		var rows		=	eval(grid + ".rows");
		var selectRow	=	eval(grid + ".row");

		if(rows == eval(grid + ".fixedRows") + 1){
			row			=	"";
		} else {
			row			=	"[" + selectRow + "]";
		}
	}

	//Data Set node ������ �� ��ȸ���� Set
	if(bank_cdReq.length > 0){
		Xp_bank_cd		=	rootPath + row + "/" + bank_cdReq;
		model.setValue(tempReq+"/bank_cd", model.getValue(Xp_bank_cd));
	}else{
		model.setValue(tempReq+"/bank_cd", "");
	}
	if(bank_nmReq.length > 0){
		Xp_bank_nm		=	rootPath + row + "/" + bank_nmReq;
	}

	//�Ǽ� �ʱ�ȭ
	var rsltCnt = 0;

	//��ưüũ
	if(btnChk == "P"){
		//�Ǽ��˻� ��ȸ submit
		modelSendNoMake("pl_com_1620_s", "/pl/com/1620", tempReq, tempRes);
		rsltCnt = parseInt(model.getValue(tempRes+"/rsltcnt"));
	}

	//�Ǽ� �� ��ư�� ���� ó��
	if(rsltCnt == 0 && btnChk == "P"){
		if(bank_cdReq.length > 0){
			model.setValue(Xp_bank_cd, "");
		}
		if(bank_nmReq.length > 0){
			model.setValue(Xp_bank_nm, "");
		}
	}else if(rsltCnt == 1 && btnChk == "P"){
		if(bank_cdReq.length > 0){
			model.setValue(Xp_bank_cd, model.getValue(tempRes+"/cd"));
		}
		if(bank_nmReq.length > 0){
			model.setValue(Xp_bank_nm, model.getValue(tempRes+"/cd_abrv_nm"));
		}
	}else if(rsltCnt > 1 || btnChk == "B"){
		//property �ʱ�ȭ
		model.property("bank_cd")				=	"";
		model.property("bank_nm")				=	"";

		model.property("bank_cd_path")			=	"";
		model.property("bank_nm_path")			=	"";

		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		if(bank_cdReq.length > 0){
			model.property("bank_cd")				=	model.getValue(Xp_bank_cd);
			model.property("bank_cd_path")			=	Xp_bank_cd;
		}
		if(bank_nmReq.length > 0){
			model.property("bank_nm_path")			=	Xp_bank_nm;
		}

		//�ŷ�ó �˻� �˾� ȣ��
		window.load(
				 "/xrw/pl/com/PL_COM_1600.xrw"
				,"modal"
				,""
				,"left:200px; top:200px; width:650px; height:490px; align:center; caption:hidden;"
				,""
				,""
			);
	}
}

/**
 * yyyymm ��Ʈ���� addmm ������ ���� ����� ����
 * parameter yyyymm: yyyymm ������ ��Ʈ�� ��¥
 * parameter addmm : ���� Type
 * return          : ���(yyyymm) ��Ʈ��
 */
function toAddMonth(yyyymm,addmm) {
    var year  = eval(yyyymm.substr(0,4));
    var month = eval(yyyymm.substr(4,2))+year*12;

    if (addmm==0) {
        return yyyymm;
    }

    if ((month + addmm)%12==0) {
        year  = Math.floor((month + addmm)/12) - 1;
        month = 12;
    }
    else {
        year  = Math.floor((month + addmm)/12);
        month = Math.abs((month + addmm)%12);
    }

    return lpad(new String(year),4,'0') + lpad(new String(month),2,'0');
}

/**
 * @desc   : grid ����ó��
 * @param  : grid - grid��   mgrStr - merge�÷� �ε��� String	flag - ������
 * @return : 
 * @---------------------------------------------------
 */
function grid_Merge_hight(grid, mgrStr, flag) {
	var colCnt = eval(grid+".cols");
	var TempArray = new Array();
	var bycol = "bycol";

	vTempArray = mgrStr.split(flag);

	eval(grid+".mergecells = "+bycol);

	//����׸� merge false default
	for(var i=0; i<colCnt; i++) {
		eval(grid+".mergeCol("+i+") = false");
	}

	//�����׸� ����ó��
	for(var i=0; i<vTempArray.length; i++) {
		eval(grid+".mergeCol("+vTempArray[i]+") = true");
	}
}
