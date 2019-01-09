/**
 * @type : intro
 * @desc : trustform.js는 Trustform을 사용한 프로젝트 전반에 걸쳐 전 시스템에서 공통으로 사용하는 자바 스크립트를
 * 기술한 자바스크립트 파일이다.
 *
 * 함수 Naming Rule은 다음과 같다.(예외도 가능.)
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
 * @desc   : submit 서버로 요청하는 함수
 *           서버로부터 XML을 받기 위해 사용함.
 * <pre>
 *     onSubmit("RetrieveDepartmentCmd" , "", "/root/initData/itemset/departmentCode");
 * </pre>
 * @param  : action		erequest URL
 * @param  : req		서버에 요청시 서버로 전달할 XML의 부모 노드
 * @param  : res		서버에서 받은 XML이 위치할 노드
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
 * @desc   : 필수 입력 항목의 입력 여부를 확인하여,
 * 			 필수 입력항목이 빠졌을 경우 그 오브젝트에 focus가 가고,
 * 		     에러 메시지가 alert로 나타난 후에 이후의 작업(예:저장)을 수행하지 않고 리턴한다.
 *
 * <pre>
 *     if ( !cfCheckRequired(['ed_userid','co_skill_code'],['사원번호','기술등급']) ) return;
 * </pre>
 *
 * @param  : ctrArr		컨트롤 id.
 * @param  : msgArr		컨트롤 이름.
 * @return : boolean	필수입력항목의 입력 여부
 */
