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
	FC_ACCT_2341_LDataSet ds = (FC_ACCT_2341_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2341_LCURLISTRecord rec = (FC_ACCT_2341_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "titl", rec.titl);
			rx.add(record, "reso_amt", rec.reso_amt);
			rx.add(record, "impt_expn_clsf", rec.impt_expn_clsf);
			rx.add(record, "expn_hope_dt", rec.expn_hope_dt);
			rx.add(record, "expn_clsf", rec.expn_clsf);
			//rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			//rx.add(record, "reso_amt", StringUtil.replaceToXml(rec.reso_amt));
			//rx.add(record, "impt_expn_clsf", StringUtil.replaceToXml(rec.impt_expn_clsf));
			//rx.add(record, "expn_hope_dt", StringUtil.replaceToXml(rec.expn_hope_dt));
			//rx.add(record, "expn_clsf", StringUtil.replaceToXml(rec.expn_clsf));
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
<fc_acct_2341_l>
	<dataSet>
		<CURLIST>
			<record>
				<titl/>
				<reso_amt/>
				<impt_expn_clsf/>
				<expn_hope_dt/>
				<expn_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2341_l>
*/
%>

<% /* �ۼ��ð� : Sat Apr 11 09:54:13 KST 2009 */ %>