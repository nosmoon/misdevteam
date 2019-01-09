<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="java.util.*
                ,chosun.ciis.ad.bas.rec.*
			    ,chosun.ciis.ad.bas.ds.*
			    ,chosun.ciis.co.base.util.*
			    ,somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	 
	AD_BAS_1110_SDataSet ds = (AD_BAS_1110_SDataSet)request.getAttribute("ds");
	
	int root 	  = RwXml.rootNodeID;
	int tempData	  = rx.add( root , "tempData" , "");
	rx.add(tempData, "dlco_no", ds.dlco_no);
	rx.add(tempData, "dlco_nm", ds.dlco_nm);
	
	int formData  = rx.add( root , "formData" , "");
	rx.add(formData, "ern", ds.ern);
	rx.add(formData, "presi_nm", ds.presi_nm);
	rx.add(formData, "bizcond", ds.bizcond);
	rx.add(formData, "capt_amt", ds.capt_amt);
	rx.add(formData, "tel", ds.tel);
	rx.add(formData, "presi_prn", ds.presi_prn);
	rx.add(formData, "item", ds.item);
	rx.add(formData, "zip_1", ds.zip_1);
	rx.add(formData, "zip_2", ds.zip_2);
	rx.add(formData, "addr", ds.addr);
	rx.add(formData, "dtls_addr", ds.dtls_addr);
	rx.add(formData, "presi_zip_1", ds.presi_zip_1);
	rx.add(formData, "presi_zip_2", ds.presi_zip_2);
	rx.add(formData, "presi_addr", ds.presi_addr);
	rx.add(formData, "presi_dtls_addr", ds.presi_dtls_addr);
	rx.add(formData, "cntr_type", ds.cntr_type);
	rx.add(formData, "cntr_prd_frdt", ds.cntr_prd_frdt);
	rx.add(formData, "cntr_prd_todt", ds.cntr_prd_todt);
	rx.add(formData, "fndt_dt", ds.fndt_dt);
	rx.add(formData, "mang_clsf", ds.mang_clsf);
	rx.add(formData, "grp_cmpy_cd", ds.grp_cmpy_cd);
	rx.add(formData, "evlu_frdt", ds.evlu_frdt);
	rx.add(formData, "evlu_todt", ds.evlu_todt);
	rx.add(formData, "dhon_dt", ds.dhon_dt);
	rx.add(formData, "cntr_frdt", ds.cntr_frdt);
	rx.add(formData, "cntr_todt", ds.cntr_todt);  
	rx.add(formData, "gnr_advcs_yn", StringUtil.nvl(ds.gnr_advcs_yn, "N"));
	rx.add(formData, "arow_advcs_yn", StringUtil.nvl(ds.arow_advcs_yn, "N"));
	rx.add(formData, "agn_yn", StringUtil.nvl(ds.agn_yn, "N"));
	rx.add(formData, "nmd_agn_yn", StringUtil.nvl(ds.nmd_agn_yn, "N"));	
	rx.add(formData, "advt_bo_yn", StringUtil.nvl(ds.advt_bo_yn, "N"));
	rx.add(formData, "bo_bof_yn", StringUtil.nvl(ds.bo_bof_yn, "N"));
	rx.add(formData, "del_yn", StringUtil.nvl(ds.del_yn, "N"));
	rx.add(formData, "deal_ptcr_unissu_yn", StringUtil.nvl(ds.deal_ptcr_unissu_yn, "N"));
	rx.add(formData, "slcrg_pers", ds.slcrg_pers);
	rx.add(formData, "slcrg_pers_nm", ds.slcrg_pers_nm);
	rx.add(formData, "mchrg_pers", ds.mchrg_pers);
	rx.add(formData, "mchrg_pers_nm", ds.mchrg_pers_nm);
	rx.add(formData, "chg_dt_tm", ds.chg_dt_tm);
	rx.add(formData, "chg_pers", ds.chg_pers);
	
	int gridData = rx.add(formData, "gridData", "");
	String ewh_cnfm = "";
	String owh_cnfm = "";	    
	for(int i = 0; i < ds.curlist.size(); i++) {
		AD_BAS_1110_SCURLISTRecord rec = (AD_BAS_1110_SCURLISTRecord)ds.curlist.get(i);
		int record = rx.add(gridData, "record", "");
		rx.add(record, "seq", rec.seq);		
		rx.add(record, "eip_stat", rec.eip_stat);			
		rx.add(record, "repl_rtcn_cnfm1", rec.repl_rtcn_cnfm1);
		rx.add(record, "repl_rtcn_cnfm2", rec.repl_rtcn_cnfm2);
		rx.add(record, "repl_rtcn_cnfm3", rec.repl_rtcn_cnfm3); 
		rx.add(record, "mortg_clsf", rec.mortg_clsf); 
		rx.add(record, "mortg_cont", rec.mortg_cont);
		rx.add(record, "mortg_amt", rec.mortg_amt);
		rx.add(record, "acct_no", rec.acct_no);
		rx.add(record, "gurt_frdt", rec.gurt_frdt);
		rx.add(record, "gurt_todt", rec.gurt_todt);
		rx.add(record, "ewh_dt", rec.ewh_dt);
		rx.add(record, "remk", rec.remk);
		rx.add(record, "setup_pers", rec.setup_pers);
		ewh_cnfm = rec.ewh_cnfm == "" ? "N" : rec.ewh_cnfm;
		owh_cnfm = rec.owh_cnfm == "" ? "N" : rec.owh_cnfm;		
		rx.add(record, "ewh_cnfm", ewh_cnfm);//rec.ewh_cnfm);  
		rx.add(record, "owh_cnfm", owh_cnfm);//rec.owh_cnfm);
		rx.add(record, "old_ewh_cnfm", ewh_cnfm);//rec.ewh_cnfm);  
		rx.add(record, "old_owh_cnfm", owh_cnfm);//rec.owh_cnfm);
	}	   

	int gridData2 = rx.add(formData, "gridData2", "");
	    
	for(int i = 0; i < ds.curlist2.size(); i++) {
		AD_BAS_1110_SCURLIST2Record rec = (AD_BAS_1110_SCURLIST2Record)ds.curlist2.get(i);
		int record = rx.add(gridData2, "record", "");
		rx.add(record, "dept_nm", rec.dept_nm);
		rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);  
		rx.add(record, "cntc_plac", rec.cntc_plac);   
		rx.add(record, "chrg_seq", rec.seq);		  
	}	 
	
	rx.add(formData, "gurt_pers", ds.gurt_pers);
	rx.add(formData, "gurt_pers_addr", ds.gurt_pers_addr);
	rx.add(formData, "gurt_pers_prn", ds.gurt_pers_prn);
	
	Calendar cal 			= Calendar.getInstance();
	String year 			= String.valueOf(cal.get(cal.YEAR));
	String month 			= String.valueOf(cal.get(cal.MONTH) + 1);
	String day				= String.valueOf(cal.get(cal.DATE));
	month					= month.length() == 1 ? "0" + month : month;
	day						= day.length() == 1 ? "0" + day : day;
	
	String today			= year + month + day;
	
	rx.add(formData, "inpt_pubc_dt",today);
	
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>