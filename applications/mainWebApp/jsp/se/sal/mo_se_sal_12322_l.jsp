<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_sal_12322_l.jsp
* ���       : �Աݰ���-�����Աݰ���-�Ա�Ȯ��(�������) / �����) ���븶��-�Ա�Ȯ��(�������)
* �ۼ�����   : 2017-05-30
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE.RCP.DS.SE_RCP_1010_LDataSet ds = (SE.RCP.DS.SE_RCP_1010_LDataSet)request.getAttribute("ds");
%>
<curlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.curlist.size() > 0 ){
		SE.RCP.REC.SE_RCP_1010_LCURLISTRecord rec = null;
		for( int i=0; i < ds.curlist.size(); i++ ){
			rec = (SE.RCP.REC.SE_RCP_1010_LCURLISTRecord)ds.curlist.get( i );
%>
	<curlistinfo>
		<cnfm_yn><%= rec.cnfm_yn %></cnfm_yn> <!--Ȯ�ο���-->
		<area_nm><![CDATA[<%= rec.area_nm %>]]></area_nm> <!--����-->
		<bo_cd><%= rec.bo_cd %></bo_cd> <!--�����ڵ� -->
		<bo_nm><![CDATA[<%= rec.bo_nm %></bo_nm>]]><!--���͸�-->
		<chrg_flnm><![CDATA[<%= rec.chrg_flnm %>]]></chrg_flnm> <!--�����-->
		<bo_head_nm><![CDATA[<%= rec.bo_head_nm %>]]></bo_head_nm> <!--���ʹ�ǥ��-->
		<tran_date><%= rec.tran_date %></tran_date> <!--�Ա�����-->
		<tran_time><%= rec.tran_time %></tran_time> <!--�Աݽð�-->
		<rcpm_pers><![CDATA[<%= rec.rcpm_pers %>]]></rcpm_pers> <!--�Ա���-->
		<acct_no><%= rec.acct_no %></acct_no> <!--���¹�ȣ-->
		<tran_amt><%= rec.tran_amt %></tran_amt> <!--�Աݾ�-->
	</curlistinfo>
<%
			}
		}else{
%>
	<curlistinfo>
		<cnfm_yn></cnfm_yn>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_nm></bo_nm>
		<chrg_flnm></chrg_flnm>
		<bo_head_nm></bo_head_nm>
		<tran_date></tran_date>
		<tran_time></tran_time>
		<rcpm_pers></rcpm_pers>
		<acct_no></acct_no>
		<tran_amt></tran_amt>
	</curlistinfo>
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
	<curlistinfo>
		<cnfm_yn></cnfm_yn>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_nm></bo_nm>
		<chrg_flnm></chrg_flnm>
		<bo_head_nm></bo_head_nm>
		<tran_date></tran_date>
		<tran_time></tran_time>
		<rcpm_pers></rcpm_pers>
		<acct_no></acct_no>
		<tran_amt></tran_amt>
	</curlistinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<curlistinfo>
		<cnfm_yn></cnfm_yn>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_nm></bo_nm>
		<chrg_flnm></chrg_flnm>
		<bo_head_nm></bo_head_nm>
		<tran_date></tran_date>
		<tran_time></tran_time>
		<rcpm_pers></rcpm_pers>
		<acct_no></acct_no>
		<tran_amt></tran_amt>
	</curlistinfo>
<%
	}
%>
</curlist>