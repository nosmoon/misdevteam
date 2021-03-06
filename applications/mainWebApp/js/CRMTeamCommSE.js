/*************** CRM에서 사용하는 팀-지국 컨트롤 script. 공통의 se_comm.js를 수정. ***************/

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
	model.copyNode("/root/tempCombo", ref_combo_root);
	
   //전체-빈문자열의 경우를 추가. (CRM 판매용)
	if ( gubun == "A" ) {
		label = "전체";
		value = "ALL";
   } else if ( gubun == "AE" ){
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
				model.makeNode(desNode + "[" + i + 1 + "]/" + ref_label);
				model.makeNode(desNode + "[" + i + 1 + "]/" + ref_value);
			
				label = model.getValue(tempNode + "/" + item_nm + "[" + i + "]/" + ref_label);
				value = model.getValue(tempNode + "/" + item_nm + "[" + i + "]/" + ref_value);
			
				model.setValue(desNode + "[" + i + 1 + "]/" + ref_label, label);
				model.setValue(desNode + "[" + i + 1 + "]/" + ref_value, value) ;
			}
		} else {
			model.makeNode(desNode + "[2]/" + ref_label);
			model.makeNode(desNode + "[2]/" + ref_value);
		
			label = model.getValue(tempNode + "/" + item_nm + "/" + ref_label);
			value = model.getValue(tempNode + "/" + item_nm + "/" + ref_value);
		
			model.setValue(desNode + "[2]/" + ref_label, label);
			model.setValue(desNode + "[2]/" + ref_value, value) ;
		}
	} 
	//임시 노드는 삭제한다.
	model.removeNodeset(tempNode);
	model.refresh();
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

/* 팀이 선택되면 파트/지사의 값을 변경한다. */
/* 콤보구성시 전체/선택 등의 설정을 임의로 할 수 있도록 parameter추가(gubun) - CRM 전체-빈문자열 반영 위해. */
function selectTeam(resultref, teamCombo, partCombo, gubun){
	var key        = eval(teamCombo + ".value");
	var arr        = instance1.selectSingleNode(resultref + "/partlist_temp/record"); 
	var len        = arr.length;
	var val, record, dept_cd, dept_nm, node2, node3;
	var node	   = resultref + "/partlist";
	var nodeTemp   = resultref + "/partlist_temp";
	var index	   = 1;
	model.removeNodeset(node);

	if ( len > 0 ) {
	  	for ( var i = 1 ; i <= len ; i++ ){
		val          = model.getValue(nodeTemp + "/record[" + i + "]/supr_dept_cd");
	/* CRM. 전체-빈문자열 경우 추가 */
		//if ( key == val || key == "ALL" ){
		if ( key == val || key == "ALL" || key == ""){
			model.makeNode(node + "/record[" + index + "]");
			model.makeNode(node + "/record[" + index + "]/dept_cd");
			model.makeNode(node + "/record[" + index + "]/dept_nm");
					
			model.setValue(node + "/record[" + index + "]/dept_cd", model.getValue(nodeTemp + "/record[" + i + "]/dept_cd"));
			model.setValue(node + "/record[" + index + "]/dept_nm", model.getValue(nodeTemp + "/record[" + i + "]/dept_nm"));
					
			index++;
			}
		}
	} else {
			model.makeNode(node + "/record[1]/dept_cd");
			model.makeNode(node + "/record[1]/dept_nm");
					
			model.setValue(node + "/record[1]/dept_cd", model.getValue(nodeTemp + "/record/dept_cd"));
			model.setValue(node + "/record[1]/dept_nm", model.getValue(nodeTemp + "/record/dept_nm"));
					
	}
	
	model.refresh();
   //makeComboGubun("A", resultref + "/partlist", "record", "dept_nm", "dept_cd");
   makeComboGubun(gubun, resultref + "/partlist", "record", "dept_nm", "dept_cd");

	eval(partCombo + ".select(0)");
}

