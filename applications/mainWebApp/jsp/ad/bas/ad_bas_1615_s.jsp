<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1615_SDataSet ds = (AD_BAS_1615_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int diary   = rx.add(root, "diary", "");

	try {
		rx.add(diary, "diary_titl", ds.diary_titl);
		rx.add(diary, "make_pers", ds.make_pers);
		rx.add(diary, "make_dt", ds.make_dt);
		rx.add(diary, "dlco_nm", ds.dlco_nm);
		rx.add(diary, "diary_cont", ds.diary_cont);
		
		int curlist   = rx.add(diary, "curlist", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1615_SCURLISTRecord rec = (AD_BAS_1615_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist, "record", "");
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "make_pers_nm", rec.make_pers_nm);
			rx.add(record, "diary_titl", rec.diary_titl);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "diary_cont", rec.diary_cont);
		}  
				
	}
	catch (Exception e) {
	}
	finally {
//		rx.add(dataSet, "errcode", errcode);
//		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
