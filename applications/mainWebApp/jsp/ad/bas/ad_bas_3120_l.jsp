<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_bas_3110_l.jsp
* 기능 : 
* 작성일자 : 2009-02-17
* 작성자 : 김상훈
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3120_LDataSet ds = (AD_BAS_3120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData    = rx.add(root, "resData2", "");
	try{
	
		int gridData1  = rx.add(resData, "gridData1", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_BAS_3120_LCURLIST1Record rec = (AD_BAS_3120_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "tot_pcnt", rec.tot_pcnt); 
			rx.add(record, "tot_cell", DigitUtil.cutUnderPoint(rec.tot_cell,1));
			rx.add(record, "clr_cell", DigitUtil.cutUnderPoint(rec.clr_cell,1));  
			rx.add(record, "asum_pubc_amt", rec.asum_pubc_amt);
			rx.add(record, "advt_ocpy_rate", DigitUtil.cutUnderPoint(rec.advt_ocpy_rate,1)); 
			rx.add(record, "diff_amt", rec.diff_amt);
		}
		
	
		int gridData2  = rx.add(resData, "gridData2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_3120_LCURLIST2Record rec = (AD_BAS_3120_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData2, "record", "");
			
			long tot_date 			= StringUtil.toLong(rec.tot_date);
			long tot_side 			= StringUtil.toLong(rec.tot_side);
			double tot_dn 			= StringUtil.toDouble(rec.tot_dn);
			long tot_advt_fee 		= StringUtil.toLong(rec.tot_advt_fee);
			long avg_daily_fee 		= StringUtil.toLong(rec.avg_daily_fee);
			long avg_side_fee 		= StringUtil.toLong(rec.avg_side_fee);
			long avg_advt_ocpy_rate = StringUtil.toLong(rec.avg_advt_ocpy_rate);
				
			rx.add(record, "lbl", rec.lbl);
			rx.add(record, "tot_date", StringUtil.nvl(rec.tot_date,"0"));
			rx.add(record, "tot_side", StringUtil.nvl(rec.tot_side, "0")); 
			rx.add(record, "tot_dn", DigitUtil.cutUnderPoint(StringUtil.nvl(rec.tot_dn, "0"),1));
			rx.add(record, "tot_advt_fee", StringUtil.nvl(rec.tot_advt_fee, "0"));
			rx.add(record, "avg_daily_fee", StringUtil.nvl(rec.avg_daily_fee, "0")); 
			rx.add(record, "avg_side_fee", StringUtil.nvl(rec.avg_side_fee, "0"));
			rx.add(record, "avg_advt_ocpy_rate", DigitUtil.cutUnderPoint(rec.avg_advt_ocpy_rate, 1));
			
			if(i == ds.curlist2.size()-1){
				AD_BAS_3120_LCURLIST2Record pre_rec = (AD_BAS_3120_LCURLIST2Record)ds.curlist2.get(i-1);
				
				long pre_tot_date 			= StringUtil.toLong(pre_rec.tot_date);
				long pre_tot_side 			= StringUtil.toLong(pre_rec.tot_side);
				double pre_tot_dn 			= StringUtil.toDouble(pre_rec.tot_dn);
				long pre_tot_advt_fee 		= StringUtil.toLong(pre_rec.tot_advt_fee);
				long pre_avg_daily_fee 		= StringUtil.toLong(pre_rec.avg_daily_fee);
				long pre_avg_side_fee 		= StringUtil.toLong(pre_rec.avg_side_fee);
				long pre_avg_advt_ocpy_rate = StringUtil.toLong(pre_rec.avg_advt_ocpy_rate);
							
				record = rx.add(gridData2, "record", "");
				
				rx.add(record, "lbl", "증감수치");
				rx.add(record, "tot_date", 			pre_tot_date-tot_date);
				rx.add(record, "tot_side", 			pre_tot_side-tot_side);
				rx.add(record, "tot_dn",   			pre_tot_dn-tot_dn);
				rx.add(record, "tot_advt_fee", 		pre_tot_advt_fee-tot_advt_fee);
				rx.add(record, "avg_daily_fee", 	pre_avg_daily_fee-avg_daily_fee);
				rx.add(record, "avg_side_fee", 		pre_avg_side_fee-avg_side_fee);
				rx.add(record, "avg_advt_ocpy_rate",DigitUtil.cutUnderPoint(pre_avg_advt_ocpy_rate-avg_advt_ocpy_rate,1));
				
				double r_tot_date 				= tot_date == 0 ? 100 : ((double)(pre_tot_date-tot_date)/(double)tot_date) * 100;
				double r_tot_side 				= tot_side == 0 ? 100 : ((double)(pre_tot_side-tot_side)/(double)tot_side) * 100;
				double r_tot_dn 	    		= tot_dn == 0 ? 100 : ((double)(pre_tot_dn-tot_dn)/(double)tot_dn) * 100;
				double r_tot_advt_fee   		= tot_advt_fee == 0 ? 100 : ((double)(pre_tot_advt_fee-tot_advt_fee)/(double)tot_advt_fee) * 100;
				double r_avg_daily_fee  	 	= avg_daily_fee == 0 ? 100 : ((double)(pre_avg_daily_fee-avg_daily_fee)/(double)avg_daily_fee) * 100;
				double r_avg_side_fee   		= avg_side_fee == 0 ? 100 : ((double)(pre_avg_side_fee-avg_side_fee)/(double)avg_side_fee) * 100;
				double r_avg_advt_ocpy_rate   	= avg_advt_ocpy_rate == 0 ? 100 : ((double)(pre_avg_advt_ocpy_rate-avg_advt_ocpy_rate)/(double)avg_advt_ocpy_rate) * 100;

				record = rx.add(gridData2, "record", "");
				
				rx.add(record, "lbl", "증감비율(%)");
				rx.add(record, "tot_date", DigitUtil.cutUnderPoint(r_tot_date,0));
				rx.add(record, "tot_side", DigitUtil.cutUnderPoint(r_tot_side,0));
				rx.add(record, "tot_dn", DigitUtil.cutUnderPoint(r_tot_dn,0));
				rx.add(record, "tot_advt_fee", DigitUtil.cutUnderPoint(r_tot_advt_fee,0));
				rx.add(record, "avg_daily_fee", DigitUtil.cutUnderPoint(r_avg_daily_fee,0));
				rx.add(record, "avg_side_fee", DigitUtil.cutUnderPoint(r_avg_side_fee,0));
				rx.add(record, "avg_advt_ocpy_rate", DigitUtil.cutUnderPoint(r_avg_advt_ocpy_rate,0));

					
			}
		}
		
	} catch (Exception e) {
		System.out.println("error = " + e.getLocalizedMessage());
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

