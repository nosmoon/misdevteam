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
* ���ϸ� : se_bns_1900_m.jsp
* ��� :  �Ǹ� - ���˹����� - ���˹�(����)��꼭 ����
* �ۼ����� : 2009-04-30
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	int root 				= RwXml.rootNodeID;
	
	Calendar cal 			= Calendar.getInstance();
	String year 			= String.valueOf(cal.get(cal.YEAR));
	String month 			= String.valueOf(cal.get(cal.MONTH) + 1);
	month					= month.length() == 1 ? "0" + month : month;
	
	String today			= year + month;
	rx.add(root		, "bgn_yymm"		, today		);
	rx.add(root		, "end_yymm"		, today		);

	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>



<% /* �ۼ��ð� : Tue Feb 24 19:54:16 KST 2009 */ %>