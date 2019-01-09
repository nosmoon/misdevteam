/**
 * @type : intro
 * @desc : trustform.js�� Trustform�� ����� ������Ʈ ���ݿ� ���� �� �ý��ۿ��� �������� ����ϴ� �ڹ� ��ũ��Ʈ��
 * ����� �ڹٽ�ũ��Ʈ �����̴�.
 *
 * �Լ� Naming Rule�� ������ ����.(���ܵ� ����.)
 * <pre>
 *     - cf  : common function
 *     - cov : common object for validation
 * </pre>
 * @version : 1.0
 */


/* ********************************************************************************
 * Common Function
 * *******************************************************************************/


var btnList = new Array();	// btnNew, btnUpdate, btnSave, btnDelete
var crudFlag = "I";			// I :Init, R : Retrieve, U : Update, D : Delete
var updateFlag = false;			// I :Init, R : Retrieve, U : Update, D : Delete


function enableBtn(aryButton)
{
	for (var i = 0; i < btnList.length; i++) {
		eval(btnList[i]).disabled = true;
	}
	
	if (aryButton != null) {
		for (var i = 0; i < aryButton.length; i++) {
			eval(aryButton[i]).disabled = false;
		}
	}
}


function resetInstanceNode(xPath)
{
	model.resetInstanceNode(xPath);
}

/**
 * @type   : method
 * @access : public
 * @desc   : submit ������ ��û�ϴ� �Լ�
 *           �����κ��� XML�� �ޱ� ���� �����.
 * <pre>
 *     onSubmit("RetrieveDepartmentCmd" , "", "/root/initData/itemset/departmentCode");
 * </pre>
 * @param  : action		erequest URL
 * @param  : req		������ ��û�� ������ ������ XML�� �θ� ���
 * @param  : res		�������� ���� XML�� ��ġ�� ���
 */
function onSubmit(action, req, res)
{
	model.instances(1).load("xmlData/" + action);
	model.copyNode(res, model.instances(1).root.res);
}

function onSubmit1(action, req, res)
{
	TRAN.attribute("action") = "http://10.62.210.114:7001/" + action;
	TRAN.attribute("ref") = req;
	if (res == "")
	{
		TRAN.attribute("resultref") = "/root/resData";
	}
	else {
		TRAN.attribute("resultref") = res;
	}

	if (req != "") {
		model.makeNode(req + "/actType");
		model.setValue(req + "/actType", crudFlag);
	}
	
	model.send("TRAN", "false");
	
	if (crudFlag == "R")
	{
		if (model.getValue("/root/body/ERROR/CODE") != "") {
			showMsgBox(model.getValue("/root/body/ERROR/MESSAGE"));
			return false;
		}
	}
	else {
		if (model.getValue("/root/INFO/CODE") != "") {
			showMsgBox(model.getValue("/root/INFO/MESSAGE"));
			return false;
		}
	}
	

	

	return true;
}

/**
 * @type   : function
 * @access : public
 * @desc   : �ʼ� �Է� �׸��� �Է� ���θ� Ȯ���Ͽ�,
 * 			 �ʼ� �Է��׸��� ������ ��� �� ������Ʈ�� focus�� ����,
 * 		     ���� �޽����� alert�� ��Ÿ�� �Ŀ� ������ �۾�(��:����)�� �������� �ʰ� �����Ѵ�.
 *
 * <pre>
 *     if ( !cfCheckRequired(['ed_userid','co_skill_code'],['�����ȣ','������']) ) return;
 * </pre>
 *
 * @param  : ctrArr		��Ʈ�� id.
 * @param  : msgArr		��Ʈ�� �̸�.
 * @return : boolean	�ʼ��Է��׸��� �Է� ����
 */
function cfCheckRequired(ctrArr, msgArr)
{
	for( var inx = 0; inx < ctrArr.length; inx++ ) {
	    if( !covNullValidator(ctrArr[inx]) ) {
			if (msgArr != null && msgArr[inx] != "") {
				showMsgBox("[" + msgArr[inx] + "]�� �ʼ� �Է��Դϴ�.");
			}
			else {
				showMsgBox("�ʼ� �Է��Դϴ�.");
			}
	        
			model.setFocus(ctrArr[inx]);
			return false;
	    }
	}

	return true;
}


