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
	RwXml rx = new RwXml();         // XML ��ü ���� 
	AD_BAS_3615_ADataSet ds = (AD_BAS_3615_ADataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");	
	
	if(!"".equals(ds.errcode)){
		rx.add(msgData, "statusMsg", "FAIL" );
		rx.add(msgData, "resultMsg", ds.errmsg);
	}
	else{
		rx.add(msgData, "statusMsg", "OK" );
		rx.add(msgData, "resultMsg", "���������� ó���Ǿ����ϴ�.");
		rx.add(msgData, "cust_seq", ds.cust_seq); 
	}
//	rx.add(msgData, "resultMsg", "���������� ó���Ǿ����ϴ�.");

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>

<% /* �ۼ��ð� : Wed Jan 21 21:10:45 KST 2009 */ %>