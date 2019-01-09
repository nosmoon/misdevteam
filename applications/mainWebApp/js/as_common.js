//==================================================================================================
//��� : �������� submission�� �����ϰ� �����Ѵ�.
///--------------------------------------------------------------------------------------------------
//����
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
	//����� submission control�� ���� ����	
	if(!model.isChild(p_submission_id)) {
		//�ش� submission�� �������� �ʾҴٸ� ���� �����ϰ�
		model.createChild("xforms:submission", "id:" + p_submission_id + "; ");
	}
	else {
		//�̹� ������ submission�̶�� �״�� ����Ѵ�.
	}
	
	//submission ����
	eval(p_submission_id).attribute("ref") = p_ref;
	eval(p_submission_id).attribute("resultref") = p_resultref;
	eval(p_submission_id).attribute("action") = p_action;
	eval(p_submission_id).attribute("method") = p_method;
	eval(p_submission_id).attribute("mediatype") = p_mediatype;
	
	//����			
	model.send(p_submission_id);	
}

//==================================================================================================
//��� : ��ȸ�� �����ڵ��� �Է°��� ������ instance path�� ���޹޾� �Է°��� ���� �� submisstion ����
//--------------------------------------------------------------------------------------------------
//���� : get_dept_nm("/root/resData/resForm/dept_nm", medi_cd.value)
//==================================================================================================
function get_dept_nm(dept_cd) {
  var submission_id = "as_com_1300";
	var method = "urlencoded-post";
	var mediatype = "application/x-www-form-urlencoded";	
  var action = "/as/com/1300";
  var ref = "/root/tempData/srch_dept_cd";  
  var resultref = "/root/tempData/dataSet";
					
	//������ ���� �������� �⺻ ��ġ�� �ش��ϴ� ���� �����Ѵ�.			
	model.removenode(ref);
	
	//�����͸� ���� �ν��Ͻ� ��� ����
	model.makeNode(resultref);
	
	//���� �����Ϳ� ���� ����, ���� �ڵ����� ����
  model.makeValue(ref + "/" + "srch_dept_cd", dept_cd);

	//����̼��� �����ϰ� �����Ѵ�.
	send_submission(submission_id, ref, resultref, action, method, mediatype);

	//���� �� ����� �ν��Ͻ��� ����
	model.removenode(ref);
}


/**
 * �޺� �ڽ��� ��ü(A), ����(S), ""�� ���� �ִ´�.
 * parameter 
 *  - gubun : ��ü(A), ����(S), ����("") -> value�� ""
 *  - source_ref : JSP���� ������ xPath
 *  - target_ref : �޺��¿� ������ xPath
 *  - item_nm : �޺�����Ʈ ���ڵ��
 *  - ref_label : label��
 *  - ref_value : value��
 * ex) makeComboGubun("A", "/root/initData/comboSet/medi_cd", "item", "label", "value")
 */ 

function makeComboSet(gubun, source_ref, target_ref, ref_label, ref_value){
    //var tempNode = "/root/tempCombo";
    var desNode = target_ref + "/item";
    
    var label, value;
    
    //model.makeNode(tempNode);
    
    //�� ����Ÿ�� �ӽ� ��忡 �ű��.
    //model.copyNode(tempNode, source_ref);
    
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
    model.removeNodeset(target_ref);
    model.makeNode(target_ref); 
    model.makeNode(desNode);
    
    model.makeNode(desNode + "/label");
    model.makeNode(desNode + "/value");
    
    model.setValue(desNode + "/label", label);
    model.setValue(desNode + "/value", value) ;
    
    //��ü, ���� ���� ��忡 ���ڷḦ �����Ѵ�.
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
