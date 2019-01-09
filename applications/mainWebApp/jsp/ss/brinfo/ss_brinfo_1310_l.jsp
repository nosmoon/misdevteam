<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1310_l.jsp
* 기능 : 지국Info-지국조직현황-목록
* 작성일자 : 2004-02-06
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOEMPDataSet ds = (SS_L_BOEMPDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// 한 화면당 리스트 항목 수

	// 조회조건에 따라, 부서(팀)별 지역별,지국별 목록을 구성한다.
	String viewflag = request.getParameter("viewflag");

%>

<%--부서(팀)별--%>
<%if("1".equals(viewflag)){%>
<table width="830" border="0" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" id="boemp_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">팀&nbsp;</td>
		<td rowspan="2" class="gray" width="80">발송부수</td>
		<td rowspan="2" class="gray" width="50">총무</td>
		<td colspan="5" class="gray">배달원</td>
		<td rowspan="2" class="gray" width="50">삽지</td>
		<td rowspan="2" class="gray" width="50">경리</td>
		<td rowspan="2" class="gray" width="50">주방</td>
		<td rowspan="2" class="gray" width="50">기타</td>
		<td rowspan="2" class="gray" width="50">계</td>
		<td rowspan="2" class="gray" width="55">사이버</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="50">전문</td>
		<td class="gray" width="50">주부</td>
		<td class="gray" width="50">알바</td>
		<td class="gray" width="50">기타</td>
		<td class="gray" width="50">계</td>
	</tr>
	<%-- 지국비품현황 현황 리스트 가져 오는 부분--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMPCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMPCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
	<tr>
		<td class="gray">&nbsp;<%= curcommlistRec.boknm%></td>
		<td class="gray" align="right" width="80"><%= Util.comma(curcommlistRec.bsbusu)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd20)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd50)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd60)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd70)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd80)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.total1)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd100)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd40)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd110)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd120)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.total2)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(curcommlistRec.cybcnt)%>&nbsp;</td>
	</tr>
	<%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" > &nbsp; </td>
		<td class="gray" align="right" width="80" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="55" > &nbsp; </td>
	</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
	<tr bgcolor="#dddddd" height="23">
		<td class="gray" align="right">소계&nbsp; </td>
		<td class="gray" align="right" width="80"><%= Util.comma(ds.bsbusucnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd20cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd50cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd60cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd70cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd80cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.total1cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd100cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd40cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd110cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd120cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.total2cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(ds.cybcntcnt)%>&nbsp;</td>
	</tr>
	<tr align="right" height="23">
		<td colspan="14" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 <%= Util.comma(ds.getTotalcnt())%> 건</b>
		</td>
	</tr>
</table>

<%--지역별--%>
<%}else if("2".equals(viewflag)){%>
<table width="830" border="0" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" id="boemp_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">팀&nbsp;</td>
		<td rowspan="2" class="gray" width="70">지역</td>
		<td rowspan="2" class="gray" width="80">발송부수</td>
		<td rowspan="2" class="gray" width="50">총무</td>
		<td colspan="5" class="gray">배달원</td>
		<td rowspan="2" class="gray" width="45">삽지</td>
		<td rowspan="2" class="gray" width="45">경리</td>
		<td rowspan="2" class="gray" width="45">주방</td>
		<td rowspan="2" class="gray" width="45">기타</td>
		<td rowspan="2" class="gray" width="50">계</td>
		<td rowspan="2" class="gray" width="55">사이버</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="45">전문</td>
		<td class="gray" width="45">주부</td>
		<td class="gray" width="45">알바</td>
		<td class="gray" width="45">기타</td>
		<td class="gray" width="45">계</td>
	</tr>
	<%-- 지국비품현황 현황 리스트 가져 오는 부분--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMPCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMPCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
	<tr>
		<td class="gray">&nbsp;<%= curcommlistRec.boknm%></td>
		<td class="gray" width="70">&nbsp;<%= curcommlistRec.areanm%></td>
		<td class="gray" align="right" width="80"><%= Util.comma(curcommlistRec.bsbusu)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd20)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd50)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd60)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd70)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd80)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.total1)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd100)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd40)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd110)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd120)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.total2)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(curcommlistRec.cybcnt)%>&nbsp;</td>
	</tr>
	<%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" > &nbsp; </td>
		<td class="gray" width="70" > &nbsp; </td>
		<td class="gray" align="right" width="80" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="55" > &nbsp; </td>
	</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="2" class="gray" align="right">소계&nbsp; </td>
		<td class="gray" align="right" width="80"><%= Util.comma(ds.bsbusucnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd20cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd50cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd60cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd70cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd80cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.total1cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd100cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd40cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd110cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd120cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.total2cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(ds.cybcntcnt)%>&nbsp;</td>
	</tr>
	<tr align="right" height="23">
		<td colspan="15" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 <%= Util.comma(ds.getTotalcnt())%> 건</b>
		</td>
	</tr>
</table>

<%--지국별--%>
<%}else{%>
<table width="830" border="0" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" id="boemp_list_id">
<form name="boemp_list_form" method="post" action="" >
    <input name="bocd" type="hidden" value ="">

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">팀&nbsp;</td>
		<td rowspan="2" class="gray" width="60">지역</td>
		<td rowspan="2" class="gray" width="60">지국</td>
		<td rowspan="2" class="gray" width="60">발송부수</td>
		<td rowspan="2" class="gray" width="45">총무</td>
		<td colspan="5" class="gray">배달원</td>
		<td rowspan="2" class="gray" width="45">삽지</td>
		<td rowspan="2" class="gray" width="45">경리</td>
		<td rowspan="2" class="gray" width="45">주방</td>
		<td rowspan="2" class="gray" width="45">기타</td>
		<td rowspan="2" class="gray" width="40">계</td>
		<td rowspan="2" class="gray" width="55">사이버</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="45">전문</td>
		<td class="gray" width="45">주부</td>
		<td class="gray" width="45">알바</td>
		<td class="gray" width="45">기타</td>
		<td class="gray" width="40">계</td>
	</tr>
	<%-- 지국비품현황 현황 리스트 가져 오는 부분--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMPCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMPCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
	<tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand"  onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray">&nbsp;<%= curcommlistRec.boknm%></td>
		<td class="gray" width="60">&nbsp;<%= curcommlistRec.areanm%></td>
		<td class="gray" width="60">&nbsp;<%= curcommlistRec.bonm%></td>
		<td class="gray" align="right" width="60"><%= Util.comma(curcommlistRec.bsbusu)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd20)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd50)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd60)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd70)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd80)%>&nbsp;</td>
		<td class="gray" align="right" width="40"><%= Util.comma(curcommlistRec.total1)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd100)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd40)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd110)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd120)%>&nbsp;</td>
		<td class="gray" align="right" width="40"><%= Util.comma(curcommlistRec.total2)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(curcommlistRec.cybcnt)%>&nbsp;</td>
	</tr>
	<%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" > &nbsp; </td>
		<td class="gray" width="60" > &nbsp; </td>
		<td class="gray" width="60" > &nbsp; </td>
		<td class="gray" align="right" width="60" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="40" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="40" > &nbsp; </td>
		<td class="gray" align="right" width="55" > &nbsp; </td>
	</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="3" class="gray" align="right">소계&nbsp; </td>
		<td class="gray" align="right" width="60"><%= Util.comma(ds.bsbusucnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd20cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd50cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd60cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd70cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd80cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="40"><%= Util.comma(ds.total1cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd100cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd40cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd110cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd120cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="40"><%= Util.comma(ds.total2cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(ds.cybcntcnt)%>&nbsp;</td>
	</tr>
	<tr align="right" height="23">
		<td colspan="16" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 <%= Util.comma(ds.getTotalcnt())%> 건</b>
		</td>
	</tr>
</form>
</table>
<%}%>

<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
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

<script>
    parent.document.all.boemp_list_id.outerHTML = boemp_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>
