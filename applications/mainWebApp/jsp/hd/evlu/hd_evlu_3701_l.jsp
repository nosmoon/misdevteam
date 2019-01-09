<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_3701_LDataSet ds = (HD_EVLU_3701_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_3701_LCURLISTRecord rec = (HD_EVLU_3701_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sel_chk", rec.sel_chk);
			rx.add(record, "evlu_lcls_grp_nm", rec.evlu_lcls_grp_nm);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "asst_nm_korn", rec.asst_nm_korn);
			rx.add(record, "tms1_nm_korn", rec.tms1_nm_korn);
			rx.add(record, "tms2_nm_korn", rec.tms2_nm_korn);
			rx.add(record, "asst_pnt", rec.asst_pnt);
			rx.add(record, "spc_psdo_redu_scorcnt", rec.spc_psdo_redu_scorcnt);
			rx.addCData(record, "tmp_grad", rec.tmp_grad);
			rx.addCData(record, "evlu_pers_meda_grad_1tms", rec.evlu_pers_meda_grad_1tms);
			rx.addCData(record, "evlu_pers_deci_grad_2tms", rec.evlu_pers_deci_grad_2tms);
			rx.add(record, "rank", rec.rank);
			rx.add(record, "cmpt_scor", rec.cmpt_scor);
			rx.addCData(record, "slf_schv_desc1", rec.slf_schv_desc1);
			rx.addCData(record, "slf_schv_desc2", rec.slf_schv_desc2);
			rx.addCData(record, "evlu_scor", rec.evlu_scor);
			rx.add(record, "rvis_scor_1tms", rec.rvis_scor_1tms);
			rx.addCData(record, "evlu_pers_meda_opn_1tms", rec.evlu_pers_meda_opn_1tms);
			rx.addCData(record, "evlu_pers_meda_opn_2tms", rec.evlu_pers_meda_opn_2tms);
			rx.addCData(record, "evlu_cmpt_opn_1tms", rec.evlu_cmpt_opn_1tms);
			rx.addCData(record, "evlu_opn", rec.evlu_opn);
			rx.add(record, "evlu_grad_cd_01", rec.evlu_grad_cd_01);
			rx.add(record, "evlu_grad_cd_02", rec.evlu_grad_cd_02);
			rx.add(record, "evlu_grad_cd_03", rec.evlu_grad_cd_03);
			rx.add(record, "evlu_grad_cd_04", rec.evlu_grad_cd_04);
			rx.add(record, "evlu_grad_cd_05", rec.evlu_grad_cd_05);
			rx.add(record, "evlu_grad_cd_06", rec.evlu_grad_cd_06);
			rx.add(record, "evlu_dp_scorcnt", rec.evlu_dp_scorcnt);
			
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
<dataSet>
	<CURLIST>
		<record>
			<sel_chk/>
			<evlu_lcls_grp_nm/>
			<evlu_grp_nm/>
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<dty_nm/>
			<asst_nm_korn/>
			<tms1_nm_korn/>
			<tms2_nm_korn/>
			<asst_pnt/>
			<spc_psdo_redu_scorcnt/>
			<tmp_grad/>
			<evlu_pers_meda_grad_1tms/>
			<evlu_pers_deci_grad_2tms/>
			<rank/>
			<cmpt_scor/>
			<slf_schv_desc1/>
			<slf_schv_desc2/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Jun 05 17:05:55 KST 2009 */ %>