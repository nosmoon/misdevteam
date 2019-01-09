<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_2002_LDataSet ds = (HD_LVCMPY_2002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_2002_LCURLISTRecord rec = (HD_LVCMPY_2002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "etc_saly_nm", rec.etc_saly_nm);
			rx.add(record, "etc_saly_cd", rec.etc_saly_cd);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt_1", rec.crdt_amt_1);
			rx.add(record, "crdt_amt_2", rec.crdt_amt_2);
			rx.add(record, "cal_pay_amt", rec.cal_pay_amt);
			rx.add(record, "emp_amt", rec.emp_amt);
			rx.add(record, "np_amt", rec.np_amt);
			rx.add(record, "hlth_amt", rec.hlth_amt);
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
			<flnm/>
			<budg_nm/>
			<budg_cd/>
			<dr_amt/>
			<crdt_amt_1/>
			<crdt_amt_2/>
			<cal_pay_amt/>
			<emp_amt/>
			<np_amt/>
			<hlth_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 18 20:01:51 KST 2009 */ %>