<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etcimpt.rec.*
	,	chosun.ciis.mt.etcimpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCIMPT_1010_LDataSet ds = (MT_ETCIMPT_1010_LDataSet)request.getAttribute("ds");
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
			MT_ETCIMPT_1010_LCURLISTRecord rec = (MT_ETCIMPT_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "yy", StringUtil.replaceToXml(rec.yy));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "leas_clsf", StringUtil.replaceToXml(rec.leas_clsf));
			rx.add(record, "case_nm", StringUtil.replaceToXml(rec.case_nm));
			rx.add(record, "impt_resn", StringUtil.replaceToXml(rec.impt_resn));
			rx.add(record, "matr_ptcr", StringUtil.replaceToXml(rec.matr_ptcr));
			rx.add(record, "use_dept", StringUtil.replaceToXml(rec.use_dept));
			rx.add(record, "offer_pric", StringUtil.replaceToXml(rec.offer_pric));
			rx.add(record, "offer_pric_curc_clsf", StringUtil.replaceToXml(rec.offer_pric_curc_clsf));
			rx.add(record, "ship_pers", StringUtil.replaceToXml(rec.ship_pers));
			rx.add(record, "base_cost", StringUtil.replaceToXml(rec.base_cost));
			rx.add(record, "impt_vexc_coms", StringUtil.replaceToXml(rec.impt_vexc_coms));
			rx.add(record, "impt_vexc_coms_vat", StringUtil.replaceToXml(rec.impt_vexc_coms_vat));
			rx.add(record, "lcopen_coms", StringUtil.replaceToXml(rec.lcopen_coms));
			rx.add(record, "telx_fee", StringUtil.replaceToXml(rec.telx_fee));
			rx.add(record, "offer_offr_plac", StringUtil.replaceToXml(rec.offer_offr_plac));
			rx.add(record, "impt_clsf", StringUtil.replaceToXml(rec.impt_clsf));
			rx.add(record, "lcopen_dt", StringUtil.replaceToXml(rec.lcopen_dt));
			rx.add(record, "lcopen_bank", StringUtil.replaceToXml(rec.lcopen_bank));
			rx.add(record, "lcno", StringUtil.replaceToXml(rec.lcno));
			rx.add(record, "lcvdty_prd", StringUtil.replaceToXml(rec.lcvdty_prd));
			rx.add(record, "crgo_insr_entr_dt", StringUtil.replaceToXml(rec.crgo_insr_entr_dt));
			rx.add(record, "crgo_insr_cntr_cmpy", StringUtil.replaceToXml(rec.crgo_insr_cntr_cmpy));
			rx.add(record, "crgo_insr_fee", StringUtil.replaceToXml(rec.crgo_insr_fee));
			rx.add(record, "ship_widr", StringUtil.replaceToXml(rec.ship_widr));
			rx.add(record, "ship_dt", StringUtil.replaceToXml(rec.ship_dt));
			rx.add(record, "ewh_dt", StringUtil.replaceToXml(rec.ewh_dt));
			rx.add(record, "ewh_amt", StringUtil.replaceToXml(rec.ewh_amt));
			rx.add(record, "last_entr_dt", StringUtil.replaceToXml(rec.last_entr_dt));
			rx.add(record, "impt_vexc_cmpy", StringUtil.replaceToXml(rec.impt_vexc_cmpy));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "yy", rec.yy);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "leas_clsf", rec.leas_clsf);
			//rx.add(record, "case_nm", rec.case_nm);
			//rx.add(record, "impt_resn", rec.impt_resn);
			//rx.add(record, "matr_ptcr", rec.matr_ptcr);
			//rx.add(record, "use_dept", rec.use_dept);
			//rx.add(record, "offer_pric", rec.offer_pric);
			//rx.add(record, "offer_pric_curc_clsf", rec.offer_pric_curc_clsf);
			//rx.add(record, "ship_pers", rec.ship_pers);
			//rx.add(record, "base_cost", rec.base_cost);
			//rx.add(record, "impt_vexc_coms", rec.impt_vexc_coms);
			//rx.add(record, "impt_vexc_coms_vat", rec.impt_vexc_coms_vat);
			//rx.add(record, "lcopen_coms", rec.lcopen_coms);
			//rx.add(record, "telx_fee", rec.telx_fee);
			//rx.add(record, "offer_offr_plac", rec.offer_offr_plac);
			//rx.add(record, "impt_clsf", rec.impt_clsf);
			//rx.add(record, "lcopen_dt", rec.lcopen_dt);
			//rx.add(record, "lcopen_bank", rec.lcopen_bank);
			//rx.add(record, "lcno", rec.lcno);
			//rx.add(record, "lcvdty_prd", rec.lcvdty_prd);
			//rx.add(record, "crgo_insr_entr_dt", rec.crgo_insr_entr_dt);
			//rx.add(record, "crgo_insr_cntr_cmpy", rec.crgo_insr_cntr_cmpy);
			//rx.add(record, "crgo_insr_fee", rec.crgo_insr_fee);
			//rx.add(record, "ship_widr", rec.ship_widr);
			//rx.add(record, "ship_dt", rec.ship_dt);
			//rx.add(record, "ewh_dt", rec.ewh_dt);
			//rx.add(record, "ewh_amt", rec.ewh_amt);
			//rx.add(record, "last_entr_dt", rec.last_entr_dt);
			//rx.add(record, "impt_vexc_cmpy", rec.impt_vexc_cmpy);
			//rx.add(record, "remk", rec.remk);
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
<mt_etcimpt_1010_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<yy/>
				<seq/>
				<leas_clsf/>
				<case_nm/>
				<impt_resn/>
				<matr_ptcr/>
				<use_dept/>
				<offer_pric/>
				<offer_pric_curc_clsf/>
				<ship_pers/>
				<base_cost/>
				<impt_vexc_coms/>
				<impt_vexc_coms_vat/>
				<lcopen_coms/>
				<telx_fee/>
				<offer_offr_plac/>
				<impt_clsf/>
				<lcopen_dt/>
				<lcopen_bank/>
				<lcno/>
				<lcvdty_prd/>
				<crgo_insr_entr_dt/>
				<crgo_insr_cntr_cmpy/>
				<crgo_insr_fee/>
				<ship_widr/>
				<ship_dt/>
				<ewh_dt/>
				<ewh_amt/>
				<last_entr_dt/>
				<impt_vexc_cmpy/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etcimpt_1010_l>
*/
%>

<% /* 작성시간 : Fri Jul 03 10:40:51 KST 2009 */ %>