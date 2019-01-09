<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1040_l.jsp
* 기능 : 독자현황-독자정보-독자이력 이사이력 목록
* 작성일자 : 2003-12-30
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SL_L_MOVM_RDRPTCRDataSet ds = (SL_L_MOVM_RDRPTCRDataSet)request.getAttribute("ds");
    int movmHstyListCount = 5;	// 한 화면당 리스트 항목 수
%>
<table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="hsty_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td width="200" class="gray" height="23"> 이사일자</td>
		<td width="175" class="gray" height="23"> 이사전 지국 </td>
		<td width="175" class="gray" height="23"> 이사후 지국 </td>
	</tr>

	<!--구독이력 목록 시작-->
	<%
	for(int i=0; i<ds.movm_rdrcur.size(); i++){
	    SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord movm_rdrcurRec = (SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord)ds.movm_rdrcur.get(i);%>
	<tr>
		<td width="200" class="gray" align="center"><%=Util.convertS(movm_rdrcurRec.movmdt)%></td>
		<td width="175" class="gray" align="center"> <%=movm_rdrcurRec.trsfbonm %> </td>
		<td width="175" class="gray" align="center"> <%=movm_rdrcurRec.acptbonm %> </td>
	</tr>
	<%}%>
	<!--구독이력 목록 끝-->

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
	<%for(int j=0; j<movmHstyListCount - ds.movm_rdrcur.size(); j++){%>
	<tr>
		<td width="200" align="center" class="gray">&nbsp;</td>
		<td width="175" class="gray"> &nbsp; </td>
		<td width="175" class="gray" > &nbsp; </td>
	</tr>
	<%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>

	<tr bgcolor="#E8E8E8" align="right">
	    <td  height="25" class="gray" colspan="3">
	        <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총건수 <b><%= ds.getTotalcnt()%> 건</b>
	    </td>
	</tr>
</table>

<!-- 페이지 이동 -->
<table width="100%" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_move_hsty">
  <tr>
    <td align="center" height="25" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <%
                String pageno = request.getParameter("pageno");
                String totalcnt = String.valueOf(ds.getTotalcnt());
            %>
                <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "pageno" 		value="<%=pageno%>"/>
                <jsp:param name = "totalcnt" 	value="<%=totalcnt%>"/>
                <jsp:param name = "js_fn_nm" 	value="page_move_movm_hsty"/>
                <jsp:param name = "pagesize" 	value="<%= movmHstyListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>
<!-- 페이지 이동 -->

<script language="javascript">
	parent.document.all.hsty_list_id.outerHTML = hsty_list_id.outerHTML;
  	parent.document.all.page_move_hsty.outerHTML = page_move_hsty.outerHTML;
  	
    // 이벤트 핸들러 호출
    parent.jsInit();
    
<%if(ds.movm_rdrcur.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>  	
</script>