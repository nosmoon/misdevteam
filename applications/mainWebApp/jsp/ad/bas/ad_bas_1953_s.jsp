<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
				,chosun.ciis.ad.bas.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1953_SDataSet ds = (AD_BAS_1953_SDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int resData   	= rx.add(root, "resData2", "");

	try {  
	

		int resForm   	= rx.add(resData, "resForm", "");

		rx.add(resForm, "prvmm_unrcp_amt"            ,ds.prvmm_unrcp_amt);             
		rx.add(resForm, "thmm_unrcp_amt"             ,ds.thmm_unrcp_amt);
		rx.add(resForm, "unrcp_tot_amt"              ,ds.unrcp_tot_amt);
		rx.add(resForm, "un_repay_dhon_bal"          ,ds.un_repay_dhon_bal);
		rx.add(resForm, "mang_expt_ufth_bond_amt"    ,ds.mang_expt_ufth_bond_amt);
		rx.add(resForm, "busn_expt_ufth_bond_amt"    ,ds.busn_expt_ufth_bond_amt);
		rx.add(resForm, "mang_dr_stot"               ,ds.mang_dr_stot);
		rx.add(resForm, "busn_dr_stot"             	,ds.busn_dr_stot);
		rx.add(resForm, "mang_mortg_surp_amt"       ,ds.mang_mortg_surp_amt);
		rx.add(resForm, "busn_mortg_surp_amt"   	,ds.busn_mortg_surp_amt);
		rx.add(resForm, "mortg_amt"   				,ds.mortg_amt);
		rx.add(resForm, "un_pay_fee"                ,ds.un_pay_fee);  
		rx.add(resForm, "precpt_amt"                ,ds.precpt_amt);
		rx.add(resForm, "acml_amt"             		,ds.acml_amt);
		rx.add(resForm, "etc_mortg_amt"             ,ds.etc_mortg_amt);
		rx.add(resForm, "dng_stot"              	,ds.dng_stot);
		
		rx.add(resForm, "avg_point"              	,ds.avg_point);
		rx.add(resForm, "sum_kiil"              	,ds.sum_kiil);
		rx.add(resForm, "evlu_frdt"              	,ds.evlu_frdt);
		rx.add(resForm, "evlu_todt"              	,ds.evlu_todt);
		rx.add(resForm, "slcrg_pers"              	,ds.slcrg_pers);
		rx.add(resForm, "slcrg_pers_nm"             ,ds.slcrg_pers_nm);
		rx.add(resForm, "mchrg_pers"             	,ds.mchrg_pers);
		rx.add(resForm, "mchrg_pers_nm"             ,ds.mchrg_pers_nm);
		rx.add(resForm, "basi_dt"              		,ds.basi_dt);
		 
		int gridData   	= rx.add(resData, "gridData", "");
		
		long recenote_tot_amt 		= 0;
		long busn_recenote_tot_amt 	= 0;
		long mang_recenote_tot_amt 	= 0;
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1953_SCURLISTRecord rec = (AD_BAS_1953_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
		
			rx.add(record, "mang_chce_yn", rec.mang_chce_yn);
			rx.add(record, "busn_chce_yn", rec.busn_chce_yn);
			rx.add(record, "dhon_chce_yn", rec.dhon_chce_yn);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "now_note_stat_nm", rec.now_note_stat_nm);
			rx.add(record, "note_no", rec.note_no);
			
			recenote_tot_amt 		+= StringUtil.toLong(rec.note_amt);
			if("Y".equals(rec.mang_chce_yn)){
				mang_recenote_tot_amt	+= StringUtil.toLong(rec.note_amt);
			}	
			if("Y".equals(rec.busn_chce_yn)){
				busn_recenote_tot_amt	+= StringUtil.toLong(rec.note_amt);
			}	
		}	
		
		//if(recenote_tot_amt == 0) recenote_tot_amt = 1;
		resForm   	= rx.add(resData, "resForm", "");
		
		String busn_percent = "0";
		String mang_percent = "0";
		if(recenote_tot_amt > 0){
			busn_percent	= DigitUtil.cutUnderPoint((double)busn_recenote_tot_amt*100/(double)recenote_tot_amt, 0);
			mang_percent	= DigitUtil.cutUnderPoint((double)mang_recenote_tot_amt*100/(double)recenote_tot_amt, 0);
		}
		rx.add(resForm, "recenote_tot_amt"          ,recenote_tot_amt);
		rx.add(resForm, "busn_recenote_tot_amt"     ,DigitUtil.nf_format(busn_recenote_tot_amt)+"("+busn_percent+"%)");
		rx.add(resForm, "mang_recenote_tot_amt"     ,DigitUtil.nf_format(mang_recenote_tot_amt)+"("+mang_percent+"%)");
				
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
