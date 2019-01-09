<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.co.job.rec.*,chosun.ciis.co.job.ds.*, somo.framework.util.* " %>

<%
	CO_JOB_1010_LDataSet ds = (CO_JOB_1010_LDataSet)request.getAttribute("ds");
	
	RwXml rx = new RwXml();         // XML 객체 생성 
	
	int root     = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {

			CO_JOB_1010_LCURLISTRecord rec = (CO_JOB_1010_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			rx.add(record, "wr_clsf_nm", "W".equals(rec.wr_clsf) ? "지시": "수신");
			rx.addCData(record, "titl", rec.titl);			
			rx.add(record, "answer_yn", rec.answer_yn);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "make_pers", rec.make_pers);
			rx.add(record, "rmsg_cnt", rec.rmsg_cnt);
			rx.add(record, "answer_cnt", rec.answer_cnt);
			rx.add(record, "add_file_nm",  rec.add_file_nm);
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
