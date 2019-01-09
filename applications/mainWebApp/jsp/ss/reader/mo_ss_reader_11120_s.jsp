<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : mo_ss_reader_11120_s.jsp
* ��� : ������Ȳ-��������-���ڰ˻� ���_����Ͽ�
* �ۼ����� : 2016-07-11
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	:
* ������	:
* ��������	:
* ������ϸ�:
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet)request.getAttribute("ds");
%>
<rdrdetail>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode><!--�����ڵ�-->
		<errmsg></errmsg><!--�����޼���-->
	</errinfo>
	<rdrinfo>
		<regdt><%=ds.regdt%></regdt>                           <!--�������           -->
		<regno><%=ds.regno%></regno>                           <!--��Ϲ�ȣ           -->
		<rdrnm><![CDATA[<%=ds.rdrnm%>]]></rdrnm>                           <!--���ڸ�             -->
		<rdr_no><%=ds.rdr_no%></rdr_no>                        <!--���ڹ�ȣ           -->
		<medicd><%=ds.medicd%></medicd>                        <!--��ü�ڵ�           -->
		<rdrtel_no1><%=ds.rdrtel_no1%></rdrtel_no1>            <!--������ȭ��ȣ1      -->
		<rdrtel_no2><%=ds.rdrtel_no2%></rdrtel_no2>            <!--������ȭ��ȣ2      -->
		<rdrtel_no3><%=ds.rdrtel_no3%></rdrtel_no3>            <!--������ȭ��ȣ3      -->
		<rdrptph_no1><%=ds.rdrptph_no1%></rdrptph_no1>         <!--�����޴�����ȣ1    -->
		<rdrptph_no2><%=ds.rdrptph_no2%></rdrptph_no2>         <!--�����޴�����ȣ2    -->
		<rdrptph_no3><%=ds.rdrptph_no3%></rdrptph_no3>         <!--�����޴�����ȣ3    -->
		<email><%=ds.email%></email>                           <!--�̸���             -->
		<bocd><%=ds.bocd%></bocd>                              <!--���������ڵ�       -->
		<botel><%=ds.botel%></botel>                           <!--������ȭ��ȣ       -->
		<bonm><![CDATA[<%=ds.bonm%>]]></bonm>                              <!--������             -->
		<dlvzip><%=ds.dlvzip%></dlvzip>                        <!--����������ȣ     -->
		<dlvaddr><![CDATA[<%=ds.dlvaddr%>]]></dlvaddr>                     <!--������ּ�         -->
		<dlvdtlsaddr><![CDATA[<%=ds.dlvdtlsaddr%>]]></dlvdtlsaddr>         <!--��������ּ�     -->
		<acpndt><%=ds.acpndt%></acpndt>                        <!--��������           -->
		<dscttypecdnm><![CDATA[<%=ds.dscttypecdnm%>]]></dscttypecdnm>      <!--����������         -->
		<dscttypecd><%=ds.dscttypecd%></dscttypecd>            <!--���������ڵ�       -->
		<acpnpathcdnm><![CDATA[<%=ds.acpnpathcdnm%>]]></acpnpathcdnm>      <!--������θ�         -->
		<titl><![CDATA[<%=ds.titl%>]]></titl>                              <!--����               -->
		<cont><![CDATA[<%=ds.cont%>]]></cont>                              <!--����               -->
		<bocnfmyn><%=ds.bocnfmyn%></bocnfmyn>                  <!--��������ó������   -->
		<boprocdt><%=ds.boprocdt%></boprocdt>                  <!--��������ó������   -->
		<boproccont><![CDATA[<%=ds.boproccont%>]]></boproccont>            <!--����ó������       -->
		<cns_empnm><![CDATA[<%=ds.cns_empnm%>]]></cns_empnm>               <!--������           -->
		<cns_empcnfmyn><%=ds.cns_empcnfmyn%></cns_empcnfmyn>   <!--����Ȯ�ο���     -->
		<cns_empcnfmdt><%=ds.cns_empcnfmdt%></cns_empcnfmdt>   <!--����Ȯ������     -->
		<cns_empremk><![CDATA[<%=ds.cns_empremk%>]]></cns_empremk>         <!--�������         -->
		<bo_procreqitm><%=ds.bo_procreqitm%></bo_procreqitm>   <!-- ����ó���ҿ�ð�  -->
		<bo_cnfmtel><%=ds.bo_cnfmtel%></bo_cnfmtel>            <!-- ����Ȯ����ȭ����  -->
		<cns_procreqitm><%=ds.cns_procreqitm%></cns_procreqitm><!-- ����ó���ҿ�ð�-->
		<cns_cnfmtel><%=ds.cns_cnfmtel%></cns_cnfmtel>         <!-- ����Ȯ����ȭ����-->
		<bldmngnn><%=ds.bldmngnn%></bldmngnn>                  <!--�ǹ�������ȣ       -->
	</rdrinfo>
