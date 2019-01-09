<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
				,chosun.ciis.ad.bas.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>

<%

	String srch_clsf	=	StringUtil.nvl(request.getParameter("srch_clsf"));
	
	RwXml rx = new RwXml();
	AD_BAS_1710_SDataSet ds = (AD_BAS_1710_SDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int resData   	= rx.add(root, "resData", "");
	int resForm   	= rx.add(resData, "resForm", "");

	try {
		rx.add(resForm, "dlco_clsf",               		ds.dlco_clsf);                   
		rx.add(resForm, "dlco_no",               		ds.dlco_no);                   
		rx.add(resForm, "basi_dt",               		ds.basi_dt);                   
		
		if("N".equals(srch_clsf)){
			for(int i = 0; i < ds.curlist1.size(); i++) {
				AD_BAS_1710_SCURLIST1Record rec = (AD_BAS_1710_SCURLIST1Record)ds.curlist1.get(i);
				if(i == 0){
					rx.add(resForm, "prvmm_unrcp_amt",			   rec.unrcp_amt);        
				}else if(i == 1){
					rx.add(resForm, "thmm_unrcp_amt",			   rec.unrcp_amt);  
				}
			}			
		}else{
			rx.add(resForm, "prvmm_unrcp_amt		  	" ,ds.prvmm_unrcp_amt					);
			rx.add(resForm, "thmm_unrcp_amt		        " ,ds.thmm_unrcp_amt		        );
		}
		rx.add(resForm, "mang_dr_stot		        " ,ds.mang_dr_stot		          );
		rx.add(resForm, "busn_dr_stot		        " ,ds.busn_dr_stot		          );
		rx.add(resForm, "etc_mortg_amt		        " ,ds.etc_mortg_amt		        );
		rx.add(resForm, "dng_stot			        " ,ds.dng_stot			            );
		rx.add(resForm, "mang_mortg_surp_amt	    " ,ds.mang_mortg_surp_amt	    );
		rx.add(resForm, "busn_mortg_surp_amt	    " ,ds.busn_mortg_surp_amt	    );
		rx.add(resForm, "unrcp_tot_amt       		" ,ds.unrcp_tot_amt            );
		rx.add(resForm, "un_repay_dhon_bal        	" ,ds.un_repay_dhon_bal        );
		rx.add(resForm, "mortg_amt                	" ,ds.mortg_amt                );
		rx.add(resForm, "un_pay_fee               	" ,ds.un_pay_fee               );
		rx.add(resForm, "precpt_amt               	" ,ds.precpt_amt               );
		rx.add(resForm, "acml_amt                 	" ,ds.acml_amt                 );
//		rx.add(resForm, "mang_expt_ufth_bond_amt  	" ,ds.mang_expt_ufth_bond_amt  );
//		rx.add(resForm, "busn_expt_ufth_bond_amt  	" ,ds.busn_expt_ufth_bond_amt  );
		rx.add(resForm, "evlu_frdt                	" ,ds.evlu_frdt                );
		rx.add(resForm, "evlu_todt                	" ,ds.evlu_todt                );
		rx.add(resForm, "avg_point                	" ,ds.avg_point                );
		rx.add(resForm, "sum_kiil                 	" ,ds.sum_kiil                 );
		rx.add(resForm, "start_dt                 	" ,ds.start_dt                 );
		rx.add(resForm, "mchrg_pers               	" ,ds.mchrg_pers               );
		rx.add(resForm, "slcrg_pers               	" ,ds.slcrg_pers               );
		rx.add(resForm, "mchrg_pers_nm            	" ,ds.mchrg_pers_nm            );
		rx.add(resForm, "slcrg_pers_nm            	" ,ds.slcrg_pers_nm            );
		rx.add(resForm, "mchrg_opn                	" ,ds.mchrg_opn                );
		rx.add(resForm, "slcrg_opn                	" ,ds.slcrg_opn                );
		rx.add(resForm, "chg_dt_tm			        " ,ds.chg_dt_tm			          );
		rx.add(resForm, "chg_pers			        " ,ds.chg_pers			            );

		String	pre_month_mm = ds.pre_month.substring(4,6);
		String	cur_month_mm = ds.basi_dt.substring(4,6);
		
		rx.add(resForm, "lbl_pre_month",			   pre_month_mm+"월");  
		rx.add(resForm, "lbl_cur_month",			   cur_month_mm+"월"); 

		rx.add(resForm, "lbl_pre2", ds.start_dt.substring(0,4) + "년 " + ds.start_dt.substring(4,6) + "월");
		rx.add(resForm, "lbl_cur2", ds.basi_dt.substring(0,4) + "년 " + ds.basi_dt.substring(4,6) + "월");   
		
		int nPreYear = StringUtil.toNumber(ds.start_dt.substring(0,4)) - 9;
		int nPreMon = StringUtil.toNumber(ds.start_dt.substring(4,6)) - 1;
		rx.add(resForm, "lbl_pre21", nPreYear  + "년 " + nPreMon + "월");
		
		rx.add(resForm, "lbl_pre",  ds.start_dt.substring(0,4) + ds.start_dt.substring(4,6)); 
		rx.add(resForm, "lbl_cur",  ds.basi_dt.substring(0,4)  + ds.basi_dt.substring(4,6));

		long recenote_tot_amt 		= 0;
		long busn_recenote_tot_amt 	= 0;
		long mang_recenote_tot_amt 	= 0;
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_1710_SCURLIST2Record rec = (AD_BAS_1710_SCURLIST2Record)ds.curlist2.get(i);
			recenote_tot_amt 			+= StringUtil.toLong(rec.note_amt);
			if("Y".equals(rec.mang_chce_yn)){
				mang_recenote_tot_amt	+= StringUtil.toLong(rec.note_amt);
			}	
			if("Y".equals(rec.busn_chce_yn)){
				busn_recenote_tot_amt	+= StringUtil.toLong(rec.note_amt);
			}			
		}	
		
		String busn_percent = "0";
		String mang_percent = "0";
		
		if(recenote_tot_amt > 0){
			busn_percent	= DigitUtil.cutUnderPoint((double)busn_recenote_tot_amt*100/(double)recenote_tot_amt, 0);
			mang_percent	= DigitUtil.cutUnderPoint((double)mang_recenote_tot_amt*100/(double)recenote_tot_amt, 0);
		}
		 
		rx.add(resForm, "recenote_tot_amt"          ,recenote_tot_amt);
		rx.add(resForm, "mang_recenote_tot_amt"     ,DigitUtil.nf_format(mang_recenote_tot_amt)+"("+mang_percent+"%)");	
		rx.add(resForm, "busn_recenote_tot_amt"     ,DigitUtil.nf_format(busn_recenote_tot_amt)+"("+busn_percent+"%)");
		
		int gridData   	= rx.add(resData, "gridData", "");		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_1710_SCURLIST2Record rec = (AD_BAS_1710_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "mang_chce_yn", rec.mang_chce_yn);
			rx.add(record, "busn_chce_yn", rec.busn_chce_yn);
			rx.add(record, "dhon_chce_yn", rec.dhon_chce_yn);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "mtry_dt"	 , rec.mtry_dt);
			rx.add(record, "note_amt"	 , rec.note_amt);
			rx.add(record, "now_note_stat_nm"	 , rec.now_note_stat_nm);
			rx.add(record, "note_no"	 , rec.note_no);
			rx.add(record, "seq"	 	 , rec.seq);
			rx.add(record, "note_seq"	 , rec.note_seq);
			rx.add(record, "bank_cd"	 , rec.bank_cd);
			rx.add(record, "note_clsf_nm", rec.note_clsf_nm);
		}				
		
		resForm   	= rx.add(resData, "resForm", "");
		if("N".equals(srch_clsf)){
			rx.add(resForm, "mang_expt_ufth_bond_amt  	" ,mang_recenote_tot_amt );
			rx.add(resForm, "busn_expt_ufth_bond_amt  	" ,busn_recenote_tot_amt );		
		}else{
			rx.add(resForm, "mang_expt_ufth_bond_amt  	" ,ds.mang_expt_ufth_bond_amt  );
			rx.add(resForm, "busn_expt_ufth_bond_amt  	" ,ds.busn_expt_ufth_bond_amt  );		
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
