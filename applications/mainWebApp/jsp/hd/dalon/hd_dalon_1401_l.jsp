<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1401_LDataSet ds = (HD_DALON_1401_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DALON_1401_LCURLISTRecord rec = (HD_DALON_1401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "session_emp_no", rec.session_emp_no);
			rx.add(record, "session_flnm", rec.session_flnm);
			rx.add(record, "cost_obj_clsf", rec.cost_obj_clsf);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "session_dept_cd", rec.session_dept_cd);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "out_in_plac", rec.out_in_plac);
			rx.add(record, "cost", rec.cost);
			rx.add(record, "excl_pers_clsf", rec.excl_pers_clsf);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "session_dept_cd_nm", rec.session_dept_cd_nm);
			rx.add(record, "session_dty_cd", rec.session_dty_cd);
			rx.add(record, "session_dty_nm", rec.session_dty_nm);
			rx.add(record, "session_posi_cd", rec.session_posi_cd);
			rx.add(record, "session_posi_nm", rec.session_posi_nm);
			rx.add(record, "tablename", "TEMP");

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
			<cmpy_cd/>
			<apst_dt/>
			<seq/>
			<dtamt_cd/>
			<dtamt_cd_nm/>
			<prov_cost/>
			<etc/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 09 15:05:17 KST 2009 */ %>