<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brmgr_12510_l.jsp
* ���       : ���Ͱ���-����������-����������������_Ȯ��μ�_����Ͽ�
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
	SS_MO_SLS_BRMGR_2510_LDataSet ds = (SS_MO_SLS_BRMGR_2510_LDataSet)request.getAttribute("ds");
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
		SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
<extncntinfo>
	<yymm><%= rec.yymm %></yymm> <!--���-->
	<bonm><![CDATA[<%= rec.bonm %>]]></bonm><!--���͸�-->
	<boclsf><![CDATA[<%= rec.boclsf %>]]></boclsf><!--���ͱ���-->
	<rdr_qty><%= rec.rdr_qty %></rdr_qty><!--���ںμ�-->
	<jm_qty><%= rec.jm_qty %></jm_qty><!--�繫�μ�-->
	<extn_qty><%= rec.extn_qty %></extn_qty> <!--Ȯ��μ�-->
	<susp_qty><%= rec.susp_qty %></susp_qty><!--�����μ�-->
	<grow_qty><%= rec.grow_qty %></grow_qty> <!--����μ�-->
	<extn_rate><%= rec.extn_rate %></extn_rate><!--Ȯ���-->
	<susp_rate><%= rec.susp_rate %></susp_rate><!--������-->
	<extn_qty2><%= rec.extn_qty2 %></extn_qty2><!--Ȯ��μ�(�������޺μ������߰�)-->
	<susp_qty2><%= rec.susp_qty2 %></susp_qty2><!--�����μ�(�������޺μ������߰�)-->
	<grow_qty2><%= rec.grow_qty2 %></grow_qty2><!--����μ�(�������޺μ������߰�)-->
	<extn_rate2><%= rec.extn_rate2 %></extn_rate2><!--Ȯ���(�������޺μ������߰�)-->
	<susp_rate2><%= rec.susp_rate2 %></susp_rate2><!--������(�������޺μ������߰�)-->
</extncntinfo>
<%
			}
		}else{
%>
<extncntinfo>
	<yymm></yymm>
	<bonm></bonm>
	<boclsf></boclsf>
	<rdr_qty></rdr_qty>
	<jm_qty></jm_qty>
	<extn_qty></extn_qty>
	<susp_qty></susp_qty>
	<grow_qty></grow_qty>
	<extn_rate></extn_rate>
	<susp_rate></susp_rate>
	<extn_qty2></extn_qty2>
	<susp_qty2></susp_qty2>
	<grow_qty2></grow_qty2>
	<extn_rate2></extn_rate2>
	<susp_rate2></susp_rate2>
</extncntinfo>
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
<extncntinfo>
	<yymm></yymm>
	<bonm></bonm>
	<boclsf></boclsf>
	<rdr_qty></rdr_qty>
	<jm_qty></jm_qty>
	<extn_qty></extn_qty>
	<susp_qty></susp_qty>
	<grow_qty></grow_qty>
	<extn_rate></extn_rate>
	<susp_rate></susp_rate>
	<extn_qty2></extn_qty2>
	<susp_qty2></susp_qty2>
	<grow_qty2></grow_qty2>
	<extn_rate2></extn_rate2>
	<susp_rate2></susp_rate2>
</extncntinfo>
<%
		}
	}else{
%>
<errinfo>
	<errcode><![CDATA[-9999]]></errcode>
	<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
</errinfo>
<extncntinfo>
	<yymm></yymm>
	<bonm></bonm>
	<boclsf></boclsf>
	<rdr_qty></rdr_qty>
	<jm_qty></jm_qty>
	<extn_qty></extn_qty>
	<susp_qty></susp_qty>
	<grow_qty></grow_qty>
	<extn_rate></extn_rate>
	<susp_rate></susp_rate>
	<extn_qty2></extn_qty2>
	<susp_qty2></susp_qty2>
	<grow_qty2></grow_qty2>
	<extn_rate2></extn_rate2>
	<susp_rate2></susp_rate2>
</extncntinfo>
<%
	}
%>
</curcommlist>