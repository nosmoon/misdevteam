<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brinfo_11610_l.jsp
* ���       : �Ǹ�-�߼۰���-��������-�߼۳뼱 ��ȸ_����Ͽ�
* �ۼ�����   : 2016-12-28
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_S_BSNSDataSet ds = (SS_MO_S_BSNSDataSet)request.getAttribute("ds");
%>
<bsdetaillist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<bsdetailinfo>
	<bocd><%=ds.bocd%></bocd><!--�����ڵ� -->
	<jpcode><%=ds.jpcode%></jpcode> <!-- �뼱�ڵ� -->
	<jbjiorder><![CDATA[<%=ds.jbjiorder%>]]></jbjiorder> <!-- �뼱���� -->
	<jbpansu><%=ds.jbpansu%></jbpansu><!--  �Ǽ� -->
	<jpname><![CDATA[<%=ds.jpname%>]]></jpname><!-- ���͸� -->
	<inname><![CDATA[<%=ds.inname%>]]></inname><!-- �μ�ó -->
	<jbbusu><%=ds.jbbusu%></jbbusu><!-- �μ� -->
	<jbbalcha><%=ds.jbbalcha%></jbbalcha><!-- �����ð� -->
	<jbyetime><%=ds.jbyetime%></jbyetime><!-- �����ð� -->
	<jbdotime><%=ds.jbdotime%></jbdotime><!-- �����ð� -->
	<medicd><%=ds.medicd%></medicd><!-- ��ü�ڵ� -->
	<mcname><![CDATA[<%=ds.mcname%>]]></mcname><!-- ��ü�� -->
	<bo_addr><![CDATA[<%=ds.bo_addr%>]]></bo_addr><!-- �����ּ� -->
</bsdetailinfo>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>
<bsdetailinfo>
	<bocd></bocd>
	<jpcode></jpcode>
	<jbjiorder></jbjiorder>
	<jbpansu></jbpansu>
	<jpname></jpname>
	<inname></inname>
	<jbbusu></jbbusu>
	<jbbalcha></jbbalcha>
	<jbyetime></jbyetime>
	<jbdotime></jbdotime>
	<medicd></medicd>
	<mcname></mcname>
	<bo_addr></bo_addr>
</bsdetailinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<bsdetailinfo>
	<bocd></bocd>
	<jpcode></jpcode>
	<jbjiorder></jbjiorder>
	<jbpansu></jbpansu>
	<jpname></jpname>
	<inname></inname>
	<jbbusu></jbbusu>
	<jbbalcha></jbbalcha>
	<jbyetime></jbyetime>
	<jbdotime></jbdotime>
	<medicd></medicd>
	<mcname></mcname>
	<bo_addr></bo_addr>
</bsdetailinfo>
<%
	}
%>
</bsdetaillist>