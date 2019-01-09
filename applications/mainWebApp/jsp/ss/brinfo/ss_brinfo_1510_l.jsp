<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1510_l.jsp
* 기능 : 지국Info-전세지원자금현황-목록
* 작성일자 : 2004-05-19
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_LEASAMT_LISTDataSet ds = (SS_L_LEASAMT_LISTDataSet)request.getAttribute("ds");
	int asetListCount = 10;	// 한 화면당 보여줄 항목 수
%>

<table width="830" border="0" cellspacing="0" align="center" class="gray" bgcolor="#FFFFFF" cellpadding="1" id="leasamt_list">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray" width="60"> 지국명 </td>
		<td rowspan="2" class="gray" width="60">지국장 </td>
		<td rowspan="2" class="gray" width="70"> 지원금액 </td>
		<td rowspan="2" class="gray" width="70"> 전체보증금 </td>
		<td class="gray" colspan="2"> 채권확보 </td>
		<td rowspan="2" class="gray" width="60">현담당</td>
		<td class="gray" width="80" > 지국사무실 </td>
		<td class="gray" width="80" > 채권확보물권 </td>
		<td class="gray" colspan="2"> 전세 기간 </td>
		<td rowspan="2" class="gray"> 결재서류번호 </td>
	</tr>
	<tr align="center">
		<td bgcolor="#dddddd" class="gray" width="70"> 금액 </td>
		<td bgcolor="#dddddd" class="gray" width="50">종류 </td>
		<td bgcolor="#dddddd" class="gray" width="80"> 소유주 </td>
		<td bgcolor="#dddddd" class="gray" width="80"> 소유주 </td>
		<td bgcolor="#dddddd" class="gray" width="70"> 계약일 </td>
		<td bgcolor="#dddddd" class="gray" width="70"> 만료일 </td>
	</tr>
	<!-- 전세지원자금현황 목록 시작 -------------------------------------------------------------------------->
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_LEASAMT_LISTCURCOMMLISTRecord curcommlistRec = (SS_L_LEASAMT_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 상세 링크 -->
	<tr onclick="detail_view('<%=curcommlistRec.getDeptcd() %>','<%=curcommlistRec.getAreacd() %>','<%=curcommlistRec.getBocd() %>','<%=curcommlistRec.getSeq() %>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" align="left"><%=curcommlistRec.getBonm() %>&nbsp;</td>
		<td class="gray" align="left"><%=curcommlistRec.getBo_presinm() %>&nbsp;</td>
		<td class="gray" align="right" width="70"><%=Util.formatNumber(curcommlistRec.getHdqtsplyamt()) %>&nbsp;</td>
		<td class="gray" align="right"><%=Util.formatNumber(curcommlistRec.getWholgurtamt()) %>&nbsp;</td>
		<td class="gray" align="right" width="70" ><%=Util.formatNumber(curcommlistRec.getBondprsvamt()) %>&nbsp;</td>
		<td class="gray" align="center" ><%=curcommlistRec.getBondprsvkind() %>&nbsp;</td>
		<td class="gray" align="left">&nbsp;<%=curcommlistRec.getNowchrg() %>&nbsp;</td>
		<td class="gray" align="left">&nbsp;<%=curcommlistRec.getBooffi_roomownr() %>&nbsp;</td>
		<td class="gray" align="left">&nbsp;<%=curcommlistRec.getBondprsvobjvolownr() %>&nbsp;</td>
		<td class="gray" align="center"><%=Util.convertS(curcommlistRec.getLeascntrdt()) %>&nbsp;</td>
		<td class="gray" align="center"><%=Util.convertS(curcommlistRec.getLeasexprdt()) %>&nbsp;</td>
		<td class="gray" align="center"><%=curcommlistRec.getDeciddocuno() %>&nbsp;</td>
	</tr>
    <%}%>

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(asetListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" align="right" width="70">&nbsp</td>
		<td class="gray" align="right">&nbsp</td>
		<td class="gray" align="right" width="70" >&nbsp</td>
		<td class="gray" align="right" >&nbsp</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" >&nbsp;</td>
		<td class="gray" >&nbsp;</td>
		<td class="gray" align="center">&nbsp</td>
		<td class="gray" align="center">&nbsp</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>

	<tr bgcolor="#dddddd" align="right">
		<td colspan="12" height="23" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> 총지원금액 <%= Util.comma(ds.getTotalamt())%> 원</b>&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건</b>
		</td>
	</tr>
</table>



<!-- 페이지 이동 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
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
                <jsp:param name = "pagesize" 	value="<%= asetListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->
<!-- 전세지원자금현황 목록 끝 -------------------------------------------------------------------------->

<!-- 상세 초기화를 위한 테이블 시작 -->
<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="detail_list">
<form name="aset_detail_form" method="post" action="">
	<input name="deptcd" type="hidden" value ="" maxlength="5">		<!--부서(팀)코드-->
	<input name="areacd" type="hidden" value ="" maxlength="5">     <!--지역코드-->
	<input name="bocd" type="hidden" value ="" maxlength="5">       <!--지국지사코드-->
	<input name="seq" type="hidden" value ="" maxlength="5">        <!--순번-->

	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">팀&nbsp;</td>
		<td class="gray" width="250" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >지역</td>
		<td class="gray" width="100" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >지국명</td>
		<td class="gray" width="120" >&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">지국장</td>
		<td class="gray" width="250" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >현담당</td>
		<td class="gray" colspan="3" >&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">채권확보서류</td>
		<td class="gray" width="250">
			등기필증
			<input type="checkbox" name="bondregiconf" value="Y">
			등기부등본
			<input type="checkbox" name="bndregi" value="Y">
			보증서
			<input type="checkbox" name="bondwarrp" value="Y">
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">전세서류</td>
		<td class="gray" colspan="3">
			계약서
			<input type="checkbox" name="leascntrp" value="Y">
			등기부등본
			<input type="checkbox" name="leasregi" value="Y">
			각서
			<input type="checkbox" name="leasexch_note" value="Y">
			차용증서
			<input type="checkbox" name="leasloandeed" value="Y">
		</td>
	</tr>
	<tr>
	<td bgcolor="#dddddd" width="153" class="gray">국결재서류</td>
		<td class="gray" width="250">
			전임
			<input type="checkbox" name="prvoffideciddocuyn" value="Y">
			현임
			<input type="checkbox" name="curroffideciddocuyn" value="Y">
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">본결재서류</td>
		<td class="gray" colspan="3">
			전임
			<input type="checkbox" name="prvhdqtdeciddocuyn" value="Y">
			현임
			<input type="checkbox" name="currhdqtdeciddocuyn" value="Y">
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">지국사무실 부동산표시</td>
		<td class="gray" colspan="5">&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">채권확보물권 부동산표시 </td>
		<td class="gray" colspan="5">&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">비고</td>
		<td class="gray" colspan="5">
			<textarea name="remk" rows="3" cols="90" >&nbsp;</textarea>
		</td>
	</tr>
</form>
</table>
<!-- 상세 초기화를 위한 테이블 끝 -->

<!--IFRAME ID=leasamt_list END--------------------------------------------------------------------------->
<script>
    parent.document.all.leasamt_list.outerHTML = leasamt_list.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    parent.document.all.detail_list.outerHTML = detail_list.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>
