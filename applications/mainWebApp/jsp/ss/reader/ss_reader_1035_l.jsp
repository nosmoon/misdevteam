<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1035_l.jsp
* 기능 : 독자현황-독자정보-독자이력 수금이력 목록
* 작성일자 : 2003-12-30
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CLAM_HSTYDataSet ds = (SS_L_CLAM_HSTYDataSet)request.getAttribute("ds");
    int clamHstyListCount = 5;	// 한 화면당 리스트 항목 수
    String prevyymm = ds.getPrevyymm();	// 이전년월(6자리)
	String frYYMM8 = Util.addDate(prevyymm+"01", Calendar.MONTH, -5);	// 6개월 이전 년월(8자리)
	String toYYMM8 = Util.addDate(prevyymm+"01", Calendar.MONTH, 4);	// 3개월 이후 년월
	String frYYMM = Util.checkString(frYYMM8).substring(0,6);			// 6개월 이전 년월(8자리)
	String toYYMM = Util.checkString(toYYMM8).substring(0,6);			// 3개월 이후 년월
%>
<table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="hsty_list_id">

	<tr bgcolor="#dddddd" align="center">
		<td width="100" height="23" class="gray" align="center"> 월분</td>
		<td width="150" height="23" class="gray" align="center"> 입금일자</td>
		<td width="100" height="23" class="gray" align="center"> 금액</td>
		<td width="100" height="23" class="gray" align="center"> 입금</td>
		<td width="100" height="23" class="gray" align="center"> 입금구분</td>
	</tr>

	<!--수금이력 목록 시작-->
	<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_CLAM_HSTYRSLTCURRecord rsltcurRec = (SS_L_CLAM_HSTYRSLTCURRecord)ds.rsltcur.get(i);
    %>
	<tr>
		<td width="100" class="gray" align="center"> <%= Util.convertMonthS(rsltcurRec.subsmappli)%>&nbsp;</td>
		<td width="150" class="gray" align="center"> <%= Util.convertS(rsltcurRec.recpdt)%>&nbsp;</td>
		<td width="100" class="gray" align="right"> <%= Util.comma(rsltcurRec.clamamt)%>&nbsp;</td>
		<td width="100" class="gray" align="right"> <%= Util.comma(rsltcurRec.clamt)%>&nbsp;</td>
		<td width="100" class="gray" align="center"> <%= rsltcurRec.rcpmclsfnm%>&nbsp;</td>
	</tr>
	<%}%>
	<!--수금이력 목록 끝-->

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
	<%for(int j=0; j<clamHstyListCount - ds.rsltcur.size(); j++){%>
	<tr>
		<td width="100" class="gray"> &nbsp;</td>
		<td width="150" class="gray"> &nbsp;</td>
		<td width="100" class="gray"> &nbsp;</td>
		<td width="100" class="gray"> &nbsp;</td>
		<td width="100" class="gray"> &nbsp;</td>
	</tr>
	<%}%>
</table>

<!-- 페이지 이동 -->
<!-- 일반 페이지 이동이 아니라 이전, 이후 두 버튼으로 기준월을 이동하면서 수금이력 목록을 보여준다. -->
<table width="100%" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_move_hsty">
  <tr>
    <td align="center" height="25" bgcolor="#E8E8E8">
		<img src="/html/comm_img/bu_ar02.gif" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:clam_hsty_search('prev')">
		[<%= Util.convertMonthS(frYYMM)%>] - [<%= Util.convertMonthS(toYYMM)%>] 월분
		<img src="/html/comm_img/bu_ar01.gif" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:clam_hsty_search('next')">
	</td>
  </tr>
</table>
<!-- 페이지 이동 -->

<script language="javascript">
	parent.document.all.hsty_list_id.outerHTML = hsty_list_id.outerHTML;
  	parent.document.all.page_move_hsty.outerHTML = page_move_hsty.outerHTML;
	// 기준년월, 이전, 이후 년월 설정
	parent.document.hsty_search_form.basiyymm.value = <%= ds.getCurryymm()%>;
	parent.document.hsty_search_form.prevyymm.value = <%= ds.getPrevyymm()%>;
	parent.document.hsty_search_form.nextyymm.value = <%= ds.getNextyymm()%>;
	
    // 이벤트 핸들러 호출
    parent.jsInit();
    
<%if(ds.rsltcur.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%></script>