<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1545_l.jsp
* 기능 : 확장현황-확장용역비용-(확장담당)-목록
* 작성일자 : 2003-12-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SERVCLOSDataSet ds = (SS_L_RDR_EXTN_SERVCLOSDataSet)request.getAttribute("ds");
	int servListCount = 20;
    int mediListCount = 13;
%>
<table width="400"  cellpadding="0" cellspacing="0" class="gray" bgcolor="#ffffff" id="serv_list_id">
<form name="serv_list_form" method="post" action="">
    <input name="basidt" type="hidden" value ="">
    <tr>
        <td height="25" class="gray"  align="center" bgcolor="#DDDDDD"> 기준일자(년월)</td>
        <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">시작일자</td>
        <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">종료일자</td>
        <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">마감일자</td>
    </tr>
<%-- 확장용역비용마감 목록 출력--%>
<%  for(int i=0; i<ds.curcommlist.size(); i++){
        SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 확장용역비용마감 상세 링크 -->
    <tr bgcolor="" onclick="serv_detail_view('<%= curcommlistRec.basidt%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td  height="25" class="gray" align="center"><%= Util.convertMonthS(curcommlistRec.basidt)%>&nbsp;</td>
        <td  class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.frdt) %>&nbsp;</td>
        <td  class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.todt) %>&nbsp;</td>
        <td class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.closdt) %>&nbsp;</td>
    </tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
<%for(int i=0; i<(servListCount-ds.curcommlist.size()); i++){%>
    <tr>
        <td  height="25" class="gray" align="center">&nbsp;</td>
        <td  class="gray" align="center" height="25" width="90">&nbsp;</td>
        <td  class="gray" align="center" height="25" width="90">&nbsp;</td>
        <td class="gray" align="center" height="25" width="90">&nbsp;</td>
    </tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
    <tr bgcolor="#E8E8E8" align="right">
        <td  height="25" class="gray" colspan="4"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총건수
        <b><%= ds.totalcnt %> 건</b></td>
    </tr>
</form>
</table>

<!-- 페이지 이동 -->
<table width="400" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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


<!-- 상세 초기화를 위한 table 시작-->
<table id="serv_detail_id" width="430" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
<form name="serv_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="">          	<!-- 마감,마감취소 구분필드 -->
    <input type="hidden" name="splychrgclosyn" value="">    <!-- 확장용역비용마감 지원담당 마감여부 -->
    <tr>
        <td bgcolor="#dddddd"  class="gray" height="25">기준일자</td>
        <td colspan="4" class="gray" height="25">
            <input name="basidt" type="text" size="20" class="text_box" value="" caption="기준일자"  dataType="month" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">시작일자</td>
        <td colspan="4" class="gray" height="25">
            <input name="frdt" type="text" size="10" class="text_box" value=""  caption="시작일자" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">종료일자</td>
        <td colspan="4" class="gray" height="25">
            <input name="todt" type="text" size="10" class="text_box" value="" caption="종료일자" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">마감일자</td>
        <td colspan="4" class="gray" height="25">
            <input name="closdt" type="text" size="10" class="text_box" value="" caption="마감일자" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td  bgcolor="#dddddd" class="gray" height="25">조선IS 마감여부</td>
        <td colspan="4" class="gray" height="25"> N </td>
    </tr>
    <tr>
        <td  bgcolor="#dddddd" class="gray" height="25">지원부 마감여부</td>
        <td colspan="4" class="gray" height="25"> N </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">청구일자</td>
        <td colspan="4" class="gray" height="25">
            <input name="clamdt" type="text" size="10" class="text_box" value="" caption="청구일자" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">비고</td>
        <td colspan="4" class="gray" height="25">
            <input name="remk" type="text" size="35" class="text_box" value="">
        </td>
    </tr>
    <tr align="center" bgcolor="#EBE9DC">
        <td width="100" class="gray" height="25" align="center">매체</td>
        <td width="100" class="gray" height="25" align="center">부서</td>
        <td width="75" class="gray" height="25" align="center">아파트</td>
        <td width="75" class="gray" height="25" align="center">주택</td>
        <td class="gray" height="25" align="center">상가</td>
    </tr>
<%-- 매체 목록 반복 시작 --%>
<%for(int i=0; i<mediListCount; i++){%>
    <tr>
        <td class="gray" height="25" align="center">&nbsp;</td>
        <td class="gray" height="25" align="center">&nbsp;</td>
        <td class="gray" height="25" align="center">&nbsp;</td>
        <td class="gray" height="25" align="center">&nbsp;</td>
        <td class="gray" height="25" align="center">&nbsp;</td>
    </tr>
<%}%>
<%-- 매체 목록 반복 끝 --%>
</form>
</table>
<!-- 상세 초기화를 위한 table 끝-->


<script>
    parent.document.all.serv_list_id.outerHTML = serv_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // 상세 초기화
    parent.document.all.serv_detail_id.outerHTML = serv_detail_id.outerHTML;
    
    // 화면 초기화
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>     
</script>
