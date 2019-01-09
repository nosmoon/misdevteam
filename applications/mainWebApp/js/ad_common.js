var KEY_MEDI_CD 	= "001";
var KEY_PROC_DT 	= "002";
var KEY_PROC_SEQ    = "003";
var KEY_DLCO_NO     = "004";
var KEY_AGN         = "005";
var KEY_ISSU_DT		= "007";
var KEY_PROF_TYPE_CD = "008";
var KEY_SLIP_CLSF_CD = "009";
var KEY_SLIP_OCCR_DT = "010";	
var KEY_SLIP_SEQ     = "011";	
var KEY_DLCO_CLSF_CD = "012";
var KEY_SLIP_CLSF 	= "013";
var KEY_OCCR_DT 	= "014";	
var KEY_SEQ     	= "015";	
var KEY_DLCO_NM    	= "016";
//�ν�ä�Ǻ��� ������ȣ	
var KEY_REPT_NO     = "017";
//�ŷ�ó�ι����� Ű
var KEY_MEDI_CLSF	= "018";
//���系����ȸ Ű
//var KEY_MEDI_CD	= "001"; 	USING
var KEY_FRDT		= "019";
var KEY_TODT		= "020";
var KEY_GRP_CD		= "021";
var KEY_INDT_CD_1	= "022";
var KEY_INDT_CD_2	= "023";
var KEY_TYPE_CD_1	= "024";
var KEY_TYPE_CD_2	= "025";
//var KEY_DLCO_CLSF_CD = "012"; USING
//var KEY_DLCO_NO     = "004"; 	USING
//var KEY_DLCO_NM    	= "016";USING
var KEY_SLCRG_PERS	= "026";
var KEY_SLCRG_PERS_NM	= "027";
var KEY_MCHRG_PERS	= "028";
var KEY_MCHRG_PERS_NM	= "029";
var KEY_LINE_ADVT	= "030";
var KEY_SPON_ADVT	= "031";
var KEY_SELF_ADVT	= "032";

// ���ڼ��ݰ�꼭 ���ε� �߰�
var KEY_SUPLY_AMT		= "033";
var KEY_VAT_AMT			= "034";
var KEY_ELEC_TAX_COMP_CD= "035";
var KEY_APPROVE_ID		= "036";
var KEY_EMAIL			= "037";
var KEY_MAKE_DT			= "038";
// ���ڼ��ݰ�꼭 ���ε� �߰�. ��.



var KEY_MAKE_ASK_REG_DT = "039";
var KEY_MAKE_ASK_REG_SEQ = "040";
var KEY_DLCO_CLSF = "041"; 
var KEY_DLCO_CD = "042"; 
var KEY_DLCO_SEQ = "043";
var KEY_FR_DT = "044";
var KEY_TO_DT = "045";
var KEY_DEPT_CD = "046";
var KEY_SUB_DEPT_CD = "047";
var KEY_SALE_CLSF = "048";
var KEY_ACWR_REG_DT = "049";
var KEY_ACWR_REG_SEQ = "050";


var INSERT_MODE		= "I";
var UPDATE_MODE		= "U";
var QUERY_MODE		= "Q";

var TOTAL_STYLE = "background-color:#DDDDDD;font-weight:bold;";
//var _root		= "http://220.73.135.221:9020";//���߼���
//var _root		= "http://localhost:7001";//���ü���
var _root		= "http://ciis.chosun.com";//�����

var	P_BGCOLOR	=	"#D9D9FF";
var M_BGCOLOR	=	"#FFCACA";
var	YY_BGCOLOR	=	"#F5ECFF";
var	YN_BGCOLOR	=	"#EEEEEE";


//EX:setDlcoNoByNameFromGrid(model.getValue("/root/resData/gridData/record["+datagrid1.selectedRow(0)+"]/dlco_nm"),"/root/resData/gridData/record["+datagrid1.selectedRow(0)+"]/dlco_no","/root/resData/gridData/record["+datagrid1.selectedRow(0)+"]/dlco_nm");
function setDlcoNoByNameFromGrid(datagrid, dlco_nm, dlco_no_ref, dlco_nm_ref){
					
	if(trim(dlco_nm) == "") return;
									
									
	if(instance1.selectSingleNode("/root/reqData/searchData/srch_dlco_nm") == null){
		model.makeNode("/root/reqData/searchData/srch_dlco_nm");
	}
	model.setValue("/root/reqData/searchData/srch_dlco_nm", dlco_nm);
	modelSendNoMake("ad_co_9002_s", "/ad/common/9002", "/root/reqData/searchData", "/root/tempData");				


	var chk_cnt = model.getValue("/root/tempData/chk_cnt");
	var dlco_no = model.getValue("/root/tempData/dlco_no");

	if(chk_cnt == 0){
		alert("�ش� �ŷ�ó�� �����ϴ�.");
		model.setValue(dlco_no_ref, "");	
		model.setValue(dlco_nm_ref, "");									
	}
	
	if(chk_cnt == 1){
		model.setValue(dlco_no_ref,dlco_no);
		model.setValue(dlco_nm_ref,dlco_nm);
		datagrid.addStatus(datagrid.row, "update");
	}

	if(chk_cnt > 1) {
		model.removeChild("/root/reqData/fwdData");
		model.makeNode("/root/reqData/fwdData/agn_yn");
		model.setValue("/root/reqData/fwdData/agn_yn", "Y");
		model.makeNode("/root/reqData/fwdData/dlco_nm");
		model.setValue("/root/reqData/fwdData/dlco_nm", dlco_nm);
												
		window.load("/xrw/ad/co/AD_CO_1200.xrw"
					, "modal"
					, ""
					, "align:center; left:100; top:100; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;"
					,"/root/reqData/fwdData"
					,"/root/reqData/fwdData"
		);																					
	}
	datagrid.refresh();
}				

function setDlcoNoByNameWithClsfFromGrid(datagrid, dlco_nm, dlco_no_ref, dlco_nm_ref,dlco_clsf){
					
	if(trim(dlco_nm) == "") return;
									
									
	if(instance1.selectSingleNode("/root/reqData/searchData/srch_dlco_nm") == null){
		model.makeNode("/root/reqData/searchData/srch_dlco_nm");
	}
	if(instance1.selectSingleNode("/root/reqData/searchData/dlco_clsf") == null){
		model.makeNode("/root/reqData/searchData/dlco_clsf");
	}
	model.setValue("/root/reqData/searchData/srch_dlco_nm", dlco_nm);
	model.setValue("/root/reqData/searchData/dlco_clsf", dlco_clsf);
	modelSendNoMake("ad_co_9002_s", "/ad/common/9002", "/root/reqData/searchData", "/root/tempData");				


	var chk_cnt = model.getValue("/root/tempData/chk_cnt");
	var dlco_no = model.getValue("/root/tempData/dlco_no");

	if(chk_cnt == 0){
		alert("�ش� �ŷ�ó�� �����ϴ�.");	
		model.setValue(dlco_no_ref,"");
		model.setValue(dlco_nm_ref,"");						
	}
	
	if(chk_cnt == 1){
		model.setValue(dlco_no_ref,dlco_no);
		model.setValue(dlco_nm_ref,dlco_nm);
		datagrid.addStatus(datagrid.row, "update");
	}

	if(chk_cnt > 1) {
		model.removeChild("/root/reqData/fwdData");
		if(dlco_clsf == '1'){
			model.makeNode("/root/reqData/fwdData/gnr_advcs_yn");
			model.setValue("/root/reqData/fwdData/gnr_advcs_yn", "Y");							
			model.makeNode("/root/reqData/fwdData/arow_advcs_yn");
			model.setValue("/root/reqData/fwdData/arow_advcs_yn", "Y");								
		}else if(dlco_clsf ==  '2'){
			model.makeNode("/root/reqData/fwdData/agn_yn");
			model.setValue("/root/reqData/fwdData/agn_yn", "Y");																				
		}else if(dlco_clsf == '4' ){
			model.makeNode("/root/reqData/fwdData/advt_bo_yn");
			model.setValue("/root/reqData/fwdData/advt_bo_yn", "Y");								
		}else if(dlco_clsf == '5'){
			model.makeNode("/root/reqData/fwdData/bo_bof_yn");
			model.setValue("/root/reqData/fwdData/bo_bof_yn", "Y");									
		}
		model.makeNode("/root/reqData/fwdData/dlco_nm");
		model.setValue("/root/reqData/fwdData/dlco_nm", dlco_nm);
												
		window.load("/xrw/ad/co/AD_CO_1200.xrw"
					, "modal"
					, ""
					, "align:center; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;"
					,"/root/reqData/fwdData"
					,"/root/reqData/fwdData"
		);																					
	}
	datagrid.refresh();
}				

