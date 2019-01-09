/**
 * �ǸŽý��� �������� �κ�
 * :�׸����� selectionmode�� free�� ����Ʈ ����se_cleargrid
 */	
setGridFree();
  
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
	
  
//�׸��� ȭ��ǥ �̵��� ���� üũ ����
var grid_col_type = "";
			
/*************************************************************************************************/
/* 0. ���� Global Event ���� �Լ� (Event)
/* 1)  onkeydown   		: ȭ��ǥŰ üũ
/* 2)  onentercell 		: �÷��̵� �� �÷�Ÿ���� ����Ʈ���� ��� ������ ���� ����
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
		if(arrowkey != "N"){
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
 * DESC  : �÷��̵� �� �÷�Ÿ���� ����Ʈ���� ��� ������ ���� ����
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
		if(arrowkey != "N"){
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
		if(arrowkey != "N"){
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
		if(arrowkey != "N"){
			grid_col_type = grid.colType(grid.col);
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
 * �޺� �ڽ��� ��ü(A), ����(S), ""�� ���� �ִ´�.
 * parameter strPath : ����, �� �޺� ���, ����Ʈ ���ڵ��, �޺��󺧸�, �޺�����
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
	model.refresh();
}

/* ���� ���õǸ� ��Ʈ/������ ���� �����Ѵ�. */
function selectTeam(resultref, teamCombo, partCombo){
	var key        = eval(teamCombo + ".value");
	var arr        = instance1.selectSingleNode(resultref + "/partlist_temp/record"); 

	if(arr == null){
		var len		=	null;
	}else{
		var len        = arr.length;
	}

	var val, record, dept_cd, dept_nm, node2, node3;
	var node	   = resultref + "/partlist";
	var nodeTemp   = resultref + "/partlist_temp";
	var index	   = 1;
	model.removeNodeset(node);

//alert('part='+len);	
//alert('dept_cd='+model.getValue(nodeTemp + "/record/dept_cd"));
//alert('dept_nm='+model.getValue(nodeTemp + "/record/dept_nm"));

	if(len==0){
		val          = model.getValue(nodeTemp + "/record/supr_dept_cd");
		if ( key == val || key == "" ){
				model.makeNode(node + "/record[" + 1 + "]");
				model.makeNode(node + "/record[" + 1 + "]/dept_cd");
				model.makeNode(node + "/record[" + 1 + "]/dept_nm");
				
				model.setValue(node + "/record[" + 1 + "]/dept_cd", model.getValue(nodeTemp + "/record/dept_cd"));
				model.setValue(node + "/record[" + 1 + "]/dept_nm", model.getValue(nodeTemp + "/record/dept_nm"));
		}
	}else if(len > 1){
		for ( var i = 1 ; i <= len ; i++ ){
			val          = model.getValue(nodeTemp + "/record[" + i + "]/supr_dept_cd");
			if ( key == val || key == "" ){
					model.makeNode(node + "/record[" + index + "]");
					model.makeNode(node + "/record[" + index + "]/dept_cd");
					model.makeNode(node + "/record[" + index + "]/dept_nm");
					
					model.setValue(node + "/record[" + index + "]/dept_cd", model.getValue(nodeTemp + "/record[" + i + "]/dept_cd"));
					model.setValue(node + "/record[" + index + "]/dept_nm", model.getValue(nodeTemp + "/record[" + i + "]/dept_nm"));
					
					index++;
	
			}
		}
	}
	
	model.refresh();
	makeComboGubun("A", resultref + "/partlist", "record", "dept_nm", "dept_cd");
	
	eval(partCombo + ".select(0)");
}

/* ���̳� ��Ʈ/���翡 ���� ������ ���� �����Ѵ�. */
function selectPart(resultref, teamCombo, partCombo, areaCombo){
	var key         = eval(partCombo + ".value");
	var item_nm    	= "/dept_cd";
	var arr         = instance1.selectSingleNode(resultref + "/arealist_temp/record"); 

	if(arr == null){
		var len		=	null;
	}else{
		var len        = arr.length;
	}

	var node    	= resultref + "/arealist";
	var nodeTemp 	= resultref + "/arealist_temp";
	var index         	= 1;
	var val, record, dept_cd, dept_nm;
	model.removeNodeset(node);
	
	if ( key == "" ){
		key 			= eval(teamCombo + ".value");
		item_nm 	= "/supr_dept_cd";
	}

	if(len==0){
		val          = model.getValue(nodeTemp + "/record" + item_nm);
		if ( key == val || key == "" ){
				model.makeNode(node + "/record[" + 1 + "]");
				model.makeNode(node + "/record[" + 1 + "]/area_cd");
				model.makeNode(node + "/record[" + 1 + "]/area_nm");
				
				model.setValue(node + "/record[" + 1 + "]/area_cd", model.getValue(nodeTemp + "/record/area_cd"));
				model.setValue(node + "/record[" + 1 + "]/area_nm", model.getValue(nodeTemp + "/record/area_nm"));
		}
	}else if(len > 1){
		for ( var i = 1 ; i <= len ; i++ ){
			val          = model.getValue(nodeTemp + "/record[" + i + "]" + item_nm);
			
			if ( key == val || key == "" ){
					model.makeNode(node + "/record[" + index + "]");
					model.makeNode(node + "/record[" + index + "]/area_cd");
					model.makeNode(node + "/record[" + index + "]/area_nm");
					
					model.setValue(node + "/record[" + index + "]/area_cd", model.getValue(nodeTemp + "/record[" + i + "]/area_cd"));
					model.setValue(node + "/record[" + index + "]/area_nm", model.getValue(nodeTemp + "/record[" + i + "]/area_nm"));
					
					index++;
			}
		}
	}

	model.refresh();
	makeComboGubun("A", resultref + "/arealist", "record", "area_nm", "area_cd");
	eval(areaCombo + ".select(0)");
}

