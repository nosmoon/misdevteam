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
	IS_AGR_3110_SDataSet ds = (IS_AGR_3110_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {
		
        rx.add(resForm, "make_ask_reg_dt",         	  	ds.make_ask_reg_dt);                 
		rx.add(resForm, "make_ask_reg_seq",           	ds.make_ask_reg_seq);        
		rx.add(resForm, "dept_cd",           		  	ds.dept_cd);                 
		rx.add(resForm, "sub_dept_cd",           	  	ds.sub_dept_cd);             
		rx.add(resForm, "chrg_pers",           		  	ds.chrg_pers);               
		rx.add(resForm, "chrg_pers_nm",           	  	ds.chrg_pers_nm);            
		rx.add(resForm, "dlco_nm",           		  	ds.dlco_nm);                 
		rx.add(resForm, "dlco_chrg_pers_nm",          	ds.dlco_chrg_pers_nm);       
		rx.add(resForm, "dlco_chrg_pers_cntc_plac",   	ds.dlco_chrg_pers_cntc_plac);
		rx.add(resForm, "advt_nm",   		  			ds.advt_nm);               
		rx.add(resForm, "draft_end_dt",       			ds.draft_end_dt);                    
		rx.add(resForm, "dlvs_dt",            			ds.dlvs_dt);                         
		rx.add(resForm, "acwr_incmg_dt_tm",   			ds.acwr_incmg_dt_tm);                
		rx.add(resForm, "work_kind",          			ds.work_kind);                       
		rx.add(resForm, "make_clsf",          			ds.make_clsf);                       
		rx.add(resForm, "std_cd",             			ds.std_cd);                          
		rx.add(resForm, "std_cd_nm",          			ds.std_cd_nm);                       
		rx.add(resForm, "clr_cd",             			ds.clr_cd);                          
		rx.add(resForm, "prt_paper",          			ds.prt_paper);                       
		rx.add(resForm, "rvord_qunt",         			ds.rvord_qunt);                      
		//rx.add(resForm, "rvord_uprc",         			ds.rvord_uprc); 
		rx.add(resForm, "rvord_uprc", DigitUtil.cutUnderPoint(ds.rvord_uprc,2));                             
		rx.add(resForm, "rvord_amt",          			ds.rvord_amt);                       
		rx.add(resForm, "dlvs_plac",          			ds.dlvs_plac);                       
		rx.add(resForm, "remk",               			ds.remk);                            
		rx.add(resForm, "chrg_pers_tel_no",   			ds.chrg_pers_tel_no);                
		rx.add(resForm, "plan_chrg_ptph_no",  			ds.plan_chrg_ptph_no);               
		rx.add(resForm, "proc_stat",          			ds.proc_stat);               
		rx.add(resForm, "flag",         	  			"U");       
		
		/****** CURLIST_A BEGIN */
		int gridData1 = rx.add(resForm, "gridData1", "");

		for(int i = 0; i < ds.curlist_a.size(); i++) {
			IS_AGR_3110_SCURLIST_ARecord rec = (IS_AGR_3110_SCURLIST_ARecord)ds.curlist_a.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "gridData1", rec.make_ask_dtls_seq);
			rx.add(record, "a_dlco_clsf_cd_seq", rec.dlco_clsf_cd_seq);
			rx.add(record, "a_dlco_nm", rec.dlco_nm);
			rx.add(record, "a_purc_clsf", rec.purc_clsf);
			//rx.add(record, "a_uprc", rec.uprc);
			rx.add(record, "a_uprc", DigitUtil.cutUnderPoint(rec.uprc,2));
			rx.add(record, "a_qunt", rec.qunt);
			rx.add(record, "a_purc_amt", rec.purc_amt);
			rx.add(record, "a_stmt_recp_yn", rec.stmt_recp_yn);
			rx.add(record, "a_remk", rec.remk);
			rx.add(record, "a_make_ask_dtls_seq", rec.make_ask_dtls_seq);
		}
		/****** CURLIST_A END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
