<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brmgr_12511_l.jsp
* ���       : ���Ͱ���-����������-����������������_�μ���Ȳ_����Ͽ�
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
	SS_MO_SLS_BRMGR_2511_LDataSet ds = (SS_MO_SLS_BRMGR_2511_LDataSet)request.getAttribute("ds");
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
		SS_MO_SLS_BRMGR_2511_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2511_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
	<qtyinfo>
		<yymm><%= rec.yymm %></yymm> <!-- ��� -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm><!-- ���͸� -->
		<boclsf><![CDATA[<%=rec.boclsf %>]]></boclsf><!-- ���ͱ��� -->
		<curmm_issu_qty><%= rec.curmm_issu_qty %></curmm_issu_qty> <!-- �߼ۺμ� -->
		<rdr_qty><%= rec.rdr_qty %></rdr_qty><!-- ���ںμ�(�μ�) -->
		<gap_qty><%= rec.gap_qty %></gap_qty><!-- ���ںμ�(�������) -->
		<val_qty><%= rec.val_qty %></val_qty><!-- �������(�μ�) -->
		<val_rate><%= rec.val_rate %></val_rate><!-- �������(����) -->
		<pre_val_qty><%= rec.pre_val_qty %></pre_val_qty><!-- ������(�μ�) -->
		<pre_val_rate><%= rec.pre_val_rate %></pre_val_rate><!-- ������(����) -->
</qtyinfo>
<%
			}
		}else{
%>
	<qtyinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<curmm_issu_qty></curmm_issu_qty>
		<rdr_qty></rdr_qty>
		<gap_qty></gap_qty>
		<val_qty></val_qty>
		<val_rate></val_rate>
		<pre_val_qty></pre_val_qty>
		<pre_val_rate></pre_val_rate>
</qtyinfo>
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
	<qtyinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<curmm_issu_qty></curmm_issu_qty>
		<rdr_qty></rdr_qty>
		<gap_qty></gap_qty>
		<val_qty></val_qty>
		<val_rate></val_rate>
		<pre_val_qty></pre_val_qty>
		<pre_val_rate></pre_val_rate>
</qtyinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<qtyinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<curmm_issu_qty></curmm_issu_qty>
		<rdr_qty></rdr_qty>
		<gap_qty></gap_qty>
		<val_qty></val_qty>
		<val_rate></val_rate>
		<pre_val_qty></pre_val_qty>
		<pre_val_rate></pre_val_rate>
</qtyinfo>
<%
	}
%>
</curcommlist>