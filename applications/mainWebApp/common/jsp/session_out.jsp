<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="somo.framework.expt.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();         // XML ��ü ���� 

	int root = RwXml.rootNodeID;
	int errData = rx.add( root , "errData" , "");
	rx.add ( errData, "errcode", "session-out" );
	rx.add ( errData, "errmsg", "����������  �����ϴ�. �ٽ� �α��� �ϼ���." );

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>