<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.dep.rec.*
	,	chosun.ciis.sp.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_DEP_1510_ADataSet ds = (SP_DEP_1510_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add(msgData, "statusMsg", "OK" );
	rx.add(msgData, "resultMsg", "���������� ó���Ǿ����ϴ�.");
	rx.add(msgData, "reg_seq", ds.reg_seq); 

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>

<% /* �ۼ��ð� : Tue Aug 07 14:47:12 KST 2012 */ %>