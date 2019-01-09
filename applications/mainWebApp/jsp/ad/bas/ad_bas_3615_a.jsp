<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();         // XML 객체 생성 
	AD_BAS_3615_ADataSet ds = (AD_BAS_3615_ADataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");	
	
	if(!"".equals(ds.errcode)){
		rx.add(msgData, "statusMsg", "FAIL" );
		rx.add(msgData, "resultMsg", ds.errmsg);
	}
	else{
		rx.add(msgData, "statusMsg", "OK" );
		rx.add(msgData, "resultMsg", "정상적으로 처리되었습니다.");
		rx.add(msgData, "cust_seq", ds.cust_seq); 
	}
//	rx.add(msgData, "resultMsg", "정상적으로 처리되었습니다.");

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>