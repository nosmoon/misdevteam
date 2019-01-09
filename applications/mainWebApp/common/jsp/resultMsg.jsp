<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*, somo.framework.util.* " %>

<%

	String resultMsg = Util.checkString((String)request.getAttribute("resultMsg"));
	
	RwXml rx = new RwXml();         // XML 객체 생성 

	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add ( msgData, "statusMsg", "OK" );
	if(!"".equals(resultMsg)){
		rx.add(msgData, "resultMsg", resultMsg);
	}else{
		rx.add(msgData, "resultMsg", "정상적으로 처리되었습니다.");
	}

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>