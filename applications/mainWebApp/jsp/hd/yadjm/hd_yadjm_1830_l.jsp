<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_1830_LDataSet ds = (HD_YADJM_1830_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_1830_LCURLISTRecord rec = (HD_YADJM_1830_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pay_dt", StringUtil.replaceToXml(rec.pay_dt));
			rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			rx.add(record, "firmnm", StringUtil.replaceToXml(rec.firmnm));
			rx.add(record, "obj_pers_flnm", StringUtil.replaceToXml(rec.obj_pers_flnm));
			rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			rx.add(record, "rshp", StringUtil.replaceToXml(rec.rshp));
			rx.add(record, "obcl_pers_rspc_yn", StringUtil.replaceToXml(rec.obcl_pers_rspc_yn));
			rx.add(record, "pay_noit_crdt_card_cash_rcpt", StringUtil.replaceToXml(rec.pay_noit_crdt_card_cash_rcpt));
			rx.add(record, "pay_amt_crdt_card_cash_rcpt", StringUtil.replaceToXml(rec.pay_amt_crdt_card_cash_rcpt));
			rx.add(record, "pay_noit_cash", StringUtil.replaceToXml(rec.pay_noit_cash));
			rx.add(record, "pay_amt_cash", StringUtil.replaceToXml(rec.pay_amt_cash));
			rx.add(record, "hosp_prof", StringUtil.replaceToXml(rec.hosp_prof));
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "subf_treat_yn", StringUtil.replaceToXml(rec.subf_treat_yn));
			//rx.add(record, "pay_dt", rec.pay_dt);
			//rx.add(record, "ern", rec.ern);
			//rx.add(record, "firmnm", rec.firmnm);
			//rx.add(record, "obj_pers_flnm", rec.obj_pers_flnm);
			//rx.add(record, "prn", rec.prn);
			//rx.add(record, "rshp", rec.rshp);
			//rx.add(record, "obcl_pers_rspc_yn", rec.obcl_pers_rspc_yn);
			//rx.add(record, "pay_noit_crdt_card_cash_rcpt", rec.pay_noit_crdt_card_cash_rcpt);
			//rx.add(record, "pay_amt_crdt_card_cash_rcpt", rec.pay_amt_crdt_card_cash_rcpt);
			//rx.add(record, "pay_noit_cash", rec.pay_noit_cash);
			//rx.add(record, "pay_amt_cash", rec.pay_amt_cash);
			//rx.add(record, "hosp_prof", rec.hosp_prof);
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "seq", rec.seq);
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
<hd_yadjm_1830_l>
	<dataSet>
		<CURLIST>
			<record>
				<pay_dt/>
				<ern/>
				<firmnm/>
				<obj_pers_flnm/>
				<prn/>
				<rshp/>
				<obcl_pers_rspc_yn/>
				<pay_noit_crdt_card_cash_rcpt/>
				<pay_amt_crdt_card_cash_rcpt/>
				<pay_noit_cash/>
				<pay_amt_cash/>
				<hosp_prof/>
				<cmpy_cd/>
				<emp_no/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_1830_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 11:04:27 KST 2009 */ %>