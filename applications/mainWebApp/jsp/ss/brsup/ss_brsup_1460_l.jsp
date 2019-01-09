<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1460_l.jsp
* 기능 : 지국지원-상해보험-비용(지원담당)-목록
* 작성일자 : 2004-02-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%--
1. 영업담당의 수금여부와는 별도로 지원담당의 수금을 처리한다.(영업담당이 수금처리하지 않은 항목에 대해서도 지원담당의 수금처리가 가능하다.)
   영업담당의 수금여부는 단지 보여주기만 한다.
--%>
<%
    SS_L_INSRCOST_SPLYDataSet ds = (SS_L_INSRCOST_SPLYDataSet)request.getAttribute("ds");
    int listCount = 10;		// 화면당 항목수
%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
<form name="cost_list_form" method="post" action="" >
    <input name="basidt" type="hidden" value ="">
    <input name="bocd" type="hidden" value ="">
    <input name="basidtary" type="hidden" value ="">
    <input name="bocdary" type="hidden" value ="">
    <input name="checkedary" type="hidden" value ="">

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" width="70" class="gray">팀&nbsp;</td>
		<td rowspan="2" width="70" class="gray">지역</td>
		<td rowspan="2" class="gray">지국</td>
		<td colspan="2" width="120" class="gray">보험단가</td>
		<td colspan="2" width="120" class="gray">지원단가</td>
		<td rowspan="2" width="70" class="gray">청구금액</td>
		<td rowspan="2" width="70" class="gray">담당수금</td>
		<td rowspan="2" width="70" class="gray">입금</td>
		<td rowspan="2" width="70" class="gray">완납일자</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td width="60" class="gray">신청</td>
		<td width="60" class="gray">금액</td>
		<td width="60" class="gray">지원</td>
		<td width="60" class="gray">금액</td>
	</tr>
<%-- 상해보험 비용 목록 --%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_INSRCOST_SPLYCURCOMMLISTRecord curcommlistRec = (SS_L_INSRCOST_SPLYCURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<tr>
		<td width="70" class="gray" align="left"><%= curcommlistRec.deptnm%>&nbsp;</td>
		<td width="70" class="gray" align="left"><%= curcommlistRec.areanm%>&nbsp;</td>
		<td class="gray" align="left"><%= curcommlistRec.bonm%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.aplcqunt)%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.totamt)%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.hdqtsplyqunt)%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.hdqtsplyamt)%>&nbsp;</td>
		<td width="70" class="gray" align="right"><%= Util.comma(curcommlistRec.clamamt)%>&nbsp;</td>
		<td width="70" class="gray" align="center">
			<!-- 영업담당 수금여부 -->
			<!-- 체크박스를 disabled 시킨다. -->
			<input type="checkbox" name="busnchrgclamtend" <%= Util.convertYn(curcommlistRec.busnchrgclamtend, "checked", "")%> disabled >&nbsp;
		</td>
		<td width="70" class="gray" align="center">
			<!-- 체크박스의 value = 기준일자 4자리, 지국지사코드 5자리 -->
			<input type="checkbox" name="splychrgclamtyn" onclick="window.event.cancelBubble=true;" value="<%= curcommlistRec.basidt%><%= curcommlistRec.bocd%>"
				<%= Util.convertYn(curcommlistRec.splychrgclamtyn, "checked", "")%> >&nbsp;
		</td>
		<td width="70" class="gray" align="center">
			<%= Util.convertS(curcommlistRec.splychrgclamtdt)%>&nbsp;
		</td>
  </tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
		<td width="70" class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="70" class="gray"><input type="checkbox" name="checkbox">&nbsp;</td>
		<td width="70" class="gray"><input type="checkbox" name="checkbox">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
	</tr>
	<%}%>
<%}%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="11" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총금액 <%= Util.comma(ds.getTotalsplychrgamt())%> 원 </b>&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>

<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;

    // 화면 초기화
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>