function setDlcoNoByName(dlco_nm, inp_dlco_no, inp_dlco_nm){
					
	if(trim(dlco_nm) == "") return;
									
									
	if(instance1.selectSingleNode("/root/reqData/searchData/srch_dlco_nm") == null){
		model.makeNode("/root/reqData/searchData/srch_dlco_nm");
	}
	model.setValue("/root/reqData/searchData/srch_dlco_nm", dlco_nm);

	modelSendNoMake("ad_co_9002_s", "/ad/common/9002", "/root/reqData/searchData", "/root/tempData");				


	var chk_cnt = model.getValue("/root/tempData/chk_cnt");
	var dlco_no = model.getValue("/root/tempData/dlco_no");
	
	if(chk_cnt == 0){
		alert("�ش� �ŷ�ó�� �����ϴ�.");							
	}
	
	if(chk_cnt == 1){
		model.setValue(inp_dlco_no.attribute("ref"), model.getValue("/root/tempData/dlco_no"));
		model.setValue(inp_dlco_nm.attribute("ref"), model.getValue("/root/tempData/dlco_nm"));					
		inp_dlco_no.refresh();
		inp_dlco_nm.refresh();	
	}

	if(chk_cnt > 1) {
		model.makeNode("/root/reqData/fwdData/agn_yn");
		model.setValue("/root/reqData/fwdData/agn_yn", "Y");
		model.makeNode("/root/reqData/fwdData/dlco_nm");
		model.setValue("/root/reqData/fwdData/dlco_nm", dlco_nm);
						
		window.load("/xrw/ad/co/AD_CO_1200.xrw"
					, "modal"
					, ""
					, "align:center; left:100; top:100; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:visible;"
					,"/root/reqData/fwdData"
					,"/root/reqData/fwdData"
		);																					
	}
}

		
function setDlcoNoByNameWithHndlClsf(dlco_nm, inp_dlco_no, inp_dlco_nm, hndl_clsf){
					
	if(trim(dlco_nm) == "") return;
									
									
	if(instance1.selectSingleNode("/root/reqData/searchData/srch_dlco_nm") == null){
		model.makeNode("/root/reqData/searchData/srch_dlco_nm");
	}
	model.setValue("/root/reqData/searchData/srch_dlco_nm", dlco_nm);

	modelSendNoMake("ad_co_9002_s", "/ad/common/9002", "/root/reqData/searchData", "/root/tempData");				


	var chk_cnt = model.getValue("/root/tempData/chk_cnt");
	var dlco_no = model.getValue("/root/tempData/dlco_no");
	
	if(chk_cnt == 0){
		alert("�ش� �ŷ�ó�� �����ϴ�.");							
	}
	
	if(chk_cnt == 1){
		model.setValue(inp_dlco_no.attribute("ref"), model.getValue("/root/tempData/dlco_no"));
		model.setValue(inp_dlco_nm.attribute("ref"), model.getValue("/root/tempData/dlco_nm"));					
		inp_dlco_no.refresh();
		inp_dlco_nm.refresh();	
	}

	if(chk_cnt > 1) {
		
		model.removeChild("/root/reqData/fwdData");
		
		model.makeNode("/root/reqData/fwdData/gnr_advcs_yn");
		model.setValue("/root/reqData/fwdData/gnr_advcs_yn", "");
		model.makeNode("/root/reqData/fwdData/arow_advcs_yn");
		model.setValue("/root/reqData/fwdData/arow_advcs_yn", "");
		model.makeNode("/root/reqData/fwdData/agn_yn");
		model.setValue("/root/reqData/fwdData/agn_yn", "");
		model.makeNode("/root/reqData/fwdData/advt_bo_yn");
		model.setValue("/root/reqData/fwdData/advt_bo_yn", "");
		model.makeNode("/root/reqData/fwdData/bo_bof_yn");
		model.setValue("/root/reqData/fwdData/bo_bof_yn", "");
			
		if(hndl_clsf == "1"){
			model.setValue("/root/reqData/fwdData/gnr_advcs_yn", "Y");
			model.setValue("/root/reqData/fwdData/arow_advcs_yn", "Y");
		}else if(hndl_clsf == "2"){
			model.setValue("/root/reqData/fwdData/agn_yn", "Y");
		}else if(hndl_clsf == "4"){
			model.setValue("/root/reqData/fwdData/advt_bo_yn", "Y");
		}else if(hndl_clsf == "5"){	
			model.setValue("/root/reqData/fwdData/bo_bof_yn", "Y");
		}
				
		model.makeNode("/root/reqData/fwdData/dlco_nm");
		model.setValue("/root/reqData/fwdData/dlco_nm", dlco_nm);
						
		window.load("/xrw/ad/co/AD_CO_1200.xrw"
					, "modal"
					, ""
					, "align:center; left:100; top:100; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:visible;"
					,"/root/reqData/fwdData"
					,"/root/reqData/fwdData"
		);																					
	}
}

function setDlcoNmByRef(dlco_no, dlco_no_ref, dlco_nm_ref){
					
	if(trim(dlco_no) == "") return;
									
	if(instance1.selectSingleNode("/root/reqData/searchData/srch_dlco_no") == null){
		model.makeNode("/root/reqData/searchData/srch_dlco_no");
	}
	model.setValue("/root/reqData/searchData/srch_dlco_no", dlco_no);

	modelSendNoMake("ad_co_9004_s", "/ad/common/9004", "/root/reqData/searchData", "/root/tempData");				

	model.setValue(dlco_no_ref, model.getValue("/root/tempData/dlco_no"));
	model.setValue(dlco_nm_ref, model.getValue("/root/tempData/dlco_nm"));	
								
}

			
function setDlcoNoByRef(dlco_nm, dlco_no_ref, dlco_nm_ref){
					
	if(trim(dlco_nm) == "") return;
									
	if(instance1.selectSingleNode("/root/reqData/searchData/srch_dlco_nm") == null){
		model.makeNode("/root/reqData/searchData/srch_dlco_nm");
	}
	model.setValue("/root/reqData/searchData/srch_dlco_nm", dlco_nm);

	modelSendNoMake("ad_co_9002_s", "/ad/common/9002", "/root/reqData/searchData", "/root/tempData");				


	var chk_cnt = model.getValue("/root/tempData/chk_cnt");
	var dlco_no = model.getValue("/root/tempData/dlco_no");
	
	if(chk_cnt == 0){
		alert("�ش� �ŷ�ó�� �����ϴ�.");							
	}
	
	if(chk_cnt == 1){
		model.setValue(dlco_no_ref, model.getValue("/root/tempData/dlco_no"));
		model.setValue(dlco_nm_ref, model.getValue("/root/tempData/dlco_nm"));					
	}

	if(chk_cnt > 1) {
		model.makeNode("/root/reqData/fwdData/agn_yn");
		model.setValue("/root/reqData/fwdData/agn_yn", "Y");
		model.makeNode("/root/reqData/fwdData/dlco_nm");
		model.setValue("/root/reqData/fwdData/dlco_nm", dlco_nm);
						
		window.load("/xrw/ad/co/AD_CO_1200.xrw"
					, "modal"
					, ""
					, "align:center; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;"
					,"/root/reqData/fwdData"
					,"/root/reqData/fwdData"
		);																					
	}
}
/*
	�Ź����������ǥ�Է� ȭ�� �˾����� ����
*/
function windowLoadPubc(pubc_slip_no){

	var  medi_cd  = pubc_slip_no.substr(0,3);
	var  pubc_dt  = pubc_slip_no.substr(3,8);
	var  pubc_seq = pubc_slip_no.substr(11);
						
	if( medi_cd == "" && pubc_dt == "" && pubc_seq == ""){
		return;	
	}	
	
	model.property(KEY_MEDI_CD)  = medi_cd;
	model.property(KEY_PROC_DT)  = pubc_dt;
	model.property(KEY_PROC_SEQ) = pubc_seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPopupPage("AD_PUB_1000");
    
}
/*
	�Ź����������ǥ�Է� MDIȭ�� ���� ����
*/
function windowLoadPubc2(pubc_slip_no){

	var  medi_cd  = pubc_slip_no.substr(0,3);
	var  pubc_dt  = pubc_slip_no.substr(3,8);
	var  pubc_seq = pubc_slip_no.substr(11);
						
	if( medi_cd == "" && pubc_dt == "" && pubc_seq == ""){
		return;	
	}	
	
	model.property(KEY_MEDI_CD)  = medi_cd;
	model.property(KEY_PROC_DT)  = pubc_dt;
	model.property(KEY_PROC_SEQ) = pubc_seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPage2("AD_PUB_1000");
    
}

/*
	���������� ���� �����Է� MDIȭ�� ���� ����
*/
function windowLoadPreng2(medi_cd,preng_dt,preng_seq){

	if( medi_cd == "" && preng_dt == "" && preng_seq == ""){
		return;	
	}	

	model.property(KEY_MEDI_CD)  = medi_cd;
	model.property(KEY_PROC_DT)  = preng_dt;
	model.property(KEY_PROC_SEQ) = preng_seq;	

    viewer("mainFrame").window.javaScript.onLoadPage2("AD_RES_2100");
    
}
/*
	���Ǳ��������ǥ�Է� ȭ�� �˾����� ����
*/
function windowLoadPublPubc(pubc_slip_no){

	var  medi_cd  = pubc_slip_no.substr(0,3);
	var  pubc_dt  = pubc_slip_no.substr(3,8);
	var  pubc_seq = pubc_slip_no.substr(11);
						
	if( medi_cd == "" && pubc_dt == "" && pubc_seq == ""){
		return;	
	}	
	
	model.property(KEY_MEDI_CD)  = medi_cd;
	model.property(KEY_PROC_DT)  = pubc_dt;
	model.property(KEY_PROC_SEQ) = pubc_seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPopupPage("AD_PUB_1600");
    
}
/*
	���Ǳ��������ǥ�Է� MDIȭ�� ���� ����
*/
function windowLoadPublPubc2(pubc_slip_no){

	var  medi_cd  = pubc_slip_no.substr(0,3);
	var  pubc_dt  = pubc_slip_no.substr(3,8);
	var  pubc_seq = pubc_slip_no.substr(11);
						
	if( medi_cd == "" && pubc_dt == "" && pubc_seq == ""){
		return;	
	}	
	
	model.property(KEY_MEDI_CD)  = medi_cd;
	model.property(KEY_PROC_DT)  = pubc_dt;
	model.property(KEY_PROC_SEQ) = pubc_seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPage2("AD_PUB_1600");
    
}
/*
	�����Ա���ǥ�Է� ȭ�� �˾����� ����
*/
function windowLoadRcpm(rcpm_slip_no){

	var  occr_dt    = rcpm_slip_no.substr(0,8);
	var  slip_clsf  = rcpm_slip_no.substr(8,2);
	var  seq        = rcpm_slip_no.substr(10);
						
	if( occr_dt == "" && slip_clsf == "" && seq == ""){
		return;	
	}	
	
	model.property(KEY_OCCR_DT)    = occr_dt;
	model.property(KEY_SLIP_CLSF)  = slip_clsf;
	model.property(KEY_SEQ) 	   = seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPopupPage("AD_DEP_1000");
    
}

