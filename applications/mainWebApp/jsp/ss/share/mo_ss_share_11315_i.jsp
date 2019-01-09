<?xml version="1.0" encoding="EUC-KR" ?>
<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mo_ss_reader_11110_l.jsp
* 기능 : 
* 작성일자 : 2016-12-22
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	:
* 수정자	:
* 수정일자	:
* 백업파일명:
---------------------------------------------------------------------------------------------------%>
<%
	String result = (String)request.getAttribute("result");
	System.out.println("result="+result); 
%>
<infoexglist>
<%
	if("true".equals(result)){
%>
<errinfo>
	<errcode>SUCCESS</errcode> 		<!-- errcode ㅎ호 -->
	<errmsg><![CDATA[SUCCESS]]></errmsg>			<!-- errmsg -->
</errinfo>
<%
	}else{
%>
<errinfo>
	<errcode>FAIL</errcode> 		<!-- errcode -->
	<errmsg><![CDATA[FAIL]]></errmsg>			<!-- errmsg -->
</errinfo>
<%
	}
%>
</infoexglist>