<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1015_l.jsp
* 기능 : 독자현황-독자정보-독자이력 목록
* 작성일자 : 2003-12-27
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_HSTYDataSet ds = (SS_L_RDR_HSTYDataSet)request.getAttribute("ds");
    int rdrhstyListCount = 5;	// 한 화면당 리스트 항목 수
	int hstyListCount = 5;		// 한 화면당 리스트 항목 수(이력 목록)
    int subsHstyListCount = 5;	// 한 화면당 리스트 항목 수
%>
<table width="550"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="rdrhsty_list_id">
<form name="rdrhsty_list_form" method="post" action="" >
    <input name="bocd" type="hidden" value ="">									<!--지국지사코드-->
    <input name="rdr_no" type="hidden" value ="">								<!--독자번호-->
    <input name="medicd" type="hidden" value ="">								<!--매체코드-->

	<tr bgcolor="#DDDDDD">
        <td class="gray" align="center" width="50" height="24"> 지국</td>
        <td class="gray" align="center" width="70" height="24"> 독자번호</td>
        <td class="gray" align="center" width="60" height="24"> 독자명</td>
        <td class="gray" align="center" width="100" height="24"> 전화번호</td>
        <td class="gray" align="center" width="240" height="24"> 주소</td>
        <td class="gray" align="center" width="30" height="24" width="30" > 구독</td>
	</tr>

<%-- 독자이력목록 출력 시작 --%>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_HSTYCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_HSTYCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 독자이력상세 링크 -->
    <tr bgcolor="" onclick="rdrhsty_detail_view('<%= curcommlistRec.bocd%>','<%= curcommlistRec.rdr_no%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
	    <td class="gray" align="center" height="21"><%= curcommlistRec.bonm%>&nbsp;</td>
	    <td class="gray" align="center" height="21"><%= curcommlistRec.rdr_no%>&nbsp;</td>
	    <td class="gray" align="center" height="21"><%= curcommlistRec.rdrnm%>&nbsp;</td>
	    <td class="gray" align="center" height="21">
	    	<%= Util.getChainStr(curcommlistRec.rdrtel_no1, curcommlistRec.rdrtel_no2, curcommlistRec.rdrtel_no3, "-")%>&nbsp;
	    </td>
	    <td class="gray" align="center" height="21"><%= curcommlistRec.dlvaddr%>&nbsp;<%= curcommlistRec.dlvdtlsaddr%></td>
	    <td class="gray" align="center" height="21" width="30"><%= curcommlistRec.subsyn%>&nbsp;</td>
	</tr>
<%}%>

