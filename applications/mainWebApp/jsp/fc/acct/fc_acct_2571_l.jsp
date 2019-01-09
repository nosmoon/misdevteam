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
	FC_ACCT_2571_LDataSet ds = (FC_ACCT_2571_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2571_LCURLISTRecord rec = (FC_ACCT_2571_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk", rec.chk);
			//rx.add(record, "biz_reg_no", rec.biz_reg_no);
			//rx.add(record, "bank_id", rec.bank_id);
			//rx.add(record, "acct_num", rec.acct_num);
			//rx.add(record, "acct_num_nm", rec.acct_num_nm);
			//rx.add(record, "acct_tonghwa", rec.acct_tonghwa);
			//rx.add(record, "tran_date", rec.tran_date);
			//rx.add(record, "tran_date_seq", rec.tran_date_seq);
			//rx.add(record, "extnc_seq", rec.extnc_seq);
			//rx.add(record, "erp_transfer_date", rec.erp_transfer_date);
			//rx.add(record, "tran_content", rec.tran_content);
			//rx.add(record, "tran_amt", rec.tran_amt);
			//rx.add(record, "extnc_amt", rec.extnc_amt);
			//rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "actu_slip_no", rec.actu_slip_no);
			//rx.add(record, "slip_aprv_yn", rec.slip_aprv_yn);
			//rx.add(record, "chg_slip_no", rec.chg_slip_no);
			rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			rx.add(record, "biz_reg_no", StringUtil.replaceToXml(rec.biz_reg_no));
			rx.add(record, "bank_id", StringUtil.replaceToXml(rec.bank_id));
			rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			rx.addCData(record, "acct_num_nm", rec.acct_num_nm);
			rx.add(record, "acct_tonghwa", StringUtil.replaceToXml(rec.acct_tonghwa));
			rx.add(record, "tran_date", StringUtil.replaceToXml(rec.tran_date));
			rx.add(record, "tran_date_seq", StringUtil.replaceToXml(rec.tran_date_seq));
			rx.add(record, "extnc_seq", StringUtil.replaceToXml(rec.extnc_seq));
			rx.add(record, "erp_transfer_date", StringUtil.replaceToXml(rec.erp_transfer_date));
			rx.addCData(record, "tran_content", rec.tran_content);
			rx.add(record, "tran_amt", StringUtil.replaceToXml(rec.tran_amt));
			rx.add(record, "extnc_amt", StringUtil.replaceToXml(rec.extnc_amt));
			rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			rx.add(record, "slip_aprv_yn", StringUtil.replaceToXml(rec.slip_aprv_yn));
			rx.add(record, "chg_slip_no", StringUtil.replaceToXml(rec.chg_slip_no));
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
<fc_acct_2571_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk/>
				<biz_reg_no/>
				<bank_id/>
				<acct_num/>
				<acct_num_nm/>
				<acct_tonghwa/>
				<tran_date/>
				<tran_date_seq/>
				<extnc_seq/>
				<erp_transfer_date/>
				<tran_content/>
				<tran_amt/>
				<extnc_amt/>
				<slip_no/>
				<actu_slip_no/>
				<slip_aprv_yn/>
				<chg_slip_no/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2571_l>
*/
%>

<% /* 작성시간 : Fri Aug 21 17:54:39 KST 2009 */ %>