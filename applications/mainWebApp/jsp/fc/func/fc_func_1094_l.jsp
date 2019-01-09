<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1094_LDataSet ds = (FC_FUNC_1094_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1094_LCURLISTRecord rec = (FC_FUNC_1094_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "p_repl_amt", rec.p_repl_amt);
			//rx.add(record, "p_budg_cd", rec.p_budg_cd);
			//rx.add(record, "p_deps_clsf_cd", rec.p_deps_clsf_cd);
			//rx.add(record, "p_deps_dt", rec.p_deps_dt);
			//rx.add(record, "p_frex_cd", rec.p_frex_cd);
			//rx.add(record, "p_exrate", rec.p_exrate);
			//rx.add(record, "p_frex_amt", rec.p_frex_amt);
			//rx.add(record, "p_trufnd_slip_clsf", rec.p_trufnd_slip_clsf);
			//rx.add(record, "p_trufnd_slip_no", rec.p_trufnd_slip_no);
			//rx.add(record, "biz_reg_no", rec.biz_reg_no);
			//rx.add(record, "bank_id", rec.bank_id);
			//rx.add(record, "acct_num", rec.acct_num);
			//rx.add(record, "tran_date_seq", rec.tran_date_seq);
			//rx.add(record, "current_clsf", rec.current_clsf);
			rx.add(record, "p_repl_amt", StringUtil.replaceToXml(rec.p_repl_amt));
			rx.add(record, "p_budg_cd", StringUtil.replaceToXml(rec.p_budg_cd));
			rx.add(record, "p_deps_clsf_cd", StringUtil.replaceToXml(rec.p_deps_clsf_cd));
			rx.add(record, "p_deps_dt", StringUtil.replaceToXml(rec.p_deps_dt));
			rx.add(record, "p_frex_cd", StringUtil.replaceToXml(rec.p_frex_cd));
			rx.add(record, "p_exrate", StringUtil.replaceToXml(rec.p_exrate));
			rx.add(record, "p_frex_amt", StringUtil.replaceToXml(rec.p_frex_amt));
			rx.add(record, "p_trufnd_slip_clsf", StringUtil.replaceToXml(rec.p_trufnd_slip_clsf));
			rx.add(record, "p_trufnd_slip_no", StringUtil.replaceToXml(rec.p_trufnd_slip_no));
			rx.add(record, "biz_reg_no", StringUtil.replaceToXml(rec.biz_reg_no));
			rx.add(record, "bank_id", StringUtil.replaceToXml(rec.bank_id));
			rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			rx.add(record, "tran_date_seq", StringUtil.replaceToXml(rec.tran_date_seq));
			rx.add(record, "current_clsf", StringUtil.replaceToXml(rec.current_clsf));
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
<fc_func_1094_l>
	<dataSet>
		<CURLIST>
			<record>
				<p_repl_amt/>
				<p_budg_cd/>
				<p_deps_clsf_cd/>
				<p_deps_dt/>
				<p_frex_cd/>
				<p_exrate/>
				<p_frex_amt/>
				<p_trufnd_slip_clsf/>
				<p_trufnd_slip_no/>
				<biz_reg_no/>
				<bank_id/>
				<acct_num/>
				<tran_date_seq/>
				<current_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1094_l>
*/
%>

<% /* 작성시간 : Mon Jul 20 17:19:51 KST 2009 */ %>