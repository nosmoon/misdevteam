<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_5008_LDataSet ds = (MT_PAPORD_5008_LDataSet)request.getAttribute("ds");
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
			MT_PAPORD_5008_LCURLISTRecord rec = (MT_PAPORD_5008_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "a_roll", rec.a_roll);
			rx.add(record, "c_roll", rec.c_roll);
			rx.add(record, "b_roll", rec.b_roll);
			rx.add(record, "car_cnt", rec.car_cnt);
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "a_roll", StringUtil.replaceToXml(rec.a_roll));
			//rx.add(record, "c_roll", StringUtil.replaceToXml(rec.c_roll));
			//rx.add(record, "b_roll", StringUtil.replaceToXml(rec.b_roll));
			//rx.add(record, "car_cnt", StringUtil.replaceToXml(rec.car_cnt));
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
<mt_papord_5008_l>
	<dataSet>
		<CURLIST>
			<record>
				<fac_clsf/>
				<a_roll/>
				<c_roll/>
				<b_roll/>
				<car_cnt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_5008_l>
*/
%>

<% /* 작성시간 : Tue Nov 10 22:52:07 KST 2009 */ %>