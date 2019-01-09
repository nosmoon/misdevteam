<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : mo_ss_reader_11100_a.jsp
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
	SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet)request.getAttribute("ds");
%>
<initlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode><!-- �����ڵ� -->
		<errmsg></errmsg><!-- �����޽��� -->
	</errinfo>
<%
	if( ds.dscttypecd.size() > 0 ){
		SS_L_RDR_DSCT_INITDSCTTYPECDRecord rec = null;
		for( int i=0; i < ds.dscttypecd.size(); i++ ){
			rec = (SS_L_RDR_DSCT_INITDSCTTYPECDRecord)ds.dscttypecd.get( i );
%>
	<dscttypeinfo>
		<dscttypecd><%= rec.cicodeval %></dscttypecd><!-- �����Ҹ������ڵ� -->
		<dscttypenm><![CDATA[<%= rec.cicdnm %>]]></dscttypenm><!-- �����Ҹ������� -->
	</dscttypeinfo>
<%
			}
		}else{
%>
	<dscttypeinfo>
		<dscttypecd></dscttypecd><!-- �����Ҹ������ڵ� -->
		<dscttypenm></dscttypenm><!-- �����Ҹ������� -->
	</dscttypeinfo>
<%
	}
%>
<%
	if( ds.acpnpathcd.size() > 0 ){
		SS_L_RDR_DSCT_INITACPNPATHCDRecord rec = null;
		for( int i=0; i < ds.acpnpathcd.size(); i++ ){
			rec = (SS_L_RDR_DSCT_INITACPNPATHCDRecord)ds.acpnpathcd.get( i );
%>
	<acpnpathinfo>
		<acpnpathcd><%= rec.cicodeval %></acpnpathcd><!-- ��������ڵ� -->
		<acpnpathnm><![CDATA[<%= rec.cicdnm %>]]></acpnpathnm><!-- ������θ� -->
	</acpnpathinfo>
<%
			}
		}else{
%>
	<acpnpathinfo>
		<acpnpathcd></acpnpathcd><!-- ��������ڵ� -->
		<acpnpathnm></acpnpathnm><!-- ������θ� -->
	</acpnpathinfo>
<%
	}
%>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode><!-- �����ڵ� -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg><!-- �����޼��� -->
	</errinfo>
	<dscttypeinfo>
		<dscttypecd></dscttypecd><!-- �����Ҹ������ڵ� -->
		<dscttypenm></dscttypenm><!-- �����Ҹ������� -->
	</dscttypeinfo>
	<acpnpathinfo>
		<acpnpathcd></acpnpathcd><!-- ��������ڵ� -->
		<acpnpathnm></acpnpathnm><!-- ������θ� -->
	</acpnpathinfo>

<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode><!-- �����ڵ� -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg><!-- �����޼��� -->
	</errinfo>
	<dscttypeinfo>
		<dscttypecd></dscttypecd><!-- �����Ҹ������ڵ� -->
		<dscttypenm></dscttypenm><!-- �����Ҹ������� -->
	</dscttypeinfo>
	<acpnpathinfo>
		<acpnpathcd></acpnpathcd><!-- ��������ڵ� -->
		<acpnpathnm></acpnpathnm><!-- ������θ� -->
	</acpnpathinfo>
<%
	}
%>
</initlist>