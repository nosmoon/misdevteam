<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();         // XML ��ü ���� 

	int root = RwXml.rootNodeID;
	int errData = rx.add( root , "errData" , "");
	rx.add ( errData, "errcode", "������� ���� ����" );
	rx.add ( errData, "errmsg", "���������ü ������ �����ϴ�. AD���� �ֵ��ȹ���������� �����ϼ���." );

//	String resultMsg = Util.checkString((String)request.getAttribute("resultMsg"));
	
	//RwXml rx = new RwXml();         // XML ��ü ���� 

	//int root = RwXml.rootNodeID;
	//int msgData = rx.add( root , "msgData" , "");
	//rx.add ( msgData, "statusMsg", "OK" );
	//if(!"".equals(resultMsg)){
	//	rx.add(msgData, "resultMsg", resultMsg);
	//}else{
	//	rx.add(msgData, "resultMsg", "���������ü ������ �����ϴ�. AD���� �ֵ��ȹ���������� �����ϼ���.");
	//}

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>