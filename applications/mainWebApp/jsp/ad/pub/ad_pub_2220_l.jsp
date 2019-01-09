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
	AD_PUB_2220_LDataSet ds = (AD_PUB_2220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2220_LCURLISTRecord rec = (AD_PUB_2220_LCURLISTRecord)ds.curlist.get(i);
			
			//매체코드(본지, 소녀)
			//if("110".equals(rec.medi_cd) || "130".equals(rec.medi_cd)) {
				int record = rx.add(gridData, "record", "");
		
				rx.add(record, "gubn", "당월");	//구분 
				rx.add(record, "medi_nm", rec.medi_nm); //매체
				rx.add(record, "cnt", rec.cnt);	        //일수
				rx.add(record, "damt", rec.damt);		//당년게재액 	
				rx.add(record, "jamt", rec.jamt);		//전년게재액 
				rx.add(record, "jgamt", rec.jgamt);		//전년증감액				
				
				long  jgamt   = StringUtil.toLong(rec.jgamt);
				long  jamt    = StringUtil.toLong(rec.jamt);
				double jgavg   = 0.0d;
				
				//전년게재대비비율 
				if(jgamt == 0 || jamt ==0){
					jgavg = 0;
				}else{
					jgavg = ((double)jgamt / jamt) * 100;
				}
				rx.add(record, "jgavg", jgavg);			//전년게재대비비율 
				
				rx.add(record, "mamt", rec.mamt);	    //목표액
				rx.add(record, "gbamt", rec.gbamt);		//과부족액 
				
				long  damt	 = StringUtil.toLong(rec.damt);
				long  mamt   = StringUtil.toLong(rec.mamt);
				double mavg   = 0.0d;
				
				//목표대비율
				if(damt == 0 || mamt == 0){
					mavg = 0;
				}else{
					mavg = ((double)damt / mamt) * 100;
				}
				rx.add(record, "mavg", mavg);			//목표대비율
			//}	
		}
				
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_2220_LCURLIST2Record rec = (AD_PUB_2220_LCURLIST2Record)ds.curlist2.get(i);
			
			//매체코드(본지, 소녀)
			//if("110".equals(rec.medi_cd) || "130".equals(rec.medi_cd)) {
				int record = rx.add(gridData, "record", "");
				
				rx.add(record, "gubn", "누적");	//구분 
				rx.add(record, "medi_nm", rec.medi_nm); //매체
				rx.add(record, "cnt", rec.cnt);	        //일수
				rx.add(record, "damt", rec.damt);		//당년게재액 	
				rx.add(record, "jamt", rec.jamt);		//전년게재액 
				rx.add(record, "jgamt", rec.jgamt);		//전년증감액

				long  jgamt   = StringUtil.toLong(rec.jgamt);
				long  jamt    = StringUtil.toLong(rec.jamt);
				double jgavg   = 0.0d;
				
				//전년게재대비비율 
				if(jgamt == 0 || jamt ==0){
					jgavg = 0;
				}else{
					jgavg = ((double)jgamt / jamt) * 100;
				}
				rx.add(record, "jgavg", jgavg);			//전년게재대비비율 
				
				rx.add(record, "mamt", rec.mamt);	    //목표액
				rx.add(record, "gbamt", rec.gbamt);		//과부족액 
				
				long  damt	 = StringUtil.toLong(rec.damt);
				long  mamt   = StringUtil.toLong(rec.mamt);
				double mavg   = 0.0d;
				
				//목표대비율
				if(damt == 0 || mamt == 0){
					mavg = 0;
				}else{
					mavg = ((double)damt / mamt) * 100;
				}
				rx.add(record, "mavg", mavg);			//목표대비율
			//}
		}
		
		//연간광고게재현황
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_PUB_2220_LCURLIST3Record rec = (AD_PUB_2220_LCURLIST3Record)ds.curlist3.get(i);
			
			//매체코드(본지, 소녀)
			//if("110".equals(rec.medi_cd) || "130".equals(rec.medi_cd)) {
				int record = rx.add(gridData, "record2", "");				
				
				rx.add(record, "proc_dt", rec.proc_dt);				//게재년도 
				rx.add(record, "medi_nm", rec.medi_nm);             //매체
				rx.add(record, "cnt", rec.cnt);		             	//게재일수 
				rx.add(record, "pubc_side", rec.pubc_side);     	//발행면수 
				rx.add(record, "dn", rec.dn);						//광고단수 
				
				long pubc_side = StringUtil.toLong(rec.pubc_side);
				long pubc_tot_amt = StringUtil.toLong(rec.pubc_tot_amt);
				double avg = 0.0d;
				
				//면당평균 
				if(pubc_side == 0 || pubc_tot_amt == 0){
					avg = 0;
				}else{
					avg = (double)pubc_tot_amt / pubc_side;
				}
				
				long dn = StringUtil.toLong(rec.dn);
				double avg2 = 0.0d;
				
				//단당평균 
				if(dn == 0 || pubc_side == 0){
					avg2 = 0;
				}else{
					avg2 = (double)pubc_tot_amt / dn;
				}
				
				long cm =  StringUtil.toLong(rec.cm);
				long uprc = StringUtil.toLong(rec.uprc);
				double avg3 = 0.0d;
				
				//센티당당가 
				if(cm == 0 || uprc == 0){
					avg3 = 0;
				}else{
					avg3 = (double)uprc / cm;
				}
				rx.add(record, "avg", avg);			//면당평균  
				rx.add(record, "avg2", avg2);		//단당평균 
				rx.add(record, "avg3", avg3);		//센티당단가 
		     //}   
		}	
			
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
