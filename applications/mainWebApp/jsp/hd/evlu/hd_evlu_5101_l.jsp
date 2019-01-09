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
	HD_EVLU_5101_LDataSet ds = (HD_EVLU_5101_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_5101_LCURLISTRecord rec = (HD_EVLU_5101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dtls_view", rec.dtls_view);
			rx.add(record, "dtls_item_cd", rec.dtls_item_cd);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "db_status", rec.db_status);
			//rx.add(record, "dtls_view", StringUtil.replaceToXml(rec.dtls_view));
			//rx.add(record, "dtls_item_cd", StringUtil.replaceToXml(rec.dtls_item_cd));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "db_status", StringUtil.replaceToXml(rec.db_status));
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
TrustForm의 Instance 선언부에 복사해서 사용
<hd_evlu_5101_l>
	<dataSet>
		<CURLIST>
			<record>
				<dtls_view/>
				<dtls_item_cd/>
				<remk/>
				<db_status/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5101_l>
*/
%>

<% /* 작성시간 : Fri May 22 10:29:09 KST 2009 */ %>