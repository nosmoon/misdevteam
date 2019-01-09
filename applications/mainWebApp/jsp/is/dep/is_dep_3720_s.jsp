<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_3720_SDataSet ds = (IS_DEP_3720_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm = rx.add(root, "resForm", "");  

	try {
		rx.add(resForm, "rept_no", ds.rept_no); 
		rx.add(resForm, "chk_item", ds.chk_item);
		rx.add(resForm, "chk_dt", ds.chk_dt);
		rx.add(resForm, "chk_cont", ds.chk_cont);
		rx.add(resForm, "dlco_nm", "");
		rx.add(resForm, "flag", "");
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
