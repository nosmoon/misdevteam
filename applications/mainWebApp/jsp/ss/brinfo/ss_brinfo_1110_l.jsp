<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1110_l.jsp
* 기능 : 지국Info-지국현황-조회
* 작성일자 : 2004-02-10
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_BOINFODataSet ds = (SS_L_BOINFODataSet)request.getAttribute("ds");
    int moveListCount = 10;	// 한 화면당 리스트 항목 수
%>

      <!--지국현황 현황목록 list iframe-->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_list_id">
        <tr bgcolor="#dddddd" align="center">
          <td class="gray" height="23"> 팀&nbsp;</td>
          <td class="gray" width="70"> 지역</td>
          <td class="gray" width="70"> 지국</td>
          <td class="gray" width="70"> 지국장</td>
          <td class="gray" width="340"> 주소</td>
          <td class="gray" width="90"> 지국 전화번호</td>
          <td class="gray" width="90"> 지국장 휴대폰</td>
        </tr>
	<%-- 지국비품현황 현황 리스트 가져 오는 부분--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOINFOCURCOMMLISTRecord curcommlistRec = (SS_L_BOINFOCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
        <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
          <td class="gray">&nbsp;<%= curcommlistRec.boksnm%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlistRec.areanm%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlistRec.bonm%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlistRec.bo_headnm%></td>
          <td class="gray" width="340">&nbsp;<%= curcommlistRec.boaddr%> <%= curcommlistRec.bodtlsaddr%></td>
          <td class="gray" width="90" align="left">&nbsp;<%= Util.getChainStr(curcommlistRec.tel_no11,curcommlistRec.tel_no12,curcommlistRec.tel_no13,"-")%></td>
          <td class="gray" width="90" align="left">&nbsp;<%= Util.getChainStr(curcommlistRec.bo_head_ptph_no1,curcommlistRec.bo_head_ptph_no2,curcommlistRec.bo_head_ptph_no3,"-")%></td>
        </tr>
	<%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
        <tr>
          <td class="gray">&nbsp;</td>
          <td class="gray" width="70">&nbsp;</td>
          <td class="gray" width="70">&nbsp;</td>
          <td class="gray" width="70">&nbsp;</td>
          <td class="gray" width="340">&nbsp;</td>
          <td class="gray" width="90" align="center">&nbsp;</td>
          <td class="gray" width="90" align="center">&nbsp;</td>
        </tr>
	<%}%>
    <%-- 초기화면 목록 반복 끝 --%>
        <tr align="right">
          <td colspan="9" bgcolor="#dddddd" class="gray" height="23">
          	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 <%= Util.comma(ds.getTotalcnt())%> 건</b>
          </td>
        </tr>
      </table>
      <!---button-->
      <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
        <tr>
          <td align="center" height="2">
            <!--여백-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
		    <!--JSP PAGE START---------------------------------------------------------------------------------->
		    <%
		        String pageno = request.getParameter("pageno");
		        String totalcnt = String.valueOf(ds.getTotalcnt());
		        String js_fn_nm = request.getParameter("js_fn_nm");
		    %>
		    <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
			    <jsp:param name = "pageno" 			value="<%=pageno%>"/>
			    <jsp:param name = "totalcnt" 		value="<%=totalcnt%>"/>
			    <jsp:param name = "js_fn_nm" 		value="<%=js_fn_nm%>"/>
			    <jsp:param name = "pagesize" 		value="<%=moveListCount%>"/>
			    <jsp:param name = "page_set_gubun" 	value="0"/>
		    </jsp:include>
		    <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
      </table>
		<!--지국현황 현황목록 list iframe end -->


<!-- 목록 검색시 상세 화면 초기화를 위한 테이블 시작 -->

<!--조직 (현재) 리스트 -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail1">
<tr bgcolor="#D5DACD">
  <td colspan="11" align="center" class="gray"><b>조직 (현재)</b></td>
<tr>
<tr bgcolor="#dddddd" align="center">
  <td rowspan="2" class="gray"> 총무 </td>
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
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray">&nbsp;</td>
</tr>
</table>
<!--확장/중지 리스트 -->
<table width="830" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="boinfo_detail2">
<tr bgcolor="#D5DACD">
  <td colspan="15" align="center" class="gray"><b>확장/중지</b></td>
<tr>
<tr align="center">
  <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> 확장</td>
  <td class="gray" bgcolor="#dddddd" width="55" > 신청</td>
  <td class="gray" bgcolor="#dddddd" width="55"> 직원</td>
  <td class="gray" bgcolor="#dddddd" width="55"> 요원</td>
  <td class="gray" bgcolor="#dddddd" width="55"> 이전</td>
  <td class="gray" bgcolor="#dddddd" width="55"> 본사</td>
  <td class="gray" bgcolor="#dddddd" width="55"> 계</td>
  <td class="gray" bgcolor="#dddddd" width="55"> 확장율</td>
  <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> 중지</td>
  <td class="gray" bgcolor="#dddddd" width="55" > 이사</td>
  <td class="gray" bgcolor="#dddddd" width="55" > 거절</td>
  <td class="gray" bgcolor="#dddddd" width="55" > 타지구독</td>
  <td class="gray" bgcolor="#dddddd" width="55" > 기타</td>
  <td class="gray" bgcolor="#dddddd" width="55" > 계</td>
  <td class="gray" bgcolor="#dddddd" width="55" > 중지율</td>
