<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*, somo.framework.util.* " %>

<%

	String resultMsg = Util.checkString((String)request.getAttribute("resultMsg"));
	
	RwXml rx = new RwXml();         // XML ��ü ���� 

	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	if(!"".equals(resultMsg)){
		rx.add(msgData, "resultMsg", resultMsg);
	}else{
		rx.add(msgData, "resultMsg", "���������� ó���Ǿ����ϴ�."); //�ش� �޽����� ������ ������.
	}

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>