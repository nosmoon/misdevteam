//==================================================================================================
//기능 : 동적으로 submission을 생성하고 실행한다.
///--------------------------------------------------------------------------------------------------
//예제
//	send_submission(
//			"as_com_1300"
//		,	"/root/tempData/srch_dept_cd"
//		,	"/root/tempData/dataSet"
//		,	"/as/com/1300"
//		,	"urlencoded-post"
//		,	"application/x-www-form-urlencoded"
//	);
//==================================================================================================
function send_submission(p_submission_id,p_ref,p_resultref,p_action,p_method,p_mediatype) {
	//사용할 submission control을 동적 생성	
	if(!model.isChild(p_submission_id)) {
		//해당 submission이 생성되지 않았다면 새로 생성하고
		model.createChild("xforms:submission", "id:" + p_submission_id + "; ");
	}
	else {
		//이미 생성된 submission이라면 그대로 사용한다.
	}
	
	//submission 설정
	eval(p_submission_id).attribute("ref") = p_ref;
	eval(p_submission_id).attribute("resultref") = p_resultref;
	eval(p_submission_id).attribute("action") = p_action;
	eval(p_submission_id).attribute("method") = p_method;
	eval(p_submission_id).attribute("mediatype") = p_mediatype;
	
	//실행			
	model.send(p_submission_id);	
}

//==================================================================================================
//기능 : 조회할 공통코드의 입력값과 저장할 instance path를 전달받아 입력값을 설정 후 submisstion 수행
//--------------------------------------------------------------------------------------------------
//예제 : get_dept_nm("/root/resData/resForm/dept_nm", medi_cd.value)
//==================================================================================================
function get_dept_nm(dept_cd) {
  var submission_id = "as_com_1300";
	var method = "urlencoded-post";
	var mediatype = "application/x-www-form-urlencoded";	
  var action = "/as/com/1300";
  var ref = "/root/tempData/srch_dept_cd";  
  var resultref = "/root/tempData/dataSet";
					
	//기존에 보낼 데이터의 기본 위치에 해당하는 노드는 삭제한다.			
	model.removenode(ref);
	
	//데이터를 받을 인스턴스 노드 생성
	model.makeNode(resultref);
	
	//보낼 데이터에 값을 설정, 노드는 자동으로 생성
  model.makeValue(ref + "/" + "srch_dept_cd", dept_cd);

	//서비미션을 생성하고 실행한다.
	send_submission(submission_id, ref, resultref, action, method, mediatype);

	//보낼 때 사용한 인스턴스는 삭제
	model.removenode(ref);
}


/**
 * 콤보 박스에 전체(A), 선택(S), ""의 값을 넣는다.
 * parameter 
 *  - gubun : 전체(A), 선택(S), 공백("") -> value는 ""
 *  - source_ref : JSP에서 생성한 xPath
 *  - target_ref : 콤보셋에 생성할 xPath
 *  - item_nm : 콤보리스트 레코드명
 *  - ref_label : label명
 *  - ref_value : value명
 * ex) makeComboGubun("A", "/root/initData/comboSet/medi_cd", "item", "label", "value")
 */ 

function makeComboSet(gubun, source_ref, target_ref, ref_label, ref_value){
    //var tempNode = "/root/tempCombo";
    var desNode = target_ref + "/item";
    
    var label, value;
    
    //model.makeNode(tempNode);
    
    //원 데이타를 임시 노드에 옮긴다.
    //model.copyNode(tempNode, source_ref);
    
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
    model.removeNodeset(target_ref);
    model.makeNode(target_ref); 
    model.makeNode(desNode);
    
    model.makeNode(desNode + "/label");
    model.makeNode(desNode + "/value");
    
    model.setValue(desNode + "/label", label);
    model.setValue(desNode + "/value", value) ;
    
    //전체, 선택 다음 노드에 원자료를 셋팅한다.
    if ( instance1.selectSingleNode(source_ref) != null ) {
        var arr = instance1.selectSingleNode(source_ref); 
        var len = arr.length;

        if ( len > 0 ) {
            for ( var i = 1 ; i <= len ; i++ ) {
                model.makeNode(desNode + "[" + (i+1) + "]");
                model.makeNode(desNode + "[" + (i+1) + "]/label");
                model.makeNode(desNode + "[" + (i+1) + "]/value");
						    model.setValue(desNode + "[" + (i+1) + "]/label", model.getValue(source_ref + "[" + i + "]/" + ref_label));
						    model.setValue(desNode + "[" + (i+1) + "]/value", model.getValue(source_ref + "[" + i + "]/" + ref_value));
            }
        } else {
            model.makeNode(desNode + "[" + 2 + "]");
            model.makeNode(desNode + "[" + 2 + "]/label");
            model.makeNode(desNode + "[" + 2 + "]/value");
            model.setValue(desNode + "[" + 2 + "]/label", model.getValue(source_ref + "/" + ref_label));
            model.setValue(desNode + "[" + 2 + "]/value", model.getValue(source_ref + "/" + ref_value));
        }
    } 
    model.refresh();
    
}
