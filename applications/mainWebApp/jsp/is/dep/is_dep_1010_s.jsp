<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	somo.framework.util.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>
  
<% 
	RwXml rx = new RwXml();
	IS_DEP_1010_SDataSet ds = (IS_DEP_1010_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	
	String rcpm_acct 	= "";
	String rcpm_acct_nm = ""; 
	String sale_aprv_no = "";
	
	long	amt_01	=	0;
	long	amt_02	=	0;
	long	amt_03	=	0;
	long	amt_04	=	0;
	long	amt_05	=	0;
	long	amt_06	=	0;
	long	amt_07	=	0;
	long	amt_08	=	0;
	long	amt_09	=	0;
	long	amt_10	=	0;
	long	amt_11	=	0;
	long	amt_13	=	0;
	
	try {  
//차변	
		long  rcpm_tot_amt = 0;
		long  advt_tot_amt = 0;
		
		ArrayList list_02 	= new ArrayList(); 	//계좌입금
		long  cash_amt 		= 0;				//현금
		long  fee_amt		= 0;				//대행료대체
		ArrayList list_03 	= new ArrayList(); 	//현금(그리드)
		ArrayList list_04 	= new ArrayList(); 	//선수금대체
		ArrayList list_06 	= new ArrayList(); 	//예수금대체
		ArrayList list_07 	= new ArrayList(); 	//기타입금대체
//대변
		ArrayList list_08 	= new ArrayList(); 	//선수금
		ArrayList list_09 	= new ArrayList(); 	//예수금
		ArrayList list_10 	= new ArrayList(); 	//기타입금				
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			IS_DEP_1010_SCURLIST2Record rec = (IS_DEP_1010_SCURLIST2Record)ds.curlist2.get(i);
			String drcr_clsf = StringUtil.nvl(rec.drcr_clsf);			
			long amt = StringUtil.toNumber(rec.amt);						
			if("1".equals(drcr_clsf)){
				if("02".equals(rec.rcpm_clsf)){				//계좌입금
					list_02.add(rec);
				}else if("03".equals(rec.rcpm_clsf)){		//현금
					list_03.add(rec);						//현금(그리드)
				}else if("04".equals(rec.rcpm_clsf)){		//선수금대체
					list_04.add(rec);
				}else if("05".equals(rec.rcpm_clsf)){		//대행료대체
					fee_amt		= amt;
					amt_05		= amt;
				}else if("06".equals(rec.rcpm_clsf)){		//예수금대체
					list_06.add(rec);
				}else if("07".equals(rec.rcpm_clsf)){		//기타입금대체
					list_07.add(rec);
				}
			}else if("9".equals(drcr_clsf)){
				if("08".equals(rec.rcpm_clsf)){				//선수금
					list_08.add(rec);
				}else if("09".equals(rec.rcpm_clsf)){		//예수금
					list_09.add(rec);
				}else if("10".equals(rec.rcpm_clsf)){		//기타입금
					list_10.add(rec);      			
				}
			}			
		}
		
//차변:어음내역			
		int gridData1 = rx.add( resData , "gridData1" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			IS_DEP_1010_SCURLIST1Record rec = (IS_DEP_1010_SCURLIST1Record)ds.curlist1.get(i);
			int record  	= rx.add( gridData1 , "record" , "");
			rcpm_acct	 	= rec.rcpm_acct;
			rcpm_acct_nm 	= rec.rcpm_acct_nm;
			sale_aprv_no 	= rec.sale_aprv_no;
			long note_amt 	= StringUtil.toLong(rec.note_amt);
			
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "bank_nm", rec.bank_nm);  
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_amt", note_amt);
			rx.add(record, "sale_dscn_amt", rec.sale_dscn_amt);
			rx.add(record, "issu_cmpy_clsf_cd", rec.issu_cmpy_clsf_cd);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);	
			
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);
			rx.add(record, "elec_note_key", rec.elec_note_key);	
			
			rcpm_tot_amt += note_amt;
			advt_tot_amt += note_amt;
			
			amt_01		 +=	note_amt;
			
		}	

		for(int i=0; i<1-ds.curlist1.size(); i++){  
			int record  = rx.add( gridData1 , "record" , "");
			rx.add(record, "note_no", "");
			rx.add(record, "bank_cd", "");
			rx.add(record, "bank_nm", "");
			rx.add(record, "note_clsf_cd", "");
			rx.add(record, "comp_dt", "");
			rx.add(record, "mtry_dt", "");
			rx.add(record, "note_amt", "");
			rx.add(record, "sale_dscn_amt", "");
			rx.add(record, "issu_cmpy_clsf_cd", "");
			rx.add(record, "issu_pers_nm", "");	
			
			rx.add(record, "occr_dt", "");
			rx.add(record, "slip_clsf", "");
			rx.add(record, "seq", "");			
			rx.add(record, "subseq", "");	
			rx.add(record, "elec_note_key", "");	
		}	

