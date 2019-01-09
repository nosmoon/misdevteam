<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_3061_LDataSet ds = (FC_FUNC_3061_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_3061_LCURLISTRecord rec = (FC_FUNC_3061_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rcpm_dd", rec.rcpm_dd);
			rx.add(record, "newspap_cash", rec.newspap_cash);
			rx.add(record, "newspap_bill_90", rec.newspap_bill_90);
			rx.add(record, "newspap_bill_120", rec.newspap_bill_120);
			rx.add(record, "newspap_bill_125", rec.newspap_bill_125);
			rx.add(record, "publis_cash", rec.publis_cash);
			rx.add(record, "publis_bill_90", rec.publis_bill_90);
			rx.add(record, "publis_bill_120", rec.publis_bill_120);
			rx.add(record, "publis_bill_125", rec.publis_bill_125);
			rx.add(record, "newspap_sale", rec.newspap_sale);
			rx.add(record, "publis_sale", rec.publis_sale);
			rx.add(record, "lent_amt", rec.lent_amt);
			rx.add(record, "etc_amt", rec.etc_amt);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<rcpm_dd/>
			<newspap_cash/>
			<newspap_bill_90/>
			<newspap_bill_120/>
			<newspap_bill_125/>
			<publis_cash/>
			<publis_bill_90/>
			<publis_bill_120/>
			<publis_bill_125/>
			<newspap_sale/>
			<publis_sale/>
			<lent_amt/>
			<etc_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Tue Mar 31 16:32:04 KST 2009 */ %>