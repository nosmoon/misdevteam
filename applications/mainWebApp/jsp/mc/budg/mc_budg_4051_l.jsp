<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_4051_LDataSet ds = (MC_BUDG_4051_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4051_LCURLISTRecord rec = (MC_BUDG_4051_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bjamt", rec.bjamt);
			rx.add(record, "eramt", rec.eramt);
			rx.add(record, "jhamt", rec.jhamt);
			rx.add(record, "cgamt", rec.cgamt);
			//rx.add(record, "bjamt", StringUtil.replaceToXml(rec.bjamt));
			//rx.add(record, "eramt", StringUtil.replaceToXml(rec.eramt));
			//rx.add(record, "jhamt", StringUtil.replaceToXml(rec.jhamt));
			//rx.add(record, "cgamt", StringUtil.replaceToXml(rec.cgamt));
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
<mc_budg_4051_l>
	<dataSet>
		<CURLIST>
			<record>
				<bjamt/>
				<eramt/>
				<jhamt/>
				<cgamt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4051_l>
*/
%>

<% /* 작성시간 : Fri May 29 19:39:59 KST 2009 */ %>