//차변:계좌입금	
		int gridData2 = rx.add( resData , "gridData2" , "");
		for(int i = 0; i < list_02.size(); i++) {
			IS_DEP_1010_SCURLIST2Record rec = (IS_DEP_1010_SCURLIST2Record)list_02.get(i);

			int	amt			=	StringUtil.toNumber(rec.amt);
			int	rmtt_coms	=	StringUtil.toNumber(rec.rmtt_coms);
			
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "acct_mang_no", rec.acct_mang_no); 
			rx.add(record, "acct_mang_nm", rec.acct_mang_nm); 
			rx.add(record, "rmtt_dt", rec.rmtt_dt);
			rx.add(record, "amt", amt);
			rx.add(record, "rmtt_coms", rec.rmtt_coms);			
			rx.add(record, "acct_tonghwa", rec.curc_clsf);
			rx.add(record, "frex_amt", rec.frex_amt);
			rx.add(record, "rmtt_plac", rec.rmtt_plac);  
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);
		  	rx.add(record, "biz_reg_no", rec.biz_reg_no);
		  	rx.add(record, "bank_id", rec.bank_id);
		  	rx.add(record, "acct_num", rec.acct_num);
		  	rx.add(record, "tran_date_seq", rec.tran_date_seq);
			rx.add(record, "current_clsf", rec.current_clsf);
			rx.add(record, "card_rcpm_yn", rec.card_rcpm_yn);
			rx.add(record, "card_mang_no", rec.card_mang_no);
			
			/**추가항목 시작 20120727**/
			rx.add(record, "cash_rcpt_use_yn", rec.cash_rcpt_use_yn);
			rx.add(record, "cash_rcpt_acq_yn", rec.cash_rcpt_acq_yn);
			rx.add(record, "deal_cd", rec.deal_cd);
			rx.add(record, "tmnl_no", rec.tmnl_no);
			rx.add(record, "aprv_no", rec.aprv_no);
			rx.add(record, "card_aprv_dd", rec.card_aprv_dd);
			rx.add(record, "decid_no", rec.decid_no);
			/**추가항목 종료 20120727**/
			
			
			rcpm_tot_amt 	+= amt;
			rcpm_tot_amt 	+= rmtt_coms;
			advt_tot_amt 	+= amt;
			advt_tot_amt 	+= rmtt_coms;
			amt_02			+= amt;
			amt_11			+= rmtt_coms;
		}

		for(int i = 0; i <1-list_02.size(); i++) {
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "acct_mang_no", "");   
			rx.add(record, "acct_mang_nm", "");   
			rx.add(record, "rmtt_dt", "");
			rx.add(record, "amt", "");
			rx.add(record, "rmtt_coms", "");	
			rx.add(record, "acct_tonghwa", "");
			rx.add(record, "frex_amt", "");
			rx.add(record, "rmtt_plac", "");
			rx.add(record, "occr_dt", "");
			rx.add(record, "slip_clsf", "");
			rx.add(record, "seq", "");			
			rx.add(record, "subseq", "");	
		  	rx.add(record, "biz_reg_no", "");
		  	rx.add(record, "bank_id", "");
		  	rx.add(record, "acct_num", "");
		  	rx.add(record, "tran_date_seq", "");	
			rx.add(record, "current_clsf", "");
			rx.add(record, "card_mang_no", "");
		}
//차변:현금
		int gridData9 = rx.add( resData , "gridData9" , "");
		for(int i = 0; i < list_03.size(); i++) {
			IS_DEP_1010_SCURLIST2Record rec = (IS_DEP_1010_SCURLIST2Record)list_03.get(i);

			int	amt			=	StringUtil.toNumber(rec.amt);
			int	rmtt_coms	=	StringUtil.toNumber(rec.rmtt_coms);
			
			int record = rx.add(gridData9, "record", "");
			rx.add(record, "amt", rec.amt);
			rx.add(record, "cash_rcpt_use_yn", rec.cash_rcpt_use_yn);
			rx.add(record, "cash_rcpt_acq_yn", rec.cash_rcpt_acq_yn);
			rx.add(record, "deal_cd", rec.deal_cd);
			rx.add(record, "tmnl_no", rec.tmnl_no);
			rx.add(record, "aprv_no", rec.aprv_no);
			rx.add(record, "card_aprv_dd", rec.card_aprv_dd);
			rx.add(record, "decid_no", rec.decid_no);
			rx.add(record, "occr_dt", "");
			rx.add(record, "slip_clsf", "");
			rx.add(record, "seq", "");			
			rx.add(record, "subseq", "");	
		  	rx.add(record, "biz_reg_no", "");
		  	rx.add(record, "bank_id", "");
		  	rx.add(record, "acct_num", "");
		  	rx.add(record, "tran_date_seq", "");	
			rx.add(record, "current_clsf", "");
			
			cash_amt 	+= 	amt;
			amt_03		+=	amt;
		}


