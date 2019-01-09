<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.hlywrk.rec.*
	,	chosun.ciis.hd.hlywrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_HLYWRK_1304_344_LDataSet ds = (HD_HLYWRK_1304_344_LDataSet)request.getAttribute("ds");
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
			HD_HLYWRK_1304_344_LCURLISTRecord rec = (HD_HLYWRK_1304_344_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "base_alon", rec.base_alon);
			rx.add(record, "cmpn_alon", rec.cmpn_alon);
			//rx.add(record, "base_alon", StringUtil.replaceToXml(rec.base_alon));
			//rx.add(record, "cmpn_alon", StringUtil.replaceToXml(rec.cmpn_alon));
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
<hd_hlywrk_1304_344_l>
	<dataSet>
		<CURLIST>
			<record>
				<base_alon/>
				<cmpn_alon/>
			</record>
		</CURLIST>
	</dataSet>
</hd_hlywrk_1304_344_l>
*/
%>

<% /* 작성시간 : Mon Nov 05 16:10:24 KST 2012 */ %>