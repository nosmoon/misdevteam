<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1512_LDataSet ds = (AD_BAS_1512_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist5 = rx.add(root, "curlist5", "");

	try {
		//정보사항 
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1512_LCURLISTRecord rec = (AD_BAS_1512_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist5, "record", "");
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "patr_chrg_pers", rec.patr_chrg_pers);
			rx.addCData(record, "titl", rec.titl);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "chrg_chf_yn", rec.chrg_chf_yn);			
			rx.add(record, "team_chf_yn", rec.team_chf_yn);
			rx.add(record, "hdqt_chf_yn", rec.hdqt_chf_yn);
			rx.add(record, "add_file_nm", rec.add_file_nm);  
			rx.add(record, "add_file_no", rec.add_file_no);
			rx.add(record, "rept_no", rec.rept_no);
		}  
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
