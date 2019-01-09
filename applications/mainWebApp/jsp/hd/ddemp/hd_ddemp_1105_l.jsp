<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DDEMP_1105_LDataSet ds = (HD_DDEMP_1105_LDataSet)request.getAttribute("ds");
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
			HD_DDEMP_1105_LCURLISTRecord rec = (HD_DDEMP_1105_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "emp_insr_amt", rec.emp_insr_amt);
			rx.add(record, "np_amt", rec.np_amt);
			rx.add(record, "hlth_insr_amt", rec.hlth_insr_amt);
			rx.add(record, "hlth_insr_med_care_insr_amt", rec.hlth_insr_med_care_insr_amt);
			//rx.add(record, "pay_amt", StringUtil.replaceToXml(rec.pay_amt));
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
<hd_ddemp_1105_l>
	<dataSet>
		<CURLIST>
			<record>
				<pay_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_ddemp_1105_l>
*/
%>

<% /* 작성시간 : Tue Jul 28 17:53:31 KST 2009 */ %>