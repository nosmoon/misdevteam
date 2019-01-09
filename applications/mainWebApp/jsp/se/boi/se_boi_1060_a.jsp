<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*, somo.framework.util.*
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
 " %>

<%

	String resultMsg = Util.checkString((String)request.getAttribute("resultMsg"));
	SE_BOI_1060_ADataSet ds = (SE_BOI_1060_ADataSet)request.getAttribute("ds");	
	
	RwXml rx = new RwXml();         // XML 객체 생성 

	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add ( msgData, "statusMsg", "OK" );
	if(!"".equals(resultMsg)){
		rx.add(msgData, "resultMsg", resultMsg);
	}else{
		rx.add(msgData, "resultMsg", "정상적으로 처리되었습니다.");
		rx.add(msgData, "bo_cd_key", ds.bo_cd);
		rx.add(msgData, "bo_seq_key", ds.bo_seq);
	}

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>