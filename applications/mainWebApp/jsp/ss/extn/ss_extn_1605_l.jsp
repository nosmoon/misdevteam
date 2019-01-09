<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1605_l.jsp
* 기능 : 확장현황-사이버확장-요원관리-목록
* 작성일자 : 2004-03-29
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_CYEXTNDataSet ds = (SS_L_PROMSTAF_CYEXTNDataSet)request.getAttribute("ds");
    int promstafListCount = 10;	// 한 화면당 리스트 항목 수
%>

<!-- 목록 시작 -------------------------------------------------------------------------->
<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="promstaf_list_id">
<form name="promstaf_list_form" method="post" action="" >
	<input name="stafclsfcd" type="hidden" value="">
	<input name="stafno" type="hidden" value="">

	<tr align="center" height="23">
		<td width="150" bgcolor="#dddddd" class="gray">요원명</td>
		<td width="150" bgcolor="#dddddd" class="gray">권유자명</td>
		<td width="150" bgcolor="#dddddd" class="gray">등록일자</td>
		<td width="150" bgcolor="#dddddd" class="gray">휴대폰번호</td>
		<td bgcolor="#dddddd" class="gray">이메일</td>
	</tr>

	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 상세 링크 -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.stafclsfcd%>','<%= curcommlistRec.stafno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td width="150" class="gray" align="left">&nbsp;<%= curcommlistRec.stafnm%></td>
		<td width="150" class="gray" align="left">&nbsp;<%= curcommlistRec.cnvsstafnm%></td>
		<td width="150" class="gray" align="center">&nbsp;<%= Util.convertS(curcommlistRec.in_cmpydt)%></td>
		<td width="150" class="gray" align="left">&nbsp;<%= Util.getChainStr(curcommlistRec.ptph_no1,curcommlistRec.ptph_no2,curcommlistRec.ptph_no3,"-")%></td>
		<td class="gray" align="left">&nbsp;<%= curcommlistRec.email%></td>
	</tr>
    <%}%>

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(promstafListCount-ds.curcommlist.size()); i++){%>
    <tr>
		<td width="150" class="gray">&nbsp;</td>
		<td width="150" class="gray">&nbsp;</td>
		<td width="150" class="gray">&nbsp;</td>
		<td width="150" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>

	<tr bgcolor="#dddddd">
		<td  height="23" class="gray" colspan="11" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt()) %> 건 </b>
		</td>
	</tr>
</form>
</table>
<!-- 목록 끝 -------------------------------------------------------------------------->

<!-- 페이지 이동 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_id">
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
                <jsp:param name = "pagesize" 	value="<%= promstafListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->

<!--사이버요원 상세 시작-->
<table width="830" border="0"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="promstaf_detail_id">
	<tr>
		<td rowspan="4" width="80" bgcolor="#EBE9DC" class="gray">요원정보</td>
		<td width="100" bgcolor="#dddddd" class="gray">성명</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">등록일자</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">주민등록번호</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <tr>
		<td width="100" bgcolor="#dddddd" class="gray">전화번호</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">휴대폰번호</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">이메일<font color="red">&nbsp;</font></td>
		<td class="gray">&nbsp;</td>
    </tr>
    <tr>
		<td width="100" bgcolor="#dddddd" class="gray">주소</td>
		<td colspan="5"  class="gray">&nbsp;</td>
    </tr>
    <tr >
		<td width="100" bgcolor="#dddddd" class="gray">은행명</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">예금주</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">계좌번호</td>
		<td class="gray">&nbsp;</td>
    </tr>
	<tr>
		<td rowspan="2" width="80" bgcolor="#EBE9DC" class="gray">권유자정보</td>
		<td width="100" bgcolor="#dddddd" class="gray">성명</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">등록일자</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">주민등록번호</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <tr>
		<td width="100" bgcolor="#dddddd" class="gray">전화번호</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">휴대폰번호</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">이메일<font color="red">&nbsp;</font></td>
		<td class="gray">&nbsp;</td>
    </tr>
</table>
<!--사이버요원 상세 끝-->

<script>
    parent.document.all.promstaf_list_id.outerHTML = promstaf_list_id.outerHTML;
    parent.document.all.page_move_id.outerHTML = page_move_id.outerHTML;

    // 상세폼 초기화
    parent.document.all.promstaf_detail_id.outerHTML = promstaf_detail_id.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>
