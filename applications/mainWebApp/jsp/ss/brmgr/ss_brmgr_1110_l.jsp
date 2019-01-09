<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1110_l.jsp
* 기능 : 지국경영-마일리지현황-조회
* 작성일자 : 2004-03-17
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_MIGLLMMTCLOSDataSet ds = (SS_L_MIGLLMMTCLOSDataSet)request.getAttribute("ds");
    int listCount = 10;			// 한 화면당 리스트 항목 수
    int noit_tot = 0; 			//지급건수합계
    int paypont_tot = 0; 		//지급포인트합계
    int hdqtallmamt_tot = 0; 	//본사분담금합계
    int boallmamt_tot = 0; 		//지국분담금합계
%>

<table width="830" border="0" cellspacing="0"  cellpadding="1" class="gray" bgcolor="#FFFFFF" id="migllmmtclos_list_id">
<form name="milgpay_list_form" method="post" action="">
	<input type="hidden" name="bocd" value="">
	<input type="hidden" name="frdt" value="">
	<input type="hidden" name="todt" value="">
	<input type="hidden" name="pageno" value ="1">					<!-- 현재 페이지 번호 -->
	<input type="hidden" name="pagesize" value ="<%= listCount%>">	<!-- 한 화면당 리스트 항목 수 -->
	<input type="hidden" name="js_fn_nm" value ="page_move2">

	<tr align="center" bgcolor="#dddddd" height="23">
		<td width="120" class="gray"> 팀&nbsp; </td>
		<td width="120" class="gray"> 지역 </td>
		<td width="120" class="gray"> 지국 </td>
		<td class="gray"> 지급건수 </td>
		<td width="120" class="gray"> 지급포인트 </td>
		<td width="120" class="gray"> 본사분담금 </td>
		<td width="120" class="gray"> 지국분담금 </td>
	</tr>
	<%-- 리스트 가져 오는 부분--%>
	<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGLLMMTCLOSCURCOMMLISTRecord curcommlistRec = (SS_L_MIGLLMMTCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);

		noit_tot 			= noit_tot + curcommlistRec.noit;
		paypont_tot 		= paypont_tot + curcommlistRec.paypont;
		hdqtallmamt_tot 	= hdqtallmamt_tot + curcommlistRec.hdqtallmamt;
		boallmamt_tot 		= boallmamt_tot + curcommlistRec.boallmamt;
	%>
	<tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>','<%= curcommlistRec.frdt%>','<%= curcommlistRec.todt%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" width="120">&nbsp;<%= curcommlistRec.boksnm%></td>
		<td class="gray" width="120">&nbsp;<%= curcommlistRec.areanm%></td>
		<td class="gray" width="120">&nbsp;<%= curcommlistRec.bonm%></td>
		<td class="gray" align="right"><%= Util.comma(curcommlistRec.noit)%>&nbsp;</td>
		<td class="gray" width="120" align="right"><%= Util.comma(curcommlistRec.paypont)%>&nbsp;</td>
		<td class="gray" width="120" align="right"><%= Util.comma(curcommlistRec.hdqtallmamt)%>&nbsp;</td>
		<td class="gray" width="120" align="right"><%= Util.comma(curcommlistRec.boallmamt)%>&nbsp;</td>
	</tr>
	<%}%>
	<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
	<%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" width="120">&nbsp;</td>
		<td class="gray" width="120">&nbsp;</td>
		<td class="gray" width="120">&nbsp;</td>
		<td class="gray" align="right">&nbsp;</td>
		<td class="gray" width="120" align="right">&nbsp;</td>
		<td class="gray" width="120" align="right">&nbsp;</td>
		<td class="gray" width="120" align="right">&nbsp;</td>
	</tr>
	<%}%>
	<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
	<tr bgcolor="#dddddd">
		<td colspan="3" class="gray" align="center" height="23"> 계 </td>
		<td class="gray" align="right"><%=Util.comma(noit_tot)%>&nbsp;</td>
		<td class="gray" align="right"><%=Util.comma(paypont_tot)%>&nbsp;</td>
		<td class="gray" align="right"><%=Util.comma(hdqtallmamt_tot)%>&nbsp;</td>
		<td class="gray" align="right"><%=Util.comma(boallmamt_tot)%>&nbsp;</td>
	</tr>
	<tr align="right" height="23">
		<td colspan="7" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 <%= Util.comma(ds.getTotalcnt())%> 건</b>
		</td>
	</tr>
</form>
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
			<jsp:param name = "pagesize" 	value="<%=listCount%>"/>
			<jsp:param name = "page_set_gubun" 	value="0"/>
			</jsp:include>
			<!--JSP PAGE END------------------------------------------------------------------------------------>
		</td>
	</tr>
</table>
<!-- 페이지 이동 -->

<!-- 상세 초기화를 위한 테이블-->
<!-- 마일리지현황 상세 시작 -->
<table width="830" border="0" cellspacing="0"  cellpadding="1" class="gray" bgcolor="#FFFFFF" id="milgpay_detail_id">
	<tr align="center" bgcolor="#dddddd" height="23">
		<td width="70" class="gray"> 지급일자 </td>
		<td class="gray"> 독자명 </td>
		<td width="70" class="gray">매체</td>
		<td width="50" class="gray">포인트</td>
		<td width="100" class="gray">지급구분</td>
		<td width="100" class="gray">지급기준</td>
		<td width="50" class="gray">환율</td>
		<td width="65" class="gray">정산금</td>
		<td width="65" class="gray">본사분담</td>
		<td width="65" class="gray">지국분담</td>
	</tr>
	<%-- 초기화면 목록 반복 시작 --%>
	<%for(int j=0; j<listCount; j++){%>
	<tr>
		<td class="gray" width="70" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" width="70">&nbsp;</td>
		<td class="gray" width="50" align="right">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="100" align="center">&nbsp;</td>
		<td class="gray" width="50" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
	</tr>
	<%}%>
	<%-- 초기화면 목록 반복 끝 --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="10" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> 총건수 건 </b>
		</td>
	</tr>
</table>

<!-- 페이지 이동 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move2">
	<tr>
		<td align="center" height="2">
		<!--여백-->
		</td>
	</tr>
	<tr>
		<td align="center" height="24" bgcolor="#E8E8E8">
		<!--JSP PAGE START---------------------------------------------------------------------------------->
		<jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
		<jsp:param name = "pageno" 			value="0"/>
		<jsp:param name = "totalcnt" 		value="0"/>
		<jsp:param name = "js_fn_nm" 		value="page_move2"/>
		<jsp:param name = "pagesize" 		value="<%= listCount%>"/>
		<jsp:param name = "page_set_gubun" 	value="0"/>
		</jsp:include>
		<!--JSP PAGE END------------------------------------------------------------------------------------>
		</td>
	</tr>
</table>
<!-- 페이지 이동 -->

<script>
    parent.document.all.migllmmtclos_list_id.outerHTML = migllmmtclos_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

	// 상세 초기화
    parent.document.all.milgpay_detail_id.outerHTML = milgpay_detail_id.outerHTML;
    parent.document.all.page_move2.outerHTML = page_move2.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>
