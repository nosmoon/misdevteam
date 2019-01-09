<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_9503_LDataSet ds = (HD_AFFR_9503_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_9503_LCURLISTRecord rec = (HD_AFFR_9503_LCURLISTRecord)ds.curlist.get(i);
			System.out.println("00000000000");
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "memb_clsf", rec.memb_clsf);
			rx.add(record, "spos_name", rec.spos_name);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "deps_per", rec.deps_per);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "memb_clsf", StringUtil.replaceToXml(rec.memb_clsf));
			//rx.add(record, "spos_name", StringUtil.replaceToXml(rec.spos_name));
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			//rx.add(record, "bank_nm", StringUtil.replaceToXml(rec.bank_nm));
			//rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			//rx.add(record, "deps_per", StringUtil.replaceToXml(rec.deps_per));
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
<hd_affr_9503_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<mang_no/>
				<flnm/>
				<memb_clsf/>
				<spos_name/>
				<bank_cd/>
				<bank_nm/>
				<acct_no/>
				<deps_per/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_9503_l>
*/
%>

<% /* 작성시간 : Mon Sep 04 16:48:48 KST 2017 */ %>