<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.brn.rec.*,chosun.ciis.ad.brn.ds.*, somo.framework.util.* " %>

<%
	AD_BRN_1710_LDataSet ds = (AD_BRN_1710_LDataSet)request.getAttribute("ds");
	
	RwXml rx = new RwXml();         // XML °´Ã¼ »ý¼º 
	
	int root     = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {

			AD_BRN_1710_LCURLISTRecord rec = (AD_BRN_1710_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			rx.add(record, "titl", rec.titl);			
			rx.add(record, "answer_yn", rec.answer_yn);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "make_pers", rec.make_pers);
			rx.add(record, "add_file_nm", rec.add_file_nm);
			rx.add(record, "job_clsf", rec.job_clsf);
			rx.add(record, "cntc_seq", rec.cntc_seq);
		}
	}  
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
