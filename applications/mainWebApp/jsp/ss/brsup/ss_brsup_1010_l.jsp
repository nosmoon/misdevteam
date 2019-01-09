<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1010_l.jsp
* 기능 : 지국지원-신문지원물품-등록-목록
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWSPITEMDataSet ds = (SS_L_NWSPITEMDataSet)request.getAttribute("ds");
    int nwspitemListCount = 10;	// 한 화면당 리스트 항목 수
%>

<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" id="nwspitem_list_id">

<form name="nwspitem_list_form" method="post" action="">
	<input name="itemcd" type="hidden" value ="">					<!-- 물품코드 -->

	<tr bgcolor="#dddddd" height="23">
		<td class="gray" align="center">물품명</td>
		<td width="100" class="gray" align="center">물품코드</td>
		<td width="150" class="gray" align="center">물품구분</td>
		<td width="100" class="gray" align="center">발송구분</td>
		<td width="100" class="gray" align="center">비용청구구분</td>
		<td width="100" class="gray" align="center">단가</td>
		<td width="100" class="gray" align="center">재고수량</td>
	</tr>

	<!-- 신문지원물품 목록 시작 -------------------------------------------------------------------------->
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 상세 링크 -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.itemcd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" align="left">&nbsp;<%= curcommlistRec.itemnm%></td>
		<td width="100" class="gray" align="center"><%= curcommlistRec.itemcd%>&nbsp;</td>
		<td width="150" class="gray" align="left">&nbsp;<%= curcommlistRec.itemclsfnm%></td>
		<td width="100" class="gray" align="left">&nbsp;<%= curcommlistRec.sendclsfnm%></td>
		<td width="100" class="gray" align="left">&nbsp;<%= curcommlistRec.costclsfnm%></td>
		<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.uprc)%>&nbsp;</td>
		<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.qunt)%>&nbsp;</td>
	</tr>
    <%}%>

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(nwspitemListCount-ds.curcommlist.size()); i++){%>
    <tr>
		<td class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="center">&nbsp;</td>
		<td width="150" class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="right">&nbsp;</td>
		<td width="100" class="gray" align="right">&nbsp;</td>
	</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>

	<tr bgcolor="#dddddd">
		<td height="23" class="gray" colspan="11" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt()) %> 건 </b>
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
                <jsp:param name = "pagesize" 	value="<%= nwspitemListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->
<!-- 신문지원물품 목록 끝 -------------------------------------------------------------------------->

<script>
    parent.document.all.nwspitem_list_id.outerHTML = nwspitem_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // 이벤트 핸들러 호출
    parent.jsInit();
    
    // 화면 초기화
    parent.add();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>   
</script>
