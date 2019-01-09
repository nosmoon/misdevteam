<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>
  
<%
	RwXml rx = new RwXml();         // XML 객체 생성 
	AD_RES_2120_ADataSet ds = (AD_RES_2120_ADataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add(msgData, "statusMsg", "OK" );
	rx.add(msgData, "resultMsg", "정상적으로 처리되었습니다.");
	rx.add(msgData, "preng_occr_seq", ds.preng_occr_seq);

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>