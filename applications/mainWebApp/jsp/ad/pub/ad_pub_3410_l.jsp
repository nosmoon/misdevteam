<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
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
	AD_PUB_3410_LDataSet ds = (AD_PUB_3410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
//	int resData = rx.add(root, "resData", "");
	int resData = rx.add(root, "tempData", "");	
	
	try {
		int resForm = rx.add(resData, "resForm", "");				
		rx.add(resForm, "podr_occr_dt",ds.podr_occr_dt);
		rx.add(resForm, "podr_occr_seq", ds.podr_occr_seq);
		rx.add(resForm, "proc_dt",ds.podr_occr_dt);
		rx.add(resForm, "proc_seq", ds.podr_occr_seq);		
		rx.add(resForm, "medi_cd", "570");		
		rx.add(resForm, "podr_dt", ds.podr_dt);
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.addCData(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "expct_amt", ds.expct_amt);
		rx.add(resForm, "slcrg_pers", ds.slcrg_pers);
		rx.add(resForm, "slcrg_pers_nm", ds.slcrg_pers_nm);
		rx.add(resForm, "dept_cd", ds.dept_cd);
		rx.add(resForm, "dept_nm", ds.dept_nm);
		rx.add(resForm, "mchrg_pers", ds.mchrg_pers);
		rx.add(resForm, "mchrg_pers_nm", ds.mchrg_pers_nm);
		rx.add(resForm, "pre_podr_slip_no", ds.pre_podr_slip_no);
		rx.add(resForm, "upd_yn", ds.upd_yn);
		rx.add(resForm, "clos_stat", ds.clos_stat);
		rx.add(resForm, "seq_clsf", ds.seq_clsf);	
		rx.add(resForm, "flag", "");
		rx.add(resForm, "multiUpdateData", "");
		rx.add(resForm, "multiUpdateData2", "");				

		int gridData1 = rx.add(resData, "gridData1", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3410_LCURLISTRecord rec = (AD_PUB_3410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "select", "N");			
			rx.add(record, "upd_select", "N");	
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "arow", rec.occr_arow);
			rx.add(record, "spl_dlco", rec.spl_dlco);
			rx.add(record, "brnd_cd", rec.brnd_cd);
			rx.addCData(record, "item_nm", rec.item_nm);
			rx.add(record, "podr_cnt", rec.podr_cnt);
			rx.add(record, "podr_uprc", rec.podr_uprc);
			rx.add(record, "podr_amt", rec.podr_amt);
			rx.add(record, "uprc_fee", rec.uprc_fee);
			rx.add(record, "mms_uprc", rec.mms_uprc);
			rx.add(record, "mms_cnt", rec.mms_cnt);
			rx.add(record, "mms_fee", rec.mms_fee);
			rx.add(record, "mms_vat", rec.mms_vat);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "exct_yn", rec.exct_yn);
			rx.add(record, "clamt_stat", rec.clamt_stat);
			rx.add(record, "expct_amt", rec.expct_amt);
		}
		
		int gridData2 = rx.add(resData, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_3410_LCURLIST2Record rec = (AD_PUB_3410_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "select", "N");			
			rx.add(record, "sale_stmt_issu_yn", rec.sale_stmt_issu_yn);
			rx.add(record, "exct_dt", rec.exct_dt);
			rx.add(record, "exct_seq", rec.exct_seq);
			rx.add(record, "spl_dlco", rec.spl_dlco);
			rx.add(record, "brnd_cd", rec.brnd_cd);
			rx.addCData(record, "item_nm", rec.item_nm);
			rx.add(record, "fee_rate", rec.fee_rate);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "fee_vat", rec.fee_vat);
			rx.add(record, "tot_fee", rec.tot_fee);
			rx.add(record, "exct_uprc", rec.exct_uprc);
			rx.add(record, "exct_cnt", rec.exct_cnt);
			rx.add(record, "exct_amt", rec.exct_amt);
			rx.add(record, "easy_amt", rec.easy_amt);
			rx.add(record, "cntrct_yn", rec.cntrct_yn);
			rx.add(record, "clos_stat", rec.clos_stat);
			rx.add(record, "easy_yn", rec.easy_yn);
			rx.add(record, "podr_slip_no", rec.podr_slip_no);	
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "uprc_fee", rec.uprc_fee);		
		}		
				
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
