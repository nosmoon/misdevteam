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
	IS_BUS_1330_LDataSet ds = (IS_BUS_1330_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData4 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BUS_1330_LCURLISTRecord rec = (IS_BUS_1330_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "wkcd", rec.wkcd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "vip_busn_acty_rept", rec.vip_busn_acty_rept);
			rx.add(record, "vip_busn_plan", rec.vip_busn_plan);
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
