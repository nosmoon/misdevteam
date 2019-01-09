<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1120_s.jsp
* 기능 : 지국Info-지국현황 상세화면
* 작성일자 : 2004-02-23
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_BOINFODataSet ds = (SS_S_BOINFODataSet)request.getAttribute("ds");

	// 지국운영환경처리(값이 존재하면 ()를 둘러싸고 없으면 ()를 제외한다.
	String oprenvclsfnm = "";
	if(!"".equals(ds.getOprenvclsfnm())){
		oprenvclsfnm = "("+	ds.getOprenvclsfnm() + ")";
	}

	// 해당 지국지사코드는	request로부터 얻는다.
	String bocd = request.getParameter("bocd");
%>
      <!--조직 (현재) 리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail1">

		<%
		for(int i=0; i<ds.curcommlist1.size(); i++){
			SS_S_BOINFOCURCOMMLIST1Record curcommlist1Rec = (SS_S_BOINFOCURCOMMLIST1Record)ds.curcommlist1.get(i);
		%>
	    <tr bgcolor="#D5DACD">
          <td colspan="11" align="center" class="gray"><b>조직 (현재)</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td rowspan="2" class="gray" width="75"> 총무 </td>
          <td colspan="5" class="gray" width="375" align="center"> 배달 </td>
          <td rowspan="2" class="gray" width="75"> 삽지 </td>
          <td rowspan="2" class="gray" width="75"> 경리 </td>
          <td rowspan="2" class="gray" width="75"> 주방 </td>
          <td rowspan="2" class="gray" width="75"> 기타 </td>
          <td rowspan="2" class="gray"> 총계 </td>
        </tr>
        <tr bgcolor="#dddddd"  align="center">
          <td class="gray" width="75"> 전문 </td>
          <td class="gray" width="75"> 주부 </td>
          <td class="gray" width="75"> 알바 </td>
          <td class="gray" width="75"> 기타 </td>
          <td class="gray" width="75"> 계 </td>
        </tr>
        <tr align="right">
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd20%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd50%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd60%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd70%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd80%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.total1%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd40%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd100%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd110%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd120%></td>
          <td class="gray">&nbsp;<%= curcommlist1Rec.total2%></td>
        </tr>
      <%}%>
      </table>

      <!--확장/중지 리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="boinfo_detail2">
		<%
		for(int i=0; i<ds.curcommlist2.size(); i++){
			SS_S_BOINFOCURCOMMLIST2Record curcommlist2Rec = (SS_S_BOINFOCURCOMMLIST2Record)ds.curcommlist2.get(i);
		%>
	    <tr bgcolor="#D5DACD">
          <td colspan="15" align="center" class="gray"><b>확장/중지 (<%= Util.convertMonthS(ds.getBasi_yymm())%>)</b></td>
        <tr>
        <tr align="center">
          <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> 확장</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 신청</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 직원</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 요원</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 이전</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 본사</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 계</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 확장율</td>
          <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> 중지</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 이사</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 거절</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 타지구독</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 기타</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 계</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 중지율</td>
        </tr>
        <tr >
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnaplc%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnemp%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnstaf%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnrdr_movm%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnhdqt%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extn_tot%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnrate%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_suspmovm%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_susprefu%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_suspothnwsp%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_suspetc%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_susp_tot%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_susprate%></td>
        </tr>
      </table>

      <!--부수 리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail3">
	    <tr bgcolor="#D5DACD">
          <td colspan="17" align="center" class="gray"><b>부수 (<%= Util.convertMonthS(Util.addMonth(ds.getBasi_yymm()+"01",1).substring(0,6))%>)</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td  rowspan="2" class="gray" width="70"> 발송부수 </td>
          <td  rowspan="2" class="gray" width="70" bgcolor="#dddddd"> 당월유가 </td>
          <td colspan="6" class="gray"> 준유가 </td>
          <td  rowspan="2" class="gray" width="70"> 홍보지 </td>
          <td  rowspan="2" class="gray" width="70"> 기증지 </td>
          <td  rowspan="2" class="gray" width="70"> 예비지 </td>
          <td colspan="6" class="gray"> 겸영지 </td>
        </tr>
        <tr bgcolor="#dddddd" align="center">
          <td class="gray" width="40"> 1후수 </td>
          <td class="gray" width="40"> 2후수 </td>
          <td class="gray" width="40"> 3후수 </td>
          <td class="gray" width="40"> 4후수 </td>
          <td class="gray" width="40"> 5후수+ </td>
          <td class="gray" width="40"> 계 </td>
          <td class="gray" width="40"> 스포츠 </td>
          <td class="gray" width="40"> 소년 </td>
          <td class="gray" width="40"> 한경 </td>
          <td class="gray" width="40"> 헤럴드 </td>
          <td class="gray" width="40"> 기타 </td>
          <td class="gray" width="40"> 계 </td>
        </tr>
        <tr align="right">
          <td class="gray" width="70" >&nbsp;<%= curcommlist2Rec.d_hmmsendqty%></td>
          <td class="gray" width="70" >&nbsp;<%= curcommlist2Rec.d_hmmvalqty%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_ftcnt1%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_ftcnt2%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_ftcnt3%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_ftcnt4%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_excsaftcnt6%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_aftcnt_tot%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlist2Rec.d_pub_infonwsp%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlist2Rec.d_dntnwsp%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlist2Rec.d_resvnwsp%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty1%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty2%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty3%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty4%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty5%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty_etc_tot%></td>
        </tr>
      </table>

      <!--성장리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail4">
	    <tr bgcolor="#D5DACD">
          <td colspan="12" align="center" class="gray"><b>성장 (<%= Util.convertMonthS(ds.getBasi_yymm())%>)</b></td>
        <tr>
        <tr align="center">
          <td colspan="3" class="gray" bgcolor="#dddddd"> 전월부수 </td>
          <td colspan="3" class="gray" bgcolor="#dddddd"> 당월부수 </td>
          <td colspan="3" class="gray" bgcolor="#dddddd"> 성장부수(전월대비) </td>
          <td colspan="3" class="gray" bgcolor="#dddddd"> 성장부수(전년대비) </td>
        </tr>
        <tr align="center">
          <td class="gray" width="69" bgcolor="#dddddd"> 당월유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 준유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 계 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 당월유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 준유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 계 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 당월유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 준유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 계 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 당월유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 준유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 계 </td>
        </tr>
        <tr align="right">
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.pm_hmmvalqtyb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.pm_aftcnt_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.pm_val_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_hmmvalqtyb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_aftcnt_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_val_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpm_hmmvalqtyb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpm_aftcnt_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpm_val_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpy_hmmvalqtyb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpy_aftcnt_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpy_val_totb)%></td>
        </tr>
      </table>

      <!--마감리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail5">

        <tr bgcolor="#D5DACD">
          <td colspan="11" align="center" class="gray"><b>마감 (<%= Util.convertMonthS(ds.getBasi_yymm())%>)</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td rowspan="2" class="gray" width="80" bgcolor="#dddddd"> 목표액 </td>
          <td colspan="5" class="gray"> 총수금액 </td>
          <td rowspan="2" class="gray" width="80"> 전월수금액 </td>
          <td rowspan="2" class="gray" width="80"> 전월대비 </td>
          <td rowspan="2" class="gray" width="80"> 지역전단 </td>
          <td rowspan="2" class="gray" width="80"> 조선IS전단 </td>
          <td rowspan="2" class="gray" width="80"> 전단수금액 </td>
        </tr>
        <tr align="center">
          <td bgcolor="#dddddd" class="gray" width="69"> 지로수금 </td>
          <td bgcolor="#dddddd" class="gray" width="69"> 방문수금 </td>
          <td bgcolor="#dddddd" class="gray" width="69"> 자동이체 </td>
          <td bgcolor="#dddddd" class="gray" width="69"> 기타 </td>
          <td bgcolor="#dddddd" class="gray" width="69"> 소계 </td>
        </tr>
        <tr align="right">
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_meda_amt)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_giroclamt)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_vistclamt)%></td>
          <%--  자동이체(지로자동이체)--%>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_giroauto_shiftclamt)%></td>
          <%-- 기타(신한카드이체수금액,일반카드이체수금액,온라인결제수금액,기타수금액) --%>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_etcclamt+curcommlist2Rec.d_docard_shiftclamt+curcommlist2Rec.d_gnrcard_shiftclamt+curcommlist2Rec.d_onlsetlclamt)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_clamt_tot)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.pm_clamt_tot)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpm_clamt_tot)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_arealeafclamt)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_teampreisleafclamt)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_leafclamt)%></td>
        </tr>
      <%}%>
      </table>
      <!--지대리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail6">
		<%
		for(int i=0; i<ds.curcommlist3.size(); i++){
			SS_S_BOINFOCURCOMMLIST3Record curcommlist3Rec = (SS_S_BOINFOCURCOMMLIST3Record)ds.curcommlist3.get(i);
		%>
	    <tr bgcolor="#D5DACD">
          <td colspan="5" align="center" class="gray"><b>지대 (<%= Util.convertMonthS(ds.getJd_yymm())%>)</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td class="gray" width="166"> 본지 </td>
          <td class="gray" width="166"> 소년 </td>
          <td class="gray" width="166"> 주간 </td>
          <td class="gray" width="166"> 스포츠 </td>
          <td class="gray" width="166"> 계 </td>
        </tr>
        <tr align="right">
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.cho_amt)%>&nbsp;</td>
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.boy_amt)%>&nbsp;</td>
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.wee_amt)%>&nbsp;</td>
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.sch_amt)%>&nbsp;</td>
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.tot_amt)%>&nbsp;</td>
        </tr>
      <%}%>
      </form>
      </table>

<script>
	// 검색 기준년월 설정
	parent.boinfo_detail_form.basi_yymm.value = '<%= ds.getBasi_yymm()%>';
	// 지국명 변경
	parent.document.all.boinfo_detail_bonm_id.innerHTML	= '- <%= ds.getBonm()%> <%= oprenvclsfnm%>';
	// 항목별 상세 변경
    parent.document.all.boinfo_detail1.outerHTML = boinfo_detail1.outerHTML;
    parent.document.all.boinfo_detail2.outerHTML = boinfo_detail2.outerHTML;
    parent.document.all.boinfo_detail3.outerHTML = boinfo_detail3.outerHTML;
    parent.document.all.boinfo_detail4.outerHTML = boinfo_detail4.outerHTML;
    parent.document.all.boinfo_detail5.outerHTML = boinfo_detail5.outerHTML;
    parent.document.all.boinfo_detail6.outerHTML = boinfo_detail6.outerHTML;
	// 입력항목 처리
	parent.jsInit();
</script>
