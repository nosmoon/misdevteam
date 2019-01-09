<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
				,chosun.ciis.ad.bas.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1820_SDataSet ds = (AD_BAS_1820_SDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int resForm   	= rx.add(root, "resForm", "");

	try {						
		
		int diary   	= rx.add(resForm, "diary", "");
		rx.add(diary, "diary_titl",             ds.diary_titl);                   
		rx.add(diary, "make_dt",               	ds.make_dt);                   
		rx.add(diary, "make_pers",              ds.make_pers);                   
		rx.add(diary, "make_pers_nm",           ds.make_pers_nm);                   
		rx.add(diary, "dlco_no",           		ds.dlco_no);                       
		rx.add(diary, "dlco_nm",                ds.dlco_nm);               
		rx.add(diary, "diary_cont",             ds.diary_cont);                
		rx.add(diary, "opn",                  	ds.opn);                       
		rx.add(diary, "chg_dt_tm",              ds.chg_dt_tm);                       
		rx.add(diary, "chg_pers",              	ds.chg_pers);                
		
		int curlist2   	= rx.add(resForm, "curlist2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1820_SCURLISTRecord rec = (AD_BAS_1820_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist2, "record", "");
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "pay_amt", "0");
			rx.add(record, "cover_note", rec.cover_note);
			rx.add(record, "advcs_note", rec.advcs_note);
			rx.add(record, "dhon_note", rec.dhon_note);
		}
		int curlist3   	= rx.add(resForm, "curlist3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1820_SCURLISTRecord rec = (AD_BAS_1820_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist3, "record", "");
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "mang_mortg_surp_amt", rec.mang_mortg_surp_amt);
			rx.add(record, "busn_mortg_surp_amt", rec.busn_mortg_surp_amt);
			rx.add(record, "dummy", "");
		}		
				
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
