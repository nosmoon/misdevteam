/*************************************************************************************************/
/* 0. 팀-지국을 위한 임시 함수
/* 1)  modelSendNoMake  : se_comm.js의 modelSendNoMake를 임시로 대신. (팀-지국 procedure 등이 완료될 때까지 사용.)
/* 2)  makeTeamSearch   : se_comm.js의 makeTeamSearch를 임시로 대신. (팀-지국 procedure 등이 완료될 때까지 사용.)
/* 3)  selectTeam       : 내부 함수. team event 처리
/* 4)  selectArea       : 내부 함수. event 처리
/* 5)  makeTeamEvent    : team event 처리 등록
/* 6)  makeAreaEvent    : area event 처리 등록
/* 7)  
/*************************************************************************************************/

/**
/* submission 자동 구성.
**/
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
/* 팀-지국 record 구성 및 관계 설정. 임시로 변경하여 사용하고 팀-지국 procedure 등이 완료되면 실제 se_comm.js의 해당 함수를 사용.
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

   //추가 변형.
   model.makeNode(resultref + "/partlist");
   model.makeNode(resultref + "/arealist");
   model.copyNode(resultref + "/partlist", resultref + "/partlist_temp");
   model.copyNode(resultref + "/arealist", resultref + "/arealist_temp");

   eval(teamCombo + ".select(0)");
}

/* 팀이 선택되면 지역의 값을 변경한다. - 아직 파트관련 서버 처리가 구성되지 않은 경우 사용. 
   파트포함 공통 모듈과 맞추기 위해 일단 arealist_temp에 받는다.
*/
function selectTeam(submitId, action, ref, resultref, areaCombo){
   modelSendNoMake(submitId, action, ref, resultref + "/arealist_temp");
   model.copyNode(resultref + "/arealist", resultref + "/arealist_temp");

	//model.refresh();
   eval(areaCombo + ".refresh()");
	
	eval(areaCombo + ".select(0)");
}

/* 지역이 선택되면 지국의 값을 변경한다. - 지국이 select인 경우 사용 */
function selectArea(submitId, action, ref, resultref, branchCombo){
   modelSendNoMake(submitId, action, ref, resultref + "/codelist");

	//model.refresh();
   eval(branchCombo + ".refresh()");
	
	eval(branchCombo + ".select(0)");
}

/* team event function을 등록 */
function makeTeamEvent(submitId, action, ref, resultref, teamCombo, areaCombo, preAction)
{
   var teamEvent = preAction + 'selectTeam("' + submitId + '", "' + action + '", "' + ref + '", "' + resultref + '", "' + areaCombo + '");';
   eval(teamCombo + ".attribute('xforms-select') = '" + teamEvent + "'");
   eval(teamCombo + ".select(0)");
}

/* area event function을 등록 */
function makeAreaEvent(submitId, action, ref, resultref, areaCombo, branchCombo, preAction)
{
   var areaEvent = preAction + 'selectArea("' + submitId + '", "' + action + '", "' + ref + '", "' + resultref + '", "' + branchCombo + '");';
   eval(areaCombo + ".attribute('xforms-select') = '" + areaEvent + "'");
   eval(areaCombo + ".select(0)");
}