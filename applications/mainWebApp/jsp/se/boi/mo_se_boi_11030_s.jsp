<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_boi_11030_s.jsp
* ���       : ������������-���ʹ�ǥ����(��������, �з¹װ��, ��������, ���Ұ�)
* �ۼ�����   : 2016-12-02
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SE_BOI_1030_SDataSet ds = ( SE_BOI_1030_SDataSet )request.getAttribute("ds");  // request dataset
%>
<boheadlist>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> 																<!-- �����ڵ� -->
		<errmsg></errmsg>																	<!-- �����޽��� -->
	</errinfo>
	<boinfo>
		<bo_head_nm><![CDATA[<%= ds.bo_head_nm %>]]></bo_head_nm>         <!-- �������        -->
		<bo_head_prn><%= ds.bo_head_prn %></bo_head_prn>                  <!-- �ֹι�ȣ        -->
		<tel_no_0><%= ds.tel_no_0 %></tel_no_0>                           <!-- ��ȭ1           -->
		<tel_no_1><%= ds.tel_no_1 %></tel_no_1>                           <!-- ��ȭ2           -->
		<tel_no_2><%= ds.tel_no_2 %></tel_no_2>                           <!-- ��ȭ3           -->
		<tel_no_3><%= ds.tel_no_3 %></tel_no_3>                           <!-- ��ȭ4           -->
		<ptph_no_1><%= ds.ptph_no_1 %></ptph_no_1>                        <!-- �޴���1         -->
		<ptph_no_2><%= ds.ptph_no_2 %></ptph_no_2>                        <!-- �޴���2         -->
		<ptph_no_3><%= ds.ptph_no_3 %></ptph_no_3>                        <!-- �޴���3         -->
		<bo_head_bidt><%= ds.bo_head_bidt %></bo_head_bidt>               <!-- ���������      -->
		<luso_clsf><%= ds.luso_clsf %></luso_clsf>                        <!-- ��������ϱ���  -->
		<wedd_anvy_dd><%= ds.wedd_anvy_dd %></wedd_anvy_dd>               <!-- ��ȥ�����      -->
		<zip_1><%= ds.zip_1 %></zip_1>                                    <!-- ���ÿ���1       -->
		<zip_2><%= ds.zip_2 %></zip_2>                                    <!-- ���ÿ���2       -->
		<addr><%= ds.addr %></addr>                                       <!-- �����ּ�        -->
		<dtls_addr><%= ds.dtls_addr %></dtls_addr>                        <!-- ���û��ּ�    -->
		<nativ><%= ds.nativ %></nativ>                                    <!-- �����          -->
		<hby><%= ds.hby %></hby>                                          <!-- ���            -->
		<relg><%= ds.relg %></relg>                                       <!-- ����            -->
		<drink_qunt><%= ds.drink_qunt %></drink_qunt>                     <!-- �ַ�            -->
		<smok_yn><%= ds.smok_yn %></smok_yn>                              <!-- ������        -->
		<bo_head_phot><%= ds.bo_head_phot %></bo_head_phot>               <!-- ���������      -->
		<phot_size><%= ds.phot_size %></phot_size>                        <!-- ����������      -->
		<dlco_no><%= ds.dlco_no %></dlco_no>                              <!-- �ŷ�ó��ȣ      -->
		<ern><%= ds.ern %></ern>                                          <!-- �ֹ�/����ڹ�ȣ -->
		<bank_nm><![CDATA[<%= ds.bank_nm %>]]></bank_nm>                  <!-- �����          -->
		<acct_no><%= ds.acct_no %></acct_no>                              <!-- ���¹�ȣ        -->
		<rcpm_main_nm><![CDATA[<%= ds.rcpm_main_nm %>]]></rcpm_main_nm>   <!-- �Ա��ָ� -->
	</boinfo>

<!-- �з¹��̷¸���Ʈ ���� -->
<%
			if( ds.boheadhstycur.size() > 0 ){
				SE_BOI_1030_SBOHEADHSTYCURRecord rec = null;
				for( int i=0; i<ds.boheadhstycur.size(); i++ ){
					rec = ( SE_BOI_1030_SBOHEADHSTYCURRecord )ds.boheadhstycur.get( i );
%>
	<boheadhstycurinfo>
		<hsty_seq><%=rec.hsty_seq%></hsty_seq>												<!-- �̷¼��� -->
		<yymm><%=rec.yymm%></yymm>															<!-- ��� -->
		<hsty_matt><%=rec.hsty_matt%></hsty_matt>											<!-- �̷»��� -->
	</boheadhstycurinfo>
<%
				}
			}else{
%>
	<boheadhstycurinfo>
		<hsty_seq></hsty_seq>																<!-- �̷¼��� -->
		<yymm></yymm>																		<!-- ��� -->
		<hsty_matt></hsty_matt>																<!-- �̷»��� -->
	</boheadhstycurinfo>
<%
			}
