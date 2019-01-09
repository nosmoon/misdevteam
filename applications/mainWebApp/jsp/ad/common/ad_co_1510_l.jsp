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
	AD_CO_1510_LDataSet ds = (AD_CO_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(root, "gridData", "");

	try 
	{
		for( int i = 0; i < ds.curlist.size(); i++ )
		{
			AD_CO_1510_LCURLISTRecord rec = (AD_CO_1510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_no"	 , rec.dlco_no);
			rx.add(record, "dlco_nm"	 , rec.dlco_nm);
			rx.add(record, "cust_seq"	 , rec.cust_seq);
			rx.add(record, "cust_name"	 , rec.cust_name);
			rx.add(record, "department"	 , rec.department);
			rx.add(record, "position"	 , rec.position);
			rx.add(record, "mobile1"	 , rec.mobile1);
			rx.add(record, "address"	 , rec.address);
			rx.add(record, "chg_dt_tm"	 , rec.chg_dt_tm);
			rx.add(record, "incumbent_yn", rec.incumbent_yn);
		}
	}
	catch (Exception e)
	{
	}
	finally
	{
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 14 16:24:43 KST 2009 */ %>