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
	MC_BUDG_6058_LDataSet ds = (MC_BUDG_6058_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6058_LCURLISTRecord rec = (MC_BUDG_6058_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
            //rx.add(record, "chk", rec.chk);
            //rx.add(record, "brnm1", rec.brnm1);
            //rx.add(record, "brcd", rec.brcd);
            //rx.add(record, "brnm", rec.brnm);
            //rx.add(record, "a_total", rec.a_total);
            //rx.add(record, "b_total", rec.b_total);
            //rx.add(record, "biyul", rec.biyul);
            //rx.add(record, "camt", rec.camt);
            rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
            rx.add(record, "brnm1", StringUtil.replaceToXml(rec.brnm1));
            rx.add(record, "brcd", StringUtil.replaceToXml(rec.brcd));
            rx.add(record, "brnm", StringUtil.replaceToXml(rec.brnm));
            rx.add(record, "a_total", StringUtil.replaceToXml(rec.a_total));
            rx.add(record, "b_total", StringUtil.replaceToXml(rec.b_total));
            rx.add(record, "biyul", StringUtil.replaceToXml(rec.biyul));
            rx.add(record, "camt", StringUtil.replaceToXml(rec.camt));
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
<mc_budg_6058_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk/>
				<brnm1/>
				<brcd/>
				<brnm/>
				<a_total/>
				<b_total/>
				<biyul/>
				<camt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6058_l>
*/
%>

<% /* 작성시간 : Tue May 12 16:18:06 KST 2009 */ %>