/**
 * ������� ��, ��Ʈ, ���� ���۳�Ʈ�� ��ȸ ����� �̺�Ʈ�� �ο��Ѵ�.
 * ������Ʈ�� resultref + "teamlist"�� ����
 * ��Ʈ ����Ʈ�� resultref + "partlist_temp"�� �����Ǿ����� �̺�Ʈ�� ���� resultref + "partlist"�� �Ű�����.
 * ���� ����Ʈ�� resultref + "arealist_temp"�� �����Ǿ����� �̺�Ʈ�� ���� resultref + "arealist"�� �Ű�����.
 * parameter strPath : 
*/
function makeTeamSearch(submitId, action, ref, resultref, teamCombo, partCombo, areaCombo){

	modelSendNoMake(submitId, action, ref, resultref);
	if(!submit_completed()) return;
	
	var teamEvent = 'selectTeam("' + resultref + '", "' + teamCombo + '", "' + partCombo + '");';
	var partEvent = 'selectPart("' + resultref + '", "' + teamCombo + '", "' + partCombo + '", "' + areaCombo + '");';
	teamEvent = teamEvent + partEvent;

	eval(teamCombo + ".attribute('xforms-select') = '" + teamEvent + "'");
	eval(partCombo + ".attribute('xforms-select') = '" + partEvent + "'");
	
	makeComboGubun("A", resultref + "/teamlist", "record", "dept_nm", "dept_cd");

	selectTeam(resultref, teamCombo, partCombo);
	selectPart(resultref, teamCombo, partCombo, areaCombo);
	model.refresh();
    //eval(teamCombo + ".select(0)");
}

