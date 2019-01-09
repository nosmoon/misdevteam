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
	HD_EVLU_3103_SDataSet ds = (HD_EVLU_3103_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
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
	int evlu_proc_stat_1tms	= rx.add(dataSet, "evlu_proc_stat_1tms", ds.evlu_proc_stat_1tms);
	int evlu_proc_stat_2tms	= rx.add(dataSet, "evlu_proc_stat_2tms", ds.evlu_proc_stat_2tms);
	int rfl_ratio_10 = rx.add(dataSet, "rfl_ratio_10", ds.rfl_ratio_10);
	int rfl_ratio_20 = rx.add(dataSet, "rfl_ratio_20", ds.rfl_ratio_20);
	int rfl_ratio_30 = rx.add(dataSet, "rfl_ratio_30", ds.rfl_ratio_30);
	int rfl_ratio_40 = rx.add(dataSet, "rfl_ratio_40", ds.rfl_ratio_40);
	int rfl_ratio_50 = rx.add(dataSet, "rfl_ratio_50", ds.rfl_ratio_50);
	int slf_achv_desc1	= rx.addCData(dataSet, "slf_achv_desc1", ds.slf_achv_desc1);
	int slf_achv_desc2	= rx.addCData(dataSet, "slf_achv_desc2", ds.slf_achv_desc2);
	
	int asst_evlu_grad_cd = rx.add(dataSet, "asst_evlu_grad_cd", ds.asst_evlu_grad_cd);
	int asst_evlu_opn = rx.addCData(dataSet, "asst_evlu_opn", ds.asst_evlu_opn);
	int busn_rslt_scor = rx.add(dataSet, "busn_rslt_scor", ds.busn_rslt_scor);
	int evlu_part_cd1 = rx.add(dataSet, "evlu_part_cd1", ds.evlu_part_cd1);
	int evlu_part_cd2 = rx.add(dataSet, "evlu_part_cd2", ds.evlu_part_cd2);
	int evlu_part_cd3 = rx.add(dataSet, "evlu_part_cd3", ds.evlu_part_cd3);
	int evlu_part_cd4 = rx.add(dataSet, "evlu_part_cd4", ds.evlu_part_cd4);
	int evlu_part_cd5 = rx.add(dataSet, "evlu_part_cd5", ds.evlu_part_cd5);
	int evlu_cmpt_opn_1tms = rx.addCData(dataSet, "evlu_cmpt_opn_1tms", ds.evlu_cmpt_opn_1tms);
	int self_evlu_proc_stat = rx.add(dataSet, "self_evlu_proc_stat", ds.self_evlu_proc_stat );
	int asst_evlu_proc_stat = rx.add(dataSet, "asst_evlu_proc_stat", ds.asst_evlu_proc_stat );
	int cmpt_scor = rx.add(dataSet, "cmpt_scor", ds.cmpt_scor );
	int asst_pnt = rx.add(dataSet, "asst_pnt", ds.asst_pnt);
	int rvis_scor_1tms = rx.add(dataSet, "rvis_scor_1tms", ds.rvis_scor_1tms );

 System.out.println("evlu_proc_stat_1tms " + evlu_proc_stat_1tms + " : " + ds.evlu_proc_stat_1tms);
 
	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_EVLU_3103_SCURLIST4Record rec = (HD_EVLU_3103_SCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_EVLU_3103_SCURLIST3Record rec = (HD_EVLU_3103_SCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_EVLU_3103_SCURLIST2Record rec = (HD_EVLU_3103_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_EVLU_3103_SCURLIST1Record rec = (HD_EVLU_3103_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_EVLU_3103_SCURLIST5Record rec = (HD_EVLU_3103_SCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		//response.setContentLength(388045);		
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST4>
		<record>
			<cdnm/>
			<act_indx_def/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<cdnm/>
			<act_indx_def/>
		</record>
	</CURLIST3>
</dataSet>
*/
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

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST5>
		<record>
			<cdnm/>
			<act_indx_def/>
		</record>
	</CURLIST5>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jul 27 20:00:01 KST 2009 */ %>