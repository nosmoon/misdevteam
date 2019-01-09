<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.en.comm.rec.*
	,	chosun.ciis.en.comm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_COMM_1201_LDataSet ds = (EN_COMM_1201_LDataSet)request.getAttribute("ds");
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
			EN_COMM_1201_LCURLISTRecord rec = (EN_COMM_1201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chk_flag", StringUtil.replaceToXml(rec.chk_flag));
			rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			rx.add(record, "rcpm_unit_clsf", StringUtil.replaceToXml(rec.rcpm_unit_clsf));
			rx.add(record, "tran_date", StringUtil.replaceToXml(rec.tran_date));
			rx.add(record, "cms_code", StringUtil.replaceToXml(rec.cms_code));
			rx.add(record, "tran_content", StringUtil.replaceToXml(rec.tran_content));
			rx.add(record, "tran_amt", StringUtil.replaceToXml(rec.tran_amt));
			rx.add(record, "occr_no", StringUtil.replaceToXml(rec.occr_no));
			rx.add(record, "biz_reg_no", StringUtil.replaceToXml(rec.biz_reg_no));
			rx.add(record, "bank_id", StringUtil.replaceToXml(rec.bank_id));
			rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			rx.add(record, "tran_date_seq", StringUtil.replaceToXml(rec.tran_date_seq));
			//rx.add(record, "chk_flag", rec.chk_flag);
			//rx.add(record, "evnt_nm", rec.evnt_nm);
			//rx.add(record, "rcpm_unit_clsf", rec.rcpm_unit_clsf);
			//rx.add(record, "tran_date", rec.tran_date);
			//rx.add(record, "cms_code", rec.cms_code);
			//rx.add(record, "tran_content", rec.tran_content);
			//rx.add(record, "tran_amt", rec.tran_amt);
			//rx.add(record, "occr_no", rec.occr_no);
			//rx.add(record, "biz_reg_no", rec.biz_reg_no);
			//rx.add(record, "bank_id", rec.bank_id);
			//rx.add(record, "acct_num", rec.acct_num);
			//rx.add(record, "tran_date_seq", rec.tran_date_seq);
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
<en_comm_1201_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk_flag/>
				<evnt_nm/>
				<rcpm_unit_clsf/>
				<tran_date/>
				<cms_code/>
				<tran_content/>
				<tran_amt/>
				<occr_no/>
				<biz_reg_no/>
				<bank_id/>
				<acct_num/>
				<tran_date_seq/>
			</record>
		</CURLIST>
	</dataSet>
</en_comm_1201_l>
*/
%>

<% /* 작성시간 : Thu Jun 18 16:23:48 KST 2009 */ %>