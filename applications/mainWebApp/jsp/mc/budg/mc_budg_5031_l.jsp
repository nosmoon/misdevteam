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
	MC_BUDG_5031_LDataSet ds = (MC_BUDG_5031_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_5031_LCURLISTRecord rec = (MC_BUDG_5031_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk1", rec.chk1);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_nm", rec.budg_nm);
			//rx.add(record, "evnt_cd", rec.evnt_cd);
			//rx.add(record, "evnt_nm", rec.evnt_nm);
			//rx.add(record, "last_asin_amt", rec.last_asin_amt);
			//rx.add(record, "budg_ask_amt", rec.budg_ask_amt);
			//rx.add(record, "budg_cndt_amt", rec.budg_cndt_amt);
			//rx.add(record, "amt1", rec.amt1);
			//rx.add(record, "amt2", rec.amt2);
			rx.add(record, "chk1", StringUtil.replaceToXml(rec.chk1));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			rx.add(record, "last_asin_amt", StringUtil.replaceToXml(rec.last_asin_amt));
			rx.add(record, "budg_ask_amt", StringUtil.replaceToXml(rec.budg_ask_amt));
			rx.add(record, "budg_cndt_amt", StringUtil.replaceToXml(rec.budg_cndt_amt));
			rx.add(record, "amt1", StringUtil.replaceToXml(rec.amt1));
			rx.add(record, "amt2", StringUtil.replaceToXml(rec.amt2));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<mc_budg_5031_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk1/>
				<budg_cd/>
				<budg_nm/>
				<evnt_cd/>
				<evnt_nm/>
				<last_asin_amt/>
				<budg_ask_amt/>
				<budg_cndt_amt/>
				<amt1/>
				<amt2/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_5031_l>
*/
%>

<% /* �ۼ��ð� : Mon Jul 13 15:28:19 KST 2009 */ %>