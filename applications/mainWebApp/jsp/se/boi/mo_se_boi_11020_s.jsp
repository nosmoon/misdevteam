<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_boi_11020_l.jsp
* ���       : ������������-���ͱ�������, ������ ����
* �ۼ�����   : 2016-12-07
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_MO_BOI_1020_SDataSet ds = ( SE_MO_BOI_1020_SDataSet )request.getAttribute("ds");  // request dataset
%>
<boinfolist>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> <!-- �����ڵ� -->
		<errmsg></errmsg>	<!-- �����޽��� -->
	</errinfo>
	<boinfo>
		<jbjiorder><![CDATA[<%=ds.jbjiorder%>]]></jbjiorder> <!--�뼱����-->
		<jbpansu><%=ds.jbpansu%></jbpansu><!--�Ǽ�-->
		<jbbusu><%=ds.jbbusu%></jbbusu><!--�߼ۺμ�-->
		<rdr_qty><%=ds.rdr_qty%></rdr_qty><!--���ںμ�-->
<%
		String orgn_clsfnm = "";

		SE_MO_BOI_1020_SCOMMCDCUR1Record rec1 = null;
			for(int i=0; i<ds.commcdcur1.size(); i++){
				rec1 = (SE_MO_BOI_1020_SCOMMCDCUR1Record)ds.commcdcur1.get(i);

				String cd = rec1.cd;
				String orgn_clsf  = ds.orgn_clsf;

				if(cd.equals(orgn_clsf)){
					orgn_clsfnm = rec1.cdnm;
				}
			}
%>
      <orgn_clsf><%=ds.orgn_clsf%></orgn_clsf>	<!-- ��ϱ����ڵ� -->
      <orgn_clsfnm><![CDATA[<%=orgn_clsfnm %>]]></orgn_clsfnm> <!-- ��ϱ��и� -->
      <bo_cd><%=ds.bo_cd%></bo_cd><!-- �����ڵ� -->
      <bo_nm><![CDATA[<%=ds.bo_nm%>]]></bo_nm><!-- ���͸� -->
<%
		String area_nm = "";

		SE_MO_BOI_1020_SCOMMCDCUR2Record rec2 = null;
			for(int i=0; i<ds.commcdcur2.size(); i++){
				rec2 = (SE_MO_BOI_1020_SCOMMCDCUR2Record)ds.commcdcur2.get(i);

				String cd = rec2.cd;
				String area_cd  = ds.area_cd;

				if(cd.equals(area_cd)){
					area_nm = rec2.cdnm;
				}
			}
%>
      	<area_cd><%=ds.area_cd%></area_cd><!-- �����ڵ� -->
      	<area_nm><![CDATA[<%=area_nm %>]]></area_nm><!-- �����ڵ�� -->
      	<bo_cntr_dt><%=ds.bo_cntr_dt%></bo_cntr_dt><!-- ������� -->
      	<bo_head_nm><![CDATA[<%=ds.bo_head_nm%>]]></bo_head_nm> <!-- ���ʹ�ǥ�� -->
      	<bo_head_prn><![CDATA[<%=ds.bo_head_prn%>]]></bo_head_prn> <!-- ���ʹ�ǥ�ֹι�ȣ -->
      	<email><%=ds.email %></email><!-- �̸��� -->
		<tel_no_1_1><%=ds.tel_no_1_1%></tel_no_1_1>                                     <!-- ��ȭ1-1                    -->
		<tel_no_1_2><%=ds.tel_no_1_2%></tel_no_1_2>                                     <!-- ��ȭ1-2                    -->
		<tel_no_1_3><%=ds.tel_no_1_3%></tel_no_1_3>                                     <!-- ��ȭ1-3                    -->
		<tel_no_2_1><%=ds.tel_no_2_1%></tel_no_2_1>                                     <!-- ��ȭ2-1                    -->
		<tel_no_2_2><%=ds.tel_no_2_2%></tel_no_2_2>                                     <!-- ��ȭ2-2                    -->
		<tel_no_2_3><%=ds.tel_no_2_3%></tel_no_2_3>                                     <!-- ��ȭ2-3                    -->
		<bo_zip_1><%=ds.bo_zip_1%></bo_zip_1>                                           <!-- ��������1                  -->
		<bo_zip_2><%=ds.bo_zip_2%></bo_zip_2>                                           <!-- ��������2                  -->
		<bo_addr><![CDATA[<%=ds.bo_addr%>]]></bo_addr>                                  <!-- �����ּ�                   -->
		<bo_dtls_addr><![CDATA[<%=ds.bo_dtls_addr%>]]></bo_dtls_addr>                   <!-- �������ּ�               -->
