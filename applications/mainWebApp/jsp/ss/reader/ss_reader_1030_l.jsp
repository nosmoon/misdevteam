<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1030_l.jsp
* 기능 : 독자현황-독자정보-독자이력 구독이력 목록
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
	SL_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_L_NWSPSUBSCNTRPTCRDataSet)request.getAttribute("ds");
    int subsHstyListCount = 5;	// 한 화면당 리스트 항목 수
%>
<table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="hsty_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td width="200" class="gray" height="23" align="center"> 구독기간 </td>
		<td width="100" class="gray" height="23" align="center"> 지국명 </td>
		<td width="150" class="gray" height="23" align="center"> 매체명 </td>
		<td width="100" class="gray" height="23" align="center"> 확장유형 </td>
	</tr>
	<!--구독이력 목록 시작-->
	<%
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++){
	    SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = (SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);%>
	<tr>
		<td width="200" class="gray" align="center"> <%=Util.convertS(nwspsubscntrcurRec.rdr_extndt)%> - <%=Util.convertS(nwspsubscntrcurRec.suspdt)%>&nbsp;</td>
		<td Width="100" class="gray" align="center"> <%=nwspsubscntrcurRec.bonm%> &nbsp;</td>
		<td width="150" class="gray" align="center"> <%=nwspsubscntrcurRec.medinm%> &nbsp;</td>
		<td width="100" class="gray" align="center"> <%=nwspsubscntrcurRec.rdr_extntypenm%> &nbsp;</td>
	</tr>
	<%}%>
	<!--구독이력 목록 끝-->

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(subsHstyListCount-ds.nwspsubscntrcur.size()); i++){%>
	<tr>
	    <td width="200" align="center" class="gray" > &nbsp; </td>
	    <td Width="100" class="gray" > &nbsp; </td>
	    <td width="150" class="gray"  > &nbsp; </td>
	    <td width="100" class="gray" > &nbsp; </td>
	</tr>
	<%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
	<tr bgcolor="#E8E8E8" align="right">
	    <td  height="25" class="gray" colspan="4">
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
                <jsp:param name = "js_fn_nm" 	value="page_move_subs_hsty"/>
                <jsp:param name = "pagesize" 	value="<%= subsHstyListCount%>"/>
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
    
<%if(ds.nwspsubscntrcur.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>  	
</script>