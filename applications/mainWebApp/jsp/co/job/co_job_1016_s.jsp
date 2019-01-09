<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.co.job.rec.*,chosun.ciis.co.job.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	CO_JOB_1016_SDataSet ds = (CO_JOB_1016_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = rx.add( root , "formData" , "");

	try {
		rx.add(formData, "job_clsf", ds.job_clsf);
		rx.add(formData, "cntc_seq", ds.cntc_seq);
		rx.add(formData, "cont", ds.cont);
	}
	catch (Exception e) {
	}  
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