//���޺����� ��ü�� �������� �����Լ�
function makeTeamSearch2(submitId, action, ref, resultref, teamCombo, partCombo, areaCombo){

	modelSendNoMake(submitId, action, ref, resultref);
	if(!submit_completed()) return;
	
	var teamEvent = 'selectTeam("' + resultref + '", "' + teamCombo + '", "' + partCombo + '");';
	var partEvent = 'selectPart("' + resultref + '", "' + teamCombo + '", "' + partCombo + '", "' + areaCombo + '");';
	teamEvent = teamEvent + partEvent;

	eval(teamCombo + ".attribute('xforms-select') = '" + teamEvent + "'");
	eval(partCombo + ".attribute('xforms-select') = '" + partEvent + "'");
	
	makeComboGubun("", resultref + "/teamlist", "record", "dept_nm", "dept_cd");

	selectTeam(resultref, teamCombo, partCombo);
	selectPart(resultref, teamCombo, partCombo, areaCombo);
	model.refresh();
    //eval(teamCombo + ".select(0)");
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
 * ���õ� �׸����� ������ ���°��� ���� ���·� �����Ѵ�.
 * 
 * parameter strPath : 
*/
function se_grid_delete(grid){
	var o_grid = document.all(grid);
	var gridattrb = o_grid.attribute("selectionmode");
	
	if(gridattrb == "free"){
		var index = eval(grid + ".row");
		eval(grid + ".rowStatus(" + index + ") = 4");
	}else{
		
		var len = eval(grid + ".selectedRows");
		
		var index;
		for ( var i = 0 ; i < len ; i++ )
		{
			index	= eval(grid + ".selectedRow(" + i + ")");
			eval(grid + ".rowStatus(" + index + ") = 4");
		}
	}
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
 * �ڵ�,�ڵ������ ������ 1�ǰ˻� 
 * parameter 
 * - cdgb(�ڵ屸��) 
 *		 : 1=������ڵ�, 2=������˻�
 * - rootRef : �ڵ�,���� ������� xpath  
 * - cdRef : �ڵ� Element��
 * - nmRef : �ڵ�� Element��
 * - gubun(ȣ�ⱸ��) = N : �Ϲ� ������Ʈ, G : �׸��� ���۳�Ʈ
 * - grid : grid ȣ���ϰ�� grid id��(String)
*/
function se_getCdCdnm(cdgb, rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	//req�� ������
	var tempReq = "/root/tempData/keyData/tempReq";
	var tempRes = "/root/tempData/keyData/tempRes";
	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	if(instance1.selectSingleNode(tempReq+"/cd") == null){
		model.makeNode(tempReq+"/cd");
	}
	if(instance1.selectSingleNode(tempReq+"/cdnm") == null){
		model.makeNode(tempReq+"/cdnm");
	}
	//res�� ������
	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}
	
	//�׸��忡���� ȣ���ϰ�� cdRef, nmRef ������
	if( gubun == "G" ){
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1){
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		cdXpath = rootRef+ row +"/"+cdRef;
		cdnmXpath = rootRef+ row +"/"+cdnmRef;
	}else{
		cdXpath = rootRef+"/"+cdRef;
		cdnmXpath = rootRef+"/"+cdnmRef;
	}

	//cd, nm���� ��ȸ�� ���� req�� ����
	model.setValue(tempReq+"/cd", model.getValue(cdXpath));
	model.setValue(tempReq+"/cdnm", model.getValue(cdnmXpath));
	
	//�Ǽ��˻� ��ȸ submit
	if(cdgb == "1"){
		//����� �ڵ�/�� �˻�
		modelSendNoMake("se_comm_1005_s", "/se/comm/1005", tempReq, tempRes);
	}else if(cdgb == "2"){
		//������ �ֹι�ȣ/���� �˻�
		modelSendNoMake("se_comm_1305_s", "/se/comm/1305", tempReq, tempRes);
	}
	
	var rsltCnt = parseInt(model.getValue(tempRes+"/rsltcnt"));

	if ( rsltCnt == 0 ){
		model.setValue(cdXpath, "");
		model.setValue(cdnmXpath, "");
	}else if ( rsltCnt == 1 ) {
		model.setValue(cdXpath, model.getValue(tempRes+"/cd"));
		model.setValue(cdnmXpath, model.getValue(tempRes+"/cdnm"));
	} else if ( rsltCnt > 1) {
		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		model.property("se_gb") 		= "2";		//ȣ�ⱸ��(1:��ưŬ��, 2:2���̻��ڵ����)
		model.property("se_cd") 		= model.getValue(cdXpath);
		model.property("se_cdnm") 		= model.getValue(cdnmXpath);
		model.property("se_cd_path") 	= cdXpath;
		model.property("se_cdnm_path")  = cdnmXpath;
			
		//�˾� ȣ��	
		if(cdgb == "1"){
			//����� �ڵ�/�� �˻�
			window.load(
					"/xrw/se/comm/SE_COMM_1000.xrw", 
					"modal", 
					"", 
					"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
					,""
					,""
				);
		}else if(cdgb == "2"){
			//������ �ֹι�ȣ/���� �˻�
			window.load(
					"/xrw/se/comm/SE_COMM_1300.xrw", 
					"modal", 
					"", 
					"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
					,""
					,""
				);
		}
	}
	
	//�׸��忡�� ȣ��� ���¸� �������� ����
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
}

/**
 * �ڵ�,�ڵ������ ������ �˾����� 
 * parameter 
 * - cdgb(�ڵ屸��) 
 *		 : 1=������ڵ�, 2=������˻�
 * - rootRef : �ڵ�,���� ������� xpath  
 * - cdRef : �ڵ� Element��
 * - nmRef : �ڵ�� Element��
 * - gubun(ȣ�ⱸ��) = N : �Ϲ� ������Ʈ, G : �׸��� ���۳�Ʈ
 * - grid : grid ȣ���ϰ�� grid id��(String)
*/
function se_getCdCdnm_p(cdgb, rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	
	//�׸��忡���� ȣ���ϰ�� cdRef, nmRef ������
	if( gubun == "G" ){
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1){
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		cdXpath = rootRef+ row +"/"+cdRef;
		cdnmXpath = rootRef+ row +"/"+cdnmRef;
	}else{
		cdXpath = rootRef+"/"+cdRef;
		cdnmXpath = rootRef+"/"+cdnmRef;
	}

    model.property("se_gb")     	= "1";		//ȣ�ⱸ��(1:��ưŬ��, 2:2���̻��ڵ����)
	model.property("se_cd") 		= model.getValue(cdXpath);
	model.property("se_cdnm") 		= model.getValue(cdnmXpath);
	model.property("se_cd_path") 	= cdXpath;
	model.property("se_cdnm_path")  = cdnmXpath;

	//�˾� ȣ��	
	if(cdgb == "1"){
		//����� �ڵ�/�� �˻�
		window.load(
				"/xrw/se/comm/SE_COMM_1000.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden"
				,""
				,""
			);
	}else if(cdgb == "2"){
		//������ �ֹι�ȣ/���� �˻�
		window.load(
				"/xrw/se/comm/SE_COMM_1300.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
				,""
				,""
			);
	}
	
	//�׸��忡�� ȣ��� ���¸� �������� ����
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
	
}


/**
 * �����ڵ� ���̺��� �ڵ�,�ڵ������ ������ 1�ǰ˻� 
 * parameter 
 * - cdgb(�˾�â����) : 1:�ñ������� 
 * - job_clsf : job_clsf
 * - cd_clsf : cd_clsf
 * - rootRef : �ڵ�,���� ������� xpath  
 * - cdRef : �ڵ� Element��
 * - nmRef : �ڵ�� Element��
 * - gubun(ȣ�ⱸ��) = N : �Ϲ� ������Ʈ, G : �׸��� ���۳�Ʈ
 * - grid : grid ȣ���ϰ�� grid id��(String)
*/
function se_getComncd(cdgb, job_clsf, cd_clsf, rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	//req�� ������
	var tempReq = "/root/tempData/keyData/tempReq";
	var tempRes = "/root/tempData/keyData/tempRes";
	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	if(instance1.selectSingleNode(tempReq+"/job_clsf") == null){
		model.makeNode(tempReq+"/job_clsf");
	}
	if(instance1.selectSingleNode(tempReq+"/cd_clsf") == null){
		model.makeNode(tempReq+"/cd_clsf");
	}
	if(instance1.selectSingleNode(tempReq+"/cd") == null){
		model.makeNode(tempReq+"/cd");
	}
	if(instance1.selectSingleNode(tempReq+"/cdnm") == null){
		model.makeNode(tempReq+"/cdnm");
	}
	//res�� ������
	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}
	
	//�׸��忡���� ȣ���ϰ�� cdRef, nmRef ������
	if( gubun == "G" ){
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1){
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		cdXpath = rootRef+ row +"/"+cdRef;
		cdnmXpath = rootRef+ row +"/"+cdnmRef;
	}else{
		cdXpath = rootRef+"/"+cdRef;
		cdnmXpath = rootRef+"/"+cdnmRef;
	}

	//cd, nm���� ��ȸ�� ���� req�� ����
	model.setValue(tempReq+"/job_clsf", job_clsf);
	model.setValue(tempReq+"/cd_clsf", cd_clsf);
	model.setValue(tempReq+"/cd", model.getValue(cdXpath));
	model.setValue(tempReq+"/cdnm", model.getValue(cdnmXpath));
	
	//�Ǽ��˻� ��ȸ submit
	modelSendNoMake("se_comm_1405_s", "/se/comm/1405", tempReq, tempRes);
	
	var rsltCnt = parseInt(model.getValue(tempRes+"/rsltcnt"));

	if ( rsltCnt == 0 ){
		model.setValue(cdXpath, "");
		model.setValue(cdnmXpath, "");
	}else if ( rsltCnt == 1 ) {
		model.setValue(cdXpath, model.getValue(tempRes+"/cd"));
		model.setValue(cdnmXpath, model.getValue(tempRes+"/cdnm"));
	} else if ( rsltCnt > 1) {
		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		model.property("se_gb") 		= "2";		//ȣ�ⱸ��(1:��ưŬ��, 2:2���̻��ڵ����)
		model.property("se_cd") 		= model.getValue(cdXpath);
		model.property("se_cdnm") 		= model.getValue(cdnmXpath);
		model.property("se_cd_path") 	= cdXpath;
		model.property("se_cdnm_path")  = cdnmXpath;
			
		//�˾� ȣ��	
		if(cdgb == "1"){
			//�ñ������� �˻�
			window.load(
					"/xrw/se/comm/SE_COMM_1400.xrw", 
					"modal", 
					"", 
					"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
					,""
					,""
				);
		}
	}
	
	//�׸��忡�� ȣ��� ���¸� �������� ����
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
}

