<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_sl_reader_11150_l.jsp
* ���       : ������������-���������˾�â-��������Ʈ
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
	SL_MO_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_MO_L_NWSPSUBSCNTRPTCRDataSet)request.getAttribute("ds");
%>
<cntrptlist>
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
	if( ds.nwspsubscntrcur.size() > 0 ){
		SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = null;
		for( int i=0; i < ds.nwspsubscntrcur.size(); i++ ){
			rec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get( i );
%>
	<cntrptinfo>
		<rdr_extndt><%= rec.rdr_extndt %></rdr_extndt><!-- Ȯ������ --> <!-- �����Ⱓ�� Ȯ������~���������� -->
		<suspdt><%= rec.suspdt %></suspdt><!-- �������� -->
		<bonm><![CDATA[<%= rec.bonm %>]]></bonm><!-- ���͸� -->
		<medinm><![CDATA[<%= rec.medinm %>]]></medinm><!-- ��ü�� -->
		<rdr_extntypenm><![CDATA[<%= rec.rdr_extntypenm %>]]></rdr_extntypenm><!-- Ȯ������ -->
		<extnnm><![CDATA[<%= rec.extnnm %>]]></extnnm><!-- Ȯ���� -->
		<suspresncd><![CDATA[<%= rec.suspresncd %>]]></suspresncd><!-- �������� -->
		<remk><![CDATA[<%= rec.remk %>]]></remk><!-- ��� -->
	</cntrptinfo>
<%
			}
		}else{
%>
	<cntrptinfo>
		<rdr_extndt></rdr_extndt>
		<suspdt></suspdt>
		<bonm></bonm>
		<medinm></medinm>
		<rdr_extntypenm></rdr_extntypenm>
		<extnnm></extnnm>
		<suspresncd></suspresncd>
		<remk></remk>
	</cntrptinfo>
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
	<cntrptinfo>
		<rdr_extndt></rdr_extndt>
		<suspdt></suspdt>
		<bonm></bonm>
		<medinm></medinm>
		<rdr_extntypenm></rdr_extntypenm>
		<extnnm></extnnm>
		<suspresncd></suspresncd>
		<remk></remk>
	</cntrptinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
	<cntrptinfo>
		<rdr_extndt></rdr_extndt>
		<suspdt></suspdt>
		<bonm></bonm>
		<medinm></medinm>
		<rdr_extntypenm></rdr_extntypenm>
		<extnnm></extnnm>
		<suspresncd></suspresncd>
		<remk></remk>
	</cntrptinfo>
<%
	}
%>
</cntrptlist>