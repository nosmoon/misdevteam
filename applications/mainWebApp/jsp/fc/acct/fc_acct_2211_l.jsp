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
	FC_ACCT_2211_LDataSet ds = (FC_ACCT_2211_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2211_LCURLISTRecord rec = (FC_ACCT_2211_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.addCData(record, "pch_yscdnm", rec.pch_yscdnm);
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "occr_slip_occr_dt", rec.occr_slip_occr_dt);
			rx.add(record, "occr_slip_clsf_cd", rec.occr_slip_clsf_cd);
			rx.add(record, "occr_slip_seq", rec.occr_slip_seq);
			rx.add(record, "occr_slip_sub_seq", rec.occr_slip_sub_seq);
			rx.add(record, "occr_slip_arow_no", rec.occr_slip_arow_no);
			rx.add(record, "acntcymd", rec.acntcymd);
			rx.add(record, "ern", rec.ern);
			rx.addCData(record, "pch_irjnm", rec.pch_irjnm);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "ask_emp_no", rec.ask_emp_no);
			rx.addCData(record, "pch_erirjnm", rec.pch_erirjnm);
			rx.add(record, "ask_dept_cd", rec.ask_dept_cd);
			rx.addCData(record, "pch_cgbuseonm", rec.pch_cgbuseonm);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "unrcp_excl_yn", rec.unrcp_excl_yn);
			rx.add(record, "igamt", rec.igamt);
			rx.add(record, "janamt", rec.janamt);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "occr_slip_no", rec.occr_slip_no);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "pch_yscdnm", StringUtil.replaceToXml(rec.pch_yscdnm));
			//rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "occr_slip_occr_dt", StringUtil.replaceToXml(rec.occr_slip_occr_dt));
			//rx.add(record, "occr_slip_clsf_cd", StringUtil.replaceToXml(rec.occr_slip_clsf_cd));
			//rx.add(record, "occr_slip_seq", StringUtil.replaceToXml(rec.occr_slip_seq));
			//rx.add(record, "occr_slip_sub_seq", StringUtil.replaceToXml(rec.occr_slip_sub_seq));
			//rx.add(record, "occr_slip_arow_no", StringUtil.replaceToXml(rec.occr_slip_arow_no));
			//rx.add(record, "acntcymd", StringUtil.replaceToXml(rec.acntcymd));
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "pch_irjnm", StringUtil.replaceToXml(rec.pch_irjnm));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "ask_emp_no", StringUtil.replaceToXml(rec.ask_emp_no));
			//rx.add(record, "pch_erirjnm", StringUtil.replaceToXml(rec.pch_erirjnm));
			//rx.add(record, "ask_dept_cd", StringUtil.replaceToXml(rec.ask_dept_cd));
			//rx.add(record, "pch_cgbuseonm", StringUtil.replaceToXml(rec.pch_cgbuseonm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			//rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			//rx.add(record, "unrcp_excl_yn", StringUtil.replaceToXml(rec.unrcp_excl_yn));
			//rx.add(record, "igamt", StringUtil.replaceToXml(rec.igamt));
			//rx.add(record, "janamt", StringUtil.replaceToXml(rec.janamt));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "occr_slip_no", StringUtil.replaceToXml(rec.occr_slip_no));
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
<fc_acct_2211_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_cd/>
				<pch_yscdnm/>
				<prof_type_cd/>
				<slip_clsf_cd/>
				<slip_occr_dt/>
				<slip_seq/>
				<occr_slip_occr_dt/>
				<occr_slip_clsf_cd/>
				<occr_slip_seq/>
				<occr_slip_sub_seq/>
				<occr_slip_arow_no/>
				<acntcymd/>
				<ern/>
				<pch_irjnm/>
				<dlco_nm/>
				<ask_emp_no/>
				<pch_erirjnm/>
				<ask_dept_cd/>
				<pch_cgbuseonm/>
				<remk/>
				<suply_amt/>
				<vat_amt/>
				<unrcp_excl_yn/>
				<igamt/>
				<janamt/>
				<slip_no/>
				<occr_slip_no/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2211_l>
*/
%>

<% /* 작성시간 : Thu Jul 16 10:45:23 KST 2009 */ %>