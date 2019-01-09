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
	IS_BUS_2130_LDataSet ds = (IS_BUS_2130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData3 = rx.add(root, "", "");

	try {
		/****** CURLIST_1 BEGIN */
		for(int i = 0; i < ds.curlist_1.size(); i++) {
			IS_BUS_2130_LCURLIST_1Record rec = (IS_BUS_2130_LCURLIST_1Record)ds.curlist_1.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
		}
		/****** CURLIST_1 END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