//차변:선수금대체		
		int gridData3 = rx.add( resData , "gridData3" , "");
		for(int i = 0; i < list_04.size(); i++) {
			IS_DEP_1010_SCURLIST2Record rec = (IS_DEP_1010_SCURLIST2Record)list_04.get(i);

			long	amt			=	StringUtil.toNumber(rec.amt);
			long	occr_amt	=	StringUtil.toNumber(rec.occr_amt);
			
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "checked", "Y");  
			rx.add(record, "medi_cd", rec.medi_cd);  
			rx.add(record, "medi_nm", rec.medi_nm);  
			rx.add(record, "amt", amt);
			rx.add(record, "occr_amt", occr_amt + amt);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);	
			
			rcpm_tot_amt 	+= 	amt;	
			advt_tot_amt 	+= 	amt;			
			amt_04			+=	amt;
		}	
//차변:예수금대체		
		int gridData4 = rx.add( resData , "gridData4" , "");
		for(int i = 0; i < list_06.size(); i++) {
			IS_DEP_1010_SCURLIST2Record rec = (IS_DEP_1010_SCURLIST2Record)list_06.get(i);

			long	amt	=	StringUtil.toNumber(rec.amt);
			
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "checked", "Y"); 
			rx.add(record, "swit_dlco", rec.dlco_no);
			rx.add(record, "swit_dlco_nm", rec.dlco_nm);
			rx.add(record, "amt", amt);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);		
			rx.add(record, "budg_cd", rec.budg_cd);
			rcpm_tot_amt 	+= 	amt;	
			advt_tot_amt 	+= 	amt;			
			amt_06			+=	amt;
		}	
//차변:기타입금대체		
		int gridData5 = rx.add( resData , "gridData5" , "");
		for(int i = 0; i < list_07.size(); i++) {
			IS_DEP_1010_SCURLIST2Record rec = (IS_DEP_1010_SCURLIST2Record)list_07.get(i);

			long	amt	=	StringUtil.toNumber(rec.amt);
			
			int record = rx.add(gridData5, "record", "");
			rx.add(record, "checked", "Y");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "amt", amt);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);	  
			rcpm_tot_amt 	+= 	amt;	
			advt_tot_amt 	+= 	amt;		
			amt_07			+=	amt;
		}	
		
//대변:선수금
		int gridData6 = rx.add( resData , "gridData6" , "");
		for(int i = 0; i < list_08.size(); i++) {
			IS_DEP_1010_SCURLIST2Record rec = (IS_DEP_1010_SCURLIST2Record)list_08.get(i);
			long	amt	=	StringUtil.toNumber(rec.amt);
			int record = rx.add(gridData6, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);
			
			advt_tot_amt	-= 	amt;
			amt_08		 	+=	amt;			
		}	
		
		for(int i = 0; i < 1-list_08.size(); i++) {
			int record = rx.add(gridData6, "record", "");
//			rx.add(record, "medi_cd", "");
			rx.add(record, "medi_cd", StringUtil.nvl(ds.medi_cd, "100"));
			rx.add(record, "amt", "");
			rx.add(record, "occr_dt", "");
			rx.add(record, "slip_clsf", "");
			rx.add(record, "seq", "");			
			rx.add(record, "subseq", "");		
		}	

//대변:예수금
		int gridData7 = rx.add( resData , "gridData7" , "");
		for(int i = 0; i < list_09.size(); i++) {
			IS_DEP_1010_SCURLIST2Record rec = (IS_DEP_1010_SCURLIST2Record)list_09.get(i);
			long	amt	=	StringUtil.toNumber(rec.amt);

			int record = rx.add(gridData7, "record", "");
			rx.add(record, "depo_job_clsf", rec.depo_job_clsf);
			rx.add(record, "amt", amt);
			rx.add(record, "swit_dlco_nm", rec.dlco_nm);
			rx.add(record, "swit_dlco", rec.dlco_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);	
			advt_tot_amt 	-= 	amt;
			amt_09			+=	amt;
		}	
		
		for(int i = 0; i < 1-list_09.size(); i++) {
			int record = rx.add(gridData7, "record", "");
			rx.add(record, "depo_job_clsf", "");
			rx.add(record, "amt", "");
			rx.add(record, "swit_dlco_nm", "");
			rx.add(record, "swit_dlco", "");
			rx.add(record, "occr_dt", "");
			rx.add(record, "slip_clsf", "");
			rx.add(record, "seq", "");			 
			rx.add(record, "subseq", "");		
		}		

