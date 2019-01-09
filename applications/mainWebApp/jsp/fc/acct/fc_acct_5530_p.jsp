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
	FC_ACCT_5530_PDataSet ds = (FC_ACCT_5530_PDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURACCTSUM BEGIN */
		recordSet = rx.add(dataSet, "CURACCTSUM", "");

		for(int i = 0; i < ds.curacctsum.size(); i++) {
			FC_ACCT_5530_PCURACCTSUMRecord rec = (FC_ACCT_5530_PCURACCTSUMRecord)ds.curacctsum.get(i);
			int record = rx.add(recordSet, "record", "");
		}
		rx.add(recordSet, "totalcnt", ds.curacctsum.size());
		/****** CURACCTSUM END */

		/****** CURCOMMLIST BEGIN */
		recordSet = rx.add(dataSet, "CURCOMMLIST", "");

		for(int i = 0; i < ds.curcommlist.size(); i++) {
			FC_ACCT_5530_PCURCOMMLISTRecord rec = (FC_ACCT_5530_PCURCOMMLISTRecord)ds.curcommlist.get(i);
			int record = rx.add(recordSet, "record", "");
		}
		rx.add(recordSet, "totalcnt", ds.curcommlist.size());
		/****** CURCOMMLIST END */

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
<fc_acct_5530_p>
	<dataSet>
		<CURACCTSUM>
			<record>
			</record>
		</CURACCTSUM>
	</dataSet>
</fc_acct_5530_p>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_acct_5530_p>
	<dataSet>
		<CURCOMMLIST>
			<record>
			</record>
		</CURCOMMLIST>
	</dataSet>
</fc_acct_5530_p>
*/
%>

<% /* �ۼ��ð� : Mon Aug 10 16:00:46 KST 2009 */ %>