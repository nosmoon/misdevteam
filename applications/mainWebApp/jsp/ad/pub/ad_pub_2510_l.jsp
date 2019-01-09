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
	AD_PUB_2510_LDataSet ds = (AD_PUB_2510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2510_LCURLISTRecord rec = (AD_PUB_2510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "pubc_dt",      rec.pubc_dt); 
			rx.add(record, "yoil", 		   rec.yoil);
			rx.add(record, "sect_cd",	   rec.sect_cd);
			rx.addCData(record, "sect_clas_nm", rec.sect_clas_nm);
			rx.addCData(record, "sect_nm", 	   rec.sect_nm);
			rx.add(record, "edt_nm", 	   rec.edt_nm);
			rx.add(record, "clr_advt_fee", rec.clr_advt_fee);
			rx.add(record, "blk_advt_fee", rec.blk_advt_fee);
			rx.add(record, "tot_advt_fee", rec.tot_advt_fee);
			rx.add(record, "issu_dt_cnt",  rec.issu_dt_cnt);
			rx.add(record, "avg_pubc_amt", rec.avg_pubc_amt);
			rx.add(record, "cnt_clr_myun", rec.cnt_clr_myun);
			rx.add(record, "cnt_blk_myun", rec.cnt_blk_myun);
			rx.add(record, "tot_tabl_clsf",rec.tot_tabl_clsf);
			rx.add(record, "tot_dn", 	   rec.tot_dn);
			rx.add(record, "pubc_cnt", 	   rec.pubc_cnt);			
			rx.add(record, "avg_clr_myun", rec.avg_clr_myun);
			rx.add(record, "avg_blk_myun", rec.avg_blk_myum);
			rx.add(record, "avg_tot_myun", rec.avg_tot_myun);
			rx.add(record, "avg_tot_uprc", rec.avg_tot_uprc);
			rx.add(record, "fee",          rec.fee);
			rx.add(record, "coms",         rec.coms);
			rx.add(record, "feecoms",      StringUtil.toLong(rec.fee) + StringUtil.toLong(rec.coms));
		}
		
		if(ds.curlist.size() > 0){
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "pubc_dt",       "");
			rx.add(record, "yoil", 		    "");
			rx.add(record, "sect_cd",       "");
			rx.add(record, "sect_clas_nm",  "ÇÕ °è");
			rx.add(record, "sect_nm", 	    "");
			rx.add(record, "edt_nm", 	    "");
			rx.add(record, "clr_advt_fee",  ds.tot_clr_advt_fee);
			rx.add(record, "blk_advt_fee",  ds.tot_blk_advt_fee);
			rx.add(record, "tot_advt_fee",  ds.tot_tot_advt_fee);
			rx.add(record, "issu_dt_cnt",   ds.tot_issu_dt_cnt );
			rx.add(record, "avg_pubc_amt",  ds.avg_advt_fee);
			rx.add(record, "cnt_clr_myun",  ds.tot_cnt_clr_myun);
			rx.add(record, "cnt_blk_myun",  ds.tot_cnt_blk_myun);
			rx.add(record, "tot_tabl_clsf", ds.tot_tabl_clsf);
			rx.add(record, "tot_dn",        ds.tot_dn);
			rx.add(record, "avg_clr_myun",  ds.avg_clr_advt_fee);
			rx.add(record, "avg_blk_myun",  ds.avg_blk_advt_fee);
			rx.add(record, "avg_tot_myun",  ds.avg_tot_advt_fee);
			rx.add(record, "fee",           ds.tot_fee);
			rx.add(record, "coms",          ds.tot_coms);
			rx.add(record, "feecoms",       StringUtil.toLong(ds.tot_fee) + StringUtil.toLong(ds.tot_coms));
		}
		
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "tot_cnt", "ÃÑ "+ds.curlist.size()+" °Ç"); 
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
