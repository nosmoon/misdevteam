<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	java.text.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>


<%
	
	RwXml rx = new RwXml();
	AD_TAX_1730_LDataSet ds = (AD_TAX_1730_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");
	
	long basi_dt = StringUtil.toLong(ds.basi_dt);

	try {
	  
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_TAX_1730_LCURLISTRecord rec = (AD_TAX_1730_LCURLISTRecord)ds.curlist.get(i);
//			long pay_dt			= StringUtil.toLong(rec.pay_dt);	
	//		if(pay_dt > basi_dt) continue;
						
			//준비대상인 경우 만기일기준 후건은 제외 
			long max_mtry_dt 	= StringUtil.toLong(rec.max_mtry_dt);
			long temp_mtry_dt   = StringUtil.toLong(rec.temp_mtry_dt);
			
			long mtry_dt		= max_mtry_dt >= temp_mtry_dt ?  max_mtry_dt : temp_mtry_dt;
			
	//		long bef_week       = StringUtil.toLong(DateUtil.getDateByGap(-6, "yyyyMMdd", String.valueOf(basi_dt)));
  			
//  			if(max_mtry_dt == 0) continue;
  			
//			if("9".equals(rec.pay_clsf)){
//				if(basi_dt  < max_mtry_dt) continue;							
	//		}
			
			String tmp_pay_clsf	=	StringUtil.nvl(rec.pay_clsf, "0");
			
			String pay_clsf_nm = "";   
			if("7".equals(tmp_pay_clsf)) 		pay_clsf_nm = "준비완료";
			else if("9".equals(tmp_pay_clsf))	pay_clsf_nm = "준비대상";
/*			
			else if("9".equals(tmp_pay_clsf)){ 
				if("".equals(StringUtil.nvl(rec.pay_dt))){
					pay_clsf_nm = "";
				}else{
					pay_clsf_nm = "준비대상";
				}    
			}
*/			
			
			String rcpm_clsf_nm = "";
			if("04".equals(rec.rcpm_clsf)) 		rcpm_clsf_nm = "선수금"; //선수금대체
			else if("06".equals(rec.rcpm_clsf)) rcpm_clsf_nm = "예수금"; //전환금대체
			
			
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "checked", "" );
			rx.add ( record, "pay_clsf_nm", pay_clsf_nm );
			rx.add ( record, "dlco_cd", rec.dlco_cd );
			rx.addCData ( record, "dlco_nm", rec.dlco_nm );
			rx.add ( record, "medi_nm", rec.medi_nm );
			rx.add ( record, "tax_stmt_no", rec.prof_type_cd + rec.slip_clsf_cd + rec.slip_occr_dt + rec.slip_seq );
			rx.add ( record, "make_dt", rec.make_dt );
			rx.add ( record, "rcpm_tot_amt", StringUtil.toNumber(rec.suply_amt) + StringUtil.toNumber(rec.vat_amt));
			rx.add ( record, "rcpm_mtry_dt", rec.temp_mtry_dt );
			rx.add ( record, "rcpm_clsf", rcpm_clsf_nm);   
//			rx.add ( record, "rcpm_clsf", rec.rcpm_clsf);   			
			rx.add ( record, "mtry_dt", mtry_dt);  
			rx.add ( record, "pay_dt", rec.pay_dt );   
			rx.add ( record, "fee_pay_stat", rec.fee_pay_stat );
			rx.add ( record, "pay_clsf", rec.pay_clsf );
		}	  
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>