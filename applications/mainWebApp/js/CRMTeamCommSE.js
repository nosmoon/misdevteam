/*************** CRM���� ����ϴ� ��-���� ��Ʈ�� script. ������ se_comm.js�� ����. ***************/

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
	model.copyNode("/root/tempCombo", ref_combo_root);
	
   //��ü-���ڿ��� ��츦 �߰�. (CRM �Ǹſ�)
	if ( gubun == "A" ) {
		label = "��ü";
		value = "ALL";
   } else if ( gubun == "AE" ){
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
	//�ӽ� ���� �����Ѵ�.
	model.removeNodeset(tempNode);
	model.refresh();
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

/* ���� ���õǸ� ��Ʈ/������ ���� �����Ѵ�. */
/* �޺������� ��ü/���� ���� ������ ���Ƿ� �� �� �ֵ��� parameter�߰�(gubun) - CRM ��ü-���ڿ� �ݿ� ����. */
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
	/* CRM. ��ü-���ڿ� ��� �߰� */
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

/* ���̳� ��Ʈ/���翡 ���� ������ ���� �����Ѵ�. */
/* �޺������� ��ü/���� ���� ������ ���Ƿ� �� �� �ֵ��� parameter�߰�(gubun) - CRM ��ü-���ڿ� �ݿ� ����. */
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
	
   /* CRM. ��ü-���ڿ� ��� �߰� */
	//if ( key == "ALL" ){
	if ( key == "ALL" || key == ""){
		key 			= eval(teamCombo + ".value");
		item_nm 	= "/supr_dept_cd";
	}
	
	if ( len > 0 ) {
		for ( var i = 1 ; i <= len ; i++ ){
			val          = model.getValue(nodeTemp + "/record[" + i + "]" + item_nm);
			
		/* CRM. ��ü-���ڿ� ��� �߰� */
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
 * ������� ��, ��Ʈ, ���� ���۳�Ʈ�� ��ȸ ����� �̺�Ʈ�� �ο��Ѵ�.
 * ������Ʈ�� resultref + "teamlist"�� ����
 * ��Ʈ ����Ʈ�� resultref + "partlist_temp"�� �����Ǿ����� �̺�Ʈ�� ���� resultref + "partlist"�� �Ű�����.
 * ���� ����Ʈ�� resultref + "arealist_temp"�� �����Ǿ����� �̺�Ʈ�� ���� resultref + "arealist"�� �Ű�����.
 * parameter strPath : 
*/
/* �޺������� ��ü/���� ���� ������ ���Ƿ� �� �� �ֵ��� parameter�߰�(teamGubun, partGubun, areaGubun) - CRM ��ü-���ڿ� �ݿ� ����. */
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

   /* CRM. �޺��� �ʱⰪ�� �޺��� ù��° ���� ���� ��� 'xforms-select' �̺�Ʈ�� �߻����� �����Ƿ� ���������� ���� */
   if(eval(teamCombo + ".value") == model.getValue(eval(teamCombo + ".attribute('ref')")))
      eval(teamEvent);
}

/** 
 * CRM �߰�.
 * ������� ��, ��Ʈ, ���� ���۳�Ʈ�� �̺�Ʈ�� �ο��Ѵ�. 
 * ��ȸ�� �������� �ʰ� �̹� ��ȸ�� ����� ���� �̺�Ʈ�� ����Ѵ�.
 * �� ȭ�鿡 �������� ��-���� ��ȸ�� ������ ��� �߰����� ��-���� set�� ���� ������ �� ����Ѵ�.
 * ������Ʈ�� resultref + "teamlist"�� ����
 * ��Ʈ ����Ʈ�� resultref + "partlist_temp"�� �����Ǿ����� �̺�Ʈ�� ���� resultref + "partlist"�� �Ű�����.
 * ���� ����Ʈ�� resultref + "arealist_temp"�� �����Ǿ����� �̺�Ʈ�� ���� resultref + "arealist"�� �Ű�����.
 * parameter strPath : 
*/
/* �޺������� ��ü/���� ���� ������ ���Ƿ� �� �� �ֵ��� parameter�߰�(teamGubun, partGubun, areaGubun) - CRM ��ü-���ڿ� �ݿ� ����. */
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

   /* CRM. �޺��� �ʱⰪ�� �޺��� ù��° ���� ���� ��� 'xforms-select' �̺�Ʈ�� �߻����� �����Ƿ� ���������� ���� */
   if(eval(teamCombo + ".value") == model.getValue(eval(teamCombo + ".attribute('ref')")))
      eval(teamEvent);
}

/**
 * �׸����� ù��° ���� ������ ������ �ϰ� �����Ѵ�.
 * parameter strPath : 
*/
function setLumpChg(grid, index){
	if ( datagrid1.rows < 2 ){
		alert("��ȸ�� �̿��� �� �ֽ��ϴ�.");
		return;
	}
	var keyVal		= eval(grid + ".valueMatrix(1, " + index + ")");
	var len			= eval(grid + ".rows");
	
	for ( var i = 2 ; i <= len ; i++ ){
		eval(grid + ".valueMatrix(" + i + ", " + index + ") = '" + keyVal + "'");
	}
}

/** �������� �� ���� ������ ���� ü�迡 �����Ƿ� �߰� **/

/* ������ ���õǸ� ������ ���� �����Ѵ�. - ������ select�� ��� ��� */
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

/* area event function�� ��� */
function makeAreaEvent(submitId, action, ref, resultref, areaCombo, branchCombo, preAction, emptyAreaDefaultCap, emptyAreaDefaultVal)
{
   if(emptyAreaDefaultCap == null) 
      emptyAreaDefaultCap = "��ü";
   if(emptyAreaDefaultVal == null)
      emptyAreaDefaultVal = "";

   var areaEvent = preAction + 'selectArea("' + submitId + '", "' + action + '", "' + ref + '", "' + resultref + '", "' + 
                                areaCombo + '", "' + branchCombo + '", "' + emptyAreaDefaultCap + '", "' + emptyAreaDefaultVal + '");';
   eval(areaCombo + ".attribute('xforms-select') = '" + areaEvent + "'");
   eval(areaCombo + ".select(0)");
}