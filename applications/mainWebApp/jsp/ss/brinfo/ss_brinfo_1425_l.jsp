<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1425_l.jsp
* 기능 : 지국Info-지국비품현황-상세-조회
* 작성일자 : 2004-02-01
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
	SS_L_ASET_DTLDataSet ds = (SS_L_ASET_DTLDataSet)request.getAttribute("ds");
    int moveListCount = 15;	// 한 화면당 리스트 항목 수
%>

	<%-- 지국비품상세 목록 시작--%>
	<table width="500" border="0" cellspacing="0"  cellpadding="1" bgcolor="#FFFFFF" class="gray" id="aset_list_id">
	<form name="aset_list_form" method="post" action="">
		<input type="hidden" name="bocd" value="">   	<!--지국지사코드-->
		<input type="hidden" name="asetseq" value="">   <!--비품일련번호-->    

		<tr bgcolor="#dddddd" height="23">
			<td width="60" class="gray" align="center" > 번호 </td>
			<td width="150" class="gray" align="center"> 분류 </td>
			<td width="180" class="gray" align="center"> 비품명 </td>
			<td class="gray" align="center"> 구입일자 </td>
		</tr>
	<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_ASET_DTLCURCOMMLISTRecord curcommlistRec = (SS_L_ASET_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    	<!-- 지국비품현황 상세 링크 -->   
		<tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>','<%= curcommlistRec.asetseq%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
			<td class="gray" align="center" width="60" > &nbsp;<%= curcommlistRec.asetseq%> </td>
			<td class="gray" width="150"> &nbsp;<%= curcommlistRec.asetclascdnm%> </td>
			<td class="gray" width="180"> &nbsp;<%= curcommlistRec.asetnm%> </td>
			<td class="gray" align="center"> &nbsp;<%= Util.convertS(curcommlistRec.buydt)%> </td>
		</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
        <tr>
			<td class="gray" align="center" width="60" > &nbsp; </td>
			<td class="gray" width="150"> &nbsp; </td>
			<td class="gray" width="180"> &nbsp; </td>
			<td class="gray" align="center"> &nbsp; </td>
		</tr>          
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
		<tr bgcolor="#dddddd" >
			<td  colspan="4" class="gray" height="23" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> 총건수 <%= Util.comma(ds.getTotalcnt()) %> 건</b>
			</td>
		</tr>
	</form>		
	</table>
	<%-- 지국비품상세 목록 끝--%>
	
	<!-- 페이지 이동-->
	<table width="500" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
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
				<jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
				<jsp:param name = "page_set_gubun" 	value="0"/>
				</jsp:include>
				<!--JSP PAGE END------------------------------------------------------------------------------------>
			</td>
		</tr>
	</table>
	<!-- 페이지 이동-->

	<!--지국비품상세 상세 시작 -->
	<table width="100%" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="aset_detail_id">		
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;번호 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;비품분류 </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;비품명 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;사양 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;제조원 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;구입처 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;구입일자 </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;구입금액 </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;본사지원금 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" width="100" class="gray" he> &nbsp;유지보수내용 </td>
			<td class="gray"> 
				<textarea cols="27" rows="6" class="scroll1" readOnly>&nbsp;</textarea>
			</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;폐기일자 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;비고 </td>
			<td class="gray">
				<textarea cols="27" rows="5" class="scroll1" readOnly>&nbsp;</textarea>
			</td>
		</tr>
	</table>        
	<!--지국비품상세 상세 끝 -->


<script>
    parent.document.all.aset_list_id.outerHTML = aset_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

    // 화면 초기화
    parent.document.all.aset_detail_id.outerHTML = aset_detail_id.outerHTML;

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}else if(ds.curcommlist.size() == 1){			// 현황-목록에서 상세로 분기시 목록의 갯수가 1개인 경우는 자동으로 상세를 보여주기 위한 설정
	SS_L_ASET_DTLCURCOMMLISTRecord curcommlistRec1 = (SS_L_ASET_DTLCURCOMMLISTRecord)ds.curcommlist.get(0); %>
	
	// 상세 조회
	if(parent.gs_bocd != ''){
		parent.detail_view(parent.gs_bocd, '<%= curcommlistRec1.asetseq%>');
	}
		
<%}%>
</script>
