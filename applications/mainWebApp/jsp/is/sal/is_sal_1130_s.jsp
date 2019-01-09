<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.sal.rec.*
	,	chosun.ciis.is.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SAL_1130_SDataSet ds = (IS_SAL_1130_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {
		/****** CURLIST BEGIN */
		int gridData = rx.add(resForm, "gridData", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SAL_1130_SCURLISTRecord rec = (IS_SAL_1130_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "acwr_reg_dt_seq", rec.purc_reg_dt+rec.purc_reg_seq);
			//rx.add(record, "purc_reg_dt", rec.purc_reg_dt);
			//rx.add(record, "purc_reg_seq", rec.purc_reg_seq);
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "purc_clsf", rec.purc_clsf);
			rx.add(record, "purc_clsf_nm", rec.purc_clsf_nm);
			rx.add(record, "purc_dt", rec.purc_dt);
			rx.add(record, "uprc", DigitUtil.cutUnderPoint(rec.uprc,2));
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "purc_amt", rec.purc_amt);
			rx.add(record, "trc_yn", rec.trc_yn);
			rx.add(record, "send_yn", rec.send_yn);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "adjm_yn", rec.adjm_yn);	/**정산여부(상계여부)구분**/
			rx.add(record, "purc_adjm_reg_dt", rec.purc_adjm_reg_dt);
			rx.add(record, "purc_adjm_reg_seq", rec.purc_adjm_reg_seq);
		}
		
		rx.add(resForm, "slip_clsf_cd", ds.slip_clsf_cd);
		rx.add(resForm, "slip_occr_dt", ds.slip_occr_dt);
		rx.add(resForm, "slip_seq", ds.slip_seq);
		rx.add(resForm, "dlco_clsf_cd_seq", ds.dlco_clsf_cd_seq);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "make_dt", ds.make_dt);
		rx.add(resForm, "suply_amt", ds.suply_amt);
		rx.add(resForm, "vat_amt", ds.vat_amt);
		rx.add(resForm, "del_resn", ds.del_resn);
		rx.add(resForm, "ern", ds.ern);
		rx.add(resForm, "addr", ds.addr);
		rx.add(resForm, "deal_clsf", ds.deal_clsf);
		rx.add(resForm, "presi_nm", ds.presi_nm);
		rx.add(resForm, "bizcond", ds.bizcond);
		rx.add(resForm, "item", ds.item);
		rx.add(resForm, "tot_amt", ds.s_tot_amt);
		rx.add(resForm, "erplace_cd", ds.erplace_cd);
		rx.add(resForm, "prof_type_cd", ds.prof_type_cd); /**증빙유형코드**/
		
		rx.add(resForm, "email_id", ds.email_id);
		rx.add(resForm, "elec_tax_comp_cd", ds.elec_tax_comp_cd);
		rx.add(resForm, "semuro_no", ds.semuro_no);
		
		/**매입총액**/
		rx.add(resForm, "tot_fee", ds.purc_suply_amt);
		rx.add(resForm, "tot_fee_vat", ds.purc_vat_amt);
		rx.add(resForm, "tot_fee_amt", ds.purc_tot_amt);
		
		
		rx.add(resForm, "pay_clsf", ds.pay_clsf);
		rx.add(resForm, "canc_yn", ds.canc_yn);
		
		rx.add(resForm, "tot_suply_amt", ds.tot_suply_amt);
		rx.add(resForm, "tot_vat_amt", ds.tot_vat_amt);
		
		rx.add(resForm, "purc_frdt", ds.purc_frdt);
		rx.add(resForm, "purc_todt", ds.purc_todt);
		rx.add(resForm, "erplace_cd", ds.erplace_cd);
		
		//rx.add(resForm, "chk_cnt", ds.chk_cnt);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
