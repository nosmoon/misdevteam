<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bus.rec.*
	,	chosun.ciis.is.bus.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BUS_1810_SDataSet ds = (IS_BUS_1810_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {
		rx.add(resForm, "preng_dt", ds.preng_dt);
		rx.add(resForm, "sale_clsf", ds.sale_clsf);
		rx.add(resForm, "spcsale_clsf", ds.spcsale_clsf);
		rx.add(resForm, "dept_cd", ds.dept_cd);
		rx.add(resForm, "sub_dept_cd", ds.sub_dept_cd);
		rx.add(resForm, "make_pers", ds.make_pers);
		rx.add(resForm, "make_pers_nm", ds.make_pers_nm);
		rx.add(resForm, "remk_matt", ds.remk_matt);
		rx.add(resForm, "flag", "U");
		rx.add(resForm, "seq", "0001");
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
