<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brmgr_12514_l.jsp
* ���       : ���Ͱ���-����������-����������������_����/��Ÿ_����Ͽ�
* �ۼ�����   : 2016-12-15
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_SLS_BRMGR_2514_LDataSet ds = (SS_MO_SLS_BRMGR_2514_LDataSet)request.getAttribute("ds");
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
		SS_MO_SLS_BRMGR_2514_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2514_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
	<etcinfo>
		<yymm><%= rec.yymm %></yymm> <!-- ��� -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm> <!-- ���͸� -->
		<boclsf><![CDATA[<%=rec.boclsf %>]]></boclsf><!-- ���ͱ��� -->
		<leaf_amt><%= rec.leaf_amt %></leaf_amt> <!-- ���ܸ��� -->
		<extn_alon><%= rec.extn_alon %></extn_alon><!-- Ȯ����� -->
		<daenap_amt><%= rec.daenap_amt %></daenap_amt> <!-- �볳 -->
	</etcinfo>
<%
			}
		}else{
%>
<etcinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<leaf_amt></leaf_amt>
		<extn_alon></extn_alon>
		<daenap_amt></daenap_amt>
</etcinfo>
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
<etcinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<leaf_amt></leaf_amt>
		<extn_alon></extn_alon>
		<daenap_amt></daenap_amt>
</etcinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<etcinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<leaf_amt></leaf_amt>
		<extn_alon></extn_alon>
		<daenap_amt></daenap_amt>
</etcinfo>
<%
	}
%>
</curcommlist>