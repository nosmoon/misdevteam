<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_sal_12321_l.jsp
* ���       : �Աݰ���-�����Աݰ���-�����Աݷ���Ȳ / �����) ���븶��-�����Աݷ���Ȳ
* �ۼ�����   : 2017-05-24
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_MO_RCP_2510_LDataSet ds = (SE_MO_RCP_2510_LDataSet)request.getAttribute("ds");
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
		SE_MO_RCP_2510_LCURLISTRecord rec = null;
		for( int i=0; i < ds.curlist.size(); i++ ){
			rec = (SE_MO_RCP_2510_LCURLISTRecord)ds.curlist.get( i );
%>
	<curlistinfo>
		<dept_nm><![CDATA[<%= rec.dept_nm %>]]></dept_nm> <!--��-->
		<part_nm><![CDATA[<%= rec.part_nm %>]]></part_nm> <!--��Ʈ-->
		<area_nm><![CDATA[<%= rec.area_nm %>]]></area_nm> <!--�μ�-->
		<bo_cd><%= rec.bo_cd %></bo_cd> <!--�����ڵ�-->
		<bo_seq><%= rec.bo_seq %></bo_seq> <!--�������ļ���-->
		<bo_nm><![CDATA[<%= rec.bo_nm %>]]></bo_nm> <!--���͸�-->
		<bo_head_nm><![CDATA[<%= rec.bo_head_nm %>]]></bo_head_nm> <!--���ʹ�ǥ��-->
		<cyov_bal><%= rec.cyov_bal %></cyov_bal> <!--�����̿��ܾ�-->
		<net_sale_amt><%= rec.net_sale_amt %></net_sale_amt><!--�������-->
		<today_amt><%= rec.today_amt %></today_amt><!--�����Աݾ�-->
		<pdlv_altn_amt><%= rec.pdlv_altn_amt %></pdlv_altn_amt><!--��۴�ü�ݾ�-->
		<acml_amt><%= rec.acml_amt %></acml_amt><!--�Աݰ�-->
		<bal_amt><%= rec.bal_amt %></bal_amt><!--�̼��ݾ�-->
		<rcpm_rate><%= rec.rcpm_rate %></rcpm_rate><!--�Աݷ�-->

	</curlistinfo>
<%
			}
		}else{
%>
	<curlistinfo>
		<dept_nm></dept_nm>
		<part_nm></part_nm>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_seq></bo_seq>
		<bo_nm></bo_nm>
		<bo_head_nm></bo_head_nm>
		<cyov_bal></cyov_bal>
		<net_sale_amt></net_sale_amt>
		<today_amt></today_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<acml_amt></acml_amt>
		<bal_amt></bal_amt>
		<rcpm_rate></rcpm_rate>
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
		<dept_nm></dept_nm>
		<part_nm></part_nm>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_seq></bo_seq>
		<bo_nm></bo_nm>
		<bo_head_nm></bo_head_nm>
		<cyov_bal></cyov_bal>
		<net_sale_amt></net_sale_amt>
		<today_amt></today_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<acml_amt></acml_amt>
		<bal_amt></bal_amt>
		<rcpm_rate></rcpm_rate>
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
		<dept_nm></dept_nm>
		<part_nm></part_nm>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_seq></bo_seq>
		<bo_nm></bo_nm>
		<bo_head_nm></bo_head_nm>
		<cyov_bal></cyov_bal>
		<net_sale_amt></net_sale_amt>
		<today_amt></today_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<acml_amt></acml_amt>
		<bal_amt></bal_amt>
		<rcpm_rate></rcpm_rate>
	</curlistinfo>
<%
	}
%>
</curlist>