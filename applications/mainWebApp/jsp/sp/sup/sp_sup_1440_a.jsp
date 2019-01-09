<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SUP_1440_ADataSet ds = (SP_SUP_1440_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add(msgData, "statusMsg", "OK" );
	rx.add(msgData, "resultMsg", "정상적으로 처리되었습니다.");
	rx.add(msgData, "acpn_no", ds.acpn_no);

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>
