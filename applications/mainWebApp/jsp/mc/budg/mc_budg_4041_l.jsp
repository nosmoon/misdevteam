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
	MC_BUDG_4041_LDataSet ds = (MC_BUDG_4041_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4041_LCURLISTRecord rec = (MC_BUDG_4041_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "ys_ysnm_ghyscd", rec.ys_ysnm_ghyscd);
			rx.add(record, "budg_req_amt", rec.budg_req_amt);
			rx.add(record, "last_asin_amt", rec.last_asin_amt);
			rx.add(record, "fix_asin_amt", rec.fix_asin_amt);
			rx.add(record, "divycamt", rec.divycamt);
			rx.add(record, "divhjamt", rec.divhjamt);
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "ys_ysnm_ghyscd", StringUtil.replaceToXml(rec.ys_ysnm_ghyscd));
			//rx.add(record, "budg_req_amt", StringUtil.replaceToXml(rec.budg_req_amt));
			//rx.add(record, "last_asin_amt", StringUtil.replaceToXml(rec.last_asin_amt));
			//rx.add(record, "fix_asin_amt", StringUtil.replaceToXml(rec.fix_asin_amt));
			//rx.add(record, "divycamt", StringUtil.replaceToXml(rec.divycamt));
			//rx.add(record, "divhjamt", StringUtil.replaceToXml(rec.divhjamt));
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
<mc_budg_4041_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_yymm/>
				<evnt_cd/>
				<evnt_nm/>
				<budg_cd/>
				<ys_ysnm_ghyscd/>
				<budg_req_amt/>
				<last_asin_amt/>
				<fix_asin_amt/>
				<divycamt/>
				<divhjamt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4041_l>
*/
%>

<% /* 작성시간 : Thu Apr 16 15:39:23 KST 2009 */ %>