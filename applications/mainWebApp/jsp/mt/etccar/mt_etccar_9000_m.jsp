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
	MT_ETCCAR_9000_MDataSet ds = (MT_ETCCAR_9000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int formData = 0;
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	recordSet = rx.add(root, "tempData", "");
	formData = rx.add(recordSet, "cd_clsf", "");
	try {
		/****** CURLIST BEGIN */
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCCAR_9000_MCURLISTRecord rec = (MT_ETCCAR_9000_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
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
<mt_etccar_9000_m>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cdnm_cd/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_9000_m>
*/
%>

<% /* �ۼ��ð� : Thu Aug 23 17:47:35 KST 2012 */ %>