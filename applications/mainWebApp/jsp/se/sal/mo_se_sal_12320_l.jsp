<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_sal_12320_l.jsp
* ���       :
* �ۼ�����   :
* �ۼ���     :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SE_MO_SAL_2320_LDataSet ds = ( SE_MO_SAL_2320_LDataSet )request.getAttribute("ds");  // request dataset
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
<!-- �������ڷḮ��Ʈ ���� -->
<%
			if( ds.curlist.size() > 0 ){
				SE_MO_SAL_2320_LCURLISTRecord rec = null;
				for( int i=0; i<ds.curlist.size(); i++ ){
					rec = ( SE_MO_SAL_2320_LCURLISTRecord )ds.curlist.get( i );
%>
	<curlistinfo>
		<bo_nm><![CDATA[<%=rec.bo_nm%>]]></bo_nm>									<!-- ���� -->
		<bo_head_nm><![CDATA[<%=rec.bo_head_nm%>]]></bo_head_nm>					<!-- ���ʹ�ǥ -->
		<net_sale_amt><%=rec.net_sale_amt%></net_sale_amt>							<!-- �������� -->
		<app_gurt><%=rec.app_gurt%></app_gurt>										<!-- �߰������� -->
		<net_sale_amt_610><%=rec.net_sale_amt_610%></net_sale_amt_610>				<!-- ���������� -->
		<smt_amt1><%=rec.smt_amt1%></smt_amt1>										<!-- �հ� -->
		<compen_divn_amt><%=rec.compen_divn_amt%></compen_divn_amt>					<!-- ���˹���꼭 -->
		<tax_compen_divn_amt><%=rec.tax_compen_divn_amt%></tax_compen_divn_amt>		<!-- ���˹����ݰ�꼭 -->
		<vat_compen_divn_amt><%=rec.vat_compen_divn_amt%></vat_compen_divn_amt>		<!-- ���˹��ΰ��� -->
		<smt_amt2><%=rec.smt_amt2%></smt_amt2>										<!-- ���˹��հ� -->
		<pdlv_altn_amt><%= rec.pdlv_altn_amt %></pdlv_altn_amt><!-- ��۴�ü�ݾ� -->
		<smt><%= rec.smt  %></smt><!-- �Ѱ� -->
	</curlistinfo>
<%
				}
			}else{
%>
	<curlistinfo>
		<bo_nm></bo_nm>																<!-- ���� -->
		<bo_head_nm></bo_head_nm>													<!-- ���ʹ�ǥ -->
		<net_sale_amt></net_sale_amt>												<!-- �������� -->
		<app_gurt></app_gurt>														<!-- �߰������� -->
		<net_sale_amt_610></net_sale_amt_610>										<!-- ���������� -->
		<smt_amt1></smt_amt1>														<!-- �հ� -->
		<compen_divn_amt></compen_divn_amt>											<!-- ���˹���꼭 -->
		<tax_compen_divn_amt></tax_compen_divn_amt>									<!-- ���˹����ݰ�꼭 -->
		<vat_compen_divn_amt></vat_compen_divn_amt>									<!-- ���˹��ΰ��� -->
		<smt_amt2></smt_amt2>														<!-- ���˹��հ� -->
		<pdlv_altn_amt></pdlv_altn_amt><!-- ��۴�ü�ݾ� -->
		<smt></smt><!-- �Ѱ� -->
	</curlistinfo>
<%
			}
%>
<!-- �������ڷḮ��Ʈ �� -->
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- �����ڵ� -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- �����޽��� -->
	</errinfo>
	<curlistinfo>
		<bo_nm></bo_nm>																<!-- ���� -->
		<bo_head_nm></bo_head_nm>													<!-- ���ʹ�ǥ -->
		<net_sale_amt></net_sale_amt>												<!-- �������� -->
		<app_gurt></app_gurt>														<!-- �߰������� -->
		<net_sale_amt_610></net_sale_amt_610>										<!-- ���������� -->
		<smt_amt1></smt_amt1>														<!-- �հ� -->
		<compen_divn_amt></compen_divn_amt>											<!-- ���˹���꼭 -->
		<tax_compen_divn_amt></tax_compen_divn_amt>									<!-- ���˹����ݰ�꼭 -->
		<vat_compen_divn_amt></vat_compen_divn_amt>									<!-- ���˹��ΰ��� -->
		<smt_amt2></smt_amt2>														<!-- ���˹��հ� -->
		<pdlv_altn_amt></pdlv_altn_amt><!-- ��۴�ü�ݾ� -->
		<smt></smt><!-- �Ѱ� -->
	</curlistinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- �����ڵ� -->
		<errmsg><![CDATA[�ý��ۿ� ������ �߻��Ͽ����ϴ�. �����ڿ��� �����Ͻñ� �ٶ��ϴ�.]]></errmsg>		<!-- �����޽��� -->
	</errinfo>
	<curlistinfo>
		<bo_nm></bo_nm>																<!-- ���� -->
		<bo_head_nm></bo_head_nm>													<!-- ���ʹ�ǥ -->
		<net_sale_amt></net_sale_amt>												<!-- �������� -->
		<app_gurt></app_gurt>														<!-- �߰������� -->
		<net_sale_amt_610></net_sale_amt_610>										<!-- ���������� -->
		<smt_amt1></smt_amt1>														<!-- �հ� -->
		<compen_divn_amt></compen_divn_amt>											<!-- ���˹���꼭 -->
		<tax_compen_divn_amt></tax_compen_divn_amt>									<!-- ���˹����ݰ�꼭 -->
		<vat_compen_divn_amt></vat_compen_divn_amt>									<!-- ���˹��ΰ��� -->
		<smt_amt2></smt_amt2>														<!-- ���˹��հ� -->
		<area_nm></area_nm>															<!-- ������ -->
		<deposit_only_bank_account></deposit_only_bank_account>						<!-- ������� -->
		<pdlv_altn_amt></pdlv_altn_amt><!-- ��۴�ü�ݾ� -->
		<smt></smt><!-- �Ѱ� -->
	</curlistinfo>
<%
	}
%>
</curlist>