/*
	�����Ա���ǥ�Է� ȭ�� MDI���� ����
*/
function windowLoadPageRcpm(rcpm_slip_no){

	var  occr_dt    = rcpm_slip_no.substr(0,8);
	var  slip_clsf  = rcpm_slip_no.substr(8,2);
	var  seq        = rcpm_slip_no.substr(10);
						
	if( occr_dt == "" && slip_clsf == "" && seq == ""){
		return;	
	}	
	
	if(slip_clsf != "17" && slip_clsf != "27" && slip_clsf != "24" && slip_clsf != "19") return;
	
	model.property(KEY_OCCR_DT)    = occr_dt;
	model.property(KEY_SLIP_CLSF)  = slip_clsf;
	model.property(KEY_SEQ) 	   = seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPage2("AD_DEP_1000");
    
}
function windowLoadPageRcpmchpn(rcpm_slip_no){

	var  occr_dt    = rcpm_slip_no.substr(0,8);
	var  slip_clsf  = rcpm_slip_no.substr(8,2);
	var  seq        = rcpm_slip_no.substr(10);
						
	if( occr_dt == "" && slip_clsf == "" && seq == ""){
		return;	
	}	
	
	if(slip_clsf != "24") return;
	
	model.property(KEY_OCCR_DT)    = occr_dt;
	model.property(KEY_SLIP_CLSF)  = slip_clsf;
	model.property(KEY_SEQ) 	   = seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPage2("AD_NMD_4100");
    
}
/*
	�����Ա���ǥ�Է� ȭ�� MDI���� ����
*/
function windowLoadPageRcpm2(rcpm_slip_no){

	var  occr_dt    = rcpm_slip_no.substr(0,8);
	var  slip_clsf  = rcpm_slip_no.substr(8,2);
	var  seq        = rcpm_slip_no.substr(10);
						
	if( occr_dt == "" && slip_clsf == "" && seq == ""){
		return;	
	}	
	
	if(slip_clsf != "17" && slip_clsf != "27") return;
	
	model.property(KEY_OCCR_DT)    = occr_dt;
	model.property(KEY_SLIP_CLSF)  = slip_clsf;
	model.property(KEY_SEQ) 	   = seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPage2("IS_DEP_1000");
    
}

/*
	SP�Ա���ǥ�Է� ȭ�� MDI���� ����
*/
function windowLoadPageRcpm3(rcpm_slip_no){

	var  occr_dt    = rcpm_slip_no.substr(0,8);
	var  slip_clsf  = rcpm_slip_no.substr(8,2);
	var  seq        = rcpm_slip_no.substr(10);
						
	if( occr_dt == "" && slip_clsf == "" && seq == ""){
		return;	
	}	
	
	if(slip_clsf != "17" && slip_clsf != "27") return;
	
	model.property(KEY_OCCR_DT)    = occr_dt;
	model.property(KEY_SLIP_CLSF)  = slip_clsf;
	model.property(KEY_SEQ) 	   = seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPage2("SP_DEP_1000");
    
}

/*
	���⼼�ݰ�꼭���� ȭ�� �˾����� ����
*/
function windowLoadTaxStmt(tax_slip_no, dlco_clsf_cd){

	var  prof_type_cd  = tax_slip_no.substr(0,2);
	var  slip_clsf_cd  = tax_slip_no.substr(2,2);
	var  slip_occr_dt  = tax_slip_no.substr(4,8);
	var  slip_seq      = tax_slip_no.substr(12);
	

	if( prof_type_cd == "" || slip_clsf_cd == "" ||  slip_occr_dt == "" || slip_seq == ""){
		return;	
	}	
	
	model.property(KEY_PROF_TYPE_CD)  = prof_type_cd;
	model.property(KEY_SLIP_CLSF_CD)  = slip_clsf_cd;
	model.property(KEY_SLIP_OCCR_DT)  = slip_occr_dt;	
	model.property(KEY_SLIP_SEQ)      = slip_seq;	
	model.property(KEY_DLCO_CLSF_CD)  = dlco_clsf_cd;	

    viewer("mainFrame").window.javaScript.onLoadPopupPage("AD_TAX_1000");
    
}

/*
	���⼼�ݰ�꼭���� MDIȭ������ ����
*/
function windowLoadPageTaxStmt(tax_slip_no, dlco_clsf_cd){

	var  prof_type_cd  = tax_slip_no.substr(0,2);
	var  slip_clsf_cd  = tax_slip_no.substr(2,2);
	var  slip_occr_dt  = tax_slip_no.substr(4,8);
	var  slip_seq      = tax_slip_no.substr(12);
	

	if( prof_type_cd == "" || slip_clsf_cd == "" ||  slip_occr_dt == "" || slip_seq == ""){
		return;	
	}	
	
	model.property(KEY_PROF_TYPE_CD)  = prof_type_cd;
	model.property(KEY_SLIP_CLSF_CD)  = slip_clsf_cd;
	model.property(KEY_SLIP_OCCR_DT)  = slip_occr_dt;	
	model.property(KEY_SLIP_SEQ)      = slip_seq;	
	model.property(KEY_DLCO_CLSF_CD)  = dlco_clsf_cd;	

    viewer("mainFrame").window.javaScript.onLoadPage2("AD_TAX_1000");
    
}
/*
	���Լ��ݰ�꼭���� ȭ�� �˾����� ����
*/
function windowLoadTaxStmt2(tax_slip_no){

	var  prof_type_cd  = tax_slip_no.substr(0,2);
	var  slip_clsf_cd  = tax_slip_no.substr(2,2);
	var  slip_occr_dt  = tax_slip_no.substr(4,8);
	var  slip_seq      = tax_slip_no.substr(12);
	

	if( prof_type_cd == "" || slip_clsf_cd == "" ||  slip_occr_dt == "" || slip_seq == ""){
		return;	
	}	
	
	model.property(KEY_PROF_TYPE_CD)  = prof_type_cd;
	model.property(KEY_SLIP_CLSF_CD)  = slip_clsf_cd;
	model.property(KEY_SLIP_OCCR_DT)  = slip_occr_dt;	
	model.property(KEY_SLIP_SEQ)      = slip_seq;		

    viewer("mainFrame").window.javaScript.onLoadPopupPage("AD_TAX_1100");
    
}

/*
	���Լ��ݰ�꼭���� MDIȭ������ ����
*/
function windowLoadPageTaxStmt2(tax_slip_no){

	var  prof_type_cd  = tax_slip_no.substr(0,2);
	var  slip_clsf_cd  = tax_slip_no.substr(2,2);
	var  slip_occr_dt  = tax_slip_no.substr(4,8);
	var  slip_seq      = tax_slip_no.substr(12);
	

	if( prof_type_cd == "" || slip_clsf_cd == "" ||  slip_occr_dt == "" || slip_seq == ""){
		return;	
	}	
	
	model.property(KEY_PROF_TYPE_CD)  = prof_type_cd;
	model.property(KEY_SLIP_CLSF_CD)  = slip_clsf_cd;
	model.property(KEY_SLIP_OCCR_DT)  = slip_occr_dt;	
	model.property(KEY_SLIP_SEQ)      = slip_seq;		

    viewer("mainFrame").window.javaScript.onLoadPage2("AD_TAX_1100");
    
}
/*
	���Լ��ݰ�꼭��賻��  ȭ�� �˾����� ����
*/
function windowLoadTaxStmtSetOff(tax_slip_no, dlco_no, dlco_nm){

	var  prof_type_cd  = tax_slip_no.substr(0,2);
	var  slip_clsf_cd  = tax_slip_no.substr(2,2);
	var  slip_occr_dt  = tax_slip_no.substr(4,8);
	var  slip_seq      = tax_slip_no.substr(12);
	

	if( prof_type_cd == "" || slip_clsf_cd == "" ||  slip_occr_dt == "" || slip_seq == ""){
		return;	
	}	
	
	model.property(KEY_PROF_TYPE_CD)  = prof_type_cd;
	model.property(KEY_SLIP_CLSF_CD)  = slip_clsf_cd;
	model.property(KEY_SLIP_OCCR_DT)  = slip_occr_dt;	
	model.property(KEY_SLIP_SEQ)      = slip_seq;		
	model.property(KEY_DLCO_NO)       = dlco_no;		
	model.property(KEY_DLCO_NM)       = dlco_nm;		

    viewer("mainFrame").window.javaScript.onLoadPopupPage("AD_TAX_1900");
    
}

/*
	���Լ��ݰ�꼭��賻��  ȭ�� �˾����� ����
*/
function windowLoadPageTaxStmtSetOff(tax_slip_no, dlco_no, dlco_nm){

	var  prof_type_cd  = tax_slip_no.substr(0,2);
	var  slip_clsf_cd  = tax_slip_no.substr(2,2);
	var  slip_occr_dt  = tax_slip_no.substr(4,8);
	var  slip_seq      = tax_slip_no.substr(12);
	

	if( prof_type_cd == "" || slip_clsf_cd == "" ||  slip_occr_dt == "" || slip_seq == ""){
		return;	
	}	
	
	model.property(KEY_PROF_TYPE_CD)  = prof_type_cd;
	model.property(KEY_SLIP_CLSF_CD)  = slip_clsf_cd;
	model.property(KEY_SLIP_OCCR_DT)  = slip_occr_dt;	
	model.property(KEY_SLIP_SEQ)      = slip_seq;		
	model.property(KEY_DLCO_NO)       = dlco_no;		
	model.property(KEY_DLCO_NM)       = dlco_nm;		

    viewer("mainFrame").window.javaScript.onLoadPage2("AD_TAX_1900");
    
}

