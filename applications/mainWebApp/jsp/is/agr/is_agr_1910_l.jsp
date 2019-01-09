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
	IS_AGR_1910_LDataSet ds = (IS_AGR_1910_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;

	formData				= rx.add(root	, "rowInfo"		, "");
	try {
		rx.add(formData		, "rownum"		, ds.rownum	);
	
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>