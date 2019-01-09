<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_CO_1400_LDataSet ds = (AD_CO_1400_LDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int gridData 	= 0;

	gridData = rx.add(root, "gridData", "");

	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_CO_1400_LCURLISTRecord rec = (AD_CO_1400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "grp_cmpy_cd"	, rec.grp_cmpy_cd);
			rx.add(record, "grp_cmpy_nm"	, rec.grp_cmpy_nm);
			rx.add(record, "dlco_no"		, rec.dlco_no);
			rx.add(record, "dlco_nm"		, rec.dlco_nm);
			rx.add(record, "old_dlco_no"	, rec.dlco_no);
			rx.add(record, "old_grp_cmpy_cd", rec.grp_cmpy_cd);

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

