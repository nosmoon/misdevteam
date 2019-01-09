<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.brn.rec.*
				,chosun.ciis.ad.brn.ds.*
				,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BRN_1715_SDataSet ds = (AD_BRN_1715_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = rx.add( root , "formData" , "");

	try {
		rx.add(formData, "job_clsf", ds.job_clsf);
		rx.add(formData, "cntc_seq", ds.cntc_seq);
		rx.add(formData, "cont", ds.cont);
		rx.add(formData, "rmsg_seq", ds.rmsg_seq);
		rx.add(formData, "answer_cont", ds.answer_cont);
		rx.add(formData, "answer_dt", ds.answer_cont);
		rx.add(formData, "add_file_nm", ds.add_file_nm);
	}
	catch (Exception e) {
	}  
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
