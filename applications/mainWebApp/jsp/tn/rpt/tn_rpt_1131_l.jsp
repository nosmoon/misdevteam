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
	TN_RPT_1131_LDataSet ds = (TN_RPT_1131_LDataSet)request.getAttribute("ds");
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
			TN_RPT_1131_LCURLISTRecord rec = (TN_RPT_1131_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bank_name", rec.bank_name);
			rx.add(record, "acct_num", rec.acct_num);
			rx.add(record, "entr_dt", rec.entr_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "tran_remain", rec.tran_remain);
			//rx.add(record, "bank_name", StringUtil.replaceToXml(rec.bank_name));
			//rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			//rx.add(record, "entr_dt", StringUtil.replaceToXml(rec.entr_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "int_rate", StringUtil.replaceToXml(rec.int_rate));
			//rx.add(record, "tran_remain", StringUtil.replaceToXml(rec.tran_remain));
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
<tn_rpt_1131_l>
	<dataSet>
		<CURLIST>
			<record>
				<bank_name/>
				<acct_num/>
				<entr_dt/>
				<mtry_dt/>
				<int_rate/>
				<tran_remain/>
			</record>
		</CURLIST>
	</dataSet>
</tn_rpt_1131_l>
*/
%>

<% /* 작성시간 : Tue Aug 30 14:15:06 KST 2016 */ %>