/*
	�����ְ��� ȭ�� �˾����� ����
*/
function windowAdvcsInfo(dlco_no){
	if( dlco_no == ""){
		return;	
	}	
	model.property(KEY_DLCO_NO)  = dlco_no;	
    viewer("mainFrame").window.javaScript.onLoadPage2("AD_BAS_1000");
}
/*
	�������� ȭ�� �˾����� ����
*/
function windowAgnInfo(dlco_no){
	if( dlco_no == ""){
		return;	
	}	
	model.property(KEY_AGN)  = dlco_no;	
    viewer("mainFrame").window.javaScript.onLoadPage2("AD_BAS_1100");
}

function commonSubmission(action, srch_cd, ctrl_cd, ctrl_nm, job_clsf, cd_clsf){
	
	if(trim(srch_cd) == ""){
		model.setValue(ctrl_nm.attribute("ref"), "");
		ctrl_nm.refresh();
		return;
	}
	
	if(instance1.selectSingleNode("/root/reqData/searchData/srch_cd") == null){
		model.makeNode("/root/reqData/searchData/srch_cd");
	}	
	model.setValue("/root/reqData/searchData/srch_cd", srch_cd);
	
	if(instance1.selectSingleNode("/root/reqData/searchData/action") == null){
		model.makeNode("/root/reqData/searchData/action");
	}	
	model.setValue("/root/reqData/searchData/action", action);
	
	if(instance1.selectSingleNode("/root/reqData/searchData/job_clsf") == null){
		model.makeNode("/root/reqData/searchData/job_clsf");
	}	
	model.setValue("/root/reqData/searchData/job_clsf", job_clsf);
	
	if(instance1.selectSingleNode("/root/reqData/searchData/cd_clsf") == null){
		model.makeNode("/root/reqData/searchData/cd_clsf");
	}	
	model.setValue("/root/reqData/searchData/cd_clsf", cd_clsf);
	
	modelSendNoMake("ad_co_9000_s", "/ad/common/9000", "/root/reqData/searchData", "/root/tempData");
	
	model.setValue(ctrl_cd.attribute("ref"), model.getValue("/root/tempData/srch_cd"));
	model.setValue(ctrl_nm.attribute("ref"), model.getValue("/root/tempData/srch_nm"));
	ctrl_cd.refresh();
	ctrl_nm.refresh();
	
}

function commonSubmissionWithXRef(action, srch_cd, ctrl_cd_ref, ctrl_nm_ref){
	
	if(trim(srch_cd) == ""){
		model.setValue(ctrl_nm_ref, "");
		return;
	}
	
	if(instance1.selectSingleNode("/root/reqData/searchData/srch_cd") == null){
		model.makeNode("/root/reqData/searchData/srch_cd");
	}	
	model.setValue("/root/reqData/searchData/srch_cd", srch_cd);
	
	if(instance1.selectSingleNode("/root/reqData/searchData/action") == null){
		model.makeNode("/root/reqData/searchData/action");
	}	
	model.setValue("/root/reqData/searchData/action", action);
	
	modelSendNoMake("ad_co_9000_s", "/ad/common/9000", "/root/reqData/searchData", "/root/tempData");
	
	model.setValue(ctrl_cd_ref, model.getValue("/root/tempData/srch_cd"));
	model.setValue(ctrl_nm_ref, model.getValue("/root/tempData/srch_nm"));
	
}

function sendNoXPathSubmission(action, srch_cd, job_clsf, cd_clsf){
	
	if(trim(srch_cd) == "") return;
	
	if(instance1.selectSingleNode("/root/reqData/searchData/srch_cd") == null){
		model.makeNode("/root/reqData/searchData/srch_cd");
	}	
	model.setValue("/root/reqData/searchData/srch_cd", srch_cd);
	
	if(instance1.selectSingleNode("/root/reqData/searchData/action") == null){
		model.makeNode("/root/reqData/searchData/action");
	}	
	model.setValue("/root/reqData/searchData/action", action);
	
	if(instance1.selectSingleNode("/root/reqData/searchData/job_clsf") == null){
		model.makeNode("/root/reqData/searchData/job_clsf");
	}	
	model.setValue("/root/reqData/searchData/job_clsf", job_clsf);
	
	if(instance1.selectSingleNode("/root/reqData/searchData/cd_clsf") == null){
		model.makeNode("/root/reqData/searchData/cd_clsf");
	}	
	model.setValue("/root/reqData/searchData/cd_clsf", cd_clsf);
	
	modelSendNoMake("ad_co_9000_s", "/ad/common/9000", "/root/reqData/searchData", "/root/tempData");
	
}

/* ����� �̸����� ����ڻ�� ��ȸ�ϱ� */
function findEmpNoByName(fn_nm, srch_nm, ctrl_cd, ctrl_nm){
	
	if(trim(srch_nm) == ""){
		model.setValue(ctrl_cd.attribute("ref"), "");
		ctrl_cd.refresh();
		return;
	}
	
	makeNodeValue("/root/tempData/searchData/action", "9005");
	makeNodeValue("/root/tempData/searchData/srch_nm", srch_nm);
	
	modelSendNoMake("ad_co_9008_s", "/ad/common/9008", "/root/tempData/searchData", "/root/tempData/resData");
	
	var chk_cnt = Number(model.getValue("/root/tempData/resData/chk_cnt"));
	
	if(chk_cnt > 1){
		
		_emp_no_ref = ctrl_cd.attribute("ref");
		_emp_nm_ref = ctrl_nm.attribute("ref");
		
		makeNodeValue("/root/reqData/fwdData/func_nm", fn_nm);
		makeNodeValue("/root/reqData/fwdData/nm_korn", srch_nm);
		window.load("/xrw/hd/com/HD_COM_1000.xrw"
		          ,"modal"
		          ,"HD_COM_1000"
		          ,"align:center;caption:hidden;"
		          ,"/root/reqData/fwdData"
		          ,"/root/reqData/fwdData");
	          
	}else{
	
		model.setValue(ctrl_cd.attribute("ref"), model.getValue("/root/tempData/resData/srch_cd"));
		model.setValue(ctrl_nm.attribute("ref"), model.getValue("/root/tempData/resData/srch_nm"));
	
		ctrl_cd.refresh();
		ctrl_nm.refresh();
	}
}


/* ����� �̸����� �μ��ڵ� �μ��� ��ȸ�ϱ� */
function findDept(emp_no, dept_cd, dept_nm){
	
	if(trim(emp_no) == ""){
		return;
	}
	
	makeNodeValue("/root/tempData/searchData/emp_no", emp_no);
	modelSendNoMake("ad_co_9009_s", "/ad/common/9009", "/root/tempData/searchData", "/root/tempData/resData");	
	
	model.setValue(dept_cd.attribute("ref"), model.getValue("/root/tempData/resData/dept_cd"));
	model.setValue(dept_nm.attribute("ref"), model.getValue("/root/tempData/resData/dept_nm"));
	
	dept_nm.refresh();
	dept_cd.refresh();
	
}



/* ����� �̸����� ����ڻ�� ��ȸ�ϱ� */
function findEmpNoByNameWithRef(fn_nm, srch_nm, ctrl_cd_ref, ctrl_nm_ref){
	
	if(trim(srch_nm) == ""){
		model.setValue(ctrl_cd_ref, "");
		return;
	}
	model.setValue(ctrl_cd_ref, "");
	
	makeNodeValue("/root/tempData/searchData/action", "9005");
	makeNodeValue("/root/tempData/searchData/srch_nm", srch_nm);
	
	modelSendNoMake("ad_co_9008_s", "/ad/common/9008", "/root/tempData/searchData", "/root/tempData/resData");
	
	var chk_cnt = Number(model.getValue("/root/tempData/resData/chk_cnt"));
	
	if(chk_cnt > 1){
		
		_emp_no_ref = ctrl_cd_ref;
		_emp_nm_ref = ctrl_nm_ref;
		
		makeNodeValue("/root/reqData/fwdData/func_nm", fn_nm);
		makeNodeValue("/root/reqData/fwdData/nm_korn", srch_nm);
		window.load("/xrw/hd/com/HD_COM_1000.xrw"
		          ,"modal"
		          ,"HD_COM_1000"
		          ,"align:center;caption:hidden;"
		          ,"/root/reqData/fwdData"
		          ,"/root/reqData/fwdData");
	          
	}else{
		model.setValue(ctrl_cd_ref, model.getValue("/root/tempData/resData/srch_cd"));
		model.setValue(ctrl_nm_ref, model.getValue("/root/tempData/resData/srch_nm"));
	}
}

