<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_3850_ADataSet ds = (SP_SAL_3850_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int msgData = rx.add( root , "msgData" , "");
	rx.add(msgData, "statusMsg", "OK" );
	rx.add(msgData, "resultMsg", "정상적으로 처리되었습니다.");
	rx.add(msgData, "prof_type_cd", ds.prof_type_cd);
	rx.add(msgData, "slip_clsf_cd", ds.slip_clsf_cd);
	rx.add(msgData, "slip_occr_dt", ds.slip_occr_dt); 
	rx.add(msgData, "slip_seq", ds.slip_seq); 

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>

<% /* 작성시간 : Thu Aug 02 19:05:23 KST 2012 */ %>