<%
		String jd_sell_net_clsf_nm = "";

			SE_MO_BOI_1020_SCOMMCDCUR7Record rec7 = null;
			for(int i=0; i<ds.commcdcur7.size(); i++){
				rec7 = (SE_MO_BOI_1020_SCOMMCDCUR7Record)ds.commcdcur7.get(i);

				String cd = rec7.cd;
				String jd_sell_net_clsf  = ds.jd_sell_net_clsf;

				if(cd.equals(jd_sell_net_clsf)){
					jd_sell_net_clsf_nm = rec7.cdnm;
				}
			}
%>
		<jd_sell_net_clsf><%=ds.jd_sell_net_clsf%></jd_sell_net_clsf>                   <!-- �����ǸŸ������ڵ�   -->
		<jd_sell_net_clsf_nm><%=jd_sell_net_clsf_nm %></jd_sell_net_clsf_nm>                   <!-- �����ǸŸ����и�   -->
		<sido_gugun_cd><%=ds.sido_gugun_cd%></sido_gugun_cd>                            <!-- �ñ����ڵ�                 -->
		<sido_gugun_nm><![CDATA[<%=ds.sido_gugun_nm%>]]></sido_gugun_nm>                <!-- �ñ����ڵ��               -->
<%
		String adms_dstc_nm = "";

			SE_MO_BOI_1020_SCOMMCDCUR9Record rec9 = null;
			for(int i=0; i<ds.commcdcur9.size(); i++){
				rec9 = (SE_MO_BOI_1020_SCOMMCDCUR9Record)ds.commcdcur9.get(i);

				String cd = rec9.cd;
				String adms_dstc_cd  = ds.adms_dstc_cd;

				if(cd.equals(adms_dstc_cd)){
					adms_dstc_nm = rec9.cdnm;
				}
			}
%>
		<adms_dstc_cd><%=ds.adms_dstc_cd%></adms_dstc_cd>                               <!-- ���������ڵ�-->
		<adms_dstc_nm><![CDATA[<%=adms_dstc_nm%>]]></adms_dstc_nm>                               <!-- ����������-->
<%
		String adms_unit_clsf_nm = "";

			SE_MO_BOI_1020_SCOMMCDCUR10Record rec10 = null;
			for(int i=0; i<ds.commcdcur10.size(); i++){
				rec10 = (SE_MO_BOI_1020_SCOMMCDCUR10Record)ds.commcdcur10.get(i);

				String cd = rec10.cd;
				String adms_unit_clsf  = ds.adms_unit_clsf;

				if(cd.equals(adms_unit_clsf)){
					adms_unit_clsf_nm = rec10.cdnm;
				}
			}
%>
		<adms_unit_clsf><%=ds.adms_unit_clsf%></adms_unit_clsf>                         <!-- ���������ڵ�-->
		<adms_unit_clsf_nm><%=adms_unit_clsf_nm %></adms_unit_clsf_nm>                         <!-- ����������-->
		<acct_no><%=ds.acct_no %></acct_no>				<!-- ������� -->
	</boinfo>
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> <!-- �����ڵ� -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>	<!-- �����޽��� -->
	</errinfo>
	<boinfo>
		<jbjiorder></jbjiorder> <!--�뼱����-->
		<jbpansu></jbpansu><!--�Ǽ�-->
		<jbbusu></jbbusu><!--�߼ۺμ�-->
		<rdr_qty></rdr_qty><!--���ںμ�-->
		<orgn_clsf></orgn_clsf>	<!-- ��ϱ����ڵ� -->
		<orgn_clsfnm></orgn_clsfnm> <!-- ��ϱ��и� -->
		<bo_cd></bo_cd><!-- �����ڵ� -->
		<bo_nm></bo_nm><!-- ���͸� -->
		<area_cd></area_cd><!-- �����ڵ� -->
		<area_nm></area_nm><!-- �����ڵ�� -->
		<bo_cntr_dt></bo_cntr_dt><!-- ������� -->
		<bo_head_nm></bo_head_nm> <!-- ���ʹ�ǥ�� -->
   	<bo_head_prn></bo_head_prn> <!-- ���ʹ�ǥ�ֹι�ȣ -->
		<email></email><!-- �̸��� -->
		<tel_no_1_1></tel_no_1_1>                                     <!-- ��ȭ1-1                    -->
		<tel_no_1_2></tel_no_1_2>                                     <!-- ��ȭ1-2                    -->
		<tel_no_1_3></tel_no_1_3>                                     <!-- ��ȭ1-3                    -->
		<tel_no_2_1></tel_no_2_1>                                     <!-- ��ȭ2-1                    -->
		<tel_no_2_2></tel_no_2_2>                                     <!-- ��ȭ2-2                    -->
		<tel_no_2_3></tel_no_2_3>                                     <!-- ��ȭ2-3                    -->
		<bo_zip_1></bo_zip_1>                                           <!-- ��������1                  -->
		<bo_zip_2></bo_zip_2>                                           <!-- ��������2                  -->
		<bo_addr></bo_addr>                                  <!-- �����ּ�                   -->
		<bo_dtls_addr></bo_dtls_addr>                   <!-- �������ּ�               -->
		<jd_sell_net_clsf></jd_sell_net_clsf>                   <!-- �����ǸŸ������ڵ�   -->
		<jd_sell_net_clsf_nm></jd_sell_net_clsf_nm>                   <!-- �����ǸŸ����и�   -->
		<sido_gugun_cd></sido_gugun_cd>                            <!-- �ñ����ڵ�                 -->
		<sido_gugun_nm></sido_gugun_nm>                <!-- �ñ����ڵ��               -->
		<adms_dstc_cd></adms_dstc_cd>                               <!-- ���������ڵ�-->
		<adms_dstc_nm></adms_dstc_nm>                               <!-- ����������-->
		<adms_unit_clsf></adms_unit_clsf>                         <!-- ���������ڵ�-->
		<adms_unit_clsf_nm></adms_unit_clsf_nm>                         <!-- ����������-->
		<acct_no></acct_no>				<!-- ������� -->
	</boinfo>

