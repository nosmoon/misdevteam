<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1805_l.jsp
* 기능 : 지국지원-아파트투입률-목록(아파트)
* 작성일자 : 2004-11-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_APTDataSet ds = (SS_L_APTDataSet)request.getAttribute("ds");
    int listCount = 20;		// 한 화면당 리스트 항목 수
    BigDecimal d1 = null;
    BigDecimal d2 = null;
%>
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="apt_list_id">
<form name="cdv_list_form" method="post" action="" >
    <input name="bocd" type="hidden" value ="">		<!--지국지사코드-->
    <input name="addrcd" type="hidden" value ="">	<!--주소코드-->
    <input name="dongno" type="hidden" value ="">	<!--동호수-->

	<tr bgcolor="#dddddd" align="center" height="23"> 
		<td class="gray">아파트명</td>
		<td width="100" class="gray">동호수</td>
		<td width="100" class="gray">세대수</td>
		<td width="100" class="gray">독자수</td>
		<td width="100" class="gray">투입률</td>
	</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_APTCURCOMMLISTRecord curcommlistRec = (SS_L_APTCURCOMMLISTRecord)ds.curcommlist.get(i);
	d1 = new BigDecimal(curcommlistRec.rdrcnt);
	d2 = new BigDecimal(curcommlistRec.hoscnt);
	%>
    <!-- 상세 링크 -->
    <tr height="23" bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>', '<%= curcommlistRec.addrcd%>','<%= curcommlistRec.dongno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" align="left">&nbsp;<%= curcommlistRec.addrnm%></td>
		<td width="100" class="gray" align="right"><%= curcommlistRec.dongno%>&nbsp;</td>
		<td width="100" class="gray" align="right"><%= curcommlistRec.hoscnt%>&nbsp;</td>
		<td width="100" class="gray" align="right"><%= curcommlistRec.rdrcnt%>&nbsp;</td>
		<td width="100" class="gray" align="right"><%= ( (curcommlistRec.hoscnt == 0) ? 0 : d1.divide(d2, BigDecimal.ROUND_HALF_UP, 1).doubleValue() * 100 ) %>&nbsp;</td>
	</tr> 
<%}%>	

<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
<%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
	<tr align="center""> 
		<td class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
	</tr>
<%}%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="5" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총 건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
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
                <jsp:param name = "pagesize" 	value="<%= listCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->
<script>
    parent.document.all.apt_list_id.outerHTML = apt_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    	
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>