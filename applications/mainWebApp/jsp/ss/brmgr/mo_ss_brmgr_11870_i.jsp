<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brmgr_11870_i.jsp
* ���       : ���Ͱ���-���Է�����-����Ʈ���Է����� ����/����/����_����Ͽ�
* �ۼ�����   : 2017-01-19
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_A_COMM_APT_THRWDataSet ds = (SL_MO_A_COMM_APT_THRWDataSet)request.getAttribute("ds");
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