/* �ŷ�ó������  �ŷ�ó��ȣ ��ȸ�ϱ� */
function findDlcoNoByName(dlco_clsf, srch_nm, ctrl_cd, ctrl_nm){
	
	if(trim(srch_nm) == ""){
		model.setValue(ctrl_cd.attribute("ref"), "");
		ctrl_cd.refresh();
		return;
	}
	
	makeNodeValue("/root/tempData/searchData/action", "9004");
	makeNodeValue("/root/tempData/searchData/dlco_clsf", dlco_clsf);
	makeNodeValue("/root/tempData/searchData/srch_nm", srch_nm);
	
	modelSendNoMake("ad_co_9008_s", "/ad/common/9008", "/root/tempData/searchData", "/root/tempData/resData");
	
	var chk_cnt = Number(model.getValue("/root/tempData/resData/chk_cnt"));
	
	if(chk_cnt > 1){
		if(dlco_clsf == "1"){
			showAdvcsSearchPopup("Y", "Y", "", "", "", srch_nm); 
		}else if(dlco_clsf == "2"){
			showAdvcsSearchPopup("", "", "Y", "", "", srch_nm); 
		}else if(dlco_clsf == "4"){
			showAdvcsSearchPopup("", "", "", "Y", "Y", srch_nm); 
		}else if(dlco_clsf == "24"){
			showAdvcsSearchPopup("", "", "Y", "Y", "Y", srch_nm); 
		}else if(dlco_clsf == "124"){
			showAdvcsSearchPopup("Y", "Y", "Y", "Y", "", srch_nm); 
		}else{
			showAdvcsSearchPopup("Y", "Y", "Y", "Y", "Y", srch_nm); 
		}
	}else{	
		model.setValue(ctrl_cd.attribute("ref"), model.getValue("/root/tempData/resData/srch_cd"));
		model.setValue(ctrl_nm.attribute("ref"), model.getValue("/root/tempData/resData/srch_nm"));
	
		ctrl_cd.refresh();
		ctrl_nm.refresh();
	}
}

/* �ŷ�ó������  �ŷ�ó��ȣ ��ȸ�ϱ� */
function findDlcoNoByNameWithRef(dlco_clsf, srch_nm, ctrl_cd_ref, ctrl_nm_ref){
	
	if(trim(srch_nm) == ""){
		model.setValue(ctrl_cd_ref, "");
		return;
	}
	
	makeNodeValue("/root/tempData/searchData/action", "9004");
	makeNodeValue("/root/tempData/searchData/dlco_clsf", dlco_clsf);
	makeNodeValue("/root/tempData/searchData/srch_nm", srch_nm);
	
	modelSendNoMake("ad_co_9008_s", "/ad/common/9008", "/root/tempData/searchData", "/root/tempData/resData");
	
	var chk_cnt = Number(model.getValue("/root/tempData/resData/chk_cnt"));
	
	if(chk_cnt > 1){
		if(dlco_clsf == "1"){
			showAdvcsSearchPopup("Y", "Y", "", "", "", srch_nm); 
		}else if(dlco_clsf == "2"){
			showAdvcsSearchPopup("", "", "Y", "", "", srch_nm); 
		}else if(dlco_clsf == "4"){
			showAdvcsSearchPopup("", "", "", "Y", "Y", srch_nm); 
		}else if(dlco_clsf == "24"){
			showAdvcsSearchPopup("", "", "Y", "Y", "Y", srch_nm); 
		}else{
			showAdvcsSearchPopup("Y", "Y", "Y", "Y", "Y", srch_nm); 
		}
	}else{	
		var srch_cd = model.getValue("/root/tempData/resData/srch_cd");
		var srch_nm = model.getValue("/root/tempData/resData/srch_nm");
		if(srch_cd == ""){
			srch_nm = "";
		}
		model.setValue(ctrl_cd_ref, srch_cd);
		model.setValue(ctrl_nm_ref, srch_nm);	
	}
}


/* �ŷ�ó������  �ŷ�ó��ȣ ��ȸ�ϱ� */
function findDlcoNoByNameWithRef2(dlco_clsf, srch_nm, ctrl_cd_ref, ctrl_nm_ref, dlco_clsf_ref){
	
	if(trim(srch_nm) == ""){
		model.setValue(ctrl_cd_ref, "");
		return;
	}
	
	makeNodeValue("/root/tempData/searchData/action", "9004");
	makeNodeValue("/root/tempData/searchData/dlco_clsf", dlco_clsf);
	makeNodeValue("/root/tempData/searchData/srch_nm", srch_nm);
	
	modelSendNoMake("ad_co_9008_s", "/ad/common/9008", "/root/tempData/searchData", "/root/tempData/resData");
	
	var chk_cnt = Number(model.getValue("/root/tempData/resData/chk_cnt"));
	
	if(chk_cnt > 1){
		if(dlco_clsf == "1"){
			showAdvcsSearchPopup("Y", "Y", "", "", "", srch_nm); 
		}else if(dlco_clsf == "2"){
			showAdvcsSearchPopup("", "", "Y", "", "", srch_nm); 
		}else if(dlco_clsf == "4"){
			showAdvcsSearchPopup("", "", "", "Y", "Y", srch_nm); 
		}else if(dlco_clsf == "24"){
			showAdvcsSearchPopup("", "", "Y", "Y", "Y", srch_nm); 
		}else{
			showAdvcsSearchPopup("Y", "Y", "Y", "Y", "Y", srch_nm); 
		}
	}else{	
		model.setValue(ctrl_cd_ref, model.getValue("/root/tempData/resData/srch_cd"));
		model.setValue(ctrl_nm_ref, model.getValue("/root/tempData/resData/srch_nm"));	
		model.setValue(dlco_clsf_ref, model.getValue("/root/tempData/resData/dlco_clsf"));	
	}
}

/* �����̸�����  ���������ڵ� ��ȸ�ϱ� */
function findIndtClsfByName(srch_nm, ctrl_cd, ctrl_nm){
	
	if(trim(srch_nm) == ""){
		model.setValue(ctrl_cd.attribute("ref"), "");
		ctrl_cd.refresh();
		return;
	}
	
	makeNodeValue("/root/tempData/searchData/action", "9003");
	makeNodeValue("/root/tempData/searchData/srch_nm", srch_nm);
	
	modelSendNoMake("ad_co_9008_s", "/ad/common/9008", "/root/tempData/searchData", "/root/tempData/resData");
	
	var chk_cnt = Number(model.getValue("/root/tempData/resData/chk_cnt"));
	
	if(chk_cnt > 1){
		showIndtClsfPopup();
	}else{	
		model.setValue(ctrl_cd.attribute("ref"), model.getValue("/root/tempData/resData/srch_cd"));
		model.setValue(ctrl_nm.attribute("ref"), model.getValue("/root/tempData/resData/srch_nm"));
	
		ctrl_cd.refresh();
		ctrl_nm.refresh();
	}
}

/* �����̸����� ���������ڵ� ��ȸ�ϱ� */
function findTypeClsfByName(srch_nm, ctrl_cd, ctrl_nm){
	
	if(trim(srch_nm) == ""){
		model.setValue(ctrl_cd.attribute("ref"), "");
		ctrl_cd.refresh();
		return;
	}
	
	makeNodeValue("/root/tempData/searchData/action", "9002");
	makeNodeValue("/root/tempData/searchData/srch_nm", srch_nm);
	
	modelSendNoMake("ad_co_9008_s", "/ad/common/9008", "/root/tempData/searchData", "/root/tempData/resData");
	
	var chk_cnt = Number(model.getValue("/root/tempData/resData/chk_cnt"));
	
	if(chk_cnt > 1){
		showTypeClsfPopup();
	}else{	
		model.setValue(ctrl_cd.attribute("ref"), model.getValue("/root/tempData/resData/srch_cd"));
		model.setValue(ctrl_nm.attribute("ref"), model.getValue("/root/tempData/resData/srch_nm"));
	
		ctrl_cd.refresh();
		ctrl_nm.refresh();
	}
}


var _emp_no_ref;
var _emp_nm_ref;
var _dept_cd_ref;
var _dept_nm_ref;

function searchEmpno(fn_nm, emp_no_ref, emp_nm_ref){

	this._emp_no_ref = emp_no_ref;
	this._emp_nm_ref = emp_nm_ref;

	makeNodeValue("/root/reqData/fwdData/func_nm", fn_nm);
	
	window.load("/xrw/hd/com/HD_COM_1000.xrw"
	          ,"modal"
	          ,"HD_COM_1000"
	          ,"align:center;caption:hidden;"
	          ,"/root/reqData/fwdData"
	          ,"/root/reqData/fwdData");
	          	
}	

function searchEmpno2(fn_nm, emp_no_ref, emp_nm_ref, nm_korn){

	this._emp_no_ref = emp_no_ref;
	this._emp_nm_ref = emp_nm_ref;

	makeNodeValue("/root/reqData/fwdData/func_nm", fn_nm);
	makeNodeValue("/root/reqData/fwdData/nm_korn", nm_korn);
	
	window.load("/xrw/hd/com/HD_COM_1000.xrw"
	          ,"modal"
	          ,"HD_COM_1000"
	          ,"align:center;caption:hidden;"
	          ,"/root/reqData/fwdData"
	          ,"/root/reqData/fwdData");
	          	
}	

function searchDept(fn_nm, dept_cd_ref, dept_nm_ref){
	this._dept_cd_ref = dept_cd_ref;
	this._dept_nm_ref = dept_nm_ref;

	if(instance1.selectSingleNode("/root/reqData/fwdData/func_nm") == null){
		model.makeNode("/root/reqData/fwdData/func_nm");
	}

	model.setValue("/root/reqData/fwdData/func_nm", fn_nm);
	window.load("/xrw/hd/com/HD_COM_1100.xrw"
	          ,"modal"
	          ,"HD_COM_1000"
	          ,"align:center;"
	          ,"/root/reqData/fwdData"
	          ,"/root/reqData/fwdData");
	          	
}	
function setDept(dept_cd, dept_nm){
	model.setValue(_dept_cd_ref, dept_cd);
	model.setValue(_dept_nm_ref, dept_nm);				
	inp_dept_cd.refresh();
	inp_dept_nm.refresh();				
}
	
