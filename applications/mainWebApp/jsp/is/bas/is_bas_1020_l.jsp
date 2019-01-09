<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bas.rec.*
	,	chosun.ciis.is.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BAS_1020_LDataSet ds = (IS_BAS_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData3 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_1020_LCURLISTRecord rec = (IS_BAS_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");			
			rx.add(record, "advcs_cd", rec.advcs_cd);
			rx.add(record, "advcs_nm", rec.advcs_nm);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "std_cd", rec.std_cd);
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