/**
 * @type   : function
 * @access : public
 * @desc   : �ʼ� �Է� �׸��� �Է� ���θ� Ȯ���Ͽ�,
 * 			 �ʼ� �Է��׸��� ������ ��� �� ������Ʈ�� focus�� ����,
 * 		     ���� �޽����� alert�� ��Ÿ�� �Ŀ� ������ �۾�(��:����)�� �������� �ʰ� �����Ѵ�.
 *
 * <pre>
 *     if( !cfCheckRequiredGrid("ds_center", ['code','name'], ['* �����ڵ�','* ����']) ) return;
 * </pre>
 *
 * @param  : gridID      �׸��� ��Ʈ�� id.
 * @param  : colArr      �ʼ� �Է��� üũ�� �÷� �̸�.
 * @return : boolean     �ʼ��Է��׸��� �Է� ����
 */
function cfCheckRequiredGrid(gridID, colArr) {
    var grid = document.all(gridID);
    for ( var inx = grid.fixedRows; inx <= grid.rows; inx++ ) {
        var rowStat = grid.rowstatus(inx);

        if ( rowStat == IDINSERT || rowStat == IDUPDATE || rowStat == IDNEWINSERT ) {   // ���� ������ ���� ����,.
            for ( var jnx = 0; jnx < colArr.length; jnx++ ) {
                // üũ ��� �÷��� ������ �ԷµǾ����� Ȯ�� colref ����.
           	    if ( grid.valueMatrix(inx, grid.ColRef(colArr[jnx])) == "" ) {
                    showMsgBox("�ʼ� �Է��Դϴ�.");
					grid.row = inx;
					grid.col = jnx+1;
					model.setfocus(gridID);
					grid.editCell();
                    return false;
                }
            }
        }
    }
    return true;
}


function addComboCode(xPath, label, value)
{
	var ins = model.instances(0);
	var par = ins.selectSingleNode(xPath);
	var ref = ins.selectSingleNode(xPath + "/item");

	var newitem = ins.createnode( "element", "item", "" );
	par.insertBefore(newitem, ref);	// item ��� �����
	
	var firstItem = par.firstChild;	// �׻� ������ item ���
	
	var newlabel = ins.createnode( "element", "label", "" );
	newlabel.value = label;
	firstItem.appendchild(newlabel);
	
	var newvalue = ins.createnode( "element", "value", "" );
	newvalue.value = value;
	firstItem.appendchild(newvalue);
}

/* ********************************************************************************
 * �̺�Ʈ �ڵ鸵
 * *******************************************************************************/


/**
 * @type   : function
 * @access : public
 * @desc   : ������ ������ �ڵ����� ȣ��Ǵ� �Լ�.
 *			 �ش� �̺�Ʈ���� ������ 404, 500 ������ ó���� �� �ִ�.(��������� �����ϴ� ���� ������)
 * @return : void
 */
function xforms_submit_error()
{
	if (event.target == event.currentTarget) {
		showMsgBox(error.errorcode + ":" + error.description);
		event.preventDefault();
	}
}
 /**
 * @type   : event
 * @access : private
 * @desc   : xrw�� �ε��� �� �߻��ϴ� xforms_model_construct() �̺�Ʈ�̴�.
 			 global�� ������ ���ұ� ������ ������ ���ο��� �����ϴ� construct �̺�Ʈ�� �����ϸ�,
 			 �̺�Ʈ�� �ߺ��ǰ� �ȴ�.
 			 �̸� �����ϱ� ���� 'form_xforms_model_construct()' ��� �̸�����
 			 form�� �̺�Ʈ�� ������ �� �ְ� �� �ξ���.
 * @return : void
 */
