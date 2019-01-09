/*************************************************************************************************/
/* 0. ��-������ ���� �ӽ� �Լ�
/* 1)  modelSendNoMake  : se_comm.js�� modelSendNoMake�� �ӽ÷� ���. (��-���� procedure ���� �Ϸ�� ������ ���.)
/* 2)  makeTeamSearch   : se_comm.js�� makeTeamSearch�� �ӽ÷� ���. (��-���� procedure ���� �Ϸ�� ������ ���.)
/* 3)  selectTeam       : ���� �Լ�. team event ó��
/* 4)  selectArea       : ���� �Լ�. event ó��
/* 5)  makeTeamEvent    : team event ó�� ���
/* 6)  makeAreaEvent    : area event ó�� ���
/* 7)  
/*************************************************************************************************/

/**
/* submission �ڵ� ����.
**/
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
/* ��-���� record ���� �� ���� ����. �ӽ÷� �����Ͽ� ����ϰ� ��-���� procedure ���� �Ϸ�Ǹ� ���� se_comm.js�� �ش� �Լ��� ���.
**/
function makeTeamSearch(submitId, action, ref, resultref, teamCombo, partCombo, areaCombo){

	modelSendNoMake(submitId, action, ref, resultref);
	/*var teamEvent = 'selectTeam("' + resultref + '", "' + teamCombo + '", "' + partCombo + '");';
	var partEvent = 'selectPart("' + resultref + '", "' + teamCombo + '", "' + partCombo + '", "' + areaCombo + '");';
	teamEvent = teamEvent + partEvent;

	eval(teamCombo + ".attribute('xforms-select') = '" + teamEvent + "'");
	eval(partCombo + ".attribute('xforms-select') = '" + partEvent + "'");
	
	makeComboGubun("A", resultref + "/teamlist", "record", "dept_nm", "dept_cd");
    eval(teamCombo + ".select(0)");*/

   //�߰� ����.
   model.makeNode(resultref + "/partlist");
   model.makeNode(resultref + "/arealist");
   model.copyNode(resultref + "/partlist", resultref + "/partlist_temp");
   model.copyNode(resultref + "/arealist", resultref + "/arealist_temp");

   eval(teamCombo + ".select(0)");
}

/* ���� ���õǸ� ������ ���� �����Ѵ�. - ���� ��Ʈ���� ���� ó���� �������� ���� ��� ���. 
   ��Ʈ���� ���� ���� ���߱� ���� �ϴ� arealist_temp�� �޴´�.
*/
function selectTeam(submitId, action, ref, resultref, areaCombo){
   modelSendNoMake(submitId, action, ref, resultref + "/arealist_temp");
   model.copyNode(resultref + "/arealist", resultref + "/arealist_temp");

	//model.refresh();
   eval(areaCombo + ".refresh()");
	
	eval(areaCombo + ".select(0)");
}

/* ������ ���õǸ� ������ ���� �����Ѵ�. - ������ select�� ��� ��� */
function selectArea(submitId, action, ref, resultref, branchCombo){
   modelSendNoMake(submitId, action, ref, resultref + "/codelist");

	//model.refresh();
   eval(branchCombo + ".refresh()");
	
	eval(branchCombo + ".select(0)");
}

/* team event function�� ��� */
function makeTeamEvent(submitId, action, ref, resultref, teamCombo, areaCombo, preAction)
{
   var teamEvent = preAction + 'selectTeam("' + submitId + '", "' + action + '", "' + ref + '", "' + resultref + '", "' + areaCombo + '");';
   eval(teamCombo + ".attribute('xforms-select') = '" + teamEvent + "'");
   eval(teamCombo + ".select(0)");
}

/* area event function�� ��� */
function makeAreaEvent(submitId, action, ref, resultref, areaCombo, branchCombo, preAction)
{
   var areaEvent = preAction + 'selectArea("' + submitId + '", "' + action + '", "' + ref + '", "' + resultref + '", "' + branchCombo + '");';
   eval(areaCombo + ".attribute('xforms-select') = '" + areaEvent + "'");
   eval(areaCombo + ".select(0)");
}