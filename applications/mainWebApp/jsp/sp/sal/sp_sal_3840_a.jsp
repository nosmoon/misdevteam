<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_3840_ADataSet ds = (SP_SAL_3840_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add(msgData, "statusMsg", "OK" );
	rx.add(msgData, "resultMsg", "���������� ó���Ǿ����ϴ�.");
	rx.add(msgData, "prof_type_cd", ds.prof_type_cd);
	rx.add(msgData, "slip_clsf_cd", ds.slip_clsf_cd);
	rx.add(msgData, "slip_occr_dt", ds.slip_occr_dt); 
	rx.add(msgData, "slip_seq", ds.slip_seq); 

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>

<% /* �ۼ��ð� : Thu Aug 02 18:57:43 KST 2012 */ %>