/**
 * �ڵ�,�ڵ������ ������ �˾����� 
 * parameter 
 * - cdgb(�ڵ屸��) 
 *		 : 1=������ڵ�, 2=������˻�
 * - rootRef : �ڵ�,���� ������� xpath  
 * - cdRef : �ڵ� Element��
 * - nmRef : �ڵ�� Element��
 * - gubun(ȣ�ⱸ��) = N : �Ϲ� ������Ʈ, G : �׸��� ���۳�Ʈ
 * - grid : grid ȣ���ϰ�� grid id��(String)
*/
function se_getComncd_p(cdgb, rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	
	//�׸��忡���� ȣ���ϰ�� cdRef, nmRef ������
	if( gubun == "G" ){
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1){
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		cdXpath = rootRef+ row +"/"+cdRef;
		cdnmXpath = rootRef+ row +"/"+cdnmRef;
	}else{
		cdXpath = rootRef+"/"+cdRef;
		cdnmXpath = rootRef+"/"+cdnmRef;
	}

    model.property("se_gb")     	= "1";		//ȣ�ⱸ��(1:��ưŬ��, 2:2���̻��ڵ����)
	model.property("se_cd") 		= model.getValue(cdXpath);
	model.property("se_cdnm") 		= model.getValue(cdnmXpath);
	model.property("se_cd_path") 	= cdXpath;
	model.property("se_cdnm_path")  = cdnmXpath;
		
	//�˾� ȣ��	
	if(cdgb == "1"){
		//����� �ڵ�/�� �˻�
		window.load(
				"/xrw/se/comm/SE_COMM_1400.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
				,""
				,""
			);
	}
	
	//�׸��忡�� ȣ��� ���¸� �������� ����
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
	
}


/**
 * ����ã�� 1�ǰ˻� 
 * parameter 
 * - rootRef : �ڵ�,���� ������� xpath  
 * - cdRef : �ڵ� Element��
 * - nmRef : �ڵ�� Element��
 * - gubun(ȣ�ⱸ��) = N : �Ϲ� ������Ʈ, G : �׸��� ���۳�Ʈ
 * - grid : grid ȣ���ϰ�� grid id��(String)
*/
function se_getBocdnm(rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	//req�� ������
	var tempReq = "/root/tempData/keyData/tempReq";
	var tempRes = "/root/tempData/keyData/tempRes";
	if(instance1.selectSingleNode(tempReq) == null){
		model.makeNode(tempReq);
	}
	if(instance1.selectSingleNode(tempReq+"/bo_cd") == null){
		model.makeNode(tempReq+"/bo_cd");
	}
	if(instance1.selectSingleNode(tempReq+"/bo_nm") == null){
		model.makeNode(tempReq+"/bo_nm");
	}
	//res�� ������
	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}
	
	//�׸��忡���� ȣ���ϰ�� cdRef, nmRef ������
	if( gubun == "G" ){
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1){
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		cdXpath = rootRef+ row +"/"+cdRef;
		cdnmXpath = rootRef+ row +"/"+cdnmRef;
	}else{
		cdXpath = rootRef+"/"+cdRef;
		cdnmXpath = rootRef+"/"+cdnmRef;
	}
	
	//cd, nm���� ��ȸ�� ���� req�� ����
	model.setValue(tempReq+"/bo_cd", model.getValue(cdXpath));
	model.setValue(tempReq+"/bo_nm", model.getValue(cdnmXpath));
	
	
	//�Ǽ��˻� ��ȸ submit
	modelSendNoMake("se_comm_1105_s", "/se/comm/1105", tempReq, tempRes);
	
	var rsltCnt = parseInt(model.getValue(tempRes+"/rsltcnt"));

	if ( rsltCnt == 0 ){
		model.setValue(cdXpath, "");
		model.setValue(cdnmXpath, "");
	}else if ( rsltCnt == 1 ) {
		model.setValue(cdXpath, model.getValue(tempRes+"/bo_cd"));
		model.setValue(cdnmXpath, model.getValue(tempRes+"/bo_nm"));
	} else if ( rsltCnt > 1) {
		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		model.property("se_gb") 		= "2";		//ȣ�ⱸ��(1:��ưŬ��, 2:2���̻��ڵ����)
		model.property("se_cd") 		= model.getValue(cdXpath);
		model.property("se_cdnm") 		= model.getValue(cdnmXpath);
		model.property("se_cd_path") 	= cdXpath;
		model.property("se_cdnm_path")  = cdnmXpath;
			
		//�˾� ȣ��	
		window.load(
				"/xrw/se/comm/SE_COMM_1100.xrw", 
				"modal", 
				"", 
				"left:30px; top:100px; width:660px; height:500; align:center; caption:hidden;"
				,""
				,""
		);
	}

	//�׸��忡�� ȣ��� ���¸� �������� ����
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
}

/**
 * �ڵ�,�ڵ������ ������ �˾����� 
 * parameter 
 * - cdgb(�ڵ屸��) 
 *		 : 1=������ڵ�, 2=������˻�
 * - rootRef : �ڵ�,���� ������� xpath  
 * - cdRef : �ڵ� Element��
 * - nmRef : �ڵ�� Element��
 * - gubun(ȣ�ⱸ��) = N : �Ϲ� ������Ʈ, G : �׸��� ���۳�Ʈ
 * - grid : grid ȣ���ϰ�� grid id��(String)
*/
function se_getBocdnm_p(rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	
	//�׸��忡���� ȣ���ϰ�� cdRef, nmRef ������
	if( gubun == "G" ){
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1){
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		cdXpath = rootRef+ row +"/"+cdRef;
		cdnmXpath = rootRef+ row +"/"+cdnmRef;
	}else{
		cdXpath = rootRef+"/"+cdRef;
		cdnmXpath = rootRef+"/"+cdnmRef;
	}

    model.property("se_gb")     	= "1";		//ȣ�ⱸ��(1:��ưŬ��, 2:2���̻��ڵ����)
	model.property("se_cd") 		= model.getValue(cdXpath);
	model.property("se_cdnm") 		= model.getValue(cdnmXpath);
	model.property("se_cd_path") 	= cdXpath;
	model.property("se_cdnm_path")  = cdnmXpath;
		
	//�˾� ȣ��	
	window.load(
			"/xrw/se/comm/SE_COMM_1100.xrw", 
			"modal", 
			"", 
			"left:30px; top:100px; width:660px; height:500; align:center; caption:hidden;"
			,""
			,""
	);
	
	//�׸��忡�� ȣ��� ���¸� �������� ����
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
	
}



