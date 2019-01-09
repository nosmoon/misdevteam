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
	RwXml rx = new RwXml();         // XML ��ü ���� 
	AD_TAX_1215_SDataSet ds = (AD_TAX_1215_SDataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int tempData = rx.add( root , "tempData" , "");
	rx.add(tempData, "dlco_nm", ds.dlco_nm); 
	rx.add(tempData, "advt_fee", ds.advt_fee); 
	rx.add(tempData, "dlco_no", ds.dlco_no); 
	rx.add(tempData, "pubc_dt", ds.pubc_dt); 

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>

<% /* �ۼ��ð� : Wed Jan 21 21:10:45 KST 2009 */ %>