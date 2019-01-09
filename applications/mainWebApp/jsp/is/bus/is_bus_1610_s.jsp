<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bus.rec.*
	,	chosun.ciis.is.bus.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BUS_1610_SDataSet ds = (IS_BUS_1610_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {
		/****** CURLIST_1 BEGIN */
		int gridData1 = rx.add( resData , "gridData1" , "");	
		for(int i = 0; i < ds.curlist_1.size(); i++) {
			IS_BUS_1610_SCURLIST_1Record rec = (IS_BUS_1610_SCURLIST_1Record)ds.curlist_1.get(i);
			int record  	= rx.add( gridData1 , "record" , "");			
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "tgt_amt", rec.tgt_amt);
			rx.add(record, "rst_amt", rec.rst_amt);
			//rx.add(record, "dm_rate", rec.dm_rate);
			rx.add(record, "dm_rate", DigitUtil.cutUnderPoint(rec.dm_rate,2));
			rx.add(record, "tgt_amt_1", rec.tgt_amt_1);
			rx.add(record, "rst_amt_1", rec.rst_amt_1);
			//rx.add(record, "dm_rate_1", rec.dm_rate_1);
			rx.add(record, "dm_rate_1", DigitUtil.cutUnderPoint(rec.dm_rate_1,2));
			rx.add(record, "rst_amt_2", rec.rst_amt_2);
			rx.add(record, "rst_amt_3", rec.rst_amt_3);
			rx.add(record, "tgt_amt_s", rec.tgt_amt_s);
			rx.add(record, "rst_amt_s", rec.rst_amt_s);
			//rx.add(record, "dm_rate_s", rec.dm_rate_s);
			rx.add(record, "dm_rate_s", DigitUtil.cutUnderPoint(rec.dm_rate_s,2));
		}
		/****** CURLIST_1 END */
		
		/****** CURLIST_2 BEGIN */
		int gridData2 = rx.add( resData , "gridData2" , "");
		for(int i = 0; i < ds.curlist_2.size(); i++) {
			IS_BUS_1610_SCURLIST_2Record rec = (IS_BUS_1610_SCURLIST_2Record)ds.curlist_2.get(i);
			int record  	= rx.add( gridData2 , "record" , "");
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "mi_amt_1", rec.mi_amt_1);
			rx.add(record, "mi_amt_2", rec.mi_amt_2);
			rx.add(record, "mi_amt_3", rec.mi_amt_3);
			rx.add(record, "mi_amt_4", rec.mi_amt_4);
			rx.add(record, "np_amt", rec.np_amt);
			rx.add(record, "t_amt", rec.t_amt);
		}
		/****** CURLIST_2 END */
		
		/****** CURLIST_3 BEGIN */
		int gridData3 = rx.add( resData , "gridData3" , "");
		for(int i = 0; i < ds.curlist_3.size(); i++) {
			IS_BUS_1610_SCURLIST_3Record rec = (IS_BUS_1610_SCURLIST_3Record)ds.curlist_3.get(i);
			int record  	= rx.add( gridData3 , "record" , "");
			rx.add(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.add(record, "jun_amt_2", rec.jun_amt_2);
			rx.add(record, "dan_amt_1", rec.dan_amt_1);
			//rx.add(record, "icr_rate", rec.icr_rate);
			rx.add(record, "incr_rate", DigitUtil.cutUnderPoint(rec.icr_rate,2));
			rx.add(record, "icr_amt", rec.icr_amt);
		}
		/****** CURLIST_3 END */
		
		/****** CURLIST_4 BEGIN */
		int gridData4 = rx.add( resData , "gridData4" , "");
		for(int i = 0; i < ds.curlist_4.size(); i++) {
			IS_BUS_1610_SCURLIST_4Record rec = (IS_BUS_1610_SCURLIST_4Record)ds.curlist_4.get(i);
			int record  	= rx.add( gridData4 , "record" , "");
			rx.add(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.add(record, "cnt_1", rec.cnt_1);
			rx.add(record, "cnt_2", rec.cnt_2);
			rx.add(record, "cnt_3", rec.cnt_3);
			rx.add(record, "cnt_4", rec.cnt_4);
			rx.add(record, "cnt_t", rec.cnt_t);
			rx.add(record, "per_2", rec.per_2);
			rx.add(record, "per_3", rec.per_3);
			rx.add(record, "per_4", rec.per_4);
			rx.add(record, "minus_3", rec.minus_3);
			rx.add(record, "minus_4", rec.minus_4);
		}
		/****** CURLIST_4 END */		
		
		/****** CURLIST_5 BEGIN */
		int gridData5 = rx.add( resData , "gridData5" , "");
		for(int i = 0; i < ds.curlist_5.size(); i++) {
			IS_BUS_1610_SCURLIST_5Record rec = (IS_BUS_1610_SCURLIST_5Record)ds.curlist_5.get(i);
			int record = rx.add(gridData5, "record", "");
			rx.add(record, "indt_cd_nm", rec.indt_cd_nm);
			rx.add(record, "dan_cnt_1", rec.dan_cnt_1);
			rx.add(record, "dan_amt_1", rec.dan_amt_1);
			rx.add(record, "jun_cnt_2", rec.jun_cnt_2);
			rx.add(record, "jun_amt_2", rec.jun_amt_2);
			//rx.add(record, "incr_rate", rec.incr_rate);
			rx.add(record, "incr_rate", DigitUtil.cutUnderPoint(rec.incr_rate,2));
			rx.add(record, "incr_amt", rec.incr_amt);
		}
		/****** CURLIST_5 END */
		
		/****** CURLIST_6 BEGIN */
		int gridData6 = rx.add( resData , "gridData6" , "");
		for(int i = 0; i < ds.curlist_6.size(); i++) {
			IS_BUS_1610_SCURLIST_6Record rec = (IS_BUS_1610_SCURLIST_6Record)ds.curlist_6.get(i);
			int record = rx.add(gridData6, "record", "");
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "dm_amt_1", rec.dm_amt_1);
		}
		/****** CURLIST_6 END */
		
		rx.add(resData, "vip_busn_acty_rept", ds.vip_busn_acty_rept);
		rx.add(resData, "vip_busn_plan", ds.vip_busn_plan);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