</tr>
<tr >
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
</tr>
</table>
<!--부수 리스트 -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail3">
<tr bgcolor="#D5DACD">
  <td colspan="17" align="center" class="gray"><b>부수</b></td>
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
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp; </td>
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
</tr>
</table>
<!--성장리스트 -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail4">
<tr bgcolor="#D5DACD">
  <td colspan="12" align="center" class="gray"><b>성장</b></td>
<tr>
<tr align="center">
  <td  colspan="3" class="gray" bgcolor="#dddddd"> 전월부수 </td>
  <td colspan="3" class="gray" bgcolor="#dddddd"> 당월부수 </td>
  <td colspan="3" class="gray" bgcolor="#dddddd"> 성장부수(전월대비) </td>
  <td colspan="3" class="gray" bgcolor="#dddddd"> 성장부수(전년대비) </td>
</tr>
<tr align="center">
  <td class="gray" width="69" bgcolor="#dddddd" > 당월유가 </td>
  <td class="gray" width="69" bgcolor="#dddddd" > 준유가 </td>
  <td class="gray" width="69" bgcolor="#dddddd" > 계 </td>
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
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
</tr>
</table>
<!--마감리스트 -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail5">

<tr bgcolor="#D5DACD">
  <td colspan="11" align="center" class="gray"><b>마감</b></td>
<tr>
<tr bgcolor="#dddddd" align="center">
  <td rowspan="2" class="gray" width="80" bgcolor="#dddddd"> 목표액 </td>
  <td colspan="5" class="gray"> 총수금액 </td>
  <td  rowspan="2" class="gray" width="80"> 전월수금액 </td>
  <td rowspan="2" class="gray" width="80"> 전월대비 </td>
  <td  rowspan="2" class="gray" width="80"> 지역전단 </td>
  <td  rowspan="2" class="gray" width="80"> 조선IS전단 </td>
  <td rowspan="2" class="gray" width="80"> 전단수금액 </td>
</tr>
<tr align="center">
  <td bgcolor="#dddddd" class="gray" width="69"> 지로수금 </td>
  <td  bgcolor="#dddddd" class="gray" width="69"> 방문수금 </td>
  <td bgcolor="#dddddd" class="gray" width="69"> 자동이체 </td>
  <td bgcolor="#dddddd" class="gray" width="69"> 기타 </td>
  <td bgcolor="#dddddd" class="gray" width="69"> 소계 </td>
</tr>
<tr align="right">
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
</tr>
</table>
<!--지대리스트 -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail6">
<tr bgcolor="#D5DACD">
  <td colspan="5" align="center" class="gray"><b>지대</b></td>
<tr>
<tr bgcolor="#dddddd" align="center">
  <td class="gray" width="166" > 본지 </td>
  <td class="gray" width="166" > 소년 </td>
  <td class="gray" width="166" > 주간 </td>
  <td class="gray" width="166" > 스포츠 </td>
  <td class="gray" width="166" > 계 </td>
</tr>
<tr align="right">
  <td class="gray" width="166" >&nbsp;</td>
  <td class="gray" width="166" >&nbsp;</td>
  <td class="gray" width="166" >&nbsp;</td>
  <td class="gray" width="166" >&nbsp;</td>
  <td class="gray" width="166" >&nbsp;</td>
</tr>
</table>
<!-- 목록 검색시 상세 화면 초기화를 위한 테이블 끝 -->
<script>
    parent.document.all.boinfo_list_id.outerHTML = boinfo_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
<%--
    // 상세화면 년월 초기화
    parent.document.boinfo_detail_form.basi_yymm.value='<%= Util.getYyyyMm()%>';
--%>
    // 이벤트 핸들러 호출
    parent.jsInit();

    // 상세화면 초기화
	parent.document.all.boinfo_detail_bonm_id.innerHTML	= '&nbsp;';

    parent.document.all.boinfo_detail1.outerHTML = boinfo_detail1.outerHTML;
    parent.document.all.boinfo_detail2.outerHTML = boinfo_detail2.outerHTML;
    parent.document.all.boinfo_detail3.outerHTML = boinfo_detail3.outerHTML;
    parent.document.all.boinfo_detail4.outerHTML = boinfo_detail4.outerHTML;
    parent.document.all.boinfo_detail5.outerHTML = boinfo_detail5.outerHTML;
    parent.document.all.boinfo_detail6.outerHTML = boinfo_detail6.outerHTML;

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>
