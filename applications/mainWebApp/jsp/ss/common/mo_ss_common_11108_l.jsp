<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_common_11108_l.jsp
* ���       : ����-�����˻�(��������Ʈ)_����Ͽ�
* �ۼ�����   : 2016-12-14
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_L_AREALISTDataSet ds = (SL_MO_L_AREALISTDataSet)request.getAttribute("ds");
%>
<arealist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
<errinfo>
	<errcode></errcode>
	<errmsg></errmsg>
</errinfo>

<%
	if( ds.areacur.size() > 0 ){
		SL_MO_L_AREALISTAREACURRecord rec = null;
		for( int i=0; i < ds.areacur.size(); i++ ){
			rec = (SL_MO_L_AREALISTAREACURRecord)ds.areacur.get( i );
%>
<areainfo>
	<areacd><%= rec.cd %></areacd> <!-- �����ڵ� -->
	<areanm><![CDATA[<%= rec.cdnm %>]]></areanm> <!-- �����ڵ�� -->
</areainfo>
<%
			}
		}else{
%>
<areainfo>
	<areacd></areacd>
	<areanm></areanm>
</areainfo>
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
<areainfo>
	<areacd></areacd> <!-- �����ڵ� -->
	<areanm></areanm> <!-- �����ڵ�� -->
</areainfo>
<%
		}
	}else{
%>
<errinfo>
	<errcode><![CDATA[-9999]]></errcode>
	<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
</errinfo>
<areainfo>
	<areacd></areacd>
	<areanm></areanm>
</areainfo>

<%
	}
%>
</arealist>