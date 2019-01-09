<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1440_l.jsp
* 기능 : 지국지원-상해보험-비용(영업담당)-목록
* 작성일자 : 2004-02-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_INSRCOST_BUSNDataSet ds = (SS_L_INSRCOST_BUSNDataSet)request.getAttribute("ds");
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

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">팀&nbsp;</td>
		<td rowspan="2" width="70" class="gray">지역</td>
		<td rowspan="2" width="70" class="gray">지국</td>
		<td colspan="2" width="110" class="gray">보험단가</td>
		<td colspan="2" width="110" class="gray">지원단가</td>
		<td rowspan="2" width="65" class="gray">청구금액</td>
		<td rowspan="2" width="65" class="gray">입금액</td>
		<td rowspan="2" width="70" class="gray">잔액</td>
		<td rowspan="2" width="70" class="gray">입금자</td>
		<td rowspan="2" width="70" class="gray">완납일자 </td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td width="50" class="gray">신청</td>
		<td width="60" class="gray">금액</td>
		<td width="50" class="gray">지원</td>
		<td width="60" class="gray">금액</td>
	</tr>

<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_INSRCOST_BUSNCURCOMMLISTRecord curcommlistRec = (SS_L_INSRCOST_BUSNCURCOMMLISTRecord)ds.curcommlist.get(i); %>
    <!-- 상해보험 비용 상세 링크 -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.basidt%>','<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">

		<td class="gray" align="left"><%= curcommlistRec.deptnm%>&nbsp;</td>
		<td width="70" class="gray" align="left"><%= curcommlistRec.areanm%> &nbsp;</td>
		<td width="70" class="gray" align="left"><%= curcommlistRec.bonm%>&nbsp;</td>
		<td width="50" class="gray" align="right"><%= curcommlistRec.aplcqunt%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.totamt)%>&nbsp;</td>
		<td width="50" class="gray" align="right"><%= curcommlistRec.hdqtsplyqunt%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.hdqtsplyamt)%>&nbsp;</td>
		<td width="65" class="gray" align="right"><%= Util.comma(curcommlistRec.clamamt)%>&nbsp;</td>
		<td width="65" class="gray" align="right" onclick="window.event.cancelBubble = true;">
			<input name="clamt" type="text" size="8" class="text_box" value="" style="text-align:right" comma>
		</td>
		<td width="70" class="gray" align="right"> <%= Util.comma(curcommlistRec.clamtbal)%>&nbsp;</td>
		<td width="70" class="gray" align="right" onclick="window.event.cancelBubble = true;">
			<input name="rcpmpersnm" type="text" size="8" class="text_box" value="" style="text-align:right">
		</td>
		<td width="70" class="gray" height="23" align="right"> <%= Util.convertS(curcommlistRec.busnchrgclamtdt)%>&nbsp;</td>
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
		<td class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="50" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="50" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="65" class="gray">&nbsp;</td>
		<td width="65" class="gray"><input name="text" text="text" size="8" class="text_box" value="">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="70" class="gray"><input name="text" type="text" size="8" class="text_box" value="">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
	</tr>
	<%}%>
<%}%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="12" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>
</form>
</table>

<!--상세폼 초기화를 위한 select-->
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
</table>

<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;

    // 상세폼 초기화
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;

    // 화면 초기화
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>

