<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_1010_SDataSet ds = (IS_AGR_1010_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {
		/****** CURLIST_A BEGIN(결재자 정보) */
		int gridData2 = rx.add(resForm, "gridData2", "");

		for(int i = 0; i < ds.curlist_a.size(); i++) {
			IS_AGR_1010_SCURLIST_ARecord rec = (IS_AGR_1010_SCURLIST_ARecord)ds.curlist_a.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "decid_pre_seq", rec.decid_pre_seq);
			rx.add(record, "decid_pers", rec.decid_pers);
			rx.add(record, "decid_pers_nm", rec.decid_pers_nm);
			rx.add(record, "decid_pers_dty_cd", rec.decid_pers_dty_cd);
			rx.add(record, "decid_pers_dty_cd_nm", rec.decid_pers_dty_cd_nm);
			rx.add(record, "decid_yn", rec.decid_yn);
			rx.add(record, "aprv_step_yn", rec.aprv_step_yn);
			rx.add(record, "proc_dt", rec.proc_dt);
			
		}
		/****** CURLIST_A END */
		
		/****** CURLIST_B BEGIN */
		int gridData1 = rx.add(resForm, "gridData1", "");

		for(int i = 0; i < ds.curlist_b.size(); i++) {
			IS_AGR_1010_SCURLIST_BRecord rec = (IS_AGR_1010_SCURLIST_BRecord)ds.curlist_b.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "a_purc_reg_dt", rec.a_purc_reg_dt);
			rx.add(record, "a_purc_reg_seq", rec.a_purc_reg_seq);
			rx.add(record, "a_asnt_dstc_cd", rec.a_asnt_dstc_cd);
			rx.add(record, "a_asnt_dstc_cd_nm", rec.a_asnt_dstc_cd_nm);
			rx.add(record, "a_dlco_clsf_cd_seq", rec.a_dlco_clsf_cd_seq);
			rx.add(record, "a_dlco_nm", rec.a_dlco_nm);
			rx.add(record, "a_purc_clsf", rec.a_purc_clsf);
			//rx.add(record, "a_uprc", rec.a_uprc);
			rx.add(record, "a_uprc", DigitUtil.cutUnderPoint(rec.a_uprc,2));
			rx.add(record, "a_qunt", rec.a_qunt);	/**매입수량**/
			rx.add(record, "a_send_qty", rec.a_send_qty); /**발송부수**/
									
			if("0".equals(rec.a_send_qty)){
				rx.add(record, "a_send_rate", 0);	/**배정율**/				
			}else{
				rx.add(record, "a_send_rate", DigitUtil.cutUnderPoint((StringUtil.toDouble(rec.a_qunt)/StringUtil.toDouble(rec.a_send_qty))*100,2));	/**배정율**/
			}
			
			rx.add(record, "a_purc_amt", rec.a_purc_amt);
			rx.add(record, "a_trc_yn", rec.a_trc_yn);
			rx.add(record, "a_send_yn", rec.a_send_yn);
			rx.add(record, "a_remk", rec.a_remk);
			rx.add(record, "a_adjm_yn", rec.a_adjm_yn);
			rx.add(record, "a_chg_dt_tm", rec.a_chg_dt_tm);
			
		}
		/****** CURLIST_B END */
		
		
		rx.add(resForm, "flag", "U");
		rx.add(resForm, "acwr_reg_dt", ds.acwr_reg_dt);
		rx.add(resForm, "acwr_reg_seq", ds.acwr_reg_seq);
		rx.add(resForm, "scat_dt", ds.scat_dt);
		rx.add(resForm, "dlco_clsf_cd_seq", ds.dlco_clsf_cd_seq);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "rvord_dt", ds.rvord_dt);
		rx.add(resForm, "advcs_cd", ds.advcs_cd);
		rx.add(resForm, "advcs_cd_nm", ds.advcs_cd_nm);
		rx.add(resForm, "sms_send_req_yn", ds.sms_send_req_yn);
		rx.add(resForm, "sms_ptph_no", ds.sms_ptph_no);		
		rx.add(resForm, "advt_nm", ds.advt_nm);
		rx.add(resForm, "indt_cd", ds.indt_cd);
		rx.add(resForm, "indt_cd_nm", ds.indt_cd_nm);
		rx.add(resForm, "prof_docu_clsf", ds.prof_docu_clsf);
		rx.add(resForm, "trust_letter_resn", ds.trust_letter_resn);
		rx.add(resForm, "remk", ds.remk);		
		rx.add(resForm, "fix_yn", ds.fix_yn);
		rx.add(resForm, "sale_clsf", ds.sale_clsf);
		rx.add(resForm, "spc_sale_clsf", ds.spc_sale_clsf);
		rx.add(resForm, "std_cd", ds.std_cd);
		rx.add(resForm, "std_cd_nm", ds.std_cd_nm);
		rx.add(resForm, "rvord_type", ds.rvord_type);		
		rx.add(resForm, "rtax_yn", ds.rtax_yn);
		rx.add(resForm, "vatclsf", ds.vatclsf);
		rx.add(resForm, "uprc_clsf", ds.uprc_clsf);
		//rx.add(resForm, "std_uprc", ds.std_uprc);
		rx.add(resForm, "std_uprc", DigitUtil.cutUnderPoint(ds.std_uprc,2));
		rx.add(resForm, "qunt", ds.qunt);		
		//rx.add(resForm, "uprc", ds.uprc);
		rx.add(resForm, "uprc", DigitUtil.cutUnderPoint(ds.uprc,2));
		rx.add(resForm, "suply_amt", ds.suply_amt);
		rx.add(resForm, "vat_amt", ds.vat_amt);
		rx.add(resForm, "tot_rvord_amt", ds.tot_rvord_amt);
		rx.add(resForm, "sale_dlco_li_suply_amt", ds.sale_dlco_li_suply_amt);
		rx.add(resForm, "clamt_mthd", ds.clamt_mthd);		
		rx.add(resForm, "reg_point_unrcp_amt", ds.reg_point_unrcp_amt);
		rx.add(resForm, "reg_point_unrcp_pass_dds", ds.reg_point_unrcp_pass_dds);
		rx.add(resForm, "deal_resn", ds.deal_resn);
		rx.add(resForm, "isewh_yn", ds.isewh_yn);
		rx.add(resForm, "bnch_qty", ds.bnch_qty);
		rx.add(resForm, "feed_req_matt", ds.feed_req_matt);		
		rx.add(resForm, "dept_cd", ds.dept_cd);
		rx.add(resForm, "sub_dept_cd", ds.sub_dept_cd);
		rx.add(resForm, "chrg_pers", ds.chrg_pers);
		rx.add(resForm, "chrg_pers_nm", ds.chrg_pers_nm);
		rx.add(resForm, "scat_qty", ds.scat_qty);
		rx.add(resForm, "remain_qty", ds.remain_qty);		
		rx.add(resForm, "asnt_dstc_cd", ""); /**구역코드**/
		rx.add(resForm, "xx_qty", ""); /**부수지정**/
		rx.add(resForm, "xx_uprc", ""); /**매입단가**/
		rx.add(resForm, "clamt_plan_dt", ds.clamt_plan_dt);	/**수금예정일자**/
		rx.add(resForm, "no_purc_yn", "N");
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
