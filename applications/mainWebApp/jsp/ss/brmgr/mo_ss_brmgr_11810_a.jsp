<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brmgr_11810_a.jsp
* ���       : ���Ͱ���-���Է�����-����Ʈ�ּ��ڵ帮��Ʈ_����Ͽ�
* �ۼ�����   : 2017-01-13
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_L_COMM_APT_THRWDataSet ds = (SL_MO_L_COMM_APT_THRWDataSet)request.getAttribute("ds");
%>
<addrcdcurlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<!-- ����Ʈ�ּҸ���Ʈ ���� -->
<%
	if( ds.addrcdcur.size() > 0 ){
		SL_MO_L_COMM_APT_THRWADDRCDCURRecord rec = null;
		for( int i=0; i < ds.addrcdcur.size(); i++ ){
			rec = (SL_MO_L_COMM_APT_THRWADDRCDCURRecord)ds.addrcdcur.get( i );
%>
	<addrcdcurinfo>
		<addrcd><%= rec.addrcd %></addrcd><!--�ּ��ڵ�-->
		<addrnm><![CDATA[<%= rec.addrnm %>]]></addrnm><!--�ּ��ڵ��-->
		<addrdonglist><![CDATA[<%=rec.donglist %>]]></addrdonglist><!--������Ʈ-->
	</addrcdcurinfo>
<%
			}
		}else{
%>
	<addrcdcurinfo>
		<addrcd></addrcd>
		<addrnm></addrnm>
		<addrdonglist></addrdonglist>
	</addrcdcurinfo>
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
	<addrcdcurinfo>
		<addrcd></addrcd>
		<addrnm></addrnm>
		<addrdonglist></addrdonglist>
	</addrcdcurinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<addrcdcurinfo>
		<addrcd></addrcd>
		<addrnm></addrnm>
	</addrcdcurinfo>
<%
	}
%>
</addrcdcurlist>