function setSlcrgPers(emp_no, emp_nm){
	model.setValue(_emp_no_ref, emp_no);
	model.setValue(_emp_nm_ref, emp_nm);				
	inp_slcrg_pers.refresh();
	inp_slcrg_pers_nm.refresh();				
}	
function setMchrgPers(emp_no, emp_nm){
	model.setValue(_emp_no_ref, emp_no);
	model.setValue(_emp_nm_ref, emp_nm);				
	inp_mchrg_pers.refresh();
	inp_mchrg_pers_nm.refresh();				
}
function setAsistPers(emp_no, emp_nm){
	model.setValue(_emp_no_ref, emp_no);
	model.setValue(_emp_nm_ref, emp_nm);				
	inp_asist_pers.refresh();
	inp_asist_pers_nm.refresh();				
}

function confirmTransaction(flag){
	var msg = "";
	if(flag == "I"){
		msg = "����Ͻðڽ��ϱ�?";
	}else if(flag == "U"){
		msg = "�����Ͻðڽ��ϱ�?";
	}else if(flag == "D"){
		msg = "�����Ͻðڽ��ϱ�?";
	}
	
	if(window.alert(msg, "Ȯ��", 1) == 1){
		return true;
	}else{
		return false;
	}		
}

/*
	������� �ŷ�ó�˻� �˾�
*/
function showAdvcsSearchPopup(gnr_advcs_yn, arow_advcs_yn, agn_yn, advt_bo_yn, bo_bof_yn, dlco_nm){

	model.removeNodeset("/root/reqData/fwdData");  
	model.makeNode("/root/reqData/fwdData/gnr_advcs_yn");
	model.makeNode("/root/reqData/fwdData/arow_advcs_yn");
	model.makeNode("/root/reqData/fwdData/agn_yn");
	model.makeNode("/root/reqData/fwdData/advt_bo_yn");
	model.makeNode("/root/reqData/fwdData/bo_bof_yn");
	model.makeNode("/root/reqData/fwdData/dlco_nm");
	
	if(gnr_advcs_yn == "Y"){
		model.setValue("/root/reqData/fwdData/gnr_advcs_yn", "Y");
	}
	if(arow_advcs_yn == "Y"){
		model.setValue("/root/reqData/fwdData/arow_advcs_yn", "Y");
	}
	if(agn_yn == "Y"){
		model.setValue("/root/reqData/fwdData/agn_yn", "Y");
	}
	if(advt_bo_yn == "Y"){
		model.setValue("/root/reqData/fwdData/advt_bo_yn", "Y");
	}
	if(bo_bof_yn == "Y"){
		model.setValue("/root/reqData/fwdData/bo_bof_yn", "Y");
	}
	if(dlco_nm != ""){
		model.setValue("/root/reqData/fwdData/dlco_nm", dlco_nm);
	}
					
	window.load("/xrw/ad/co/AD_CO_1200.xrw"
				, "modal"
				, ""
				, "align:center; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;"
				,"/root/reqData/fwdData"
				,"/root/reqData/fwdData"
	);
	
}

/*
	�ŷ�ó�ι����� �ι� �˾�
*/
function showCustomerSearchPopup(medi_clsf, dlco_no, dlco_nm, cust_seq, cust_name)
{
	model.removeNodeset("/root/reqData/fwdData");
	
	model.makeNode("/root/reqData/fwdData/medi_clsf");
	model.makeNode("/root/reqData/fwdData/dlco_no");
	model.makeNode("/root/reqData/fwdData/dlco_nm");
	model.makeNode("/root/reqData/fwdData/cust_seq");
	model.makeNode("/root/reqData/fwdData/cust_name");
	
	if( medi_clsf != "" )
	{
		model.setValue("/root/reqData/fwdData/medi_clsf", medi_clsf);
	}
	if( dlco_no != "" )
	{
		model.setValue("/root/reqData/fwdData/dlco_no"	, dlco_no);
	}
	if( dlco_nm != "" )
	{
		model.setValue("/root/reqData/fwdData/dlco_nm"	, dlco_nm);
	}
	if( cust_seq != "" )
	{
		model.setValue("/root/reqData/fwdData/cust_seq"	, cust_seq);
	}
	if( cust_name != "" )
	{
		model.setValue("/root/reqData/fwdData/cust_name", cust_name);
	}
					
	window.load("/xrw/ad/co/AD_CO_1500.xrw"
				, "modal"
				, ""
				, "align:center; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;"
				,"/root/reqData/fwdData"
				,"/root/reqData/fwdData"
	);
}

/* �ι������� �ι���ȣ ��ȸ�ϱ� */
function findCustSeqByName(medi_clsf, srch_dlco_no, srch_dlco_nm, srch_cust_seq, srch_cust_name, ctrl_dlco_no, ctrl_dlco_nm, ctrl_cust_seq, ctrl_cust_name)
{
// �������а� �̸��� �� �Լ����� �ʼ��ڵ���.
	if( trim(medi_clsf) == "" || trim(srch_cust_name) == "" )
	{
// �ŷ�ó������ �����Ѵ�.	
//		model.setValue(ctrl_dlco_no.attribute("ref"), "");
//		model.setValue(ctrl_dlco_nm.attribute("ref"), "");
//		ctrl_dlco_no.refresh();
//		ctrl_dlco_nm.refresh();
		model.setValue(ctrl_cust_seq.attribute("ref"), "");
		model.setValue(ctrl_cust_name.attribute("ref"), "");
		ctrl_cust_seq.refresh();
		ctrl_cust_name.refresh();
		return;
	}
	
	makeNodeValue("/root/tempData/searchData/action"			, "9101");
	makeNodeValue("/root/tempData/searchData/medi_clsf"			, medi_clsf);
	makeNodeValue("/root/tempData/searchData/srch_dlco_no"		, srch_dlco_no);
	makeNodeValue("/root/tempData/searchData/srch_dlco_nm"		, srch_dlco_nm);
	makeNodeValue("/root/tempData/searchData/srch_cust_seq"		, srch_cust_seq);
	makeNodeValue("/root/tempData/searchData/srch_cust_name"	, srch_cust_name);
	
	modelSendNoMake("ad_co_9100_s", "/ad/common/9100", "/root/tempData/searchData", "/root/tempData/resData");
	
	var chk_cnt = Number(model.getValue("/root/tempData/resData/chk_cnt"));
	if( chk_cnt > 1 )
	{
		showCustomerSearchPopup(medi_clsf, srch_dlco_no, srch_dlco_nm, srch_cust_seq, srch_cust_name);
	}
	else
	{
		model.setValue(ctrl_dlco_no.attribute("ref"), model.getValue("/root/tempData/resData/srch_dlco_no"));
		model.setValue(ctrl_dlco_nm.attribute("ref"), model.getValue("/root/tempData/resData/srch_dlco_nm"));
		model.setValue(ctrl_cust_seq.attribute("ref"), model.getValue("/root/tempData/resData/srch_cust_seq"));
		model.setValue(ctrl_cust_name.attribute("ref"), model.getValue("/root/tempData/resData/srch_cust_name"));
		ctrl_dlco_no.refresh();
		ctrl_dlco_nm.refresh();
		ctrl_cust_seq.refresh();
		ctrl_cust_name.refresh();
	}
}

/* �ι������� �ι�DB��ȣ ��������  */
function getPeopleDbNo(emp_no, cust_name, peopledb_ref)
{
	if( trim(emp_no) == "" || trim(cust_name) == "" )
	{
		model.setValue(peopledb_ref.attribute("ref"), "");
		peopledb_ref.refresh();
		return;
	}
	
	makeNodeValue("/root/tempData/searchData/action"			, "9102");
	makeNodeValue("/root/tempData/searchData/srch_dlco_no"		, emp_no);
	makeNodeValue("/root/tempData/searchData/srch_cust_name"	, cust_name);
	
	modelSendNoMake("ad_co_9100_s", "/ad/common/9100", "/root/tempData/searchData", "/root/tempData/resData");
	model.setValue(peopledb_ref.attribute("ref"), model.getValue("/root/tempData/resData/srch_cust_name"));

	peopledb_ref.refresh();
}

/*
	����ŷ�ó �˻� �˾�
*/
function showDlcoSearchPopup(){

	if(instance1.selectSingleNode("/root/reqData/fwdData/func_nm") == null){
		model.makeNode("/root/reqData/fwdData/func_nm");
	}

	model.setValue("/root/reqData/fwdData/func_nm", "setDlcoInfo");
	
	window.load("/xrw/co/dlco/CO_DLCO_1100.xrw"
	            ,"modal"
	            ,""
	            ,"align:center; width:650; height:520; caption:hidden;"
	            ,"/root/reqData/fwdData"
   	            ,"/root/reqData/fwdData"
	);
/*						
	window.load("/xrw/ad/co/AD_CO_1300.xrw"
				, "modal"
				, ""
				, "align:center; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;"
	);
*/	
	
}

/*
	����ŷ�ó ���ȭ�� �˾����� ����
*/
function regDlcoInfo(){

    viewer("mainFrame").window.javaScript.onLoadExPopupPage("CO_DLCO_1000");
/*
	if(instance1.selectSingleNode("/root/reqData/fwdData/func_nm") == null){
		model.makeNode("/root/reqData/fwdData/func_nm");
	}

	model.setValue("/root/reqData/fwdData/func_nm", "setDlcoNo");
	
	window.load("/xrw/co/dlco/CO_DLCO_1010.xrw"
	            ,"modal"
	            ,""
	            ,"align:center; caption:hidden;"
	            ,"/root/reqData/fwdData"
   	            ,"/root/reqData/fwdData"
	);
*/	
}
/*
	�������� ���� �˾�
*/
function showIndtClsfPopup(){
	window.load("/xrw/ad/co/AD_CO_1000.xrw"
			   ,"modal"
			   ,""
			   ,"align:center; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;")
}
/*
	�������� ���� �˾�
*/
function showTypeClsfPopup(){
	window.load("/xrw/ad/co/AD_CO_1100.xrw"
	           ,"modal"
	           ,""
	           ,"align:center; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;")
}

