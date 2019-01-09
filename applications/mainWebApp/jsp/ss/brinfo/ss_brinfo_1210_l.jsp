<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1210_l.jsp
* 기능 : 지국Info-지국장정보-조회
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
	SS_L_BO_HEADDataSet ds = (SS_L_BO_HEADDataSet)request.getAttribute("ds");
    int moveListCount = 5;	// 한 화면당 리스트 항목 수
%>

<!--지국장정보 목록 list iframe-->
<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="bo_head_list_id">
	<tr align="center"  bgcolor="#dddddd" height\"23">
		<td class="gray" width="60" bgcolor="#dddddd" height="23"> 팀&nbsp; </td>
		<td class="gray" width="60" bgcolor="#dddddd"> 지역 </td>
		<td class="gray" width="60" bgcolor="#dddddd"> 지국 </td>
		<td class="gray" width="65" bgcolor="#dddddd"> 지국장 </td>
		<td class="gray" width="55" bgcolor="#dddddd"> 구분 </td>
		<td class="gray" width="305"> 주소 </td>
		<td class="gray" width="80" bgcolor="#dddddd"> 지국 전화번호 </td>
		<td class="gray" width="80" bgcolor="#dddddd"> 지국장 휴대폰 </td>
		<td class="gray" width="65" bgcolor="#dddddd"> 보증인 </td>
	</tr>
	<%-- 지국장정보 리스트 가져 오는 부분--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BO_HEADCURCOMMLISTRecord curcommlistRec = (SS_L_BO_HEADCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
	<tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>','<%= curcommlistRec.prn%>','<%= curcommlistRec.bjjgseq%>','<%= curcommlistRec.bjjuminno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" width="60"> &nbsp;<%= curcommlistRec.boksnm%> </td>
		<td class="gray" width="60"> &nbsp;<%= curcommlistRec.areanm%> </td>
		<td class="gray" width="60"> &nbsp;<%= curcommlistRec.bonm%> </td>
		<td class="gray" width="65"> &nbsp;<%= curcommlistRec.bo_headnm%> </td>
		<td class="gray" width="55" align="center"> &nbsp;<%= curcommlistRec.jmgystgb%> </td>
		<td class="gray" width="305"> &nbsp;<%= curcommlistRec.boaddr%> <%= curcommlistRec.bodtlsaddr%> </td>
		<td class="gray" width="80" align="left"> &nbsp;<%= Util.getChainStr(curcommlistRec.tel_no11,curcommlistRec.tel_no12,curcommlistRec.tel_no13,"-")%> </td>
		<td class="gray" width="80" align="left"> &nbsp;<%= Util.getChainStr(curcommlistRec.bo_head_ptph_no1,curcommlistRec.bo_head_ptph_no2,curcommlistRec.bo_head_ptph_no3,"-")%></td> </td>
		<td class="gray" width="65"> &nbsp;<%= curcommlistRec.bjnm%> </td>
	</tr>
	<%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="65"> &nbsp; </td>
		<td class="gray" width="55" align="center" > &nbsp; </td>
		<td class="gray" width="305"> &nbsp; </td>
		<td class="gray" width="80" align="center" > &nbsp; </td>
		<td class="gray" width="80" align="center" > &nbsp; </td>
		<td class="gray" width="65"> &nbsp; </td>
	</tr>
	<%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
	<tr align="right">
		<td colspan="10" bgcolor="#dddddd" class="gray" height="23">
		<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 <%= Util.comma(ds.getTotalcnt())%> 건</b>
		</td>
	</tr>
</table>
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
		<!--지국장정보 목록 list iframe end -->

<script>
    parent.document.all.bo_head_list_id.outerHTML = bo_head_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>
