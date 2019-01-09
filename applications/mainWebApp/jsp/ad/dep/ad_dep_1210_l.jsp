<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_1210_LDataSet ds = (AD_DEP_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {  

		int gridData = rx.add( resData , "gridData" , "");
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_1210_LCURLISTRecord rec = (AD_DEP_1210_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			rx.add(record, "clos_dt", rec.clos_dt); 
			rx.add(record, "mang_frdt", rec.mang_frdt); 
			rx.add(record, "mang_todt", rec.mang_todt); 
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "incmg_pers", rec.incmg_pers);
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
