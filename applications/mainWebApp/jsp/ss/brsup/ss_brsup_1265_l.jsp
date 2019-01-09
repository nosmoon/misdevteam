<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1265_l.jsp
* 기능 : 지국지원-신문지원물품-비용(지원담당)-목록
* 작성일자 : 2004-02-08
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_NWSPITEMCOST_SPLYDataSet ds = (SS_L_NWSPITEMCOST_SPLYDataSet)request.getAttribute("ds");
    int listCount = 10;		// 화면당 항목수
%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
<form name="cost_list_form" method="post" action="" >
    <input name="basidt" type="hidden" value ="">
    <input name="bocd" type="hidden" value ="">
    <input name="basidtary" type="hidden" value ="">
    <input name="bocdary" type="hidden" value ="">
    <input name="checkedary" type="hidden" value ="">

	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="140" class="gray" align="center">팀&nbsp;</td>
		<td width="140" class="gray" align="center">지역</td>
		<td class="gray" align="center">지국</td>
		<td width="150" class="gray" align="center">비용금액</td>
		<td width="80"  class="gray" align="center">입금</td>
		<td width="150" class="gray" align="center">입금일자</td>
	</tr>
<%-- 신문지원물품 비용 목록 --%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_NWSPITEMCOST_SPLYCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMCOST_SPLYCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <tr>
        <td width="140" class="gray" align="center"> <%= curcommlistRec.deptnm%>&nbsp;</td>
        <td width="140" class="gray" align="center"> <%= curcommlistRec.areanm%>&nbsp;</td>
        <td class="gray" align="center"><%= curcommlistRec.bonm%>&nbsp;</td>
        <td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.splychrgamt)%>&nbsp;</td>
        <td width="80"  class="gray" align="center">
			<!-- 체크박스의 value = 기준일자 6자리, 지국지사코드 5자리 -->
			<input type="checkbox" name="splychrgclamtyn" onclick="window.event.cancelBubble=true;" value="<%= curcommlistRec.basidt%><%= curcommlistRec.bocd%>"
				<%= Util.convertYn(curcommlistRec.splychrgclamtyn, "checked", "")%> >&nbsp;
		</td>
        <td width="150" class="gray" align="center">
				<%= Util.convertS(curcommlistRec.splychrgclamtdt)%>&nbsp;
		</td>
	</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
		<td width="140" class="gray" align="center">&nbsp;</td>
		<td width="140" class="gray" align="center">&nbsp;</td>
		<td class="gray" align="center">&nbsp;</td>
		<td width="150" class="gray" align="center">&nbsp;</td>
		<td width="80"  class="gray" align="center"><input type="checkbox" name="checkbox">&nbsp;</td>
		<td width="150" class="gray" align="center">&nbsp;</td>
	</tr>
	<%}%>
<%}%>

	<tr bgcolor="#dddddd" align="right" height="23">
		<td colspan="6" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총금액 <%= Util.comma(ds.getTotalsplychrgamt())%> 원</b>
		</td>
	</tr>
</form>
</table>


<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;

    // 이벤트 핸들러 호출
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>

