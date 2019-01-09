<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_1101_LDataSet ds = (EN_INNEXP_1101_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_1101_LCURLISTRecord rec = (EN_INNEXP_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_occr_no", rec.slip_occr_no);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "ern", rec.ern);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "presi_nm", rec.presi_nm);
			rx.add(record, "tax_stmt_aprv_yn", rec.tax_stmt_aprv_yn);
			rx.add(record, "tax_suply_amt", rec.tax_suply_amt);
			rx.add(record, "tax_vat_amt", rec.tax_vat_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "erplace_cd", rec.erplace_cd);
			rx.add(record, "deal_clsf", rec.deal_clsf);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "bizcond", rec.bizcond);
			rx.add(record, "item", rec.item);
			rx.add(record, "titl", rec.titl);
			rx.add(record, "canc_dt", rec.canc_dt);
			rx.add(record, "vexc_cmpy_cd", rec.vexc_cmpy_cd);
			rx.add(record, "issu_pers_emp_no", rec.issu_pers_emp_no);
			rx.add(record, "issu_pers_emp_nm", rec.issu_pers_emp_nm);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.addCData(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "ask_emp_no", rec.ask_emp_no);
			rx.add(record, "ask_dept_cd", rec.ask_dept_cd);
			rx.add(record, "re_issu_resn_cd", rec.re_issu_resn_cd);
			rx.add(record, "issu_tms", rec.issu_tms);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_pers_nm", rec.chg_pers_nm);
			rx.add(record, "email", rec.email);
			//rx.add(record, "slip_occr_no", StringUtil.replaceToXml(rec.slip_occr_no));
			//rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "presi_nm", StringUtil.replaceToXml(rec.presi_nm));
			//rx.add(record, "tax_stmt_aprv_yn", StringUtil.replaceToXml(rec.tax_stmt_aprv_yn));
			//rx.add(record, "tax_suply_amt", StringUtil.replaceToXml(rec.tax_suply_amt));
			//rx.add(record, "tax_vat_amt", StringUtil.replaceToXml(rec.tax_vat_amt));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			//rx.add(record, "deal_clsf", StringUtil.replaceToXml(rec.deal_clsf));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "bizcond", StringUtil.replaceToXml(rec.bizcond));
			//rx.add(record, "item", StringUtil.replaceToXml(rec.item));
			//rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			//rx.add(record, "canc_dt", StringUtil.replaceToXml(rec.canc_dt));
			//rx.add(record, "vexc_cmpy_cd", StringUtil.replaceToXml(rec.vexc_cmpy_cd));
			//rx.add(record, "issu_pers_emp_no", StringUtil.replaceToXml(rec.issu_pers_emp_no));
			//rx.add(record, "issu_pers_emp_nm", StringUtil.replaceToXml(rec.issu_pers_emp_nm));
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "ask_emp_no", StringUtil.replaceToXml(rec.ask_emp_no));
			//rx.add(record, "ask_dept_cd", StringUtil.replaceToXml(rec.ask_dept_cd));
			//rx.add(record, "re_issu_resn_cd", StringUtil.replaceToXml(rec.re_issu_resn_cd));
			//rx.add(record, "issu_tms", StringUtil.replaceToXml(rec.issu_tms));
			//rx.add(record, "chg_dt", StringUtil.replaceToXml(rec.chg_dt));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_pers_nm", StringUtil.replaceToXml(rec.chg_pers_nm));
			//rx.add(record, "email", StringUtil.replaceToXml(rec.email));
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
<en_innexp_1101_l>
	<dataSet>
		<CURLIST>
			<record>
				<slip_occr_no/>
				<make_dt/>
				<ern/>
				<dlco_nm/>
				<presi_nm/>
				<tax_stmt_aprv_yn/>
				<tax_suply_amt/>
				<tax_vat_amt/>
				<tot_amt/>
				<slip_occr_dt/>
				<slip_seq/>
				<slip_clsf_cd/>
				<prof_type_cd/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<erplace_cd/>
				<deal_clsf/>
				<addr/>
				<bizcond/>
				<item/>
				<titl/>
				<canc_dt/>
				<vexc_cmpy_cd/>
				<issu_pers_emp_no/>
				<issu_pers_emp_nm/>
				<evnt_cd/>
				<evnt_nm/>
				<remk/>
				<ask_emp_no/>
				<ask_dept_cd/>
				<re_issu_resn_cd/>
				<issu_tms/>
				<chg_dt/>
				<chg_pers/>
				<chg_pers_nm/>
				<email/>
			</record>
		</CURLIST>
	</dataSet>
</en_innexp_1101_l>
*/
%>

<% /* 작성시간 : Mon Dec 13 15:55:57 KST 2010 */ %>