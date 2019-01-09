<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.mach.rec.*
	,	chosun.ciis.as.mach.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_MACH_1030_LDataSet ds = (AS_MACH_1030_LDataSet)request.getAttribute("ds");
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
			AS_MACH_1030_LCURLISTRecord rec = (AS_MACH_1030_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "mach_seq", rec.mach_seq);
			rx.add(record, "as_seq", rec.as_seq);
			rx.add(record, "mach_as_dt", rec.mach_as_dt);
			rx.addCData(record, "as_comp", rec.as_comp);
			rx.add(record, "as_fee", rec.as_fee);
			rx.addCData(record, "as_cont", rec.as_cont);
			rx.addCData(record, "remk", rec.remk);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "mach_seq", StringUtil.replaceToXml(rec.mach_seq));
			//rx.add(record, "as_seq", StringUtil.replaceToXml(rec.as_seq));
			//rx.add(record, "mach_as_dt", StringUtil.replaceToXml(rec.mach_as_dt));
			//rx.add(record, "as_comp", StringUtil.replaceToXml(rec.as_comp));
			//rx.add(record, "as_fee", StringUtil.replaceToXml(rec.as_fee));
			//rx.add(record, "as_cont", StringUtil.replaceToXml(rec.as_cont));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<as_mach_1030_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<mach_seq/>
				<as_seq/>
				<mach_as_dt/>
				<as_comp/>
				<as_fee/>
				<as_cont/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</as_mach_1030_l>
*/
%>

<% /* 작성시간 : Fri Jun 12 16:23:21 KST 2015 */ %>