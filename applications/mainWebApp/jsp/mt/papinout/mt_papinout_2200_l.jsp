<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2200_LDataSet ds = (MT_PAPINOUT_2200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "fac_clsf", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_2200_LCURLISTRecord rec = (MT_PAPINOUT_2200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		recordSet = rx.add(dataSet, "login_fac_clsf", ds.fac_clsf);
		recordSet = rx.add(dataSet, "login_chk_yn"  , ds.uprc_yn);
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
			<cd/>
			<cdnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Sat May 23 12:51:45 KST 2009 */ %>