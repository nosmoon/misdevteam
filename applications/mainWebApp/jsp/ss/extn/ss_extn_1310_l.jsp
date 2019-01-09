<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1310_l.jsp
* 기능 : 확장현황-사원확장-수당관리-목록
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
	SS_L_RDR_EXTN_EMPALONDataSet ds = (SS_L_RDR_EXTN_EMPALONDataSet)request.getAttribute("ds");
    int listCount = 10;		// 화면당 항목수
%>
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="alon_list_id">
    <form name="alon_list_form" method="post" action="" >
        <input name="rdr_extncampno" type="hidden" value ="">
        <input name="empseq" type="hidden" value ="">
        <input name="rdr_extncampnoary" type="hidden" value ="">
        <input name="empseqary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">
		<tr height="25" bgcolor="#DDDDDD">
			<td width="100" class="gray" align="center">대회명</td>
			<td width="90" class="gray" align="center">시작일자</td>
			<td width="90" class="gray" align="center">종료일자</td>
			<td width="80" class="gray" align="center">사원명</td>
			<td width="100" class="gray" align="center">회사</td>
			<td width="100" class="gray" align="center">부서</td>
			<td width="90" class="gray" align="center">계</td>
			<td class="gray" align="center">송금</td>
			<td width="90" class="gray"align="center">송금일자</td>
		</tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord)ds.curcommlist.get(i);%>
        <!-- 사원확장수당 상세 링크 -->
        <tr bgcolor="" onclick="alon_detail_view('<%= curcommlistRec.rdr_extncampno%>','<%= curcommlistRec.empseq%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
			<td width="100" class="gray" align="left"><%= curcommlistRec.campnm%>&nbsp;</td>
			<td width="90" class="gray" align="center"><%= Util.convertS(curcommlistRec.frdt)%>&nbsp;</td>
			<td width="90" class="gray" align="center"><%= Util.convertS(curcommlistRec.todt)%>&nbsp;</td>
			<td width="80" class="gray" align="left"><%= curcommlistRec.empnm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.empcmpynm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.empdeptnm%>&nbsp;</td>
			<td width="90" class="gray" align="right"><%= Util.comma(curcommlistRec.alonamt)%>&nbsp;</td>
			<td class="gray" align="center">
				<!-- 체크박스의 value = 사원확장대회번호 6자리, 사원일련번호 6자리 -->
				<input type="checkbox" onclick="window.event.cancelBubble=true;" name="payyn" value="<%= curcommlistRec.rdr_extncampno%><%= curcommlistRec.empseq%>"
				<%= Util.convertYn(curcommlistRec.payyn, "checked", "")%> >&nbsp;
			</td>
			<td width="90" class="gray"align="center">
				<%= Util.convertS(Util.convertNull(curcommlistRec.paydt,"-"))%>&nbsp;
			</td>
		</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
			<td width="80" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
	        <td class="gray" align="center"><input type="checkbox" name="checkbox" value="">&nbsp;</td>
			<td width="90" class="gray"align="center">&nbsp;</td>
		</tr>
	<%}%>
<%}%>
		<tr bgcolor="#dddddd" align="right">
			<td colspan="6" class="gray" align="right"> 계&nbsp;</td>
			<td width="95" class="gray" align="right"><%= Util.comma(ds.getTotalalonamt())%>&nbsp;&nbsp;</td>
			<td colspan="2" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
			</td>
		</tr>
    </form>
    </table>

	<!--상세 초기화를 위한 table -->
    <table border="0" cellspacing="0" cellpadding="0" id="alon_detail_id">
	</table>

<script>
    parent.document.all.alon_list_id.outerHTML = alon_list_id.outerHTML;
    
    // 상세 초기화
    parent.document.all.alon_detail_id.outerHTML = alon_detail_id.outerHTML;
    
    //화면 초기화
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>

