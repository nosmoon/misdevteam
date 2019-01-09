<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*, somo.framework.util.*
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
 " %>

<%

	String resultMsg = Util.checkString((String)request.getAttribute("resultMsg"));
	SE_BOI_1060_ADataSet ds = (SE_BOI_1060_ADataSet)request.getAttribute("ds");	
	
	RwXml rx = new RwXml();         // XML ��ü ���� 

	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add ( msgData, "statusMsg", "OK" );
	if(!"".equals(resultMsg)){
		rx.add(msgData, "resultMsg", resultMsg);
	}else{
		rx.add(msgData, "resultMsg", "���������� ó���Ǿ����ϴ�.");
		rx.add(msgData, "bo_cd_key", ds.bo_cd);
		rx.add(msgData, "bo_seq_key", ds.bo_seq);
	}

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>