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
	MC_BUDG_4130_LDataSet ds = (MC_BUDG_4130_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4130_LCURLISTRecord rec = (MC_BUDG_4130_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "kind", rec.kind);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "chg_prv_dept_cd", rec.chg_prv_dept_cd);
			rx.add(record, "chg_aft_dept_cd", rec.chg_aft_dept_cd);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "chg_ratio", rec.chg_ratio);
			rx.add(record, "budg_req_amt", rec.budg_req_amt);
			rx.add(record, "fix_asin_amt", rec.fix_asin_amt);
			rx.add(record, "last_asin_amt", rec.last_asin_amt);
			rx.add(record, "budg_ask_amt", rec.budg_ask_amt);
			rx.add(record, "budg_cndt_amt", rec.budg_cndt_amt);
			rx.add(record, "budg_req_amt_1", rec.budg_req_amt_1);
			rx.add(record, "fix_asin_amt_1", rec.fix_asin_amt_1);
			rx.add(record, "last_asin_amt_1", rec.last_asin_amt_1);
			rx.add(record, "budg_ask_amt_1", rec.budg_ask_amt_1);
			rx.add(record, "budg_cndt_amt_1", rec.budg_cndt_amt_1);
			//rx.add(record, "kind", StringUtil.replaceToXml(rec.kind));
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "chg_prv_dept_cd", StringUtil.replaceToXml(rec.chg_prv_dept_cd));
			//rx.add(record, "chg_aft_dept_cd", StringUtil.replaceToXml(rec.chg_aft_dept_cd));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "chg_ratio", StringUtil.replaceToXml(rec.chg_ratio));
			//rx.add(record, "budg_req_amt", StringUtil.replaceToXml(rec.budg_req_amt));
			//rx.add(record, "fix_asin_amt", StringUtil.replaceToXml(rec.fix_asin_amt));
			//rx.add(record, "last_asin_amt", StringUtil.replaceToXml(rec.last_asin_amt));
			//rx.add(record, "budg_ask_amt", StringUtil.replaceToXml(rec.budg_ask_amt));
			//rx.add(record, "budg_cndt_amt", StringUtil.replaceToXml(rec.budg_cndt_amt));
			//rx.add(record, "budg_req_amt_1", StringUtil.replaceToXml(rec.budg_req_amt_1));
			//rx.add(record, "fix_asin_amt_1", StringUtil.replaceToXml(rec.fix_asin_amt_1));
			//rx.add(record, "last_asin_amt_1", StringUtil.replaceToXml(rec.last_asin_amt_1));
			//rx.add(record, "budg_ask_amt_1", StringUtil.replaceToXml(rec.budg_ask_amt_1));
			//rx.add(record, "budg_cndt_amt_1", StringUtil.replaceToXml(rec.budg_cndt_amt_1));
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
<mc_budg_4130_l>
	<dataSet>
		<CURLIST>
			<record>
				<kind/>
				<budg_yymm/>
				<chg_prv_dept_cd/>
				<chg_aft_dept_cd/>
				<budg_cd/>
				<budg_cdnm/>
				<chg_ratio/>
				<budg_req_amt/>
				<fix_asin_amt/>
				<last_asin_amt/>
				<budg_ask_amt/>
				<budg_cndt_amt/>
				<budg_req_amt_1/>
				<fix_asin_amt_1/>
				<last_asin_amt_1/>
				<budg_ask_amt_1/>
				<budg_cndt_amt_1/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4130_l>
*/
%>

<% /* 작성시간 : Tue Aug 25 21:12:12 KST 2009 */ %>