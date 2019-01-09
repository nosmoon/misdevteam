<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_RPT_1700_MDataSet ds = (TN_RPT_1700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** PAYMETHOD_LIST BEGIN */
		recordSet = rx.add(dataSet, "PAYMETHOD_LIST", "");

		for(int i = 0; i < ds.paymethod_list.size(); i++) {
			TN_RPT_1700_MPAYMETHOD_LISTRecord rec = (TN_RPT_1700_MPAYMETHOD_LISTRecord)ds.paymethod_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.paymethod_list.size());
		/****** PAYMETHOD_LIST END */

		/****** FUND_LIST BEGIN */
		recordSet = rx.add(dataSet, "FUND_LIST", "");

		for(int i = 0; i < ds.fund_list.size(); i++) {
			TN_RPT_1700_MFUND_LISTRecord rec = (TN_RPT_1700_MFUND_LISTRecord)ds.fund_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.fund_list.size());
		/****** FUND_LIST END */

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
<tn_rpt_1700_m>
	<dataSet>
		<PAYMETHOD_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</PAYMETHOD_LIST>
	</dataSet>
</tn_rpt_1700_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_rpt_1700_m>
	<dataSet>
		<FUND_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</FUND_LIST>
	</dataSet>
</tn_rpt_1700_m>
*/
%>

<% /* 작성시간 : Thu Dec 01 17:14:31 KST 2016 */ %>