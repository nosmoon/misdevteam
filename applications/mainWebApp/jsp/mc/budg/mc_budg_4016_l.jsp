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
	MC_BUDG_4016_LDataSet ds = (MC_BUDG_4016_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4016_LCURLISTRecord rec = (MC_BUDG_4016_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "yramt", rec.yramt);
			rx.add(record, "amt", rec.amt);
			//rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "yramt", StringUtil.replaceToXml(rec.yramt));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
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
<mc_budg_4016_l>
	<dataSet>
		<CURLIST>
			<record>
				<rmks2/>
				<budg_yymm/>
				<budg_cd/>
				<budg_nm/>
				<evnt_cd/>
				<evnt_nm/>
				<incmg_pers/>
				<yramt/>
				<amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4016_l>
*/
%>

<% /* 작성시간 : Mon May 25 19:05:28 KST 2009 */ %>