/* 
	�׸��嵥��Ÿ�� ���õ� �ν��Ͻ� index�� ���ϱ�
*/

function getSelectedRecordIndex(datagrid){

//	datagrid.gridToInstance();

	return datagrid.row - (datagrid.fixedRows - 1);
}

function adCommGetDay2(yyyyMMdd) {
   if ( yyyyMMdd.length != 8 ) return;
   
   var year = yyyyMMdd.substring(0,4);
   var month = yyyyMMdd.substring(4,6);
   var date = yyyyMMdd.substring(6);
   var day = new Date(parseInt(year),parseInt(month)-1,parseInt(date));
   
   return day.getDay();
}

/*
	ù��° ��¥�� �ι�° ���� ���̸� YMD �������� �����Ѵ�.
*/
function dateDiff(ymd, from, to){
    
    var fromDate = new Date(from.substr(0,4), from.substr(4,2) - 1, from.substr(6,2));
    
   	var from_year  = fromDate.getFullYear();
   	var from_month = fromDate.getMonth();
   	var from_date  = fromDate.getDate();
    	
    var toDate   = new Date(to.substr(0,4), to.substr(4,2) - 1, to.substr(6,2));
    
   	var to_year  = toDate.getFullYear();
   	var to_month = toDate.getMonth();
   	var to_date  = toDate.getDate();
   	
    if(ymd == 'y'){
		return Math.round(((toDate - fromDate) /365 /30 / 60 / 60 / 24 / 1000));
    }else if(ymd == 'm'){
		return Math.round(((toDate - fromDate) /30 / 60 / 60 / 24 / 1000));
    }else if(ymd == 'd'){
		return ((toDate - fromDate) / 60 / 60 / 24 / 1000);
    }
}

/*
	�ش���� ������ BUSINESS ���ڸ� ���Ѵ�.
*/
function getLastBusinessDate(ymd){

    var date = new Date(ymd.substr(0,4), ymd.substr(4,2), "01");
    date.setDate(date.getDate()-1);    
	
	var day_of_week = date.getDay();
	
	if(day_of_week == 6){
		date.setDate(date.getDate()-1);
	}else if(day_of_week == 0){
		date.setDate(date.getDate()-2);
	}
	
	var rv_year = date.getFullYear();
	var rv_month = date.getMonth()+1;
	var rv_date  = date.getDate();
	
	return rv_year + "" + (rv_month < 10 ? "0"+rv_month : rv_month) + "" + date.getDate();
}

/*
	������ ó������ �˾� ����
*/
function showPreIssuListPopup(prof_type_cd, slip_clsf_cd, slip_occr_dt, slip_seq){

	if(prof_type_cd == "" || slip_clsf_cd == "" || slip_occr_dt == "" || slip_seq == ""){
		alert("���ݰ�꼭��ȣ�� �����ϴ�.");
		return;
	}
	
	model.removeNodeset("/root/reqData/fwdData");  
	model.makeNode("/root/reqData/fwdData/prof_type_cd");
	model.makeNode("/root/reqData/fwdData/slip_clsf_cd");
	model.makeNode("/root/reqData/fwdData/slip_occr_dt");
	model.makeNode("/root/reqData/fwdData/slip_seq");
	
	model.setValue("/root/reqData/fwdData/prof_type_cd", prof_type_cd);
	model.setValue("/root/reqData/fwdData/slip_clsf_cd", slip_clsf_cd);
	model.setValue("/root/reqData/fwdData/slip_occr_dt", slip_occr_dt);
	model.setValue("/root/reqData/fwdData/slip_seq", slip_seq);
	
	window.load("/xrw/ad/tax/AD_TAX_1250.xrw"
	           ,"modal"
	           ,""
	           ,"align:center; width:650; height:520; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;"
	           ,"/root/reqData/fwdData"
	           ,"/root/reqData/searchData"	           
	);
}

/*
	����Ÿ�׸����� ���� ������ ����
*/
function checkGridData(datagrid){
	
	var retVal = false;
	
	for(var i=1;i<datagrid.rows;i++){
		for(var j=datagrid.fixedCols;j<datagrid.cols;j++){
			var data = datagrid.valueMatrix(i,j);
			if(data != ""){
				retVal = true;
				break;
			}
		}
	}
	return retVal;
}
/*
	����Ÿ�׸��� ���� ���������� ����.
*/
function isDataGridUpdated(datagrid){
	
	var retVal = false;
	
	for(var i=datagrid.fixedRows;i<datagrid.rows;i++){
		if(datagrid.rowStatus(i) != 0){
			retVal = true;
			break;
		}
	}
	return retVal;
}
/*
	���߰�
*/
function addRow(datagrid){
	datagrid.addRow();
	datagrid.row = datagrid.rows;
	datagrid.col = 1;
}
/*
	�����
*/
function deleteRow(datagrid){
	var firstRow = datagrid.selectedRow(0);
	var lastRow  = datagrid.selectedRow(datagrid.selectedRows-1);
	for(var i=firstRow;i<=lastRow;i++){
		datagrid.rowStatus(i) = "4";
	}
	datagrid.refresh();
}
/*
	�����
*/
function cancelRow(datagrid){

	var firstRow = datagrid.selectedRow(0);
	var lastRow  = datagrid.selectedRow(datagrid.selectedRows-1);				
	
	for(var i=firstRow;i<=lastRow;i++){
		if(datagrid.rowStatus(i) == "1" || datagrid.rowStatus(i) == "3"){
			datagrid.removeRow(i);
			i--;
		}else if(datagrid.rowStatus(i) == "4"){
			datagrid.rowStatus(i) = "0";
		}else{
			datagrid.rowStatus(i) = "0";
		}
	}	
}
/*
	Ȯ�θ޼��� alert
*/
function windowConfirm(msg){
	
	if(window.alert(msg, "Ȯ��", 1) == 1){
		return true;
	}
	
	return false;
}

/**
 * ����ý��� �������� �κ�
 * :�׸����� selectionmode�� free�� ����Ʈ ����
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
/**
 * �����ȣ ȣ��)
 * parameter
 *  - zip1Ref : �����ȣ1 xPath
 *  - zip2Ref : �����ȣ2 xPath
 *  - addrRef : �ּ� xPath
*/
function openZipCode(bogb, zip1Ref, zip2Ref, addrRef){

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
	
	//"L"�̸� �����׸� �Ⱥ���
	model.setValue("/root/tempData/posttemp/send/disp_flag", bogb);
	model.setValue("/root/tempData/posttemp/send/zip", model.getValue(zip1Ref)+model.getValue(zip2Ref));
	
	openZip("/root/tempData/posttemp/send", "/root/tempData/posttemp/recv");
	
	model.setValue(zip1Ref, model.getValue("/root/tempData/posttemp/recv/zip1"));
	model.setValue(zip2Ref, model.getValue("/root/tempData/posttemp/recv/zip2"));
	model.setValue(addrRef, model.getValue("/root/tempData/posttemp/recv/addr"));
	
	model.refresh();

}
/*
	�ν��Ͻ� ��� ����&�� ����
*/
function makeNodeValue(node, value){
	model.makeNode(node);
	model.setValue(node, value);
	
}
//num-������, pos ����� ���ϴ� �Ҽ����ڸ��� 
function fn_round(num, pos){ 
  if(!pos) pos=0; 
  return (Math.round(num*(Math.pow(10,pos))))/(Math.pow(10,pos)); 
} 
/*
	�Էµ� ����  ToUpperCase
*/
function upperCase(ctrl){
	var currentText = ctrl.currentText;
	currentText = currentText.toUpperCase();
	model.setValue(ctrl.attribute("ref") , currentText);
	ctrl.refresh();
}

function disableButtons(objName){

    var obj;
    
    if(objName == null){
        obj = document.body;
    }else{
        obj = document.controls(objName);
    }
    
	var cnt = obj.children.length;
    for(var i=0; i<cnt; i++)
    {
        ChildObj = obj.children(i);
        if(ChildObj.elementName == "xforms:button")
        {
            id = ChildObj.attribute("id");
            
            if(id.indexOf("btnClose") != -1){
                ChildObj.disabled = false;
            }else{
                ChildObj.disabled = true;
            }
                
        }else if(ChildObj.elementName == "xforms:group"){
            disableButtons(ChildObj.attribute("id"));
        }else if(ChildObj.elementName == "xforms:switch"){
            disableButtons(ChildObj.attribute("id"));
        }else if(ChildObj.elementName == "xforms:case"){
            disableButtons(ChildObj.attribute("id"));
        }
    }
    	
}


//�׸��� ȭ��ǥ �̵��� ���� üũ ����
var grid_col_type = "";
			
/*************************************************************************************************/
/* 0. ���� Global Event ���� �Լ� (Event)
/* 1)  onkeydown   		: ȭ��ǥŰ üũ
/* 2)  onentercell 		: �÷��̵� �� �÷�Ÿ���� ����Ʈ���� ��� ������ �� ����
/* 3)  xforms_next 		: �÷��̵��� �̵� �� �÷�Ÿ���� ���������� set
/* 4)  xforms_previous	: �÷��̵��� �̵� �� �÷�Ÿ���� ���������� set
/*************************************************************************************************/
/*-----------------------------------------------------------------------------------
 * NAME  : onkeydown()
 * DESC  : keydown�� ȭ��ǥ üũ�Ͽ� �̺�Ʈ ó��
 * PARAM : 
 * DATE  : 
 * AUTH  : ����
 *----------------------------------------------------------------------------------*/
