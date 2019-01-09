<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();         // XML 객체 생성 

	int root = RwXml.rootNodeID;
	int errData = rx.add( root , "errData" , "");
	rx.add ( errData, "errcode", "광고관리 권한 오류" );
	rx.add ( errData, "errmsg", "광고관리매체 권한이 없습니다. AD본부 애드기획관리팀으로 연락하세요." );

//	String resultMsg = Util.checkString((String)request.getAttribute("resultMsg"));
	
	//RwXml rx = new RwXml();         // XML 객체 생성 

	//int root = RwXml.rootNodeID;
	//int msgData = rx.add( root , "msgData" , "");
	//rx.add ( msgData, "statusMsg", "OK" );
	//if(!"".equals(resultMsg)){
	//	rx.add(msgData, "resultMsg", resultMsg);
	//}else{
	//	rx.add(msgData, "resultMsg", "광고관리매체 권한이 없습니다. AD본부 애드기획관리팀으로 연락하세요.");
	//}

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>