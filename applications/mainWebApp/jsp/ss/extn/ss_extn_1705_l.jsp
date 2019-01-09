<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1705_l.jsp
* 기능 : 확장현황-사이버확장-기준-목록
* 작성일자 : 2004-04-06
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_CYBCAMPDataSet ds = (SS_L_RDR_EXTN_CYBCAMPDataSet)request.getAttribute("ds");
	int campListCount = 12;
%>
<table width="490"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="camp_list_id">
<form name="camp_list_form" method="post" action="">
    <input name="rdr_extncampno" type="hidden" value ="">
    <tr>
        <td height="25" class="gray"  align="center" bgcolor="#DDDDDD"> 기준명</td>
        <td height="25" class="gray"  align="center" width="135" bgcolor="#DDDDDD">시작일자</td>
        <td height="25" class="gray"  align="center" width="135" bgcolor="#DDDDDD">종료일자</td>
<%--            
        <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD"> 마감일자</td>
--%>            
    </tr>
<%-- 사이버확장기준 목록 출력--%>
<%  for(int i=0; i<ds.curcommlist.size(); i++){
        SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 사이버확장기준 상세 링크 -->
    <tr bgcolor="" onclick="camp_detail_view('<%= curcommlistRec.rdr_extncampno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td height="25" class="gray" align="center"><%= curcommlistRec.campnm%>&nbsp;</td>
        <td class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.frdt) %>&nbsp;</td>
        <td class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.todt) %>&nbsp;</td>
<%--        
        <td class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.closdt) %>&nbsp;</td>
--%>        
    </tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
<%for(int i=0; i<(campListCount-ds.curcommlist.size()); i++){%>
    <tr>
        <td height="25" class="gray" align="center">&nbsp;</td>
        <td class="gray" align="center" height="25" width="135">&nbsp;</td>
        <td class="gray" align="center" height="25" width="135">&nbsp;</td>
<%--        
        <td class="gray" align="center" height="25" width="90">&nbsp;</td>
--%>        
    </tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
    <tr bgcolor="#DDDDDD" align="right">
        <td  height="25" class="gray" colspan="3"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.totalcnt) %> 건 </b></td>
    </tr>
</form>
</table>

<!-- 페이지 이동 -->
<table width="490" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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
                <jsp:param name = "pagesize" 	value="10"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->

<script>
    parent.document.all.camp_list_id.outerHTML = camp_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // 이벤트 핸들러 호출
    parent.jsInit();
    
    // 화면 초기화
    parent.camp_add();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>     
</script>