function xforms_model_construct() {

    // �̺�Ʈ�� �ߺ� �߻� �����Ѵ�. �̴� �̺�Ʈ ������ �����ϱ� �����̴�.
	//event.stopPropagation();
}

function onaftersort() {

    document.all(event.target).gridToInstance();
	//event.stopPropagation();
}


//----------------------------- 2. control ó�� ���� -----------------------------//

// combo
/**
 * @type   : method
 * @access : public
 * @desc   : �޺� ��Ʈ���� ù��° �������� �߰��� �� �ִ� �Լ�.
 * <pre>
 *     cfAddComboItem( "/root/combo/item", "����" )
 * </pre>
 * @param  : nodeSet    combo ��Ʈ���� nodeSet.
 * @param  : label  	�߰��� ����� label ��.
 * @param  : [value]  	�߰��� ����� value ��.
 * @return : void
 */
function cfAddComboItem( nodeSet, label, value ) {
	if ( value == null ) {
		value = ""; // default value.
	}

    if( instance1.selectNodes("/"+nodeSet).length <= 0 ) {
        model.makeNode( nodeSet );
    }

    var nodeSetRef = nodeSet.substring( 0, nodeSet.lastIndexOf("/") );
    var tempRef = "/root/temp/item";	// '/root/temp/item' ��带 ���� ���� -> �װ��� �� ��� �߰�
    									// -> ������ ī�� ���̴�.
	model.makeNode(tempRef +"/label");
	model.makeNode(tempRef +"/value");
    model.setValue(tempRef +"/label", label );
	model.setValue(tempRef +"/value", value );

	model.duplicate( nodeSetRef, tempRef, "*[1]");  // ����� ���� �ʿ�.
	model.removenode(tempRef);
}


//----------------------------- 3. ���� ��� ���� --------------------------------//
/**
 * @type   : method
 * @access : public
 * @desc   : ��Ʈ���� enable/disable ó���� ���� ���� �Լ�.
 * <pre>
 *     cfCtrEnable([ 'detailGroup', 'bSave' ], false)
 * </pre>
 * @param  : ctrArr      enable ���¸� ������ ctrID �迭.
 * @param  : [status]    enable ���� (true = enable, false disable(readOnly))
 * @return : [boolean]   true / false
 */
function cfCtrEnable(ctrArr, status) {
	var ctrObj, jnx = 0, eleName = '';

	if( ctrArr == null ) return false;

	if( status == null ) status = true;    // enable = false, default.

	for( var inx = 0; inx < ctrArr.length; inx++ ) {
	    // group�� enable ���� ����� ���� ��Ʈ���� enable ���µ� �����.
		if( eval(ctrArr[inx]).elementName == 'xforms:group' ) {
			while( jnx < eval(ctrArr[inx]).children.length ) {
				ctrObj = eval(ctrArr[inx]).children(jnx);
				eleName = eval(ctrArr[inx]).children(jnx).elementName;

				if( eleName == 'xforms:select1' || eleName == 'xforms:select'
				    || eleName == 'xforms:input' || eleName == 'xforms:button') {
					ctrObj.disabled = !status;
				}
				jnx++;
			}
		} else {
			eval( ctrArr[inx] ).disabled = !status;
		}
		jnx = 0;
	}

	event.stopPropagation();
    return true;
}


//----------------------------- 6. validation ����  ------------------------------//
/**
 * @type   : function
 * @access : public
 * @desc   : ��Ʈ���� NULL ���θ� üũ��.
 * @param  : ctrID	  ��Ʈ�� ID
 * @param  : gridIdx  �׸��� ��Ʈ�� row, col
 * @return : boolean ( true : �� ��, false : �� ���� )
 */
function covNullValidator(ctrID,gridIdx) {
    if( document.all(ctrID).parent.elementName == "xforms:datagrid") {
        if( eval(ctrID).valueMatrix(gridIdx[0], gridIdx[1]) == '' ) return false;
    } else {
        if( eval(ctrID).value == '' ) return false;
    }

    return true;
}



