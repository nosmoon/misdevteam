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
	FC_FUNC_1114_LDataSet ds = (FC_FUNC_1114_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1114_LCURLISTRecord rec = (FC_FUNC_1114_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			//rx.add(record, "comp_dt", rec.comp_dt);
			//rx.add(record, "frcr_clsf_cd", rec.frcr_clsf_cd);
			//rx.add(record, "exrate", rec.exrate);
			//rx.add(record, "frcr_amt", rec.frcr_amt);
			//rx.add(record, "biz_reg_no", rec.biz_reg_no);
			//rx.add(record, "bank_id", rec.bank_id);
			//rx.add(record, "acct_num", rec.acct_num);
			//rx.add(record, "tran_date_seq", rec.tran_date_seq);
			//rx.add(record, "current_clsf", rec.current_clsf);
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			rx.add(record, "frcr_clsf_cd", StringUtil.replaceToXml(rec.frcr_clsf_cd));
			rx.add(record, "exrate", StringUtil.replaceToXml(rec.exrate));
			rx.add(record, "frcr_amt", StringUtil.replaceToXml(rec.frcr_amt));
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
<fc_func_1114_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_cd/>
				<dr_amt/>
				<mang_clsf_cd/>
				<comp_dt/>
				<frcr_clsf_cd/>
				<exrate/>
				<frcr_amt/>
				<biz_reg_no/>
				<bank_id/>
				<acct_num/>
				<tran_date_seq/>
				<current_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1114_l>
*/
%>

<% /* 작성시간 : Tue Jul 21 16:23:07 KST 2009 */ %>