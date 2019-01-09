<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="somo.framework.expt.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();         // XML 객체 생성 

	int root = RwXml.rootNodeID;
	int errData = rx.add( root , "errData" , "");
	rx.add ( errData, "errcode", "session-out" );
	rx.add ( errData, "errmsg", "세션정보가  없습니다. 다시 로그인 하세요." );

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>