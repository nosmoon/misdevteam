<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
				,chosun.ciis.ad.bas.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1920_SDataSet ds = (AD_BAS_1920_SDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int resForm   	= rx.add(root, "resForm", "");

	try {						
		
		int diary  = rx.add(resForm, "diary", "");
		rx.add(diary, "diary_titl",             ds.diary_titl);                   
		rx.add(diary, "make_dt",               	ds.make_dt);                   
		rx.add(diary, "make_pers",              ds.make_pers);                   
		rx.add(diary, "make_pers_nm",           ds.make_pers_nm);                   
		rx.add(diary, "dlco_no",           		ds.dlco_no);                       
		rx.add(diary, "dlco_nm",                ds.dlco_nm);               
		rx.addCData(diary, "diary_cont",        ds.diary_cont.replaceAll("&amp;","&"));                
		rx.add(diary, "opn",                  	ds.opn);               
		rx.add(diary, "chg_dt_tm",             	ds.chg_dt_tm);               
		rx.add(diary, "chg_pers",  				ds.chg_pers);  
				
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
