<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();         // XML ��ü ���� 
	AD_DEP_4220_ADataSet ds = (AD_DEP_4220_ADataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add(msgData, "statusMsg", "OK" );
	rx.add(msgData, "resultMsg", "���������� ó���Ǿ����ϴ�.");

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>

<% /* �ۼ��ð� : Wed Jan 21 21:10:45 KST 2009 */ %>