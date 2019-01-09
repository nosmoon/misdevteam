<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_8000_LDataSet ds = (HD_EVLU_8000_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_8000_LCURLISTRecord rec = (HD_EVLU_8000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "evlu_cd", rec.evlu_cd);
			rx.add(record, "evlu_cdnm", rec.evlu_cdnm);
			//rx.add(record, "evlu_cd", StringUtil.replaceToXml(rec.evlu_cd));
			//rx.add(record, "evlu_cdnm", StringUtil.replaceToXml(rec.evlu_cdnm));
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
<hd_evlu_8000_l>
	<dataSet>
		<CURLIST>
			<record>
				<evlu_cd/>
				<evlu_cdnm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_8000_l>
*/
%>

<% /* �ۼ��ð� : Thu May 21 17:45:25 KST 2009 */ %>