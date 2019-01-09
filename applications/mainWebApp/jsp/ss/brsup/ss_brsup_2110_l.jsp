<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brsup_2110_l.jsp
* 기능 	 	 : 지국지원-컴퓨터AS(AS리스트)
* 작성일자 	 : 2004-03-15
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<% 
	SS_L_ASREQDataSet ds = (SS_L_ASREQDataSet)request.getAttribute("ds");
    int moveListCount = 5;	// 한 화면당 리스트 항목 수
%>
<table id="as_list_id" width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" >
	<tr bgcolor="#DDDDDD" height="23"> 
		<td width="50" class="gray"align="center">순번</td>
		<td class="gray" align="center"> A/S 요청내용</td>
		<td width="70" class="gray" align="center">상태</td>
		<td width="70" class="gray" align="center">신청일자</td>
		<td width="70" class="gray" align="center">접수일자</td>
		<td width="70" class="gray" align="center">완료일자</td>
	</tr>
   <%-- 현황조사 리스트를 출력 --%>
    <%
    	int TotalSize = Integer.parseInt(ds.getTotalcnt()+"");
    	int curr_page_int = Integer.parseInt(request.getParameter("pageno"));
        for(int i=0; i<ds.curasreqlist.size(); i++){
            SS_L_ASREQCURASREQLISTRecord rsltcurRec = (SS_L_ASREQCURASREQLISTRecord)ds.curasreqlist.get(i);
	%>
    <tr align="left" onClick="bocomp_view('<%=rsltcurRec.bocd%>','<%=rsltcurRec.regdt%>','<%=rsltcurRec.regno%>','<%=rsltcurRec.eqpno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
	    <td width="50" align="center" class="gray">&nbsp;<%=(curr_page_int-1)*moveListCount+i+1%></td>
	    <td class="gray">&nbsp;<%=rsltcurRec.req_rmk%></td>
	    <td width="70" align="center" class="gray">&nbsp;<%=rsltcurRec.as_stat%></td>
	    <td width="70" align="center" class="gray">&nbsp;<%=Util.convertS(rsltcurRec.regdt)%></td>
	    <td width="70" align="center" class="gray">&nbsp;<%=Util.convertS(rsltcurRec.acpndt)%></td>
	    <td width="70" align="center" class="gray">&nbsp;<%=Util.convertS(rsltcurRec.nddt)%></td>
  	</tr>
    <%}%>

	<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <% for (int i = 0 ; i < (moveListCount - ds.curasreqlist.size()) ; i++) {%>		
	<tr> 
		<td width="50"  align="center" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td width="70" align="center" class="gray">&nbsp;</td>
		<td width="70" align="center" class="gray">&nbsp;</td>
		<td width="70" align="center" class="gray">&nbsp;</td>
		<td width="70" align="center" class="gray">&nbsp;</td>
	</tr>
    <%}%>
	<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
	
	<tr  bgcolor="#dddddd" align="right" > 
		<td  colspan="6" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%=Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>
</table>

<!-- 페이지 이동 -->
<table id="as_list_nav_id" width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
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
    parent.document.all.as_list_nav_id.outerHTML = as_list_nav_id.outerHTML;
    parent.document.all.as_list_id.outerHTML = as_list_id.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();
    
    // 화면 초기화
    parent.bocomp_append();
    
<%if(ds.curasreqlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%> 
</script>
