<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_3000_LDataSet ds = (HD_INFO_3000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_3000_LCURLISTRecord rec = (HD_INFO_3000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "cd_nm"		, rec.cd_nm);
			rx.add(record, "dept_nm"	, rec.dept_nm);
			rx.add(record, "emp_no"		, rec.emp_no);
			rx.add(record, "nm_korn"	, rec.nm_korn);
			rx.add(record, "dty_nm"		, rec.dty_nm);
			rx.add(record, "posi_nm"	, rec.posi_nm);
			rx.add(record, "cont1"		, "Y".equals(rec.cont1) ? "Y":"");
			rx.add(record, "cont2"		, "Y".equals(rec.cont2) ? "Y":"");
			rx.add(record, "cont3"		, "Y".equals(rec.cont3) ? "Y":"");
			rx.add(record, "cont4"		, "Y".equals(rec.cont4) ? "Y":"");
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

