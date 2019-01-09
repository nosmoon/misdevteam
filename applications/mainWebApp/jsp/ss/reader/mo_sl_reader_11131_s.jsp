<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_sl_reader_11131_s.jsp
* ���       : ������������(��ü�� �Աݳ���)_����Ͽ�
* �ۼ�����   : 2016-05-16
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   : ���º���
* ������     : �弱��
* ��������   : 2017-02-03
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // DataSet ����
    SL_MO_S_RDR_INFODataSet ds = (SL_MO_S_RDR_INFODataSet)request.getAttribute("ds");
%>
<rdr_detail>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<!-- �Ǳ���������, ���ݰ����� -->
<%
	if( ds.subsmonthcur.size() > 0 ){
		SL_MO_S_RDR_INFOSUBSMONTHCURRecord rec = null;
		for( int i=0; i < ds.subsmonthcur.size(); i++ ){
			rec = (SL_MO_S_RDR_INFOSUBSMONTHCURRecord)ds.subsmonthcur.get( i );
%>
<subsmonthcurinfo>
	<realmm><%= rec.realmm %></realmm> <!--�Ǳ���������-->
	<valmm><%= rec.valmm %></valmm><!--���ݰ�����-->
</subsmonthcurinfo>
<%
			}
		}else{
%>
<subsmonthcurinfo>
	<realmm></realmm> <!--�Ǳ���������-->
	<valmm></valmm><!--���ݰ�����-->
</subsmonthcurinfo>
<%
	}
%>
<!-- �Ź��������� ���� -->

