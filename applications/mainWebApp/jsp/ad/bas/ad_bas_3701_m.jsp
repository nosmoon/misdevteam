<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3701_MDataSet ds = (AD_BAS_3701_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData2", "");
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	try
	{
		//지사명
		int hndl_nm_cd = rx.add( tempData, "hndl_nm_cd", "");
		for(int i=0; i<ds.curlist1.size(); i++)
		{ 
			AD_BAS_3701_MCURLISTRecord rec = (AD_BAS_3701_MCURLISTRecord)ds.curlist1.get(i);
			int item  = rx.add( hndl_nm_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		
		//지사평가구분
		int hndl_evlt = rx.add( tempData, "hndl_evlt", "");
		for(int i=0; i<ds.curlist2.size(); i++)
		{
			AD_BAS_3701_MCURLISTRecord rec = (AD_BAS_3701_MCURLISTRecord)ds.curlist2.get(i);
			int item  = rx.add( hndl_evlt, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
						
	}
	catch (Exception e) 
	{
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>