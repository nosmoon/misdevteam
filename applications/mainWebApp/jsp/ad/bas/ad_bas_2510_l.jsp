<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_2510_LDataSet ds = (AD_BAS_2510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");   
	int gridData = rx.add(resData, "gridData", "");
	
	try {
		
		//입력년도의 게재목표
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2510_LCURLISTRecord rec = (AD_BAS_2510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			int cnt1        = StringUtil.toNumber(rec.cnt1);      //게재일  
			double trgtamt1 = StringUtil.toDouble(rec.trgtamt1);  //목표액  
			double avg1     = 0.00d;
			if(cnt1 != 0 ){
				avg1    = trgtamt1 / cnt1;				      //일평균게재 목표액 = 목표액 / 게재일 
			}
			
			rx.add(record, "cnt", rec.cnt1);         						 //입력년도의 개재일 
			rx.add(record, "trgtamt", rec.trgtamt1); 						 //입력년도의 목표액 
			rx.add(record, "trgtavg", DigitUtil.cutUnderPoint(avg1,0));    	 //입력년도의 일평균액  
		}
		
		//입력년도의 전년도 게재목표
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2510_LCURLISTRecord rec = (AD_BAS_2510_LCURLISTRecord)ds.curlist.get(i);
			int record2 = rx.add(gridData, "record2", "");
			
			int cnt2        = StringUtil.toNumber(rec.cnt2); 		//게재일 
			double pubcamt2 = StringUtil.toDouble(rec.pubcamt2);    //게재액 
			double avg2     = 0.00d;
			if(cnt2 != 0){
				avg2	= pubcamt2 / cnt2;                    //일평균게재액  =  게재액 / 게재일
			}	
			
			rx.add(record2, "cnt", rec.cnt2);          							  //입력년도의 전년도 개재일 
			rx.add(record2, "pubcamt", rec.pubcamt2);  							  //입력년도의 전년도 목표액 
			rx.add(record2, "pubcavg", DigitUtil.cutUnderPoint(avg2,0));          //입력년도의 전년도 일평균액 		
		}
		
		
		//당년도  주간게재실적  
		int gridData2 = rx.add(resData, "gridData2", "");
		
		int	pubc_cnt  = 0;	//주간게재일수
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2510_LCURLIST2Record rec = (AD_BAS_2510_LCURLIST2Record)ds.curlist2.get(i);
			if(!"0".equals(rec.amt)){
				pubc_cnt++;
			}
		}
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2510_LCURLIST2Record rec = (AD_BAS_2510_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData2, "record", "");
			
			rx.add(record, "dd", Integer.parseInt(rec.pubc_dt.substring(0,2))+"."+Integer.parseInt(rec.pubc_dt.substring(2,4))+".");	//게재일자 
			rx.add(record, "yoil1", rec.yoil);  			//요일 
			rx.add(record, "pubc_side1", rec.pubc_side);	//면 
			rx.add(record, "dn1", StringUtil.toDouble(rec.dn));	//단수 
			rx.add(record, "amt1", rec.amt);				//게재액 
		}

		double 	tot_dn1      	= 0;    //단년 단수 
		long 	tot_amt1       	= 0;    //단년 게재액 
		long 	tot_pubc_side1 	= 0; 	//단년 면당 
		double 	avg_dn1      	= 0;    //단년 단수 평균 
		long 	avg_amt1       	= 0;    //단년 게재액 평균 
		long 	avg_pubc_side1 	= 0;    //단년 면당 평균 
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2510_LCURLIST2Record rec = (AD_BAS_2510_LCURLIST2Record)ds.curlist2.get(i);
			
			tot_dn1        += StringUtil.toDouble(rec.dn);
			tot_amt1       += StringUtil.toLong(rec.amt);
			tot_pubc_side1 += StringUtil.toLong(rec.pubc_side);
		}
		
		avg_dn1		= 	tot_dn1/ pubc_cnt;  
   	    avg_amt1 	= 	tot_amt1/ pubc_cnt; 
		
		if(tot_pubc_side1 != 0){
			avg_pubc_side1 = tot_amt1 / tot_pubc_side1;
		}
		
		int record11 = rx.add(gridData2, "record", "");
		rx.add(record11, "dd", "계");
		rx.add(record11, "yoil1", "");  
		rx.add(record11, "dn1", tot_dn1);
		rx.add(record11, "amt1", tot_amt1);
		
		int record12 = rx.add(gridData2, "record", "");
		rx.add(record12, "dd", "일평균");
		rx.add(record12, "yoil1", "");  
		rx.add(record12, "dn1", avg_dn1);
		rx.add(record12, "amt1", avg_amt1);
		
		int record13 = rx.add(gridData2, "record", "");
		rx.add(record13, "dd", "면당 게재액");
		rx.add(record13, "yoil1", "");  
		rx.add(record13, "dn1", "");
		rx.add(record13, "amt1", avg_pubc_side1);

		int	pubc_cnt2  = 0;	//주간게재일수
		for(int i = 0; i < ds.curlist22.size(); i++) {
			AD_BAS_2510_LCURLIST22Record rec = (AD_BAS_2510_LCURLIST22Record)ds.curlist22.get(i);
			if(!"0".equals(rec.amt)){
				pubc_cnt2++;
			}
		}
		//전년도 주간게재실적 
		for(int i = 0; i < ds.curlist22.size(); i++) {
			AD_BAS_2510_LCURLIST22Record rec = (AD_BAS_2510_LCURLIST22Record)ds.curlist22.get(i);
			int record2 = rx.add(gridData2, "record2", "");
			
			rx.add(record2, "dd", Integer.parseInt(rec.pubc_dt.substring(0,2))+"."+Integer.parseInt(rec.pubc_dt.substring(2,4))+".");	//게재일자 
			rx.add(record2, "yoil2", rec.yoil);				//요일 
			rx.add(record2, "pubc_side2", rec.pubc_side);	//면 
			rx.add(record2, "dn2", StringUtil.toDouble(rec.dn));	//단수
			rx.add(record2, "amt2", rec.amt);				//게재액 
		}
		
		double 	tot_dn2 		= 0;	//전년 단수 
		long 	tot_amt2 		= 0;    //전년 게재액 
		long 	tot_pubc_side2 	= 0; 	//전년 면당 
		double 	avg_dn2 		= 0;    //전년 단수 평균 
		long 	avg_amt2 		= 0;	//전년 게재액 평균
		long 	avg_pubc_side2 	= 0;    //전년 게재액 평균  
		
		for(int i = 0; i < ds.curlist22.size(); i++) {
			AD_BAS_2510_LCURLIST22Record rec = (AD_BAS_2510_LCURLIST22Record)ds.curlist22.get(i);
			
			tot_dn2 		+= StringUtil.toDouble(rec.dn);
			tot_amt2 		+= StringUtil.toLong(rec.amt);
			tot_pubc_side2 	+= StringUtil.toLong(rec.pubc_side); 
		}
		
		avg_dn2   = tot_dn2 / pubc_cnt2;
		avg_amt2  = tot_amt2 / pubc_cnt2;
		
		if(tot_pubc_side2 != 0){
		    avg_pubc_side2 = tot_amt2 / tot_pubc_side2;
	    }

		int record21 = rx.add(gridData2, "record2", "");
		rx.add(record21, "dd", "계");
		rx.add(record21, "yoil2", "");
		rx.add(record21, "dn2", tot_dn2);
		rx.add(record21, "amt2", tot_amt2);
		
		int record22 = rx.add(gridData2, "record2", "");
		rx.add(record22, "dd", "일평균");
		rx.add(record22, "yoil2", "");
		rx.add(record22, "dn2", avg_dn2);
		rx.add(record22, "amt2", DigitUtil.cutUnderPoint(avg_amt2,1));
		
		int record23 = rx.add(gridData2, "record2", "");
		rx.add(record23, "dd", "면당 게재액");
		rx.add(record23, "yoil2", "");
		rx.add(record23, "dn2", "");
		rx.add(record23, "amt2", avg_pubc_side2);		
		
		double inc_dn   = 0.00d;
		long inc_amt    = 0;
		double inc_amt2 = 0.00d;
		double inc_avg  = 0.00d;
		
		inc_dn   = tot_dn1  - tot_dn2;
		inc_amt  = tot_amt1 - tot_amt2;
		inc_amt2 = tot_amt1 - tot_amt2;
		
		if(tot_amt2 != 0){
			inc_avg  = (inc_amt2 / tot_amt2) * 100;
		}
		
		int record3 = rx.add(gridData2, "record3", "");
		rx.add(record3, "inc_dn", inc_dn);
		rx.add(record3, "inc_amt", inc_amt);
		rx.add(record3, "inc_avg", DigitUtil.cutUnderPoint(inc_avg,1));
		
	
		//(월간)/년간 게재액 분석 
		int gridData3 = rx.add(resData, "gridData3", "");
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_BAS_2510_LCURLIST3Record rec = (AD_BAS_2510_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(gridData3, "record", "");
			
			rx.add(record, "gubn", "월간");       	    	//월간
			rx.add(record, "medi_nm", rec.medi_nm);   		//매체명 
			rx.add(record, "cnt", rec.cnt1);   		  		//일수
			rx.add(record, "pubcamt1", rec.pubcamt1);   	//당년게재액 
			rx.add(record, "pubcamt2", rec.pubcamt2);   	//전년게재액 
			rx.add(record, "incamt", rec.incamt);   		//증감액
			rx.add(record, "incavg", StringUtil.toDouble(rec.incavg));   		//비율
			rx.add(record, "trgtamt", rec.trgtamt);   		//목표액
			rx.add(record, "shortamt", rec.shortamt);   	//과부족액
			rx.add(record, "shortavg", StringUtil.toDouble(rec.shortavg));   	//비율 
		}
		
		//월간/(년간) 게재액 분석
		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_BAS_2510_LCURLIST4Record rec = (AD_BAS_2510_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(gridData3, "record", "");
			
			rx.add(record, "gubn", "년간");       	    	//년간 
			rx.add(record, "medi_nm", rec.medi_nm);   		//매체명 
			rx.add(record, "cnt", rec.cnt1);   		  		//일수
			rx.add(record, "pubcamt1", rec.pubcamt1);   	//당년게재액 
			rx.add(record, "pubcamt2", rec.pubcamt2);   	//전년게재액 
			rx.add(record, "incamt", rec.incamt);   		//증감액
			rx.add(record, "incavg", StringUtil.toDouble(rec.incavg));   		//비율
			rx.add(record, "trgtamt", rec.trgtamt);   		//목표액
			rx.add(record, "shortamt", rec.shortamt);   	//과부족액
			rx.add(record, "shortavg", StringUtil.toDouble(rec.shortavg));   	//비율 
		}
		
		
		long tot_pubcamt = 0;
		double pubcamt     = 0;
		double temp        = 0;
		
		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_BAS_2510_LCURLIST4Record rec = (AD_BAS_2510_LCURLIST4Record)ds.curlist4.get(i);
			
			tot_pubcamt += StringUtil.toLong(rec.pubcamt1);		//월간/(연간) 게재액 분석 계 
			
			temp = StringUtil.toLong(rec.pubcamt1);
		}
		
		pubcamt = tot_pubcamt - temp;
		//연간게재누적현황 
		int gridData4 = rx.add(resData, "gridData4", "");
		
		for(int i = 0; i < ds.curlist5.size(); i++) {
			AD_BAS_2510_LCURLIST5Record rec = (AD_BAS_2510_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(gridData4, "record", "");
			
			rx.add(record, "pubc_dt", rec.pubc_dt+"년"); 	//구분 
			rx.add(record, "pubc_cnt", rec.pubc_cnt);		//게재일수 
			rx.add(record, "issu_side", rec.issu_side);		//발행면수 
			rx.add(record, "addn", rec.addn);			    //광고단수 
			rx.add(record, "side_avg", tot_pubcamt / StringUtil.toLong(rec.issu_side));		//면당평균 
			rx.add(record, "dn_avg", tot_pubcamt / StringUtil.toDouble(rec.addn));			//단당평균 
			rx.add(record, "cm_amt", (pubcamt/StringUtil.toDouble(rec.addn)) / 37 );			//cm 당 단가 
			
		}
		
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "yyyymm", ds.yyyymm);
		rx.add(resForm, "yyyymm2", ds.yyyymm2);
		
		
	}
	catch (Exception e) {
		System.out.println(e.getMessage());			
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
