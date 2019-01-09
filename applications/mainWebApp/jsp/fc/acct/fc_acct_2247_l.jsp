<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2247_LDataSet ds = (FC_ACCT_2247_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2247_LCURLISTRecord rec = (FC_ACCT_2247_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "biz_reg_no", StringUtil.replaceToXml(rec.biz_reg_no));
			rx.add(record, "bank_id", StringUtil.replaceToXml(rec.bank_id));
			rx.add(record, "bank_name", StringUtil.replaceToXml(rec.bank_name));
			rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			rx.add(record, "cms_code", StringUtil.replaceToXml(rec.cms_code));
			rx.add(record, "tran_date", StringUtil.replaceToXml(rec.tran_date));
			rx.add(record, "tran_date_seq", StringUtil.replaceToXml(rec.tran_date_seq));
			rx.addCData(record, "remark", StringUtil.replaceToXml(rec.remark));
			rx.add(record, "tran_amt", StringUtil.replaceToXml(rec.tran_amt));
			rx.add(record, "extnc_amt", StringUtil.replaceToXml(rec.extnc_amt));
			rx.add(record, "remain_amt", StringUtil.replaceToXml(rec.remain_amt));
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
<fc_acct_2246_l>
	<dataSet>
		<CURLIST>
			<record>
				<acct_num/>
				<bank_name/>
				<tran_date/>
				<remark/>
				<tran_amt/>
				<extnc_amt/>
				<remain_amt/>
				<rcpm_slip_no/>
				<mchrg_pers/>
				<tran_clsfy/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2246_l>
*/
%>

<% /* 작성시간 : Mon Oct 25 17:38:30 KST 2010 */ %>