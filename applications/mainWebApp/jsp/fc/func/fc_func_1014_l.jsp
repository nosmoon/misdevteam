<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1014_LDataSet ds = (FC_FUNC_1014_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1014_LCURLISTRecord rec = (FC_FUNC_1014_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pubc_frdt", rec.pubc_frdt);
			rx.add(record, "pubc_todt", rec.pubc_todt);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "slcrg_pers_nm", rec.slcrg_pers_nm);
			//rx.add(record, "pubc_frdt", StringUtil.replaceToXml(rec.pubc_frdt));
			//rx.add(record, "pubc_todt", StringUtil.replaceToXml(rec.pubc_todt));
			//rx.add(record, "slcrg_pers", StringUtil.replaceToXml(rec.slcrg_pers));
			//rx.add(record, "slcrg_pers_nm", StringUtil.replaceToXml(rec.slcrg_pers_nm));
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
<fc_func_1014_l>
	<dataSet>
		<CURLIST>
			<record>
				<pubc_frdt/>
				<pubc_todt/>
				<slcrg_pers/>
				<slcrg_pers_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1014_l>
*/
%>

<% /* �ۼ��ð� : Wed Apr 22 17:39:30 KST 2009 */ %>