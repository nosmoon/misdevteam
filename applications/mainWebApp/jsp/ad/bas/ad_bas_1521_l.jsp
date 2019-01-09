<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
			    ,chosun.ciis.ad.bas.ds.*
			    ,chosun.ciis.co.base.util.*
			    ,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1521_LDataSet ds = (AD_BAS_1521_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist4 = rx.add(root, "curlist4", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1521_LCURLISTRecord rec = (AD_BAS_1521_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist4, "record", "");
			rx.add(record, "insrt_dt", rec.insrt_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "dlco_info", rec.dlco_info);
			rx.add(record, "seq", rec.seq);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
