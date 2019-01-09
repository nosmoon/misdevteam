<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.common.rec.*
	,	chosun.ciis.mt.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMON_DLCO_0002_LDataSet ds = (MT_COMMON_DLCO_0002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMON_DLCO_0002_LCURLISTRecord rec = (MT_COMMON_DLCO_0002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "dlco_abrv_nm", rec.dlco_abrv_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "fax_no", rec.fax_no);
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
			<dlco_no/>
			<ern/>
			<dlco_abrv_nm/>
			<dlco_nm/>
			<presi_nm/>
			<addr/>
			<tel_no/>
			<fax_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri May 01 11:24:18 KST 2009 */ %>