function cfCheckRequired(ctrArr, msgArr)
{
	for( var inx = 0; inx < ctrArr.length; inx++ ) {
	    if( !covNullValidator(ctrArr[inx]) ) {
			if (msgArr != null && msgArr[inx] != "") {
				showMsgBox("[" + msgArr[inx] + "]는 필수 입력입니다.");
			}
			else {
				showMsgBox("필수 입력입니다.");
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
 * @desc   : 필수 입력 항목의 입력 여부를 확인하여,
 * 			 필수 입력항목이 빠졌을 경우 그 오브젝트에 focus가 가고,
 * 		     에러 메시지가 alert로 나타난 후에 이후의 작업(예:저장)을 수행하지 않고 리턴한다.
 *
 * <pre>
 *     if( !cfCheckRequiredGrid("ds_center", ['code','name'], ['* 센터코드','* 센터']) ) return;
 * </pre>
 *
 * @param  : gridID      그리드 컨트롤 id.
 * @param  : colArr      필수 입력을 체크할 컬럼 이름.
 * @return : boolean     필수입력항목의 입력 여부
 */
function cfCheckRequiredGrid(gridID, colArr) {
    var grid = document.all(gridID);
    for ( var inx = grid.fixedRows; inx <= grid.rows; inx++ ) {
        var rowStat = grid.rowstatus(inx);

        if ( rowStat == IDINSERT || rowStat == IDUPDATE || rowStat == IDNEWINSERT ) {   // 변경 사항이 있을 때만,.
            for ( var jnx = 0; jnx < colArr.length; jnx++ ) {
                // 체크 대상 컬럼에 내용이 입력되었는지 확인 colref 문제.
           	    if ( grid.valueMatrix(inx, grid.ColRef(colArr[jnx])) == "" ) {
                    showMsgBox("필수 입력입니다.");
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
	par.insertBefore(newitem, ref);	// item 노드 만들기
	
	var firstItem = par.firstChild;	// 항상 마지막 item 노드
	
	var newlabel = ins.createnode( "element", "label", "" );
	newlabel.value = label;
	firstItem.appendchild(newlabel);
	
	var newvalue = ins.createnode( "element", "value", "" );
	newvalue.value = value;
	firstItem.appendchild(newvalue);
}

/* ********************************************************************************
 * 이벤트 핸들링
 * *******************************************************************************/


/**
 * @type   : function
 * @access : public
 * @desc   : 웹서버 에러시 자동으로 호출되는 함수.
 *			 해당 이벤트에서 서버의 404, 500 에러를 처리할 수 있다.(운영시점에만 동작하는 것을 권장함)
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
 * @desc   : xrw가 로딩될 때 발생하는 xforms_model_construct() 이벤트이다.
 			 global로 선언해 놓았기 때문에 페이지 내부에서 생성하는 construct 이벤트를 선언하면,
 			 이벤트가 중복되게 된다.
 			 이를 방지하기 위해 'form_xforms_model_construct()' 라는 이름으로
 			 form별 이벤트를 선언할 수 있게 해 두었다.
 * @return : void
 */
function xforms_model_construct() {

    // 이벤트의 중복 발생 방지한다. 이는 이벤트 버블링을 방지하기 위함이다.
	//event.stopPropagation();
}

function onaftersort() {

    document.all(event.target).gridToInstance();
	//event.stopPropagation();
}


//----------------------------- 2. control 처리 관련 -----------------------------//

// combo
/**
 * @type   : method
 * @access : public
 * @desc   : 콤보 컨트롤의 첫번째 아이템을 추가할 수 있는 함수.
 * <pre>
 *     cfAddComboItem( "/root/combo/item", "선택" )
 * </pre>
 * @param  : nodeSet    combo 컨트롤의 nodeSet.
 * @param  : label  	추가될 노드의 label 값.
 * @param  : [value]  	추가될 노드의 value 값.
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
    var tempRef = "/root/temp/item";	// '/root/temp/item' 노드를 만든 생성 -> 그곳에 새 노드 추가
    									// -> 원노드로 카피 순이다.
	model.makeNode(tempRef +"/label");
	model.makeNode(tempRef +"/value");
    model.setValue(tempRef +"/label", label );
	model.setValue(tempRef +"/value", value );

	model.duplicate( nodeSetRef, tempRef, "*[1]");  // 복사라서 검토 필요.
	model.removenode(tempRef);
}


//----------------------------- 3. 공통 기능 관련 --------------------------------//
/**
 * @type   : method
 * @access : public
 * @desc   : 컨트롤의 enable/disable 처리를 위한 공통 함수.
 * <pre>
 *     cfCtrEnable([ 'detailGroup', 'bSave' ], false)
 * </pre>
 * @param  : ctrArr      enable 상태를 변경할 ctrID 배열.
 * @param  : [status]    enable 여부 (true = enable, false disable(readOnly))
 * @return : [boolean]   true / false
 */
function cfCtrEnable(ctrArr, status) {
	var ctrObj, jnx = 0, eleName = '';

	if( ctrArr == null ) return false;

	if( status == null ) status = true;    // enable = false, default.

	for( var inx = 0; inx < ctrArr.length; inx++ ) {
	    // group의 enable 상태 변경시 하위 컨트롤의 enable 상태도 변경됨.
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


//----------------------------- 6. validation 관련  ------------------------------//
/**
 * @type   : function
 * @access : public
 * @desc   : 컨트롤의 NULL 여부를 체크함.
 * @param  : ctrID	  컨트롤 ID
 * @param  : gridIdx  그리드 컨트롤 row, col
 * @return : boolean ( true : 널 값, false : 값 존재 )
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
 * @desc : pattern.js는 Trustform을 사용한 UI Pattern에서 공통으로 사용하는 자바 스크립트를
 * 기술한 자바스크립트 파일이다.
 *
 * 함수 Naming Rule은 다음과 같다.
 * <pre>
 *     - cf  : common function
 *     - cov : common object for validation
 * </pre>
 * @version : 1.0
 */

/* ********************************************************************************
 *                                 이벤트 핸들링
 * *******************************************************************************/



 /**
 * @type   : event
 * @access : private
 * @desc   : xrw에서 컨트롤의 값이 변경되었을 때 발생하는 xforms_value_changed() 이벤트이다.
 			 global로 선언해 놓았기 때문에 컨트롤에서 발생하는 value_changed 이벤트를 선언하면,
 			 이벤트가 중복되게 된다.
 			 이를 방지하기 위해 '컨트롤ID+_xforms_model_construct()' 라는 이름으로
 			 개별 이벤트를 선언할 수 있게 해 두었다.
 * @return : void
 */
function xforms_value_changed() {
	var ctrl = document.controls(event.target);

	if( ctrl != null) {
        var curNode = '';

		if (ctrl.elementName == "xforms:datagrid") {	// 그리드일 경우 NODESET에 정보가 들어있다.
			var gref = ctrl.attribute("nodeset");
			curNode = root.selectSingleNode(gref.substring(0, gref.lastIndexOf("/") ));
			if( curNode != null ) {
			    curNode.setattribute("update", true);
			}
		} else {
			var cref = ctrl.attribute("ref");			// 그리드 외의 컨트롤일 경우 REF에 정보가 들어있다.
			curNode = root.selectSingleNode(cref.substring(0, cref.lastIndexOf("/") ));

            if( curNode != null ) {
			    curNode.setattribute("update", true);
			}
		}
	}

    // form 별 개별 value_changed 이벤트를 수행하기 위함.
	try{
	    var f_name = event.target+'_xforms_value_changed()';
	    eval(f_name);
    } catch(E) {
        //model.alert(E);   // form function이 없을 때.
    }
}



/**
 * @type   : event
 * @access : private
 * @desc   : 그리드 삭제 항목은 그리드에 readonly상태로 변경.
 			 xrw에서 그리드의 CELL을 클릭했을 때 발생하는 onentercell() 이벤트이다.
 			 global로 선언해 놓았기 때문에 그리드에서 발생하는 onentercell 이벤트를 선언하면,
 			 이벤트가 중복되게 된다.
 			 이를 방지하기 위해 '컨트롤ID+_onentercell()' 라는 이름으로
 			 개별 이벤트를 선언할 수 있게 해 두었다.
 * @return : void
 */

function onentercell() {
	var ctrl = document.all(event.target);
	if ( ctrl != null ) {

		//그리드의 속성 중 disabled="true"인 컬럼은 onentercell() 함수를 skip한다.
		if ( ctrl.elementName == "xforms:datagrid" ) {
			var child = ctrl.children;

		    for(var inx = 0; inx < child.length; inx++ ) {
		        if( child.item(inx).elementName == "xforms:col" ) {
		            var g_idx = inx + ctrl.col - 1;	//그리드가 가지고 있는 스크롤등의 child 갯수가 고정으로 6개임.
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


//----------------------------- 2. control 처리 관련 -----------------------------//

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
 * @desc   : 그리드 행 추가.
 * <pre>
 *     covGridAddRow("ds_emp")
 * </pre>
 * @param  : gridID    grid 컨트롤의 ID.
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
 * @desc   : 그리드 행 삭제.
 * <pre>
 *     covGridDelRow("ds_emp")
 * </pre>
 * @param  : gridID    grid 컨트롤의 ID.
 * @return : void
 */
function covGridDelRow(gridID) {
    var grid = document.all(gridID);
	if( grid.row >= grid.fixedRows ) {
		var gridStatus = grid.rowStatus(grid.row);
		covUndoGridRow(gridID, grid.row);  // 이전 데이터로 원복.

		if( gridStatus == IDINSERT || gridStatus == IDNEWINSERT ) {
			grid.isReadOnly(grid.row, 0, grid.row, grid.cols-1) = true;
		} else {
			grid.rowstatus(grid.row) = IDDELETE;
		}
	}
}


//----------------------------- 3. 공통 기능 관련 --------------------------------//


//----------------------------- 4. model 함수 재정의 -----------------------------//


//----------------------------- 5. value changed 관련  ---------------------------//

/**
 * @type   : function
 * @access : public
 * @desc   : 그리드 변경 유무를 검사한다.
 * @param  : gridID   검사하고자 하는 그리드 ID
 * @return : 변경 유무 ( true : 변경됨, false : 변경 없음)
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
 * @desc   : 노드 변경 유무를 검사한다..
 * @param  : 검사하고자 하는 노드
 * @return : 변경 유무 ( true : 변경됨, false : 변경 없음)
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
 * @desc   : 그리드 취소 기능
 *           추가된 행은 제거, 사용자 수정 취소, 삭제행 삭제 마크 제거
 * @param  : gridID  취소기능을 수행할 그리드ID
 * @param  : gridrow 취소기능을 수행할 row 번호
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
