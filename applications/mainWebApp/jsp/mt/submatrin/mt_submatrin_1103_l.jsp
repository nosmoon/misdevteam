<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrin.rec.*
	,	chosun.ciis.mt.submatrin.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRIN_1103_LDataSet ds = (MT_SUBMATRIN_1103_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATRIN_1103_LCURLIST1Record rec = (MT_SUBMATRIN_1103_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			rx.add(record, "ewh_qunt", rec.ewh_qunt);
			rx.add(record, "ewh_uprc", rec.ewh_uprc);
			rx.add(record, "ewh_amt", rec.ewh_amt);
			rx.add(record, "ewh_vat", rec.ewh_vat);
			rx.add(record, "ewh_unit", rec.ewh_unit);
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "owh_yn" , (( rec.owh_dt.length() > 0 ) ?  "Y" : "N"));
			rx.add(record, "usedeptcd", rec.usedeptcd);
			rx.add(record, "usedeptnm", StringUtil.replaceToXml(rec.usedeptnm));
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "owh_seq", rec.owh_seq);
			rx.add(record, "owh_sub_seq", rec.owh_sub_seq);
			rx.add(record, "owh_no"  , (( rec.owh_dt.length() > 0 ) ?  rec.owh_seq + "-" + rec.owh_sub_seq : ""));
			rx.add(record, "dstb_rat_cd", rec.dstb_rat_cd);
			rx.add(record, "mc_flag", rec.mc_flag);
			rx.add(record, "bo_item_yn", rec.bo_item_yn);
			rx.add(record, "clam_yn", rec.clam_yn);
			
			//rx.add(record, "chg_pers", rec.chg_pers);
			//rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
		}

		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "FormData", "");

		if( ds.curlist.size() > 0 ) {
			MT_SUBMATRIN_1103_LCURLISTRecord rec = (MT_SUBMATRIN_1103_LCURLISTRecord)ds.curlist.get(0);
			rx.add(recordSet, "fac_clsf", rec.fac_clsf);
			rx.add(recordSet, "ewh_dt", rec.ewh_dt);
			rx.add(recordSet, "ern", rec.ern);
			rx.add(recordSet, "dlco_cd", rec.dlco_cd);
			rx.add(recordSet, "addr", StringUtil.replaceToXml(rec.addr));
			rx.add(recordSet, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(recordSet, "vat_amt", rec.vat_amt);
			rx.add(recordSet, "suply_amt", rec.suply_amt);
			rx.add(recordSet, "sum_amt", Long.parseLong(rec.suply_amt) + Long.parseLong(rec.vat_amt) );
			rx.add(recordSet, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(recordSet, "purc_clsf", rec.purc_clsf);
			rx.add(recordSet, "prof_type_cd", rec.prof_type_cd);
			rx.add(recordSet, "make_dt", rec.make_dt);
			rx.add(recordSet, "purc_stmt_no", rec.purc_stmt_no);
			rx.add(recordSet, "rcpt_prof_clsf", rec.rcpt_prof_clsf);
			rx.add(recordSet, "slip_no", rec.slip_no);
			rx.add(recordSet, "impt_yy", rec.impt_yy);
			rx.add(recordSet, "impt_seq", rec.impt_seq);
			rx.add(recordSet, "leas_clsf", rec.leas_clsf);
			rx.add(recordSet, "incmg_slip_dt", rec.incmg_slip_dt);
			rx.add(recordSet, "elec_tax_bill_yn", rec.elec_tax_bill_yn);
			rx.add(recordSet, "semuro_no", rec.semuro_no);
			rx.add(recordSet, "slip_money", "");
			
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		recordSet = rx.add(dataSet, "clos_clsf", ds.clos_yn);
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
	<CURLIST1>
		<record>
			<sub_seq/>
			<matr_cd/>
			<matr_nm/>
			<owh_budg_cd/>
			<ewh_unit/>
			<ewh_uprc/>
			<ewh_qunt/>
			<ewh_amt/>
			<ewh_vat/>
			<ewh_budg_cd/>
			<bo_item_yn/>
			<medi_cd/>
			<medi_ser_no/>
			<usedeptcd/>
			<usedeptnm/>
			<remk/>
			<owh_dt/>
			<owh_seq/>
			<owh_sub_seq/>
			<chg_pers/>
			<incmg_dt_tm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<fac_clsf/>
			<ewh_dt/>
			<ern/>
			<dlco_cd/>
			<addr/>
			<dlco_nm/>
			<vat_amt/>
			<suply_amt/>
			<dlco_clsf_cd/>
			<purc_clsf/>
			<prof_type_cd/>
			<make_dt/>
			<purc_stmt_no/>
			<rcpt_prof_clsf/>
			<slip_no/>
			<impt_yy/>
			<impt_seq/>
			<leas_clsf/>
			<incmg_slip_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Apr 11 15:45:31 KST 2009 */ %>