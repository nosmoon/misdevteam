<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_3302_LDataSet ds = (HD_EVLU_3302_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	int s_nops_2tms = rx.add(dataSet, "s_nops_2tms", ds.s_nops_2tms);
	int a_pls_nops_2tms = rx.add(dataSet, "a_pls_nops_2tms", ds.a_pls_nops_2tms );

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_3302_LCURLISTRecord rec = (HD_EVLU_3302_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sel_chk", rec.sel_chk);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "asst_pnt", rec.asst_pnt);
			rx.add(record, "spc_psdo_redu_scorcnt", rec.spc_psdo_redu_scorcnt);
			rx.add(record, "tmp_grad", rec.tmp_grad);
			rx.add(record, "evlu_pers_meda_grad_1tms", rec.evlu_pers_meda_grad_1tms);
			rx.add(record, "evlu_pers_deci_grad_2tms", rec.evlu_pers_deci_grad_2tms);
			rx.add(record, "evlu_pers_meda_opn_2tms", rec.evlu_pers_meda_opn_2tms);
			rx.add(record, "busn_rslt_scor", rec.busn_rslt_scor);
			rx.add(record, "evlu_grad_cd_01", rec.evlu_grad_cd_01);
			rx.add(record, "evlu_grad_cd_02", rec.evlu_grad_cd_02);
			rx.add(record, "evlu_grad_cd_03", rec.evlu_grad_cd_03);
			rx.add(record, "evlu_grad_cd_04", rec.evlu_grad_cd_04);
			rx.add(record, "evlu_grad_cd_05", rec.evlu_grad_cd_05);
			rx.add(record, "evlu_dp_scorcnt", rec.evlu_dp_scorcnt); //조선일보고도화_국실별가점추가_20160804
			
			
			System.out.println("ddd : " + rec.evlu_grad_cd_01) ;
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
			<asst_pnt/>
			<spc_psdo_redu_scorcnt/>
			<tmp_grad/>
			<evlu_pers_meda_grad_1tms/>
			<evlu_pers_deci_grad_2tms/>
			<evlu_pers_meda_opn_2tms/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 29 17:43:24 KST 2009 */ %>