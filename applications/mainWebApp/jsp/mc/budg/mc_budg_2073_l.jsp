<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_2073_LDataSet ds = (MC_BUDG_2073_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_2073_LCURLIST1Record rec = (MC_BUDG_2073_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "bgn_dt", rec.bgn_dt);
			rx.add(record, "last_dt", rec.last_dt);
			rx.add(record, "supv_dept_cd", rec.supv_dept_cd);
			rx.add(record, "supv_dept_nm", rec.supv_dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "emp_nm", rec.emp_nm);
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "bgn_dt", StringUtil.replaceToXml(rec.bgn_dt));
			//rx.add(record, "last_dt", StringUtil.replaceToXml(rec.last_dt));
			//rx.add(record, "supv_dept_cd", StringUtil.replaceToXml(rec.supv_dept_cd));
			//rx.add(record, "supv_dept_nm", StringUtil.replaceToXml(rec.supv_dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "emp_nm", StringUtil.replaceToXml(rec.emp_nm));
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
<mc_budg_2073_l>
	<dataSet>
		<CURLIST1>
			<record>
				<evnt_cd/>
				<evnt_nm/>
				<bgn_dt/>
				<last_dt/>
				<supv_dept_cd/>
				<supv_dept_nm/>
				<emp_no/>
				<emp_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_2073_l>
*/
%>

<% /* 작성시간 : Wed Apr 15 15:28:51 KST 2009 */ %>