<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.close.rec.*
	,	chosun.ciis.mt.close.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_CLOSE_4002_LDataSet ds = (MT_CLOSE_4002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "dstb_rat_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_CLOSE_4002_LCURLISTRecord rec = (MT_CLOSE_4002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
//			rx.add(record, "cdnm", rec.cdnm);
//			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "label", rec.cdnm_cd);
//			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
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
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed May 06 16:34:10 KST 2009 */ %>