<%
	}else{
%>


	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode><!--�����ڵ�-->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg><!--�����޼���-->
	</errinfo>
	<rdrinfo>
		<regdt></regdt>                  <!--�������           -->
   		<regno></regno>                  <!--��Ϲ�ȣ           -->
   		<rdrnm></rdrnm>                  <!--���ڸ�             -->
   		<rdr_no></rdr_no>                <!--���ڹ�ȣ           -->
   		<medicd></medicd>                <!--��ü�ڵ�           -->
   		<rdrtel_no1></rdrtel_no1>        <!--������ȭ��ȣ1      -->
   		<rdrtel_no2></rdrtel_no2>        <!--������ȭ��ȣ2      -->
   		<rdrtel_no3></rdrtel_no3>        <!--������ȭ��ȣ3      -->
   		<rdrptph_no1></rdrptph_no1>      <!--�����޴�����ȣ1    -->
   		<rdrptph_no2></rdrptph_no2>      <!--�����޴�����ȣ2    -->
   		<rdrptph_no3></rdrptph_no3>      <!--�����޴�����ȣ3    -->
   		<email></email>                  <!--�̸���             -->
   		<bocd></bocd>                    <!--���������ڵ�       -->
   		<botel></botel>                  <!--������ȭ��ȣ       -->
   		<bonm></bonm>                    <!--������             -->
   		<dlvzip></dlvzip>                <!--����������ȣ     -->
   		<dlvaddr></dlvaddr>              <!--������ּ�         -->
   		<dlvdtlsaddr></dlvdtlsaddr>      <!--��������ּ�     -->
   		<acpndt></acpndt>                <!--��������           -->
   		<dscttypecdnm></dscttypecdnm>    <!--����������         -->
   		<dscttypecd></dscttypecd>        <!--���������ڵ�       -->
   		<acpnpathcdnm></acpnpathcdnm>    <!--������θ�         -->
   		<titl></titl>                    <!--����               -->
   		<cont></cont>                    <!--����               -->
   		<bocnfmyn></bocnfmyn>            <!--��������ó������   -->
   		<boprocdt></boprocdt>            <!--��������ó������   -->
   		<boproccont></boproccont>        <!--����ó������       -->
   		<cns_empnm></cns_empnm>          <!--������           -->
   		<cns_empcnfmyn></cns_empcnfmyn>  <!--����Ȯ�ο���     -->
   		<cns_empcnfmdt></cns_empcnfmdt>  <!--����Ȯ������     -->
   		<cns_empremk></cns_empremk>      <!--�������         -->
   		<bo_procreqitm></bo_procreqitm>  <!-- ����ó���ҿ�ð�  -->
   		<bo_cnfmtel></bo_cnfmtel>        <!-- ����Ȯ����ȭ����  -->
   		<cns_procreqitm></cns_procreqitm><!-- ����ó���ҿ�ð�-->
   		<cns_cnfmtel></cns_cnfmtel>      <!-- ����Ȯ����ȭ����-->
   		<bldmngnn></bldmngnn>            <!-- �ǹ�������ȣ-->
	</rdrinfo>
<%
		}
	}else{
%>


	<errinfo>
		<errcode><![CDATA[-9999]]></errcode><!--�����ڵ�-->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg><!--�����޼���-->
	</errinfo>
	<rdrinfo>
		<regdt></regdt>                  <!--�������           -->
   		<regno></regno>                  <!--��Ϲ�ȣ           -->
   		<rdrnm></rdrnm>                  <!--���ڸ�             -->
   		<rdr_no></rdr_no>                <!--���ڹ�ȣ           -->
   		<medicd></medicd>                <!--��ü�ڵ�           -->
   		<rdrtel_no1></rdrtel_no1>        <!--������ȭ��ȣ1      -->
   		<rdrtel_no2></rdrtel_no2>        <!--������ȭ��ȣ2      -->
   		<rdrtel_no3></rdrtel_no3>        <!--������ȭ��ȣ3      -->
   		<rdrptph_no1></rdrptph_no1>      <!--�����޴�����ȣ1    -->
   		<rdrptph_no2></rdrptph_no2>      <!--�����޴�����ȣ2    -->
   		<rdrptph_no3></rdrptph_no3>      <!--�����޴�����ȣ3    -->
   		<email></email>                  <!--�̸���             -->
   		<bocd></bocd>                    <!--���������ڵ�       -->
   		<botel></botel>                  <!--������ȭ��ȣ       -->
   		<bonm></bonm>                    <!--������             -->
   		<dlvzip></dlvzip>                <!--����������ȣ     -->
   		<dlvaddr></dlvaddr>              <!--������ּ�         -->
   		<dlvdtlsaddr></dlvdtlsaddr>      <!--��������ּ�     -->
   		<acpndt></acpndt>                <!--��������           -->
   		<dscttypecdnm></dscttypecdnm>    <!--����������         -->
   		<dscttypecd></dscttypecd>        <!--���������ڵ�       -->
   		<acpnpathcdnm></acpnpathcdnm>    <!--������θ�         -->
   		<titl></titl>                    <!--����               -->
   		<cont></cont>                    <!--����               -->
   		<bocnfmyn></bocnfmyn>            <!--��������ó������   -->
   		<boprocdt></boprocdt>            <!--��������ó������   -->
   		<boproccont></boproccont>        <!--����ó������       -->
   		<cns_empnm></cns_empnm>          <!--������           -->
   		<cns_empcnfmyn></cns_empcnfmyn>  <!--����Ȯ�ο���     -->
   		<cns_empcnfmdt></cns_empcnfmdt>  <!--����Ȯ������     -->
   		<cns_empremk></cns_empremk>      <!--�������         -->
   		<bo_procreqitm></bo_procreqitm>  <!-- ����ó���ҿ�ð�  -->
   		<bo_cnfmtel></bo_cnfmtel>        <!-- ����Ȯ����ȭ����  -->
   		<cns_procreqitm></cns_procreqitm><!-- ����ó���ҿ�ð�-->
   		<cns_cnfmtel></cns_cnfmtel>      <!-- ����Ȯ����ȭ����-->
   		<bldmngnn></bldmngnn>            <!-- �ǹ�������ȣ-->
	</rdrinfo>
<%
	}
%>
</rdrdetail>