<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_sl_reader_11132_s.jsp / ����Ͽ� ������������Ʈ+��ü����Ʈ(ciis���� �ʱ�Ŀ������Ʈ ������) agency�� 11130_s.jsp��.
* ���       : ������������(���ڻ󼼺���)_����Ͽ�
* �ۼ�����   : 2016-05-13
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // DataSet ����
    SL_MO_S_RDR_INFODataSet ds = (SL_MO_S_RDR_INFODataSet)request.getAttribute("ds");
%>

<rdr_detail>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> 																<!-- �����ڵ� -->
		<errmsg></errmsg>																	<!-- �����޽��� -->
	</errinfo>
<!-- ������¹�ȣ���� ���� -->
<%
			if( ds.vactcur.size() > 0 ){
				SL_MO_S_RDR_INFOVACTCURRecord rec = null;
				for( int i=0; i<ds.vactcur.size(); i++ ){
					rec = ( SL_MO_S_RDR_INFOVACTCURRecord )ds.vactcur.get( i );
%>
	<vactlist>
		<vactinfo>
			<bank_cd><![CDATA[<%=rec.bank_cd%>]]></bank_cd>
			<acct_no><%=rec.acct_no%></acct_no>
		</vactinfo>
	</vactlist>
<%
				}
			}else{
%>
	<vactlist>
		<vactinfo>
			<bank_cd></bank_cd>
			<acct_no></acct_no>
		</vactinfo>
	</vactlist>
<%
			}
