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
	IS_BUS_1310_LDataSet ds = (IS_BUS_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {
		/****** CURLIST_A BEGIN */
		int gridData1 = rx.add( resData , "gridData1" , "");
		for(int i = 0; i < ds.curlist_a.size(); i++) {
			IS_BUS_1310_LCURLIST_ARecord rec = (IS_BUS_1310_LCURLIST_ARecord)ds.curlist_a.get(i);
			int record  	= rx.add( gridData1 , "record" , "");		
			rx.add(record, "kind", rec.kind);
			rx.add(record, "kind_nm", rec.kind_nm);
			rx.add(record, "d_tgt_amt", rec.d_tgt_amt);
			rx.add(record, "d_rst_amt", rec.d_rst_amt);
			//rx.add(record, "d_rate", rec.d_rate);
			rx.add(record, "d_rate", DigitUtil.cutUnderPoint(rec.d_rate,2));
			rx.add(record, "j_rst_amt", rec.j_rst_amt);
			//rx.add(record, "j_rate", rec.j_rate);
			rx.add(record, "j_rate", DigitUtil.cutUnderPoint(rec.j_rate,2));
			
		}
		/****** CURLIST_A END */
		
		/****** CURLIST_B BEGIN */
		int gridData2 = rx.add( resData , "gridData2" , "");
		for(int i = 0; i < ds.curlist_b.size(); i++) {
			IS_BUS_1310_LCURLIST_BRecord rec = (IS_BUS_1310_LCURLIST_BRecord)ds.curlist_b.get(i);
			int record  	= rx.add( gridData2 , "record" , "");
			rx.add(record, "sub_dept_cd", rec.sub_dept_cd);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "dm_tgt_amt", rec.dm_tgt_amt);
			rx.add(record, "dw_rst_amt", rec.dw_rst_amt);
			rx.add(record, "dm_rst_amt", rec.dm_rst_amt);
			rx.add(record, "dm_tgt_amt2", rec.dm_tgt_amt2);
			rx.add(record, "dw_rst_amt2", rec.dw_rst_amt2);
		}
		/****** CURLIST_B END */

		/****** CURLIST_C BEGIN */
		int gridData3 = rx.add( resData , "gridData3" , "");
		for(int i = 0; i < ds.curlist_c.size(); i++) {
			IS_BUS_1310_LCURLIST_CRecord rec = (IS_BUS_1310_LCURLIST_CRecord)ds.curlist_c.get(i);
			int record  	= rx.add( gridData3 , "record" , "");
			rx.add(record, "mi_amt_1", rec.mi_amt_1);
			rx.add(record, "mi_amt_2", rec.mi_amt_2);
			rx.add(record, "mi_amt_3", rec.mi_amt_3);
			rx.add(record, "mi_amt_t", rec.mi_amt_t);
		}
		/****** CURLIST_C END */
		
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
