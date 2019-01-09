<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();         // XML 객체 생성 
	AD_TAX_1215_SDataSet ds = (AD_TAX_1215_SDataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int tempData = rx.add( root , "tempData" , "");
	rx.add(tempData, "dlco_nm", ds.dlco_nm); 
	rx.add(tempData, "advt_fee", ds.advt_fee); 
	rx.add(tempData, "dlco_no", ds.dlco_no); 
	rx.add(tempData, "pubc_dt", ds.pubc_dt); 

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>