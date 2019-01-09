<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.co.job.rec.*
			    ,chosun.ciis.co.job.ds.*
			    ,chosun.ciis.co.base.util.*
			    ,somo.framework.util.* " %>
			    
<%
	
	RwXml rx = new RwXml();
	CO_JOB_1025_LDataSet ds = (CO_JOB_1025_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int replyGridData = rx.add( root , "replyGridData" , "");

	try {

		/****** CURLIST BEGIN */ 
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_JOB_1025_LCURLISTRecord rec = (CO_JOB_1025_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(replyGridData, "record", "");
	
			rx.add(record, "team_nm", rec.team_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "rmsg_pers_nm", rec.rmsg_pers_nm);
			rx.add(record, "answer_cont", rec.answer_cont);
			rx.add(record, "add_file_nm", rec.add_file_nm);
			rx.add(record, "answer_dt", rec.answer_dt);
			rx.add(record, "job_clsf", rec.job_clsf);
			rx.add(record, "cntc_seq", rec.cntc_seq);
			rx.add(record, "rmsg_seq", rec.rmsg_seq);
			
		}
		/****** CURLIST END */
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