<%
		}
	}else{
%>
	<errinfo>
		<errcode></errcode> <!-- �����ڵ� -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>	<!-- �����޽��� -->
	</errinfo>
	<boinfo>
		<jbjiorder></jbjiorder> <!--�뼱����-->
		<jbpansu></jbpansu><!--�Ǽ�-->
		<jbbusu></jbbusu><!--�߼ۺμ�-->
		<rdr_qty></rdr_qty><!--���ںμ�-->
		<orgn_clsf></orgn_clsf>	<!-- ��ϱ����ڵ� -->
		<orgn_clsfnm></orgn_clsfnm> <!-- ��ϱ��и� -->
		<bo_cd></bo_cd><!-- �����ڵ� -->
		<bo_nm></bo_nm><!-- ���͸� -->
		<area_cd></area_cd><!-- �����ڵ� -->
		<area_nm></area_nm><!-- �����ڵ�� -->
		<bo_cntr_dt></bo_cntr_dt><!-- ������� -->
		<bo_head_nm></bo_head_nm> <!-- ���ʹ�ǥ�� -->
   	<bo_head_prn></bo_head_prn> <!-- ���ʹ�ǥ�ֹι�ȣ -->
		<email></email><!-- �̸��� -->
		<tel_no_1_1></tel_no_1_1>                                     <!-- ��ȭ1-1                    -->
		<tel_no_1_2></tel_no_1_2>                                     <!-- ��ȭ1-2                    -->
		<tel_no_1_3></tel_no_1_3>                                     <!-- ��ȭ1-3                    -->
		<tel_no_2_1></tel_no_2_1>                                     <!-- ��ȭ2-1                    -->
		<tel_no_2_2></tel_no_2_2>                                     <!-- ��ȭ2-2                    -->
		<tel_no_2_3></tel_no_2_3>                                     <!-- ��ȭ2-3                    -->
		<bo_zip_1></bo_zip_1>                                           <!-- ��������1                  -->
		<bo_zip_2></bo_zip_2>                                           <!-- ��������2                  -->
		<bo_addr></bo_addr>                                  <!-- �����ּ�                   -->
		<bo_dtls_addr></bo_dtls_addr>                   <!-- �������ּ�               -->
		<jd_sell_net_clsf></jd_sell_net_clsf>                   <!-- �����ǸŸ������ڵ�   -->
		<jd_sell_net_clsf_nm></jd_sell_net_clsf_nm>                   <!-- �����ǸŸ����и�   -->
		<sido_gugun_cd></sido_gugun_cd>                            <!-- �ñ����ڵ�                 -->
		<sido_gugun_nm></sido_gugun_nm>                <!-- �ñ����ڵ��               -->
		<adms_dstc_cd></adms_dstc_cd>                               <!-- ���������ڵ�-->
		<adms_dstc_nm></adms_dstc_nm>                               <!-- ����������-->
		<adms_unit_clsf></adms_unit_clsf>                         <!-- ���������ڵ�-->
		<adms_unit_clsf_nm></adms_unit_clsf_nm>                         <!-- ����������-->
		<acct_no></acct_no>				<!-- ������� -->
	</boinfo>
<%
	}
%>
</boinfolist>