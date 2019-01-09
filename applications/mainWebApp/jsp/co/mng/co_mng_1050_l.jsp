<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	javax.naming.*	
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.mng.rec.*
	,	chosun.ciis.co.mng.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_MNG_1050_LDataSet ds = (CO_MNG_1050_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	String ACCT_CD="", EMPNO="", NM="", BLNG_CMPY_CD="", BLNG_CMPY_NM="", PART_CD="", PART_NM="", CRM_SELL_DEPT_CD="", CRM_SELL_DEPT_NM="", CRM_MANG_AREA_CD="", CRM_MANG_AREA_NM="", JOB_CLSF_CD="", JOB_CLSF_NM="", DTY_CD="", DTY_NM="", EMP_CLSF_CD="", EMP_CLSF_NM="", EMAIL_ID="", CRM_MANG_DEPT_CD="", CRM_MANG_DEPT_NM="", PTPH="", dealmedicd="";

	try {
		/****** CURCOMMLIST BEGIN */
		recordSet = rx.add(dataSet, "CURCOMMLIST", "");

		for(int i = 0; i < ds.curcommlist.size(); i++) {
			CO_MNG_1050_LCURCOMMLISTRecord rec = (CO_MNG_1050_LCURCOMMLISTRecord)ds.curcommlist.get(i);
			int record = rx.add(recordSet, "record", "");



			ACCT_CD = rec.acct_cd;
			EMPNO   = rec.empno;
			NM   = rec.nm;
			BLNG_CMPY_CD   = rec.blng_cmpy_cd;
			BLNG_CMPY_NM   = rec.blng_cmpy_nm;
			PART_CD   = rec.part_cd;
			PART_NM   = rec.part_nm;
			CRM_SELL_DEPT_CD   = rec.crm_sell_dept_cd;
			CRM_SELL_DEPT_NM   = rec.crm_sell_dept_nm;
			CRM_MANG_AREA_CD   = rec.crm_mang_area_cd;
			CRM_MANG_AREA_NM   = rec.crm_mang_area_nm;
			JOB_CLSF_CD   =  rec.job_clsf_cd;
			JOB_CLSF_NM   = rec.job_clsf_nm;
			DTY_CD   = rec.dty_cd;
			DTY_NM   = rec.posi_nm;
			EMP_CLSF_CD   = rec.emp_clsf_cd;
			EMP_CLSF_NM   = rec.emp_clsf_nm;
			EMAIL_ID   = rec.email_id;
			CRM_MANG_DEPT_CD   = rec.crm_mang_dept_cd;
			CRM_MANG_DEPT_NM   = rec.crm_mang_dept_nm;
			PTPH   = rec.ptph;
			dealmedicd   = rec.cust71;
		
			
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "empno", rec.empno);
			rx.add(record, "nm", rec.nm);
			rx.add(record, "acct_passwd", rec.acct_passwd);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "inpre_no", rec.inpre_no);
			rx.add(record, "ptph", rec.ptph);
			rx.add(record, "email_id", rec.email_id);
			rx.add(record, "blng_cmpy_cd", rec.blng_cmpy_cd);
			rx.add(record, "blng_cmpy_nm", rec.blng_cmpy_nm);
			rx.add(record, "duty_cmpy_cd", rec.duty_cmpy_cd);
			rx.add(record, "duty_cmpy_nm", rec.duty_cmpy_nm);
			rx.add(record, "offi_real_hdqtboks_cd", rec.offi_real_hdqtboks_cd);
			rx.add(record, "offi_real_hdqtboks_nm", rec.offi_real_hdqtboks_nm);
			rx.add(record, "boks_team_cd", rec.boks_team_cd);
			rx.add(record, "boks_team_nm", rec.boks_team_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "class_cd", rec.class_cd);
			rx.add(record, "class_nm", rec.class_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "job_clsf_use_vdty_dd", rec.job_clsf_use_vdty_dd);
			rx.add(record, "job_clsf_cd", rec.job_clsf_cd);
			rx.add(record, "job_clsf_nm", rec.job_clsf_nm);
			rx.add(record, "crm_usepers_type", rec.crm_usepers_type);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "crm_deal_bank_cd", rec.crm_deal_bank_cd);
			rx.add(record, "crm_deal_bank_nm", rec.crm_deal_bank_nm);
			rx.add(record, "crm_acct_no", rec.crm_acct_no);
			rx.add(record, "crm_mang_area_cd", rec.crm_mang_area_cd);
			rx.add(record, "crm_mang_area_nm", rec.crm_mang_area_nm);
			rx.add(record, "crm_sell_dept_cd", rec.crm_sell_dept_cd);
			rx.add(record, "crm_sell_dept_nm", rec.crm_sell_dept_nm);
			rx.add(record, "crm_bof_cd", rec.crm_bof_cd);
			rx.add(record, "crm_sell_part_nm", rec.crm_sell_part_nm);
			rx.add(record, "crm_bof_nm", rec.crm_bof_nm);
			rx.add(record, "crm_area_cd", rec.crm_area_cd);
			rx.add(record, "crm_area_nm", rec.crm_area_nm);
			rx.add(record, "crm_hd_dept_cd", rec.crm_hd_dept_cd);
			rx.add(record, "crm_hd_dept_nm", rec.crm_hd_dept_nm);
			rx.add(record, "crm_bof_clsf", rec.crm_bof_clsf);
			rx.add(record, "crm_bof_clsf_nm", rec.crm_bof_clsf_nm);
			rx.add(record, "crm_bill_grp_id", rec.crm_bill_grp_id);
			rx.add(record, "crm_bill_grp_type", rec.crm_bill_grp_type);
			rx.add(record, "crm_bill_blng_cd", rec.crm_bill_blng_cd);
			rx.add(record, "crm_sell_part_cd", rec.crm_sell_part_cd);
			rx.add(record, "crm_mang_dept_cd", rec.crm_mang_dept_cd);
			rx.add(record, "crm_mang_dept_nm", rec.crm_mang_dept_nm);
			rx.add(record, "crm_cust_src_cd", rec.crm_cust_src_cd);
			rx.add(record, "crm_cust_src_nm", rec.crm_cust_src_nm);
			rx.add(record, "crm_publ_bo_cd", rec.crm_publ_bo_cd);
			rx.add(record, "crm_publ_bo_nm", rec.crm_publ_bo_nm);
			rx.add(record, "crm_job_clsf_cd", rec.crm_job_clsf_cd);
			rx.add(record, "crm_job_clsf_nm", rec.crm_job_clsf_nm);
			rx.add(record, "usb_key", rec.usb_key);
			rx.add(record, "pre_dept_cd", rec.pre_dept_cd);
			rx.add(record, "dept_chg_dt", rec.dept_chg_dt);
			rx.add(record, "rep_posi_type_cd", rec.rep_posi_type_cd);
			rx.add(record, "usb_key_reg_dt", rec.usb_key_reg_dt);
			rx.add(record, "vpn_user_yn", rec.vpn_user_yn);
			rx.add(record, "xcoop_use", rec.xcoop_use);
			rx.add(record, "elec_tax_bill_use", rec.elec_tax_bill_use);
			rx.add(record, "eis_user_level", rec.eis_user_level);
			rx.add(record, "team_bb_use", rec.team_bb_use);
			rx.add(record, "cust71", rec.cust71);
			rx.add(record, "cust76", rec.cust76);
			rx.add(record, "cust77", rec.cust77);
			rx.add(record, "cust78", rec.cust78);
			rx.add(record, "cust79", rec.cust79);
			rx.add(record, "cust80", rec.cust80);
			rx.add(record, "cust81", rec.cust81);
			rx.add(record, "cust82", rec.cust82);
			rx.add(record, "cust83", rec.cust83);
			rx.add(record, "cust84", rec.cust84);
			rx.add(record, "cust85", rec.cust85);
			rx.add(record, "olap_yn", rec.olap_yn);
			rx.add(record, "pwd_chg_dt", rec.pwd_chg_dt);
			rx.add(record, "chief_yn", rec.chief_yn);
			//rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			//rx.add(record, "part_cd", StringUtil.replaceToXml(rec.part_cd));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "empno", StringUtil.replaceToXml(rec.empno));
			//rx.add(record, "nm", StringUtil.replaceToXml(rec.nm));
			//rx.add(record, "acct_passwd", StringUtil.replaceToXml(rec.acct_passwd));
			//rx.add(record, "emp_clsf_cd", StringUtil.replaceToXml(rec.emp_clsf_cd));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "inpre_no", StringUtil.replaceToXml(rec.inpre_no));
			//rx.add(record, "ptph", StringUtil.replaceToXml(rec.ptph));
			//rx.add(record, "email_id", StringUtil.replaceToXml(rec.email_id));
			//rx.add(record, "blng_cmpy_cd", StringUtil.replaceToXml(rec.blng_cmpy_cd));
			//rx.add(record, "blng_cmpy_nm", StringUtil.replaceToXml(rec.blng_cmpy_nm));
			//rx.add(record, "duty_cmpy_cd", StringUtil.replaceToXml(rec.duty_cmpy_cd));
			//rx.add(record, "duty_cmpy_nm", StringUtil.replaceToXml(rec.duty_cmpy_nm));
			//rx.add(record, "offi_real_hdqtboks_cd", StringUtil.replaceToXml(rec.offi_real_hdqtboks_cd));
			//rx.add(record, "offi_real_hdqtboks_nm", StringUtil.replaceToXml(rec.offi_real_hdqtboks_nm));
			//rx.add(record, "boks_team_cd", StringUtil.replaceToXml(rec.boks_team_cd));
			//rx.add(record, "boks_team_nm", StringUtil.replaceToXml(rec.boks_team_nm));
			//rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			//rx.add(record, "class_cd", StringUtil.replaceToXml(rec.class_cd));
			//rx.add(record, "class_nm", StringUtil.replaceToXml(rec.class_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "job_clsf_use_vdty_dd", StringUtil.replaceToXml(rec.job_clsf_use_vdty_dd));
			//rx.add(record, "job_clsf_cd", StringUtil.replaceToXml(rec.job_clsf_cd));
			//rx.add(record, "job_clsf_nm", StringUtil.replaceToXml(rec.job_clsf_nm));
			//rx.add(record, "crm_usepers_type", StringUtil.replaceToXml(rec.crm_usepers_type));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			//rx.add(record, "crm_deal_bank_cd", StringUtil.replaceToXml(rec.crm_deal_bank_cd));
			//rx.add(record, "crm_deal_bank_nm", StringUtil.replaceToXml(rec.crm_deal_bank_nm));
			//rx.add(record, "crm_acct_no", StringUtil.replaceToXml(rec.crm_acct_no));
			//rx.add(record, "crm_mang_area_cd", StringUtil.replaceToXml(rec.crm_mang_area_cd));
			//rx.add(record, "crm_mang_area_nm", StringUtil.replaceToXml(rec.crm_mang_area_nm));
			//rx.add(record, "crm_sell_dept_cd", StringUtil.replaceToXml(rec.crm_sell_dept_cd));
			//rx.add(record, "crm_sell_dept_nm", StringUtil.replaceToXml(rec.crm_sell_dept_nm));
			//rx.add(record, "crm_bof_cd", StringUtil.replaceToXml(rec.crm_bof_cd));
			//rx.add(record, "crm_sell_part_nm", StringUtil.replaceToXml(rec.crm_sell_part_nm));
			//rx.add(record, "crm_bof_nm", StringUtil.replaceToXml(rec.crm_bof_nm));
			//rx.add(record, "crm_area_cd", StringUtil.replaceToXml(rec.crm_area_cd));
			//rx.add(record, "crm_area_nm", StringUtil.replaceToXml(rec.crm_area_nm));
			//rx.add(record, "crm_hd_dept_cd", StringUtil.replaceToXml(rec.crm_hd_dept_cd));
			//rx.add(record, "crm_hd_dept_nm", StringUtil.replaceToXml(rec.crm_hd_dept_nm));
			//rx.add(record, "crm_bof_clsf", StringUtil.replaceToXml(rec.crm_bof_clsf));
			//rx.add(record, "crm_bof_clsf_nm", StringUtil.replaceToXml(rec.crm_bof_clsf_nm));
			//rx.add(record, "crm_bill_grp_id", StringUtil.replaceToXml(rec.crm_bill_grp_id));
			//rx.add(record, "crm_bill_grp_type", StringUtil.replaceToXml(rec.crm_bill_grp_type));
			//rx.add(record, "crm_bill_blng_cd", StringUtil.replaceToXml(rec.crm_bill_blng_cd));
			//rx.add(record, "crm_sell_part_cd", StringUtil.replaceToXml(rec.crm_sell_part_cd));
			//rx.add(record, "crm_mang_dept_cd", StringUtil.replaceToXml(rec.crm_mang_dept_cd));
			//rx.add(record, "crm_mang_dept_nm", StringUtil.replaceToXml(rec.crm_mang_dept_nm));
			//rx.add(record, "crm_cust_src_cd", StringUtil.replaceToXml(rec.crm_cust_src_cd));
			//rx.add(record, "crm_cust_src_nm", StringUtil.replaceToXml(rec.crm_cust_src_nm));
			//rx.add(record, "crm_publ_bo_cd", StringUtil.replaceToXml(rec.crm_publ_bo_cd));
			//rx.add(record, "crm_publ_bo_nm", StringUtil.replaceToXml(rec.crm_publ_bo_nm));
			//rx.add(record, "crm_job_clsf_cd", StringUtil.replaceToXml(rec.crm_job_clsf_cd));
			//rx.add(record, "crm_job_clsf_nm", StringUtil.replaceToXml(rec.crm_job_clsf_nm));
			//rx.add(record, "usb_key", StringUtil.replaceToXml(rec.usb_key));
			//rx.add(record, "pre_dept_cd", StringUtil.replaceToXml(rec.pre_dept_cd));
			//rx.add(record, "dept_chg_dt", StringUtil.replaceToXml(rec.dept_chg_dt));
			//rx.add(record, "rep_posi_type_cd", StringUtil.replaceToXml(rec.rep_posi_type_cd));
			//rx.add(record, "usb_key_reg_dt", StringUtil.replaceToXml(rec.usb_key_reg_dt));
			//rx.add(record, "vpn_user_yn", StringUtil.replaceToXml(rec.vpn_user_yn));
			//rx.add(record, "xcoop_use", StringUtil.replaceToXml(rec.xcoop_use));
			//rx.add(record, "elec_tax_bill_use", StringUtil.replaceToXml(rec.elec_tax_bill_use));
			//rx.add(record, "eis_user_level", StringUtil.replaceToXml(rec.eis_user_level));
			//rx.add(record, "team_bb_use", StringUtil.replaceToXml(rec.team_bb_use));
			//rx.add(record, "cust71", StringUtil.replaceToXml(rec.cust71));
			//rx.add(record, "cust76", StringUtil.replaceToXml(rec.cust76));
			//rx.add(record, "cust77", StringUtil.replaceToXml(rec.cust77));
			//rx.add(record, "cust78", StringUtil.replaceToXml(rec.cust78));
			//rx.add(record, "cust79", StringUtil.replaceToXml(rec.cust79));
			//rx.add(record, "cust80", StringUtil.replaceToXml(rec.cust80));
			//rx.add(record, "cust81", StringUtil.replaceToXml(rec.cust81));
			//rx.add(record, "cust82", StringUtil.replaceToXml(rec.cust82));
			//rx.add(record, "cust83", StringUtil.replaceToXml(rec.cust83));
			//rx.add(record, "cust84", StringUtil.replaceToXml(rec.cust84));
			//rx.add(record, "cust85", StringUtil.replaceToXml(rec.cust85));
			//rx.add(record, "olap_yn", StringUtil.replaceToXml(rec.olap_yn));
			//rx.add(record, "pwd_chg_dt", StringUtil.replaceToXml(rec.pwd_chg_dt));
			//rx.add(record, "chief_yn", StringUtil.replaceToXml(rec.chief_yn));
		}


		session.setAttribute("UID"	 , ACCT_CD);	
		session.setAttribute("ACCT_CD"	 , ACCT_CD);
		session.setAttribute("EMP_NO"	 , EMPNO);
		session.setAttribute("EMP_NM"	 , NM);
		session.setAttribute("CMPYCD"	 , BLNG_CMPY_CD);
		session.setAttribute("CMPYNM"	 , BLNG_CMPY_NM);
		session.setAttribute("DEPTCD"	 , PART_CD);
		session.setAttribute("DEPTNM"	 , PART_NM);
		session.setAttribute("SELLDEPTCD", CRM_SELL_DEPT_CD);
		session.setAttribute("SELLDEPTNM", CRM_SELL_DEPT_NM);
		session.setAttribute("AREACD"	 , CRM_MANG_AREA_CD);
		session.setAttribute("AREANM"	 , CRM_MANG_AREA_NM);
		session.setAttribute("JOBCD"	 , JOB_CLSF_CD);
		session.setAttribute("JOBNM"	 , JOB_CLSF_NM);
		session.setAttribute("POSICD"	 , DTY_CD);
		session.setAttribute("POSINM"	 , DTY_NM);
		session.setAttribute("USERTYPECD", EMP_CLSF_CD);
		session.setAttribute("USERTYPENM", EMP_CLSF_NM);
		session.setAttribute("EMAIL"	 , EMAIL_ID);
		session.setAttribute("DEALDEPTCD", CRM_MANG_DEPT_CD);
		session.setAttribute("DEALDEPTNM", CRM_MANG_DEPT_NM);
		session.setAttribute("PTPH"	 , PTPH);
		session.setAttribute("dealmedicd", dealmedicd);
		
		session.setAttribute("uid"       , ACCT_CD);			
		session.setAttribute("acct_cd"	 , ACCT_CD);
		session.setAttribute("emp_no"	 , EMPNO);
		session.setAttribute("emp_nm"	 , NM);
		session.setAttribute("cmpycd"	 , BLNG_CMPY_CD);
		session.setAttribute("cmpynm"	 , BLNG_CMPY_NM);
		session.setAttribute("deptcd"	 , PART_CD);
		session.setAttribute("deptnm"	 , PART_NM);
		session.setAttribute("selldeptcd", CRM_SELL_DEPT_CD);
		session.setAttribute("selldeptnm", CRM_SELL_DEPT_NM);
		session.setAttribute("areacd"	 , CRM_MANG_AREA_CD);
		session.setAttribute("areanm"	 , CRM_MANG_AREA_NM);
		session.setAttribute("jobcd"	 , JOB_CLSF_CD);
		session.setAttribute("jobnm"	 , JOB_CLSF_NM);
		session.setAttribute("posicd"	 , DTY_CD);
		session.setAttribute("posinm"	 , DTY_NM);
		session.setAttribute("usertypecd", EMP_CLSF_CD);
		session.setAttribute("usertypenm", EMP_CLSF_NM);
		session.setAttribute("email"	 , EMAIL_ID);
		session.setAttribute("dealdeptcd", CRM_MANG_DEPT_CD);
		session.setAttribute("dealdeptnm", CRM_MANG_DEPT_NM);
		session.setAttribute("ptph"	 , PTPH);
		session.setAttribute("dealmedicd", dealmedicd);			
		
		rx.add(recordSet, "totalcnt", ds.curcommlist.size());
		/****** CURCOMMLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<co_mng_1050_l>
	<dataSet>
		<CURCOMMLIST>
			<record>
				<acct_cd/>
				<part_cd/>
				<prn/>
				<empno/>
				<nm/>
				<acct_passwd/>
				<emp_clsf_cd/>
				<emp_clsf_nm/>
				<inpre_no/>
				<ptph/>
				<email_id/>
				<blng_cmpy_cd/>
				<blng_cmpy_nm/>
				<duty_cmpy_cd/>
				<duty_cmpy_nm/>
				<offi_real_hdqtboks_cd/>
				<offi_real_hdqtboks_nm/>
				<boks_team_cd/>
				<boks_team_nm/>
				<part_nm/>
				<class_cd/>
				<class_nm/>
				<posi_cd/>
				<posi_nm/>
				<dty_cd/>
				<dty_nm/>
				<job_clsf_use_vdty_dd/>
				<job_clsf_cd/>
				<job_clsf_nm/>
				<crm_usepers_type/>
				<lvcmpy_dt/>
				<crm_deal_bank_cd/>
				<crm_deal_bank_nm/>
				<crm_acct_no/>
				<crm_mang_area_cd/>
				<crm_mang_area_nm/>
				<crm_sell_dept_cd/>
				<crm_sell_dept_nm/>
				<crm_bof_cd/>
				<crm_sell_part_nm/>
				<crm_bof_nm/>
				<crm_area_cd/>
				<crm_area_nm/>
				<crm_hd_dept_cd/>
				<crm_hd_dept_nm/>
				<crm_bof_clsf/>
				<crm_bof_clsf_nm/>
				<crm_bill_grp_id/>
				<crm_bill_grp_type/>
				<crm_bill_blng_cd/>
				<crm_sell_part_cd/>
				<crm_mang_dept_cd/>
				<crm_mang_dept_nm/>
				<crm_cust_src_cd/>
				<crm_cust_src_nm/>
				<crm_publ_bo_cd/>
				<crm_publ_bo_nm/>
				<crm_job_clsf_cd/>
				<crm_job_clsf_nm/>
				<usb_key/>
				<pre_dept_cd/>
				<dept_chg_dt/>
				<rep_posi_type_cd/>
				<usb_key_reg_dt/>
				<vpn_user_yn/>
				<xcoop_use/>
				<elec_tax_bill_use/>
				<eis_user_level/>
				<team_bb_use/>
				<cust71/>
				<cust76/>
				<cust77/>
				<cust78/>
				<cust79/>
				<cust80/>
				<cust81/>
				<cust82/>
				<cust83/>
				<cust84/>
				<cust85/>
				<olap_yn/>
				<pwd_chg_dt/>
				<chief_yn/>
			</record>
		</CURCOMMLIST>
	</dataSet>
</co_mng_1050_l>
*/
%>

<% /* 작성시간 : Mon Mar 31 12:32:10 KST 2014 */ %>