/**
 * @type : intro
 * @desc : pattern.js�� Trustform�� ����� UI Pattern���� �������� ����ϴ� �ڹ� ��ũ��Ʈ��
 * ����� �ڹٽ�ũ��Ʈ �����̴�.
 *
 * �Լ� Naming Rule�� ������ ����.
 * <pre>
 *     - cf  : common function
 *     - cov : common object for validation
 * </pre>
 * @version : 1.0
 */

/* ********************************************************************************
 *                                 �̺�Ʈ �ڵ鸵
 * *******************************************************************************/



 /**
 * @type   : event
 * @access : private
 * @desc   : xrw���� ��Ʈ���� ���� ����Ǿ��� �� �߻��ϴ� xforms_value_changed() �̺�Ʈ�̴�.
 			 global�� ������ ���ұ� ������ ��Ʈ�ѿ��� �߻��ϴ� value_changed �̺�Ʈ�� �����ϸ�,
 			 �̺�Ʈ�� �ߺ��ǰ� �ȴ�.
 			 �̸� �����ϱ� ���� '��Ʈ��ID+_xforms_model_construct()' ��� �̸�����
 			 ���� �̺�Ʈ�� ������ �� �ְ� �� �ξ���.
 * @return : void
 */
function xforms_value_changed() {
	var ctrl = document.controls(event.target);

	if( ctrl != null) {
        var curNode = '';

		if (ctrl.elementName == "xforms:datagrid") {	// �׸����� ��� NODESET�� ������ ����ִ�.
			var gref = ctrl.attribute("nodeset");
			curNode = root.selectSingleNode(gref.substring(0, gref.lastIndexOf("/") ));
			if( curNode != null ) {
			    curNode.setattribute("update", true);
			}
		} else {
			var cref = ctrl.attribute("ref");			// �׸��� ���� ��Ʈ���� ��� REF�� ������ ����ִ�.
			curNode = root.selectSingleNode(cref.substring(0, cref.lastIndexOf("/") ));

            if( curNode != null ) {
			    curNode.setattribute("update", true);
			}
		}
	}

    // form �� ���� value_changed �̺�Ʈ�� �����ϱ� ����.
	try{
	    var f_name = event.target+'_xforms_value_changed()';
	    eval(f_name);
    } catch(E) {
        //model.alert(E);   // form function�� ���� ��.
    }
}



/**
 * @type   : event
 * @access : private
 * @desc   : �׸��� ���� �׸��� �׸��忡 readonly���·� ����.
 			 xrw���� �׸����� CELL�� Ŭ������ �� �߻��ϴ� onentercell() �̺�Ʈ�̴�.
 			 global�� ������ ���ұ� ������ �׸��忡�� �߻��ϴ� onentercell �̺�Ʈ�� �����ϸ�,
 			 �̺�Ʈ�� �ߺ��ǰ� �ȴ�.
 			 �̸� �����ϱ� ���� '��Ʈ��ID+_onentercell()' ��� �̸�����
 			 ���� �̺�Ʈ�� ������ �� �ְ� �� �ξ���.
 * @return : void
 */

function onentercell() {
	var ctrl = document.all(event.target);
	if ( ctrl != null ) {

		//�׸����� �Ӽ� �� disabled="true"�� �÷��� onentercell() �Լ��� skip�Ѵ�.
		if ( ctrl.elementName == "xforms:datagrid" ) {
			var child = ctrl.children;

		    for(var inx = 0; inx < child.length; inx++ ) {
		        if( child.item(inx).elementName == "xforms:col" ) {
		            var g_idx = inx + ctrl.col - 1;	//�׸��尡 ������ �ִ� ��ũ�ѵ��� child ������ �������� 6����.
    				var type = child.item(g_idx).attribute("type");

    				if ( type != null && type != "" && type == "combo" ) {
        				var att = child.item(g_idx).attribute("disabled");
        				if ( att != null || att != "") {
        					return;
        				}
    				}

		            break;
		        }
		    }
		}
	}
}


//----------------------------- 2. control ó�� ���� -----------------------------//

