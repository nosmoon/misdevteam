<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_1005_LDataSet ds = (MT_ETCCAR_1005_LDataSet)request.getAttribute("ds");
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
			MT_ETCCAR_1005_LCURLISTRecord rec = (MT_ETCCAR_1005_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
			//rx.add(record, "clos_yn", rec.clos_yn);
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
<mt_etccar_1005_l>
	<dataSet>
		<CURLIST>
			<record>
				<clos_yn/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_1005_l>
*/
%>

<% /* �ۼ��ð� : Wed Sep 09 11:13:19 KST 2009 */ %>