%>
<!-- �з¹��̷¸���Ʈ �� -->
<!-- �������ʸ���Ʈ ���� -->
<%
			if( ds.boheadfamcur.size() > 0 ){
				SE_BOI_1030_SBOHEADFAMCURRecord rec = null;
				for( int i=0; i<ds.boheadfamcur.size(); i++ ){
					rec = ( SE_BOI_1030_SBOHEADFAMCURRecord )ds.boheadfamcur.get( i );
%>
	<boheadfamcurinfo>
		<faml_seq><%=rec.faml_seq%></faml_seq>												<!-- �������� -->
		<flnm><![CDATA[<%=rec.flnm%>]]></flnm>												<!-- ���� -->
		<faml_rshp_cd><%=rec.faml_rshp_cd%></faml_rshp_cd>									<!-- ���������ڵ� -->
		<faml_rshp_nm><![CDATA[<%=rec.faml_rshp_nm%>]]></faml_rshp_nm>						<!-- ���������ڵ�� -->
		<bidt><%=rec.bidt%></bidt>															<!-- ������� -->
		<luso_clsf><%=rec.luso_clsf%></luso_clsf>											<!-- ���籸�� -->
	</boheadfamcurinfo>
<%
				}
			}else{
%>
	<boheadfamcurinfo>
		<faml_seq></faml_seq>																<!-- �������� -->
		<flnm></flnm>																		<!-- ���� -->
		<faml_rshp_cd></faml_rshp_cd>														<!-- ���������ڵ� -->
		<faml_rshp_nm></faml_rshp_nm>														<!-- ���������ڵ�� -->
		<bidt></bidt>																		<!-- ������� -->
		<luso_clsf></luso_clsf>																<!-- ���籸�� -->
	</boheadfamcurinfo>
<%
			}
%>
<!-- �������ʸ���Ʈ �� -->
<!-- ������Ұ߸���Ʈ ���� -->
<%
			if( ds.boheadideacur.size() > 0 ){
				SE_BOI_1030_SBOHEADIDEACURRecord rec = null;
				for( int i=0; i<ds.boheadideacur.size(); i++ ){
					rec = ( SE_BOI_1030_SBOHEADIDEACURRecord )ds.boheadideacur.get( i );
%>
	<boheadideacurinfo>
		<idea_seq><%=rec.idea_seq%></idea_seq>												<!-- �Ұ߼��� -->
		<make_dt><%=rec.make_dt%></make_dt>													<!-- �ۼ����� -->
		<make_pers_nm><![CDATA[<%=rec.make_pers_nm%>]]></make_pers_nm>						<!-- �ۼ��ڸ� -->
		<idea><%=rec.idea%></idea>															<!-- �Ұ� -->
	</boheadideacurinfo>
<%
				}
			}else{
%>
	<boheadideacurinfo>
		<idea_seq></idea_seq>																<!-- �Ұ߼��� -->
		<make_dt></make_dt>																	<!-- �ۼ����� -->
		<make_pers_nm></make_pers_nm>														<!-- �ۼ��ڸ� -->
		<idea></idea>																		<!-- �Ұ� -->
	</boheadideacurinfo>
<%
			}
