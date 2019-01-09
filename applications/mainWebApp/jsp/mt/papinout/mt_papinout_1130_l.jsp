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
	MT_PAPINOUT_1130_LDataSet ds = (MT_PAPINOUT_1130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "resData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_1130_LCURLISTRecord rec = (MT_PAPINOUT_1130_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "roll_wgt10", rec.roll_wgt10);
			rx.add(record, "roll_wgt20", rec.roll_wgt20);
			rx.add(record, "roll_wgt22", rec.roll_wgt22);
			rx.add(record, "roll_wgt25", rec.roll_wgt25);
			rx.add(record, "roll_wgttot", rec.roll_wgttot);
			//rx.add(record, "roll_wgt10", StringUtil.replaceToXml(rec.roll_wgt10));
			//rx.add(record, "roll_wgt20", StringUtil.replaceToXml(rec.roll_wgt20));
			//rx.add(record, "roll_wgt22", StringUtil.replaceToXml(rec.roll_wgt22));
			//rx.add(record, "roll_wgt25", StringUtil.replaceToXml(rec.roll_wgt25));
			//rx.add(record, "roll_wgttot", StringUtil.replaceToXml(rec.roll_wgttot));
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
<mt_papinout_1130_l>
	<dataSet>
		<CURLIST>
			<record>
				<roll_wgt10/>
				<roll_wgt20/>
				<roll_wgt22/>
				<roll_wgt25/>
				<roll_wgttot/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papinout_1130_l>
*/
%>

<% /* 작성시간 : Tue Jul 31 09:28:05 KST 2012 */ %>