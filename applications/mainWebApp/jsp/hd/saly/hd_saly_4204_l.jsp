<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_4204_LDataSet ds = (HD_SALY_4204_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_4204_LCURLISTRecord rec = (HD_SALY_4204_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "adv_clsf", rec.adv_clsf);
			rx.add(record, "adv_dt", rec.adv_dt);
			rx.add(record, "dduc_seq", rec.dduc_seq);
			rx.add(record, "proc_clsf", rec.proc_clsf);
			rx.add(record, "dduc_dt", rec.dduc_dt);
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			rx.add(record, "dduc_amt", rec.dduc_amt);
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
			<emp_no/>
			<adv_clsf/>
			<adv_dt/>
			<dduc_seq/>
			<proc_clsf/>
			<dduc_dt/>
			<saly_yy/>
			<saly_no/>
			<dduc_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 22 10:20:36 KST 2009 */ %>