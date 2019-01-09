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
    //입금현황-담당별 
	RwXml rx = new RwXml();
	AD_DEP_2310_LDataSet ds = (AD_DEP_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {  
		
		String gjamt ="";
		String igamt ="";
		String janamt ="";
		String avg_pay = "";
		
		long tot_gjamt   	= 0;		//게재액합계
		long tot_igamt   	= 0;   		//입금액합계
		long tot_janamt  	= 0;   		//잔액합계
		double tot_avg_amt  = 0.00d;   	//입금율합계

		long sub_gjamt   	= 0;		//게재액소계
		long sub_igamt   	= 0;   		//입금액소계
		long sub_janamt  	= 0;   		//잔액소계
		double sub_avg_amt  = 0.00d;    //입금율소계
		
		String pre_mchrg_pers_nm = "";		//담당자 
		
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_2310_LCURLISTRecord rec = (AD_DEP_2310_LCURLISTRecord)ds.curlist.get(i);


			if(i >0 && !pre_mchrg_pers_nm.equals(rec.mchrg_pers_nm)){
				
				if(0 != sub_gjamt){
					sub_avg_amt = ((double)sub_igamt/(double)sub_gjamt)*100;
				}
				
				int record = rx.add(gridData, "record", "");
				
				rx.add(record, "mchrg_pers_nm", pre_mchrg_pers_nm);
				rx.add(record, "pubc_dt", "소계");
				rx.add(record, "gjamt",   0 == sub_gjamt ? "0" : String.valueOf(sub_gjamt));
				rx.add(record, "igamt",   0 == sub_igamt ? "0" : String.valueOf(sub_igamt));
				rx.add(record, "janamt",  0 == sub_janamt ? "0" : String.valueOf(sub_janamt));
				rx.add(record, "avg_pay", 0.0 == sub_avg_amt ? "0.00%" : DigitUtil.cutUnderPoint(sub_avg_amt,2));		
				
				sub_gjamt   = 0;
				sub_igamt   = 0;
				sub_janamt  = 0;
				sub_avg_amt = 0.00d;

			}
			
			if(!"0".equals(rec.gjamt) || !"0".equals(rec.igamt) || !"0".equals(rec.janamt)){
				gjamt = rec.gjamt;
				igamt = rec.igamt;
				janamt = rec.janamt;
				avg_pay = rec.avg_pay+"%";
			}else{
				gjamt = "";
				igamt = "";
				janamt = "";
				avg_pay = "";
			}
			
			
			int record = rx.add(gridData, "record", "");
			rx.add(record, "mchrg_pers_nm", rec.mchrg_pers_nm);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "gjamt",   "".equals(gjamt) ? "" : rec.gjamt);
			rx.add(record, "igamt",   "".equals(igamt) ? "" : rec.igamt);
			rx.add(record, "janamt",  "".equals(janamt) ? "" : rec.janamt);
			rx.add(record, "avg_pay", "".equals(avg_pay) ? "" : DigitUtil.cutUnderPoint(rec.avg_pay,2));		
			
			//합계계산 
			tot_gjamt  += StringUtil.toLong(rec.gjamt);
			tot_igamt  += StringUtil.toLong(rec.igamt);
			tot_janamt += StringUtil.toLong(rec.janamt);
			
			//소계계산 
			sub_gjamt  += StringUtil.toLong(rec.gjamt);
			sub_igamt  += StringUtil.toLong(rec.igamt);
			sub_janamt += StringUtil.toLong(rec.janamt);
			
			pre_mchrg_pers_nm = rec.mchrg_pers_nm;
		}

		if(0 != sub_gjamt){
			sub_avg_amt = ((double)sub_igamt/(double)sub_gjamt)*100;
		}
		
		int record = rx.add(gridData, "record", "");
		
		rx.add(record, "mchrg_pers_nm", pre_mchrg_pers_nm);
		rx.add(record, "pubc_dt", "소계");
		rx.add(record, "gjamt",   0 == sub_gjamt ? "0" : String.valueOf(sub_gjamt));
		rx.add(record, "igamt",   0 == sub_igamt ? "0" : String.valueOf(sub_igamt));
		rx.add(record, "janamt",  0 == sub_janamt ? "0" : String.valueOf(sub_janamt));
		rx.add(record, "avg_pay", 0.0 == sub_avg_amt ? "0.00%" : DigitUtil.cutUnderPoint(sub_avg_amt,2));		
		
		
		if(0 != tot_gjamt){
			tot_avg_amt = ((double)tot_igamt/(double)tot_gjamt)*100;
		}
		
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "tot_gjamt", 0 == tot_gjamt ? "" : String.valueOf(tot_gjamt));
		rx.add(resForm, "tot_igamt", 0 == tot_igamt ? "" : String.valueOf(tot_igamt));
		rx.add(resForm, "tot_janamt", 0 == tot_janamt ? "" : String.valueOf(tot_janamt));
		rx.add(resForm, "tot_avg_pay", 0.0 == tot_avg_amt ? "" : DigitUtil.cutUnderPoint(tot_avg_amt,2));
			
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