// datagrid
/*
- 0 : new
- 1 : insert
- 2 : update
- 3 : insert & new
- 4 : delete
*/
var IDNEW = 0;
var IDINSERT = 1;
var IDUPDATE = 2;
var IDNEWINSERT = 3;
var IDDELETE = 4;

/**
 * @type   : method
 * @access : public
 * @desc   : �׸��� �� �߰�.
 * <pre>
 *     covGridAddRow("ds_emp")
 * </pre>
 * @param  : gridID    grid ��Ʈ���� ID.
 * @return : void
 */
function covGridAddRow(gridID) {
	var grid = document.all(gridID);
	grid.addItem();
	grid.topRow = grid.rows - grid.fixedRows;
}

/**
 * @type   : method
 * @access : public
 * @desc   : �׸��� �� ����.
 * <pre>
 *     covGridDelRow("ds_emp")
 * </pre>
 * @param  : gridID    grid ��Ʈ���� ID.
 * @return : void
 */
function covGridDelRow(gridID) {
    var grid = document.all(gridID);
	if( grid.row >= grid.fixedRows ) {
		var gridStatus = grid.rowStatus(grid.row);
		covUndoGridRow(gridID, grid.row);  // ���� �����ͷ� ����.

		if( gridStatus == IDINSERT || gridStatus == IDNEWINSERT ) {
			grid.isReadOnly(grid.row, 0, grid.row, grid.cols-1) = true;
		} else {
			grid.rowstatus(grid.row) = IDDELETE;
		}
	}
}


//----------------------------- 3. ���� ��� ���� --------------------------------//


//----------------------------- 4. model �Լ� ������ -----------------------------//


//----------------------------- 5. value changed ����  ---------------------------//

/**
 * @type   : function
 * @access : public
 * @desc   : �׸��� ���� ������ �˻��Ѵ�.
 * @param  : gridID   �˻��ϰ��� �ϴ� �׸��� ID
 * @return : ���� ���� ( true : �����, false : ���� ����)
 */

function isGridUpdated(gridID) {
	var ctrl = document.all(gridID);

	if( ctrl != null ) {
		var updateData = ctrl.getUpdateData();
		var headerpos = updateData.indexOf("|");
		if( updateData.indexOf("|",headerpos+1) < 0 ) {
			return false;
		}
		return true;
	}
}


/**
 * @type   : function
 * @access : public
 * @desc   : ��� ���� ������ �˻��Ѵ�..
 * @param  : �˻��ϰ��� �ϴ� ���
 * @return : ���� ���� ( true : �����, false : ���� ����)
 */

function isUpdated(nodeName) {
	var targetNode = root.selectSingleNode("/"+nodeName);
	if( nodeName.substr(nodeName.length-1) == "/" ) {
		nodeName = nodeName.substr(0, nodeName.length-1);
	}

	var updateNode = targetNode.getAttribute("update");

	if (updateNode) {
		return true;
	}
	return false;
}


/**
 * @type   : function
 * @access : public
 * @desc   : �׸��� ��� ���
 *           �߰��� ���� ����, ����� ���� ���, ������ ���� ��ũ ����
 * @param  : gridID  ��ұ���� ������ �׸���ID
 * @param  : gridrow ��ұ���� ������ row ��ȣ
 * @return : void
 */
function covUndoGridRow(gridID, gridrow) {
	var grid = document.all(gridID);
	if ( grid != null ) {
		if( grid.rowstatus(gridrow) == IDINSERT || grid.rowstatus(gridrow) == IDNEWINSERT ) {
			grid.deleteitem(gridrow);
		} else if( grid.rowstatus(gridrow) == IDUPDATE || grid.rowstatus(gridrow) == IDDELETE ) {
			var undodata = grid.rowdata(gridrow).split("^");
			for ( var i = 0; i < grid.cols; i++ ) {
				grid.valueMatrix(grid.row, i) = undodata[i];
			}
			grid.isReadOnly(grid.row, 0, grid.row, grid.cols-1) = false;
			grid.rowstatus(gridrow) = IDNEW;
		}
	}
}
