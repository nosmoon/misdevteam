<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2103_LDataSet ds = (MT_PAPINOUT_2103_LDataSet)request.getAttribute("ds");
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
			MT_PAPINOUT_2103_LCURLISTRecord rec = (MT_PAPINOUT_2103_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "base_dt", rec.base_dt);
			rx.add(record, "mg_chk_10", rec.mg_chk_10);
			rx.add(record, "mg_chk_20", rec.mg_chk_20);
			rx.add(record, "mg_user_10", rec.mg_user_10);
			rx.add(record, "mg_user_20", rec.mg_user_20);
			rx.add(record, "mg_dt_10", rec.mg_dt_10);
			rx.add(record, "mg_dt_20", rec.mg_dt_20);
			//rx.add(record, "base_dt", StringUtil.replaceToXml(rec.base_dt));
			//rx.add(record, "mg_chk_10", StringUtil.replaceToXml(rec.mg_chk_10));
			//rx.add(record, "mg_chk_20", StringUtil.replaceToXml(rec.mg_chk_20));
			//rx.add(record, "mg_user_10", StringUtil.replaceToXml(rec.mg_user_10));
			//rx.add(record, "mg_user_20", StringUtil.replaceToXml(rec.mg_user_20));
			//rx.add(record, "mg_dt_10", StringUtil.replaceToXml(rec.mg_dt_10));
			//rx.add(record, "mg_dt_20", StringUtil.replaceToXml(rec.mg_dt_20));
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
<mt_papinout_2103_l>
	<dataSet>
		<CURLIST>
			<record>
				<base_dt/>
				<mg_chk_10/>
				<mg_chk_20/>
				<mg_user_10/>
				<mg_user_20/>
				<mg_dt_10/>
				<mg_dt_20/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papinout_2103_l>
*/
%>

<% /* 작성시간 : Wed Sep 23 21:38:15 KST 2009 */ %>