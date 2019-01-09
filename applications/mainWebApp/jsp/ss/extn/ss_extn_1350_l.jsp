<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1350_l.jsp
* 기능 : 확장현황-사원확장-송금관리-목록
* 작성일자 : 2003-12-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_EMPRMTTDataSet ds = (SS_L_RDR_EXTN_EMPRMTTDataSet)request.getAttribute("ds");
	int rmttListCount	= 10;		// 한 화면당 리스트 항목 수
%>
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="rmtt_list_id">
    <form name="rmtt_list_form" method="post" action="" >
        <input name="print" type="hidden" value ="">
        <input name="print" type="hidden" value ="">
		<tr bgcolor="#DDDDDD" height="23">
			<td width="100" class="gray" align="center">대회명</td>
			<td width="90"  class="gray" align="center">이름</td>
			<td width="100" class="gray" align="center">회사</td>
			<td width="90"  class="gray" align="center">부서</td>
			<td width="100" class="gray" align="center">예금주</td>
			<td width="100" class="gray" align="center">은행</td>
			<td width="150" class="gray" align="center">계좌번호</td>
			<td class="gray" align="center">금액</td>
		</tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EMPRMTTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPRMTTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
        <tr>
			<td width="100" class="gray" align="left"><%= curcommlistRec.campnm%>&nbsp;</td>
			<td width="90"  class="gray" align="left"><%= curcommlistRec.empnm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.empcmpynm%>&nbsp;</td>
			<td width="90"  class="gray" align="left"><%= curcommlistRec.empdeptnm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.deps_persnm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.banknm%>&nbsp;</td>
			<td width="150" class="gray" align="left"><%= curcommlistRec.acctno%>&nbsp;</td>
			<td class="gray" align="right"><%= Util.comma(curcommlistRec.alonamt)%>&nbsp;</td>
		</tr>
<%}%>

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(rmttListCount-ds.curcommlist.size()); i++){%>
	    <tr>
	        <td width="100" class="gray" align="center">&nbsp;</td>
	        <td width="90"  class="gray" align="center">&nbsp;</td>
	        <td width="100" class="gray" align="center">&nbsp;</td>
	        <td width="90"  class="gray" align="center">&nbsp;</td>
	        <td width="100" class="gray" align="center">&nbsp;</td>
	        <td width="100" class="gray" align="center">&nbsp;</td>
	        <td width="150" class="gray" align="right">&nbsp;</td>
	        <td class="gray" align="right">&nbsp;</td>
	    </tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>

		<tr bgcolor="#dddddd">
			<td colspan="8" class="gray" align="right" height="23">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총금액 <%= Util.comma(ds.getTotalalonamt())%> 원 </b>&nbsp;&nbsp;&nbsp;
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
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
                <jsp:param name = "pagesize" 	value="<%= rmttListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->
<script>
    parent.document.all.rmtt_list_id.outerHTML = rmtt_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
        
    // 이벤트 핸들러 호출
    parent.jsInit();    
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>

