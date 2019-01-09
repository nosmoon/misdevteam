<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.dwnwrk.rec.*
	,	chosun.ciis.hd.dwnwrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DWNWRK_1101_LDataSet ds = (HD_DWNWRK_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "dutyBehvInfo", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DWNWRK_1101_LCURLISTRecord rec = (HD_DWNWRK_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf);
			rx.add(record, "finish_dd_clsf_nm", rec.finish_dd_clsf_nm);
			rx.add(record, "finish_tm", rec.finish_tm);
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
<dataSet>
	<CURLIST>
		<record>
			<prsnt_tm/>
			<finish_dd_clsf/>
			<finish_dd_clsf_nm/>
			<finish_tm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 24 09:13:08 KST 2009 */ %>