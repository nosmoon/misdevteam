<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_sl_reader_11445_l.jsp
* ���       : ������������(���������˾�-�����ȸ)_����Ͽ�
* �ۼ�����   : 2017-02-03
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_SUBS_CNTR_STOP_HISTDataSet ds = (SL_L_SUBS_CNTR_STOP_HISTDataSet)request.getAttribute("ds");
%>
<susplist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.stopcntrcur.size() > 0 ){
		SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord rec = null;
		for( int i=0; i < ds.stopcntrcur.size(); i++ ){
			rec = (SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord)ds.stopcntrcur.get( i );
%>
<stopinfo>
	<medinm><![CDATA[<%= rec.medinm %>]]></medinm><!-- ��ü�� -->
	<cntrno><%= rec.cntrno %></cntrno><!-- ����ȣ -->
	<mangno><%= rec.mangno %></mangno><!-- ������ȣ -->
<%
	String freeyn = rec.freeyn ;

	if("Y".equals(freeyn)){
		freeyn = "����";
	}else{
		freeyn = "����";
	}
%>
	<freeyn><![CDATA[<%= freeyn%>]]></freeyn> <!-- �������� -->
	<subsqty><%= rec.subsqty %></subsqty><!-- �μ� -->
	<subsuprc><%= rec.subsuprc %></subsuprc><!-- �����ܰ� -->
	<valmm><%= rec.valmm %></valmm><!-- ������ -->
	<rdr_extndt><%= rec.rdr_extndt %></rdr_extndt><!-- Ȯ������ -->
	<suspdt><%= rec.suspdt %></suspdt><!-- �������� -->
	<suspresn><![CDATA[<%= rec.suspresn %>]]></suspresn><!-- ���������ڵ�� -->
</stopinfo>
<%
			}
		}else{
%>
<stopinfo>
	<medinm></medinm>
	<cntrno></cntrno>
	<mangno></mangno>
	<freeyn></freeyn>
	<subsqty></subsqty>
	<subsuprc></subsuprc>
	<valmm></valmm>
	<rdr_extndt></rdr_extndt>
	<suspdt></suspdt>
	<suspresn></suspresn>
</stopinfo>
<%
	}
%>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>
<stopinfo>
	<medinm></medinm>
	<cntrno></cntrno>
	<mangno></mangno>
	<freeyn></freeyn>
	<subsqty></subsqty>
	<subsuprc></subsuprc>
	<valmm></valmm>
	<rdr_extndt></rdr_extndt>
	<suspdt></suspdt>
	<suspresn></suspresn>
</stopinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<stopinfo>
	<medinm></medinm>
	<cntrno></cntrno>
	<mangno></mangno>
	<freeyn></freeyn>
	<subsqty></subsqty>
	<subsuprc></subsuprc>
	<valmm></valmm>
	<rdr_extndt></rdr_extndt>
	<suspdt></suspdt>
	<suspresn></suspresn>
</stopinfo>
<%
	}
%>
</susplist>