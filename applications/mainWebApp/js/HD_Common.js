//****************************�λ�������********************************************//
function setDeptCdCombo(comboId){//�μ�������üũ
	modelSendNoMake("hd_co_1000_s", "/hd/co/1000", "", "/root/tempData");
	model.copyNode("/root/initData/comboSet/combo200","/root/dataSet/dept_cd");
	model.removenode("/root/dataSet");
	comboId.refresh();
}	
function getApp_emp_no(_ref){//�μ���ȸ�� ������ ��������.
	//alert(model.getValue(_ref));
	modelSendNoMake("hd_com_5100_l", "/hd/com/5100", _ref, "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST/totalcnt");
	if(appCnt == "0"){
		alert("�ش�μ��� �����ڰ� �����ϴ�.");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();
	}else if(appCnt == "1") {
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		
		model.setValue( "/root/reqData/appData/app_emp_no", model.getValue("/root/dataSet/CURLIST/record/emp_no") );
		model.setValue( "/root/reqData/appData/app_emp_nm", model.getValue("/root/dataSet/CURLIST/record/nm_korn") );
		var posi_nm = model.getValue("/root/dataSet/CURLIST/record/posi_nm");
		var dty_nm = model.getValue("/root/dataSet/CURLIST/record/dty_nm");
		model.setValue("/root/reqData/appData/app_posi_dty",posi_nm+"/"+dty_nm);
		model.removenode("/root/dataSet");
		model.refresh();
	}else{
		alert("������ �ߺ�!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}
function getApp_emp_no_ready(){//session���� ������ ��������..
	modelSendNoMake("hd_com_5000_l", "/hd/com/5000", "", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("�ش�μ��� �����ڰ� �����ϴ�.");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();
	}else if(appCnt == "1") {
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		
		model.setValue( "/root/reqData/appData/app_emp_no", model.getValue("/root/dataSet/CURLIST1/record/emp_no") );
		model.setValue( "/root/reqData/appData/app_emp_nm", model.getValue("/root/dataSet/CURLIST1/record/nm_korn") );
		var posi_nm = model.getValue("/root/dataSet/CURLIST1/record/posi_nm");
		var dty_nm = model.getValue("/root/dataSet/CURLIST1/record/dty_nm");
		model.setValue("/root/reqData/appData/app_posi_dty",posi_nm+"/"+dty_nm);
		model.setValue("/root/reqData/appData/app_dept_cd",model.getValue("/root/dataSet/CURLIST2/record/dept_cd"));
		model.removenode("/root/dataSet");
		model.refresh();
	}else{
		alert("������ �ߺ�!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}
function getApp_emp_no_ready_vaca(){//session���� ������ ��������.._�ް���.......
	modelSendNoMake("hd_com_5002_l", "/hd/com/5002", "", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("�ش�μ��� �����ڰ� �����ϴ�.");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();
	}else if(appCnt == "1") {
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		
		model.setValue( "/root/reqData/appData/app_emp_no", model.getValue("/root/dataSet/CURLIST1/record/emp_no") );
		model.setValue( "/root/reqData/appData/app_emp_nm", model.getValue("/root/dataSet/CURLIST1/record/nm_korn") );
		var posi_nm = model.getValue("/root/dataSet/CURLIST1/record/posi_nm");
		var dty_nm = model.getValue("/root/dataSet/CURLIST1/record/dty_nm");
		model.setValue("/root/reqData/appData/app_posi_dty",posi_nm+"/"+dty_nm);
		model.setValue("/root/reqData/appData/app_dept_cd",model.getValue("/root/dataSet/CURLIST2/record/dept_cd"));
		model.removenode("/root/dataSet");
		model.refresh();
	}else{
		alert("������ �ߺ�!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}
function getApp_emp_no_getRef(_ref){//������� ������ ��������..
//	alert(_ref);
	modelSendNoMake("hd_com_5001_l", "/hd/com/5001", _ref, "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("�ش�μ��� �����ڰ� �����ϴ�.");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh(); 
	}else if(appCnt == "1") {
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		
		model.setValue( "/root/reqData/appData/app_emp_no", model.getValue("/root/dataSet/CURLIST1/record/emp_no") );
		model.setValue( "/root/reqData/appData/app_emp_nm", model.getValue("/root/dataSet/CURLIST1/record/nm_korn") );
		var posi_nm = model.getValue("/root/dataSet/CURLIST1/record/posi_nm");
		var dty_nm = model.getValue("/root/dataSet/CURLIST1/record/dty_nm");
		model.setValue("/root/reqData/appData/app_posi_dty",posi_nm+"/"+dty_nm);
		model.setValue("/root/reqData/appData/app_dept_cd",model.getValue("/root/dataSet/CURLIST2/record/dept_cd"));
		model.removenode("/root/dataSet");
		model.refresh();
	}else{
		alert("������ �ߺ�!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}


function getApp_emp_no_getRef2(_ref){//������� ������ ��������..(2018.07.20 �߰�  �����Ϻ��� ) 
//	alert(_ref);

	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",_ref);
	
	modelSendNoMake("hd_com_5004_l", "/hd/com/5004","/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
//	var pre_app_emp_no = model.getValue("/root/dataSet/ov_pre_app_emp_no");//���������� (��������� ��ư ���̱� ���� ) 

	if(appCnt == "0"){
		alert("�ش�μ��� �����ڰ� �����ϴ�.");
//		model.setValue("/root/reqData/popData/pre_app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh(); 
	}else if(appCnt == "1") {
//		model.setValue("/root/reqData/popData/pre_app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		
		model.setValue( "/root/reqData/appData/app_emp_no", model.getValue("/root/dataSet/CURLIST1/record/emp_no") );
		model.setValue( "/root/reqData/appData/app_emp_nm", model.getValue("/root/dataSet/CURLIST1/record/nm_korn") );
		var posi_nm = model.getValue("/root/dataSet/CURLIST1/record/posi_nm");
		var dty_nm = model.getValue("/root/dataSet/CURLIST1/record/dty_nm");
		model.setValue("/root/reqData/appData/app_posi_dty",posi_nm+"/"+dty_nm);
		model.setValue("/root/reqData/appData/app_dept_cd",model.getValue("/root/dataSet/CURLIST2/record/dept_cd"));
//		model.setValue("/root/reqData/popData/pre_app_emp_no",pre_app_emp_no);
		model.removenode("/root/dataSet");
		model.refresh();
	}else{
		alert("������ �ߺ�!!");
//		model.setValue("/root/reqData/popData/pre_app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}



function getApp_emp_no_getRef_preApp(_ref){//������� ������ ��������..(2018.07.20 �߰�  �����Ϻ��� ) 
//	alert(_ref);

	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",_ref);
	
	modelSendNoMake("hd_com_5004_l", "/hd/com/5004","/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	var pre_app_emp_no = model.getValue("/root/dataSet/ov_pre_app_emp_no");//���������� (��������� ��ư ���̱� ���� ) 

	if(appCnt == "0"){
		alert("�ش�μ��� �����ڰ� �����ϴ�.");
		model.setValue("/root/reqData/popData/pre_app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh(); 
	}else if(appCnt == "1") {
		model.setValue("/root/reqData/popData/pre_app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		
		model.setValue( "/root/reqData/appData/app_emp_no", model.getValue("/root/dataSet/CURLIST1/record/emp_no") );
		model.setValue( "/root/reqData/appData/app_emp_nm", model.getValue("/root/dataSet/CURLIST1/record/nm_korn") );
		var posi_nm = model.getValue("/root/dataSet/CURLIST1/record/posi_nm");
		var dty_nm = model.getValue("/root/dataSet/CURLIST1/record/dty_nm");
		model.setValue("/root/reqData/appData/app_posi_dty",posi_nm+"/"+dty_nm);
		model.setValue("/root/reqData/appData/app_dept_cd",model.getValue("/root/dataSet/CURLIST2/record/dept_cd"));
		model.setValue("/root/reqData/popData/pre_app_emp_no",pre_app_emp_no);
		model.removenode("/root/dataSet");
		model.refresh();
	}else{
		alert("������ �ߺ�!!");
		model.setValue("/root/reqData/popData/pre_app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}


function rtnApp_emp_no_getRef_vaca2(emp_no){//������� ������ ����_�����Ϻ���(������ ����� return ��) 
	model.removenode("/root/tempData");
	model.makeNode("/root/tempData");
	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",emp_no);
	modelSendNoMake("hd_com_5004_l", "/hd/com/5004", "/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("�ش�μ��� �����ڰ� �����ϴ�.");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		return "err1";
		model.refresh();	
	}else if(appCnt == "1") {
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		var tmp = model.getValue("/root/dataSet/CURLIST1/record/emp_no");
		model.removenode("/root/dataSet");
		model.refresh();	
		return tmp;
		
	}else{
		alert("������ �ߺ�!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		return "err1";
		model.refresh();	
	}
}


function rtnApp_emp_no_getRef(emp_no){//������� ������ ����
	model.removenode("/root/tempData");
	model.makeNode("/root/tempData");
	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",emp_no);
	modelSendNoMake("hd_com_5001_l", "/hd/com/5001", "/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("�ش�μ��� �����ڰ� �����ϴ�.");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		return "err1";
		model.refresh();	
	}else if(appCnt == "1") {
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		var tmp = model.getValue("/root/dataSet/CURLIST1/record/emp_no");
		model.removenode("/root/dataSet");
		model.refresh();	
		return tmp;
		
	}else{
		alert("������ �ߺ�!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		return "err1";
		model.refresh();	
	}
}
function rtnApp_emp_no_getRef_vaca(emp_no){//������� ������ ����_�ް���
	model.removenode("/root/tempData");
	model.makeNode("/root/tempData");
	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",emp_no);
	modelSendNoMake("hd_com_5003_l", "/hd/com/5003", "/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("�ش�μ��� �����ڰ� �����ϴ�.");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		return "err1";
		model.refresh();	
	}else if(appCnt == "1") {
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		var tmp = model.getValue("/root/dataSet/CURLIST1/record/emp_no");
		model.removenode("/root/dataSet");
		model.refresh();	
		return tmp;
		
	}else{
		alert("������ �ߺ�!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		return "err1";
		model.refresh();	
	}
}
function setResetRef(){
	model.removenode("/root/reqData/appData");
	model.makeNode("/root/reqData/appData");
	model.makeNode("/root/reqData/appData/app_emp_no");//������
	model.makeNode("/root/reqData/appData/app_dept_cd");//�����ںμ�
	model.makeNode("/root/reqData/appData/app_emp_nm");//�������̸�
	model.makeNode("/root/reqData/appData/app_proc_stat_clsf");//�������
	model.makeNode("/root/reqData/appData/app_occr_dt");//�۾���
	model.makeNode("/root/reqData/appData/app_posi_dty");//����+��å
	
	model.makeNode("/root/initData/comboSet/combo200");//�μ�������
}
function setApp_occr_dt(_ref, _id, _ymd){//Ÿ��_ref�� �ڵ����� ���� ymd:�����, ym:���, y:��, d:��
	model.setValue( _ref, commCurDate(_ymd));
	_id.refresh();
}
function setEmp_no_tm(emp_no){//������ emp_no�� ���������������..>> ������ ������ �� ���
	if(emp_no==""){
		alert("��������� �����ϴ�!");
		return;
	}
	model.removenode("/root/tempData");
	model.makeNode("/root/tempData");
	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",emp_no);
	modelSendNoMake("hd_com_5200_l", "/hd/com/5200", "/root/tempData/emp_no", "/root/tempData");
	
	model.setValue("/root/reqData/appData/app_emp_no","");
	model.setValue("/root/reqData/appData/app_emp_nm","");
	model.setValue("/root/reqData/appData/app_posi_dty","");
	
	model.setValue( "/root/reqData/appData/app_emp_no", model.getValue("/root/dataSet/CURLIST/record/emp_no") );
	model.setValue( "/root/reqData/appData/app_emp_nm", model.getValue("/root/dataSet/CURLIST/record/nm_korn") );
	var posi_nm = model.getValue("/root/dataSet/CURLIST/record/posi_nm");
	var dty_nm = model.getValue("/root/dataSet/CURLIST/record/dty_nm");
	model.setValue("/root/reqData/appData/app_posi_dty",posi_nm+"/"+dty_nm);
	
	model.setValue("/root/reqData/appData/app_dept_cd",model.getValue("/root/dataSet/CURLIST/record/dept_cd"));
	
	model.removenode("/root/dataSet");
	model.removenode("/root/tempData");
	model.refresh();
}
function getEmp_no_ss(emp_no){//������ emp_no�� ��������������� >>> ����**result ref ������..
	if(emp_no==""){
		alert("��������� �����ϴ�!");
		return;
	}
	model.removenode("/root/tempData");
	model.makeNode("/root/tempData");
	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",emp_no);
	modelSendNoMake("hd_com_5200_l", "/hd/com/5200", "/root/tempData/emp_no", "/root/tempData");

	model.removenode("/root/tempData");
	model.removenode("/root/dataSet");
}
function noticeEipSub(pgm_id, pgm_nm, pgm_url, job_clsf, annc_cont, annc_clsf){//ep��Ż ����...
	var app_emp_no = model1.getValue("/root/reqData/appData/app_emp_no"); //������
	
	model.removenode("/root/reqData/prsnData");
	model.makeNode("/root/reqData/prsnData/app_emp_no");
	model.makeNode("/root/reqData/prsnData/pgm_id");
	model.makeNode("/root/reqData/prsnData/pgm_nm");
	model.makeNode("/root/reqData/prsnData/pgm_url");
	model.makeNode("/root/reqData/prsnData/job_clsf");
	model.makeNode("/root/reqData/prsnData/annc_cont");
	model.makeNode("/root/reqData/prsnData/annc_clsf");

	model.setValue("/root/reqData/prsnData/app_emp_no",app_emp_no);
	model.setValue("/root/reqData/prsnData/pgm_id",pgm_id);
	model.setValue("/root/reqData/prsnData/pgm_nm",pgm_nm);
	model.setValue("/root/reqData/prsnData/pgm_url",pgm_url);
	model.setValue("/root/reqData/prsnData/job_clsf",job_clsf);
	model.setValue("/root/reqData/prsnData/annc_cont",annc_cont+" ����ٶ��ϴ�.");
	model.setValue("/root/reqData/prsnData/annc_clsf",annc_clsf);
	
	modelSendNoMake("hd_com_5300_i", "/hd/com/5300", "/root/reqData/prsnData", "/root/tempData");
	alert(annc_cont+" ������ ��û�Ͽ����ϴ�.");
	model.removenode("/root/dataSet");
}	
//****************************�λ������� ��****************************************//
//****************************�μ������������� ����(�μ������� �˻�)***************************************//
function src_dept_nm ( _ref_input_dept_nm , _req_node, _res_node, setDeptInfo){//�μ������� �˻��� _res�� �μ��ڵ� �� ���
	model1.setValue(_req_node,_ref_input_dept_nm);
	modelSendNoMake("hd_com_1110_l", "/hd/com/1110", _req_node, "/root/dataSet");
	var dept_cnt_chk = model1.getValue("/root/dataSet/result_data/dept_cnt");
	if(dept_cnt_chk == "0"){
		alert("��ȸ�μ��� �����ϴ�");
		model1.removenode("/root/dataSet");
		model1.setValue(_req_node,"");
		model1.setValue(_res_node,"");
		model1.refresh();
	}else if( dept_cnt_chk == "1" ){
		model1.setValue(_req_node, model1.getValue("/root/dataSet/result_data/dept_nm") );
		model1.setValue(_res_node, model1.getValue("/root/dataSet/result_data/dept_cd") );
		model1.removenode("/root/dataSet");
		model1.refresh();
	}else{//2���̻��϶� �˾�����
		model1.removenode("/root/dataSet");
		model.removeNodeset("/root/reqData/fwdData");  
		model.makeNode("/root/reqData/fwdData/func_nm");
		model.setValue("/root/reqData/fwdData/func_nm", setDeptInfo);
		model.makeNode("/root/reqData/fwdData/dept_nm");
		model.setValue("/root/reqData/fwdData/dept_nm", _ref_input_dept_nm);
		model.makeNode("/root/reqData/fwdData/dept_cd");
		model.setValue("/root/reqData/fwdData/dept_cd", "");
		window.load("/xrw/hd/com/HD_COM_1100.xrw","modal", "hd_com_1100", "align:center; caption:hidden;", "/root/reqData/fwdData", "/root/reqData/fwdData");
		model1.refresh();
	}
}
//****************************�μ������������� ��****************************************//