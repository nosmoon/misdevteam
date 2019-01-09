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
	FC_ACCT_2246_LDataSet ds = (FC_ACCT_2246_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2246_LCURLISTRecord rec = (FC_ACCT_2246_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "acct_num", rec.acct_num);
			//rx.add(record, "bank_name", rec.bank_name);
			//rx.add(record, "tran_date", rec.tran_date);
			//rx.add(record, "remark", rec.remark);
			//rx.add(record, "tran_amt", rec.tran_amt);
			//rx.add(record, "extnc_amt", rec.extnc_amt);
			//rx.add(record, "remain_amt", rec.remain_amt);
			//rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			//rx.add(record, "mchrg_pers", rec.mchrg_pers);
			//rx.add(record, "tran_clsfy", rec.tran_clsfy);
			rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			rx.add(record, "bank_name", StringUtil.replaceToXml(rec.bank_name));
			rx.add(record, "tran_date", StringUtil.replaceToXml(rec.tran_date));
			rx.addCData(record, "remark", StringUtil.replaceToXml(rec.remark));
			rx.add(record, "tran_amt", StringUtil.replaceToXml(rec.tran_amt));
			rx.add(record, "extnc_amt", StringUtil.replaceToXml(rec.extnc_amt));
			rx.add(record, "remain_amt", StringUtil.replaceToXml(rec.remain_amt));
			rx.add(record, "rcpm_slip_no", StringUtil.replaceToXml(rec.rcpm_slip_no));
			rx.add(record, "mchrg_pers", StringUtil.replaceToXml(rec.mchrg_pers));
			rx.add(record, "tran_clsfy", StringUtil.replaceToXml(rec.tran_clsfy));
			rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
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