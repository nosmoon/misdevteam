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
	FC_ACCT_2343_LDataSet ds = (FC_ACCT_2343_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2343_LCURLISTRecord rec = (FC_ACCT_2343_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "hjpsubseq", rec.hjpsubseq);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "hjpsubseq", StringUtil.replaceToXml(rec.hjpsubseq));
			//rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
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
<fc_acct_2343_l>
	<dataSet>
		<CURLIST>
			<record>
				<hjpsubseq/>
				<fisc_dt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2343_l>
*/
%>

<% /* �ۼ��ð� : Sat Apr 11 09:54:13 KST 2009 */ %>