<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_6510_LDataSet ds = (MT_COMMATR_6510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_6510_LCURLISTRecord rec = (MT_COMMATR_6510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yyyy", rec.yyyy);
  			rx.add(record, "mm", rec.mm);
			rx.add(record, "a10_1", rec.a10_1);
			rx.add(record, "a10_2", rec.a10_2);
			rx.add(record, "a10_3", rec.a10_3);
			rx.add(record, "a10_4", rec.a10_4);
			rx.add(record, "a10_5", rec.a10_5);
			rx.add(record, "a10_6", rec.a10_6);
			rx.add(record, "a22_1", rec.a22_1);
			rx.add(record, "a22_2", rec.a22_2);
			rx.add(record, "a22_3", rec.a22_3);
			rx.add(record, "a22_4", rec.a22_4);
			rx.add(record, "a22_5", rec.a22_5);
			rx.add(record, "a22_6", rec.a22_6);
			rx.add(record, "a25_1", rec.a25_1);
			rx.add(record, "a25_2", rec.a25_2);
			rx.add(record, "a25_3", rec.a25_3);
			rx.add(record, "a25_4", rec.a25_4);
			rx.add(record, "a25_5", rec.a25_5);
			rx.add(record, "a25_6", rec.a25_6);
			rx.add(record, "a_1", rec.a_1);
			rx.add(record, "a_2", rec.a_2);
			rx.add(record, "a_3", rec.a_3);
			rx.add(record, "a_4", rec.a_4);
			rx.add(record, "a_5", rec.a_5);
			rx.add(record, "a_6", rec.a_6);
			//rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			//rx.add(record, "a10_1", StringUtil.replaceToXml(rec.a10_1));
			//rx.add(record, "a10_2", StringUtil.replaceToXml(rec.a10_2));
			//rx.add(record, "a10_3", StringUtil.replaceToXml(rec.a10_3));
			//rx.add(record, "a10_4", StringUtil.replaceToXml(rec.a10_4));
			//rx.add(record, "a10_5", StringUtil.replaceToXml(rec.a10_5));
			//rx.add(record, "a10_6", StringUtil.replaceToXml(rec.a10_6));
			//rx.add(record, "a22_1", StringUtil.replaceToXml(rec.a22_1));
			//rx.add(record, "a22_2", StringUtil.replaceToXml(rec.a22_2));
			//rx.add(record, "a22_3", StringUtil.replaceToXml(rec.a22_3));
			//rx.add(record, "a22_4", StringUtil.replaceToXml(rec.a22_4));
			//rx.add(record, "a22_5", StringUtil.replaceToXml(rec.a22_5));
			//rx.add(record, "a22_6", StringUtil.replaceToXml(rec.a22_6));
			//rx.add(record, "a25_1", StringUtil.replaceToXml(rec.a25_1));
			//rx.add(record, "a25_2", StringUtil.replaceToXml(rec.a25_2));
			//rx.add(record, "a25_3", StringUtil.replaceToXml(rec.a25_3));
			//rx.add(record, "a25_4", StringUtil.replaceToXml(rec.a25_4));
			//rx.add(record, "a25_5", StringUtil.replaceToXml(rec.a25_5));
			//rx.add(record, "a25_6", StringUtil.replaceToXml(rec.a25_6));
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
<mt_commatr_6510_l>
	<dataSet>
		<CURLIST>
			<record>
				<yymm/>
				<a10_1/>
				<a10_2/>
				<a10_3/>
				<a10_4/>
				<a10_5/>
				<a10_6/>
				<a22_1/>
				<a22_2/>
				<a22_3/>
				<a22_4/>
				<a22_5/>
				<a22_6/>
				<a25_1/>
				<a25_2/>
				<a25_3/>
				<a25_4/>
				<a25_5/>
				<a25_6/>
			</record>
		</CURLIST>
	</dataSet>
</mt_commatr_6510_l>
*/
%>

<% /* 작성시간 : Thu Sep 12 14:17:27 KST 2013 */ %>