<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
<%for(int i=0; i<(rdrhstyListCount-ds.curcommlist.size()); i++){%>
	<tr>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21" width="30">&nbsp;</td>
	</tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>

<%-- 독자이력목록 출력 끝 --%>

    <tr bgcolor="#E8E8E8" align="right">
        <td  height="25" class="gray" colspan="6">
            <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총건수 <b><%= ds.getTotalcnt()%> 건</b>
        </td>
    </tr>

</form>
</table>

<!-- 페이지 이동 -->
<table width="550" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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
                <jsp:param name = "pagesize" 	value="<%= rdrhstyListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->



<!--독자상세 초기화를 위한 table 시작-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="gray" bgcolor="#FFFFFF"  id="rdr_detail_id">
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray"> 독자번호</td>
        <td class="gray" width="70">&nbsp;</td>
        <td class="gray" width="70" bgcolor="#DDDDDD">독자명</td>
        <td class="gray" width="70">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> 전화번호</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td class="gray" width="70" bgcolor="#DDDDDD">휴대폰번호</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> 이메일</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> 마일리지</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> 우편번호</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> 주소</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> 주거형태</td>
        <td class="gray" width="70">&nbsp;</td>
        <td class="gray" width="70" bgcolor="#DDDDDD">주거구분</td>
        <td class="gray" width="70">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> 평형</td>
        <td class="gray" width="70">&nbsp;</td>
        <td class="gray" width="70" bgcolor="#DDDDDD">투입장소</td>
        <td class="gray" width="70">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70">구독일자 </td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
</table>
<!--독자상세 초기화를 위한 table 끝-->


<!--구독상세 초기화를 위한 table 시작-->
<table width="280" border="0" cellpadding="0" cellspacing="0"  align="top" class="gray" id="subs_detail_id">
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">매체명</td>
        <td bgcolor="#FFFFFF" class="gray" colspan="3">
            <select name="select" class="sel_all">
            	<option>독자검색후 선택하세요.</option>
            </select>
        </td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">단가</td>
        <td bgcolor="#FFFFFF" class="gray" align="right" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">유료부수</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right">부</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">준유가부수</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right">부</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">무료부수</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"> 부</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">무료구분</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">확장일자</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp; </td>
        <td width="70" bgcolor="#DDDDDD" class="gray">확장유형</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">확장자</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp; </td>
        <td width="70" bgcolor="#DDDDDD" class="gray">확장비용</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">구독일자</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">수금방법</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">유가월</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">분기</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">이전일자</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">판촉물</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
</table>
<!--구독상세 초기화를 위한 table 끝-->

<!--이력조회 검색 초기화를 위한 table 시작-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC" id="hsty_search_id">
<form name="hsty_search_form" method="post" action="" >
    <input name="pageno" type="hidden" value ="1">			        		<!-- 현재 페이지 번호 -->
    <input name="pagesize" type="hidden" value ="<%= hstyListCount%>">		<!-- 한 화면당 리스트 항목 수 -->
    <input name="bocd" type="hidden" value ="">								<!--지국지사코드-->
    <input name="rdr_no" type="hidden" value ="">							<!--독자번호-->
	<!-- 수금 이력 hidden 파라미터 시작 -->
    <input name="basiyymm" type="hidden" value ="">						<!-- 현재 기준년월 -->
    <input name="prevyymm" type="hidden" value ="">							<!-- 이전 년월 -->
    <input name="nextyymm" type="hidden" value ="">							<!-- 이후 년월 -->
	<!-- 수금 이력 hidden 파라미터 끝 -->
	<tr>
		<td height="2"></td>
	</tr>
	<tr>
		<td>
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간
            <input name="frdt" type="text" size="10" class="text_box" dataType="date">
			-
			<input name="todt" type="text" size="10" class="text_box" dataType="date">
            &nbsp;&nbsp;
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">매체
            <select name="medicd" class="sel_all" id="hsty_search_medicd_id"><!--매체코드-->
                <option>독자검색후 선택하세요.</option>
            </select>
		</td>
	</tr>
	<tr>
		<td height="2"></td>
	</tr>
	<tr>
		<td>
            <img src="/html/comm_img/bu_his01.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:subs_hsty_search()"><!--구독이력 조회-->
            <img src="/html/comm_img/bu_his02.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:clam_hsty_search()"><!--수금이력 조회, 매개변수를 전달하지 않는다.-->
            <img src="/html/comm_img/bu_his03.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:movm_hsty_search()"><!--이사이력 조회-->
            <img src="/html/comm_img/bu_his04.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:stop_hsty_search()"><!--휴독이력 조회-->
        </td>
	</tr>
	<tr>
		<td height="2"></td>
	</tr>
</form>
</table>
<!--이력조회 검색 초기화를 위한 table 끝-->

<!--이력조회 목록 초기화를 위한 table 시작-->
<table width="550"  cellpadding="0" cellspacing="0" bgcolor="#ffffff" class="gray" id="hsty_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td width="200" class="gray" height="23"> 구독기간 </td>
		<td width="100" class="gray" height="23"> 지국명 </td>
		<td width="150" class="gray" height="23"> 매체명 </td>
		<td width="100" class="gray" height="23"> 확장유형 </td>
	</tr>
    
	<%-- 초기화면 목록 반복 시작 --%>
    <%for(int i=0; i<subsHstyListCount; i++){%>
	<tr>
	    <td width="200" align="center" class="gray"> &nbsp; </td>
	    <td Width="100" class="gray"> &nbsp; </td>
	    <td width="150" class="gray"> &nbsp; </td>
	    <td width="100" class="gray"> &nbsp; </td>
	</tr>
	<%}%>
	<%-- 초기화면 목록 반복 끝 --%>
</table>
<!--이력조회 목록 초기화를 위한 table 끝-->

<!-- 이력조회 페이지 이동 -->
<table width="550" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_hsty">
    <tr>
        <td align="center" height="2">
        <!--여백-->
        </td>
    </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8">
        <!--JSP PAGE START---------------------------------------------------------------------------------->
        <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "pageno" 	value="0"/>
                <jsp:param name = "totalcnt" 	value="0"/>
                <jsp:param name = "js_fn_nm" 	value="page_move"/>
                <jsp:param name = "pagesize" 	value="<%= hstyListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 이력조회 페이지 이동 -->

<script>
    parent.document.all.rdrhsty_list_id.outerHTML = rdrhsty_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    //독자상세,구독상세,이력조회 초기화
    parent.document.all.rdr_detail_id.outerHTML = rdr_detail_id.outerHTML;
    parent.document.all.subs_detail_id.outerHTML = subs_detail_id.outerHTML;
    parent.document.all.hsty_search_id.outerHTML = hsty_search_id.outerHTML;
    parent.document.all.hsty_list_id.outerHTML = hsty_list_id.outerHTML;
    parent.document.all.page_move_hsty.outerHTML = page_move_hsty.outerHTML;
    
    // 이벤트 핸들러 호출
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>     
    
</script>

