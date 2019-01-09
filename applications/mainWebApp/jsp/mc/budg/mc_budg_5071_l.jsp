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
	MC_BUDG_5071_LDataSet ds = (MC_BUDG_5071_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_5071_LCURLISTRecord rec = (MC_BUDG_5071_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "checked", rec.checked);
			rx.add(record, "brnm1", rec.brnm1);
			rx.add(record, "brcd", rec.brcd);
			rx.add(record, "brnm", rec.brnm);
			rx.add(record, "blank", rec.blank);
			rx.add(record, "budg_cndt_amt", rec.budg_cndt_amt);
			rx.add(record, "tms", rec.tms);
			rx.add(record, "budg_cndt_amt1", rec.budg_cndt_amt1);
			rx.add(record, "insc_amt", rec.insc_amt);
			rx.add(record, "budg_cndt_incamt", rec.budg_cndt_incamt);
			rx.add(record, "budg_cndt_rate", rec.budg_cndt_rate);
			//rx.add(record, "checked", StringUtil.replaceToXml(rec.checked));
			//rx.add(record, "brnm1", StringUtil.replaceToXml(rec.brnm1));
			//rx.add(record, "brcd", StringUtil.replaceToXml(rec.brcd));
			//rx.add(record, "brnm", StringUtil.replaceToXml(rec.brnm));
			//rx.add(record, "blank", StringUtil.replaceToXml(rec.blank));
			//rx.add(record, "budg_cndt_amt", StringUtil.replaceToXml(rec.budg_cndt_amt));
			//rx.add(record, "tms", StringUtil.replaceToXml(rec.tms));
			//rx.add(record, "budg_cndt_amt1", StringUtil.replaceToXml(rec.budg_cndt_amt1));
			//rx.add(record, "insc_amt", StringUtil.replaceToXml(rec.insc_amt));
			//rx.add(record, "budg_cndt_incamt", StringUtil.replaceToXml(rec.budg_cndt_incamt));
			//rx.add(record, "budg_cndt_rate", StringUtil.replaceToXml(rec.budg_cndt_rate));
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
<mc_budg_5071_l>
	<dataSet>
		<CURLIST>
			<record>
				<checked/>
				<brnm1/>
				<brcd/>
				<brnm/>
				<blank/>
				<budg_cndt_amt/>
				<tms/>
				<budg_cndt_amt1/>
				<insc_amt/>
				<budg_cndt_incamt/>
				<budg_cndt_rate/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_5071_l>
*/
%>

<% /* 작성시간 : Fri Apr 17 13:41:04 KST 2009 */ %>