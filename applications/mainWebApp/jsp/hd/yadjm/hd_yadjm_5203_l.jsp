<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_5203_LDataSet ds = (HD_YADJM_5203_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_5203_LCURLISTRecord rec = (HD_YADJM_5203_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "result", rec.result);
			//rx.add(record, "result", StringUtil.replaceToXml(rec.result));
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
<hd_yadjm_5203_l>
	<dataSet>
		<CURLIST>
			<record>
				<result/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_5203_l>
*/
%>

<% /* �ۼ��ð� : Mon Jan 25 14:24:49 KST 2010 */ %>