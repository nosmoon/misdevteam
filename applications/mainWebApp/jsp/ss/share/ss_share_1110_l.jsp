<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1110_l.jsp
* 기능 : 정보공유 타사발송부수 조회화면
* 작성일자 : 2003-11-20
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
    SS_L_OTHQTYDataSet ds = (SS_L_OTHQTYDataSet) request.getAttribute("ds");  // request dataset
    int listCount = 20;	// 한 화면당 리스트 항목 수
%>

<table width="830" border="0" cellspacing="0" cellpadding="1" align="center" bgcolor="#FFFFFF" class="gray" id="othqty_list_id">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td class="gray">등록일자</td>
		<td class="gray" width="120">팀&nbsp;</td>
		<td class="gray" width="120">지역</td>
		<td class="gray" width="120">지국</td>
		<td class="gray" width="120">중앙일보</td>
		<td class="gray" width="120">동아일보</td>
		<td class="gray" width="120">기타</td>
	</tr>
	<%-- 정보공유 타사 발송부수 리스트 가져 오는 부분--%>
	<%for(int i=0 ; i< ds.curcommlist.size(); i++) {
        SS_L_OTHQTYCURCOMMLISTRecord rec = (SS_L_OTHQTYCURCOMMLISTRecord)ds.curcommlist.get(i); %>

	<tr>
		<td class="gray" align="center"> &nbsp;<%= Util.convertS(rec.getInvsgdt()) %> </td>
		<td class="gray" width="120" align="left"> &nbsp;<%= rec.getDeptnm()%> </td>
		<td class="gray" width="120" align="left"> &nbsp;<%= rec.getAreanm()%> </td>
		<td class="gray" width="120" align="left"> &nbsp;<%= rec.getBonm()%> </td>
		<td class="gray" width="120" align="right"> &nbsp;<%= Util.comma(rec.getJoong_qty())%> </td>
		<td class="gray" width="120" align="right"> &nbsp;<%= Util.comma(rec.getDong_qty())%> </td>
		<td class="gray" width="120" align="right"> &nbsp;<%= Util.comma(rec.getEtc_qty())%> </td>
	</tr>
    <%}%>

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" align="center"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
	</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="7" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>
</table>
<!-- 페이지 이동 -->
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
			<jsp:param name = "pageno" 		value="<%=pageno%>"/>
			<jsp:param name = "totalcnt" 	value="<%=totalcnt%>"/>
			<jsp:param name = "js_fn_nm" 	value="<%=js_fn_nm%>"/>
			<jsp:param name = "pagesize" 	value="<%= listCount%>"/>
			<jsp:param name = "page_set_gubun" 	value="0"/>
			</jsp:include>
			<!--JSP PAGE END------------------------------------------------------------------------------------>
		</td>
	</tr>
</table>
<!-- 페이지 이동 -->

<script>
    parent.document.all.othqty_list_id.outerHTML = othqty_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();


<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>
