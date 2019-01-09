<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.job.rec.*
	,	chosun.ciis.co.job.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_JOB_3040_UDataSet ds = (CO_JOB_3040_UDataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add ( msgData, "statusMsg", "" );
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());

%>

