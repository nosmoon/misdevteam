<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1410_l.jsp
* 기능 : 독자현황-VacationStop 비용-목록
* 작성일자 : 2004-01-20
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VSCOST_COSTDataSet ds = (SS_L_VSCOST_COSTDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// 한 화면당 리스트 항목 수
%>

<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="vscost_list_id">
	<tr bgcolor="#DDDDDD" height="23">
		<td class="gray" align="center" width="70">권역</td>
		<td class="gray" align="center" width="110">휴가지</td>
		<td class="gray" align="center" width="60">팀&nbsp;</td>
		<td class="gray" align="center" width="60">지역</td>
		<td class="gray" align="center" width="80">지국</td>
		<td class="gray" align="center" width="60">배달부수</td>
		<td class="gray" align="center" width="60">단가</td>
		<td class="gray" align="center" width="60">금액</td>
		<td class="gray" width="90" align="center">마감기준일자</td>
		<td class="gray" align="center">마감기간</td>
	</tr>
<%-- 독자불편 리스트 가져 오는 부분--%>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_VSCOST_COSTCURCOMMLISTRecord curcommlistRec = (SS_L_VSCOST_COSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<tr>
		<td class="gray" align="left" width="70">&nbsp;<%= curcommlistRec.vaca_arearegnnm%></td>
		<td class="gray" align="left" width="110">&nbsp;<%= curcommlistRec.vaca_areanm%></td>
		<td class="gray" align="left" width="60">&nbsp;<%= curcommlistRec.deptnm%></td>
		<td class="gray" align="left" width="60">&nbsp;<%= curcommlistRec.areanm%></td>
		<td class="gray" align="left" width="80">&nbsp;<%= curcommlistRec.bonm%></td>
		<td class="gray" align="right" width="60"><%= Util.comma(curcommlistRec.dlvqty)%>&nbsp;</td>
		<td class="gray" align="right" width="60"><%= Util.comma(curcommlistRec.costbasiamt)%>&nbsp;</td>
		<td class="gray" align="right" width="60"><%= Util.comma(curcommlistRec.amt)%>&nbsp;</td>
		<td class="gray" align="center" width="90"><%= Util.convertS(curcommlistRec.basidt)%>&nbsp;</td>
		<td class="gray" align="center"><%= Util.convertS(curcommlistRec.frdt)%> ~ <%= Util.convertS(curcommlistRec.todt)%>&nbsp;</td>
	</tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
<%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" align="center" width="70">&nbsp;</td>
		<td class="gray" align="center" width="110">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="right" width="60">&nbsp;</td>
		<td class="gray" align="right" width="60">&nbsp;</td>
		<td class="gray" align="center" width="90">&nbsp;</td>
		<td class="gray" align="center">&nbsp;</td>
	</tr>
<%}%>
<%-- 초기화면 목록 반복 끝 --%>
	<tr bgcolor="#DDDDDD" align="right">
		<td  height="23" class="gray" colspan="10">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b>총금액 <%= Util.comma(ds.getTotalcostamt())%> 원 </b>&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b>총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>
</table>

<!-- 페이지 이동 -->
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
                <jsp:param name = "pageno" 		value="<%=pageno%>"/>
                <jsp:param name = "totalcnt" 	value="<%=totalcnt%>"/>
                <jsp:param name = "js_fn_nm" 	value="<%=js_fn_nm%>"/>
                <jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->

<script>
    parent.document.all.vscost_list_id.outerHTML = vscost_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>
