<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_2210_LDataSet ds = (AD_PUB_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		//>>월 게재액 
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2210_LCURLISTRecord rec = (AD_PUB_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			int cnt1        = StringUtil.toNumber(rec.cnt1);     
			int cnt2        = StringUtil.toNumber(rec.cnt2); 
			long trgtamt1   = StringUtil.toLong(rec.trgtamt1); 
			long pubcamt2   = StringUtil.toLong(rec.pubcamt2);  
			double avg1     = 0.00d;
			double avg2     = 0.00d;
			
			if(cnt1 != 0){
				avg1 = trgtamt1 / cnt1;
			}
			if(cnt2 != 0){	
				avg2 = pubcamt2 / cnt2; 
			}
			rx.add(record, "cnt1", rec.cnt1);   							//입력일의 개재일 
			rx.add(record, "trgtamt1", DigitUtil.nf_format(rec.trgtamt1)); 	//입력일의  목표액 (결과를 콤마 붙여서 넘긴다)
			rx.add(record, "pubcamt1", DigitUtil.cutUnderPoint(avg1,1)); 	//입력일의 일평균액 (소주첫째자리에서반올림) 
			
			rx.add(record, "cnt2", rec.cnt2);   							//입력일의 전년 개재일			
			rx.add(record, "trgtamt2", DigitUtil.nf_format(rec.pubcamt2)); 	//입력일의 전년 게재액 (결과를 콤마 붙여서 넘긴다)			
			rx.add(record, "pubcamt2", DigitUtil.cutUnderPoint(avg2,1)); 	//입력일의 전년 일평균액 (소주첫째자리에서반올림) 		

		}
		
		
		//주간게재액 
		for(int i = 0; i < 7; i++) {
			AD_PUB_2210_LCURLIST2Record rec = (AD_PUB_2210_LCURLIST2Record)ds.curlist2.get(i);
			int record2 = rx.add(gridData, "record2", "");
			
			rx.add(record2, "dd", rec.dd);
			rx.add(record2, "yoil1", rec.yoil1);  
			rx.add(record2, "pubc_side1", rec.pubc_side1);
			rx.add(record2, "dn1", rec.dn1);
			rx.add(record2, "amt1", rec.amt1);
			
			rx.add(record2, "yoil2", rec.yoil2);
			rx.add(record2, "pubc_side2", rec.pubc_side2);
			rx.add(record2, "dn2", rec.dn2);
			rx.add(record2, "amt2", rec.amt2);

		}
		
		long tot_dn1 			= 0; 		//입력일의 단수 
		long tot_amt1 			= 0;		//입력일의 게재액 
		long tot_pubc_side1 	= 0; 		//입력일의 면당 
		long avg_dn1 		  	= 0; 	   //입력일의년 단수 평균 
		long avg_amt1 	  		= 0;  		//입력일의년 게재액 평균 
		long avg_pubc_side1 	= 0;    	//입력일의 면당 평균 
		
		long tot_dn2 			= 0;		//입력일의 전년 단수 
		long tot_amt2 			= 0;   	 	//입력일의 전년 게재액 
		long tot_pubc_side2 	= 0; 		//입력일의 전년 면당 
		long avg_dn2		  	= 0;    	//입력일의 전년 단수 평균 
		long avg_amt2 	  		= 0;		//입력일의 전년 게재액 평균
		long avg_pubc_side2 	= 0;    	//입력일의 전년 게재액 평균  
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_2210_LCURLIST2Record rec = (AD_PUB_2210_LCURLIST2Record)ds.curlist2.get(i);
			
			tot_dn1  		+= StringUtil.toNumber(rec.dn1);
			tot_amt1 		+= StringUtil.toLong(rec.amt1);
			tot_pubc_side1 	+= StringUtil.toLong(rec.pubc_side1);
			
			tot_dn2 		+= StringUtil.toLong(rec.dn2);
			tot_amt2 		+= StringUtil.toLong(rec.amt2);
			tot_pubc_side2 	+= StringUtil.toLong(rec.pubc_side2); 
		}
		
		avg_dn1     	= tot_dn1  / ds.curlist2.size();  
   	    avg_amt1 		= tot_amt1 / ds.curlist2.size(); System.out.println(avg_amt1+"="+tot_amt1+"/"+ds.curlist2.size());
		avg_dn2    	    = tot_dn2  / ds.curlist2.size();
		avg_amt2 		= tot_amt2 / ds.curlist2.size();
		
		if(tot_pubc_side1 != 0)
			avg_pubc_side1 = tot_amt1 / tot_pubc_side1;
		if(tot_pubc_side2 != 0)
		    avg_pubc_side2 = tot_amt2 / tot_pubc_side2;

		int record2 = rx.add(gridData, "record2", "");
		rx.add(record2, "dd", "계");
		rx.add(record2, "yoil1", "");  
		rx.add(record2, "dn1", tot_dn1);
		rx.add(record2, "amt1", tot_amt1);
		rx.add(record2, "yoil2", "");
		rx.add(record2, "dn2", tot_dn2);
		rx.add(record2, "amt2", tot_amt2);
		
		int record3 = rx.add(gridData, "record2", "");
		rx.add(record3, "dd", "일평균");
		rx.add(record3, "yoil1", "");  
		rx.add(record3, "dn1", avg_dn1);
		rx.add(record3, "amt1", avg_amt1);
		rx.add(record3, "yoil2", "");
		rx.add(record3, "dn2", avg_dn2);
		rx.add(record3, "amt2", avg_amt2);
		
		int record4 = rx.add(gridData, "record2", "");
		rx.add(record4, "dd", "면당");
		rx.add(record4, "yoil1", "");  
		rx.add(record4, "dn1", tot_pubc_side1);
		rx.add(record4, "amt1", avg_pubc_side1);
		rx.add(record4, "yoil2", "");
		rx.add(record4, "dn2", tot_pubc_side2);
		rx.add(record4, "amt2", avg_pubc_side2);		

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