<%
	if( ds.subscur.size() > 0 ){
		SL_MO_S_RDR_INFOSUBSCURRecord subscurRec = null;
		for( int i=0; i < ds.subscur.size(); i++ ){
			subscurRec = (SL_MO_S_RDR_INFOSUBSCURRecord)ds.subscur.get( i );
%>
<subscurinfo>
	<medicd><%= subscurRec.medicd %></medicd> <!--��ü�ڵ�-->
	<medinm><![CDATA[<%=ds.getMedinm()%>]]></medinm>  <!-- ��ü�� -->
	<subsamt><%= subscurRec.subsamt %></subsamt> <!-- �����ݾ� -->
	<clamamt><%= subscurRec.clamamt %></clamamt>  <!-- û���ݾ� -->
	<dscnamt><%= subscurRec.dscnamt %></dscnamt><!-- ���αݾ� -->
	<post_dlvfee><%= subscurRec.post_dlvfee %></post_dlvfee> <!-- �߰��ݾ� -->
	<valqty><%= subscurRec.valqty %></valqty>   <!-- ����μ� -->
	<pre_valqty><%= subscurRec.pre_valqty %></pre_valqty>  <!-- �������μ� -->
	<no_valqty><%= subscurRec.no_valqty %></no_valqty> <!-- ����μ� -->
<%
	String rptvfreeclsf_value = "";

	SL_MO_S_RDR_INFOFREECLSFCDCURRecord rec1 = null;
	int size = ds.freeclsfcdcur.size();
		for(int a=0; a<size; a++){
 		rec1 = (SL_MO_S_RDR_INFOFREECLSFCDCURRecord)ds.freeclsfcdcur.get(a);

		String cicodeval = rec1.cicodeval;
		String rptvfreeclsf = subscurRec.rptvfreeclsf;

		if(cicodeval.equals(rptvfreeclsf)){
		rptvfreeclsf_value  = rec1.cicdnm;
		}
}
%>
	<rptvfreeclsf><%= subscurRec.rptvfreeclsf %></rptvfreeclsf> <!--���ᱸ���ڵ�-->
	<rptvfreeclsfnm><![CDATA[<%= rptvfreeclsf_value %>]]></rptvfreeclsfnm><!-- ���ᱸ�и� -->
	<rptvrdr_extndt><%= subscurRec.rptvrdr_extndt %></rptvrdr_extndt> <!--Ȯ������-->
<%
	String rptvrdr_extntype_value = "";

	SL_MO_S_RDR_INFORDR_EXTNTYPECDCURRecord rec2 = null;
	int size2 = ds.rdr_extntypecdcur.size();
		for(int b=0; b<size2; b++){
 		rec2 = (SL_MO_S_RDR_INFORDR_EXTNTYPECDCURRecord)ds.rdr_extntypecdcur.get(b);

		String cicodeval = rec2.cicodeval;
		String rptvrdr_extntype = subscurRec.rptvrdr_extntype;

		if(cicodeval.equals(rptvrdr_extntype)){
			rptvrdr_extntype_value  = rec2.cicdnm;
		}
}
%>
	<rptvrdr_extntype><%= subscurRec.rptvrdr_extntype %></rptvrdr_extntype> <!--Ȯ�������ڵ�-->
	<rptvrdr_extntypenm><![CDATA[<%= rptvrdr_extntype_value %>]]></rptvrdr_extntypenm>  <!-- Ȯ�������� -->
	<rptvextn><![CDATA[<%= subscurRec.rptvextn%>]]></rptvextn>              <!-- Ȯ���� -->
	<rptvsubsdt><%= subscurRec.rptvsubsdt %></rptvsubsdt><!-- �������� -->
<%
	String clamtmthdcd_value = "";

	SL_MO_S_RDR_INFOCLAMTMTHDCDCURRecord rec3 = null;
	int size3 = ds.clamtmthdcdcur.size();
		for(int c=0; c<size3; c++){
 		rec3 = (SL_MO_S_RDR_INFOCLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(c);

		String cicodeval = rec3.cicodeval;
		String clamtmthdcd = subscurRec.clamtmthdcd;

		if(cicodeval.equals(clamtmthdcd)){
			clamtmthdcd_value  = rec3.cicdnm;
		}
}
%>
	<clamtmthdcd><%= subscurRec.clamtmthdcd %></clamtmthdcd> <!--���ݹ���ڵ�-->
	<clamtmthdcdnm><![CDATA[<%= clamtmthdcd_value %>]]></clamtmthdcdnm> <!-- ���ݹ���� -->
	<rptvvalmm><%= subscurRec.rptvvalmm %></rptvvalmm> <!-- ������ -->
	<clamtcyclcd><%= subscurRec.clamtcyclcd %></clamtcyclcd><!-- �б�� -->
	<rptvrdr_movmdt><%= subscurRec.rptvrdr_movmdt %></rptvrdr_movmdt> <!-- �̻����� -->
	<totrdr_extncost><%= subscurRec.totrdr_extncost %></totrdr_extncost> <!-- Ȯ���� -->
	<rptv_bns_itemnm><![CDATA[<%= subscurRec.rptv_bns_itemnm %>]]></rptv_bns_itemnm><!--���˹���-->
	<rptv_suspdt><%= subscurRec.rptv_suspdt %></rptv_suspdt><!--��������-->
<%
	String rptv_suspresncd_value = "";

	SL_MO_S_RDR_INFOSUSPRESNCDCURRecord rec4 = null;
	int size4 = ds.suspresncdcur.size();
		for(int d=0; d<size4; d++){
 		rec4 = (SL_MO_S_RDR_INFOSUSPRESNCDCURRecord)ds.suspresncdcur.get(d);

		String cicodeval = rec4.cicodeval;
		String rptv_suspresncd = subscurRec.rptv_suspresncd;

		if(cicodeval.equals(rptv_suspresncd)){
			rptv_suspresncd_value  = rec4.cicdnm;
		}
}
%>
	<rptv_suspresncd><%= subscurRec.rptv_suspresncd %></rptv_suspresncd><!--���������ڵ�-->
	<rptv_suspresncdnm><![CDATA[<%= rptv_suspresncd_value %>]]></rptv_suspresncdnm><!-- ���������� -->
	<vact_noprint><%= subscurRec.vact_noprint %></vact_noprint> <!--��������������-->
<%
	String pay_reciynnm = "";

	if("Y".equals(subscurRec.pay_reciyn)){
		pay_reciynnm = "�������";
	}else if("N".equals(subscurRec.pay_reciyn)){
		pay_reciynnm = "�����";
	}else if("H".equals(subscurRec.pay_reciyn)){
		pay_reciynnm = "�Ϻμ���";
	}else{
		pay_reciynnm = "";
	}
%>
	<pay_reciyn><%= subscurRec.pay_reciyn %></pay_reciyn> <!--Ȯ����翩�� -->
	<pay_reciynnm><![CDATA[<%=pay_reciynnm %>]]></pay_reciynnm><!--Ȯ����翩�θ�-->
</subscurinfo>
<%
			}
		}else{
%>
<subscurinfo>
	<medicd></medicd>
	<medinm></medinm>
	<subsamt></subsamt>
	<clamamt></clamamt>
	<dscnamt></dscnamt>
	<post_dlvfee></post_dlvfee>
	<valqty></valqty>
	<pre_valqty></pre_valqty>
	<no_valqty></no_valqty>
	<rptvfreeclsf></rptvfreeclsf>
	<rptvfreeclsfnm></rptvfreeclsfnm>
	<rptvrdr_extndt></rptvrdr_extndt>
	<rptvrdr_extntype></rptvrdr_extntype>
	<rptvrdr_extntypenm></rptvrdr_extntypenm>
	<rptvextn></rptvextn>
	<rptvsubsdt></rptvsubsdt>
	<clamtmthdcd></clamtmthdcd>
	<clamtmthdcdnm></clamtmthdcdnm>
	<rptvvalmm></rptvvalmm>
	<clamtcyclcd></clamtcyclcd>
	<rptvrdr_movmdt></rptvrdr_movmdt>
	<totrdr_extncost></totrdr_extncost>
	<rptv_bns_itemnm></rptv_bns_itemnm>
	<rptv_suspdt></rptv_suspdt>
	<rptv_suspresncd></rptv_suspresncd>
	<rptv_suspresncdnm></rptv_suspresncdnm>
	<vact_noprint></vact_noprint>
	<pay_reciyn></pay_reciyn>
	<pay_reciynnm></pay_reciynnm>
</subscurinfo>
<%
	}
%>
<!-- ���⵵ �ݳ⵵ �Աݳ��� ��� ���� -->
<!--  �����⵵ ���ݱ���(���) ����Ʈ ����-->

<%
	if(ds.brfcur.size() > 0) {
	SL_MO_S_RDR_INFOBRFCURRecord 	brfcurRec  = null;
	String prevYear = "";
	StringBuffer prevCollectMoneyBuffer = new StringBuffer();
    	for(int i=0; i<ds.brfcur.size(); i++){
    		brfcurRec = (SL_MO_S_RDR_INFOBRFCURRecord)ds.brfcur.get(i);
    		prevYear = brfcurRec.subsmappli.substring(0,4);
    		prevCollectMoneyBuffer.append(brfcurRec.clamtynm);
    	}
%>
<preyearinfo>
<presubsmappli><%= prevYear%></presubsmappli>
<preclamtynm><%= prevCollectMoneyBuffer.toString() %></preclamtynm>
</preyearinfo>
<%
	}else{
	%>
<preyearinfo>
<presubsmappli></presubsmappli>
<preclamtynm></preclamtynm>
</preyearinfo>
<%
	}
%>
<!--  �۾��⵵ ���ݱ���(���) ����Ʈ -->
<%
	if(ds.brfcur2.size() > 0 ){

	SL_MO_S_RDR_INFOBRFCUR2Record  brfcur2Rec =  null;
    String curYear = "";
    StringBuffer curCollectMoneyBuffer = new StringBuffer();
		for(int j=0; j<ds.brfcur2.size(); j++){
			brfcur2Rec = (SL_MO_S_RDR_INFOBRFCUR2Record)ds.brfcur2.get(j);
			curYear = brfcur2Rec.subsmappli.substring(0,4);
			curCollectMoneyBuffer.append(brfcur2Rec.clamtynm);
		}
%>
<curyearinfo>
<cursubsmappli><%= curYear %></cursubsmappli>
<curclamtynm><%= curCollectMoneyBuffer %></curclamtynm>
</curyearinfo>
<%
	}else{
%>
<curyearinfo>
<cursubsmappli></cursubsmappli>
<curclamtynm></curclamtynm>
</curyearinfo>
<%
	}
%>
<!--  �۾��⵵ ���ݱ���(���) ����Ʈ ��-->
<!--  �����⵵ ���ݱ���(���) ����Ʈ -->
<%
	if(ds.brfcur3.size() > 0 ){

	SL_MO_S_RDR_INFOBRFCUR3Record  brfcur3Rec =  null;
    String nextYear = "";
    StringBuffer nextCollectMoneyBuffer = new StringBuffer();
		for(int k=0; k<ds.brfcur3.size(); k++){
			brfcur3Rec = (SL_MO_S_RDR_INFOBRFCUR3Record)ds.brfcur3.get(k);
			nextYear = brfcur3Rec.subsmappli.substring(0,4);
			nextCollectMoneyBuffer.append(brfcur3Rec.clamtynm);
		}
%>
<nextyearinfo>
<nextsubsmappli><%= nextYear %></nextsubsmappli>
<nextclamtynm><%= nextCollectMoneyBuffer %></nextclamtynm>
</nextyearinfo>
<%
	}else{
%>
<nextyearinfo>
<nextsubsmappli></nextsubsmappli>
<nextclamtynm></nextclamtynm>
</nextyearinfo>
<%
	}
%>
<!--  �۾��⵵ ���ݱ���(���) ����Ʈ ��-->
<!-- ���⵵ �ݳ⵵ �Աݳ��� ��� �� -->

<!-- �����̼�(����/�ݾ�), �����۾���, �������, ���ĳ�� ���� -->
<misuinfo>
<un_clamt><%=ds.getUn_clamt()%></un_clamt>									<!-- �����̼��ݾ� -->
<un_clamt_mm><%=ds.getUn_clamt_mm()%></un_clamt_mm>			<!-- �����̼����� -->
<curryymm><%=ds.getCurryymm() %></curryymm>								<!-- �����۾��� -->
<prevyymm><%=ds.getPrevyymm() %></prevyymm>							<!-- ������� -->
<nextyymm><%=ds.getNextyymm() %></nextyymm>								<!-- ���ĳ�� -->
</misuinfo>
<!-- �����̼�(����/�ݾ�), �����۾���, �������, ���ĳ�� �� -->

<!-- �����̷¸���Ʈ ���� -->
<%
	if( ds.clamtcur.size() > 0 ){
		SL_MO_S_RDR_INFOCLAMTCURRecord clamtcurRec = null;
		for( int i=0; i < ds.clamtcur.size(); i++ ){
			clamtcurRec = (SL_MO_S_RDR_INFOCLAMTCURRecord)ds.clamtcur.get( i );
%>
<rsltcurinfo>
	<subsmappli><%= clamtcurRec.subsmappli %></subsmappli><!-- ���� -->
	<recpdt><%= clamtcurRec.recpdt %></recpdt><!-- ��������(��ü����) -->
	<clamamt><%= clamtcurRec.clamamt %></clamamt><!-- û���ݾ� -->
	<clamt><%= clamtcurRec.clamt %></clamt><!-- �Աݾ� -->
	<rcpmclsfcd><%= clamtcurRec.rcpmclsfcd %></rcpmclsfcd><!-- ���ݱ����ڵ� -->
	<rcpmclsfnm><![CDATA[<%= clamtcurRec.rcpmclsfnm %>]]></rcpmclsfnm>			<!-- ���ݱ��и� -->
	<clamtmthdcd><%= clamtcurRec.clamtmthdcd %></clamtmthdcd> <!-- ���ݹ���ڵ� -->
</rsltcurinfo>
<%
			}
		}else{
%>
<rsltcurinfo>
	<subsmappli></subsmappli>
	<recpdt></recpdt>
	<clamamt></clamamt>
	<clamt></clamt>
	<rcpmclsfcd></rcpmclsfcd>
	<rcpmclsfnm></rcpmclsfnm>
	<clamtmthdcd></clamtmthdcd>
</rsltcurinfo>
<%
	}
%>
<!-- �����̷¸���Ʈ �� -->
<%
		}else{
%>
<errinfo>
	<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- �����ڵ� -->
	<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- �����޽��� -->
</errinfo>
<subsmonthcurinfo>
	<realmm></realmm> <!--�Ǳ���������-->
	<valmm></valmm><!--���ݰ�����-->
</subsmonthcurinfo>
<subscurinfo>
	<medicd></medicd>
	<medinm></medinm>
	<subsamt></subsamt>
	<clamamt></clamamt>
	<dscnamt></dscnamt>
	<post_dlvfee></post_dlvfee>
	<valqty></valqty>
	<pre_valqty></pre_valqty>
	<no_valqty></no_valqty>
	<rptvfreeclsf></rptvfreeclsf>
	<rptvfreeclsfnm></rptvfreeclsfnm>
	<rptvrdr_extndt></rptvrdr_extndt>
	<rptvrdr_extntype></rptvrdr_extntype>
	<rptvrdr_extntypenm></rptvrdr_extntypenm>
	<rptvextn></rptvextn>
	<rptvsubsdt></rptvsubsdt>
	<clamtmthdcd></clamtmthdcd>
	<clamtmthdcdnm></clamtmthdcdnm>
	<rptvvalmm></rptvvalmm>
	<clamtcyclcd></clamtcyclcd>
	<rptvrdr_movmdt></rptvrdr_movmdt>
	<totrdr_extncost></totrdr_extncost>
	<rptv_bns_itemnm></rptv_bns_itemnm>
	<rptv_suspdt></rptv_suspdt>
	<rptv_suspresncd></rptv_suspresncd>
	<rptv_suspresncdnm></rptv_suspresncdnm>
	<vact_noprint></vact_noprint>
	<pay_reciyn></pay_reciyn>
	<pay_reciynnm></pay_reciynnm>
</subscurinfo>
<preyearinfo>
	<presubsmappli></presubsmappli>
	<preclamtynm></preclamtynm>
</preyearinfo>
<curyearinfo>
	<cursubsmappli></cursubsmappli>
	<curclamtynm></curclamtynm>
</curyearinfo>
<nextyearinfo>
<nextsubsmappli></nextsubsmappli>
<nextclamtynm></nextclamtynm>
</nextyearinfo>
<misuinfo>
	<un_clamt></un_clamt><!-- �����̼��ݾ� -->
	<un_clamt_mm></un_clamt_mm> <!-- �����̼����� -->
	<curryymm></curryymm> <!-- �����۾��� -->
	<prevyymm></prevyymm> <!-- ������� -->
	<nextyymm></nextyymm> <!-- ���ĳ�� -->
</misuinfo>
<rsltcurinfo>
	<subsmappli></subsmappli>
	<recpdt></recpdt>
	<clamamt></clamamt>
	<clamt></clamt>
	<rcpmclsfcd></rcpmclsfcd>
	<rcpmclsfnm></rcpmclsfnm>
	<clamtmthdcd></clamtmthdcd>
</rsltcurinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																<!-- �����ڵ� -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>		<!-- �����޽��� -->
	</errinfo>
<subsmonthcurinfo>
	<realmm></realmm> <!--�Ǳ���������-->
	<valmm></valmm><!--���ݰ�����-->
</subsmonthcurinfo>
<subscurinfo>
	<medicd></medicd>
	<medinm></medinm>
	<subsamt></subsamt>
	<clamamt></clamamt>
	<dscnamt></dscnamt>
	<post_dlvfee></post_dlvfee>
	<valqty></valqty>
	<pre_valqty></pre_valqty>
	<no_valqty></no_valqty>
	<rptvfreeclsf></rptvfreeclsf>
	<rptvfreeclsfnm></rptvfreeclsfnm>
	<rptvrdr_extndt></rptvrdr_extndt>
	<rptvrdr_extntype></rptvrdr_extntype>
	<rptvrdr_extntypenm></rptvrdr_extntypenm>
	<rptvextn></rptvextn>
	<rptvsubsdt></rptvsubsdt>
	<clamtmthdcd></clamtmthdcd>
	<clamtmthdcdnm></clamtmthdcdnm>
	<rptvvalmm></rptvvalmm>
	<clamtcyclcd></clamtcyclcd>
	<rptvrdr_movmdt></rptvrdr_movmdt>
	<totrdr_extncost></totrdr_extncost>
	<rptv_bns_itemnm></rptv_bns_itemnm>
	<rptv_suspdt></rptv_suspdt>
	<rptv_suspresncd></rptv_suspresncd>
	<rptv_suspresncdnm></rptv_suspresncdnm>
	<vact_noprint></vact_noprint>
	<pay_reciyn></pay_reciyn>
	<pay_reciynnm></pay_reciynnm>
</subscurinfo>
<preyearinfo>
	<presubsmappli></presubsmappli>
	<preclamtynm></preclamtynm>
</preyearinfo>
<curyearinfo>
	<cursubsmappli></cursubsmappli>
	<curclamtynm></curclamtynm>
</curyearinfo>
<nextyearinfo>
<nextsubsmappli></nextsubsmappli>
<nextclamtynm></nextclamtynm>
</nextyearinfo>
<misuinfo>
	<un_clamt></un_clamt><!-- �����̼��ݾ� -->
	<un_clamt_mm></un_clamt_mm> <!-- �����̼����� -->
	<curryymm></curryymm> <!-- �����۾��� -->
	<prevyymm></prevyymm> <!-- ������� -->
	<nextyymm></nextyymm> <!-- ���ĳ�� -->
</misuinfo>
<rsltcurinfo>
	<subsmappli></subsmappli>
	<recpdt></recpdt>
	<clamamt></clamamt>
	<clamt></clamt>
	<rcpmclsfcd></rcpmclsfcd>
	<rcpmclsfnm></rcpmclsfnm>
	<clamtmthdcd></clamtmthdcd>
</rsltcurinfo>
<%
	}
%>
</rdr_detail>