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
	HD_EVLU_3102_LDataSet ds = (HD_EVLU_3102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	int s_nops_2tms = rx.add(dataSet, "s_nops_2tms", ds.s_nops_2tms);
	int a_pls_nops_2tms = rx.add(dataSet, "a_pls_nops_2tms", ds.a_pls_nops_2tms);

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_3102_LCURLISTRecord rec = (HD_EVLU_3102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sel_chk", rec.sel_chk);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "self_evlu_proc_stat", rec.self_evlu_proc_stat);
			rx.add(record, "asst_evlu_proc_stat", rec.asst_evlu_proc_stat);
			rx.add(record, "evlu_proc_stat_1tms", rec.evlu_proc_stat_1tms);
			rx.add(record, "asst_pnt", rec.asst_pnt);
			rx.add(record, "spc_psdo_redu_scorcnt", rec.spc_psdo_redu_scorcnt);
			rx.add(record, "tmp_grad", rec.tmp_grad);
			rx.add(record, "evlu_pers_meda_grad_1tms", rec.evlu_pers_meda_grad_1tms);
			rx.add(record, "evlu_pers_deci_grad_2tms", rec.evlu_pers_deci_grad_2tms);
			rx.add(record, "evlu_grad_cd_01", rec.evlu_grad_cd_01);
			rx.add(record, "evlu_grad_cd_02", rec.evlu_grad_cd_02);
			rx.add(record, "evlu_grad_cd_03", rec.evlu_grad_cd_03);
			rx.add(record, "evlu_grad_cd_04", rec.evlu_grad_cd_04);
			rx.add(record, "evlu_grad_cd_05", rec.evlu_grad_cd_05);
			rx.add(record, "busn_rslt_scor", rec.busn_rslt_scor);
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
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<dty_nm/>
			<self_evlu_stat/>
			<asst_evlu_stat/>
			<tms1_evlu_stat/>
			<asst_pnt/>
			<spc_psdo_redu_scorcnt/>
			<tmp_grad/>
			<evlu_pers_meda_grad_1tms/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 29 10:06:28 KST 2009 */ %>