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
	IS_BUS_1020_SDataSet ds = (IS_BUS_1020_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");
	
	try {
		rx.add(resForm, "flag", "U");
		
		/****** CURLIST_A BEGIN */
		int gridData2 = rx.add(resForm, "gridData2", "");

		for(int i = 0; i < ds.curlist_a.size(); i++) {
			IS_BUS_1020_SCURLIST_ARecord rec = (IS_BUS_1020_SCURLIST_ARecord)ds.curlist_a.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "a_decid_pre_seq", rec.a_decid_pre_seq);
			rx.add(record, "a_decid_pers", rec.a_decid_pers);
			rx.add(record, "a_decid_pers_nm", rec.a_decid_pers_nm);
			rx.add(record, "a_decid_pers_dty_cd", rec.a_decid_pers_dty_cd);
			rx.add(record, "a_decid_pers_dty_cd_nm", rec.a_decid_pers_dty_cd_nm);
			rx.add(record, "a_decid_yn", rec.a_decid_yn);
			rx.add(record, "a_proc_dt", rec.a_proc_dt);
			rx.add(record, "a_ordr_matt", rec.a_ordr_matt);
		}
		/****** CURLIST_A END */
		
		
		/****** CURLIST_B BEGIN */
		int gridData3 = rx.add(resForm, "gridData3", "");
		
		for(int i = 0; i < ds.curlist_b.size(); i++) {
			IS_BUS_1020_SCURLIST_BRecord rec = (IS_BUS_1020_SCURLIST_BRecord)ds.curlist_b.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "b_make_dtls_seq", rec.b_make_dtls_seq);
			rx.add(record, "b_dlco", rec.b_dlco);
			rx.add(record, "b_cns_tm", rec.b_cns_tm);
			rx.add(record, "b_chrg_pers", rec.b_chrg_pers);
			rx.add(record, "b_tel_no", rec.b_tel_no);
			rx.add(record, "b_clsf", rec.b_clsf);
			rx.add(record, "b_vist_purp", rec.b_vist_purp);
			rx.add(record, "b_remk", rec.b_remk);
		}
		/****** CURLIST_B END */
		

		/****** CURLIST_C BEGIN */
		int gridData4 = rx.add(resForm, "gridData4", "");
		
		for(int i = 0; i < ds.curlist_c.size(); i++) {
			IS_BUS_1020_SCURLIST_CRecord rec = (IS_BUS_1020_SCURLIST_CRecord)ds.curlist_c.get(i);
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "c_make_dtls_seq", rec.c_make_dtls_seq);
			rx.add(record, "c_dlco", rec.c_dlco);
			rx.add(record, "c_cns_tm", rec.c_cns_tm);
			rx.add(record, "c_chrg_pers", rec.c_chrg_pers);
			rx.add(record, "c_tel_no", rec.c_tel_no);
			rx.add(record, "c_clsf", rec.c_clsf);
			rx.add(record, "c_vist_purp", rec.c_vist_purp);
			rx.add(record, "c_remk", rec.c_remk);
		}
		/****** CURLIST_C END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
