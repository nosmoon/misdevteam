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
	MC_BUDG_5151_LDataSet ds = (MC_BUDG_5151_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_5151_LCURLISTRecord rec = (MC_BUDG_5151_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "a_ycbrcd", rec.a_ycbrcd);
			rx.add(record, "brcdnm", rec.brcdnm);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "fix_asin_amt", rec.fix_asin_amt);
			rx.add(record, "budg_cndt_amt", rec.budg_cndt_amt);
			rx.add(record, "camt", rec.camt);
			rx.add(record, "brcd1", rec.brcd1);
			rx.add(record, "brnm1", rec.brnm1);
			rx.add(record, "brcd2", rec.brcd2);
			rx.add(record, "brnm2", rec.brnm2);
			rx.add(record, "brcd3", rec.brcd3);
			rx.add(record, "brnm3", rec.brnm3);
			rx.add(record, "brcd4", rec.brcd4);
			rx.add(record, "brnm4", rec.brnm4);
			rx.add(record, "bfe_budg_cndt_amt", rec.bfe_budg_cndt_amt);
			//rx.add(record, "a_ycbrcd", StringUtil.replaceToXml(rec.a_ycbrcd));
			//rx.add(record, "brcdnm", StringUtil.replaceToXml(rec.brcdnm));
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "fix_asin_amt", StringUtil.replaceToXml(rec.fix_asin_amt));
			//rx.add(record, "budg_cndt_amt", StringUtil.replaceToXml(rec.budg_cndt_amt));
			//rx.add(record, "camt", StringUtil.replaceToXml(rec.camt));
			//rx.add(record, "brcd1", StringUtil.replaceToXml(rec.brcd1));
			//rx.add(record, "brnm1", StringUtil.replaceToXml(rec.brnm1));
			//rx.add(record, "brcd2", StringUtil.replaceToXml(rec.brcd2));
			//rx.add(record, "brnm2", StringUtil.replaceToXml(rec.brnm2));
			//rx.add(record, "brcd3", StringUtil.replaceToXml(rec.brcd3));
			//rx.add(record, "brnm3", StringUtil.replaceToXml(rec.brnm3));
			//rx.add(record, "brcd4", StringUtil.replaceToXml(rec.brcd4));
			//rx.add(record, "brnm4", StringUtil.replaceToXml(rec.brnm4));
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
<mc_budg_5151_l>
	<dataSet>
		<CURLIST>
			<record>
				<a_ycbrcd/>
				<brcdnm/>
				<budg_yymm/>
				<fix_asin_amt/>
				<budg_cndt_amt/>
				<camt/>
				<brcd1/>
				<brnm1/>
				<brcd2/>
				<brnm2/>
				<brcd3/>
				<brnm3/>
				<brcd4/>
				<brnm4/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_5151_l>
*/
%>

<% /* 작성시간 : Fri May 15 20:15:14 KST 2009 */ %>