%>
<!-- ������Ұ߸���Ʈ �� -->
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- �����ڵ� -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- �����޽��� -->
	</errinfo>
	<boinfo>
		<bo_head_nm></bo_head_nm>      <!-- �������        -->
		<bo_head_prn></bo_head_prn>    <!-- �ֹι�ȣ        -->
		<tel_no_0></tel_no_0>          <!-- ��ȭ1           -->
		<tel_no_1></tel_no_1>          <!-- ��ȭ2           -->
		<tel_no_2></tel_no_2>          <!-- ��ȭ3           -->
		<tel_no_3></tel_no_3>          <!-- ��ȭ4           -->
		<ptph_no_1></ptph_no_1>        <!-- �޴���1         -->
		<ptph_no_2></ptph_no_2>        <!-- �޴���2         -->
		<ptph_no_3></ptph_no_3>        <!-- �޴���3         -->
		<bo_head_bidt></bo_head_bidt>  <!-- ���������      -->
		<luso_clsf></luso_clsf>        <!-- ��������ϱ���  -->
		<wedd_anvy_dd></wedd_anvy_dd>  <!-- ��ȥ�����      -->
		<zip_1><                       <!-- ���ÿ���1       -->
		<zip_2></zip_2>                <!-- ���ÿ���2       -->
		<addr></addr>                  <!-- �����ּ�        -->
		<dtls_addr></dtls_addr>        <!-- ���û��ּ�    -->
		<nativ></nativ>                <!-- �����          -->
		<hby></hby>                    <!-- ���            -->
		<relg></relg>                  <!-- ����            -->
		<drink_qunt></drink_qunt>      <!-- �ַ�            -->
		<smok_yn></smok_yn>            <!-- ������        -->
		<bo_head_phot></bo_head_phot>  <!-- ���������      -->
		<phot_size></phot_size>        <!-- ����������      -->
		<dlco_no></dlco_no>            <!-- �ŷ�ó��ȣ      -->
		<ern></ern>                    <!-- �ֹ�/����ڹ�ȣ -->
		<bank_nm></bank_nm>            <!-- �����          -->
		<acct_no></acct_no>            <!-- ���¹�ȣ        -->
		<rcpm_main_nm></rcpm_main_nm>  <!--                 -->
	</boinfo>
	<boheadhstycurinfo>
		<hsty_seq></hsty_seq>							<!-- �̷¼��� -->
		<yymm></yymm>									<!-- ��� -->
		<hsty_matt></hsty_matt>							<!-- �̷»��� -->
	</boheadhstycurinfo>
	<boheadfamcurinfo>
		<faml_seq></faml_seq>							<!-- �������� -->
		<flnm></flnm>									<!-- ���� -->
		<faml_rshp_cd></faml_rshp_cd>					<!-- ���������ڵ� -->
		<faml_rshp_nm></faml_rshp_nm>					<!-- ���������ڵ�� -->
		<bidt></bidt>									<!-- ������� -->
		<luso_clsf></luso_clsf>							<!-- ���籸�� -->
	</boheadfamcurinfo>
	<boheadideacurinfo>
		<idea_seq></idea_seq>							<!-- �Ұ߼��� -->
		<make_dt></make_dt>								<!-- �ۼ����� -->
		<make_pers_nm></make_pers_nm>					<!-- �ۼ��ڸ� -->
		<idea></idea>									<!-- �Ұ� -->
	</boheadideacurinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- �����ڵ� -->
		<errmsg><![CDATA[�ý��ۿ� ������ �߻��Ͽ����ϴ�. �����ڿ��� �����Ͻñ� �ٶ��ϴ�.]]></errmsg>		<!-- �����޽��� -->
	</errinfo>
	<boinfo>
		<bo_head_nm></bo_head_nm>      <!-- �������        -->
		<bo_head_prn></bo_head_prn>    <!-- �ֹι�ȣ        -->
		<tel_no_0></tel_no_0>          <!-- ��ȭ1           -->
		<tel_no_1></tel_no_1>          <!-- ��ȭ2           -->
		<tel_no_2></tel_no_2>          <!-- ��ȭ3           -->
		<tel_no_3></tel_no_3>          <!-- ��ȭ4           -->
		<ptph_no_1></ptph_no_1>        <!-- �޴���1         -->
		<ptph_no_2></ptph_no_2>        <!-- �޴���2         -->
		<ptph_no_3></ptph_no_3>        <!-- �޴���3         -->
		<bo_head_bidt></bo_head_bidt>  <!-- ���������      -->
		<luso_clsf></luso_clsf>        <!-- ��������ϱ���  -->
		<wedd_anvy_dd></wedd_anvy_dd>  <!-- ��ȥ�����      -->
		<zip_1><                       <!-- ���ÿ���1       -->
		<zip_2></zip_2>                <!-- ���ÿ���2       -->
		<addr></addr>                  <!-- �����ּ�        -->
		<dtls_addr></dtls_addr>        <!-- ���û��ּ�    -->
		<nativ></nativ>                <!-- �����          -->
		<hby></hby>                    <!-- ���            -->
		<relg></relg>                  <!-- ����            -->
		<drink_qunt></drink_qunt>      <!-- �ַ�            -->
		<smok_yn></smok_yn>            <!-- ������        -->
		<bo_head_phot></bo_head_phot>  <!-- ���������      -->
		<phot_size></phot_size>        <!-- ����������      -->
		<dlco_no></dlco_no>            <!-- �ŷ�ó��ȣ      -->
		<ern></ern>                    <!-- �ֹ�/����ڹ�ȣ -->
		<bank_nm></bank_nm>            <!-- �����          -->
		<acct_no></acct_no>            <!-- ���¹�ȣ        -->
		<rcpm_main_nm></rcpm_main_nm>  <!--                 -->
	</boinfo>
	<boheadhstycurinfo>
		<hsty_seq></hsty_seq>							<!-- �̷¼��� -->
		<yymm></yymm>									<!-- ��� -->
		<hsty_matt></hsty_matt>							<!-- �̷»��� -->
	</boheadhstycurinfo>
	<boheadfamcurinfo>
		<faml_seq></faml_seq>							<!-- �������� -->
		<flnm></flnm>									<!-- ���� -->
		<faml_rshp_cd></faml_rshp_cd>					<!-- ���������ڵ� -->
		<faml_rshp_nm></faml_rshp_nm>					<!-- ���������ڵ�� -->
		<bidt></bidt>									<!-- ������� -->
		<luso_clsf></luso_clsf>							<!-- ���籸�� -->
	</boheadfamcurinfo>
	<boheadideacurinfo>
		<idea_seq></idea_seq>							<!-- �Ұ߼��� -->
		<make_dt></make_dt>								<!-- �ۼ����� -->
		<make_pers_nm></make_pers_nm>					<!-- �ۼ��ڸ� -->
		<idea></idea>									<!-- �Ұ� -->
	</boheadideacurinfo>
<%
	}
%>
</boheadlist>