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
	AD_PUB_2311_LDataSet ds = (AD_PUB_2311_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2311_LCURLISTRecord rec = (AD_PUB_2311_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record2", "");
			
			rx.add(record, "sale_stmt_issu_yn", rec.sale_stmt_issu_yn);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "medi_nm", rec.medi_nm);
			if("Y".equals(rec.advt_clsf)){
				rx.add(record, "advt_clsf"			, "협찬");
			}else{
				rx.add(record, "advt_clsf"			, "일반");
			}				
			rx.add(record, "publ_std", rec.publ_std);
			rx.add(record, "issu_ser_no", rec.issu_ser_no);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);
			rx.add(record, "mchrg_nm", rec.mchrg_nm);
			rx.add(record, "patr_chrg_info", rec.patr_chrg_info);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "agn", rec.agn);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "tot_rcpm_amt", rec.tot_rcpm_amt);
			rx.add(record, "misu_tot_amt", rec.misu_tot_amt);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "tax_email", rec.tax_email);
			if("1".equals(rec.tax_clsf)){
				rx.add(record, "tax_clsf"			, "광고주");
			}
			else if("2".equals(rec.tax_clsf)){
				rx.add(record, "tax_clsf"			, "대행사");
			}
			else if("4".equals(rec.tax_clsf)){
				rx.add(record, "tax_clsf"			, "위수탁");
			}	
			else{
				rx.add(record, "tax_clsf"			, "");				
			}
			rx.add(record, "notaxrate_data_get_dt", rec.notaxrate_data_get_dt);
			rx.add(record, "exrate", DigitUtil.cutUnderPoint(rec.exrate,4));  //소수점 4자리까지 표현 
			rx.add(record, "mony_kind", rec.mony_kind);
			rx.add(record, "frex_cntr_amt", rec.frex_cntr_amt);
			
		}
	
		int resForm = rx.add(resData, "resForm2", "");
		
		rx.add(resForm, "tot_adv_amt", ds.tot_adv_amt );
		rx.add(resForm, "tot_fee_amt", ds.tot_fee_amt );
     	rx.add(resForm, "tot_vat_amt", ds.tot_vat_amt );
		rx.add(resForm, "tot_misu_amt", ds.tot_misu_amt );
	    rx.add(resForm, "tot_pubc", ds.tot_pubc ); 
	    
	    rx.add(resForm, "tot_adv_amt2", ds.tot_adv_amt2 ); 
		rx.add(resForm, "tot_fee_amt2", ds.tot_fee_amt2 );
     	rx.add(resForm, "tot_vat_amt2", ds.tot_vat_amt2 );
		rx.add(resForm, "tot_misu_amt2", ds.tot_misu_amt2 );
	    rx.add(resForm, "tot_pubc2", ds.tot_pubc2 ); 
	    
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
