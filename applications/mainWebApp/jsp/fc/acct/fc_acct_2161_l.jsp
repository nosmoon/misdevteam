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
	FC_ACCT_2161_LDataSet ds = (FC_ACCT_2161_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2161_LCURLISTRecord rec = (FC_ACCT_2161_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "obj_amt", rec.obj_amt);
			//rx.add(record, "incm_tax", rec.incm_tax);
			//rx.add(record, "res_tax", rec.res_tax);
			//rx.add(record, "rmks2", rec.rmks2);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "rcpm_amt", rec.rcpm_amt);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			//rx.add(record, "comp_dt", rec.comp_dt);
			//rx.add(record, "incmg_seq", rec.incmg_seq);
			//rx.add(record, "rmks1", rec.rmks1);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "budg_yymm", rec.budg_yymm);
			//rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			//rx.add(record, "biz_reg_no", rec.biz_reg_no);
			//rx.add(record, "bank_id", rec.bank_id);
			//rx.add(record, "acct_num", rec.acct_num);
			//rx.add(record, "tran_date_seq", rec.tran_date_seq);
			//rx.add(record, "current_clsf", rec.current_clsf);
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
			rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
			rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
			rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			rx.add(record, "incmg_seq", StringUtil.replaceToXml(rec.incmg_seq));
			rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			rx.add(record, "incm_clsf_cd", StringUtil.replaceToXml(rec.incm_clsf_cd));
			rx.add(record, "chnl_clsf_cd", StringUtil.replaceToXml(rec.chnl_clsf_cd));
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
<fc_acct_2161_l>
	<dataSet>
		<CURLIST>
			<record>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<obj_amt/>
				<incm_tax/>
				<res_tax/>
				<rmks2/>
				<budg_cd/>
				<rcpm_amt/>
				<mang_clsf_cd/>
				<comp_dt/>
				<incmg_seq/>
				<rmks1/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<budg_yymm/>
				<incm_clsf_cd/>
				<biz_reg_no/>
				<bank_id/>
				<acct_num/>
				<tran_date_seq/>
				<current_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2161_l>
*/
%>

<% /* 작성시간 : Thu Jul 23 17:24:07 KST 2009 */ %>