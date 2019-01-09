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
	//입금현황-관리담당별 
	RwXml rx = new RwXml();
	AD_DEP_2330_LDataSet ds = (AD_DEP_2330_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData3 = rx.add(root, "resData3", "");
	int gridData = rx.add(resData3, "gridData", "");

	try {  
		
		long sub_pubc_amt   	= 0;		//게재액소계
		long sub_rcpm_amt   	= 0;   		//일입금액소계
		long sub_tot_rcpm_amt  	= 0;   		//입금소계
		long sub_jan_amt        = 0;		//잔액소계
		double sub_avg_amt  	= 0.00d;    //입금율소계
		
		String pre_mchrg_pers_nm = "";		//담당자
		
		
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_2330_LCURLISTRecord rec = (AD_DEP_2330_LCURLISTRecord)ds.curlist.get(i);
			
			
			if(i >0 && !pre_mchrg_pers_nm.equals(rec.mchrg_pers)){
				
				if(0 != sub_pubc_amt){
					sub_avg_amt = ((double)sub_tot_rcpm_amt/(double)sub_pubc_amt)*100;
				}
				
				int record = rx.add(gridData, "record", "");
				
				rx.add(record, "mchrg_pers", 	pre_mchrg_pers_nm);
				rx.add(record, "medi_nm", 		"소계");
				rx.add(record, "pubc_amt",	 	sub_pubc_amt);
				rx.add(record, "rcpm_amt",	 	sub_rcpm_amt);
				rx.add(record, "tot_rcpm_amt",	sub_tot_rcpm_amt);			
				rx.add(record, "jan_amt",		sub_jan_amt);			
				rx.add(record, "avg_amt",		sub_avg_amt == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(sub_avg_amt,2));	
				
				sub_pubc_amt   		= 0;
				sub_rcpm_amt   		= 0;
				sub_tot_rcpm_amt  	= 0; 
				sub_jan_amt         = 0;
				sub_avg_amt  		= 0.00d;
			}
			
			int record = rx.add(gridData, "record", "");
			
			long jan_amt   = 0;
			double avg_amt = 0.00d;
			
			//잔액=게재액-입금누계
			jan_amt = StringUtil.toLong(rec.pubc_amt) -  StringUtil.toLong(rec.tot_rcpm_amt);
			//입금율=(입금누계/게재액)*100
			if(StringUtil.toLong(rec.pubc_amt) != 0){
	   		    avg_amt = StringUtil.toDouble(rec.tot_rcpm_amt)/StringUtil.toLong(rec.pubc_amt)*100;
	   		}
			
			rx.add(record, "mchrg_pers", 	rec.mchrg_pers);
			rx.add(record, "medi_nm", 	 	rec.medi_nm);
			rx.add(record, "pubc_amt",	 	rec.pubc_amt);
			rx.add(record, "rcpm_amt",	 	rec.rcpm_amt);
			rx.add(record, "tot_rcpm_amt",	rec.tot_rcpm_amt);			
			rx.add(record, "jan_amt",		jan_amt);			
			rx.add(record, "avg_amt",		avg_amt == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_amt,2));		
			
			
			
			
			//소계계산 
			sub_pubc_amt  	 += StringUtil.toLong(rec.pubc_amt);
			sub_rcpm_amt  	 += StringUtil.toLong(rec.rcpm_amt);
			sub_tot_rcpm_amt += StringUtil.toLong(rec.tot_rcpm_amt);
			sub_jan_amt      += jan_amt;
			
			
			pre_mchrg_pers_nm = rec.mchrg_pers;
			
		}
		
		if(0 != sub_pubc_amt){
			sub_avg_amt = ((double)sub_tot_rcpm_amt/(double)sub_pubc_amt)*100;
		}
		
		int record2 = rx.add(gridData, "record", "");
		
		rx.add(record2, "mchrg_pers", 	 pre_mchrg_pers_nm);
		rx.add(record2, "medi_nm"   ,    "소계");
		rx.add(record2, "pubc_amt",      0 == sub_pubc_amt ? "0" : String.valueOf(sub_pubc_amt));
		rx.add(record2, "rcpm_amt",      0 == sub_rcpm_amt ? "0" : String.valueOf(sub_rcpm_amt));
		rx.add(record2, "tot_rcpm_amt",  0 == sub_tot_rcpm_amt ? "0" : String.valueOf(sub_tot_rcpm_amt));
		rx.add(record2,  "jan_amt",		 0 == sub_jan_amt ? "0" : String.valueOf(sub_jan_amt));
		rx.add(record2, "avg_amt",       0.0 == sub_avg_amt ? "0.00%" : DigitUtil.cutUnderPoint(sub_avg_amt,2));
		
		
		//합계	
		for(int i = 0; i<ds.curlist2.size(); i++) {
			AD_DEP_2330_LCURLIST2Record rec = (AD_DEP_2330_LCURLIST2Record)ds.curlist2.get(i);

			int record = rx.add(gridData, "record", "");
			
			long jan_amt   = 0;
			double avg_amt = 0.00d;
			
			//잔액=게재액-입금누계
			jan_amt = StringUtil.toLong(rec.pubc_amt) -  StringUtil.toLong(rec.tot_rcpm_amt);
			//입금율=(입금누계/게재액)*100
			if(StringUtil.toLong(rec.pubc_amt) != 0){
	   		    avg_amt = StringUtil.toDouble(rec.tot_rcpm_amt)/StringUtil.toLong(rec.pubc_amt)*100;
	   		}
			
			rx.add(record, "mchrg_pers", 	"합계");
			rx.add(record, "medi_nm", 	 	rec.medi_nm);
			rx.add(record, "pubc_amt",	 	rec.pubc_amt);
			rx.add(record, "rcpm_amt",	 	rec.rcpm_amt);
			rx.add(record, "tot_rcpm_amt",	rec.tot_rcpm_amt);			
			rx.add(record, "jan_amt",		jan_amt);			
			rx.add(record, "avg_amt",		avg_amt == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_amt,2));		
		}
		
		int resForm = rx.add(resData3, "resForm", "");
		
		rx.add(resForm, "start_dt", ds.start_dt);  //금월시작일자 
		rx.add(resForm, "pubc_dt", ds.pubc_dt);    //게재년월
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