/**
 * ����  ��ȸ�Ѵ�.
 * gubun = P : �˾�, N : �˾����� �˻� 
 * parameter strPath : 
*/
function se_getBocdnm01(gubun, reqRef, rootRef, cdRef, nmRef, grid){
	var resNode = "/root/code/gridData"; 
	if ( gubun != "P" )
	{
		modelSendNoMake("se_comm_1110_l", "/se/comm/1110", reqRef, resNode);
	}
	
	var singleNode		= model.instances(0).selectSingleNode(resNode);
	var lengthNode		
	if ( gubun != "P" )	{
		lengthNode		= singleNode.getElementsByTagName("record");		
	} 
	
	if (   gubun == "P" ||  lengthNode.length > 1 ) {
		var cdVal, nmVal;
		if ( gubun == "P" )
		{
			cdVal	= "";
			nmVal	= "";
		} else {
			cdVal	= model.getValue(reqRef + "/" + cdRef);			
			nmVal	= model.getValue(reqRef + "/" + nmRef);
		}
		
		model.property("bo_cd"					)	= cdVal		; //�˾��˻���
		model.property("bo_nm"					)	= nmVal		; //�˾��˻���
	
		
		window.load(
			"/xrw/se/comm/SE_COMM_1100.xrw", 
			"modal", 
			"", 
			"left:30px; top:100px; width:660px; height:500; align:center; caption:hidden;"
			,""
			,""
	);
	} else if ( lengthNode.length == 0 ) {
		model.setValue(rootRef + "/" + cdRef	, "");
		model.setValue(rootRef + "/" + nmRef	, "");
	} else if ( lengthNode.length == 1 ) {
		var val =model.getValue(resNode+"/record/bo_cdseq");
		model.setValue(rootRef + "/" + cdRef	, val.substr(0, 5)+"-"+val.substr(5, 3) );
		model.setValue(rootRef + "/" + nmRef	, model.getValue(resNode+"/record/bo_nm"));
	} 
	model.refresh();
}



/* (�λ�)�μ��˻� �˾� */
function se_searchDept(fn_nm, dept_cd_ref, dept_nm_ref){
	this._dept_cd_ref = dept_cd_ref;
	this._dept_nm_ref = dept_nm_ref;

	if(instance1.selectSingleNode("/root/reqData/fwdData/func_nm") == null){
		model.makeNode("/root/reqData/fwdData/func_nm");
	}

	model.setValue("/root/reqData/fwdData/func_nm", fn_nm);
	window.load("/xrw/hd/com/HD_COM_1100.xrw"
	          ,"modal"
	          ,"hd_com_1000"
	          ,"align:center;"
	          ,"/root/reqData/fwdData"
	          ,"/root/reqData/fwdData");
	          	
}	

function se_setDept(dept_cd, dept_nm){
	model.setValue(_dept_cd_ref, dept_cd);
	model.setValue(_dept_nm_ref, dept_nm);				
	model.refresh();			
}
	
	
		
	
	
/**
 * �뼱�ڵ带 ��ȸ�Ѵ�.
 * gubun = N : �Ϲ� ������Ʈ, G : �׸��� ���۳�Ʈ
 * parameter strPath : 
*/
function se_getRouteCd(gubun, reqRef, rootRef, cdRef, nmRef, rankRef, grid){
	var resNode = "/root/resData/code";

	if ( gubun != "P" )
	{
		modelSendNoMake("se_comm_1220_l", "/se/comm/1220", reqRef, resNode);
	}
	
	var rootRefNode, cdRefNode, nmRefNode;
	var route_cd, route_nm, route_clsf;
	if ( gubun == "N" || gubun == "P" )
	{
		rootRefNode = rootRef;
	} else if ( gubun == "G" )
	{
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1)
		{
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		rootRefNode		= rootRef + row;
	}

	var singleNode		= model.instances(0).selectSingleNode(resNode);
	var lengthNode		
	if ( gubun != "P" )
	{
		lengthNode      = singleNode.getElementsByTagName("record");
	} 

	if ( gubun == "P" || lengthNode.length > 1 ) {
		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		var cdVal, nmVal;
		if ( gubun == "P" )
		{
			cdVal	= "";
			nmVal	= "";
		} else {
			cdVal	= model.getValue(reqRef + "/" + cdRef);
			nmVal	= model.getValue(reqRef + "/" + nmRef);
		}
		
		model.property("route_cd") 			= cdVal;
		model.property("route_nm") 			= nmVal;
		model.property("route_clsf") 		= model.getValue(reqRef + "/route_clsf");
		model.property("route_cd_path") 	= rootRefNode + "/" + cdRef;
		model.property("route_nm_path") 	= rootRefNode + "/" + nmRef;
		if ( rankRef != "" )
		{
			model.property("route_rank_path") 	= reqRef + "/" + rankRef;
		} else {
			model.property("route_rank_path") 	= "";
		}
		
		window.load(
				"/xrw/se/comm/SE_COMM_1200.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
				,""
				,""
			);
	} else if ( lengthNode.length == 0 ){
		model.setValue(rootRefNode + "/" + cdRef	, "");
		model.setValue(rootRefNode + "/" + nmRef	, "");
		if ( rankRef != "" )
		{
			model.setValue(rootRefNode + "/" + rankRef	, "");
		} 
	} else if ( lengthNode.length == 1 ) {
		model.setValue(rootRefNode + "/" + cdRef	, model.getValue("/root/resData/code/record/route_cd"));
		model.setValue(rootRefNode + "/" + nmRef	, model.getValue("/root/resData/code/record/route_nm"));
		if ( rankRef != "" )
		{
			model.setValue(rootRefNode + "/" + rankRef	, model.getValue("/root/resData/code/record/route_rank"));
		} 
	} 
	model.refresh();
}

