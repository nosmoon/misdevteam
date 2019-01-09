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
	HD_EVLU_2901_LDataSet ds = (HD_EVLU_2901_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		
		rx.add(dataSet, "asst_evlu_proc_stat", ds.asst_evlu_proc_stat );
		
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_2901_LCURLISTRecord rec = (HD_EVLU_2901_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "self_evlu_proc_stat", rec.self_evlu_proc_stat);
			rx.add(record, "self_evlu_proc_stat_nm", rec.self_evlu_proc_stat_nm);
			rx.add(record, "evlu_view", rec.evlu_view);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "tgt_evlu_pers_emp_no", rec.tgt_evlu_pers_emp_no);
			rx.add(record, "tgt_evlu_pers_nm_korn", rec.tgt_evlu_pers_nm_korn);
			rx.add(record, "evlu_grad_cd", rec.evlu_grad_cd);
			rx.addCData(record, "evlu_opn", rec.evlu_opn);
			rx.add(record, "db_status", rec.db_status);
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
		response.setContentLength(388045);		
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
			<self_evlu_proc_stat/>
			<evlu_view/>
			<evlu_grp_nm/>
			<dept_nm/>
			<tgt_evlu_pers_emp_no/>
			<tgt_evlu_pers_nm_korn/>
			<evlu_grad_cd/>
			<evlu_opn/>
			<db_status/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jun 03 17:30:29 KST 2009 */ %>