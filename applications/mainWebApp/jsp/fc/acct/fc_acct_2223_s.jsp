<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2223_SDataSet ds = (FC_ACCT_2223_SDataSet)request.getAttribute("ds");
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
			FC_ACCT_2223_SCURLISTRecord rec = (FC_ACCT_2223_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "slip_aprv_yn", rec.slip_aprv_yn);
			rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
			rx.add(record, "slip_aprv_yn", StringUtil.replaceToXml(rec.slip_aprv_yn));
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
<fc_acct_2223_s>
	<dataSet>
		<CURLIST>
			<record>
				<cnt/>
				<slip_aprv_yn/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2223_s>
*/
%>

<% /* �ۼ��ð� : Tue Jul 21 17:39:12 KST 2009 */ %>