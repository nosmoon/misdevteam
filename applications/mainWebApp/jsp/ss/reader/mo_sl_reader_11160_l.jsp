<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_sl_reader_11160_l.jsp
* ���       : ������������-���������˾�â-�޵�����Ʈ
* �ۼ�����   : 2017-02-06
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%--DataSet �� Request�� ó�� �Ѵ�. --%>
<%
	SL_MO_L_VSPTCRDataSet ds = (SL_MO_L_VSPTCRDataSet)request.getAttribute("ds");
%>
<vslist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
	<totalcnt><%=ds.totalcnt%></totalcnt>
<%
	if( ds.vsptcrcur.size() > 0 ){
		SL_MO_L_VSPTCRVSPTCRCURRecord rec = null;
		for( int i=0; i < ds.vsptcrcur.size(); i++ ){
			rec = (SL_MO_L_VSPTCRVSPTCRCURRecord)ds.vsptcrcur.get( i );
%>
	<vsinfo>
		<bonm><![CDATA[<%= rec.bonm %>]]></bonm><!-- ���͸� -->
		<medinm><![CDATA[<%= rec.medinm %>]]></medinm><!-- ��ü�� -->
		<suspfrdt><%= rec.suspfrdt %></suspfrdt><!-- �޵��������� --><!-- �޵��Ⱓ = �޵���������~�޵������� -->
		<susptodt><%= rec.susptodt %></susptodt><!-- �޵������� -->
	</vsinfo>
<%
			}
		}else{
%>
	<vsinfo>
		<bonm></bonm>
		<medinm></medinm>
		<suspfrdt></suspfrdt>
		<susptodt></susptodt>
	</vsinfo>
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
	<totalcnt></totalcnt>
	<vsinfo>
		<bonm></bonm>
		<medinm></medinm>
		<suspfrdt></suspfrdt>
		<susptodt></susptodt>
	</vsinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
	<vsinfo>
		<bonm></bonm>
		<medinm></medinm>
		<suspfrdt></suspfrdt>
		<susptodt></susptodt>
	</vsinfo>
<%
	}
%>
</vslist>