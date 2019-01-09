<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_7001_LDataSet ds = (HD_SALY_7001_LDataSet)request.getAttribute("ds");
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
			HD_SALY_7001_LCURLISTRecord rec = (HD_SALY_7001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aply_basi_mm", rec.aply_basi_mm);
			rx.add(record, "saly_amt_fr", rec.saly_amt_fr);
			rx.add(record, "saly_amt_to", rec.saly_amt_to);
			rx.add(record, "faml_1", rec.faml_1);
			rx.add(record, "faml_2", rec.faml_2);
			rx.add(record, "faml_3", rec.faml_3);
			rx.add(record, "faml_4", rec.faml_4);
			rx.add(record, "faml_5", rec.faml_5);
			rx.add(record, "faml_6", rec.faml_6);
			rx.add(record, "faml_7", rec.faml_7);
			rx.add(record, "faml_8", rec.faml_8);
			rx.add(record, "faml_9", rec.faml_9);
			rx.add(record, "faml_10", rec.faml_10);
			rx.add(record, "faml_11", rec.faml_11);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "aply_basi_mm", StringUtil.replaceToXml(rec.aply_basi_mm));
			//rx.add(record, "saly_amt_fr", StringUtil.replaceToXml(rec.saly_amt_fr));
			//rx.add(record, "saly_amt_to", StringUtil.replaceToXml(rec.saly_amt_to));
			//rx.add(record, "faml_1", StringUtil.replaceToXml(rec.faml_1));
			//rx.add(record, "faml_2", StringUtil.replaceToXml(rec.faml_2));
			//rx.add(record, "faml_3", StringUtil.replaceToXml(rec.faml_3));
			//rx.add(record, "faml_4", StringUtil.replaceToXml(rec.faml_4));
			//rx.add(record, "faml_5", StringUtil.replaceToXml(rec.faml_5));
			//rx.add(record, "faml_6", StringUtil.replaceToXml(rec.faml_6));
			//rx.add(record, "faml_7", StringUtil.replaceToXml(rec.faml_7));
			//rx.add(record, "faml_8", StringUtil.replaceToXml(rec.faml_8));
			//rx.add(record, "faml_9", StringUtil.replaceToXml(rec.faml_9));
			//rx.add(record, "faml_10", StringUtil.replaceToXml(rec.faml_10));
			//rx.add(record, "faml_11", StringUtil.replaceToXml(rec.faml_11));
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
<hd_saly_7001_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<aply_basi_mm/>
				<saly_amt_fr/>
				<saly_amt_to/>
				<faml_1/>
				<faml_2/>
				<faml_3/>
				<faml_4/>
				<faml_5/>
				<faml_6/>
				<faml_7/>
				<faml_8/>
				<faml_9/>
				<faml_10/>
				<faml_11/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_7001_l>
*/
%>

<% /* 작성시간 : Mon Jul 06 14:33:25 KST 2015 */ %>