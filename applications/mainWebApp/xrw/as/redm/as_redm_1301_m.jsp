<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.redm.rec.*
	,	chosun.ciis.as.redm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_REDM_1301_MDataSet ds = (AS_REDM_1301_MDataSet)request.getAttribute("ds");
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
			AS_REDM_1301_MCURLISTRecord rec = (AS_REDM_1301_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "aply_dt_label", rec.aply_dt_label);
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "aply_dt_label", StringUtil.replaceToXml(rec.aply_dt_label));
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
<as_redm_1301_m>
	<dataSet>
		<CURLIST>
			<record>
				<aply_dt/>
				<aply_dt_label/>
			</record>
		</CURLIST>
	</dataSet>
</as_redm_1301_m>
*/
%>

<% /* 작성시간 : Thu May 07 13:36:16 KST 2009 */ %>