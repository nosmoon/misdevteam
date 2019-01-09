<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1403_LDataSet ds = (AS_ASET_1403_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1403_LCURLISTRecord rec = (AS_ASET_1403_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.add(record, "ndduc_rate", rec.ndduc_rate);
			rx.add(record, "ndduc_amt", rec.ndduc_amt);
			rx.add(record, "chg_vat_amt", rec.chg_vat_amt);
			rx.add(record, "add_vat", rec.add_vat);
			rx.add(record, "acct_agg_amt", rec.acct_agg_amt);
			rx.add(record, "budg_cd", rec.budg_cd);
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
			<budg_nm/>
			<aset_no/>
			<aset_nm/>
			<ndduc_rate/>
			<ndduc_amt/>
			<chg_vat_amt/>
			<add_vat/>
			<acct_agg_amt/>
			<budg_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Tue Mar 17 19:21:27 KST 2009 */ %>