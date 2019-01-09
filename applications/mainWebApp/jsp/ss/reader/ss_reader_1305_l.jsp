<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1305_l.jsp
* 기능 : 독자현황-VacationStop-마감-목록
* 작성일자 : 2004-02-25
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_VSCLOSDataSet ds = (SS_L_VSCLOSDataSet)request.getAttribute("ds");
	int vsclosListCount = 10;
%>
<table width="490"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="vsclos_list_id">
<form name="vsclos_list_form" method="post" action="">
    <input name="basidt" type="hidden" value ="">
    <tr height="25">
        <td class="gray"  align="center" bgcolor="#DDDDDD"> 기준일자</td>
        <td class="gray"  align="center" width="90" bgcolor="#DDDDDD">시작일자</td>
        <td class="gray"  align="center" width="90" bgcolor="#DDDDDD">종료일자</td>
        <td class="gray"  align="center" width="90" bgcolor="#DDDDDD">등록종료일자</td>
    </tr>
<%-- VacationStop 마감 목록 출력--%>
<%  for(int i=0; i<ds.curcommlist.size(); i++){
        SS_L_VSCLOSCURCOMMLISTRecord curcommlistRec = (SS_L_VSCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- VacationStop 마감 상세 링크 -->
    <tr height="25" bgcolor="" onclick="vsclos_detail_view('<%= curcommlistRec.basidt%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td class="gray" align="center"><%= Util.convertS(curcommlistRec.basidt)%>&nbsp;</td>
        <td class="gray" align="center" width="90"><%= Util.convertS(curcommlistRec.frdt) %>&nbsp;</td>
        <td class="gray" align="center" width="90"><%= Util.convertS(curcommlistRec.todt) %>&nbsp;</td>
        <td class="gray" align="center" width="90"><%= Util.convertS(curcommlistRec.closdt) %>&nbsp;</td>
    </tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
<%for(int i=0; i<(vsclosListCount-ds.curcommlist.size()); i++){%>
    <tr height="25">
        <td class="gray" align="center">&nbsp;</td>
        <td class="gray" align="center" width="90">&nbsp;</td>
        <td class="gray" align="center" width="90">&nbsp;</td>
        <td class="gray" align="center" width="90">&nbsp;</td>
    </tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
    <tr bgcolor="#DDDDDD" align="right">
        <td height="25" class="gray" colspan="4">
        	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.totalcnt) %> 건 </b>
        </td>
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
                <jsp:param name = "pagesize" 	value="<%=vsclosListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->

<script>
    parent.document.all.vsclos_list_id.outerHTML = vsclos_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // 상세 초기화
    parent.vsclos_add();
    
    // 화면 초기화
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>     
</script>
