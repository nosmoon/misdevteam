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
* ���ϸ� : se_sal_2000_m.jsp
* ��� :  �Ǹ� - ������� - ������� - ������ü���ܰ�����
* �ۼ����� : 2009-04-08
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



<% /* �ۼ��ð� : Tue Feb 24 19:54:16 KST 2009 */ %>