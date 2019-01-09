<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_1120_LDataSet ds = (HD_INFO_1120_LDataSet)request.getAttribute("ds");
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
			HD_INFO_1120_LCURLISTRecord rec = (HD_INFO_1120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "frdt", StringUtil.replaceToXml(rec.frdt));
			rx.add(record, "todt", StringUtil.replaceToXml(rec.todt));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			rx.add(record, "cur_jobnon_nm", StringUtil.replaceToXml(rec.cur_jobnon_nm));
			rx.add(record, "chrg_job", StringUtil.replaceToXml(rec.chrg_job));
			rx.add(record, "dtls_job", StringUtil.replaceToXml(rec.dtls_job));
			rx.add(record, "aprv_stat_yn", StringUtil.replaceToXml(rec.aprv_stat_yn));
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
			<frdt/>
			<todt/>
			<dept_nm/>
			<part_nm/>
			<cur_jobnon_nm/>
			<chrg_job/>
			<dtls_job/>
			<aprv_stat_yn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jul 15 21:05:02 KST 2009 */ %>