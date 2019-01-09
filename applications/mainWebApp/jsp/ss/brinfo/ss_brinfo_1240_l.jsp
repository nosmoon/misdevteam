<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1240_l.jsp
* 기능 : 지국Info-지국장정보-지국장소견-목록
* 작성일자 : 2004-05-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BO_HEADIDEADataSet ds = (SS_L_BO_HEADIDEADataSet)request.getAttribute("ds");
    int ideaListCount = 7;	// 한 화면당 리스트 항목 수
%>

<table width="489" border="0"  cellpadding="1" cellspacing="0" id="bo_head_idea_list_id">
	<tr align="center"  bgcolor="#dddddd"  height="23"> 
		<td class="gray" width="50" bgcolor="#dddddd"> 순번 </td>
		<td class="gray" width="100" bgcolor="#dddddd"> 작성자명 </td>
		<td class="gray" width="100" bgcolor="#dddddd"> 작성일자 </td>
		<td class="gray" bgcolor="#dddddd"> 소견 </td>
	</tr>
	<%-- 지국장 소견 목록 반복 시작 --%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BO_HEADIDEACURCOMMLISTRecord curcommlistRec = (SS_L_BO_HEADIDEACURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<tr height="23" onclick="detail_view_idea('<%= curcommlistRec.prn%>','<%= curcommlistRec.seq%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" width="50"  align="center"> <%= curcommlistRec.seq %>&nbsp; </td>
		<td class="gray" width="100" align="left"> <%= curcommlistRec.makepersnm%>&nbsp; </td>
		<td class="gray" width="100" align="center"> <%= Util.convertS(curcommlistRec.makedt)%>&nbsp; </td>
		<td class="gray" align="left"> <%= Util.convertS(curcommlistRec.idea1)%>&nbsp; </td>
	</tr>
	<%}%> 
	<%-- 지국장 소견 목록 반복 끝 --%> 

	<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
	<%for(int i=0; i<(ideaListCount-ds.curcommlist.size()); i++){%>  
		<tr height="23"> 
			<td class="gray" width="50">&nbsp;</td>
			<td class="gray" width="100">&nbsp;</td>
			<td class="gray" width="100">&nbsp;</td>
			<td class="gray">&nbsp;</td>
		</tr>
	<%}%> 
	<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>  

	<tr bgcolor="#dddddd"> 
		<td colspan="4" class="gray" height="23"  align="right">
			<img src="/html/comm_img/ic_arr06.gif" align="absmiddle" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>
</table>
	
<!-- 지국장 소견 페이지 이동 -->
<table width="490" border="0" cellspacing="0" cellpadding="1" class="title2" id="page_move_idea">
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
		    <jsp:param name = "pagesize" 		value="<%=ideaListCount%>"/>
		    <jsp:param name = "page_set_gubun" 	value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>	    
        </td>
    </tr>
</table>
<!-- 지국장 소견 페이지 이동 -->

<script>
    parent.document.all.bo_head_idea_list_id.outerHTML = bo_head_idea_list_id.outerHTML;
    parent.document.all.page_move_idea.outerHTML = page_move_idea.outerHTML;

    // 상세 초기화
    parent.add();
    
    // 이벤트 핸들러 호출
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>
