<?xml version="1.0" encoding="EUC-KR" ?>
<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : mo_ss_reader_11110_l.jsp
* ��� : 
* �ۼ����� : 2016-12-22
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	:
* ������	:
* ��������	:
* ������ϸ�:
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
	<errcode>SUCCESS</errcode> 		<!-- errcode ��ȣ -->
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