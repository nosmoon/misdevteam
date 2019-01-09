<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_9701_LDataSet ds = (HD_AFFR_9701_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_9701_LCURLISTRecord rec = (HD_AFFR_9701_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			rx.add(record, "aply_obj_name", StringUtil.replaceToXml(rec.aply_obj_name));
			rx.add(record, "expn_clsf_nm", StringUtil.replaceToXml(rec.expn_clsf_nm));
			rx.add(record, "str_dt", StringUtil.replaceToXml(rec.str_dt));
			rx.add(record, "end_dt", StringUtil.replaceToXml(rec.end_dt));
			rx.add(record, "limt_amt", StringUtil.replaceToXml(rec.limt_amt));
			rx.add(record, "sply_amt", StringUtil.replaceToXml(rec.sply_amt));
			rx.add(record, "bank_nm", StringUtil.replaceToXml(rec.bank_nm));
			rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			rx.add(record, "deps_per", StringUtil.replaceToXml(rec.deps_per));
			rx.add(record, "phon_no", StringUtil.replaceToXml(rec.phon_no));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "stlm_desty", StringUtil.replaceToXml(rec.stlm_desty));	
			rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));	
			rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));				
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<hd_affr_9701_l>
	<dataSet>
		<CURLIST>
			<record>
				<mang_no/>
				<flnm/>
				<obj_clsf_nm/>
				<aplc_dt/>
				<req_pers_flnm/>
				<req_pers_dept_nm/>
				<case_nm/>
				<atic_pubc_dt/>
				<atic_pubc_side/>
				<emp_no/>
				<flnm/>
				<dept_nm/>
				<tms/>
				<prv_insp_dt/>
				<prv_insp_ocom/>
				<prv_insp_resn/>
				<main_insp_dt/>
				<main_insp_ocom/>
				<prz_pnsh_cd_nm/>
				<prz_grad/>
				<prz_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_9701_l>
*/
%>

<% /* 작성시간 : Mon Nov 23 14:12:37 KST 2009 */ %>