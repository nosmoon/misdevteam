<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.com.rec.*,chosun.ciis.ad.com.ds.*, somo.framework.util.* " %>

<%
	AD_COM_1010_LDataSet ds = (AD_COM_1010_LDataSet)request.getAttribute("ds");
	
	RwXml rx = new RwXml();         // XML 객체 생성 
	
	int root     = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {

			AD_COM_1010_LCURLISTRecord rec = (AD_COM_1010_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			rx.add(record, "wr_clsf_nm", "W".equals(rec.wr_clsf) ? "작성": "수신");
			rx.add(record, "titl", rec.titl);			
			rx.add(record, "answer_yn", rec.answer_yn);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "make_pers", rec.make_pers);
			rx.add(record, "update", "수정");
			rx.add(record, "job_clsf", rec.job_clsf);
			rx.add(record, "cntc_seq", rec.cntc_seq);
			rx.add(record, "wr_clsf",  rec.wr_clsf);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
