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
	MC_BUDG_5172_LDataSet ds = (MC_BUDG_5172_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_5172_LCURLISTRecord rec = (MC_BUDG_5172_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "brnm1", rec.brnm1);
			rx.add(record, "brnm2", rec.brnm2);
			rx.add(record, "brnm3", rec.brnm3);
			rx.add(record, "medi_cdnm", rec.medi_cd + " " + rec.medi_cdnm);
			rx.add(record, "befyy_cndt_amt_10", rec.befyy_cndt_amt_10);
			rx.add(record, "befyy_cndt_amt_20", rec.befyy_cndt_amt_20);
			rx.add(record, "befyy_cndt_amt", rec.befyy_cndt_amt);
			rx.add(record, "curyy_budg_amt", rec.curyy_budg_amt);
			rx.add(record, "bemon_rate", rec.bemon_rate);
			rx.add(record, "curyy_cndt_amt_10", rec.curyy_cndt_amt_10);
			rx.add(record, "curyy_cndt_amt_20", rec.curyy_cndt_amt_20);			
			rx.add(record, "curyy_cndt_amt", rec.curyy_cndt_amt);
			rx.add(record, "mon_rate", rec.mon_rate);
			rx.add(record, "brcd1", rec.brcd1);
			rx.add(record, "brcd2", rec.brcd2);
			rx.add(record, "brcd3", rec.brcd3);
			rx.add(record, "befyy_budg_ask_amt", rec.befyy_budg_ask_amt);
			rx.add(record, "curyy_budg_ask_amt", rec.curyy_budg_ask_amt);
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "buseonm", StringUtil.replaceToXml(rec.buseonm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "ysnm", StringUtil.replaceToXml(rec.ysnm));
			//rx.add(record, "cjysbjamt", StringUtil.replaceToXml(rec.cjysbjamt));
			//rx.add(record, "budg_ask_amt", StringUtil.replaceToXml(rec.budg_ask_amt));
			//rx.add(record, "budg_cndt_amt", StringUtil.replaceToXml(rec.budg_cndt_amt));
			//rx.add(record, "chamt", StringUtil.replaceToXml(rec.chamt));
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
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
<mc_budg_5161_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_yymm/>
				<dept_cd/>
				<buseonm/>
				<budg_cd/>
				<evnt_nm/>
				<ysnm/>
				<cjysbjamt/>
				<budg_ask_amt/>
				<budg_cndt_amt/>
				<chamt/>
				<evnt_cd/>
				<slip_no/>
				<amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_5161_l>
*/
%>

<% /* 작성시간 : Sat Jul 11 13:42:07 KST 2009 */ %>