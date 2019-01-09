<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%

		RwXml rx = new RwXml();
		TN_LNK_2100_LDataSet ds = (TN_LNK_2100_LDataSet)request.getAttribute("ds");
		int root = RwXml.rootNodeID;
		int dataSet = 0;
		int recordSet = 0;
		String errcode = ds.errcode;
		String errmsg = ds.errmsg;

		int tempData	= rx.add(root, 		"configData", "");
		int reqForm 	= rx.add(tempData, 	"reqForm", "");
		
		rx.add(reqForm, 		"deptidx",  		ds.deptidx );
		rx.add(reqForm, 		"deptnm", 			ds.deptnm );
		rx.add(reqForm, 		"organcode",  		ds.organcode );
		rx.add(reqForm, 		"organpayaccount", 	ds.organpayaccount);
		rx.add(reqForm, 		"organrootaccount",	ds.organrootaccount );
		rx.addCData(reqForm, 	"description",		ds.description);
		rx.add(reqForm, 		"uselink",     		ds.uselink);
		rx.add(reqForm, 		"linktest", 		ds.linktest);
		rx.addCData(reqForm, 	"aplcfile_path", 	ds.aplcfile_path);
		rx.addCData(reqForm, 	"payfile_path", 	ds.payfile_path);
		rx.addCData(reqForm, 	"paydate", 			ds.paydate);

	try {
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Tue Jul 19 16:46:26 KST 2016 */ %>