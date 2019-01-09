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
	MC_BUDG_4031_LDataSet ds = (MC_BUDG_4031_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4031_LCURLISTRecord rec = (MC_BUDG_4031_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "irssgbnm", rec.irssgbnm);
			rx.add(record, "a_irbuseocd", rec.a_irbuseocd);
			rx.add(record, "a_iryscd", rec.a_iryscd);
			rx.add(record, "a_iryscym", rec.a_iryscym);
			rx.add(record, "a_iramt", rec.a_iramt);
			rx.add(record, "t1_irbuseocd", rec.t1_irbuseocd);
			rx.add(record, "t1_iryscd", rec.t1_iryscd);
			rx.add(record, "t1_iryscym", rec.t1_iryscym);
			rx.add(record, "t1_iramt", rec.t1_iramt);
			//rx.add(record, "irssgbnm", StringUtil.replaceToXml(rec.irssgbnm));
			//rx.add(record, "a_irbuseocd", StringUtil.replaceToXml(rec.a_irbuseocd));
			//rx.add(record, "a_iryscd", StringUtil.replaceToXml(rec.a_iryscd));
			//rx.add(record, "a_iryscym", StringUtil.replaceToXml(rec.a_iryscym));
			//rx.add(record, "a_iramt", StringUtil.replaceToXml(rec.a_iramt));
			//rx.add(record, "t1_irbuseocd", StringUtil.replaceToXml(rec.t1_irbuseocd));
			//rx.add(record, "t1_iryscd", StringUtil.replaceToXml(rec.t1_iryscd));
			//rx.add(record, "t1_iryscym", StringUtil.replaceToXml(rec.t1_iryscym));
			//rx.add(record, "t1_iramt", StringUtil.replaceToXml(rec.t1_iramt));
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
<mc_budg_4031_l>
	<dataSet>
		<CURLIST>
			<record>
				<irssgbnm/>
				<a_irbuseocd/>
				<a_iryscd/>
				<a_iryscym/>
				<a_iramt/>
				<t1_irbuseocd/>
				<t1_iryscd/>
				<t1_iryscym/>
				<t1_iramt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4031_l>
*/
%>

<% /* 작성시간 : Thu Apr 16 12:07:34 KST 2009 */ %>