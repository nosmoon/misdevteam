<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1245_l.jsp
* 기능 : 지국지원-신문지원물품-비용(영업담당)-목록
* 작성일자 : 2004-02-07
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_NWSPITEMCOST_BUSNDataSet ds = (SS_L_NWSPITEMCOST_BUSNDataSet)request.getAttribute("ds");
    int listCount = 10;		// 화면당 항목수
%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
<form name="cost_list_form" method="post" action="" >
    <input name="basidtary" type="hidden" value ="">		<!--기준일자 집합 문자열-->
    <input name="deptcdary" type="hidden" value ="">		<!--부서(팀)코드 집합 문자열-->
    <input name="areacdary" type="hidden" value ="">		<!--지역코드 집합 문자열-->
    <input name="bocdary" type="hidden" value ="">			<!--지국지사코드 집합 문자열-->
    <input name="clamtary" type="hidden" value ="">			<!--수금액 집합 문자열-->
    <input name="rcpmpersnmary" type="hidden" value ="">	<!--입금자명 집합 문자열-->

	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="100" class="gray">팀&nbsp;</td>
		<td width="100" class="gray">지역</td>
		<td class="gray">지국</td>
		<td width="90" class="gray">물품대금</td>
		<td width="90" class="gray">입금액</td>
		<td width="90" class="gray">잔액</td>
		<td width="100" class="gray">입금자</td>
		<td width="100" class="gray">완납일자</td>
	</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_NWSPITEMCOST_BUSNCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMCOST_BUSNCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 신문지원물품 비용 상세 링크 -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.basidt%>','<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td width="100" class="gray" align="left"> <%= curcommlistRec.deptnm%>&nbsp;</td>
		<td width="100" class="gray" align="left"> <%= curcommlistRec.areanm%> &nbsp;</td>
		<td class="gray" align="left"> <%= curcommlistRec.bonm%>&nbsp; </td>
		<td width="90" class="gray" align="right"> <%= Util.comma(curcommlistRec.busnchrgamt)%>&nbsp;</td>
		<td width="90" class="gray" onclick="window.event.cancelBubble = true;">
			<input name="clamt" type="text" size="10" class="text_box" value="" style="text-align:right" comma>
		</td>
		<td width="90" class="gray" align="right"> <%= Util.comma(curcommlistRec.busnchrgclamtbal)%>&nbsp;</td>
		<td width="100" class="gray" onclick="window.event.cancelBubble = true;">
			<input name="rcpmpersnm" type="text" size="10" class="text_box" value="" style="text-align:right">
		</td>
		<td width="100" class="gray" align="center"> <%= Util.convertS(curcommlistRec.busnchrgclamtdt)%>&nbsp;</td>
<!--각 로우마다 기준일자,부서(팀)코드,지역코드,지국지사코드를 hidden으로 붙인다.-->
	    <input name="basidt" type="hidden" value ="<%= curcommlistRec.basidt%>">		<!--기준일자 -->
	    <input name="deptcd" type="hidden" value ="<%= curcommlistRec.deptcd%>">		<!--부서(팀)코드 -->
	    <input name="areacd" type="hidden" value ="<%= curcommlistRec.areacd%>">		<!--지역코드 -->
	    <input name="bocd" type="hidden" value ="<%= curcommlistRec.bocd%>">			<!--지국지사코드 -->
	</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
		<td width="100" class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td width="90" class="gray">&nbsp;</td>
		<td width="90" class="gray"><input name="text" type="text" size="10" class="text_box" value=""></td>
		<td width="90" class="gray">&nbsp;</td>
		<td width="100" class="gray"><input name="text" type="text" size="10" class="text_box" value=""></td>
		<td width="100" class="gray">&nbsp;</td>
	</tr>
	<%}%>
<%}%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="8" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>
</form>
</table>

<!--상세폼 초기화를 위한 table-->
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
</table>


<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;
	// 상세폼 초기화
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;

    // 이벤트 핸들러 호출
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>

