<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_2800_m.jsp
* 기능 :  판매-발송관리-발송정보 download
* 작성일자 : 2009-02-24
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	int root 				= RwXml.rootNodeID;
	
	Calendar cal 			= Calendar.getInstance();
	String year 			= String.valueOf(cal.get(cal.YEAR));
	String month 			= String.valueOf(cal.get(cal.MONTH) + 1);
	month					= month.length() == 1 ? "0" + month : month;
	String day				= String.valueOf(cal.get(cal.DATE));
	day						= day.length() == 1 ? "0" + day : day;
	
	String today			= year + month + day;
	rx.add(root		, "bgn_issu_dt"		, today		);
	rx.add(root		, "end_issu_dt"		, today		);
	rx.add(root		, "issu_dt"			, today		);
	

	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>



<% /* 작성시간 : Tue Feb 24 19:54:16 KST 2009 */ %>