/**
 * �߼�ó�� ��ȸ�Ѵ�.
 * gubun = N : �Ϲ� ������Ʈ, G : �׸��� ���۳�Ʈ
 * parameter strPath : 
*/
function se_getSendPlac(gubun, reqRef, rootRef, cdRef, nmRef, grid){
	var resNode = "/root/resData/code";
	if ( gubun != "P" )
	{
		modelSendNoMake("se_comm_2020_l", "/se/comm/2020", reqRef, resNode);
	}
	
	var rootRefNode, cdRefNode, nmRefNode;
	var route_cd, route_nm, route_clsf;
	if ( gubun == "N" || gubun == "P" )
	{
		rootRefNode = rootRef;
	} else if ( gubun == "G" )
	{
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1)
		{
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		rootRefNode		= rootRef + row;
	}

	var singleNode		= model.instances(0).selectSingleNode(resNode);
	var lengthNode		
	if ( gubun != "P" )	{
		lengthNode		= singleNode.getElementsByTagName("record");
	} 

	if (   gubun == "P" ||  lengthNode.length > 1 ) {
		var cdVal, nmVal;
		if ( gubun == "P" )
		{
			cdVal	= "";
			nmVal	= "";
		} else {
			cdVal	= model.getValue(reqRef + "/" + cdRef);
			cdVal	= cdVal.replace("-", "");
			nmVal	= model.getValue(reqRef + "/" + nmRef);
		}

		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		var bo_cd_path				= rootRefNode + "/" + cdRef;			//�����ڵ���
		var bo_seq_path				= rootRefNode + "/" + nmRef;			//�����������
		var send_plac_seq_path		= rootRefNode + "/send_plac_seq";	//�߼�ó�������
		var send_plac_nm_path		= rootRefNode + "/send_plac_nm";	//�߼�ó�����
		var area_cd_path			= rootRefNode + "/area_cd";			//�����ڵ���
		var area_nm_path			= rootRefNode + "/area_nm";			//���������
		
		model.property("bo_cd"				)	= cdVal.substr(0, 5)			;
		model.property("send_plac_seq"		)	= cdVal.substr(5, 3)			;
		model.property("send_plac_nm"		)	= nmVal							;
		model.property("bo_cd_path"			)	= bo_cd_path					;								
		model.property("bo_seq_path"		)	= bo_seq_path					;								
		model.property("send_plac_seq_path"	) 	= send_plac_seq_path			;
		model.property("send_plac_nm_path"	) 	= send_plac_nm_path				;
		model.property("area_cd_path"		)  	= area_cd_path					;
		model.property("area_nm_path"		)	= area_nm_path					;
		
		window.load(
				"/xrw/se/comm/SE_COMM_2000.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:655px; height:520; align:center; caption:hidden;"
				,""
				,""
			);
	} else if ( lengthNode.length == 0 ) {
		model.setValue(rootRefNode + "/" + cdRef	, "");
		model.setValue(rootRefNode + "/" + nmRef	, "");
	} else if ( lengthNode.length == 1 ) {
		model.setValue(rootRefNode + "/" + cdRef	, model.getValue("/root/resData/code/record/bo_cd_send_plac_seq"));
		model.setValue(rootRefNode + "/" + nmRef	, model.getValue("/root/resData/code/record/send_plac_nm"));
	} 
	model.refresh();
}

/**
 * �߼�ó�� ��ȸ�Ѵ�.
 * gubun = P : �˾�, N : �˾����� �˻� 
 * parameter strPath : 
*/
function se_getSendPlac01(gubun, reqRef, rootRef, cdRef, nmRef, grid){
	var resNode = "/root/resData/code";
	if ( gubun != "P" )
	{
		modelSendNoMake("se_comm_2020_l", "/se/comm/2020", reqRef, resNode);
	}
	
	var rootRefNode, cdRefNode, nmRefNode;
	var route_cd, route_nm, route_clsf;
	if ( gubun == "N" || gubun == "P" )
	{
		rootRefNode = rootRef;
	} else if ( gubun == "G" )
	{
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1)
		{
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		rootRefNode		= rootRef + row;
	}

	var singleNode		= model.instances(0).selectSingleNode(resNode);
	var lengthNode		
	if ( gubun != "P" )	{
		lengthNode		= singleNode.getElementsByTagName("record");
	} 

	if (   gubun == "P" ||  lengthNode.length > 1 ) {
		var cdVal, nmVal;
		if ( gubun == "P" )
		{
			cdVal	= "";
			nmVal	= "";
		} else {
			cdVal	= model.getValue(reqRef + "/" + cdRef);
			cdVal	= cdVal.replace("-", "");
			nmVal	= model.getValue(reqRef + "/" + nmRef);
		}

		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		var send_plac_cd_seq_path				= rootRefNode + "/" + cdRef;			//�����ڵ�+�߼�ó���� 

		
		var bo_cd_path				= rootRefNode + "/bo_cd";			//�����ڵ� 
		var bo_seq_path				= rootRefNode + "/bo_seq";		//�������� 
		var send_plac_seq_path		= rootRefNode + "/send_plac_seq";	//�߼�ó�������
		var send_plac_nm_path		= rootRefNode + "/send_plac_nm";	//�߼�ó�����
		var area_cd_path			= rootRefNode + "/area_cd";			//�����ڵ���
		var area_nm_path			= rootRefNode + "/area_nm";			//���������

		
		model.property("bo_cd"					)	= cdVal.substr(0, 5)			; //�˾��˻���
		model.property("send_plac_seq"			)	= cdVal.substr(5, 3)			; //�˾��˻���
		model.property("send_plac_nm"			)	= nmVal							; //�˾��˻���
		
		model.property("bo_cd_path"				)	= bo_cd_path					;								
		model.property("bo_seq_path"			)	= bo_seq_path					;									
		model.property("send_plac_seq_path"		) 	= send_plac_seq_path			;
		model.property("send_plac_cd_seq_path"	) 	= send_plac_cd_seq_path			;
		
		model.property("send_plac_nm_path"		) 	= send_plac_nm_path				;
		model.property("area_cd_path"			)  	= area_cd_path					;
		model.property("area_nm_path"			)	= area_nm_path					;
		
		window.load(
				"/xrw/se/comm/SE_COMM_2000.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:655px; height:520; align:center; caption:hidden;"
				,""
				,""
			);
	} else if ( lengthNode.length == 0 ) {
		model.setValue(rootRefNode + "/" + cdRef	, "");
		model.setValue(rootRefNode + "/" + nmRef	, "");
	} else if ( lengthNode.length == 1 ) {
		model.setValue(rootRefNode + "/" + cdRef	, model.getValue("/root/resData/code/record/bo_cd_send_plac_seq"));
		model.setValue(rootRefNode + "/" + nmRef	, model.getValue("/root/resData/code/record/send_plac_nm"));
	} 
	model.refresh();
}