%>
<!-- ������¹�ȣ���� �� -->
<%
		if(ds.readercur.size() > 0){
			SL_MO_S_RDR_INFOREADERCURRecord readercurRec = null;
			for(int i=0; i<ds.readercur.size(); i++){
				readercurRec = (SL_MO_S_RDR_INFOREADERCURRecord)ds.readercur.get(i);
%>
<!-- ���ڽŻ����� ����-->
	<readercur>
		<rdr_no><%=readercurRec.rdr_no%></rdr_no>         													<!--1.���ڹ�ȣ-->
        <%
			        String dlvdstccd_cd = "";
			        String dlvdstccd_value = "";

					SL_MO_S_RDR_INFODLVDSTCCDCURRecord rec = null;
					for(int j=0; j<ds.dlvdstccdcur.size(); j++){
						rec = (SL_MO_S_RDR_INFODLVDSTCCDCURRecord)ds.dlvdstccdcur.get(j);

						if ( rec.dstccd.equals( readercurRec.dlvdstccd ) ){
							dlvdstccd_cd = rec.dstccd;
							dlvdstccd_value = rec.dstcnm;
						}
					}
            %>
		<dlvdstccd><%=dlvdstccd_cd%></dlvdstccd>       											<!--2.�����ڵ�-->
		<dlvdstcnm><%=dlvdstccd_value%></dlvdstcnm>       									<!--2.�����ڵ��-->
		<dlvno><%=readercurRec.dlvno%></dlvno>           														<!--3.��޹�ȣ-->
		<dlvintvno><%=readercurRec.dlvintvno%></dlvintvno>       											<!--4.��޻��̹�ȣ-->
		<dstcnm><%=readercurRec.dstcnm%></dstcnm>          											<!--5.������-->
		<dlvzip><%=readercurRec.dlvzip%></dlvzip>          													<!--6.�����ȣ-->
		<dlvaddr><![CDATA[<%=readercurRec.dlvaddr%>]]></dlvaddr>         						<!--7.�ּ�-->
		<dlvdtlsaddr><![CDATA[<%=readercurRec.dlvdtlsaddr%>]]></dlvdtlsaddr>     			<!--8.���ּ�-->
		<dlvbnji><%=readercurRec.dlvbnji%></dlvbnji>         													<!--9.����-->

	<%

	String dlvcd = "";
	String dlvnm = "";

	SL_MO_S_RDR_INFOADDRCDCURRecord rec6 = null;
	for(int j=0; j<ds.addrcdcur.size(); j++){
		rec6 = (SL_MO_S_RDR_INFOADDRCDCURRecord)ds.addrcdcur.get(j);

		if(rec6.addrcd.equals(readercurRec.dlvcd)){
			dlvcd = rec6.addrcd;
			dlvnm = rec6.addrnm;
		}
	}
	%>
		<dlvcd><%=dlvcd %></dlvcd>									<!-- 10. ������ڵ�(�ּ��ڵ�) -->
		<dlvnm><![CDATA[<%=dlvnm %>]]></dlvnm>         <!-- 10. ������ڵ��(�ּҸ�) -->
		<dlvdong><%=readercurRec.dlvdong%></dlvdong>         											<!--11.�������-->
		<dlvser_no><%=readercurRec.dlvser_no%></dlvser_no>       									<!--12.�����ȣ��-->
		<pyong><%=readercurRec.pyong%></pyong>           													<!--13. ���-->
		<rdrnm><![CDATA[<%=readercurRec.rdrnm%>]]></rdrnm>           							<!--14.���ڸ�-->
        <%
        String paty_clsfcd_cd = "";
        String paty_clsfcd_value = "";

        SL_MO_S_RDR_INFOPATY_CLSFCDCURRecord rec3 = null;
        for(int j=0; j<ds.paty_clsfcdcur.size(); j++){
			rec3 = (SL_MO_S_RDR_INFOPATY_CLSFCDCURRecord)ds.paty_clsfcdcur.get(j);

			if (rec3.cicodeval.equals(readercurRec.paty_clsfcd)){
				paty_clsfcd_cd = rec3.cicodeval;
				paty_clsfcd_value = rec3.cicdnm;
			}
		}
            %>
		<paty_clsfcd><%=paty_clsfcd_cd%></paty_clsfcd>     								    			<!--15.��ü�����ڵ�-->
		<paty_clsfnm><![CDATA[<%=paty_clsfcd_value%>]]></paty_clsfnm>     						<!--15.��ü�����ڵ�-->
		<rdrtel_no1><%=readercurRec.rdrtel_no1%></rdrtel_no1>      									<!--16.������ȭ��ȣ1-->
		<rdrtel_no2><%=readercurRec.rdrtel_no2%></rdrtel_no2>     									<!--17.������ȭ��ȣ2-->
		<rdrtel_no3><%=readercurRec.rdrtel_no3%></rdrtel_no3>      									<!--18.������ȭ��ȣ3-->
        <%
        String resitypecd_cd = "";
        String resitypecd_value = "";

        SL_MO_S_RDR_INFORESITYPECDCURRecord rec2 = null;
        for(int j=0; j<ds.resitypecdcur.size(); j++){
			rec2 = (SL_MO_S_RDR_INFORESITYPECDCURRecord)ds.resitypecdcur.get(j);

			if (rec2.cicodeval.equals(readercurRec.resitypecd)){
				resitypecd_cd = rec2.cicodeval;
				resitypecd_value = rec2.cicdnm;
			}
		}
            %>
		<resitypecd><%=resitypecd_cd %></resitypecd>								<!--19.�ְ������ڵ�-->
		<resitypenm><![CDATA[<%=resitypecd_value %>]]></resitypenm>								<!--19.�ְ������ڵ��-->
         <%
        String resiclsfcd_cd = "";
        String resiclsfcd_value = "";

         SL_MO_S_RDR_INFORESICLSFCDCURRecord rec4 = null;
        for(int j=0; j<ds.resiclsfcdcur.size(); j++){
			rec4 = (SL_MO_S_RDR_INFORESICLSFCDCURRecord)ds.resiclsfcdcur.get(j);

			if (rec4.cicodeval.equals(readercurRec.resiclsfcd)){
		        resiclsfcd_cd = rec4.cicodeval;
				resiclsfcd_value = rec4.cicdnm;
			}
		}
            %>
		<resiclsfcd><%=resiclsfcd_cd %></resiclsfcd>								<!--20.�ְű����ڵ�-->
		<resiclsfnm><![CDATA[<%=resiclsfcd_value %>]]></resiclsfnm>								<!--20.�ְű����ڵ��-->
		<rdrptph_no1><%=readercurRec.rdrptph_no1%></rdrptph_no1>    							<!--21.�����޴�����ȣ1-->
		<rdrptph_no2><%=readercurRec.rdrptph_no2%></rdrptph_no2>     							<!--22.�����޴�����ȣ2-->
		<rdrptph_no3><%=readercurRec.rdrptph_no3%></rdrptph_no3>     							<!--23.�����޴�����ȣ3-->
         <%
        String dlvmthdcd_cd = "";
        String dlvmthdcd_value = "";

         SL_MO_S_RDR_INFODLVMTHDCDCURRecord rec5 = null;
        for(int j=0; j<ds.dlvmthdcdcur.size(); j++){
			rec5 = (SL_MO_S_RDR_INFODLVMTHDCDCURRecord)ds.dlvmthdcdcur.get(j);

			if (rec5.cicodeval.equals(readercurRec.dlvmthdcd)){
				dlvmthdcd_cd = rec5.cicodeval;
				dlvmthdcd_value = rec5.cicdnm;
			}
		}
            %>
		<dlvmthdcd><%=dlvmthdcd_cd %></dlvmthdcd>								<!--24.��޹���ڵ�-->
		<dlvmthdnm><![CDATA[<%=dlvmthdcd_value %>]]></dlvmthdnm>						<!--24.��޹���ڵ��-->
        <%
        String thrw_plac_cd = "";
        String thrw_plac_value = "";

        SL_MO_S_RDR_INFOTHRWPLACCDCURRecord rec7 = null;
        for(int j=0; j<ds.thrwplaccdcur.size(); j++){
			rec7 = (SL_MO_S_RDR_INFOTHRWPLACCDCURRecord)ds.thrwplaccdcur.get(j);

			if (rec7.cicodeval.equals(readercurRec.thrw_plac)){
				thrw_plac_cd = rec7.cicodeval;
				thrw_plac_value = rec7.cicdnm;
			}
		}
            %>
		<thrw_plac><%=thrw_plac_cd%></thrw_plac>       								<!--25.��������ڵ�-->
		<thrw_plnm><![CDATA[<%=thrw_plac_value%>]]></thrw_plnm>       						<!--25.������Ҹ�-->
		<bidt><%=readercurRec.bidt%></bidt>            															<!--26.���������-->
		<lusoclsfcd><%=readercurRec.lusoclsfcd%></lusoclsfcd>      									<!--27.���籸���ڵ�-->
		<weddanvydt><%=readercurRec.weddanvydt%></weddanvydt>      							<!--28.��ȥ�������-->
		<email><%=readercurRec.email%></email>           													<!--29.�̸���-->
		<prn><%=readercurRec.prn%></prn>            																<!--30.�ֹε�Ϲ�ȣ-->
		<remk><![CDATA[<%=readercurRec.remk%>]]></remk>            								<!--31.��� -->
		<etc_post><%=readercurRec.etc_post%></etc_post>        										<!--32.���赶�ڿ��ó����-->
		<oldnewgb><%=readercurRec.oldnewgb%></oldnewgb>											<!--33.-->
		<bldmngnn><%=readercurRec.bldmngnn%></bldmngnn>       									<!--34.�ǹ�������ȣ-->
		<new_dlvaddr><![CDATA[<%=readercurRec.new_dlvaddr%>]]></new_dlvaddr>    	<!--35. ���θ��ּ�-->
		<new_jbdlvaddr_fst><![CDATA[<%=readercurRec.new_jbdlvaddr_fst%>]]></new_jbdlvaddr_fst> 	<!--36. �����ּ� ��-->
		<new_jbdlvaddr_lst><![CDATA[<%=readercurRec.new_jbdlvaddr_lst%>]]></new_jbdlvaddr_lst>  <!--37. ����-->
		<temp_bldmngnn><%=readercurRec.temp_bldmngnn%></temp_bldmngnn>
		<temp_dlvzip><%=readercurRec.temp_dlvzip%></temp_dlvzip>
		<temp_dlvrdaddr><%=readercurRec.temp_dlvrdaddr%></temp_dlvrdaddr>
		<temp_dlvjbaddr><%=readercurRec.temp_dlvjbaddr%></temp_dlvjbaddr>
		<temp_dlvbnji><%=readercurRec.temp_dlvbnji%></temp_dlvbnji>
	</readercur>

<%
				}
			}else{
%>
	<readercur>
		<rdr_no></rdr_no>	<!--1.���ڹ�ȣ-->
		<dlvdstccd></dlvdstccd>	<!--2.�����ڵ�-->
		<dlvdstcnm></dlvdstcnm> <!--2.�����ڵ��-->
		<dlvno></dlvno>   	<!--3.��޹�ȣ-->
		<dlvintvno></dlvintvno>	<!--4.��޻��̹�ȣ-->
		<dstcnm></dstcnm>	<!--5.������-->
		<dlvzip></dlvzip>	<!--6.�����ȣ-->
		<dlvaddr></dlvaddr>	<!--7.�ּ�-->
		<dlvdtlsaddr></dlvdtlsaddr>	<!--8.���ּ�-->
		<dlvbnji></dlvbnji>		<!--9.����-->
		<dlvcd></dlvcd>			<!-- 10. ������ڵ�(�ּ��ڵ�) -->
		<dlvnm></dlvnm>         	<!-- 10. ������ڵ��(�ּҸ�) -->
		<dlvdong></dlvdong>		<!--11.�������-->
		<dlvser_no></dlvser_no>		<!--12.�����ȣ��-->
		<pyong></pyong>			<!--13. ���-->
		<rdrnm></rdrnm>           	<!--14.���ڸ�-->
		<paty_clsfcd></paty_clsfcd>     <!--15.��ü�����ڵ�-->
		<paty_clsfnm></paty_clsfnm>     <!--15.��ü�����ڵ�-->
		<rdrtel_no1></rdrtel_no1>      	<!--16.������ȭ��ȣ1-->
		<rdrtel_no2></rdrtel_no2>     	<!--17.������ȭ��ȣ2-->
		<rdrtel_no3></rdrtel_no3>      	<!--18.������ȭ��ȣ3-->
		<resitypecd></resitypecd>	<!--19.�ְ������ڵ�-->
		<resitypenm></resitypenm>	<!--19.�ְ������ڵ��-->
		<resiclsfcd></resiclsfcd>	<!--20.�ְű����ڵ�-->
		<resiclsfnm></resiclsfnm>	<!--20.�ְű����ڵ��-->
		<rdrptph_no1></rdrptph_no1>    	<!--21.�����޴�����ȣ1-->
		<rdrptph_no2></rdrptph_no2>     <!--22.�����޴�����ȣ2-->
		<rdrptph_no3></rdrptph_no3>     <!--23.�����޴�����ȣ3-->
		<dlvmthdcd></dlvmthdcd>		<!--24.��޹���ڵ�-->
		<dlvmthdnm></dlvmthdnm>		<!--24.��޹���ڵ��-->
		<thrw_plac></thrw_plac>       	<!--25.��������ڵ�-->
		<thrw_plnm></thrw_plnm>       	<!--25.������Ҹ�-->
		<bidt></bidt>            	<!--26.���������-->
		<lusoclsfcd></lusoclsfcd>       <!--27.���籸���ڵ�-->
		<weddanvydt></weddanvydt>       <!--28.��ȥ�������-->
		<email></email>           	<!--29.�̸���-->
		<prn></prn>            		<!--30.�ֹε�Ϲ�ȣ-->
		<remk></remk>            	<!--31.��� -->
		<etc_post></etc_post>        	<!--32.���赶�ڿ��ó����-->
		<oldnewgb></oldnewgb>		<!--33.-->
		<bldmngnn></bldmngnn>       	<!--34.�ǹ�������ȣ-->
		<new_dlvaddr></new_dlvaddr>    	<!--35. ���θ��ּ�-->
		<new_jbdlvaddr_fst></new_jbdlvaddr_fst>		<!--36. �����ּ� ��-->
		<new_jbdlvaddr_lst></new_jbdlvaddr_lst>		<!--37. ����-->
		<temp_bldmngnn></temp_bldmngnn>
		<temp_dlvzip></temp_dlvzip>
		<temp_dlvrdaddr></temp_dlvrdaddr>
		<temp_dlvjbaddr></temp_dlvjbaddr>
		<temp_dlvbnji></temp_dlvbnji>
	</readercur>
<%
			}
