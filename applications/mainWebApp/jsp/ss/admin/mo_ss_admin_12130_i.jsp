<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_admin_12130_i.jsp.jsp
* ���       : ������������-����ϰ���-����-������,������,������ʱ�ȭ_����Ͽ�
* �ۼ�����   : 2017-01-23
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_A_LOGINAPLC_APRVDataSet ds = (SS_MO_A_LOGINAPLC_APRVDataSet)request.getAttribute("ds");
%>
<accesslist>
<%
	if(ds !=null){
		if(ds.getErrcode()==null || ds.getErrcode().equals("")){
%>
<errinfo>
	<errcode></errcode> <!-- �����ڵ� -->
	<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>	<!-- �����޽��� -->
</errinfo>
<%
		}else{
%>
<errinfo>
	<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- �����ڵ� -->
	<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- �����޽��� -->
</errinfo>
<%
		}
	}else{
%>
<errinfo>
	<errcode><![CDATA[-9999]]></errcode>                     	<!-- �����ڵ� -->
	<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>      				<!-- �����޽��� -->
</errinfo>
<%
	}
%>
</accesslist>