<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_2120_LDataSet ds = (HD_AFFR_2120_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_2120_LCURLISTRecord rec = (HD_AFFR_2120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_lcls_cd", StringUtil.replaceToXml(rec.emp_lcls_cd));
			rx.add(record, "congr_condl_cd", StringUtil.replaceToXml(rec.congr_condl_cd));
			rx.add(record, "congr_condl_fee", StringUtil.replaceToXml(rec.congr_condl_fee));
			rx.add(record, "art_flower", StringUtil.replaceToXml(rec.art_flower));
			rx.add(record, "ofcr_congr_condl_fee", StringUtil.replaceToXml(rec.ofcr_congr_condl_fee));
			rx.add(record, "ofcr_art_flower", StringUtil.replaceToXml(rec.ofcr_art_flower));
			rx.add(record, "aply_basi_dt", StringUtil.replaceToXml(rec.aply_basi_dt));
			//rx.add(record, "emp_lcls_cd", rec.emp_lcls_cd);
			//rx.add(record, "congr_condl_cd", rec.congr_condl_cd);
			//rx.add(record, "congr_condl_fee", rec.congr_condl_fee);
			//rx.add(record, "art_flower", rec.art_flower);
			//rx.add(record, "ofcr_congr_condl_fee", rec.ofcr_congr_condl_fee);
			//rx.add(record, "ofcr_art_flower", rec.ofcr_art_flower);
			//rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
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
<hd_affr_2120_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_lcls_cd/>
				<congr_condl_cd/>
				<congr_condl_fee/>
				<art_flower/>
				<ofcr_congr_condl_fee/>
				<ofcr_art_flower/>
				<aply_basi_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_2120_l>
*/
%>

<% /* 작성시간 : Mon Jul 20 20:12:01 KST 2009 */ %>