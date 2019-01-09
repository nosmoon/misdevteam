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
	HD_EVLU_4001_LDataSet ds = (HD_EVLU_4001_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_4001_LCURLISTRecord rec = (HD_EVLU_4001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "use_chk", rec.use_chk);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "evlu_obj_bgn_dd", rec.evlu_obj_bgn_dd);
			rx.add(record, "evlu_obj_end_dd", rec.evlu_obj_end_dd);
			//rx.add(record, "use_chk", StringUtil.replaceToXml(rec.use_chk));
			//rx.add(record, "frdt", StringUtil.replaceToXml(rec.frdt));
			//rx.add(record, "todt", StringUtil.replaceToXml(rec.todt));
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
<hd_evlu_4001_l>
	<dataSet>
		<CURLIST>
			<record>
				<use_chk/>
				<frdt/>
				<todt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_4001_l>
*/
%>

<% /* 작성시간 : Wed Oct 28 21:45:10 KST 2009 */ %>