/* 팀이나 파트/지사에 따라 지역의 값을 변경한다. */
/* 콤보구성시 전체/선택 등의 설정을 임의로 할 수 있도록 parameter추가(gubun) - CRM 전체-빈문자열 반영 위해. */
function selectPart(resultref, teamCombo, partCombo, areaCombo, gubun){
	var key         = eval(partCombo + ".value");
	var item_nm    	= "/dept_cd";
	var arr         = instance1.selectSingleNode(resultref + "/arealist_temp/record"); 
	var len         = arr.length;
	var node    	= resultref + "/arealist";
	var nodeTemp 	= resultref + "/arealist_temp";
	var index         	= 1;
	var val, record, dept_cd, dept_nm;
	model.removeNodeset(node);
	
   /* CRM. 전체-빈문자열 경우 추가 */
	//if ( key == "ALL" ){
	if ( key == "ALL" || key == ""){
		key 			= eval(teamCombo + ".value");
		item_nm 	= "/supr_dept_cd";
	}
	
	if ( len > 0 ) {
		for ( var i = 1 ; i <= len ; i++ ){
			val          = model.getValue(nodeTemp + "/record[" + i + "]" + item_nm);
			
		/* CRM. 전체-빈문자열 경우 추가 */
		//if ( key == val || key == "ALL" ){
			if ( key == val || key == "ALL" || key == "" ){
				model.makeNode(node + "/record[" + index + "]");
				model.makeNode(node + "/record[" + index + "]/area_cd");
				model.makeNode(node + "/record[" + index + "]/area_nm");
						
				model.setValue(node + "/record[" + index + "]/area_cd", model.getValue(nodeTemp + "/record[" + i + "]/area_cd"));
				model.setValue(node + "/record[" + index + "]/area_nm", model.getValue(nodeTemp + "/record[" + i + "]/area_nm"));
						
				index++;
			}
		}
	} else {
		model.makeNode(node + "/record[1]/area_cd");
		model.makeNode(node + "/record[1]/area_nm");
						
		model.setValue(node + "/record[1]/area_cd", model.getValue(nodeTemp + "/record/area_cd"));
		model.setValue(node + "/record[1]/area_nm", model.getValue(nodeTemp + "/record/area_nm"));		
	}
	model.refresh();
	//makeComboGubun("A", resultref + "/arealist", "record", "area_nm", "area_cd");
   makeComboGubun(gubun, resultref + "/arealist", "record", "area_nm", "area_cd");
	eval(areaCombo + ".select(0)");
}

/**
 * 만들어진 팀, 파트, 지역 컴퍼넌트에 조회 결과와 이벤트를 부여한다.
 * 팀리스트는 resultref + "teamlist"에 생성
 * 파트 리스트는 resultref + "partlist_temp"에 생성되어져서 이벤트에 따라 resultref + "partlist"에 옮겨진다.
 * 지역 리스트는 resultref + "arealist_temp"에 생성되어져서 이벤트에 따라 resultref + "arealist"에 옮겨진다.
 * parameter strPath : 
*/
/* 콤보구성시 전체/선택 등의 설정을 임의로 할 수 있도록 parameter추가(teamGubun, partGubun, areaGubun) - CRM 전체-빈문자열 반영 위해. */
function makeTeamSearch(submitId, action, ref, resultref, teamCombo, partCombo, areaCombo, teamGubun, partGubun, areaGubun){

   if(teamGubun == null || teamGubun == "")
      teamGubun = "AE";
   if(partGubun == null || partGubun == "")
      partGubun = "AE";
   if(areaGubun == null || areaGubun == "")
      areaGubun = "AE";

	modelSendNoMake(submitId, action, ref, resultref);
	//var teamEvent = 'selectTeam("' + resultref + '", "' + teamCombo + '", "' + partCombo + '");';
	//var partEvent = 'selectPart("' + resultref + '", "' + teamCombo + '", "' + partCombo + '", "' + areaCombo + '");';
   var teamEvent = 'selectTeam("' + resultref + '", "' + teamCombo + '", "' + partCombo + '", "' + partGubun + '");';
	var partEvent = 'selectPart("' + resultref + '", "' + teamCombo + '", "' + partCombo + '", "' + areaCombo + '", "' + areaGubun + '");';
	teamEvent = teamEvent + partEvent;

	eval(teamCombo + ".attribute('xforms-select') = '" + teamEvent + "'");
	eval(partCombo + ".attribute('xforms-select') = '" + partEvent + "'");
	
	//makeComboGubun("A", resultref + "/teamlist", "record", "dept_nm", "dept_cd");
   makeComboGubun(teamGubun, resultref + "/teamlist", "record", "dept_nm", "dept_cd");
   eval(teamCombo + ".select(0)");

   /* CRM. 콤보의 초기값이 콤보의 첫번째 값과 같을 경우 'xforms-select' 이벤트가 발생하지 않으므로 인위적으로 실행 */
   if(eval(teamCombo + ".value") == model.getValue(eval(teamCombo + ".attribute('ref')")))
      eval(teamEvent);
}

