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
	HD_EVLU_2600_S_100DataSet ds = (HD_EVLU_2600_S_100DataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	
	int dept_nm	= rx.add(dataSet, "dept_nm", ds.dept_nm);
	int grp_nm1	= rx.add(dataSet, "grp_nm1", ds.grp_nm1);
	int grp_nm2	= rx.add(dataSet, "grp_nm2", ds.grp_nm1);
	int emp_no	= rx.add(dataSet, "emp_no", ds.emp_no);
	int nm_korn	= rx.add(dataSet, "nm_korn", ds.nm_korn);
	int asst_cnt	= rx.add(dataSet, "asst_cnt", ds.asst_cnt);
	int nm_korn_1tms	= rx.add(dataSet, "nm_korn_1tms", ds.nm_korn_1tms);
	int nm_korn_2tms	= rx.add(dataSet, "nm_korn_2tms", ds.nm_korn_2tms);
	int evlu_cd	= rx.add(dataSet, "evlu_cd", ds.evlu_cd);
	int spc_psdo_redu_scorcnt	= rx.add(dataSet, "spc_psdo_redu_scorcnt", ds.spc_psdo_redu_scorcnt);
	int self_evlu_proc_stat	= rx.add(dataSet, "self_evlu_proc_stat", ds.self_evlu_proc_stat);
	int rfl_ratio_10		= rx.add(dataSet, "rfl_ratio_10", ds.rfl_ratio_10);
	int rfl_ratio_20		= rx.add(dataSet, "rfl_ratio_20", ds.rfl_ratio_20);
	int slf_achv_desc1	= rx.addCData(dataSet, "slf_achv_desc1", ds.slf_achv_desc1 );
	int slf_achv_desc2	= rx.addCData(dataSet, "slf_achv_desc2", ds.slf_achv_desc2);
	int evlu_grad_cd_10	= rx.add(dataSet, "evlu_grad_cd_10", ds.evlu_grad_cd_10 );
	int evlu_grad_cd_20	= rx.add(dataSet, "evlu_grad_cd_20", ds.evlu_grad_cd_20);
	int evlu_grad_cd_30	= rx.add(dataSet, "evlu_grad_cd_30", ds.evlu_grad_cd_30 );
	int evlu_grad_cd_40	= rx.add(dataSet, "evlu_grad_cd_40", ds.evlu_grad_cd_40);
	int evlu_grad_cd_50	= rx.add(dataSet, "evlu_grad_cd_50", ds.evlu_grad_cd_50 );
	int evlu_proc_stat_1tms	= rx.add(dataSet, "evlu_proc_stat_1tms", ds.evlu_proc_stat_1tms  );
	int evlu_proc_stat_2tms	= rx.add(dataSet, "evlu_proc_stat_2tms", ds.evlu_proc_stat_2tms);
	int prsdt_aprv_proc_stat	= rx.add(dataSet, "prsdt_aprv_proc_stat", ds.prsdt_aprv_proc_stat );
	int cmpt_scor	= rx.add(dataSet, "cmpt_scor", ds.cmpt_scor );
	int busn_rslt_scor	= rx.add(dataSet, "busn_rslt_scor", ds.busn_rslt_scor );
	int evlu_prz_nm	= rx.addCData(dataSet, "evlu_prz_nm", ds.evlu_prz_nm );
	int evlu_dp_nm	= rx.addCData(dataSet, "evlu_dp_nm", ds.evlu_dp_nm );
	int evlu_dp_scorcnt	= rx.add(dataSet, "evlu_dp_scorcnt", ds.evlu_dp_scorcnt );
	
	System.out.println(ds.evlu_proc_stat_2tms);
	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_EVLU_2600_S_100CURLIST2Record rec = (HD_EVLU_2600_S_100CURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_EVLU_2600_S_100CURLIST1Record rec = (HD_EVLU_2600_S_100CURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST2>
		<record>
			<cdnm/>
			<act_indx_def/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cdnm/>
			<act_indx_def/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jul 27 11:09:10 KST 2009 */ %>