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
	AD_DEP_3110_LDataSet ds = (AD_DEP_3110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {  
	
		//**당월**
		double avg_per_per_pubc_amt = 0.0d;
		double avg_per_pubc_amt     = 0.0d;
		double avg_pubc_amt         = 0.0d;
		double avg_next_amt         = 0.0d;
		double avg_tot_amt          = 0.0d;
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_3110_LCURLISTRecord rec = (AD_DEP_3110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			if(0 != StringUtil.toDouble(rec.tot_amt)){
				avg_per_per_pubc_amt = (StringUtil.toDouble(rec.per_per_pubc_amt) / StringUtil.toDouble(rec.tot_amt)) *100;
				avg_per_pubc_amt     = (StringUtil.toDouble(rec.pre_pubc_amt)     / StringUtil.toDouble(rec.tot_amt)) *100;
				avg_pubc_amt         = (StringUtil.toDouble(rec.pubc_amt)         / StringUtil.toDouble(rec.tot_amt)) *100;
				avg_next_amt         = (StringUtil.toDouble(rec.next_pubc_amt)    / StringUtil.toDouble(rec.tot_amt)) *100;
				avg_tot_amt          = (StringUtil.toDouble(rec.tot_amt)          / StringUtil.toDouble(rec.tot_amt)) *100;
			}
			
			rx.add(record, "gubun", "입   금   액");
			rx.add(record, "per_per_pubc_amt", rec.per_per_pubc_amt);
			rx.add(record, "pre_pubc_amt", rec.pre_pubc_amt);
			rx.add(record, "pubc_amt", rec.pubc_amt);
			rx.add(record, "next_pubc_amt", rec.next_pubc_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			
		}
		
		int record = rx.add(gridData, "record", "");
		
		rx.add(record, "gubun", "입 금 비 율");
		rx.add(record, "per_per_pubc_amt", 0.00 == avg_per_per_pubc_amt ? "0.00" : DigitUtil.cutUnderPoint(avg_per_per_pubc_amt,2));
		rx.add(record, "pre_pubc_amt", 0.00 == avg_per_pubc_amt ? "0.00" : DigitUtil.cutUnderPoint(avg_per_pubc_amt,2));
		rx.add(record, "pubc_amt", 0.00 == avg_pubc_amt ? "0.00" : DigitUtil.cutUnderPoint(avg_pubc_amt,2));
		rx.add(record, "next_pubc_amt", 0.00 == avg_next_amt ? "0.00" : DigitUtil.cutUnderPoint(avg_next_amt,2));
		rx.add(record, "tot_amt", 0.00 == avg_tot_amt ? "0.00" : DigitUtil.cutUnderPoint(avg_tot_amt,2));
		
		
		//**월별**
		//월별 : 게재액 
		long pubc_mm_amt01 = 0;
		long pubc_mm_amt02 = 0;
		long pubc_mm_amt03 = 0;
		long pubc_mm_amt04 = 0;
		long pubc_mm_amt05 = 0;
		long pubc_mm_amt06 = 0;
		long pubc_mm_amt07 = 0;
		long pubc_mm_amt08 = 0;
		long pubc_mm_amt09 = 0;
		long pubc_mm_amt10 = 0;
		long pubc_mm_amt11 = 0;
		long pubc_mm_amt12 = 0;
		long pubc_mm_amt00 = 0;
		long tot_mm_amt    = 0;
		
		int gridData2 = rx.add(resData, "gridData2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_DEP_3110_LCURLIST2Record rec = (AD_DEP_3110_LCURLIST2Record)ds.curlist2.get(i);
			int record2 = rx.add(gridData2, "record2", "");
			
			//월별게재액 
			pubc_mm_amt01 = StringUtil.toLong(rec.pubc_amt01);
			pubc_mm_amt02 = StringUtil.toLong(rec.pubc_amt02);
			pubc_mm_amt03 = StringUtil.toLong(rec.pubc_amt03);
			pubc_mm_amt04 = StringUtil.toLong(rec.pubc_amt04);
			pubc_mm_amt05 = StringUtil.toLong(rec.pubc_amt05);
			pubc_mm_amt06 = StringUtil.toLong(rec.pubc_amt06);
			pubc_mm_amt07 = StringUtil.toLong(rec.pubc_amt07);
			pubc_mm_amt08 = StringUtil.toLong(rec.pubc_amt08);
			pubc_mm_amt09 = StringUtil.toLong(rec.pubc_amt09);
			pubc_mm_amt10 = StringUtil.toLong(rec.pubc_amt10);
			pubc_mm_amt11 = StringUtil.toLong(rec.pubc_amt11);
			pubc_mm_amt12 = StringUtil.toLong(rec.pubc_amt12);
			
			tot_mm_amt = StringUtil.toLong(rec.pubc_amt01)+StringUtil.toLong(rec.pubc_amt02)+StringUtil.toLong(rec.pubc_amt03)
			            +StringUtil.toLong(rec.pubc_amt04)+StringUtil.toLong(rec.pubc_amt05)+StringUtil.toLong(rec.pubc_amt06)
			            +StringUtil.toLong(rec.pubc_amt07)+StringUtil.toLong(rec.pubc_amt08)+StringUtil.toLong(rec.pubc_amt09)
			            +StringUtil.toLong(rec.pubc_amt10)+StringUtil.toLong(rec.pubc_amt11)+StringUtil.toLong(rec.pubc_amt12);
			
			rx.add(record2, "gubun1", "게재액");   
			rx.add(record2, "gubun2", "게재액");   
			rx.add(record2, "jan_amt", rec.pubc_amt01);
			rx.add(record2, "feb_amt", rec.pubc_amt02);
			rx.add(record2, "mar_amt", rec.pubc_amt03);
			rx.add(record2, "apr_amt", rec.pubc_amt04);
			rx.add(record2, "may_amt", rec.pubc_amt05);
			rx.add(record2, "jun_amt", rec.pubc_amt06);
			rx.add(record2, "jul_amt", rec.pubc_amt07);
			rx.add(record2, "aug_amt", rec.pubc_amt08);
			rx.add(record2, "sep_amt", rec.pubc_amt09);
			rx.add(record2, "oct_amt", rec.pubc_amt10);
			rx.add(record2, "nov_amt", rec.pubc_amt11);
			rx.add(record2, "dec_amt", rec.pubc_amt12);
			rx.add(record2, "next_jan_amt", "");   
			rx.add(record2, "tot_amt", tot_mm_amt);   
		}
		
		//입금액 합계
		long tot_rcpm_mm_amt01 = 0;
		long tot_rcpm_mm_amt02 = 0;
		long tot_rcpm_mm_amt03 = 0;
		long tot_rcpm_mm_amt04 = 0;
		long tot_rcpm_mm_amt05 = 0;
		long tot_rcpm_mm_amt06 = 0;
		long tot_rcpm_mm_amt07 = 0;
		long tot_rcpm_mm_amt08 = 0;
		long tot_rcpm_mm_amt09 = 0;
		long tot_rcpm_mm_amt10 = 0;
		long tot_rcpm_mm_amt11 = 0;
		long tot_rcpm_mm_amt12 = 0;
		long tot_rcpm_mm_amt00 = 0;
		long tot_rcpm_mm_amt   = 0;
		//미수금 
        long tot_misu_mm_amt01 = 0;
		long tot_misu_mm_amt02 = 0;
		long tot_misu_mm_amt03 = 0;
		long tot_misu_mm_amt04 = 0;
		long tot_misu_mm_amt05 = 0;
		long tot_misu_mm_amt06 = 0;
		long tot_misu_mm_amt07 = 0;
		long tot_misu_mm_amt08 = 0;
		long tot_misu_mm_amt09 = 0;
		long tot_misu_mm_amt10 = 0;
		long tot_misu_mm_amt11 = 0;
		long tot_misu_mm_amt12 = 0;
		long tot_misu_mm_amt00 = 0;
		long tot_misu_mm_amt   = 0;
        //미수율
		double avg_misu_mm_amt01 = 0.00d;
		double avg_misu_mm_amt02 = 0.00d;
		double avg_misu_mm_amt03 = 0.00d;
		double avg_misu_mm_amt04 = 0.00d;
		double avg_misu_mm_amt05 = 0.00d;
		double avg_misu_mm_amt06 = 0.00d;
		double avg_misu_mm_amt07 = 0.00d;
		double avg_misu_mm_amt08 = 0.00d;
		double avg_misu_mm_amt09 = 0.00d;
		double avg_misu_mm_amt10 = 0.00d;
		double avg_misu_mm_amt11 = 0.00d;
		double avg_misu_mm_amt12 = 0.00d;
		double avg_misu_mm_amt00 = 0.00d;
		double avg_misu_mm_amt   = 0.00d;
		
		long tot_mm_amt2 = 0;
		
		//월별 : 입금액 
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_DEP_3110_LCURLIST3Record rec = (AD_DEP_3110_LCURLIST3Record)ds.curlist3.get(i);
			int record2 = rx.add(gridData2, "record2", "");
			
			tot_mm_amt2 =  StringUtil.toLong(rec.rcpm_amt01)+StringUtil.toLong(rec.rcpm_amt02)+StringUtil.toLong(rec.rcpm_amt03)
  		 			      +StringUtil.toLong(rec.rcpm_amt04)+StringUtil.toLong(rec.rcpm_amt05)+StringUtil.toLong(rec.rcpm_amt06)
					      +StringUtil.toLong(rec.rcpm_amt07)+StringUtil.toLong(rec.rcpm_amt08)+StringUtil.toLong(rec.rcpm_amt09)
					      +StringUtil.toLong(rec.rcpm_amt10)+StringUtil.toLong(rec.rcpm_amt11)+StringUtil.toLong(rec.rcpm_amt12)
					      +StringUtil.toLong(rec.rcpm_amt00);		
					  
			//입금액합계		  
			tot_rcpm_mm_amt01 += StringUtil.toLong(rec.rcpm_amt01);
			tot_rcpm_mm_amt02 += StringUtil.toLong(rec.rcpm_amt02);
			tot_rcpm_mm_amt03 += StringUtil.toLong(rec.rcpm_amt03);
			tot_rcpm_mm_amt04 += StringUtil.toLong(rec.rcpm_amt04);
			tot_rcpm_mm_amt05 += StringUtil.toLong(rec.rcpm_amt05);
			tot_rcpm_mm_amt06 += StringUtil.toLong(rec.rcpm_amt06);
			tot_rcpm_mm_amt07 += StringUtil.toLong(rec.rcpm_amt07);
			tot_rcpm_mm_amt08 += StringUtil.toLong(rec.rcpm_amt08);
			tot_rcpm_mm_amt09 += StringUtil.toLong(rec.rcpm_amt09);
			tot_rcpm_mm_amt10 += StringUtil.toLong(rec.rcpm_amt10);
			tot_rcpm_mm_amt11 += StringUtil.toLong(rec.rcpm_amt11);
			tot_rcpm_mm_amt12 += StringUtil.toLong(rec.rcpm_amt12);
			tot_rcpm_mm_amt00 += StringUtil.toLong(rec.rcpm_amt00);	  
			tot_rcpm_mm_amt   += tot_mm_amt2;		
			
			//미수액(게재액 - 입금액합계) 
			tot_misu_mm_amt01 = pubc_mm_amt01 - tot_rcpm_mm_amt01;
			tot_misu_mm_amt02 = pubc_mm_amt02 - tot_rcpm_mm_amt02;
			tot_misu_mm_amt03 = pubc_mm_amt03 - tot_rcpm_mm_amt03;
			tot_misu_mm_amt04 = pubc_mm_amt04 - tot_rcpm_mm_amt04;
			tot_misu_mm_amt05 = pubc_mm_amt05 - tot_rcpm_mm_amt05;
			tot_misu_mm_amt06 = pubc_mm_amt06 - tot_rcpm_mm_amt06;
			tot_misu_mm_amt07 = pubc_mm_amt07 - tot_rcpm_mm_amt07;
			tot_misu_mm_amt08 = pubc_mm_amt08 - tot_rcpm_mm_amt08;
			tot_misu_mm_amt09 = pubc_mm_amt09 - tot_rcpm_mm_amt09;
			tot_misu_mm_amt10 = pubc_mm_amt10 - tot_rcpm_mm_amt10;
			tot_misu_mm_amt11 = pubc_mm_amt11 - tot_rcpm_mm_amt11;
			tot_misu_mm_amt12 = pubc_mm_amt12 - tot_rcpm_mm_amt12;
			tot_misu_mm_amt00 = pubc_mm_amt00 - tot_rcpm_mm_amt00; 
			tot_misu_mm_amt   = tot_mm_amt    - tot_rcpm_mm_amt;
			
			//미수율 ((미수액/입금합계)*100)
			if(0 != tot_rcpm_mm_amt01){
				avg_misu_mm_amt01 = ((double)tot_misu_mm_amt01/(double)tot_rcpm_mm_amt01)*100;
			}
			if(0 != tot_rcpm_mm_amt02){
				avg_misu_mm_amt02 = ((double)tot_misu_mm_amt02/(double)tot_rcpm_mm_amt02)*100;
			}
			if(0 != tot_rcpm_mm_amt03){
				avg_misu_mm_amt03 = ((double)tot_misu_mm_amt03/(double)tot_rcpm_mm_amt03)*100;
			}
			if(0 != tot_rcpm_mm_amt04){
				avg_misu_mm_amt04 = ((double)tot_misu_mm_amt04/(double)tot_rcpm_mm_amt04)*100;
			}
			if(0 != tot_rcpm_mm_amt05){
				avg_misu_mm_amt05 = ((double)tot_misu_mm_amt05/(double)tot_rcpm_mm_amt05)*100;
			}
			if(0 != tot_rcpm_mm_amt06){
				avg_misu_mm_amt06 = ((double)tot_misu_mm_amt06/(double)tot_rcpm_mm_amt06)*100;
			}
			if(0 != tot_rcpm_mm_amt07){
				avg_misu_mm_amt07 = ((double)tot_misu_mm_amt07/(double)tot_rcpm_mm_amt07)*100;
			}
			if(0 != tot_rcpm_mm_amt08){
				avg_misu_mm_amt08 = ((double)tot_misu_mm_amt08/(double)tot_rcpm_mm_amt08)*100;
			}
			if(0 != tot_rcpm_mm_amt09){
				avg_misu_mm_amt09 = ((double)tot_misu_mm_amt09/(double)tot_rcpm_mm_amt09)*100;
			}
			if(0 != tot_rcpm_mm_amt10){
				avg_misu_mm_amt10 = ((double)tot_misu_mm_amt10/(double)tot_rcpm_mm_amt10)*100;
			}
			if(0 != tot_rcpm_mm_amt11){
				avg_misu_mm_amt11 = ((double)tot_misu_mm_amt11/(double)tot_rcpm_mm_amt11)*100;
			}
			if(0 != tot_rcpm_mm_amt12){
				avg_misu_mm_amt12 = ((double)tot_misu_mm_amt12/(double)tot_rcpm_mm_amt12)*100;
			}
			if(0 != tot_rcpm_mm_amt00){
				avg_misu_mm_amt00 = ((double)tot_misu_mm_amt00/(double)tot_rcpm_mm_amt00)*100;
			}
			if(0 != tot_rcpm_mm_amt){
				avg_misu_mm_amt   = ((double)tot_misu_mm_amt/(double)tot_rcpm_mm_amt)*100;
			}
			
			rx.add(record2, "gubun1", "입금액");
		    rx.add(record2, "gubun2",  rec.rcpm_mm);
		    rx.add(record2, "jan_amt", rec.rcpm_amt01); 
		    rx.add(record2, "feb_amt", rec.rcpm_amt02);
		    rx.add(record2, "mar_amt", rec.rcpm_amt03);
		    rx.add(record2, "apr_amt", rec.rcpm_amt04);
		    rx.add(record2, "may_amt", rec.rcpm_amt05);
		    rx.add(record2, "jun_amt", rec.rcpm_amt06);
		    rx.add(record2, "jul_amt", rec.rcpm_amt07);
		    rx.add(record2, "aug_amt", rec.rcpm_amt08);
		    rx.add(record2, "sep_amt", rec.rcpm_amt09);
		    rx.add(record2, "oct_amt", rec.rcpm_amt10);
		    rx.add(record2, "nov_amt", rec.rcpm_amt11);
		    rx.add(record2, "dec_amt", rec.rcpm_amt12);
		    rx.add(record2, "next_jan_amt", rec.rcpm_amt00); 
		    rx.add(record2, "tot_amt", tot_mm_amt2);
		}
		
		int record2 = rx.add(gridData2, "record2", "");
		
		rx.add(record2, "gubun1", "합         계");
		rx.add(record2, "gubun2", "합         계");
	    rx.add(record2, "jan_amt", tot_rcpm_mm_amt01); 
	    rx.add(record2, "feb_amt", tot_rcpm_mm_amt02);
	    rx.add(record2, "mar_amt", tot_rcpm_mm_amt03);
	    rx.add(record2, "apr_amt", tot_rcpm_mm_amt04);
	    rx.add(record2, "may_amt", tot_rcpm_mm_amt05);
	    rx.add(record2, "jun_amt", tot_rcpm_mm_amt06);
	    rx.add(record2, "jul_amt", tot_rcpm_mm_amt07);
	    rx.add(record2, "aug_amt", tot_rcpm_mm_amt08);
	    rx.add(record2, "sep_amt", tot_rcpm_mm_amt09);
	    rx.add(record2, "oct_amt", tot_rcpm_mm_amt10);
	    rx.add(record2, "nov_amt", tot_rcpm_mm_amt11);
	    rx.add(record2, "dec_amt", tot_rcpm_mm_amt12);
	    rx.add(record2, "next_jan_amt", tot_rcpm_mm_amt00); 
	    rx.add(record2, "tot_amt", tot_rcpm_mm_amt);
		
		record2 = rx.add(gridData2, "record2", "");
		
		rx.add(record2, "gubun1", "미   수   액");
		rx.add(record2, "gubun2", "미   수   액");
	    rx.add(record2, "jan_amt", tot_misu_mm_amt01);     
		rx.add(record2, "feb_amt", tot_misu_mm_amt02);     
		rx.add(record2, "mar_amt", tot_misu_mm_amt03);     
		rx.add(record2, "apr_amt", tot_misu_mm_amt04);     
		rx.add(record2, "may_amt", tot_misu_mm_amt05);     
		rx.add(record2, "jun_amt", tot_misu_mm_amt06);     
		rx.add(record2, "jul_amt", tot_misu_mm_amt07);     
		rx.add(record2, "aug_amt", tot_misu_mm_amt08);     
		rx.add(record2, "sep_amt", tot_misu_mm_amt09);     
		rx.add(record2, "oct_amt", tot_misu_mm_amt10);     
		rx.add(record2, "nov_amt", tot_misu_mm_amt11);     
		rx.add(record2, "dec_amt", tot_misu_mm_amt12);     
		rx.add(record2, "next_jan_amt", tot_misu_mm_amt00);
		rx.add(record2, "tot_amt", tot_misu_mm_amt);       
		
		record2 = rx.add(gridData2, "record2", "");
		
		rx.add(record2, "gubun1", "미 수 율(%)");
		rx.add(record2, "gubun2", "미 수 율(%)");
		rx.add(record2, "jan_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt01,2));     
		rx.add(record2, "feb_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt02,2));     
		rx.add(record2, "mar_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt03,2));     
		rx.add(record2, "apr_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt04,2));     
		rx.add(record2, "may_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt05,2));     
		rx.add(record2, "jun_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt06,2));     
		rx.add(record2, "jul_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt07,2));     
		rx.add(record2, "aug_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt08,2));;     
		rx.add(record2, "sep_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt09,2));;     
		rx.add(record2, "oct_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt10,2));     
		rx.add(record2, "nov_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt11,2));     
		rx.add(record2, "dec_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt12,2));     
		rx.add(record2, "next_jan_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt00,2));;
		rx.add(record2, "tot_amt", DigitUtil.cutUnderPoint(avg_misu_mm_amt,2));       
		
		
		//**년별**
		long pubc_yy_amt1 = 0; 
		long pubc_yy_amt2 = 0;
		long pubc_yy_amt3 = 0;
		long pubc_yy_amt4 = 0;
		long pubc_yy_amt5 = 0;
		//게재액합계
		long tot_pubc_yy_amt = 0;
		
		//게재액 
		int gridData3 = rx.add(resData, "gridData3", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_DEP_3110_LCURLIST4Record rec = (AD_DEP_3110_LCURLIST4Record)ds.curlist4.get(i);
			int record3 = rx.add(gridData3, "record3", "");
			
			pubc_yy_amt1 = StringUtil.toLong(rec.pubc_amt1);
			pubc_yy_amt2 = StringUtil.toLong(rec.pubc_amt2);
			pubc_yy_amt3 = StringUtil.toLong(rec.pubc_amt3);
			pubc_yy_amt4 = StringUtil.toLong(rec.pubc_amt4);
			pubc_yy_amt5 = StringUtil.toLong(rec.pubc_amt5);
			
			//게재액합계 
			tot_pubc_yy_amt =  StringUtil.toLong(rec.pubc_amt1)+StringUtil.toLong(rec.pubc_amt2)+StringUtil.toLong(rec.pubc_amt3)
			                  +StringUtil.toLong(rec.pubc_amt4)+StringUtil.toLong(rec.pubc_amt5);
			
			rx.add(record3, "gubun1", "게재액");   
			rx.add(record3, "gubun2", "게재액");
			rx.add(record3, "pre_amt1", rec.pubc_amt1);
			rx.add(record3, "pre_amt2", rec.pubc_amt2);
			rx.add(record3, "pre_amt3", rec.pubc_amt3);
			rx.add(record3, "now_amt", rec.pubc_amt4);
			rx.add(record3, "next_amt", rec.pubc_amt5);
			rx.add(record3, "tot_amt", tot_pubc_yy_amt);
		}
		
		//입금액 
		long tot_rcpm_yy_amt01 = 0;
		long tot_rcpm_yy_amt02 = 0;
		long tot_rcpm_yy_amt03 = 0;
		long tot_rcpm_yy_amt04 = 0;
		long tot_rcpm_yy_amt05 = 0;
		long tot_tot_yy_amt    = 0;
		//미수액 
		long tot_misu_yy_amt01 = 0;
		long tot_misu_yy_amt02 = 0;
		long tot_misu_yy_amt03 = 0;
		long tot_misu_yy_amt04 = 0;
		long tot_misu_yy_amt05 = 0;
		long tot_tot_yy_misu   = 0;
		//미수율  
		double avg_misu_yy_amt01 = 0.00d;
		double avg_misu_yy_amt02 = 0.00d;
		double avg_misu_yy_amt03 = 0.00d;
		double avg_misu_yy_amt04 = 0.00d;
		double avg_misu_yy_amt05 = 0.00d;
		double avg_tot_yy_misu   = 0.00d;
		
		//입금액 
		for(int i = 0; i < ds.curlist5.size(); i++) {
			AD_DEP_3110_LCURLIST5Record rec = (AD_DEP_3110_LCURLIST5Record)ds.curlist5.get(i);
			int record3 = rx.add(gridData3, "record3", "");
			
			long tot_rcpm_yy_amt = 0;
			
			tot_rcpm_yy_amt = StringUtil.toLong(rec.rcpm_amt01)
			                 +StringUtil.toLong(rec.rcpm_amt02)
			                 +StringUtil.toLong(rec.rcpm_amt03)
			                 +StringUtil.toLong(rec.rcpm_amt04)
			                 +StringUtil.toLong(rec.rcpm_amt05);
			//입금액합계              
			tot_rcpm_yy_amt01 += StringUtil.toLong(rec.rcpm_amt01);  
			tot_rcpm_yy_amt02 += StringUtil.toLong(rec.rcpm_amt02); 
			tot_rcpm_yy_amt03 += StringUtil.toLong(rec.rcpm_amt03); 
			tot_rcpm_yy_amt04 += StringUtil.toLong(rec.rcpm_amt04); 
			tot_rcpm_yy_amt05 += StringUtil.toLong(rec.rcpm_amt05);       
			tot_tot_yy_amt    += tot_rcpm_yy_amt;    
			
			//미수액 (게재액 - 입금액 합계)
			tot_misu_yy_amt01 = pubc_yy_amt1 - tot_rcpm_yy_amt01;
			tot_misu_yy_amt02 = pubc_yy_amt2 - tot_rcpm_yy_amt02;
			tot_misu_yy_amt03 = pubc_yy_amt3 - tot_rcpm_yy_amt03;
			tot_misu_yy_amt04 = pubc_yy_amt4 - tot_rcpm_yy_amt04;
			tot_misu_yy_amt05 = pubc_yy_amt5 - tot_rcpm_yy_amt05;
			tot_tot_yy_misu   = tot_pubc_yy_amt - tot_tot_yy_amt;
			
			//미수율 ((미수액/입금액합계)*100)
			if(0 != tot_rcpm_yy_amt01) {
				avg_misu_yy_amt01 = ((double)tot_misu_yy_amt01 / (double)tot_rcpm_yy_amt01) *100;
			}
			if(0 != tot_rcpm_yy_amt02) {
				avg_misu_yy_amt02 = ((double)tot_misu_yy_amt02 / (double)tot_rcpm_yy_amt02) *100;
			}
			if(0 != tot_rcpm_yy_amt03) {
				avg_misu_yy_amt03 = ((double)tot_misu_yy_amt03 / (double)tot_rcpm_yy_amt03) *100;
			}
			if(0 != tot_rcpm_yy_amt04) {
				avg_misu_yy_amt04 = ((double)tot_misu_yy_amt04 / (double)tot_rcpm_yy_amt04) *100;
			}
			if(0 != tot_rcpm_yy_amt05) {
				avg_misu_yy_amt05 = ((double)tot_misu_yy_amt05 / (double)tot_rcpm_yy_amt05) *100;
			}
			if(0 != tot_tot_yy_amt) {
				avg_tot_yy_misu = ((double)tot_tot_yy_misu / (double)tot_tot_yy_amt) *100;
			}
			
			rx.add(record3, "gubun1", "입금액");   
			rx.add(record3, "gubun2", rec.rcpm_yymm);
			rx.add(record3, "pre_amt1", rec.rcpm_amt01);
			rx.add(record3, "pre_amt2", rec.rcpm_amt02);
			rx.add(record3, "pre_amt3", rec.rcpm_amt03);
			rx.add(record3, "now_amt", rec.rcpm_amt04);
			rx.add(record3, "next_amt", rec.rcpm_amt05);
			rx.add(record3, "tot_amt", tot_rcpm_yy_amt);
		}
		
		int record3 = rx.add(gridData3, "record3", "");
		
		rx.add(record3, "gubun1", "합         계");   
		rx.add(record3, "gubun2", "합         계");
		rx.add(record3, "pre_amt1", tot_rcpm_yy_amt01);
		rx.add(record3, "pre_amt2", tot_rcpm_yy_amt02);
		rx.add(record3, "pre_amt3", tot_rcpm_yy_amt03);
		rx.add(record3, "now_amt", tot_rcpm_yy_amt04);
		rx.add(record3, "next_amt", tot_rcpm_yy_amt05);
		rx.add(record3, "tot_amt", tot_tot_yy_amt);
		
		record3 = rx.add(gridData3, "record3", "");
		
		rx.add(record3, "gubun1", "미   수   액");   
		rx.add(record3, "gubun2", "미   수   액");
		rx.add(record3, "pre_amt1", tot_misu_yy_amt01);
		rx.add(record3, "pre_amt2", tot_misu_yy_amt02);
		rx.add(record3, "pre_amt3", tot_misu_yy_amt03);
		rx.add(record3, "now_amt", tot_misu_yy_amt04);
		rx.add(record3, "next_amt", tot_misu_yy_amt05);
		rx.add(record3, "tot_amt", tot_tot_yy_misu);
		
		record3 = rx.add(gridData3, "record3", "");
		
		rx.add(record3, "gubun1", "미 수 율(%)");   
		rx.add(record3, "gubun2", "미 수 율(%)");
		rx.add(record3, "pre_amt1", DigitUtil.cutUnderPoint(avg_misu_yy_amt01,2));
		rx.add(record3, "pre_amt2", DigitUtil.cutUnderPoint(avg_misu_yy_amt02,2));
		rx.add(record3, "pre_amt3", DigitUtil.cutUnderPoint(avg_misu_yy_amt03,2));
		rx.add(record3, "now_amt", DigitUtil.cutUnderPoint(avg_misu_yy_amt04,2));
		rx.add(record3, "next_amt", DigitUtil.cutUnderPoint(avg_misu_yy_amt05,2));
		rx.add(record3, "tot_amt", DigitUtil.cutUnderPoint(avg_tot_yy_misu,2));
		
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
