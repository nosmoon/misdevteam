<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brmgr_12513_l.jsp
* ���       : ���Ͱ���-����������-����������������_���������_����Ͽ�
* �ۼ�����   : 2016-12-19
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_SLS_BRMGR_2513_LDataSet ds = (SS_MO_SLS_BRMGR_2513_LDataSet)request.getAttribute("ds");
%>
<curcommlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.curcommlist.size() > 0 ){
		SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
<clamtinfo>
		<yymm><%= rec.yymm %></yymm><!-- ��� -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm><!-- ���͸�-->
		<boclsf><![CDATA[<%=rec.boclsf %>]]></boclsf><!-- ���ͱ��� -->
		<medaqty><%= rec.medaqty %></medaqty><!-- �����μ� -->
		<meda_amt><%= rec.meda_amt %></meda_amt><!-- ������ -->
		<repm_amt><%= rec.repm_amt %></repm_amt><!-- ���ݾ� -->
		<repm_rate><%= rec.repm_rate %></repm_rate><!-- ���ݷ� -->
		<longmisu><%= rec.longmisu %></longmisu><!-- ���̼� -->
		<lm_rate><%= rec.lm_rate %></lm_rate><!-- �̼����� -->
</clamtinfo>
<%
			}
		}else{
%>
<clamtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<medaqty></medaqty>
		<meda_amt></meda_amt>
		<repm_amt></repm_amt>
		<repm_rate></repm_rate>
		<longmisu></longmisu>
		<lm_rate></lm_rate>
</clamtinfo>
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
<clamtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<medaqty></medaqty>
		<meda_amt></meda_amt>
		<repm_amt></repm_amt>
		<repm_rate></repm_rate>
		<longmisu></longmisu>
		<lm_rate></lm_rate>
</clamtinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<clamtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<medaqty></medaqty>
		<meda_amt></meda_amt>
		<repm_amt></repm_amt>
		<repm_rate></repm_rate>
		<longmisu></longmisu>
		<lm_rate></lm_rate>
</clamtinfo>
<%
	}
%>
</curcommlist>