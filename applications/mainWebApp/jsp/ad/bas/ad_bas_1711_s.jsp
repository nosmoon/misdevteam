<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
				,chosun.ciis.ad.bas.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>

<%

	String srch_clsf = Util.checkString(request.getParameter("srch_clsf"));
	
	RwXml rx = new RwXml();
	AD_BAS_1710_SDataSet ds = (AD_BAS_1710_SDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int tempData   	= rx.add(root, "tempData", "");

	try {

		rx.add(tempData, "dlco_clsf",               	ds.dlco_clsf);                   
		rx.add(tempData, "dlco_no",               		ds.dlco_no);                   
		rx.add(tempData, "basi_dt",               		ds.basi_dt);    
		
/* 월별미수금 조회 */		           
		if("01".equals(srch_clsf) || "N".equals(srch_clsf)){
			for(int i = 0; i < ds.curlist1.size(); i++) {
				AD_BAS_1710_SCURLIST1Record rec = (AD_BAS_1710_SCURLIST1Record)ds.curlist1.get(i);
				String month = rec.yymm.substring(4,6);			
				if(i == 0){
					rx.add(tempData, "lbl_pre_month",			   month+"월");  
					rx.add(tempData, "prvmm_unrcp_amt",			   rec.unrcp_amt);        
				}else if(i == 1){
					rx.add(tempData, "lbl_cur_month",			   month+"월"); 
					rx.add(tempData, "thmm_unrcp_amt",			   rec.unrcp_amt);  
				}
			}	
		}
/* 미수총액 조회 */	
		else if("02".equals(srch_clsf) || "N".equals(srch_clsf)){				
			rx.add(tempData, "unrcp_tot_amt",               	ds.unrcp_tot_amt); 
			rx.add(tempData, "lbl_pre2", ds.start_dt.substring(0,4) + "년 " + ds.start_dt.substring(4,6) + "월");    
			rx.add(tempData, "lbl_cur2", ds.basi_dt.substring(0,4) + "년 " + ds.basi_dt.substring(4,6) + "월");   			
		}
/* 미변제부도잔액  조회 */	
		else if("03".equals(srch_clsf)){		
			rx.add(tempData, "un_repay_dhon_bal",           	ds.un_repay_dhon_bal);
			//rx.add(tempData, "lbl_pre2", ds.start_dt.substring(0,4) + "년 " + ds.start_dt.substring(4,6) + "월");    
			int nPreYear = StringUtil.toNumber(ds.start_dt.substring(0,4)) - 9;
			int nPreMon = StringUtil.toNumber(ds.start_dt.substring(4,6)) - 1;
			rx.add(tempData, "lbl_pre21", nPreYear + "년 " + nPreMon + "월");    
			rx.add(tempData, "lbl_cur2", ds.basi_dt.substring(0,4) + "년 " + ds.basi_dt.substring(4,6) + "월");   
		}
/* 예상부실채권액  조회 */	
		else if("04".equals(srch_clsf) || "N".equals(srch_clsf)){	
		
			long recenote_tot_amt 		= 0;	
			long mang_expt_ufth_bond_amt 	= 0;
			long busn_expt_ufth_bond_amt 	= 0;
			
			for(int i = 0; i < ds.curlist2.size(); i++) {
				AD_BAS_1710_SCURLIST2Record rec = (AD_BAS_1710_SCURLIST2Record)ds.curlist2.get(i);
				if("Y".equals(rec.mang_chce_yn)){
					mang_expt_ufth_bond_amt	+= StringUtil.toLong(rec.note_amt);
				}	
				if("Y".equals(rec.busn_chce_yn)){
					busn_expt_ufth_bond_amt	+= StringUtil.toLong(rec.note_amt);
				}			
			}

			String busn_percent = "0";
			String mang_percent = "0";
			
			if(recenote_tot_amt > 0){
				busn_percent	= DigitUtil.cutUnderPoint((double)mang_expt_ufth_bond_amt*100/(double)recenote_tot_amt, 0);
				mang_percent	= DigitUtil.cutUnderPoint((double)mang_expt_ufth_bond_amt*100/(double)recenote_tot_amt, 0);
			}
					
			rx.add(tempData, "mang_expt_ufth_bond_amt",           	mang_expt_ufth_bond_amt);
			rx.add(tempData, "busn_expt_ufth_bond_amt",           	busn_expt_ufth_bond_amt);
			
			rx.add(tempData, "recenote_tot_amt"          ,recenote_tot_amt);
			rx.add(tempData, "mang_recenote_tot_amt"     ,DigitUtil.nf_format(mang_expt_ufth_bond_amt)+"("+mang_percent+"%)");	
			rx.add(tempData, "busn_recenote_tot_amt"     ,DigitUtil.nf_format(mang_expt_ufth_bond_amt)+"("+busn_percent+"%)");
			
			int gridData   	= rx.add(tempData, "gridData", "");		
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
					
					
		}
/* 담보액  조회 */	
		else if("05".equals(srch_clsf) || "N".equals(srch_clsf)){		
			rx.add(tempData, "mortg_amt",                   	ds.mortg_amt);  
		}
/* 미지급대행료  조회 */	
		else if("06".equals(srch_clsf) || "N".equals(srch_clsf)){		
			rx.add(tempData, "un_pay_fee",                  	ds.un_pay_fee);         
		}
/* 선수금  조회 */	
		else if("07".equals(srch_clsf) || "N".equals(srch_clsf)){		
			rx.add(tempData, "precpt_amt",                  	ds.precpt_amt); 
			rx.add(tempData, "acml_amt",                  		ds.acml_amt);            
		}
/* 평균기일과 평가기간  조회 */	
		else if("08".equals(srch_clsf) || "N".equals(srch_clsf)){		
			rx.add(tempData, "sum_kiil",                    	ds.sum_kiil);
			rx.add(tempData, "avg_point",                   	ds.avg_point+"%");
			rx.add(tempData, "evlu_frdt",                   	ds.evlu_frdt); 
			rx.add(tempData, "evlu_todt",                   	ds.evlu_todt);          
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
