<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1115_LDataSet ds = (FC_ACCT_1115_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_1115_LCURLISTRecord rec = (FC_ACCT_1115_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "sun", rec.sun);
			//rx.add(record, "sun_yn", rec.sun_yn);
			//rx.add(record, "mon", rec.mon);
			//rx.add(record, "mon_yn", rec.mon_yn);
			//rx.add(record, "tue", rec.tue);
			//rx.add(record, "tue_yn", rec.tue_yn);
			//rx.add(record, "wed", rec.wed);
			//rx.add(record, "wed_yn", rec.wed_yn);
			//rx.add(record, "thr", rec.thr);
			//rx.add(record, "thr_yn", rec.thr_yn);
			//rx.add(record, "fri", rec.fri);
			//rx.add(record, "fri_yn", rec.fri_yn);
			//rx.add(record, "sat", rec.sat);
			//rx.add(record, "sat_yn", rec.sat_yn);
			rx.add(record, "sun", StringUtil.replaceToXml(rec.sun));
			rx.add(record, "sun_yn", StringUtil.replaceToXml(rec.sun_yn));
			rx.add(record, "mon", StringUtil.replaceToXml(rec.mon));
			rx.add(record, "mon_yn", StringUtil.replaceToXml(rec.mon_yn));
			rx.add(record, "tue", StringUtil.replaceToXml(rec.tue));
			rx.add(record, "tue_yn", StringUtil.replaceToXml(rec.tue_yn));
			rx.add(record, "wed", StringUtil.replaceToXml(rec.wed));
			rx.add(record, "wed_yn", StringUtil.replaceToXml(rec.wed_yn));
			rx.add(record, "thr", StringUtil.replaceToXml(rec.thr));
			rx.add(record, "thr_yn", StringUtil.replaceToXml(rec.thr_yn));
			rx.add(record, "fri", StringUtil.replaceToXml(rec.fri));
			rx.add(record, "fri_yn", StringUtil.replaceToXml(rec.fri_yn));
			rx.add(record, "sat", StringUtil.replaceToXml(rec.sat));
			rx.add(record, "sat_yn", StringUtil.replaceToXml(rec.sat_yn));
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
<fc_acct_1115_l>
	<dataSet>
		<CURLIST>
			<record>
				<sun/>
				<sun_yn/>
				<mon/>
				<mon_yn/>
				<tue/>
				<tue_yn/>
				<wed/>
				<wed_yn/>
				<thr/>
				<thr_yn/>
				<fri/>
				<fri_yn/>
				<sat/>
				<sat_yn/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_1115_l>
*/
%>

<% /* 작성시간 : Wed Aug 12 17:10:56 KST 2009 */ %>