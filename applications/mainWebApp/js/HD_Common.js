//****************************인사결재공통********************************************//
function setDeptCdCombo(comboId){//부서별권한체크
	modelSendNoMake("hd_co_1000_s", "/hd/co/1000", "", "/root/tempData");
	model.copyNode("/root/initData/comboSet/combo200","/root/dataSet/dept_cd");
	model.removenode("/root/dataSet");
	comboId.refresh();
}	
function getApp_emp_no(_ref){//부서조회로 결재자 가꼬오기.
	//alert(model.getValue(_ref));
	modelSendNoMake("hd_com_5100_l", "/hd/com/5100", _ref, "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST/totalcnt");
	if(appCnt == "0"){
		alert("해당부서에 결재자가 없습니다.");
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
		alert("결재자 중복!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}
function getApp_emp_no_ready(){//session으로 결재자 가꼬오기..
	modelSendNoMake("hd_com_5000_l", "/hd/com/5000", "", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("해당부서에 결재자가 없습니다.");
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
		alert("결재자 중복!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}
function getApp_emp_no_ready_vaca(){//session으로 결재자 가꼬오기.._휴가만.......
	modelSendNoMake("hd_com_5002_l", "/hd/com/5002", "", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("해당부서에 결재자가 없습니다.");
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
		alert("결재자 중복!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}
function getApp_emp_no_getRef(_ref){//사번으로 결재자 가꼬오기..
//	alert(_ref);
	modelSendNoMake("hd_com_5001_l", "/hd/com/5001", _ref, "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("해당부서에 결재자가 없습니다.");
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
		alert("결재자 중복!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}


function getApp_emp_no_getRef2(_ref){//사번으로 결재자 가꼬오기..(2018.07.20 추가  조선일보용 ) 
//	alert(_ref);

	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",_ref);
	
	modelSendNoMake("hd_com_5004_l", "/hd/com/5004","/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
//	var pre_app_emp_no = model.getValue("/root/dataSet/ov_pre_app_emp_no");//기존결재자 (차기결재자 버튼 보이기 유무 ) 

	if(appCnt == "0"){
		alert("해당부서에 결재자가 없습니다.");
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
		alert("결재자 중복!!");
//		model.setValue("/root/reqData/popData/pre_app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}



function getApp_emp_no_getRef_preApp(_ref){//사번으로 결재자 가꼬오기..(2018.07.20 추가  조선일보용 ) 
//	alert(_ref);

	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",_ref);
	
	modelSendNoMake("hd_com_5004_l", "/hd/com/5004","/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	var pre_app_emp_no = model.getValue("/root/dataSet/ov_pre_app_emp_no");//기존결재자 (차기결재자 버튼 보이기 유무 ) 

	if(appCnt == "0"){
		alert("해당부서에 결재자가 없습니다.");
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
		alert("결재자 중복!!");
		model.setValue("/root/reqData/popData/pre_app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		model.removenode("/root/dataSet");
		model.refresh();	
	}
}


function rtnApp_emp_no_getRef_vaca2(emp_no){//사번으로 결재자 리턴_조선일보용(결재자 사번만 return 함) 
	model.removenode("/root/tempData");
	model.makeNode("/root/tempData");
	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",emp_no);
	modelSendNoMake("hd_com_5004_l", "/hd/com/5004", "/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("해당부서에 결재자가 없습니다.");
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
		alert("결재자 중복!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		return "err1";
		model.refresh();	
	}
}


function rtnApp_emp_no_getRef(emp_no){//사번으로 결재자 리턴
	model.removenode("/root/tempData");
	model.makeNode("/root/tempData");
	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",emp_no);
	modelSendNoMake("hd_com_5001_l", "/hd/com/5001", "/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("해당부서에 결재자가 없습니다.");
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
		alert("결재자 중복!!");
		model.setValue("/root/reqData/appData/app_emp_no","");
		model.setValue("/root/reqData/appData/app_emp_nm","");
		model.setValue("/root/reqData/appData/app_posi_dty","");
		return "err1";
		model.refresh();	
	}
}
function rtnApp_emp_no_getRef_vaca(emp_no){//사번으로 결재자 리턴_휴가용
	model.removenode("/root/tempData");
	model.makeNode("/root/tempData");
	model.makeNode("/root/tempData/emp_no");
	model.setValue("/root/tempData/emp_no",emp_no);
	modelSendNoMake("hd_com_5003_l", "/hd/com/5003", "/root/tempData/emp_no", "/root/tempData");
	var appCnt = model.getValue("/root/dataSet/CURLIST1/totalcnt");
	if(appCnt == "0"){
		alert("해당부서에 결재자가 없습니다.");
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
		alert("결재자 중복!!");
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
	model.makeNode("/root/reqData/appData/app_emp_no");//결재자
	model.makeNode("/root/reqData/appData/app_dept_cd");//결재자부서
	model.makeNode("/root/reqData/appData/app_emp_nm");//결재자이름
	model.makeNode("/root/reqData/appData/app_proc_stat_clsf");//진행상태
	model.makeNode("/root/reqData/appData/app_occr_dt");//작업일
	model.makeNode("/root/reqData/appData/app_posi_dty");//직급+직책
	
	model.makeNode("/root/initData/comboSet/combo200");//부서별권한
}
function setApp_occr_dt(_ref, _id, _ymd){//타겟_ref에 자동으로 셋팅 ymd:년월일, ym:년월, y:년, d:일
	model.setValue( _ref, commCurDate(_ymd));
	_id.refresh();
}
function setEmp_no_tm(emp_no){//유일한 emp_no로 사원정보가꼬오기..>> 결재자 셋팅할 때 사용
	if(emp_no==""){
		alert("사원정보가 없습니다!");
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
function getEmp_no_ss(emp_no){//유일한 emp_no로 사원정보가꼬오기 >>> 주의**result ref 안지움..
	if(emp_no==""){
		alert("사원정보가 없습니다!");
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
function noticeEipSub(pgm_id, pgm_nm, pgm_url, job_clsf, annc_cont, annc_clsf){//ep포탈 공지...
	var app_emp_no = model1.getValue("/root/reqData/appData/app_emp_no"); //결재자
	
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
	model.setValue("/root/reqData/prsnData/annc_cont",annc_cont+" 결재바랍니다.");
	model.setValue("/root/reqData/prsnData/annc_clsf",annc_clsf);
	
	modelSendNoMake("hd_com_5300_i", "/hd/com/5300", "/root/reqData/prsnData", "/root/tempData");
	alert(annc_cont+" 승인을 요청하였습니다.");
	model.removenode("/root/dataSet");
}	
//****************************인사결재공통 끝****************************************//
//****************************부서정보가꼬오기 시작(부서명으로 검색)***************************************//
function src_dept_nm ( _ref_input_dept_nm , _req_node, _res_node, setDeptInfo){//부서명으로 검색시 _res는 부서코드 들어갈 경로
	model1.setValue(_req_node,_ref_input_dept_nm);
	modelSendNoMake("hd_com_1110_l", "/hd/com/1110", _req_node, "/root/dataSet");
	var dept_cnt_chk = model1.getValue("/root/dataSet/result_data/dept_cnt");
	if(dept_cnt_chk == "0"){
		alert("조회부서가 없습니다");
		model1.removenode("/root/dataSet");
		model1.setValue(_req_node,"");
		model1.setValue(_res_node,"");
		model1.refresh();
	}else if( dept_cnt_chk == "1" ){
		model1.setValue(_req_node, model1.getValue("/root/dataSet/result_data/dept_nm") );
		model1.setValue(_res_node, model1.getValue("/root/dataSet/result_data/dept_cd") );
		model1.removenode("/root/dataSet");
		model1.refresh();
	}else{//2건이상일때 팝업띄우기
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
//****************************부서정보가꼬오기 끝****************************************//