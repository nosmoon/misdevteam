<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mo_ss_reader_11100_a.jsp
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
	SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet)request.getAttribute("ds");
%>
<initlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode><!-- 에러코드 -->
		<errmsg></errmsg><!-- 에러메시지 -->
	</errinfo>
<%
	if( ds.dscttypecd.size() > 0 ){
		SS_L_RDR_DSCT_INITDSCTTYPECDRecord rec = null;
		for( int i=0; i < ds.dscttypecd.size(); i++ ){
			rec = (SS_L_RDR_DSCT_INITDSCTTYPECDRecord)ds.dscttypecd.get( i );
%>
	<dscttypeinfo>
		<dscttypecd><%= rec.cicodeval %></dscttypecd><!-- 구독불만유형코드 -->
		<dscttypenm><![CDATA[<%= rec.cicdnm %>]]></dscttypenm><!-- 구독불만유형명 -->
	</dscttypeinfo>
<%
			}
		}else{
%>
	<dscttypeinfo>
		<dscttypecd></dscttypecd><!-- 구독불만유형코드 -->
		<dscttypenm></dscttypenm><!-- 구독불만유형명 -->
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
		<acpnpathcd><%= rec.cicodeval %></acpnpathcd><!-- 접수경로코드 -->
		<acpnpathnm><![CDATA[<%= rec.cicdnm %>]]></acpnpathnm><!-- 접수경로명 -->
	</acpnpathinfo>
<%
			}
		}else{
%>
	<acpnpathinfo>
		<acpnpathcd></acpnpathcd><!-- 접수경로코드 -->
		<acpnpathnm></acpnpathnm><!-- 접수경로명 -->
	</acpnpathinfo>
<%
	}
%>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode><!-- 에러코드 -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg><!-- 에러메세지 -->
	</errinfo>
	<dscttypeinfo>
		<dscttypecd></dscttypecd><!-- 구독불만유형코드 -->
		<dscttypenm></dscttypenm><!-- 구독불만유형명 -->
	</dscttypeinfo>
	<acpnpathinfo>
		<acpnpathcd></acpnpathcd><!-- 접수경로코드 -->
		<acpnpathnm></acpnpathnm><!-- 접수경로명 -->
	</acpnpathinfo>

<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode><!-- 에러코드 -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg><!-- 에러메세지 -->
	</errinfo>
	<dscttypeinfo>
		<dscttypecd></dscttypecd><!-- 구독불만유형코드 -->
		<dscttypenm></dscttypenm><!-- 구독불만유형명 -->
	</dscttypeinfo>
	<acpnpathinfo>
		<acpnpathcd></acpnpathcd><!-- 접수경로코드 -->
		<acpnpathnm></acpnpathnm><!-- 접수경로명 -->
	</acpnpathinfo>
<%
	}
%>
</initlist>