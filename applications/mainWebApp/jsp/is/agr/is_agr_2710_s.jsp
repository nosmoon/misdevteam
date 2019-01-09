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
	IS_AGR_2710_SDataSet ds = (IS_AGR_2710_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {
		/****** CURLIST_A BEGIN */
		int gridData1 = rx.add(resForm, "gridData1", "");

		for(int i = 0; i < ds.curlist_a.size(); i++) {
			IS_AGR_2710_SCURLIST_ARecord rec = (IS_AGR_2710_SCURLIST_ARecord)ds.curlist_a.get(i);
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
			rx.add(record, "a_qunt", rec.a_qunt);
			rx.add(record, "a_purc_amt", rec.a_purc_amt);
			rx.add(record, "a_trc_yn", rec.a_trc_yn);
			rx.add(record, "a_send_yn", rec.a_send_yn);
			rx.add(record, "a_remk", rec.a_remk);
			rx.add(record, "a_adjm_yn", rec.a_adjm_yn);
			rx.add(record, "a_chg_dt_tm", rec.a_chg_dt_tm);
		}
		/****** CURLIST_A END */
	
		
		rx.add(resForm, "make_ask_reg_dt",         	  ds.make_ask_reg_dt);                
		rx.add(resForm, "make_ask_reg_seq",           ds.make_ask_reg_seq);               
		rx.add(resForm, "acwr_reg_dt",                ds.acwr_reg_dt);                    
		rx.add(resForm, "acwr_reg_seq",               ds.acwr_reg_seq);                   
		rx.add(resForm, "dlco_chrg_pers_nm",          ds.dlco_chrg_pers_nm);              
		rx.add(resForm, "dlco_chrg_pers_cntc_plac",   ds.dlco_chrg_pers_cntc_plac);       
		rx.add(resForm, "dlco_chrg_pers_email",       ds.dlco_chrg_pers_email);           
		rx.add(resForm, "dlvs_dt",                    ds.dlvs_dt);                        
		rx.add(resForm, "work_clsf",                  ds.work_clsf);                      
		rx.add(resForm, "dlvs_plac_addr",             ds.dlvs_plac_addr);                 
		rx.add(resForm, "clr_cd",                     ds.clr_cd);                         
		rx.add(resForm, "prt_paper_cd",               ds.prt_paper_cd);                   
		rx.add(resForm, "incmp_design_yn",            ds.incmp_design_yn);                
		rx.add(resForm, "advcs_make_yn",              ds.advcs_make_yn);                  
		rx.add(resForm, "pcnt_clsf",                  ds.pcnt_clsf);                      
		rx.add(resForm, "yy",                         ds.yy);                             
		rx.add(resForm, "prt_plan_dt",                ds.prt_plan_dt);                    
		rx.add(resForm, "prz_rate_clsf",              ds.prz_rate_clsf);                  
		rx.add(resForm, "prz_amt",                    ds.prz_amt);                        
		rx.add(resForm, "prz_phb_saly_boks",          ds.prz_phb_saly_boks);              
		rx.add(resForm, "remk",                       ds.remk);                           
		rx.add(resForm, "proc_stat",                  ds.proc_stat);                      
		rx.add(resForm, "chg_pers",                   ds.chg_pers);                       
		rx.add(resForm, "chg_dt_tm",                  ds.chg_dt_tm);                      
		                                                                                 
		rx.add(resForm, "dept_cd",                    ds.dept_cd);                        
		rx.add(resForm, "sub_dept_cd",                ds.sub_dept_cd);                    
		rx.add(resForm, "chrg_pers",                  ds.chrg_pers);                      
		rx.add(resForm, "chrg_pers_nm",               ds.chrg_pers_nm);                   
		rx.add(resForm, "dlco_clsf_cd_seq",           ds.dlco_clsf_cd_seq);               
		rx.add(resForm, "dlco_nm",                    ds.dlco_nm);                        
		rx.add(resForm, "advcs_cd",                   ds.advcs_cd);                       
		rx.add(resForm, "advcs_cd_nm",                ds.advcs_cd_nm);                    
		rx.add(resForm, "qunt",                       ds.qunt);                           
		//rx.add(resForm, "uprc",                       ds.uprc);  
		rx.add(resForm, "uprc", DigitUtil.cutUnderPoint(ds.uprc,2));                         
		rx.add(resForm, "suply_amt",                  ds.suply_amt);                      
		rx.add(resForm, "vat_amt",                    ds.vat_amt);                        
		rx.add(resForm, "tot_rvord_amt",              ds.tot_rvord_amt);                  
		rx.add(resForm, "in_amt",                     ds.in_amt);                         
		//rx.add(resForm, "in_amt_rate",                ds.in_amt_rate);    
		rx.add(resForm, "in_amt_rate", DigitUtil.cutUnderPoint(ds.in_amt_rate,2));
		rx.add(resForm, "clamt_mthd_nm",              ds.clamt_mthd_nm);                  
		rx.add(resForm, "std_cd_nm",                  ds.std_cd_nm);                      
		rx.add(resForm, "flag",            			  ds.flag);
		rx.add(resForm, "dlvs_plac_clsf",             "");
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
