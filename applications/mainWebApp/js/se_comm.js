/**
 * 판매시스템 공통적용 부분
 * :그리드의 selectionmode를 free로 디폴트 세팅se_cleargrid
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
	
  
//그리드 화살표 이동을 위한 체크 변수
var grid_col_type = "";
			
/*************************************************************************************************/
/* 0. 출판 Global Event 관련 함수 (Event)
/* 1)  onkeydown   		: 화살표키 체크
/* 2)  onentercell 		: 컬럼이동 후 컬럼타입이 에디트형일 경우 데이터 블럭 선택
/* 3)  xforms_next 		: 컬럼이동시 이동 후 컬럼타입을 전역변수에 set
/* 4)  xforms_previous	: 컬럼이동시 이동 전 컬럼타입을 전역변수에 set
/*************************************************************************************************/
/*-----------------------------------------------------------------------------------
 * NAME  : onkeydown()
 * DESC  : keydown시 화살표 체크하여 이벤트 처리
 * PARAM : 
 * DATE  : 
 * AUTH  : 김상옥
 *----------------------------------------------------------------------------------*/
function onkeydown() {
    var currtarget = event.currentTarget;
    if(currtarget.indexOf("_$") != -1) return false;
    if(currtarget == "body" || currtarget == "html" ) return false;
    
    var obj = document.controls(currtarget);
    var id = obj.attribute("id");
    var arrowkey = obj.attribute("arrowkey");
    var grid = document.all(id);

	var fixcol;		//고정열수
	var fixrow;		//고정행수
	var totcol;		//총열수
	var nowcol;		//현재열위치
	var totrow;		//총행수
	var nowrow;		//현재행위치

    if(obj.elementName == "xforms:datagrid") {
		//화살표키 이벤트 허용 체크
		if(arrowkey != "N"){
			//화살표키
			if(event.keyCode == 37 || event.keyCode == 38 || event.keyCode == 39 || event.keyCode == 40){
				fixcol = grid.fixedCols;
				fixrow = grid.fixedRows;
				totcol = grid.cols;
				nowcol = grid.col;
				totrow = grid.rows;
				nowrow = grid.row;

				//화살표 키에 따라 처리
				if      (event.keyCode == 37){
					//왼쪽 화살표
					if(nowcol > fixcol){
						if((grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate") && grid_col_type != "combo"){
							model.setFocus(id);
							grid.col = nowcol-1;
							grid.row = nowrow;
							grid.editCell();
						}
					}
			
				}else if(event.keyCode == 38){
					//위쪽 화살표
					if(nowrow > fixrow){
						if(grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate"){
							model.setFocus(id);
							grid.col = nowcol;
							grid.row = nowrow-1;
							grid.editCell();
						}
					}
			
				}else if(event.keyCode == 39){
					//오른쪽 화살표
					if(nowcol+1 < totcol){
						if((grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate") && grid_col_type != "combo"){
							model.setFocus(id);
							grid.col = nowcol+1;
							grid.row = nowrow;
							grid.editCell();
						}
					}
			
				}else if(event.keyCode == 40){
					//아래쪽 화살표
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
 * DESC  : 컬럼이동 후 컬럼타입이 에디트형일 경우 데이터 블럭 선택
 * PARAM : 
 * DATE  : 
 * AUTH  : 김상옥
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
		//화살표키 이벤트 허용 체크
		if(arrowkey != "N"){
			nowcol = grid.col;		//현재컬럼 위치

			if(grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate"){
				grid.editCell();
			}
		}
    }
}

/*-----------------------------------------------------------------------------------
 * NAME  : xforms_next()
 * DESC  : 컬럼이동시 이동 후 컬럼타입을 전역변수에 set
 * PARAM : 
 * DATE  : 
 * AUTH  : 김상옥
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
		//화살표키 이벤트 허용 체크
		if(arrowkey != "N"){
			grid_col_type = grid.colType(grid.col);
		}
    }
}

/*-----------------------------------------------------------------------------------
 * NAME  : xforms_previous()
 * DESC  : 컬럼이동시 이동 전 컬럼타입을 전역변수에 set
 * PARAM : 
 * DATE  : 
 * AUTH  : 김상옥
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
		//화살표키 이벤트 허용 체크
		if(arrowkey != "N"){
			grid_col_type = grid.colType(grid.col);
		}
    }
}

  
/**
 * 지정한 경로의 하위 엘리먼트들의 값을 비움(1 depth 하위만 해당)
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
 * 콤보 박스에 전체(A), 선택(S), ""의 값을 넣는다.
 * parameter strPath : 구분, 원 콤보 노드, 리스트 레코드명, 콤보라벨명, 콤보값명
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
	model.refresh();
}

/* 팀이 선택되면 파트/지사의 값을 변경한다. */
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

/* 팀이나 파트/지사에 따라 지역의 값을 변경한다. */
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
 * 만들어진 팀, 파트, 지역 컴퍼넌트에 조회 결과와 이벤트를 부여한다.
 * 팀리스트는 resultref + "teamlist"에 생성
 * 파트 리스트는 resultref + "partlist_temp"에 생성되어져서 이벤트에 따라 resultref + "partlist"에 옮겨진다.
 * 지역 리스트는 resultref + "arealist_temp"에 생성되어져서 이벤트에 따라 resultref + "arealist"에 옮겨진다.
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

//팀콤보에서 전체를 빼기위한 구성함수
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
 * 그리드의 첫번째 값을 마지막 값까지 일괄 변경한다.
 * 강제로 상태 값을 변경했기 때문에 조회나 저장후 다시 grid.clearStatus()를 해야함.
 * parameter strPath : 
*/
function setLumpChg(grid, index){
	if ( eval(grid+".rows") <= eval(grid + ".fixedRows") ){
		alert("조회후 이용할 수 있습니다.");
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
			//상태 값이 변하지 않아서 강제로 상태 값을 업데이트로 변경. 단 인서트인 경우는 인서트 그대로 둔다.
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
 * 선택된 그리드의 셀들의 상태값을 삭제 상태로 변경한다.
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
 * 그리드의 변경 사항을 리턴한다.
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
 * 코드,코드명으로 구성된 1건검색 
 * parameter 
 * - cdgb(코드구분) 
 *		 : 1=담당자코드, 2=지국장검색
 * - rootRef : 코드,명의 상위노드 xpath  
 * - cdRef : 코드 Element명
 * - nmRef : 코드명 Element명
 * - gubun(호출구분) = N : 일반 컴포넌트, G : 그리드 컴퍼넌트
 * - grid : grid 호출일경우 grid id명(String)
*/
function se_getCdCdnm(cdgb, rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	//req용 노드생성
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
	//res용 노드생성
	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}
	
	//그리드에서의 호출일경우 cdRef, nmRef 재정의
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

	//cd, nm값을 조회로 보낼 req에 세팅
	model.setValue(tempReq+"/cd", model.getValue(cdXpath));
	model.setValue(tempReq+"/cdnm", model.getValue(cdnmXpath));
	
	//건수검색 조회 submit
	if(cdgb == "1"){
		//담당자 코드/명 검색
		modelSendNoMake("se_comm_1005_s", "/se/comm/1005", tempReq, tempRes);
	}else if(cdgb == "2"){
		//지국장 주민번호/성명 검색
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
		/* 팝업을 위한 전역 변수를 사용하여 가져갈 코드값과 결과 값을 받을 경로를 지정한다. */
		model.property("se_gb") 		= "2";		//호출구분(1:버튼클릭, 2:2건이상자동띄움)
		model.property("se_cd") 		= model.getValue(cdXpath);
		model.property("se_cdnm") 		= model.getValue(cdnmXpath);
		model.property("se_cd_path") 	= cdXpath;
		model.property("se_cdnm_path")  = cdnmXpath;
			
		//팝업 호출	
		if(cdgb == "1"){
			//담당자 코드/명 검색
			window.load(
					"/xrw/se/comm/SE_COMM_1000.xrw", 
					"modal", 
					"", 
					"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
					,""
					,""
				);
		}else if(cdgb == "2"){
			//지국장 주민번호/성명 검색
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
	
	//그리드에서 호출시 상태를 수정으로 변경
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
}

/**
 * 코드,코드명으로 구성된 팝업띄우기 
 * parameter 
 * - cdgb(코드구분) 
 *		 : 1=담당자코드, 2=지국장검색
 * - rootRef : 코드,명의 상위노드 xpath  
 * - cdRef : 코드 Element명
 * - nmRef : 코드명 Element명
 * - gubun(호출구분) = N : 일반 컴포넌트, G : 그리드 컴퍼넌트
 * - grid : grid 호출일경우 grid id명(String)
*/
function se_getCdCdnm_p(cdgb, rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	
	//그리드에서의 호출일경우 cdRef, nmRef 재정의
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

    model.property("se_gb")     	= "1";		//호출구분(1:버튼클릭, 2:2건이상자동띄움)
	model.property("se_cd") 		= model.getValue(cdXpath);
	model.property("se_cdnm") 		= model.getValue(cdnmXpath);
	model.property("se_cd_path") 	= cdXpath;
	model.property("se_cdnm_path")  = cdnmXpath;

	//팝업 호출	
	if(cdgb == "1"){
		//담당자 코드/명 검색
		window.load(
				"/xrw/se/comm/SE_COMM_1000.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden"
				,""
				,""
			);
	}else if(cdgb == "2"){
		//지국장 주민번호/성명 검색
		window.load(
				"/xrw/se/comm/SE_COMM_1300.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
				,""
				,""
			);
	}
	
	//그리드에서 호출시 상태를 수정으로 변경
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
	
}


/**
 * 공통코드 테이블의 코드,코드명으로 구성된 1건검색 
 * parameter 
 * - cdgb(팝업창구분) : 1:시구군구분 
 * - job_clsf : job_clsf
 * - cd_clsf : cd_clsf
 * - rootRef : 코드,명의 상위노드 xpath  
 * - cdRef : 코드 Element명
 * - nmRef : 코드명 Element명
 * - gubun(호출구분) = N : 일반 컴포넌트, G : 그리드 컴퍼넌트
 * - grid : grid 호출일경우 grid id명(String)
*/
function se_getComncd(cdgb, job_clsf, cd_clsf, rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	//req용 노드생성
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
	//res용 노드생성
	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}
	
	//그리드에서의 호출일경우 cdRef, nmRef 재정의
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

	//cd, nm값을 조회로 보낼 req에 세팅
	model.setValue(tempReq+"/job_clsf", job_clsf);
	model.setValue(tempReq+"/cd_clsf", cd_clsf);
	model.setValue(tempReq+"/cd", model.getValue(cdXpath));
	model.setValue(tempReq+"/cdnm", model.getValue(cdnmXpath));
	
	//건수검색 조회 submit
	modelSendNoMake("se_comm_1405_s", "/se/comm/1405", tempReq, tempRes);
	
	var rsltCnt = parseInt(model.getValue(tempRes+"/rsltcnt"));

	if ( rsltCnt == 0 ){
		model.setValue(cdXpath, "");
		model.setValue(cdnmXpath, "");
	}else if ( rsltCnt == 1 ) {
		model.setValue(cdXpath, model.getValue(tempRes+"/cd"));
		model.setValue(cdnmXpath, model.getValue(tempRes+"/cdnm"));
	} else if ( rsltCnt > 1) {
		/* 팝업을 위한 전역 변수를 사용하여 가져갈 코드값과 결과 값을 받을 경로를 지정한다. */
		model.property("se_gb") 		= "2";		//호출구분(1:버튼클릭, 2:2건이상자동띄움)
		model.property("se_cd") 		= model.getValue(cdXpath);
		model.property("se_cdnm") 		= model.getValue(cdnmXpath);
		model.property("se_cd_path") 	= cdXpath;
		model.property("se_cdnm_path")  = cdnmXpath;
			
		//팝업 호출	
		if(cdgb == "1"){
			//시구군구분 검색
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
	
	//그리드에서 호출시 상태를 수정으로 변경
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
}

/**
 * 코드,코드명으로 구성된 팝업띄우기 
 * parameter 
 * - cdgb(코드구분) 
 *		 : 1=담당자코드, 2=지국장검색
 * - rootRef : 코드,명의 상위노드 xpath  
 * - cdRef : 코드 Element명
 * - nmRef : 코드명 Element명
 * - gubun(호출구분) = N : 일반 컴포넌트, G : 그리드 컴퍼넌트
 * - grid : grid 호출일경우 grid id명(String)
*/
function se_getComncd_p(cdgb, rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	
	//그리드에서의 호출일경우 cdRef, nmRef 재정의
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

    model.property("se_gb")     	= "1";		//호출구분(1:버튼클릭, 2:2건이상자동띄움)
	model.property("se_cd") 		= model.getValue(cdXpath);
	model.property("se_cdnm") 		= model.getValue(cdnmXpath);
	model.property("se_cd_path") 	= cdXpath;
	model.property("se_cdnm_path")  = cdnmXpath;
		
	//팝업 호출	
	if(cdgb == "1"){
		//담당자 코드/명 검색
		window.load(
				"/xrw/se/comm/SE_COMM_1400.xrw", 
				"modal", 
				"", 
				"left:30px; top:200px; width:420px; height:420; align:center; caption:hidden;"
				,""
				,""
			);
	}
	
	//그리드에서 호출시 상태를 수정으로 변경
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
	
}


/**
 * 지국찾기 1건검색 
 * parameter 
 * - rootRef : 코드,명의 상위노드 xpath  
 * - cdRef : 코드 Element명
 * - nmRef : 코드명 Element명
 * - gubun(호출구분) = N : 일반 컴포넌트, G : 그리드 컴퍼넌트
 * - grid : grid 호출일경우 grid id명(String)
*/
function se_getBocdnm(rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	//req용 노드생성
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
	//res용 노드생성
	if(instance1.selectSingleNode(tempRes) == null){
		model.makeNode(tempRes);
	}
	
	//그리드에서의 호출일경우 cdRef, nmRef 재정의
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
	
	//cd, nm값을 조회로 보낼 req에 세팅
	model.setValue(tempReq+"/bo_cd", model.getValue(cdXpath));
	model.setValue(tempReq+"/bo_nm", model.getValue(cdnmXpath));
	
	
	//건수검색 조회 submit
	modelSendNoMake("se_comm_1105_s", "/se/comm/1105", tempReq, tempRes);
	
	var rsltCnt = parseInt(model.getValue(tempRes+"/rsltcnt"));

	if ( rsltCnt == 0 ){
		model.setValue(cdXpath, "");
		model.setValue(cdnmXpath, "");
	}else if ( rsltCnt == 1 ) {
		model.setValue(cdXpath, model.getValue(tempRes+"/bo_cd"));
		model.setValue(cdnmXpath, model.getValue(tempRes+"/bo_nm"));
	} else if ( rsltCnt > 1) {
		/* 팝업을 위한 전역 변수를 사용하여 가져갈 코드값과 결과 값을 받을 경로를 지정한다. */
		model.property("se_gb") 		= "2";		//호출구분(1:버튼클릭, 2:2건이상자동띄움)
		model.property("se_cd") 		= model.getValue(cdXpath);
		model.property("se_cdnm") 		= model.getValue(cdnmXpath);
		model.property("se_cd_path") 	= cdXpath;
		model.property("se_cdnm_path")  = cdnmXpath;
			
		//팝업 호출	
		window.load(
				"/xrw/se/comm/SE_COMM_1100.xrw", 
				"modal", 
				"", 
				"left:30px; top:100px; width:660px; height:500; align:center; caption:hidden;"
				,""
				,""
		);
	}

	//그리드에서 호출시 상태를 수정으로 변경
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
}

/**
 * 코드,코드명으로 구성된 팝업띄우기 
 * parameter 
 * - cdgb(코드구분) 
 *		 : 1=담당자코드, 2=지국장검색
 * - rootRef : 코드,명의 상위노드 xpath  
 * - cdRef : 코드 Element명
 * - nmRef : 코드명 Element명
 * - gubun(호출구분) = N : 일반 컴포넌트, G : 그리드 컴퍼넌트
 * - grid : grid 호출일경우 grid id명(String)
*/
function se_getBocdnm_p(rootRef ,cdRef, cdnmRef, gubun, grid){
	
	var cdXpath = "";
	var cdnmXpath = "";
	
	//그리드에서의 호출일경우 cdRef, nmRef 재정의
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

    model.property("se_gb")     	= "1";		//호출구분(1:버튼클릭, 2:2건이상자동띄움)
	model.property("se_cd") 		= model.getValue(cdXpath);
	model.property("se_cdnm") 		= model.getValue(cdnmXpath);
	model.property("se_cd_path") 	= cdXpath;
	model.property("se_cdnm_path")  = cdnmXpath;
		
	//팝업 호출	
	window.load(
			"/xrw/se/comm/SE_COMM_1100.xrw", 
			"modal", 
			"", 
			"left:30px; top:100px; width:660px; height:500; align:center; caption:hidden;"
			,""
			,""
	);
	
	//그리드에서 호출시 상태를 수정으로 변경
	if( gubun == "G" ){
		var selectRow	= eval(grid + ".row");
		var rStatus = eval(grid + ".rowStatus(" + selectRow + ")");
		if(rStatus == 0) eval(grid + ".rowStatus(" + selectRow + ") = 2");
	}
			
	model.refresh();
	
}



/**
 * 지국  조회한다.
 * gubun = P : 팝업, N : 팝업없이 검색 
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
		
		model.property("bo_cd"					)	= cdVal		; //팝업검색값
		model.property("bo_nm"					)	= nmVal		; //팝업검색값
	
		
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



/* (인사)부서검색 팝업 */
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
 * 노선코드를 조회한다.
 * gubun = N : 일반 컴포넌트, G : 그리드 컴퍼넌트
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
		/* 팝업을 위한 전역 변수를 사용하여 가져갈 코드값과 결과 값을 받을 경로를 지정한다. */
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
 * 발송처를 조회한다.
 * gubun = N : 일반 컴포넌트, G : 그리드 컴퍼넌트
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

		/* 팝업을 위한 전역 변수를 사용하여 가져갈 코드값과 결과 값을 받을 경로를 지정한다. */
		var bo_cd_path				= rootRefNode + "/" + cdRef;			//지국코드경로
		var bo_seq_path				= rootRefNode + "/" + nmRef;			//지국순번경로
		var send_plac_seq_path		= rootRefNode + "/send_plac_seq";	//발송처순번경로
		var send_plac_nm_path		= rootRefNode + "/send_plac_nm";	//발송처명경로
		var area_cd_path			= rootRefNode + "/area_cd";			//지역코드경로
		var area_nm_path			= rootRefNode + "/area_nm";			//지역명경로
		
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
 * 발송처를 조회한다.
 * gubun = P : 팝업, N : 팝업없이 검색 
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

		/* 팝업을 위한 전역 변수를 사용하여 가져갈 코드값과 결과 값을 받을 경로를 지정한다. */
		var send_plac_cd_seq_path				= rootRefNode + "/" + cdRef;			//지국코드+발송처순번 

		
		var bo_cd_path				= rootRefNode + "/bo_cd";			//지국코드 
		var bo_seq_path				= rootRefNode + "/bo_seq";		//지국순번 
		var send_plac_seq_path		= rootRefNode + "/send_plac_seq";	//발송처순번경로
		var send_plac_nm_path		= rootRefNode + "/send_plac_nm";	//발송처명경로
		var area_cd_path			= rootRefNode + "/area_cd";			//지역코드경로
		var area_nm_path			= rootRefNode + "/area_nm";			//지역명경로

		
		model.property("bo_cd"					)	= cdVal.substr(0, 5)			; //팝업검색값
		model.property("send_plac_seq"			)	= cdVal.substr(5, 3)			; //팝업검색값
		model.property("send_plac_nm"			)	= nmVal							; //팝업검색값
		
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
 * 우편번호 호출(일반용, 우편번호 항목이 두개짜리)
 * parameter
 *  - bogb : 지국명 보일지여부(L이면 안보임)
 *  - zip1Ref : 우편번호1 xPath
 *  - zip2Ref : 우편번호2 xPath
 *  - addrRef : 주소 xPath
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
	
	//"L"이면 지국항목 안보임
	model.setValue("/root/tempData/posttemp/send/disp_flag", bogb);
	model.setValue("/root/tempData/posttemp/send/zip", model.getValue(zip1Ref)+model.getValue(zip2Ref));
	
	openZip("/root/tempData/posttemp/send", "/root/tempData/posttemp/recv");
	
	model.setValue(zip1Ref, model.getValue("/root/tempData/posttemp/recv/zip1"));
	model.setValue(zip2Ref, model.getValue("/root/tempData/posttemp/recv/zip2"));
	model.setValue(addrRef, model.getValue("/root/tempData/posttemp/recv/addr"));
	
	model.refresh();

}

/**
 * 우편번호 호출 (그리드용, 우편번호 항목이 하나짜리)
 * parameter
 *  - bogb : 지국명 보일지여부(L이면 안보임)
 *  - zip1Ref : 우편번호1 xPath
 *  - zip2Ref : 우편번호2 xPath
 *  - addrRef : 주소 xPath
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
 * 공통거래처 등록팝업
 * parameter
*/
function se_regDlcoInfo(){

    viewer("mainFrame").window.javaScript.onLoadPopupPage("CO_DLCO_1000");
    
    /* 공통거래처 등록후 리턴정보 
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
 * 공통거래처 선택팝업
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
 * 그리드 조회후 건수 체크
 * parameter
 *  - sGrid : 그리드명
*/
function se_chkGridCnt(sGrid){

	var rows = eval(sGrid + ".rows");
	var f_row = eval(sGrid + ".fixedRows");
	if(submit_completed()){
		if(rows == f_row) commAlert("검색결과가 없습니다.");
	}

}


/**
 * 판촉물을 조회한다.
 * gubun = N : 일반 컴포넌트, G : 그리드 컴퍼넌트
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
		/* 팝업을 위한 전역 변수를 사용하여 가져갈 코드값과 결과 값을 받을 경로를 지정한다. */
		var bns_item_cd_path		= rootRefNode + "/" + cdRef;		//판촉물 코드
		var bns_item_nm_path		= rootRefNode + "/" + nmRef;		//판촉물 명
		
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
 * 숫자계산을 위한 숫자변환함수
 * parameter
 *  - strNum : 숫자형문자
*/
function se_eval(strNum){

	var rtnNum = 0;
	if(strNum != "") rtnNum = eval(strNum);
	return rtnNum; 

}

/**
 * subtotal 합계의 style문자 
*/
function se_subtotstyle(){
	var gse_subtotstyle = "background-color:#e3e3e3;font-weight:bold;";
	return gse_subtotstyle;
}

/**
 * 그리드 delete
*/
function se_cleargrid(grid){
	var o_grid = document.all(grid);
		
	for(var i=o_grid.rows; i>1; i--) { 
		o_grid.removeRow(false);
	}
	model.refresh();
}

/**
 * 그리드의 상태값을 초기(조회)상태로 변경.
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
 * 두 날짜의 기간이 1년이상인지 검사
 * 
 * parameter 
 *		- strdt1,strdt2 : 검색기간 날짜1,2(문자열 )
*/
function se_chkOverDate(strdt1,strdt2){

	if(strdt1.length!="8" || strdt2.length!="8"){
		commAlert("날짜 타입이 아닙니다.");
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
		commAlert("검색기간이 1년을 초과할 수 없습니다.");
		return false;
	}else{
		return true;
	}
	
}
