<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_1031_SDataSet ds = (IS_AGR_1031_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "", "");
	
	try {
		int tempData   = rx.add(resData, "tempData", "");
		
		rx.add(tempData, "reg_point_unrcp_pass_dds", ds.reg_point_unrcp_pass_dds);
		rx.add(tempData, "reg_point_unrcp_amt", ds.reg_point_unrcp_amt);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