/**
 * ������ȣ ȣ��(�Ϲݿ�, ������ȣ �׸��� �ΰ�¥��)
 * parameter
 *  - bogb : ������ ����������(L�̸� �Ⱥ���)
 *  - zip1Ref : ������ȣ1 xPath
 *  - zip2Ref : ������ȣ2 xPath
 *  - addrRef : �ּ� xPath
*/
function se_openZip(bogb, zip1Ref, zip2Ref, addrRef){

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
	model.setValue("/root/tempData/posttemp/send/zip", model.getValue(zip1Ref)+model.getValue(zip2Ref));
	
	openZip("/root/tempData/posttemp/send", "/root/tempData/posttemp/recv");
	
	model.setValue(zip1Ref, model.getValue("/root/tempData/posttemp/recv/zip1"));
	model.setValue(zip2Ref, model.getValue("/root/tempData/posttemp/recv/zip2"));
	model.setValue(addrRef, model.getValue("/root/tempData/posttemp/recv/addr"));
	
	model.refresh();

}

/**
 * ������ȣ ȣ�� (�׸����, ������ȣ �׸��� �ϳ�¥��)
 * parameter
 *  - bogb : ������ ����������(L�̸� �Ⱥ���)
 *  - zip1Ref : ������ȣ1 xPath
 *  - zip2Ref : ������ȣ2 xPath
 *  - addrRef : �ּ� xPath
*/
function se_openZip2(bogb, zipRef, addrRef){

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
	
	model.setValue("/root/tempData/posttemp/send/disp_flag", bogb);
	model.setValue("/root/tempData/posttemp/send/zip", model.getValue(zipRef));
	
	openZip("/root/tempData/posttemp/send", "/root/tempData/posttemp/recv");
	
	if(model.getValue("/root/tempData/posttemp/recv/zip") != ""){
		model.setValue(zipRef, model.getValue("/root/tempData/posttemp/recv/zip"));
		model.setValue(addrRef, model.getValue("/root/tempData/posttemp/recv/addr"));
	
		model.refresh();
	}
}

/**
 * ����ŷ�ó ����˾�
 * parameter
*/
function se_regDlcoInfo(){

    viewer("mainFrame").window.javaScript.onLoadPopupPage("CO_DLCO_1000");
    
    /* ����ŷ�ó ����� �������� 
	model.property("IF_DLCO_NO") = model1.getValue("/root/tempData/dlco_no");
	model.property("IF_ERN") = model1.getValue("/root/tempData/ern");
	model.property("IF_DLCO_NM") = model1.getValue("/root/tempData/dlco_nm");
	model.property("IF_DLCO_ABRV_NM") = model1.getValue("/root/tempData/dlco_abrv_nm");
	model.property("IF_ACCT_NO") = model1.getValue("/root/tempData/acct_no");
	model.property("IF_CORP_CLSF") = model1.getValue("/root/tempData/corp_clsf");
	model.property("IF_RCPM_MAIN_NM") = model1.getValue("/root/tempData/rcpm_main_nm");
	*/
						
    /*
	if(instance1.selectSingleNode("/root/reqData/fwdData/func_nm") == null){
		model.makeNode("/root/reqData/fwdData/func_nm");
	}

	model.setValue("/root/reqData/fwdData/func_nm", "setDlcoNo");
	
	window.load("/xrw/co/dlco/CO_DLCO_1000.xrw"
	            ,"modal"
	            ,""
	            ,"align:center; caption:hidden;"
	            ,"/root/reqData/fwdData"
   	            ,"/root/reqData/fwdData"
	);
	*/
}

/**
 * ����ŷ�ó �����˾�
 * parameter
*/
function se_schDlcoInfo(gubun){

	if(instance1.selectSingleNode("/root/reqData/fwdData/func_nm") == null){
		model.makeNode("/root/reqData/fwdData/func_nm");
	}
	
	if(gubun == "2"){
		model.setValue("/root/reqData/fwdData/func_nm", "setDlcoNo2");
	} else {
		model.setValue("/root/reqData/fwdData/func_nm", "setDlcoNo");
	}
	
	window.load("/xrw/co/dlco/CO_DLCO_1100.xrw"
	            ,"modal"
	            ,""
	            ,"align:center; width:650; height:520; caption:hidden;"
	            ,"/root/reqData/fwdData"
   	            ,"/root/reqData/fwdData"
	);
}

