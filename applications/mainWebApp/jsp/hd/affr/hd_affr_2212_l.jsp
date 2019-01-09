<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_2212_LDataSet ds = (HD_AFFR_2212_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_2212_LCURLISTRecord rec = (HD_AFFR_2212_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_lcls_cd", rec.emp_lcls_cd);
			rx.add(record, "congr_condl_cd", rec.congr_condl_cd);
			rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
			rx.add(record, "congr_condl_fee", rec.congr_condl_fee);
			rx.add(record, "art_flower", rec.art_flower);
			rx.add(record, "ofcr_congr_condl_fee", rec.ofcr_congr_condl_fee);
			rx.add(record, "ofcr_art_flower", rec.ofcr_art_flower);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
<tempData>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_lcls_cd/>
			<congr_condl_cd/>
			<frdt/>
			<todt/>
			<congr_condl_fee/>
			<art_flower/>
			<ofcr_congr_condl_fee/>
			<ofcr_art_flower/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* 작성시간 : Sun Jun 28 14:02:12 KST 2009 */ %>