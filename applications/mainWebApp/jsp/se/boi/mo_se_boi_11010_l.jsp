<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_boi_11010_l.jsp
* ���       :
* �ۼ�����   :
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SE_MO_BOI_1010_LDataSet ds = ( SE_MO_BOI_1010_LDataSet )request.getAttribute("ds");  // request dataset
%>
<curlist>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> 																<!-- �����ڵ� -->
		<errmsg></errmsg>																	<!-- �����޽��� -->
	</errinfo>
<%
			SE_MO_BOI_1010_LCURLISTRecord rec = null;
			for( int i=0; i<ds.curlist.size(); i++ ){
				rec = ( SE_MO_BOI_1010_LCURLISTRecord )ds.curlist.get( i );
%>
	<boinfo>
		<dept_nm><![CDATA[<%=rec.dept_nm%>]]></dept_nm>									<!-- �μ��� -->
		<part_nm><![CDATA[<%=rec.part_nm%>]]></part_nm>									<!-- ��Ʈ�� -->
		<area_nm><![CDATA[<%=rec.area_nm%>]]></area_nm>									<!-- ������ -->
		<bo_cd><%=rec.bo_cd%></bo_cd>													<!-- �����ڵ� -->
		<bo_seq><%=rec.bo_seq%></bo_seq>													<!-- �������� -->
		<bo_nm><![CDATA[<%=rec.bo_nm%>]]></bo_nm>										<!-- ������ -->
		<bo_head_nm><![CDATA[<%=rec.bo_head_nm%>]]></bo_head_nm>							<!-- ������� -->
		<bo_head_prn><%=rec.bo_head_prn%></bo_head_prn>									<!-- �������ֹι�ȣ -->
		<chrg_flnm><![CDATA[<%=rec.chrg_flnm%>]]></chrg_flnm>							<!-- ������� -->
		<bo_telno><%=rec.bo_telno%></bo_telno>											<!-- ������ȭ��ȣ -->
		<bo_cntr_dt><%=rec.bo_cntr_dt%></bo_cntr_dt>										<!-- ������� -->
		<cntr_statnm><![CDATA[<%=rec.cntr_statnm%>]]></cntr_statnm>						<!-- ���� -->
		<bo_reg_clsf><%=rec.bo_reg_clsf%></bo_reg_clsf>									<!-- ����ڵ� -->
		<bo_reg_clsf_nm><![CDATA[<%=rec.bo_reg_clsf_nm%>]]></bo_reg_clsf_nm>				<!-- ��Ͽ��� -->
		<ern><%=rec.ern%></ern>															<!-- �����ڹ�ȣ -->
	</boinfo>
<%
			}
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- �����ڵ� -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- �����޽��� -->
	</errinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- �����ڵ� -->
		<errmsg><![CDATA[�ý��ۿ� ������ �߻��Ͽ����ϴ�. �����ڿ��� �����Ͻñ� �ٶ��ϴ�.]]></errmsg>		<!-- �����޽��� -->
	</errinfo>
	<boinfo>
		<dept_nm></dept_nm>
		<part_nm></part_nm>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_seq></bo_seq>
		<bo_nm></bo_nm>
		<bo_head_nm></bo_head_nm>
		<bo_head_prn></bo_head_prn>
		<chrg_flnm></chrg_flnm>
		<bo_telno></bo_telno>
		<bo_cntr_dt></bo_cntr_dt>
		<cntr_statnm></cntr_statnm>
		<bo_reg_clsf></bo_reg_clsf>
		<bo_reg_clsf_nm></bo_reg_clsf_nm>
		<ern></ern>
	</boinfo>
<%
	}
%>
</curlist>