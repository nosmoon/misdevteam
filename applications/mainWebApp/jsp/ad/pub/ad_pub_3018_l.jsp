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
	AD_PUB_3018_LDataSet ds = (AD_PUB_3018_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
//	int resData = rx.add(root, "resData", "");
	int resData = rx.add(root, "tempGridData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	long tot_advt_fee_1	= 0;
	long tot_advt_fee_2	= 0;
	long tot_advt_fee_3	= 0;
	
	long tot_cnt_1      = 0;
	long tot_cnt_2    	= 0;
	long tot_cnt_3	    = 0;
	
	
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3018_LCURLISTRecord rec = (AD_PUB_3018_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "cslcrg_pers"		, rec.cslcrg_pers);
			rx.add(record, "cslcrg_pers_nm"		, rec.cslcrg_pers_nm);

			rx.add(record, "advt_fee_1"		, rec.advt_fee_1);
			rx.add(record, "vat_1"			, rec.vat_1);
			rx.add(record, "pubc_tot_amt_1"	, rec.pubc_tot_amt_1);
			rx.add(record, "cnt_1"			, rec.cnt_1);
			
			rx.add(record, "advt_fee_2"		, rec.advt_fee_2);
			rx.add(record, "vat_2"			, rec.vat_2);
			rx.add(record, "pubc_tot_amt_2"	, rec.pubc_tot_amt_2);
			rx.add(record, "cnt_2"			, rec.cnt_2);
			
			rx.add(record, "advt_fee_3"		, rec.advt_fee_3);
			rx.add(record, "vat_3"			, rec.vat_3);
			rx.add(record, "pubc_tot_amt_3"	, rec.pubc_tot_amt_3);
			rx.add(record, "cnt_3"			, rec.cnt_3);

			rx.add(record, "diff_1"			, rec.diff_1);
			rx.add(record, "diff_2"			, rec.diff_2);
			rx.add(record, "diff_ratio_1"	, rec.diff_ratio_1);
			rx.add(record, "diff_ratio_2"	, rec.diff_ratio_2);
			rx.add(record, "max_pubc_dt"	, rec.max_pubc_dt);
			
			tot_advt_fee_1 += StringUtil.toLong(rec.advt_fee_1);
			tot_advt_fee_2 += StringUtil.toLong(rec.advt_fee_2);
			tot_advt_fee_3 += StringUtil.toLong(rec.advt_fee_3);

			tot_cnt_1 += StringUtil.toLong(rec.cnt_1);
			tot_cnt_2 += StringUtil.toLong(rec.cnt_2);
			tot_cnt_3 += StringUtil.toLong(rec.cnt_3);
		}
		
		int totData = rx.add(resData, "totData", "");
		
		rx.add(totData, "tot_advt_fee_1", tot_advt_fee_1 ); 
		rx.add(totData, "tot_advt_fee_2", tot_advt_fee_2 ); 
		rx.add(totData, "tot_advt_fee_3", tot_advt_fee_3 ); 
		
		rx.add(totData, "tot_cnt_1", tot_cnt_1 ); 
		rx.add(totData, "tot_cnt_2", tot_cnt_2 ); 
		rx.add(totData, "tot_cnt_3", tot_cnt_3 ); 
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