%>
<!-- ���ڽŻ����� ��-->
<!-- ������ü����Ʈ ���� -->
<%
			if( ds.medicur.size() > 0 ){
				SL_MO_S_RDR_INFOMEDICURRecord rec1 = null;
				for( int i=0; i<ds.medicur.size(); i++ ){
					rec1 = ( SL_MO_S_RDR_INFOMEDICURRecord )ds.medicur.get( i );
%>
	<mediinfo>
		<medicd><%= rec1.medicd %></medicd>
		<medinm><![CDATA[<%=rec1.medinm%>]]></medinm>
	</mediinfo>
<%
				}
			}else{
%>
	<mediinfo>
		<medicd></medicd>
		<medinm></medinm>
	</mediinfo>
<%
			}
%>
<!-- ������ü����Ʈ �� -->
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- �����ڵ� -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- �����޽��� -->
	</errinfo>
	<dstcinfo>
		<dstccd></dstccd>		<!-- �����ڵ� -->
		<dstcnm></dstcnm>	<!-- �����ڵ�� -->
	</dstcinfo>
	<addrinfo>
		<addrcd></addrcd>	<!-- �ּ��ڵ� -->
		<addrnm></addrnm>	<!-- �ּ��ڵ�� -->
	</addrinfo>
	<paty_clsfinfo>
		<paty_clsfcd></paty_clsfcd> <!-- ��ü�����ڵ� -->
		<paty_clsfnm></paty_clsfnm> <!-- ��ü�����ڵ�� -->
	</paty_clsfinfo>
	<resitypeinfo>
		<resitypecd></resitypecd><!-- �ְ������ڵ� -->
		<resitypenm></resitypenm><!-- �ְ������ڵ�� -->
	</resitypeinfo>
	<resiclsfinfo>
		<resiclsfcd></resiclsfcd>	<!-- �ְű����ڵ� -->
		<resiclsfnm></resiclsfnm><!-- �ְű����ڵ�� -->
	</resiclsfinfo>
	<dlvmthdinfo>
		<dlvmthdcd></dlvmthdcd><!-- ��޹���ڵ� -->
		<dlvmthdnm></dlvmthdnm><!-- ��޹���ڵ�� -->
	</dlvmthdinfo>
	<thrwplacinfo>
		<thrwplaccd></thrwplaccd><!-- ��������ڵ� -->
		<thrwplacnm></thrwplacnm><!-- ��������ڵ�� -->
	</thrwplacinfo>
	<bomediinfo>
		<bomedicd></bomedicd>	<!-- ������޸�ü�ڵ� -->
		<bomedinm></bomedinm> <!-- ������޸�ü�ڵ�� -->
	</bomediinfo>
	<rdr_extntypeinfo>
		<rdr_extntypecd></rdr_extntypecd><!-- Ȯ�������ڵ� -->
		<rdr_extntypenm></rdr_extntypenm><!-- Ȯ�������ڵ�� -->
	</rdr_extntypeinfo>
	<clamtmthdinfo>
		<clamtmthdcd></clamtmthdcd><!-- ���ݹ���ڵ� -->
		<clamtmthdnm></clamtmthdnm><!-- ���ݹ���ڵ�� -->
	</clamtmthdinfo>
	<freeclsfinfo>
		<freeclsfcd></freeclsfcd><!-- ���ᱸ���ڵ� -->
		<freeclsfnm></freeclsfnm><!-- ���ᱸ���ڵ�� -->
	</freeclsfinfo>
	<suspresninfo>
		<suspresncd></suspresncd><!-- ���������ڵ� -->
		<suspresnnm></suspresnnm><!-- ���������� -->
	</suspresninfo>
	<vactlist><!--������¸���Ʈ-->
		<vactinfo>
			<bank_cd></bank_cd>
			<acct_no></acct_no>
		</vactinfo>
	</vactlist>
	<readercur>
		<rdr_no></rdr_no>	<!--1.���ڹ�ȣ-->
		<dlvdstccd></dlvdstccd>	<!--2.�����ڵ�-->
		<dlvdstcnm></dlvdstcnm> <!--2.�����ڵ��-->
		<dlvno></dlvno>   	<!--3.��޹�ȣ-->
		<dlvintvno></dlvintvno>	<!--4.��޻��̹�ȣ-->
		<dstcnm></dstcnm>	<!--5.������-->
		<dlvzip></dlvzip>	<!--6.�����ȣ-->
		<dlvaddr></dlvaddr>	<!--7.�ּ�-->
		<dlvdtlsaddr></dlvdtlsaddr>	<!--8.���ּ�-->
		<dlvbnji></dlvbnji>		<!--9.����-->
		<dlvcd></dlvcd>			<!-- 10. ������ڵ�(�ּ��ڵ�) -->
		<dlvnm></dlvnm>         	<!-- 10. ������ڵ��(�ּҸ�) -->
		<dlvdong></dlvdong>		<!--11.�������-->
		<dlvser_no></dlvser_no>		<!--12.�����ȣ��-->
		<pyong></pyong>			<!--13. ���-->
		<rdrnm></rdrnm>           	<!--14.���ڸ�-->
		<paty_clsfcd></paty_clsfcd>     <!--15.��ü�����ڵ�-->
		<paty_clsfnm></paty_clsfnm>     <!--15.��ü�����ڵ�-->
		<rdrtel_no1></rdrtel_no1>      	<!--16.������ȭ��ȣ1-->
		<rdrtel_no2></rdrtel_no2>     	<!--17.������ȭ��ȣ2-->
		<rdrtel_no3></rdrtel_no3>      	<!--18.������ȭ��ȣ3-->
		<resitypecd></resitypecd>	<!--19.�ְ������ڵ�-->
		<resitypenm></resitypenm>	<!--19.�ְ������ڵ��-->
		<resiclsfcd></resiclsfcd>	<!--20.�ְű����ڵ�-->
		<resiclsfnm></resiclsfnm>	<!--20.�ְű����ڵ��-->
		<rdrptph_no1></rdrptph_no1>    	<!--21.�����޴�����ȣ1-->
		<rdrptph_no2></rdrptph_no2>     <!--22.�����޴�����ȣ2-->
		<rdrptph_no3></rdrptph_no3>     <!--23.�����޴�����ȣ3-->
		<dlvmthdcd></dlvmthdcd>		<!--24.��޹���ڵ�-->
		<dlvmthdnm></dlvmthdnm>		<!--24.��޹���ڵ��-->
		<thrw_plac></thrw_plac>       	<!--25.��������ڵ�-->
		<thrw_plnm></thrw_plnm>       	<!--25.������Ҹ�-->
		<bidt></bidt>            	<!--26.���������-->
		<lusoclsfcd></lusoclsfcd>       <!--27.���籸���ڵ�-->
		<weddanvydt></weddanvydt>       <!--28.��ȥ�������-->
		<email></email>           	<!--29.�̸���-->
		<prn></prn>            		<!--30.�ֹε�Ϲ�ȣ-->
		<remk></remk>            	<!--31.��� -->
		<etc_post></etc_post>        	<!--32.���赶�ڿ��ó����-->
		<oldnewgb></oldnewgb>		<!--33.-->
		<bldmngnn></bldmngnn>       	<!--34.�ǹ�������ȣ-->
		<new_dlvaddr></new_dlvaddr>    	<!--35. ���θ��ּ�-->
		<new_jbdlvaddr_fst></new_jbdlvaddr_fst>		<!--36. �����ּ� ��-->
		<new_jbdlvaddr_lst></new_jbdlvaddr_lst>		<!--37. ����-->
		<temp_bldmngnn></temp_bldmngnn>
		<temp_dlvzip></temp_dlvzip>
		<temp_dlvrdaddr></temp_dlvrdaddr>
		<temp_dlvjbaddr></temp_dlvjbaddr>
		<temp_dlvbnji></temp_dlvbnji>
	</readercur>
	<medilist>
		<mediinfo>
			<medicd></medicd>
			<medinm></medinm>
		</mediinfo>
	</medilist>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																<!-- �����ڵ� -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>		<!-- �����޽��� -->
	</errinfo>
	<dstcinfo>
		<dstccd></dstccd>		<!-- �����ڵ� -->
		<dstcnm></dstcnm>	<!-- �����ڵ�� -->
	</dstcinfo>
	<addrinfo>
		<addrcd></addrcd>	<!-- �ּ��ڵ� -->
		<addrnm></addrnm>	<!-- �ּ��ڵ�� -->
	</addrinfo>
	<paty_clsfinfo>
		<paty_clsfcd></paty_clsfcd> <!-- ��ü�����ڵ� -->
		<paty_clsfnm></paty_clsfnm> <!-- ��ü�����ڵ�� -->
	</paty_clsfinfo>
	<resitypeinfo>
		<resitypecd></resitypecd><!-- �ְ������ڵ� -->
		<resitypenm></resitypenm><!-- �ְ������ڵ�� -->
	</resitypeinfo>
	<resiclsfinfo>
		<resiclsfcd></resiclsfcd>	<!-- �ְű����ڵ� -->
		<resiclsfnm></resiclsfnm><!-- �ְű����ڵ�� -->
	</resiclsfinfo>
	<dlvmthdinfo>
		<dlvmthdcd></dlvmthdcd><!-- ��޹���ڵ� -->
		<dlvmthdnm></dlvmthdnm><!-- ��޹���ڵ�� -->
	</dlvmthdinfo>
	<thrwplacinfo>
		<thrwplaccd></thrwplaccd><!-- ��������ڵ� -->
		<thrwplacnm></thrwplacnm><!-- ��������ڵ�� -->
	</thrwplacinfo>
	<bomediinfo>
		<bomedicd></bomedicd>	<!-- ������޸�ü�ڵ� -->
		<bomedinm></bomedinm> <!-- ������޸�ü�ڵ�� -->
	</bomediinfo>
	<rdr_extntypeinfo>
		<rdr_extntypecd></rdr_extntypecd><!-- Ȯ�������ڵ� -->
		<rdr_extntypenm></rdr_extntypenm><!-- Ȯ�������ڵ�� -->
	</rdr_extntypeinfo>
	<clamtmthdinfo>
		<clamtmthdcd></clamtmthdcd><!-- ���ݹ���ڵ� -->
		<clamtmthdnm></clamtmthdnm><!-- ���ݹ���ڵ�� -->
	</clamtmthdinfo>
	<freeclsfinfo>
		<freeclsfcd></freeclsfcd><!-- ���ᱸ���ڵ� -->
		<freeclsfnm></freeclsfnm><!-- ���ᱸ���ڵ�� -->
	</freeclsfinfo>
	<suspresninfo>
		<suspresncd></suspresncd><!-- ���������ڵ� -->
		<suspresnnm></suspresnnm><!-- ���������� -->
	</suspresninfo>
	<vactlist><!--������¸���Ʈ-->
		<vactinfo>
			<bank_cd></bank_cd>
			<acct_no></acct_no>
		</vactinfo>
	</vactlist>
	<readercur>
		<rdr_no></rdr_no>	<!--1.���ڹ�ȣ-->
		<dlvdstccd></dlvdstccd>	<!--2.�����ڵ�-->
		<dlvdstcnm></dlvdstcnm> <!--2.�����ڵ��-->
		<dlvno></dlvno>   	<!--3.��޹�ȣ-->
		<dlvintvno></dlvintvno>	<!--4.��޻��̹�ȣ-->
		<dstcnm></dstcnm>	<!--5.������-->
		<dlvzip></dlvzip>	<!--6.�����ȣ-->
		<dlvaddr></dlvaddr>	<!--7.�ּ�-->
		<dlvdtlsaddr></dlvdtlsaddr>	<!--8.���ּ�-->
		<dlvbnji></dlvbnji>		<!--9.����-->
		<dlvcd></dlvcd>			<!-- 10. ������ڵ�(�ּ��ڵ�) -->
		<dlvnm></dlvnm>         	<!-- 10. ������ڵ��(�ּҸ�) -->
		<dlvdong></dlvdong>		<!--11.�������-->
		<dlvser_no></dlvser_no>		<!--12.�����ȣ��-->
		<pyong></pyong>			<!--13. ���-->
		<rdrnm></rdrnm>           	<!--14.���ڸ�-->
		<paty_clsfcd></paty_clsfcd>     <!--15.��ü�����ڵ�-->
		<paty_clsfnm></paty_clsfnm>     <!--15.��ü�����ڵ�-->
		<rdrtel_no1></rdrtel_no1>      	<!--16.������ȭ��ȣ1-->
		<rdrtel_no2></rdrtel_no2>     	<!--17.������ȭ��ȣ2-->
		<rdrtel_no3></rdrtel_no3>      	<!--18.������ȭ��ȣ3-->
		<resitypecd></resitypecd>	<!--19.�ְ������ڵ�-->
		<resitypenm></resitypenm>	<!--19.�ְ������ڵ��-->
		<resiclsfcd></resiclsfcd>	<!--20.�ְű����ڵ�-->
		<resiclsfnm></resiclsfnm>	<!--20.�ְű����ڵ��-->
		<rdrptph_no1></rdrptph_no1>    	<!--21.�����޴�����ȣ1-->
		<rdrptph_no2></rdrptph_no2>     <!--22.�����޴�����ȣ2-->
		<rdrptph_no3></rdrptph_no3>     <!--23.�����޴�����ȣ3-->
		<dlvmthdcd></dlvmthdcd>		<!--24.��޹���ڵ�-->
		<dlvmthdnm></dlvmthdnm>		<!--24.��޹���ڵ��-->
		<thrw_plac></thrw_plac>       	<!--25.��������ڵ�-->
		<thrw_plnm></thrw_plnm>       	<!--25.������Ҹ�-->
		<bidt></bidt>            	<!--26.���������-->
		<lusoclsfcd></lusoclsfcd>       <!--27.���籸���ڵ�-->
		<weddanvydt></weddanvydt>       <!--28.��ȥ�������-->
		<email></email>           	<!--29.�̸���-->
		<prn></prn>            		<!--30.�ֹε�Ϲ�ȣ-->
		<remk></remk>            	<!--31.��� -->
		<etc_post></etc_post>        	<!--32.���赶�ڿ��ó����-->
		<oldnewgb></oldnewgb>		<!--33.-->
		<bldmngnn></bldmngnn>       	<!--34.�ǹ�������ȣ-->
		<new_dlvaddr></new_dlvaddr>    	<!--35. ���θ��ּ�-->
		<new_jbdlvaddr_fst></new_jbdlvaddr_fst>		<!--36. �����ּ� ��-->
		<new_jbdlvaddr_lst></new_jbdlvaddr_lst>		<!--37. ����-->
		<temp_bldmngnn></temp_bldmngnn>
		<temp_dlvzip></temp_dlvzip>
		<temp_dlvrdaddr></temp_dlvrdaddr>
		<temp_dlvjbaddr></temp_dlvjbaddr>
		<temp_dlvbnji></temp_dlvbnji>
	</readercur>
	<medilist>
		<mediinfo>
			<medicd></medicd>
			<medinm></medinm>
		</mediinfo>
	</medilist>
<%
	}
%>
</rdr_detail>
