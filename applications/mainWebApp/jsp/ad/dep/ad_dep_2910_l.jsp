<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_2910_LDataSet ds = (AD_DEP_2910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {  
		
		//**매체별**
		long tot_pubc_amt = 0;		//개재액합계(매체:신문)
		long tot_rcpm_amt = 0;		//입금액합계(매체:신문)
		long tot_misu_amt = 0;		//미수액합계(매체:신문)
		double avt_amt    = 0.0d;   //입금율합계(매체:신문)
		
		//게재금액
		//입금액
		for(int i = 0; i < ds.curlist.size()-1; i++) {
			AD_DEP_2910_LCURLISTRecord pubc_rec = (AD_DEP_2910_LCURLISTRecord)ds.curlist.get(0);
			int record = rx.add(gridData, "record", "");
			
			tot_pubc_amt = StringUtil.toLong(pubc_rec.medi_110) 
			             + StringUtil.toLong(pubc_rec.medi_130)
			             + StringUtil.toLong(pubc_rec.medi_190);
			
			rx.add(record, "gubun", "게  재  액");
			rx.add(record, "medi_110", pubc_rec.medi_110);
			rx.add(record, "medi_130", pubc_rec.medi_130);
			rx.add(record, "medi_190", pubc_rec.medi_190);
			rx.add(record, "tot_amt", tot_pubc_amt);	
			
		     
			AD_DEP_2910_LCURLISTRecord rcpm_rec = (AD_DEP_2910_LCURLISTRecord)ds.curlist.get(1);
			record = rx.add(gridData, "record", "");
			
			tot_rcpm_amt = StringUtil.toLong(rcpm_rec.medi_110) 
			             + StringUtil.toLong(rcpm_rec.medi_130)
			             + StringUtil.toLong(rcpm_rec.medi_190);
			
			rx.add(record, "gubun", "입  금  액");
			rx.add(record, "medi_110", rcpm_rec.medi_110);
			rx.add(record, "medi_130", rcpm_rec.medi_130);
			rx.add(record, "medi_190", rcpm_rec.medi_190);
			rx.add(record, "tot_amt", tot_rcpm_amt);		
		}
		
		//미수액	(매체:신문)	게재액-입금액 
		//입금율  (매체:신문)	(입금액/거재액)*100
		for(int i = 0; i < ds.curlist.size()-1; i++) {
		    AD_DEP_2910_LCURLISTRecord pubc_rec = (AD_DEP_2910_LCURLISTRecord)ds.curlist.get(0);
			AD_DEP_2910_LCURLISTRecord rcpm_rec = (AD_DEP_2910_LCURLISTRecord)ds.curlist.get(1);
			int record = rx.add(gridData, "record", "");
			
			tot_misu_amt = (StringUtil.toLong(pubc_rec.medi_110) - StringUtil.toLong(rcpm_rec.medi_110))
			             + (StringUtil.toLong(pubc_rec.medi_130) - StringUtil.toLong(rcpm_rec.medi_130))
			             + (StringUtil.toLong(pubc_rec.medi_190) - StringUtil.toLong(rcpm_rec.medi_190));
			
			rx.add(record, "gubun", "미  수  액");
			rx.add(record, "medi_110", StringUtil.toLong(pubc_rec.medi_110) - StringUtil.toLong(rcpm_rec.medi_110));
			rx.add(record, "medi_130", StringUtil.toLong(pubc_rec.medi_130) - StringUtil.toLong(rcpm_rec.medi_130));
			rx.add(record, "medi_190", StringUtil.toLong(pubc_rec.medi_190) - StringUtil.toLong(rcpm_rec.medi_190));
			rx.add(record, "tot_amt", tot_misu_amt);	
			
			record = rx.add(gridData, "record", "");
			
			double avg_medi_110 = 0.0d;
			double avg_medi_130 = 0.0d;
			double avg_medi_190 = 0.0d;
			
			if(!"0".equals(pubc_rec.medi_110)){
				avg_medi_110 = (StringUtil.toDouble(rcpm_rec.medi_110) / StringUtil.toDouble(pubc_rec.medi_110)) * 100;
			}
			if(!"0".equals(pubc_rec.medi_130)){
				avg_medi_130 = (StringUtil.toDouble(rcpm_rec.medi_130) / StringUtil.toDouble(pubc_rec.medi_130)) * 100;
			}
			if(!"0".equals(pubc_rec.medi_190)){
				avg_medi_190 = (StringUtil.toDouble(rcpm_rec.medi_190) / StringUtil.toDouble(pubc_rec.medi_190)) * 100;
			}
			if(0 != tot_pubc_amt){
				avt_amt = ((double)tot_rcpm_amt / (double)tot_pubc_amt)*100;
			}
			
			rx.add(record, "gubun", "입 금 율(%)");
			rx.add(record, "medi_110", 0.00 == avg_medi_110 ? "0.00" : DigitUtil.cutUnderPoint(avg_medi_110,2));
			rx.add(record, "medi_130", 0.00 == avg_medi_130 ? "0.00" : DigitUtil.cutUnderPoint(avg_medi_130,2));
			rx.add(record, "medi_190", 0.00 == avg_medi_190 ? "0.00" : DigitUtil.cutUnderPoint(avg_medi_190,2));
			rx.add(record, "tot_amt", 0.00 == avt_amt ? "0.00" : DigitUtil.cutUnderPoint(avt_amt,2));	
		}
		
		
		//발행일수 , 발행면수
		for(int i = 0; i < ds.curlist2.size()-2; i++) {
		    AD_DEP_2910_LCURLIST2Record issu_dt_rec_110 = (AD_DEP_2910_LCURLIST2Record)ds.curlist2.get(0);
		    AD_DEP_2910_LCURLIST2Record issu_dt_rec_130 = (AD_DEP_2910_LCURLIST2Record)ds.curlist2.get(1);
		    AD_DEP_2910_LCURLIST2Record issu_dt_rec_190 = (AD_DEP_2910_LCURLIST2Record)ds.curlist2.get(2);
			int record = rx.add(gridData, "record", "");
			
			int tot_issu_dt =  StringUtil.toNumber(issu_dt_rec_110.issu_dt)
			                  +StringUtil.toNumber(issu_dt_rec_130.issu_dt)
			                  +StringUtil.toNumber(issu_dt_rec_190.issu_dt);
			
			rx.add(record, "gubun", "발 행 일 수");
			rx.add(record, "medi_110", issu_dt_rec_110.issu_dt);
			rx.add(record, "medi_130", issu_dt_rec_130.issu_dt);
			rx.add(record, "medi_190", issu_dt_rec_190.issu_dt);
			rx.add(record, "tot_amt", tot_issu_dt);
			
			AD_DEP_2910_LCURLIST2Record issu_side_rec_110 = (AD_DEP_2910_LCURLIST2Record)ds.curlist2.get(0);
		    AD_DEP_2910_LCURLIST2Record issu_side_rec_130 = (AD_DEP_2910_LCURLIST2Record)ds.curlist2.get(1);
		    AD_DEP_2910_LCURLIST2Record issu_side_rec_190 = (AD_DEP_2910_LCURLIST2Record)ds.curlist2.get(2);
			record = rx.add(gridData, "record", "");
			
			int tot_issu_side =  StringUtil.toNumber(issu_side_rec_110.issu_side)
			                    +StringUtil.toNumber(issu_side_rec_130.issu_side)
			                    +StringUtil.toNumber(issu_side_rec_190.issu_side);
			
			rx.add(record, "gubun", "발 행 면 수");
			rx.add(record, "medi_110", issu_side_rec_110.issu_side);
			rx.add(record, "medi_130", issu_side_rec_130.issu_side);
			rx.add(record, "medi_190", issu_side_rec_190.issu_side);
			rx.add(record, "tot_amt", tot_issu_side);
		}
		
		long tot_pubc_amt2 = 0;		//개재액합계(매체:출판)
		long tot_rcpm_amt2 = 0;		//입금액합계(매체:출판)
		long tot_misu_amt2 = 0; 	//미수액합계(매체:출판)
		double avt_amt2    = 0.0d;  //입금율합계(매체:출판)
		
		//게재액 (매체:출판), 입금액 (매체:출판)
		for(int i = 0; i < ds.curlist.size()-1; i++) {
			AD_DEP_2910_LCURLISTRecord pubc_rec = (AD_DEP_2910_LCURLISTRecord)ds.curlist.get(0);
			int record2 = rx.add(gridData, "record2", "");
			
			tot_pubc_amt2 = StringUtil.toLong(pubc_rec.medi_210) 
			              + StringUtil.toLong(pubc_rec.medi_230);
			
			rx.add(record2, "gubun", "게  재  액 ");
			rx.add(record2, "medi_210", pubc_rec.medi_210);
			rx.add(record2, "medi_230", pubc_rec.medi_230);
			rx.add(record2, "tot_amt", tot_pubc_amt2);
			
			AD_DEP_2910_LCURLISTRecord rcpm_rec = (AD_DEP_2910_LCURLISTRecord)ds.curlist.get(1);
			record2 = rx.add(gridData, "record2", "");
			
			tot_rcpm_amt2 = StringUtil.toLong(rcpm_rec.medi_210) 
			              + StringUtil.toLong(rcpm_rec.medi_230);
			
			rx.add(record2, "gubun", "입  금  액");
			rx.add(record2, "medi_210", rcpm_rec.medi_210);
			rx.add(record2, "medi_230", rcpm_rec.medi_230);
			rx.add(record2, "tot_amt", tot_rcpm_amt2);
			
		}
		
		//미수액	(매체:신문)	게재액-입금액 
		//입금율  (매체:신문)	(입금액 / 게재액)*100
		for(int i = 0; i < ds.curlist.size()-1; i++) {
		    AD_DEP_2910_LCURLISTRecord pubc_rec = (AD_DEP_2910_LCURLISTRecord)ds.curlist.get(0);
			AD_DEP_2910_LCURLISTRecord rcpm_rec = (AD_DEP_2910_LCURLISTRecord)ds.curlist.get(1);
			int record2 = rx.add(gridData, "record2", "");
			
			tot_misu_amt2 = (StringUtil.toLong(pubc_rec.medi_210) - StringUtil.toLong(rcpm_rec.medi_210))
			              + (StringUtil.toLong(pubc_rec.medi_230) - StringUtil.toLong(rcpm_rec.medi_230));
			
			rx.add(record2, "gubun", "미  수  액");
			rx.add(record2, "medi_210", StringUtil.toLong(pubc_rec.medi_210) - StringUtil.toLong(rcpm_rec.medi_210));
			rx.add(record2, "medi_230", StringUtil.toLong(pubc_rec.medi_230) - StringUtil.toLong(rcpm_rec.medi_230));
			rx.add(record2, "tot_amt", tot_misu_amt2);		
			
			record2 = rx.add(gridData, "record2", "");
			
			double avg_medi_210 = 0.0d;
			double avg_medi_230 = 0.0d;
			
			if(!"0".equals(pubc_rec.medi_210)){
				avg_medi_210 = (StringUtil.toDouble(rcpm_rec.medi_210) / StringUtil.toDouble(pubc_rec.medi_210)) * 100;
			}
			if(!"0".equals(pubc_rec.medi_230)){
				avg_medi_230 = (StringUtil.toDouble(rcpm_rec.medi_230) / StringUtil.toDouble(pubc_rec.medi_230)) * 100;
			}
			if(0 != tot_pubc_amt2){
				avt_amt2 = ((double)tot_rcpm_amt2 / (double)tot_pubc_amt2)*100;
			}
			
			rx.add(record2, "gubun", "입 금 율(%)");
			rx.add(record2, "medi_210", 0.0 == avg_medi_210 ? "0.00" : DigitUtil.cutUnderPoint(avg_medi_210,2));
			rx.add(record2, "medi_230", 0.0 == avg_medi_230 ? "0.00" : DigitUtil.cutUnderPoint(avg_medi_230,2));
			rx.add(record2, "tot_amt",  0.0 == avt_amt2 ? "0.00" : DigitUtil.cutUnderPoint(avt_amt2,2));	
		}	
		
		
		//**취급처별** 	
		long tot_pubc_hndl = 0; //게재금액합계 
		long tot_rcpm_hndl = 0; //입금액합계 
			
		int gridData2 = rx.add(resData, "gridData2", "");
		 
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_DEP_2910_LCURLIST3Record hndl_rec = (AD_DEP_2910_LCURLIST3Record)ds.curlist3.get(i);  
			int record = rx.add(gridData2, "record", "");
			
			//게재금액합계
			tot_pubc_hndl = StringUtil.toLong(hndl_rec.pubc_amt01)
			               +StringUtil.toLong(hndl_rec.pubc_amt02)
			               +StringUtil.toLong(hndl_rec.pubc_amt03)
			               +StringUtil.toLong(hndl_rec.pubc_amt04)
			               +StringUtil.toLong(hndl_rec.pubc_amt05)
			               +StringUtil.toLong(hndl_rec.pubc_amt07);
			               
			//게재금액          
			rx.add(record, "gubun", "게 재 금 액");
			rx.add(record, "hndl_clsf01", hndl_rec.pubc_amt01);
			rx.add(record, "hndl_clsf02", hndl_rec.pubc_amt02);
			rx.add(record, "hndl_clsf03", hndl_rec.pubc_amt03);
			rx.add(record, "hndl_clsf04", hndl_rec.pubc_amt04);
			rx.add(record, "hndl_clsf05", hndl_rec.pubc_amt05);
			rx.add(record, "hndl_clsf07", hndl_rec.pubc_amt07);
			rx.add(record, "hndl_clsf09", hndl_rec.pubc_amt09);	//자체광고
			rx.add(record, "tot_amt", tot_pubc_hndl);
			
			double pubc_amt01 = 0.0d;
			double pubc_amt02 = 0.0d;
			double pubc_amt03 = 0.0d;
			double pubc_amt04 = 0.0d;
			double pubc_amt05 = 0.0d;
			double pubc_amt07 = 0.0d;
			double tot_amt    = 0.0d;
			
			if(0 != tot_pubc_hndl){
				pubc_amt01 = (StringUtil.toDouble(hndl_rec.pubc_amt01) / (double)tot_pubc_hndl) * 100;
				pubc_amt02 = (StringUtil.toDouble(hndl_rec.pubc_amt02) / (double)tot_pubc_hndl) * 100;
				pubc_amt03 = (StringUtil.toDouble(hndl_rec.pubc_amt03) / (double)tot_pubc_hndl) * 100;
				pubc_amt04 = (StringUtil.toDouble(hndl_rec.pubc_amt04) / (double)tot_pubc_hndl) * 100;
				pubc_amt05 = (StringUtil.toDouble(hndl_rec.pubc_amt05) / (double)tot_pubc_hndl) * 100;
				pubc_amt07 = (StringUtil.toDouble(hndl_rec.pubc_amt07) / (double)tot_pubc_hndl) * 100;
				tot_amt    = (double)tot_pubc_hndl / (double)tot_pubc_hndl * 100;
			}
			
			//게재구성비 
			record = rx.add(gridData2, "record", "");
			rx.add(record, "gubun", "게재구성비(%)");
			rx.add(record, "hndl_clsf01", 0.0 == pubc_amt01 ? "0.00": DigitUtil.cutUnderPoint(pubc_amt01,2));
			rx.add(record, "hndl_clsf02", 0.0 == pubc_amt02 ? "0.00": DigitUtil.cutUnderPoint(pubc_amt02,2));
			rx.add(record, "hndl_clsf03", 0.0 == pubc_amt03 ? "0.00": DigitUtil.cutUnderPoint(pubc_amt03,2));
			rx.add(record, "hndl_clsf04", 0.0 == pubc_amt04 ? "0.00": DigitUtil.cutUnderPoint(pubc_amt04,2));
			rx.add(record, "hndl_clsf05", 0.0 == pubc_amt05 ? "0.00": DigitUtil.cutUnderPoint(pubc_amt05,2));
			rx.add(record, "hndl_clsf07", 0.0 == pubc_amt07 ? "0.00": DigitUtil.cutUnderPoint(pubc_amt07,2));
			rx.add(record, "tot_amt", 0.0 == tot_amt ? "0.00": DigitUtil.cutUnderPoint(tot_amt,2));
			
			
			//입금액합계
			tot_rcpm_hndl = StringUtil.toLong(hndl_rec.rcpm_amt01)
			               +StringUtil.toLong(hndl_rec.rcpm_amt02)
			               +StringUtil.toLong(hndl_rec.rcpm_amt03)
			               +StringUtil.toLong(hndl_rec.rcpm_amt04)
			               +StringUtil.toLong(hndl_rec.rcpm_amt05)
			               +StringUtil.toLong(hndl_rec.rcpm_amt07);	 
			               
			//입금액
			record = rx.add(gridData2, "record", "");
			rx.add(record, "gubun", "입  금  액");
			rx.add(record, "hndl_clsf01", hndl_rec.rcpm_amt01);
			rx.add(record, "hndl_clsf02", hndl_rec.rcpm_amt02);
			rx.add(record, "hndl_clsf03", hndl_rec.rcpm_amt03);
			rx.add(record, "hndl_clsf04", hndl_rec.rcpm_amt04);
			rx.add(record, "hndl_clsf05", hndl_rec.rcpm_amt05);
			rx.add(record, "hndl_clsf07", hndl_rec.rcpm_amt07);
			
			//해외지사 입금액이 있을경우 (해외지사는 yyyy년도 mm월번 입금임.
			if(!"0".equals(hndl_rec.rcpm_amt07)){
				rx.add(record, "rcpm_clsf_07", hndl_rec.rcpm_amt07);
			}
			
			
			rx.add(record, "tot_amt", tot_rcpm_hndl);
			
			double rcpm_amt01 = 0.0d;
			double rcpm_amt02 = 0.0d;
			double rcpm_amt03 = 0.0d;
			double rcpm_amt04 = 0.0d;
			double rcpm_amt05 = 0.0d;
			double rcpm_amt07 = 0.0d;
			double tot_amt2   = 0.0d;
			
			if(0 != StringUtil.toDouble(hndl_rec.pubc_amt01)){
				rcpm_amt01 = (StringUtil.toDouble(hndl_rec.rcpm_amt01) / StringUtil.toDouble(hndl_rec.pubc_amt01)) * 100;
    		}	
			if(0 != StringUtil.toDouble(hndl_rec.pubc_amt02)){
				rcpm_amt02 = (StringUtil.toDouble(hndl_rec.rcpm_amt02) / StringUtil.toDouble(hndl_rec.pubc_amt02)) * 100;
			}
			if(0 != StringUtil.toDouble(hndl_rec.pubc_amt03)){
				rcpm_amt03 = (StringUtil.toDouble(hndl_rec.rcpm_amt03) / StringUtil.toDouble(hndl_rec.pubc_amt03)) * 100;
			}
			if(0 != StringUtil.toDouble(hndl_rec.pubc_amt04)){
				rcpm_amt04 = (StringUtil.toDouble(hndl_rec.rcpm_amt04) / StringUtil.toDouble(hndl_rec.pubc_amt04)) * 100;
			}
			if(0 != StringUtil.toDouble(hndl_rec.pubc_amt05)){
				rcpm_amt05 = (StringUtil.toDouble(hndl_rec.rcpm_amt05) / StringUtil.toDouble(hndl_rec.pubc_amt05)) * 100;
			}
			if(0 != StringUtil.toDouble(hndl_rec.pubc_amt07)){
				rcpm_amt07 = (StringUtil.toDouble(hndl_rec.rcpm_amt07) / StringUtil.toDouble(hndl_rec.pubc_amt07)) * 100;
			}
			if(0 != tot_pubc_hndl){
				tot_amt2   = ((double)tot_rcpm_hndl / (double)tot_pubc_hndl) * 100;
			}
			
			//입금율 
			record = rx.add(gridData2, "record", "");
			rx.add(record, "gubun", "입  금  율(%))");
			rx.add(record, "hndl_clsf01", 0.0 == rcpm_amt01 ? "0.00": DigitUtil.cutUnderPoint(rcpm_amt01,2));
			rx.add(record, "hndl_clsf02", 0.0 == rcpm_amt02 ? "0.00": DigitUtil.cutUnderPoint(rcpm_amt02,2));
			rx.add(record, "hndl_clsf03", 0.0 == rcpm_amt03 ? "0.00": DigitUtil.cutUnderPoint(rcpm_amt03,2));
			rx.add(record, "hndl_clsf04", 0.0 == rcpm_amt04 ? "0.00": DigitUtil.cutUnderPoint(rcpm_amt04,2));
			rx.add(record, "hndl_clsf05", 0.0 == rcpm_amt05 ? "0.00": DigitUtil.cutUnderPoint(rcpm_amt05,2));
			rx.add(record, "hndl_clsf07", 0.0 == rcpm_amt07 ? "0.00": DigitUtil.cutUnderPoint(rcpm_amt07,2));
			rx.add(record, "tot_amt", 0.0 == tot_amt2 ? "0.00": DigitUtil.cutUnderPoint(tot_amt2,2));
			
		}
		
		
		//**전년동월대비**
		int gridData3 = rx.add(resData, "gridData3", "");
		
		for(int i = 0; i < ds.curlist4.size()-1; i++) {
		    AD_DEP_2910_LCURLIST4Record pbuc_rec = (AD_DEP_2910_LCURLIST4Record)ds.curlist4.get(0);
		    AD_DEP_2910_LCURLIST4Record rcpm_rec = (AD_DEP_2910_LCURLIST4Record)ds.curlist4.get(1);
			int record = rx.add(gridData3, "record", "");
	
			//전월 
			double pre_pre_avg1 = 0.0d;
			double pre_avg1     = 0.0d;
			double pre_pre_avg2 = 0.0d;
			double pre_avg2     = 0.0d;
			
			//1.게재액 전전년대비	((기준년/전전년)*100)    
			//2.게재액 전년대비		((기준년/전년)*100)
			if(!"0".equals(pbuc_rec.pre_pre_year1)){
				pre_pre_avg1 = (StringUtil.toDouble(pbuc_rec.now_year1) / StringUtil.toDouble(pbuc_rec.pre_pre_year1)) * 100;
				pre_avg1     = (StringUtil.toDouble(pbuc_rec.now_year1) / StringUtil.toDouble(pbuc_rec.pre_year1)) * 100;
			}
			
			//1.입금액 전전년대비	((기준년/전전년)*100)    
			//2.입금액 전년대비		((기준년/전년)*100)
			if(!"0".equals(rcpm_rec.pre_pre_year1)){
				pre_pre_avg2 = (StringUtil.toDouble(rcpm_rec.now_year1) / StringUtil.toDouble(rcpm_rec.pre_pre_year1)) * 100;
				pre_avg2     = (StringUtil.toDouble(rcpm_rec.now_year1) / StringUtil.toDouble(rcpm_rec.pre_year1)) * 100;
			}
			
			rx.add(record, "gubun", "전   월");
			rx.add(record, "pre_pre_year1", pbuc_rec.pre_pre_year1);
			rx.add(record, "pre_year1", pbuc_rec.pre_year1); 
			rx.add(record, "now_year1", pbuc_rec.now_year1);
			rx.add(record, "pre_pre_avg1", 0.0 == pre_pre_avg1 ? "0.00" : DigitUtil.cutUnderPoint(pre_pre_avg1,2));
			rx.add(record, "prv_avg1", 0.0 == pre_avg1 ? "0.00" : DigitUtil.cutUnderPoint(pre_avg1,2));
			rx.add(record, "pre_pre_year2", rcpm_rec.pre_pre_year1);
			rx.add(record, "pre_year2", rcpm_rec.pre_year1); 
			rx.add(record, "now_year2", rcpm_rec.now_year1);
			rx.add(record, "pre_pre_avg2", 0.0 == pre_pre_avg2 ? "0.00" : DigitUtil.cutUnderPoint(pre_pre_avg2,2));
			rx.add(record, "prv_avg2",  0.0 == pre_avg2 ? "0.00" : DigitUtil.cutUnderPoint(pre_avg2,2));
			
		    //당월 
			double pre_pre_avg11 = 0.0d;
			double pre_avg11     = 0.0d;
			double pre_pre_avg22 = 0.0d;
			double pre_avg22     = 0.0d;
			
			//1.게재액 전전년대비	((기준년/전전년)*100)    
			//2.게재액 전년대비		((기준년/전년)*100)
			if(!"0".equals(pbuc_rec.pre_pre_year2)){
				pre_pre_avg11 = (StringUtil.toDouble(pbuc_rec.now_year2) / StringUtil.toDouble(pbuc_rec.pre_pre_year2)) * 100;
				pre_avg11     = (StringUtil.toDouble(pbuc_rec.now_year2) / StringUtil.toDouble(pbuc_rec.pre_year2)) * 100;
			}
			
			//1.입금액 전전년대비	((기준년/전전년)*100)    
			//2.입금액 전년대비		((기준년/전년)*100)
			if(!"0".equals(rcpm_rec.pre_pre_year2)){
				pre_pre_avg22 = (StringUtil.toDouble(rcpm_rec.now_year2) / StringUtil.toDouble(rcpm_rec.pre_pre_year2)) * 100;
				pre_avg22    = (StringUtil.toDouble(rcpm_rec.now_year2) / StringUtil.toDouble(rcpm_rec.pre_year2)) * 100;
			}
			
			record = rx.add(gridData3, "record", "");
			
			rx.add(record, "gubun", "당   월");
			rx.add(record, "pre_pre_year1", pbuc_rec.pre_pre_year2);
			rx.add(record, "pre_year1", pbuc_rec.pre_year2); 
			rx.add(record, "now_year1", pbuc_rec.now_year2);
			rx.add(record, "pre_pre_avg1", 0.0 == pre_pre_avg11 ? "0.00" : DigitUtil.cutUnderPoint(pre_pre_avg11,2));
			rx.add(record, "prv_avg1", 0.0 == pre_avg11 ? "0.00" : DigitUtil.cutUnderPoint(pre_avg11,2));
			rx.add(record, "pre_pre_year2", rcpm_rec.pre_pre_year2);
			rx.add(record, "pre_year2", rcpm_rec.pre_year2); 
			rx.add(record, "now_year2", rcpm_rec.now_year2);
			rx.add(record, "pre_pre_avg2", 0.0 == pre_pre_avg22 ? "0.00" : DigitUtil.cutUnderPoint(pre_pre_avg22,2));
			rx.add(record, "prv_avg2", 0.0 == pre_avg22 ? "0.00" : DigitUtil.cutUnderPoint(pre_avg22,2));
			
			//년누계 
			double pre_pre_avg12 = 0.0d;
			double pre_avg12     = 0.0d;
			double pre_pre_avg23 = 0.0d;
			double pre_avg23     = 0.0d;
			
			//1.게재액 전전년대비	((기준년/전전년)*100)    
			//2.게재액 전년대비		((기준년/전년)*100)
			if(!"0".equals(pbuc_rec.pre_pre_tot3)){
				pre_pre_avg12 = (StringUtil.toDouble(pbuc_rec.now_tot3) / StringUtil.toDouble(pbuc_rec.pre_pre_tot3)) * 100;
				pre_avg12     = (StringUtil.toDouble(pbuc_rec.now_tot3) / StringUtil.toDouble(pbuc_rec.pre_tot3)) * 100;
			}
			
			//1.입금액 전전년대비	((기준년/전전년)*100)    
			//2.입금액 전년대비		((기준년/전년)*100)
			if(!"0".equals(rcpm_rec.pre_pre_tot3)){
				pre_pre_avg23 = (StringUtil.toDouble(rcpm_rec.now_tot3) / StringUtil.toDouble(rcpm_rec.pre_pre_tot3)) * 100;
				pre_avg23     = (StringUtil.toDouble(rcpm_rec.now_tot3) / StringUtil.toDouble(rcpm_rec.pre_tot3)) * 100;
			}
			
			record = rx.add(gridData3, "record", "");
			
			rx.add(record, "gubun", "연누계");
			rx.add(record, "pre_pre_year1", pbuc_rec.pre_pre_tot3);
			rx.add(record, "pre_year1", pbuc_rec.pre_tot3);
			rx.add(record, "now_year1", pbuc_rec.now_tot3);
			rx.add(record, "pre_pre_avg1", 0.0 == pre_pre_avg12 ? "0.00" : DigitUtil.cutUnderPoint(pre_pre_avg12,2));
			rx.add(record, "prv_avg1", 0.0 == pre_avg12 ? "0.00" : DigitUtil.cutUnderPoint(pre_avg12,2));
			rx.add(record, "pre_pre_year2", rcpm_rec.pre_pre_tot3);
			rx.add(record, "pre_year2", rcpm_rec.pre_tot3);
			rx.add(record, "now_year2", rcpm_rec.now_tot3);
			rx.add(record, "pre_pre_avg2", 0.0 == pre_pre_avg23 ? "0.00" : DigitUtil.cutUnderPoint(pre_pre_avg23,2));
			rx.add(record, "prv_avg2",  0.0 == pre_avg23 ? "0.00" : DigitUtil.cutUnderPoint(pre_avg23,2));
		}
		
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