/**
 * �׸��� ��ȸ�� �Ǽ� üũ
 * parameter
 *  - sGrid : �׸����
*/
function se_chkGridCnt(sGrid){

	var rows = eval(sGrid + ".rows");
	var f_row = eval(sGrid + ".fixedRows");
	if(submit_completed()){
		if(rows == f_row) commAlert("�˻������ �����ϴ�.");
	}

}


/**
 * ���˹��� ��ȸ�Ѵ�.
 * gubun = N : �Ϲ� ������Ʈ, G : �׸��� ���۳�Ʈ
 * parameter strPath : 
*/
function se_getBnsItem(gubun, reqRef, rootRef, cdRef, nmRef, mediCdRef, grid){
	var resNode = "/root/resData/code";
	if ( gubun != "P" )
	{
		modelSendNoMake("se_comm_2320_s", "/se/comm/2320", reqRef, resNode);
	}
	
	var rootRefNode, cdRefNode, nmRefNode;
	var route_cd, route_nm, route_clsf;
	if ( gubun == "N" || gubun == "P" )
	{
		rootRefNode = rootRef;
	} else if ( gubun == "G" )
	{
		var rows		= eval(grid + ".rows");
		var selectRow	= eval(grid + ".row");
		var row;
		if ( rows == eval(grid + ".fixedRows") + 1)
		{
			row			= "";
		} else {
			row			= "[" + selectRow + "]";
		}
		rootRefNode		= rootRef + row;
	}

	var singleNode		= model.instances(0).selectSingleNode(resNode);
	var lengthNode;
	if ( gubun != "P" ){
		lengthNode		= singleNode.getElementsByTagName("record");
	} 

	if ( gubun == "P" || lengthNode.length > 1) {
		/* �˾��� ���� ���� ������ ����Ͽ� ������ �ڵ尪�� ��� ���� ���� ��θ� �����Ѵ�. */
		var bns_item_cd_path		= rootRefNode + "/" + cdRef;		//���˹� �ڵ�
		var bns_item_nm_path		= rootRefNode + "/" + nmRef;		//���˹� ��
		
		var cdVal, nmVal;
		if ( gubun == "P" )
		{
			cdVal	= "";
			nmVal	= "";
		} else {
			cdVal	= model.getValue(reqRef + "/" + cdRef)	;
			nmVal	= model.getValue(reqRef + "/" + nmRef)	;
		}

		var bns_item_cd				= cdVal;
		bns_item_cd					= bns_item_cd.replace("-", "");
		var bns_item_nm				= nmVal;
		var medi_cd                 = model.getValue(reqRef + "/" + mediCdRef);

		model.property("bns_item_cd"		)	= bns_item_cd					;
		model.property("bns_item_nm"		)	= bns_item_nm					;
		model.property("medi_cd"			)	= medi_cd						;
		model.property("bns_item_cd_path"	)	= bns_item_cd_path				;								
		model.property("bns_item_nm_path"	)	= bns_item_nm_path				;								
		
		window.load(
				"/xrw/se/comm/SE_COMM_2300.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
				,""
				,""
			);
	} else if ( lengthNode.length == 0 ) {
		model.setValue(rootRefNode + "/" + cdRef	, "");
		model.setValue(rootRefNode + "/" + nmRef	, "");
	} else if ( lengthNode.length == 1 ) {
		model.setValue(rootRefNode + "/" + cdRef	, model.getValue("/root/resData/code/record/bns_item_cd"));
		model.setValue(rootRefNode + "/" + nmRef	, model.getValue("/root/resData/code/record/bns_item_nm"));
	} 
	model.refresh();
}

/**
 * ���ڰ���� ���� ���ں�ȯ�Լ�
 * parameter
 *  - strNum : ����������
*/
function se_eval(strNum){

	var rtnNum = 0;
	if(strNum != "") rtnNum = eval(strNum);
	return rtnNum; 

}

/**
 * subtotal �հ��� style���� 
*/
function se_subtotstyle(){
	var gse_subtotstyle = "background-color:#e3e3e3;font-weight:bold;";
	return gse_subtotstyle;
}

/**
 * �׸��� delete
*/
function se_cleargrid(grid){
	var o_grid = document.all(grid);
		
	for(var i=o_grid.rows; i>1; i--) { 
		o_grid.removeRow(false);
	}
	model.refresh();
}

/**
 * �׸����� ���°��� �ʱ�(��ȸ)���·� ����.
 * 
 * parameter strPath : 
*/
function se_setGridStatReset(grid){
	var o_grid = document.all(grid);

	var len = eval(grid + ".rows");
	
	var s_inx = eval(grid + ".fixedRows");
	for ( var i = s_inx ; i < len ; i++ ){
		eval(grid + ".rowStatus(" + i + ") = 0");
	}
	model.refresh();
}

/**
 * �� ��¥�� �Ⱓ�� 1���̻����� �˻�
 * 
 * parameter 
 *		- strdt1,strdt2 : �˻��Ⱓ ��¥1,2(���ڿ� )
*/
function se_chkOverDate(strdt1,strdt2){

	if(strdt1.length!="8" || strdt2.length!="8"){
		commAlert("��¥ Ÿ���� �ƴմϴ�.");
		return false;
	}
	
	var vYear = se_eval(strdt1.substr(0,4));
	var vMonth = se_eval(strdt1.substr(4,2));
	var vDay = se_eval(strdt1.substr(6,2));
	var date_dt1 = new Date(vYear,vMonth - 1,vDay);
	vYear = se_eval(strdt2.substr(0,4));
	vMonth = se_eval(strdt2.substr(4,2));
	vDay = se_eval(strdt2.substr(6,2));
	var date_dt2 = new Date(vYear,vMonth - 1,vDay);
	
	var intvdt = 0;
	if(date_dt2 > date_dt1) intvdt = (date_dt2.getTime() - date_dt1.getTime()) / (1000*60*60*24);
	else intvdt = (date_dt1.getTime() - date_dt2.getTime()) / (1000*60*60*24);
	if(intvdt > 365){
		commAlert("�˻��Ⱓ�� 1���� �ʰ��� �� �����ϴ�.");
		return false;
	}else{
		return true;
	}
	
}