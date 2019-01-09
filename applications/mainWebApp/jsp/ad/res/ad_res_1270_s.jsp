<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1270_SDataSet ds = (AD_RES_1270_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int tempInfoData = rx.add(root, "infoData", "");
	try {
 
		rx.add(tempInfoData, "surp_amt", ds.surp_amt);
		rx.add(tempInfoData, "basi_dt", ds.basi_dt);		
		rx.add(tempInfoData, "info_yn", ds.info_yn); 
		int gridData3 = rx.add(tempInfoData, "gridData3", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1270_SCURLISTRecord rec = (AD_RES_1270_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "insrt_dt", rec.insrt_dt);
			rx.add(record, "dlco_info", rec.dlco_info);
			rx.add(record, "chrg_pers", rec.chrg_pers);
		}		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>