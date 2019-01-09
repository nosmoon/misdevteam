<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.job.rec.*
	,	chosun.ciis.co.job.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_JOB_1000_MDataSet ds = (CO_JOB_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int orga = rx.add(comboSet, "orga", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_JOB_1000_MCURLISTRecord rec = (CO_JOB_1000_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( orga , "item" , "");
			rx.add(item, "orga_cd", rec.orga_cd);
			rx.add(item, "orga_nm", rec.orga_nm);
			rx.add(item, "supr_orga_cd", rec.supr_orga_cd);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
