<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_sl_reader_11170_l.jsp
* ���       : ������������-���������˾�â-�̻縮��Ʈ
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
	SL_MO_L_MOVM_RDRPTCRDataSet ds = (SL_MO_L_MOVM_RDRPTCRDataSet)request.getAttribute("ds");
%>
<movmlist>
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
	if( ds.movm_rdrcur.size() > 0 ){
		SL_MO_L_MOVM_RDRPTCRMOVM_RDRCURRecord rec = null;
		for( int i=0; i < ds.movm_rdrcur.size(); i++ ){
			rec = (SL_MO_L_MOVM_RDRPTCRMOVM_RDRCURRecord)ds.movm_rdrcur.get( i );
%>
	<movminfo>
		<movmdt><%= rec.movmdt %></movmdt><!-- �̻����� -->
		<trsfbonm><![CDATA[<%= rec.trsfbonm %>]]></trsfbonm><!-- �̻������͸� -->
		<acptbonm><![CDATA[<%= rec.acptbonm %>]]></acptbonm><!-- �̻��ļ��͸� -->
	</movminfo>
<%
			}
		}else{
%>
	<movminfo>
		<movmdt></movmdt>
		<trsfbonm></trsfbonm>
		<acptbonm></acptbonm>
	</movminfo>
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
	<movminfo>
		<movmdt></movmdt>
		<trsfbonm></trsfbonm>
		<acptbonm></acptbonm>
	</movminfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
	<movminfo>
		<movmdt></movmdt>
		<trsfbonm></trsfbonm>
		<acptbonm></acptbonm>
	</movminfo>
<%
	}
%>
</movmlist>