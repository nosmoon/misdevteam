<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1290_l.jsp
* 기능 : 확장현황-사원확장-비용관리(확장담당)-목록
* 작성일자 : 2003-12-13
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_EMPCOSTDataSet ds = (SS_L_RDR_EXTN_EMPCOSTDataSet)request.getAttribute("ds");
    int listCount = 10;		// 화면당 항목수
%>

<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
<form name="cost_list_form" method="post" action="" >
    <input name="basidt" type="hidden" value ="">
    <input name="bocd" type="hidden" value ="">
    <input name="basidtary" type="hidden" value ="">
    <input name="bocdary" type="hidden" value ="">
    <input name="checkedary" type="hidden" value ="">
    <input name="accflag" type="hidden" value ="">
    
	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="110" class="gray" align="center">년월</td>
		<td width="110" class="gray" align="center">지역</td>
		<td width="110" class="gray" align="center">지국</td>
		<td width="100" class="gray" align="center">비용금액</td>
		<td width="90" class="gray" align="center">담당수금</td>
		<td class="gray" align="center">입금</td>
		<td width="110" class="gray" align="center">입금일자</td>
		<td width="110" class="gray" align="center">지국구분</td>
	</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 사원확장비용 상세 링크 -->
    <tr bgcolor="" onclick="cost_detail_view('<%= curcommlistRec.basidt%>','<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td width="110" class="gray" align="center"> <%= Util.convertMonthS(curcommlistRec.basidt)%>&nbsp;</td>
        <td width="110" class="gray" align="left"> <%= curcommlistRec.areacdnm%>&nbsp;</td>
        <td width="110" class="gray" align="left"><%= curcommlistRec.bocdnm%>&nbsp;</td>
        <td width="100" class="gray" align="right"> <%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
        <td width="90" class="gray" align="center">
			<!-- 영업담당 수금여부 -->
			<!-- 체크박스를 disabled 시킨다. 단, submit시 데이터의 전송을 위해 disabled="false" 로 처리한다. -->
			<input type="checkbox" name="busnchrgclamtyn" <%= Util.convertYn(curcommlistRec.busnchrgclamtyn, "checked", "")%> disabled >&nbsp;
		</td>
        <td class="gray" align="center">
			<!-- 지원담당 수금여부 -->
			<!-- 체크박스의 value = 기준일자 6자리, 지국지사코드 5자리 -->
			<input type="checkbox" name="splychrgclamtyn" onclick="window.event.cancelBubble=true;" value="<%= curcommlistRec.basidt%><%= curcommlistRec.bocd%>"
				<%= Util.convertYn(curcommlistRec.splychrgclamtyn, "checked", "")%> >&nbsp;
		</td>
        <td width="110" class="gray" align="center">
				<%= Util.convertS(Util.convertNull(curcommlistRec.splychrgclamtdt,"-"))%>&nbsp;
		</td>
        <td width="110" class="gray" align="center">
				<%= Util.convertYn(curcommlistRec.costburdyn,"&nbsp;","350부미만지국")%>&nbsp;
		</td>
	</tr>
<%}%>
<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
			<td width="110" class="gray" align="center">&nbsp;</td>
			<td width="110" class="gray" align="center">&nbsp;</td>
			<td width="110" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center"><input type="checkbox" name="checkbox" value="" disabled>&nbsp;</td>
	        <td class="gray" align="center"><input type="checkbox" name="checkbox" value="">&nbsp;</td>
			<td width="110" class="gray" align="center">&nbsp;</td>
			<td width="110" class="gray" align="center">&nbsp;</td>
	</tr>
	<%}%>
<%}%>
	<tr bgcolor="#dddddd">
		<td colspan="3" class="gray" align="right"> 계&nbsp;</td>
		<td class="gray" align="right"> <%= Util.comma(ds.getTotalcostamt())%>&nbsp;</td>
		<td colspan="4" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>
</form>
</table>

<!--상세폼 초기화-->
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
</table>

<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;
    
    // 상세 초기화
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;
    
    // 화면 초기화
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>

