<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_2000_m.jsp
* 기능 :  판매 - 지대관리 - 매출관리 - 지국매체별단가변경
* 작성일자 : 2009-04-08
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
	SE_SAL_2000_MDataSet ds = (SE_SAL_2000_MDataSet)request.getAttribute("ds");
	
	Calendar cal 			= Calendar.getInstance();
	String year 			= String.valueOf(cal.get(cal.YEAR));
	String month 			= String.valueOf(cal.get(cal.MONTH) + 1);
	month					= month.length() == 1 ? "0" + month : month;
	
	String today			= year + month;
	rx.add(root		, "bgn_yymm"			, ds.basi_dt01		);
	rx.add(root		, "end_yymm"			, ds.basi_dt02		);	
	

	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>



<% /* 작성시간 : Tue Feb 24 19:54:16 KST 2009 */ %>