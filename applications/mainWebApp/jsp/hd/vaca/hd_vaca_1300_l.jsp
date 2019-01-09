<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1300_LDataSet ds = (HD_VACA_1300_LDataSet)request.getAttribute("ds");
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
			HD_VACA_1300_LCURLISTRecord rec = (HD_VACA_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "real_vaca_dds", rec.real_vaca_dds);
			rx.add(record, "use_vaca_dds", rec.use_vaca_dds);
			rx.add(record, "duty_vaca_dds", rec.duty_vaca_dds);
			rx.add(record, "appm_vaca_plan_dt", rec.appm_vaca_plan_dt);
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aply_yy", rec.aply_yy);
			rx.add(record, "qq_clsf", rec.qq_clsf);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "rmn_vaca_dds", rec.rmn_vaca_dds);
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
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<dty_nm/>
			<real_vaca_dds/>
			<use_vaca_dds/>
			<duty_vaca_dds/>
			<appm_vaca_plan_dt/>
			<wkdy/>
			<proc_stat/>
			<occr_dt/>
			<seq/>
			<aply_yy/>
			<qq_clsf/>
			<dept_cd/>
			<rmn_vaca_dds/>
			<db_status/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jul 15 16:25:33 KST 2009 */ %>