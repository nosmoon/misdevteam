<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_sl_reader_11131_s.jsp
* 기능       : 독자정보관리(매체별 입금내역)_모바일용
* 작성일자   : 2016-05-16
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   : 형태변경
* 수정자     : 장선희
* 수정일자   : 2017-02-03
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // DataSet 얻어내기
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
<!-- 실구독개월수, 수금개월수 -->
<%
	if( ds.subsmonthcur.size() > 0 ){
		SL_MO_S_RDR_INFOSUBSMONTHCURRecord rec = null;
		for( int i=0; i < ds.subsmonthcur.size(); i++ ){
			rec = (SL_MO_S_RDR_INFOSUBSMONTHCURRecord)ds.subsmonthcur.get( i );
%>
<subsmonthcurinfo>
	<realmm><%= rec.realmm %></realmm> <!--실구독개월수-->
	<valmm><%= rec.valmm %></valmm><!--수금개월수-->
</subsmonthcurinfo>
<%
			}
		}else{
%>
<subsmonthcurinfo>
	<realmm></realmm> <!--실구독개월수-->
	<valmm></valmm><!--수금개월수-->
</subsmonthcurinfo>
<%
	}
%>
<!-- 신문구독정보 시작 -->

<%
	if( ds.subscur.size() > 0 ){
		SL_MO_S_RDR_INFOSUBSCURRecord subscurRec = null;
		for( int i=0; i < ds.subscur.size(); i++ ){
			subscurRec = (SL_MO_S_RDR_INFOSUBSCURRecord)ds.subscur.get( i );
%>
<subscurinfo>
	<medicd><%= subscurRec.medicd %></medicd> <!--매체코드-->
	<medinm><![CDATA[<%=ds.getMedinm()%>]]></medinm>  <!-- 매체명 -->
	<subsamt><%= subscurRec.subsamt %></subsamt> <!-- 구독금액 -->
	<clamamt><%= subscurRec.clamamt %></clamamt>  <!-- 청구금액 -->
	<dscnamt><%= subscurRec.dscnamt %></dscnamt><!-- 할인금액 -->
	<post_dlvfee><%= subscurRec.post_dlvfee %></post_dlvfee> <!-- 추가금액 -->
	<valqty><%= subscurRec.valqty %></valqty>   <!-- 유료부수 -->
	<pre_valqty><%= subscurRec.pre_valqty %></pre_valqty>  <!-- 준유가부수 -->
	<no_valqty><%= subscurRec.no_valqty %></no_valqty> <!-- 무료부수 -->
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
	<rptvfreeclsf><%= subscurRec.rptvfreeclsf %></rptvfreeclsf> <!--무료구분코드-->
	<rptvfreeclsfnm><![CDATA[<%= rptvfreeclsf_value %>]]></rptvfreeclsfnm><!-- 무료구분명 -->
	<rptvrdr_extndt><%= subscurRec.rptvrdr_extndt %></rptvrdr_extndt> <!--확장일자-->
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
	<rptvrdr_extntype><%= subscurRec.rptvrdr_extntype %></rptvrdr_extntype> <!--확장유형코드-->
	<rptvrdr_extntypenm><![CDATA[<%= rptvrdr_extntype_value %>]]></rptvrdr_extntypenm>  <!-- 확장유형명 -->
	<rptvextn><![CDATA[<%= subscurRec.rptvextn%>]]></rptvextn>              <!-- 확장자 -->
	<rptvsubsdt><%= subscurRec.rptvsubsdt %></rptvsubsdt><!-- 구독일자 -->
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
	<clamtmthdcd><%= subscurRec.clamtmthdcd %></clamtmthdcd> <!--수금방법코드-->
	<clamtmthdcdnm><![CDATA[<%= clamtmthdcd_value %>]]></clamtmthdcdnm> <!-- 수금방법명 -->
	<rptvvalmm><%= subscurRec.rptvvalmm %></rptvvalmm> <!-- 유가월 -->
	<clamtcyclcd><%= subscurRec.clamtcyclcd %></clamtcyclcd><!-- 분기월 -->
	<rptvrdr_movmdt><%= subscurRec.rptvrdr_movmdt %></rptvrdr_movmdt> <!-- 이사일자 -->
	<totrdr_extncost><%= subscurRec.totrdr_extncost %></totrdr_extncost> <!-- 확장비용 -->
	<rptv_bns_itemnm><![CDATA[<%= subscurRec.rptv_bns_itemnm %>]]></rptv_bns_itemnm><!--판촉물명-->
	<rptv_suspdt><%= subscurRec.rptv_suspdt %></rptv_suspdt><!--중지일자-->
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
	<rptv_suspresncd><%= subscurRec.rptv_suspresncd %></rptv_suspresncd><!--중지사유코드-->
	<rptv_suspresncdnm><![CDATA[<%= rptv_suspresncd_value %>]]></rptv_suspresncdnm><!-- 중지사유명 -->
	<vact_noprint><%= subscurRec.vact_noprint %></vact_noprint> <!--가상계좌출력제외-->
<%
	String pay_reciynnm = "";

	if("Y".equals(subscurRec.pay_reciyn)){
		pay_reciynnm = "정상수령";
	}else if("N".equals(subscurRec.pay_reciyn)){
		pay_reciynnm = "비수령";
	}else if("H".equals(subscurRec.pay_reciyn)){
		pay_reciynnm = "일부수령";
	}else{
		pay_reciynnm = "";
	}
%>
	<pay_reciyn><%= subscurRec.pay_reciyn %></pay_reciyn> <!--확장수당여부 -->
	<pay_reciynnm><![CDATA[<%=pay_reciynnm %>]]></pay_reciynnm><!--확장수당여부명-->
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
<!-- 전년도 금년도 입금내역 요약 시작 -->
<!--  이전년도 수금구분(방법) 리스트 시작-->

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
<!--  작업년도 수금구분(방법) 리스트 -->
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
<!--  작업년도 수금구분(방법) 리스트 끝-->
<!--  다음년도 수금구분(방법) 리스트 -->
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
<!--  작업년도 수금구분(방법) 리스트 끝-->
<!-- 전년도 금년도 입금내역 요약 끝 -->

<!-- 전월미수(개월/금액), 현재작업월, 이전년월, 이후년월 시작 -->
<misuinfo>
<un_clamt><%=ds.getUn_clamt()%></un_clamt>									<!-- 전월미수금액 -->
<un_clamt_mm><%=ds.getUn_clamt_mm()%></un_clamt_mm>			<!-- 전월미수개월 -->
<curryymm><%=ds.getCurryymm() %></curryymm>								<!-- 현재작업월 -->
<prevyymm><%=ds.getPrevyymm() %></prevyymm>							<!-- 이전년월 -->
<nextyymm><%=ds.getNextyymm() %></nextyymm>								<!-- 이후년월 -->
</misuinfo>
<!-- 전월미수(개월/금액), 현재작업월, 이전년월, 이후년월 끝 -->

<!-- 수금이력리스트 시작 -->
<%
	if( ds.clamtcur.size() > 0 ){
		SL_MO_S_RDR_INFOCLAMTCURRecord clamtcurRec = null;
		for( int i=0; i < ds.clamtcur.size(); i++ ){
			clamtcurRec = (SL_MO_S_RDR_INFOCLAMTCURRecord)ds.clamtcur.get( i );
%>
<rsltcurinfo>
	<subsmappli><%= clamtcurRec.subsmappli %></subsmappli><!-- 월분 -->
	<recpdt><%= clamtcurRec.recpdt %></recpdt><!-- 수금일자(이체일자) -->
	<clamamt><%= clamtcurRec.clamamt %></clamamt><!-- 청구금액 -->
	<clamt><%= clamtcurRec.clamt %></clamt><!-- 입금액 -->
	<rcpmclsfcd><%= clamtcurRec.rcpmclsfcd %></rcpmclsfcd><!-- 수금구분코드 -->
	<rcpmclsfnm><![CDATA[<%= clamtcurRec.rcpmclsfnm %>]]></rcpmclsfnm>			<!-- 수금구분명 -->
	<clamtmthdcd><%= clamtcurRec.clamtmthdcd %></clamtmthdcd> <!-- 수금방법코드 -->
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
<!-- 수금이력리스트 끝 -->
<%
		}else{
%>
<errinfo>
	<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- 에러코드 -->
	<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- 에러메시지 -->
</errinfo>
<subsmonthcurinfo>
	<realmm></realmm> <!--실구독개월수-->
	<valmm></valmm><!--수금개월수-->
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
	<un_clamt></un_clamt><!-- 전월미수금액 -->
	<un_clamt_mm></un_clamt_mm> <!-- 전월미수개월 -->
	<curryymm></curryymm> <!-- 현재작업월 -->
	<prevyymm></prevyymm> <!-- 이전년월 -->
	<nextyymm></nextyymm> <!-- 이후년월 -->
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
		<errcode><![CDATA[-9999]]></errcode>																<!-- 에러코드 -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>		<!-- 에러메시지 -->
	</errinfo>
<subsmonthcurinfo>
	<realmm></realmm> <!--실구독개월수-->
	<valmm></valmm><!--수금개월수-->
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
	<un_clamt></un_clamt><!-- 전월미수금액 -->
	<un_clamt_mm></un_clamt_mm> <!-- 전월미수개월 -->
	<curryymm></curryymm> <!-- 현재작업월 -->
	<prevyymm></prevyymm> <!-- 이전년월 -->
	<nextyymm></nextyymm> <!-- 이후년월 -->
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