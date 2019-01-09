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
	FC_ACCT_2473_SDataSet ds = (FC_ACCT_2473_SDataSet)request.getAttribute("ds");
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
			FC_ACCT_2473_SCURLISTRecord rec = (FC_ACCT_2473_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "acct_cd", rec.acct_cd);
			//rx.add(record, "acct_nm", rec.acct_nm);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "medi_nm", rec.medi_nm);
			//rx.add(record, "mang_no", rec.mang_no);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			//rx.add(record, "mang_clsf_nm", rec.mang_clsf_nm);
			//rx.add(record, "bank_cd", rec.bank_cd);
			//rx.add(record, "bank_nm", rec.bank_nm);
			//rx.add(record, "comp_dt", rec.comp_dt);
			//rx.add(record, "mtry_dt", rec.mtry_dt);
			//rx.add(record, "unit", rec.unit);
			//rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			//rx.add(record, "use_dept_nm", rec.use_dept_nm);
			//rx.add(record, "obj_acct_cd", rec.obj_acct_cd);
			//rx.add(record, "obj_acct_nm", rec.obj_acct_nm);
			//rx.add(record, "obj_amt", rec.obj_amt);
			//rx.add(record, "note_stat", rec.note_stat);
			//rx.add(record, "note_stat_nm", rec.note_stat_nm);
			//rx.add(record, "frcr_clsf_cd", rec.frcr_clsf_cd);
			//rx.add(record, "exrate", rec.exrate);
			//rx.add(record, "frcr_amt", rec.frcr_amt);
			//rx.add(record, "obj_dt", rec.obj_dt);
			//rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			//rx.add(record, "evnt_cd", rec.evnt_cd);
			//rx.add(record, "prop_equip_cd", rec.prop_equip_cd);
			//rx.add(record, "incmg_dt", rec.incmg_dt);
			//rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd);
			//rx.add(record, "dtls_medi_nm", rec.dtls_medi_nm);
			//rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			rx.add(record, "acct_nm", StringUtil.replaceToXml(rec.acct_nm));
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
			rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			rx.add(record, "mang_clsf_nm", StringUtil.replaceToXml(rec.mang_clsf_nm));
			rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			rx.add(record, "bank_nm", StringUtil.replaceToXml(rec.bank_nm));
			rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			rx.add(record, "use_dept_nm", StringUtil.replaceToXml(rec.use_dept_nm));
			rx.add(record, "obj_acct_cd", StringUtil.replaceToXml(rec.obj_acct_cd));
			rx.add(record, "obj_acct_nm", StringUtil.replaceToXml(rec.obj_acct_nm));
			rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
			rx.add(record, "note_stat", StringUtil.replaceToXml(rec.note_stat));
			rx.add(record, "note_stat_nm", StringUtil.replaceToXml(rec.note_stat_nm));
			rx.add(record, "frcr_clsf_cd", StringUtil.replaceToXml(rec.frcr_clsf_cd));
			rx.add(record, "exrate", StringUtil.replaceToXml(rec.exrate));
			rx.add(record, "frcr_amt", StringUtil.replaceToXml(rec.frcr_amt));
			rx.add(record, "obj_dt", StringUtil.replaceToXml(rec.obj_dt));
			rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			rx.add(record, "prop_equip_cd", StringUtil.replaceToXml(rec.prop_equip_cd));
			rx.add(record, "incmg_dt", StringUtil.replaceToXml(rec.incmg_dt));
			rx.add(record, "intg_dlco_cd", StringUtil.replaceToXml(rec.intg_dlco_cd));
			rx.add(record, "dtls_medi_nm", StringUtil.replaceToXml(rec.dtls_medi_nm));
			rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
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
<fc_acct_2473_s>
	<dataSet>
		<CURLIST>
			<record>
				<acct_cd/>
				<acct_nm/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<boks_dlco_nm/>
				<medi_cd/>
				<medi_nm/>
				<mang_no/>
				<mang_clsf_cd/>
				<mang_clsf_nm/>
				<bank_cd/>
				<bank_nm/>
				<comp_dt/>
				<mtry_dt/>
				<unit/>
				<qunt/>
				<use_dept_cd/>
				<use_dept_nm/>
				<obj_acct_cd/>
				<obj_acct_nm/>
				<obj_amt/>
				<note_stat/>
				<note_stat_nm/>
				<frcr_clsf_cd/>
				<exrate/>
				<frcr_amt/>
				<obj_dt/>
				<dtls_medi_cd/>
				<evnt_cd/>
				<prop_equip_cd/>
				<incmg_dt/>
				<intg_dlco_cd/>
				<dtls_medi_nm/>
				<evnt_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2473_s>
*/
%>

<% /* 작성시간 : Wed Jun 24 11:11:48 KST 2009 */ %>