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
	AS_ASET_1601_LDataSet ds = (AS_ASET_1601_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1601_LCURLISTRecord rec = (AS_ASET_1601_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "aset_nm", rec.aset_nm);
			rx.add(record, "sale_now_acqr_amt", rec.sale_now_acqr_amt);
			rx.add(record, "sale_redm_tot_amt", rec.sale_redm_tot_amt);
			rx.add(record, "sale_un_redm_amt", rec.sale_un_redm_amt);
			rx.add(record, "sale_pfls_amt", rec.sale_pfls_amt);
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
			<aset_no/>
			<aset_nm/>
			<sale_now_acqr_amt/>
			<sale_redm_tot_amt/>
			<sale_un_redm_amt/>
			<sale_pfls_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Mar 19 16:29:23 KST 2009 */ %>