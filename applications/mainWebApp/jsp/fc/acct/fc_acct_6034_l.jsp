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
	FC_ACCT_6034_LDataSet ds = (FC_ACCT_6034_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int resData = 0;
	int tempData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//resData = rx.add(root, "resData", "");
	tempData = rx.add(root,"tempData","");

	try {
		/****** 제출자  BEGIN */
		int gridData1 = rx.add(tempData, "gridData6", "");
		//System.out.println(ds.curlist1.size());
		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_6034_LCURLIST1Record rec = (FC_ACCT_6034_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "seq1", rec.seq1);
			rx.add(record, "seq2", rec.seq2);
			rx.add(record, "seq3", rec.seq3);
			rx.add(record, "seq4", rec.seq4);
			rx.add(record, "seq5", rec.seq5);
			rx.add(record, "recd_clsf", rec.recd_clsf);
			rx.add(record, "taxoff", rec.taxoff);
			rx.add(record, "subm_ymd", rec.subm_ymd);
			rx.add(record, "subm_pers_clsf", rec.subm_pers_clsf);
			rx.add(record, "tax_agnt_no", rec.tax_agnt_no);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "corp_nm", rec.corp_nm);
			rx.add(record, "corp_reg_no", rec.corp_reg_no);
			rx.add(record, "presi", rec.presi);
			rx.add(record, "plcw_law_cd", rec.plcw_law_cd);
			rx.add(record, "plcw_law_addr", rec.plcw_law_addr);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "subm_noit_tot", rec.subm_noit_tot);
			rx.add(record, "use_korn_cd_kind", rec.use_korn_cd_kind);
			rx.add(record, "bill_sender", rec.bill_sender);			
		}
		/****** 제출자 END */
		/****** 제출의무자  BEGIN */
		int gridData2 = rx.add(tempData, "gridData7", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_6034_LCURLIST2Record rec = (FC_ACCT_6034_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "seq1", rec.seq1);
			rx.add(record, "seq2", rec.seq2);
			rx.add(record, "seq3", rec.seq3);
			rx.add(record, "seq4", rec.seq4);
			rx.add(record, "seq5", rec.seq5);
			rx.add(record, "recd_clsf", rec.recd_clsf);
			rx.add(record, "taxoff", rec.taxoff);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "corp_nm", rec.corp_nm);
			rx.add(record, "presi", rec.presi);
			rx.add(record, "erplace_law_dstc_cd", rec.erplace_law_dstc_cd);
			rx.add(record, "erplace_plcw", rec.erplace_plcw);
			rx.add(record, "bill_sender", rec.bill_sender);
		}
		/****** 제출의무자 END */
		/****** 매출계산서 합계  BEGIN */
		int gridData3 = rx.add(tempData, "gridData3_N", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			FC_ACCT_6034_LCURLIST3Record rec = (FC_ACCT_6034_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "seq1", rec.seq1);
			rx.add(record, "seq2", rec.seq2);
			rx.add(record, "seq3", rec.seq3);
			rx.add(record, "seq4", rec.seq4);
			rx.add(record, "seq5", rec.seq5);
			rx.add(record, "recd_clsf", rec.recd_clsf);
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "qt_clsf", rec.qt_clsf);
			rx.add(record, "taxoff", rec.taxoff);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "subm_ern", rec.subm_ern);
			rx.add(record, "rvrs_yy", rec.rvrs_yy);
			rx.add(record, "deal_prd_fr", rec.deal_prd_fr);
			rx.add(record, "deal_prd_to", rec.deal_prd_to);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "sale_dlco_cnt1", rec.sale_dlco_cnt1);
			rx.add(record, "stmt_nosh1", rec.stmt_nosh1);
			rx.add(record, "minus_indc1", rec.minus_indc1);
			rx.add(record, "sale_amt1", rec.sale_amt1);
			rx.add(record, "sale_dlco_cnt2", rec.sale_dlco_cnt2);
			rx.add(record, "stmt_nosh2", rec.stmt_nosh2);
			rx.add(record, "minus_indc2", rec.minus_indc2);
			rx.add(record, "sale_amt2", rec.sale_amt2);
			rx.add(record, "sale_dlco_cnt3", rec.sale_dlco_cnt3);
			rx.add(record, "stmt_nosh3", rec.stmt_nosh3);
			rx.add(record, "minus_indc3", rec.minus_indc3);
			rx.add(record, "sale_amt3", rec.sale_amt3);
			rx.add(record, "bill_sender", rec.bill_sender);
		}
		/****** 매출계산서 합계 END */
		/****** 매출계산서 BEGIN */
		int gridData4 = rx.add(tempData, "gridData2_N", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			FC_ACCT_6034_LCURLIST4Record rec = (FC_ACCT_6034_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "seq1", rec.seq1);
			rx.add(record, "seq2", rec.seq2);
			rx.add(record, "seq3", rec.seq3);
			rx.add(record, "seq4", rec.seq4);
			rx.add(record, "seq5", rec.seq5);
			rx.add(record, "recd_clsf", rec.recd_clsf);
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "qt_clsf", rec.qt_clsf);
			rx.add(record, "taxoff", rec.taxoff);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "subm_ern", rec.subm_ern);
			rx.add(record, "sale_dlco_ern", rec.sale_dlco_ern);
			rx.addCData(record, "corp_nm", rec.corp_nm);
			rx.add(record, "stmt_nosh", rec.stmt_nosh);
			rx.add(record, "minus_indc", rec.minus_indc);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.addCData(record, "bill_sender", rec.bill_sender);
		}
		/****** 매출계산서 END */
	/****** 매입계산서 합계 BEGIN */
		int gridData5 = rx.add(tempData, "gridData5_N", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			FC_ACCT_6034_LCURLIST5Record rec = (FC_ACCT_6034_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(gridData5, "record", "");
			rx.add(record, "seq1", rec.seq1);
			rx.add(record, "seq2", rec.seq2);
			rx.add(record, "seq3", rec.seq3);
			rx.add(record, "seq4", rec.seq4);
			rx.add(record, "seq5", rec.seq5);
			rx.add(record, "recd_clsf", rec.recd_clsf);
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "qt_clsf", rec.qt_clsf);
			rx.add(record, "taxoff", rec.taxoff);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "subm_ern", rec.subm_ern);
			rx.add(record, "rvrs_yy", rec.rvrs_yy);
			rx.add(record, "deal_prd_fr", rec.deal_prd_fr);
			rx.add(record, "deal_prd_to", rec.deal_prd_to);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "sale_dlco_cnt1", rec.sale_dlco_cnt1);
			rx.add(record, "stmt_nosh1", rec.stmt_nosh1);
			rx.add(record, "minus_indc1", rec.minus_indc1);
			rx.add(record, "sale_amt1", rec.sale_amt1);
			rx.add(record, "sale_dlco_cnt2", rec.sale_dlco_cnt2);
			rx.add(record, "stmt_nosh2", rec.stmt_nosh2);
			rx.add(record, "minus_indc2", rec.minus_indc2);
			rx.add(record, "sale_amt2", rec.sale_amt2);
			rx.add(record, "sale_dlco_cnt3", rec.sale_dlco_cnt3);
			rx.add(record, "stmt_nosh3", rec.stmt_nosh3);
			rx.add(record, "minus_indc3", rec.minus_indc3);
			rx.add(record, "sale_amt3", rec.sale_amt3);
			rx.add(record, "bill_sender", rec.bill_sender);
		}
		/****** 매입계산서 합계 END */
		/****** 매입계산서 BEGIN */
		int gridData6 = rx.add(tempData, "gridData4_N", "");
		
		for(int i = 0; i < ds.curlist6.size(); i++) {
			FC_ACCT_6034_LCURLIST6Record rec = (FC_ACCT_6034_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(gridData6, "record", "");
			rx.add(record, "seq1", rec.seq1);
			rx.add(record, "seq2", rec.seq2);
			rx.add(record, "seq3", rec.seq3);
			rx.add(record, "seq4", rec.seq4);
			rx.add(record, "seq5", rec.seq5);
			rx.add(record, "recd_clsf", rec.recd_clsf);
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "qt_clsf", rec.qt_clsf);
			rx.add(record, "taxoff", rec.taxoff);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "subm_ern", rec.subm_ern);
			rx.add(record, "sale_dlco_ern", rec.sale_dlco_ern);
			rx.addCData(record, "corp_nm", rec.corp_nm);
			rx.add(record, "stmt_nosh", rec.stmt_nosh);
			rx.add(record, "minus_indc", rec.minus_indc);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.addCData(record, "bill_sender", rec.bill_sender);

		}
		/****** 매입계산서  END */
		/****** 전자매출계산서 합계  BEGIN */
		int gridData7 = rx.add(tempData, "gridData10_N", "");

		for(int i = 0; i < ds.curlist10.size(); i++) {
			FC_ACCT_6034_LCURLIST10Record rec = (FC_ACCT_6034_LCURLIST10Record)ds.curlist10.get(i);
			int record = rx.add(gridData7, "record", "");
			rx.add(record, "seq1", rec.seq1);
			rx.add(record, "seq2", rec.seq2);
			rx.add(record, "seq3", rec.seq3);
			rx.add(record, "seq4", rec.seq4);
			rx.add(record, "seq5", rec.seq5);
			rx.add(record, "recd_clsf", rec.recd_clsf);
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "qt_clsf", rec.qt_clsf);
			rx.add(record, "taxoff", rec.taxoff);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "subm_ern", rec.subm_ern);
			rx.add(record, "rvrs_yy", rec.rvrs_yy);
			rx.add(record, "deal_prd_fr", rec.deal_prd_fr);
			rx.add(record, "deal_prd_to", rec.deal_prd_to);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "sale_dlco_cnt1", rec.sale_dlco_cnt1);
			rx.add(record, "stmt_nosh1", rec.stmt_nosh1);
			rx.add(record, "minus_indc1", rec.minus_indc1);
			rx.add(record, "sale_amt1", rec.sale_amt1);
			rx.add(record, "sale_dlco_cnt2", rec.sale_dlco_cnt2);
			rx.add(record, "stmt_nosh2", rec.stmt_nosh2);
			rx.add(record, "minus_indc2", rec.minus_indc2);
			rx.add(record, "sale_amt2", rec.sale_amt2);
			rx.add(record, "sale_dlco_cnt3", rec.sale_dlco_cnt3);
			rx.add(record, "stmt_nosh3", rec.stmt_nosh3);
			rx.add(record, "minus_indc3", rec.minus_indc3);
			rx.add(record, "sale_amt3", rec.sale_amt3);
			rx.add(record, "bill_sender", rec.bill_sender);
		}
		/****** 전자매출계산서 합계  END */
		/****** 전자매출계산서 BEGIN */
		int gridData8 = rx.add(tempData, "gridData11_N", "");

		for(int i = 0; i < ds.curlist11.size(); i++) {
			FC_ACCT_6034_LCURLIST11Record rec = (FC_ACCT_6034_LCURLIST11Record)ds.curlist11.get(i);
			int record = rx.add(gridData8, "record", "");
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "tax_clsf", rec.tax_clsf);
			rx.add(record, "ern", rec.ern);
			rx.addCData(record, "ern_nm", rec.ern_nm);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "total_amt", rec.total_amt);
		}
		/****** 전자매출계산서 END */
	/****** 전자매입계산서 합계 BEGIN */
		int gridData9 = rx.add(tempData, "gridData12_N", "");

		for(int i = 0; i < ds.curlist12.size(); i++) {
			FC_ACCT_6034_LCURLIST12Record rec = (FC_ACCT_6034_LCURLIST12Record)ds.curlist12.get(i);
			int record = rx.add(gridData9, "record", "");
			rx.add(record, "seq1", rec.seq1);
			rx.add(record, "seq2", rec.seq2);
			rx.add(record, "seq3", rec.seq3);
			rx.add(record, "seq4", rec.seq4);
			rx.add(record, "seq5", rec.seq5);
			rx.add(record, "recd_clsf", rec.recd_clsf);
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "qt_clsf", rec.qt_clsf);
			rx.add(record, "taxoff", rec.taxoff);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "subm_ern", rec.subm_ern);
			rx.add(record, "rvrs_yy", rec.rvrs_yy);
			rx.add(record, "deal_prd_fr", rec.deal_prd_fr);
			rx.add(record, "deal_prd_to", rec.deal_prd_to);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "sale_dlco_cnt1", rec.sale_dlco_cnt1);
			rx.add(record, "stmt_nosh1", rec.stmt_nosh1);
			rx.add(record, "minus_indc1", rec.minus_indc1);
			rx.add(record, "sale_amt1", rec.sale_amt1);
			rx.add(record, "sale_dlco_cnt2", rec.sale_dlco_cnt2);
			rx.add(record, "stmt_nosh2", rec.stmt_nosh2);
			rx.add(record, "minus_indc2", rec.minus_indc2);
			rx.add(record, "sale_amt2", rec.sale_amt2);
			rx.add(record, "sale_dlco_cnt3", rec.sale_dlco_cnt3);
			rx.add(record, "stmt_nosh3", rec.stmt_nosh3);
			rx.add(record, "minus_indc3", rec.minus_indc3);
			rx.add(record, "sale_amt3", rec.sale_amt3);
			rx.add(record, "bill_sender", rec.bill_sender);
		}
		/****** 전자매입계산서 합계 END */		
		/****** 전자매입계산서  BEGIN */
		int gridData10 = rx.add(tempData, "gridData13_N", "");

		for(int i = 0; i < ds.curlist13.size(); i++) {
			FC_ACCT_6034_LCURLIST13Record rec = (FC_ACCT_6034_LCURLIST13Record)ds.curlist13.get(i);
			int record = rx.add(gridData10, "record", "");
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "tax_clsf", rec.tax_clsf);
			rx.add(record, "ern", rec.ern);
			rx.addCData(record, "ern_nm", rec.ern_nm);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "total_amt", rec.total_amt);
		}
		/****** 전자매입계산서 END */	
		
		
		int list2 = ds.curlist2.size();
		int list3 = ds.curlist3.size();
		int list4 = ds.curlist4.size();
		int list5 = ds.curlist5.size();
		int list6 = ds.curlist6.size();
		int list10 = ds.curlist10.size();
		int list12 = ds.curlist12.size();
		
		//bill_sender 세팅 
		int fc_acct_6034_l = rx.add(tempData,"fc_acct_6034_l","");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			if(ds.curlist1.size() != 0){
				FC_ACCT_6034_LCURLIST1Record rec = (FC_ACCT_6034_LCURLIST1Record)ds.curlist1.get(i);
				int record = rx.add(fc_acct_6034_l, "record", "");
				rx.add(record, "bill_sender", StringUtil.replaceToXml(rec.bill_sender));
			}
		}
		for(int i = 0; i < ds.curlist2.size(); i++) {
			if(ds.curlist2.size() != 0){
				FC_ACCT_6034_LCURLIST2Record rec = (FC_ACCT_6034_LCURLIST2Record)ds.curlist2.get(i);
				int record = rx.add(fc_acct_6034_l, "record", "");
				rx.add(record, "bill_sender", StringUtil.replaceToXml(rec.bill_sender));
			}
		}
		for(int i = 0; i < ds.curlist3.size(); i++) {
			if(ds.curlist3.size() > 0){
				FC_ACCT_6034_LCURLIST3Record rec = (FC_ACCT_6034_LCURLIST3Record)ds.curlist3.get(i);
				int record = rx.add(fc_acct_6034_l, "record", "");
				rx.add(record, "bill_sender", StringUtil.replaceToXml(rec.bill_sender));
			}	
		}
		for(int i = 0; i < ds.curlist4.size(); i++) {
			if(ds.curlist4.size() > 0){
				FC_ACCT_6034_LCURLIST4Record rec = (FC_ACCT_6034_LCURLIST4Record)ds.curlist4.get(i);
				int record = rx.add(fc_acct_6034_l, "record", "");
				rx.add(record, "bill_sender", StringUtil.replaceToXml(rec.bill_sender));
			}	
		}
		for(int i = 0; i < ds.curlist10.size(); i++) {
			if(ds.curlist10.size() > 0){
				FC_ACCT_6034_LCURLIST10Record rec = (FC_ACCT_6034_LCURLIST10Record)ds.curlist10.get(i);
				int record = rx.add(fc_acct_6034_l, "record", "");
				rx.add(record, "bill_sender", StringUtil.replaceToXml(rec.bill_sender));
			}	
		}	
		for(int i = 0; i < ds.curlist5.size(); i++) {
			if(ds.curlist5.size() > 0){
				FC_ACCT_6034_LCURLIST5Record rec = (FC_ACCT_6034_LCURLIST5Record)ds.curlist5.get(i);
				int record = rx.add(fc_acct_6034_l, "record", "");
				rx.add(record, "bill_sender", StringUtil.replaceToXml(rec.bill_sender));
			}	
		}	
		for(int i = 0; i < ds.curlist6.size(); i++) {
			if(ds.curlist6.size() > 0){
				FC_ACCT_6034_LCURLIST6Record rec = (FC_ACCT_6034_LCURLIST6Record)ds.curlist6.get(i);
				int record = rx.add(fc_acct_6034_l, "record", "");
				rx.add(record, "bill_sender", StringUtil.replaceToXml(rec.bill_sender));
			}	
		}	
		for(int i = 0; i < ds.curlist12.size(); i++) {
			if(ds.curlist12.size() > 0){
				FC_ACCT_6034_LCURLIST12Record rec = (FC_ACCT_6034_LCURLIST12Record)ds.curlist12.get(i);
				int record = rx.add(fc_acct_6034_l, "record", "");
				rx.add(record, "bill_sender", StringUtil.replaceToXml(rec.bill_sender));
			}	
		}		
		rx.add(fc_acct_6034_l, "totalcnt", ds.curlist1.size() + list2 + list3 + list4 + list10 + list5 + list6 + list12);											
	
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(tempData, "errcode", errcode);
		rx.add(tempData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
<% /* 작성시간 : Mon Apr 27 10:39:44 KST 2009 */ %>