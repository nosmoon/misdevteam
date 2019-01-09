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
	MC_BUDG_5161_LDataSet ds = (MC_BUDG_5161_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_5161_LCURLISTRecord rec = (MC_BUDG_5161_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "buseonm", rec.buseonm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "ysnm", rec.ysnm);
			rx.add(record, "cjysbjamt", rec.cjysbjamt);
			rx.add(record, "budg_ask_amt", rec.budg_ask_amt);
			rx.add(record, "budg_cndt_amt", rec.budg_cndt_amt);
			rx.add(record, "chamt", rec.chamt);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "amt", rec.amt);
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