function onkeydown() {
    var currtarget = event.currentTarget;
    if(currtarget.indexOf("_$") != -1) return false;
    if(currtarget == "body" || currtarget == "html" ) return false;
    
    var obj = document.controls(currtarget);
    var id = obj.attribute("id");
    var arrowkey = obj.attribute("arrowkey");
    var grid = document.all(id);

	var fixcol;		//��������
	var fixrow;		//�������
	var totcol;		//�ѿ���
	var nowcol;		//���翭��ġ
	var totrow;		//�����
	var nowrow;		//��������ġ

    if(obj.elementName == "xforms:datagrid") {
		//ȭ��ǥŰ �̺�Ʈ ��� üũ
//		if(arrowkey == "Y"){
			//ȭ��ǥŰ
			if(event.keyCode == 37 || event.keyCode == 38 || event.keyCode == 39 || event.keyCode == 40){
				fixcol = grid.fixedCols;
				fixrow = grid.fixedRows;
				totcol = grid.cols;
				nowcol = grid.col;
				totrow = grid.rows;
				nowrow = grid.row;

				//ȭ��ǥ Ű�� ���� ó��
				if      (event.keyCode == 37){
					//���� ȭ��ǥ
					if(nowcol > fixcol){
						if((grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate") && grid_col_type != "combo"){
							model.setFocus(id);
							grid.col = nowcol-1;
							grid.row = nowrow;
							grid.editCell();
						}
					}
			
				}else if(event.keyCode == 38){
					//���� ȭ��ǥ
					if(nowrow > fixrow){
						if(grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate"){
							model.setFocus(id);
							grid.col = nowcol;
							grid.row = nowrow-1;
							grid.editCell();
						}
					}
			
				}else if(event.keyCode == 39){
					//������ ȭ��ǥ
					if(nowcol+1 < totcol){
						if((grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate") && grid_col_type != "combo"){
							model.setFocus(id);
							grid.col = nowcol+1;
							grid.row = nowrow;
							grid.editCell();
						}
					}
			
				}else if(event.keyCode == 40){
					//�Ʒ��� ȭ��ǥ
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
		//}
    }
}

/*-----------------------------------------------------------------------------------
 * NAME  : onentercell()
 * DESC  : �÷��̵� �� �÷�Ÿ���� ����Ʈ���� ��� ������ �� ����
 * PARAM : 
 * DATE  : 
 * AUTH  : ����
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
		//ȭ��ǥŰ �̺�Ʈ ��� üũ
//		if(arrowkey == "Y"){
			nowcol = grid.col;		//�����÷� ��ġ

			if(grid.colType(nowcol) == "input" || grid.colType(nowcol) == "inputbutton" || grid.colType(nowcol) == "inputdate"){
				grid.editCell();
			}
//		}
    }
}

/*-----------------------------------------------------------------------------------
 * NAME  : xforms_next()
 * DESC  : �÷��̵��� �̵� �� �÷�Ÿ���� ���������� set
 * PARAM : 
 * DATE  : 
 * AUTH  : ����
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
		//ȭ��ǥŰ �̺�Ʈ ��� üũ
//		if(arrowkey == "Y"){
			grid_col_type = grid.colType(grid.col);
//		}
    }
}

/*-----------------------------------------------------------------------------------
 * NAME  : xforms_previous()
 * DESC  : �÷��̵��� �̵� �� �÷�Ÿ���� ���������� set
 * PARAM : 
 * DATE  : 
 * AUTH  : ����
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
		//ȭ��ǥŰ �̺�Ʈ ��� üũ
//		if(arrowkey == "Y"){
			grid_col_type = grid.colType(grid.col);
//		}
    }
}

function loadPDF(pubc_dt, sect_nm, side_cd){

//	if(side_cd == "") return;

	var sect_cd 	= sect_nm.substring(0,1);
	var sect_seq 	= Number(sect_nm.substring(1));
	sect_seq		= sect_seq < 10 ? "0"+sect_seq : sect_seq;
	
	var yyyy    	= pubc_dt.substring(0,4);
	var mm      	= pubc_dt.substring(4,6);
	
	var pdf     	= pubc_dt + "" + sect_cd + "" + sect_seq + "" + side_cd;
	
//	window.load("http://srchdb1.chosun.com/pdf/i_service/read_pdf.jsp?PDF="+pdf+"&Y="+yyyy+"&M="+mm+"", "html", "");
	window.load("http://srchdb1.chosun.com/pdf/i_service/ciis_ad_list.jsp?D="+pubc_dt+"&S="+sect_cd+"&P="+sect_seq+"", "html", "");
					
}

function doResult(){
	
}

function isDataRegion(datagrid){

	if(!datagrid.isCell(event.target))  	return false;
	
	if(datagrid.row < datagrid.fixedRows) 	return false;
	
	return true;
}

function getDocumentRoot(){

	var _url	=	document.url;
//	var _root  	= 	_url.substring(0, _url.indexOf(":",5));
	var _root  	= 	_url.substring(0, _url.indexOf("/",7));	
	
//	var _root	=	"http://ciis.chosun.com" == _root ? _root : "http://220.73.135.221" ;
	var _root	=	"http://ciis.chosun.com" == _root ? _root : "http://ciis.chosun.com" ;	
//	var _port	=	"http://ciis.chosun.com" == _root ? "80" : "9020" ;
	var _port	=	"http://ciis.chosun.com" == _root ? "8081" : "8081" ;
	
//	var _root	=	"http://127.0.0.1" ;
//	var _port	=	"7001" ;
		
	return _root + ":" + _port;
//	return _root;
}

var SESS_DLCO_CLSF	=	"SESS_DLCO_CLSF";				
var SESS_DLCO_NO	=	"SESS_DLCO_NO";
var SESS_DLCO_NM	=	"SESS_DLCO_NM";

function setSessionDlco(dlco_clsf, dlco_no, dlco_nm){
	model.property(SESS_DLCO_CLSF)  = dlco_clsf;
	model.property(SESS_DLCO_NO)  	= dlco_no;
	model.property(SESS_DLCO_NM)  	= dlco_nm;
}
function getSessionDlcoClsf(){
	return model.property(SESS_DLCO_CLSF);
}
function getSessionDlcoNo(){
	return model.property(SESS_DLCO_NO);
}
function getSessionDlcoNm(){
	return model.property(SESS_DLCO_NM);
}

function setExDlcoInfo(dlco_clsf, dlco_no_ctrl, dlco_nm_ctrl){
	
	var	dlco_no	=	"";
	if(dlco_no_ctrl){
		dlco_no = dlco_no_ctrl.currentText;
	}

	var	dlco_nm	=	"";
	if(dlco_nm_ctrl){
		dlco_nm = dlco_nm_ctrl.currentText;
	}
	
	if(dlco_no != ""){
		dlco_no  = lpad(dlco_no, 8, "0");
		model.setValue(dlco_no_ctrl.attribute("ref"), dlco_no); 
		dlco_no_ctrl.refresh();
	}
	
	model.removeNode("/root/tempData/reqData");
	model.removeNode("/root/tempData/resData");
	makeNodeValue("/root/tempData/reqData/dlco_clsf", dlco_clsf);
	makeNodeValue("/root/tempData/reqData/dlco_no", dlco_no);
	makeNodeValue("/root/tempData/reqData/dlco_nm", dlco_nm);
	
	modelSendNoMake("ad_co_9010_s", "/ad/common/9010", "/root/tempData/reqData", "/root/tempData/resData");
}			

function setSlcrgPersInfo(slcrg_pers_ctrl, slcrg_pers_nm_ctrl){

	var	slcrg_pers	=	"";
	if(slcrg_pers_ctrl){
		slcrg_pers = slcrg_pers_ctrl.currentText;
	}

	var	slcrg_pers_nm	=	"";
	if(slcrg_pers_nm_ctrl){
		slcrg_pers_nm = slcrg_pers_nm_ctrl.currentText;
	}
					
	model.removeNode("/root/tempData/reqData");
	model.removeNode("/root/tempData/resData");
	
	makeNodeValue("/root/tempData/reqData/slcrg_pers"		,slcrg_pers);
	makeNodeValue("/root/tempData/reqData/slcrg_pers_nm"	,slcrg_pers_nm);
	modelSendNoMake("ad_co_9010_s", "/ad/common/9010", "/root/tempData/reqData", "/root/tempData/resData");								
					
}

function setMchrgPersInfo(mchrg_pers_ctrl, mchrg_pers_nm_ctrl){

	var	mchrg_pers	=	"";
	if(mchrg_pers_ctrl){
		mchrg_pers = mchrg_pers_ctrl.currentText;
	}

	var	mchrg_pers_nm	=	"";
	if(mchrg_pers_nm_ctrl){
		mchrg_pers_nm = mchrg_pers_nm_ctrl.currentText;
	}
					
	model.removeNode("/root/tempData/reqData");
	model.removeNode("/root/tempData/resData");
	
	makeNodeValue("/root/tempData/reqData/mchrg_pers"		,mchrg_pers);
	makeNodeValue("/root/tempData/reqData/mchrg_pers_nm"	,mchrg_pers_nm);
	modelSendNoMake("ad_co_9010_s", "/ad/common/9010", "/root/tempData/reqData", "/root/tempData/resData");								
					
}	

				
function Mid(str, start, len){
	if(start < 0 || len < 0) return "";
	
	var iEnd, iLen = String(str).length;
	if(start + len > iLen){
		iEnd = iLen;
	}else{
		iEnd = start + len
	}
	
	return String(str).substring(start,iEnd);
}

function InStr(strSearch, charSearchFor){
	for(var i=0; i < strSearch.length; i++){
		if(charSearchFor == Mid(strSearch,i,1)){
			return i;
		}
	}
	return -1;
}		
			