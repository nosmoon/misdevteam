<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_1402_LDataSet ds = (EN_INNEXP_1402_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_1402_LCURLISTRecord rec = (EN_INNEXP_1402_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "rcpm_unit_clsf", rec.rcpm_unit_clsf);
			rx.add(record, "tran_date", rec.tran_date);
			rx.add(record, "tran_time", rec.tran_time);
			rx.add(record, "cms_code", rec.cms_code);
			rx.addCData(record, "remark", rec.remark);
			rx.add(record, "tran_amt", rec.tran_amt);
			rx.add(record, "erp_transfer_yn", rec.erp_transfer_yn);
			rx.add(record, "erp_transfer_date", rec.erp_transfer_date);
			rx.add(record, "occr_no", rec.occr_no);
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
<dataSet>
	<CURLIST>
		<record>
			<evnt_cd/>
			<evnt_nm/>
			<rcpm_unit_clsf/>
			<tran_date/>
			<tran_time/>
			<cms_code/>
			<remark/>
			<tran_amt/>
			<erp_transfer_yn/>
			<erp_transfer_date/>
			<occr_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 20 13:47:07 KST 2009 */ %>