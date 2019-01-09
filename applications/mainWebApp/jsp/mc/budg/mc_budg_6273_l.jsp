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
	MC_BUDG_6273_LDataSet ds = (MC_BUDG_6273_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6273_LCURLISTRecord rec = (MC_BUDG_6273_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "t1_yscd", rec.t1_yscd);
			//rx.add(record, "t1_ysnm", rec.t1_ysnm);
			//rx.add(record, "t1_buseocd", rec.t1_buseocd);
			//rx.add(record, "t1_buseocdnm", rec.t1_buseocdnm);
			//rx.add(record, "t1_yscym", rec.t1_yscym);
			//rx.add(record, "t1_ht1", rec.t1_ht1);
			//rx.add(record, "t1_ht2", rec.t1_ht2);
			//rx.add(record, "biyul", rec.biyul);
			//rx.add(record, "t1_ht3", rec.t1_ht3);
			rx.add(record, "t1_yscd", StringUtil.replaceToXml(rec.t1_yscd));
			rx.add(record, "t1_ysnm", StringUtil.replaceToXml(rec.t1_ysnm));
			rx.add(record, "t1_buseocd", StringUtil.replaceToXml(rec.t1_buseocd));
			rx.add(record, "t1_buseocdnm", StringUtil.replaceToXml(rec.t1_buseocdnm));
			rx.add(record, "t1_yscym", StringUtil.replaceToXml(rec.t1_yscym));
			rx.add(record, "t1_ht1", StringUtil.replaceToXml(rec.t1_ht1));
			rx.add(record, "t1_ht2", StringUtil.replaceToXml(rec.t1_ht2));
			rx.add(record, "biyul", StringUtil.replaceToXml(rec.biyul));
			rx.add(record, "t1_ht3", StringUtil.replaceToXml(rec.t1_ht3));
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
<mc_budg_6273_l>
	<dataSet>
		<CURLIST>
			<record>
				<t1_yscd/>
				<t1_ysnm/>
				<t1_buseocd/>
				<t1_buseocdnm/>
				<t1_yscym/>
				<t1_ht1/>
				<t1_ht2/>
				<biyul/>
				<t1_ht3/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6273_l>
*/
%>

<% /* 작성시간 : Wed May 13 12:09:14 KST 2009 */ %>