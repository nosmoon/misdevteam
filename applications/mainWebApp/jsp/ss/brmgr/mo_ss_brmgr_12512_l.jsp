<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brmgr_12512_l.jsp
* ���       : ������Ȳ-����(���Ͱ���-����������-����������������)_����Ͽ�/ ���븶��-�����Աݷ���Ȳ_����Ͽ�(�Աݰ���-�����Աݰ���-�����Աݷ���Ȳ)
* �ۼ�����   : 2016-12-19
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   : ��������ܾ�, ��۴�ü�ݾ�, ������¹�ȣ �߰� 
             : ������Ȳ-���� / ���븶��-�����Աݷ���Ȳ���� ��������� ����+�ҳ����� ��. ����ȯ���� ��û
* ������     : �弱��
* ��������   : 2017-03-24
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_SLS_BRMGR_2512_LDataSet ds = (SS_MO_SLS_BRMGR_2512_LDataSet)request.getAttribute("ds");
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
		SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
<amtinfo>
		<yymm><%= rec.yymm %></yymm> <!-- ��� -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm> <!-- ���͸� -->
		<boclsf><![CDATA[<%=rec.boclsf %>]]></boclsf><!-- ���ͱ��� -->
		<net_sale_amt><%= rec.net_sale_amt %></net_sale_amt> <!-- �������(����+�ҳ�)  -->
		<rcpm_amt><%= rec.rcpm_amt %></rcpm_amt><!-- �����Աݾ� -->
		<rcpm_rate><%= rec.rcpm_rate %></rcpm_rate><!-- �Աݷ� -->
		<now_bal><%= rec.now_bal %></now_bal><!-- ����̼� -->
		<bal><%= rec.bal %></bal><!-- �����̼� -->
		<acct_tot_amt><%= rec.acct_tot_amt %></acct_tot_amt><!--��������ܾ�-->
		<pdlv_altn_amt><%= rec.pdlv_altn_amt %></pdlv_altn_amt><!-- ��۴�ü�ݾ�-->
		<vitl_acct_no><%= rec. vitl_acct_no %></vitl_acct_no><!--������¹�ȣ-->
</amtinfo>
<%
			}
		}else{
%>
<amtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<net_sale_amt></net_sale_amt>
		<rcpm_amt></rcpm_amt>
		<rcpm_rate></rcpm_rate>
		<now_bal></now_bal>
		<bal></bal>
		<acct_tot_amt></acct_tot_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<vitl_acct_no></vitl_acct_no>
</amtinfo>
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
<amtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<net_sale_amt></net_sale_amt>
		<rcpm_amt></rcpm_amt>
		<rcpm_rate></rcpm_rate>
		<now_bal></now_bal>
		<bal></bal>
		<acct_tot_amt></acct_tot_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<vitl_acct_no></vitl_acct_no>
</amtinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<amtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<net_sale_amt></net_sale_amt>
		<rcpm_amt></rcpm_amt>
		<rcpm_rate></rcpm_rate>
		<now_bal></now_bal>
		<bal></bal>
		<acct_tot_amt></acct_tot_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<vitl_acct_no></vitl_acct_no>
</amtinfo>
<%
	}
%>
</curcommlist>