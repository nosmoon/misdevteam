<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_boi_11040_s.jsp
* ���       : ������������-�Ź���ݴ㺸-�����ε���� ����Ʈ
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
    SE_BOI_1040_SDataSet ds = ( SE_BOI_1040_SDataSet )request.getAttribute("ds");  // request dataset
%>
<gurtlist>
<%
	if( ds != null ){
		if( (ds.getErrcode() == null || ds.getErrcode().equals( "" )) && ds.tasem_bogurtperscur.size() != 0  ){
%>
	<errinfo>
		<errcode></errcode> 																<!-- �����ڵ� -->
		<errmsg></errmsg>																	<!-- �����޽��� -->
	</errinfo>
<%
		SE_BOI_1040_STASEM_BOGURTPERSCURRecord rec = null;
			for( int i=0; i<ds.tasem_bogurtperscur.size(); i++ ){
				rec = ( SE_BOI_1040_STASEM_BOGURTPERSCURRecord )ds.tasem_bogurtperscur.get( i );
%>
	<gurtinfo>
		<bogurt_clsf><![CDATA[<%=ds.bogurt_clsf %>]]></bogurt_clsf> <!-- ����������-->
		<gurt_pers_flnm><![CDATA[<%=rec.gurt_pers_flnm%>]]></gurt_pers_flnm>	<!-- �����μ��� -->
		<jont_debt><![CDATA[<%=ds.jont_debtgurt_limt_amt %>]]></jont_debt> <!-- ���� ����ä�������ѵ���-->
		<net_sale_amt><![CDATA[<%=ds.net_sale_amt %>]]></net_sale_amt>  <!-- ������� -->
		<add_bogurt_amt><![CDATA[<%=ds.add_bogurt_amt %>]]></add_bogurt_amt>  <!-- �߰������� -->
		<mort_amt><![CDATA[<%=ds.mort_amt %>]]></mort_amt>	<!-- ������ ���� -->
		<insr_fr_dt><![CDATA[<%=ds.insr_fr_dt %>]]></insr_fr_dt>	<!-- ����Ⱓ -->
		<insr_to_dt><![CDATA[<%=ds.insr_to_dt %>]]></insr_to_dt>	<!-- ����Ⱓ -->
		<insr_amt><![CDATA[<%=ds.insr_amt %>]]></insr_amt>	<!-- ���Աݾ� -->
		<insr_prem><![CDATA[<%=ds.insr_prem %>]]></insr_prem>	<!-- ������� -->
		<gurt_amt><%= ds.gurt_amt %></gurt_amt>		<!--���纸����-->
		<prn><%=rec.prn%></prn>				<!-- �ֹι�ȣ -->
		<zip_1><%=rec.zip_1%></zip_1>		<!-- �����ȣ1 -->
		<zip_2><%=rec.zip_2%></zip_2>		<!-- �����ȣ1 -->
		<addr><![CDATA[<%=rec.addr%>]]></addr>			<!-- �ּ� -->
		<dtls_addr><![CDATA[<%=rec.dtls_addr%>]]></dtls_addr>			<!-- ���ּ� -->
		<tel_no_1><%=rec.tel_no_1%></tel_no_1>		<!-- ��ȭ��ȣ(����) -->
		<tel_no_2><%=rec.tel_no_2%></tel_no_2>		<!-- ��ȭ��ȣ(��) -->
		<tel_no_3><%=rec.tel_no_3%></tel_no_3>		<!-- ��ȭ��ȣ(��ȣ) -->
		<ptph_no_1><%=rec.ptph_no_1%></ptph_no_1>		<!-- �޴��ȣ(���) -->
		<ptph_no_2><%=rec.ptph_no_2%></ptph_no_2>		<!-- �޴��ȣ(��) -->
		<ptph_no_3><%=rec.ptph_no_3%></ptph_no_3>		<!-- �޴��ȣ(��ȣ) -->
		<gurt_dt><%=rec.gurt_dt%></gurt_dt>						<!-- ��������� -->
		<reg_resn><%=rec.reg_resn%></reg_resn>		<!-- ��ϻ��� -->
	</gurtinfo>
<%
			}
		} else if ((ds.getErrcode() == null || ds.getErrcode().equals( "" )) && ds.tasem_bogurtperscur.size()==0 && ds.bogurt_clsf !=null) {  
%>
	<gurtinfo>
		<bogurt_clsf><![CDATA[<%=ds.bogurt_clsf %>]]></bogurt_clsf> <!-- ����������-->
		<gurt_pers_flnm></gurt_pers_flnm>	<!-- �����μ��� -->
		<jont_debt><![CDATA[<%=ds.jont_debtgurt_limt_amt %>]]></jont_debt> <!-- ���� ����ä�������ѵ���-->
		<net_sale_amt><![CDATA[<%=ds.net_sale_amt %>]]></net_sale_amt>  <!-- ������� -->
		<add_bogurt_amt><![CDATA[<%=ds.add_bogurt_amt %>]]></add_bogurt_amt>  <!-- �߰������� -->
		<mort_amt><![CDATA[<%=ds.mort_amt %>]]></mort_amt>	<!-- ������ ���� -->
		<insr_fr_dt><![CDATA[<%=ds.insr_fr_dt %>]]></insr_fr_dt>	<!-- ����Ⱓ -->
		<insr_to_dt><![CDATA[<%=ds.insr_to_dt %>]]></insr_to_dt>	<!-- ����Ⱓ -->
		<insr_amt><![CDATA[<%=ds.insr_amt %>]]></insr_amt>	<!-- ���Աݾ� -->
		<insr_prem><![CDATA[<%=ds.insr_prem %>]]></insr_prem>	<!-- ������� -->
		<gurt_amt><%= ds.gurt_amt %></gurt_amt>		<!--���纸����-->	
		<prn></prn>				<!-- �ֹι�ȣ -->
		<zip_1></zip_1>		<!-- �����ȣ1 -->
		<zip_2></zip_2>		<!-- �����ȣ1 -->
		<addr></addr>			<!-- �ּ� -->
		<dtls_addr></dtls_addr>			<!-- ���ּ� -->
		<tel_no_1></tel_no_1>		<!-- ��ȭ��ȣ(����) -->
		<tel_no_2></tel_no_2>		<!-- ��ȭ��ȣ(��) -->
		<tel_no_3></tel_no_3>		<!-- ��ȭ��ȣ(��ȣ) -->
		<ptph_no_1></ptph_no_1>		<!-- �޴��ȣ(���) -->
		<ptph_no_2></ptph_no_2>		<!-- �޴��ȣ(��) -->
		<ptph_no_3></ptph_no_3>		<!-- �޴��ȣ(��ȣ) -->
		<gurt_dt></gurt_dt>						<!-- ��������� -->
		<reg_resn></reg_resn>		<!-- ��ϻ��� -->
	</gurtinfo>
	
<%			
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- �����ڵ� -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- �����޽��� -->
	</errinfo>
	<gurtinfo>
	<bogurt_clsf></bogurt_clsf> <!-- ����������-->
	<gurt_pers_flnm></gurt_pers_flnm>	<!-- �����μ��� -->
	<jont_debt></jont_debt> <!-- ���� ����ä�������ѵ���-->
	<net_sale_amt></net_sale_amt>  <!-- ������� -->
	<add_bogurt_amt></add_bogurt_amt>  <!-- �߰������� -->
	<mort_amt></mort_amt>	<!-- ������ ���� -->
	<insr_fr_dt></insr_fr_dt>	<!-- ����Ⱓ -->
	<insr_to_dt></insr_to_dt>	<!-- ����Ⱓ -->
	<insr_amt></insr_amt>	<!-- ���Աݾ� -->
	<insr_prem></insr_prem>	<!-- ������� -->
	<gurt_amt></gurt_amt>		<!--���纸����-->
	<prn></prn>				<!-- �ֹι�ȣ -->
	<zip_1></zip_1>		<!-- �����ȣ1 -->
	<zip_2></zip_2>		<!-- �����ȣ1 -->
	<addr></addr>			<!-- �ּ� -->
	<dtls_addr></dtls_addr>			<!-- ���ּ� -->
	<tel_no_1></tel_no_1>		<!-- ��ȭ��ȣ(����) -->
	<tel_no_2></tel_no_2>		<!-- ��ȭ��ȣ(��) -->
	<tel_no_3></tel_no_3>		<!-- ��ȭ��ȣ(��ȣ) -->
	<ptph_no_1></ptph_no_1>		<!-- �޴��ȣ(���) -->
	<ptph_no_2></ptph_no_2>		<!-- �޴��ȣ(��) -->
	<ptph_no_3></ptph_no_3>		<!-- �޴��ȣ(��ȣ) -->
	<gurt_dt></gurt_dt>						<!-- ��������� -->
	<reg_resn></reg_resn>		<!-- ��ϻ��� -->
	</gurtinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- �����ڵ� -->
		<errmsg><![CDATA[�ý��ۿ� ������ �߻��Ͽ����ϴ�. �����ڿ��� �����Ͻñ� �ٶ��ϴ�.]]></errmsg>		<!-- �����޽��� -->
	</errinfo>
	</errinfo>
	<gurtinfo>
		<bogurt_clsf></bogurt_clsf> <!-- ����������-->
		<gurt_pers_flnm></gurt_pers_flnm>	<!-- �����μ��� -->
		<jont_debt></jont_debt> <!-- ���� ����ä�������ѵ���-->
		<net_sale_amt></net_sale_amt>  <!-- ������� -->
		<add_bogurt_amt></add_bogurt_amt>  <!-- �߰������� -->
		<mort_amt></mort_amt>	<!-- ������ ���� -->
		<insr_fr_dt></insr_fr_dt>	<!-- ����Ⱓ -->
		<insr_to_dt></insr_to_dt>	<!-- ����Ⱓ -->
 		<insr_amt></insr_amt>	<!-- ���Աݾ� -->
		<insr_prem></insr_prem>	<!-- ������� -->
		<gurt_amt></gurt_amt>		<!--���纸����-->
		<prn></prn>				<!-- �ֹι�ȣ -->
		<zip_1></zip_1>		<!-- �����ȣ1 -->
		<zip_2></zip_2>		<!-- �����ȣ1 -->
		<addr></addr>			<!-- �ּ� -->
		<dtls_addr></dtls_addr>			<!-- ���ּ� -->
		<tel_no_1></tel_no_1>		<!-- ��ȭ��ȣ(����) -->
		<tel_no_2></tel_no_2>		<!-- ��ȭ��ȣ(��) -->
		<tel_no_3></tel_no_3>		<!-- ��ȭ��ȣ(��ȣ) -->
		<ptph_no_1></ptph_no_1>		<!-- �޴��ȣ(���) -->
		<ptph_no_2></ptph_no_2>		<!-- �޴��ȣ(��) -->
		<ptph_no_3></ptph_no_3>		<!-- �޴��ȣ(��ȣ) -->
		<gurt_dt></gurt_dt>						<!-- ��������� -->
		<reg_resn></reg_resn>		<!-- ��ϻ��� -->
	</gurtinfo>
<%
	}
%>
</gurtlist>