//대변:기타입금
		int gridData8 = rx.add( resData , "gridData8" , "");
		for(int i = 0; i < list_10.size(); i++) {
			IS_DEP_1010_SCURLIST2Record rec = (IS_DEP_1010_SCURLIST2Record)list_10.get(i);
			long	amt	=	StringUtil.toNumber(rec.amt);

			int record = rx.add(gridData8, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "amt", amt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);	
			advt_tot_amt 	-= 	amt;
			amt_10			+=	amt;
		}	 

		for(int i = 0; i < 1-list_10.size(); i++) {
			int record = rx.add(gridData8, "record", "");
			rx.add(record, "budg_cd", "");
			rx.add(record, "amt", "");
			rx.add(record, "occr_dt", "");
			rx.add(record, "slip_clsf", "");
			rx.add(record, "seq", "");			
			rx.add(record, "subseq", "");	
		}	

		int resForm = rx.add( resData , "resForm" , "");		
		rx.add(resForm, "occr_dt", ds.occr_dt);
		rx.add(resForm, "slip_clsf", ds.slip_clsf);
		rx.add(resForm, "seq", ds.seq);
		
		rx.add(resForm, "rcpm_shet_no", ds.rcpm_shet_no);
		rx.add(resForm, "self_cmpy_yn", StringUtil.nvl(ds.self_cmpy_yn, "N"));
		rx.add(resForm, "rcpm_acct", rcpm_acct);
		rx.add(resForm, "rcpm_acct_nm", rcpm_acct_nm);
		rx.add(resForm, "rcpm_plac_clsf", StringUtil.nvl(ds.rcpm_plac_clsf, "1"));
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "medi_cd", StringUtil.nvl(ds.medi_cd, "100"));
		rx.add(resForm, "sale_aprv_no", sale_aprv_no);
		rx.add(resForm, "dept_cd", StringUtil.nvl(ds.dept_cd, "540130"));
		//rx.add(resForm, "dept_nm", StringUtil.nvl(ds.dept_nm, "광고관리파트"));
		rx.add(resForm, "mchrg_pers", "".equals(ds.mchrg_pers) ? Util.getSessionParameterValue(request, "emp_no", true) : ds.mchrg_pers); 
		rx.add(resForm, "mchrg_pers_nm", "".equals(ds.mchrg_pers_nm) ? Util.getSessionParameterValue(request, "emp_nm", true) : ds.mchrg_pers_nm);  
		rx.add(resForm, "clos_yn", ds.clos_yn);  
		rx.add(resForm, "seq_clsf", ds.seq_clsf);  
		rx.add(resForm, "pre_seq", ds.pre_seq);  
		rx.add(resForm, "next_seq", ds.next_seq);  
 
//차변:현금		
		rx.add(resForm, "cash_amt", cash_amt);
		rcpm_tot_amt += cash_amt;
		advt_tot_amt += cash_amt;
//차변:대행료대체
		rx.add(resForm, "fee_amt", fee_amt);
		rcpm_tot_amt += fee_amt;
		advt_tot_amt += fee_amt;
		
		rx.add(resForm, "advt_tot_amt", advt_tot_amt);
		rx.add(resForm, "rcpm_tot_amt", rcpm_tot_amt);
		rx.add(resForm, "amt_01", amt_01);
		rx.add(resForm, "amt_02", amt_02);
		rx.add(resForm, "amt_03", amt_03);
		rx.add(resForm, "amt_04", amt_04);
		rx.add(resForm, "amt_05", amt_05);
		rx.add(resForm, "amt_06", amt_06);
		rx.add(resForm, "amt_07", amt_07);
		rx.add(resForm, "amt_08", amt_08);
		rx.add(resForm, "amt_09", amt_09);
		rx.add(resForm, "amt_10", amt_10);
		rx.add(resForm, "amt_11", amt_11);
		rx.add(resForm, "amt_13", amt_13);
		
		rx.add(resForm, "multiUpdateData1", "");
		rx.add(resForm, "multiUpdateData2", "");
		rx.add(resForm, "multiUpdateData3", "");
		rx.add(resForm, "multiUpdateData4", "");
		rx.add(resForm, "multiUpdateData5", "");
		rx.add(resForm, "multiUpdateData6", "");
		rx.add(resForm, "multiUpdateData7", "");
		rx.add(resForm, "multiUpdateData8", "");
		rx.add(resForm, "multiUpdateData9", "");
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>