/** 
 * CRM 추가.
 * 만들어진 팀, 파트, 지역 컴퍼넌트에 이벤트를 부여한다. 
 * 조회는 수행하지 않고 이미 조회된 결과에 대해 이벤트를 등록한다.
 * 한 화면에 여러개의 팀-지국 조회가 존재할 경우 추가적인 팀-지국 set에 대해 설정할 때 사용한다.
 * 팀리스트는 resultref + "teamlist"에 생성
 * 파트 리스트는 resultref + "partlist_temp"에 생성되어져서 이벤트에 따라 resultref + "partlist"에 옮겨진다.
 * 지역 리스트는 resultref + "arealist_temp"에 생성되어져서 이벤트에 따라 resultref + "arealist"에 옮겨진다.
 * parameter strPath : 
*/
/* 콤보구성시 전체/선택 등의 설정을 임의로 할 수 있도록 parameter추가(teamGubun, partGubun, areaGubun) - CRM 전체-빈문자열 반영 위해. */
function makeTeamSearchAdd(resultref, teamCombo, partCombo, areaCombo, teamGubun, partGubun, areaGubun){

   if(teamGubun == null || teamGubun == "")
      teamGubun = "AE";
   if(partGubun == null || partGubun == "")
      partGubun = "AE";
   if(areaGubun == null || areaGubun == "")
      areaGubun = "AE";

	var teamEvent = 'selectTeam("' + resultref + '", "' + teamCombo + '", "' + partCombo + '", "' + partGubun + '");';
	var partEvent = 'selectPart("' + resultref + '", "' + teamCombo + '", "' + partCombo + '", "' + areaCombo + '", "' + areaGubun + '");';
	teamEvent = teamEvent + partEvent;

	eval(teamCombo + ".attribute('xforms-select') = '" + teamEvent + "'");
	eval(partCombo + ".attribute('xforms-select') = '" + partEvent + "'");
	
	//makeComboGubun("A", resultref + "/teamlist", "record", "dept_nm", "dept_cd");
   makeComboGubun(teamGubun, resultref + "/teamlist", "record", "dept_nm", "dept_cd");
   eval(teamCombo + ".select(0)");

   /* CRM. 콤보의 초기값이 콤보의 첫번째 값과 같을 경우 'xforms-select' 이벤트가 발생하지 않으므로 인위적으로 실행 */
   if(eval(teamCombo + ".value") == model.getValue(eval(teamCombo + ".attribute('ref')")))
      eval(teamEvent);
}

/**
 * 그리드의 첫번째 값을 마지막 값까지 일괄 변경한다.
 * parameter strPath : 
*/
function setLumpChg(grid, index){
	if ( datagrid1.rows < 2 ){
		alert("조회후 이용할 수 있습니다.");
		return;
	}
	var keyVal		= eval(grid + ".valueMatrix(1, " + index + ")");
	var len			= eval(grid + ".rows");
	
	for ( var i = 2 ; i <= len ; i++ ){
		eval(grid + ".valueMatrix(" + i + ", " + index + ") = '" + keyVal + "'");
	}
}

/** 지역선택 시 지국 변경은 공통 체계에 없으므로 추가 **/

/* 지역이 선택되면 지국의 값을 변경한다. - 지국이 select인 경우 사용 */
function selectArea(submitId, action, ref, resultref, areaCombo, branchCombo, emptyAreaDefaultCap, emptyAreaDefaultVal){
   if(document.controls(branchCombo) == null)
      return;

   if(eval(areaCombo + ".value") == "")
   {
      clearSelectCombo(document.controls(branchCombo), emptyAreaDefaultCap, emptyAreaDefaultVal, true);
      return;
   }

   modelSendNoMake(submitId, action, ref, resultref + "/codelist");

	//model.refresh();
   eval(branchCombo + ".refresh()");
	
	eval(branchCombo + ".select(0)");
}

/* area event function을 등록 */
function makeAreaEvent(submitId, action, ref, resultref, areaCombo, branchCombo, preAction, emptyAreaDefaultCap, emptyAreaDefaultVal)
{
   if(emptyAreaDefaultCap == null) 
      emptyAreaDefaultCap = "전체";
   if(emptyAreaDefaultVal == null)
      emptyAreaDefaultVal = "";

   var areaEvent = preAction + 'selectArea("' + submitId + '", "' + action + '", "' + ref + '", "' + resultref + '", "' + 
                                areaCombo + '", "' + branchCombo + '", "' + emptyAreaDefaultCap + '", "' + emptyAreaDefaultVal + '");';
   eval(areaCombo + ".attribute('xforms-select') = '" + areaEvent + "'");
   eval(areaCombo + ".select(0)");
}