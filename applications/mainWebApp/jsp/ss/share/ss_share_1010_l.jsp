<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1010_l.jsp
* 기능 : 정보공유 일정 리스트 가져오기
* 작성일자 : 2003-10-27
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
    CO_L_SCHEDataSet ds = (CO_L_SCHEDataSet)request.getAttribute("ds");    // request dataset
    int moveListCount = 10;	// 한 화면당 리스트 항목 수
%>

<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="sche_list_id">
<form name="sche_list_form" method="post" action="">
	<input type="hidden" name="seq">			<!--일련번호-->

	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="80">구분</td>
		<td class="gray" width="80">팀&nbsp;</td>
		<td class="gray" width="80">등록자</td>
		<td class="gray" width="100">일정명</td>
		<td class="gray" width="90">시작일자</td>
		<td class="gray" width="90">종료일자</td>
		<td class="gray">설명</td>
	</tr>

    <%-- 일정 목록 시작--%>
    <%for(int i=0 ; i< ds.curcommlist.size(); i++) {
        CO_L_SCHECURCOMMLISTRecord curcommlistRec = (CO_L_SCHECURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.seq%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" width="80" align="left">&nbsp; <%= curcommlistRec.schemangunitcd_nm%></td>
		<td class="gray" width="80" align="left">&nbsp; <%= curcommlistRec.deptnm%></td>
		<td class="gray" width="80" align="left">&nbsp; <%= curcommlistRec.empnm%></td>
		<td class="gray" width="100" align="left">&nbsp; <%= curcommlistRec.schemangitemcd_nm%></td>
		<td class="gray" width="90" align="center">&nbsp; <%=Util.Timestamp2Str(curcommlistRec.frdt)%> </td>
		<td class="gray" width="90" align="center">&nbsp; <%=Util.Timestamp2Str(curcommlistRec.todt)%> </td>
		<td class="gray">&nbsp; <%= curcommlistRec.remk%></td>
	</tr>
    <%}%>
    <%-- 일정 목록 끝--%>

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="90" align="center">&nbsp;</td>
		<td class="gray" width="90" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <%}%>
	<%-- 초기화면 목록 반복 끝 --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="7" height="23" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%=Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>
</form>
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
    parent.document.all.sche_list_id.outerHTML = sche_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

    // 화면 초기화
    parent.add();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>
