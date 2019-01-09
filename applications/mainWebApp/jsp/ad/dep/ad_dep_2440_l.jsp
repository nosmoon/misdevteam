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
	AD_DEP_2440_LDataSet ds = (AD_DEP_2440_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {   
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_2440_LCURLISTRecord rec = (AD_DEP_2440_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			rx.add(record, "tms", rec.tms);
			rx.add(record, "rcpay_dt", rec.rcpay_dt);
			rx.add(record, "rcpay_amt", rec.rcpay_amt);
		}
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
