<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1782_l.jsp
* 기능 : 확장현황-사이버확장-비용관리(영업)-목록
* 작성일자 : 2004-04-09
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%

    SS_L_RDR_EXTN_CYBCOSTDataSet ds = (SS_L_RDR_EXTN_CYBCOSTDataSet)request.getAttribute("ds");
%>
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
    <form name="cost_list_form" method="post" action="" >
        <input name="basidt" type="hidden" value ="">
        <input name="bocd" type="hidden" value ="">
        <input name="basidtary" type="hidden" value ="">
        <input name="bocdary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">
        <input name="accflag" type="hidden" value ="">
      <tr bgcolor="#dddddd" align="center">
        <td width="100" class="gray" align="center"> 년월 </td>
        <td width="125" class="gray" align="center"> 지역 </td>
        <td width="125" class="gray" align="center"> 지국 </td>
        <td width="125" class="gray" align="center"> 비용금액 </td>
        <td width="95" class="gray" align="center"> 입금 </td>
        <td width="130" class="gray" align="center"> 입금일자 </td>
        <td width="130" class="gray" align="center"> 지국구분 </td>
      </tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_RDR_EXTN_CYBCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_CYBCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 사이버확장비용 상세 링크 -->
    <tr bgcolor="" onclick="cost_detail_view('<%= curcommlistRec.basidt%>','<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td width="100" class="gray" align="center"> <%= Util.convertMonthS(curcommlistRec.basidt)%>&nbsp;</td>
        <td width="125" class="gray" align="center"> <%= curcommlistRec.areacdnm%>&nbsp;</td>
        <td width="125" class="gray" align="center"><%= curcommlistRec.bocdnm%>&nbsp;</td>
        <td width="125" class="gray" align="right"> <%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
        <td width="95" class="gray" align="center">
			<!-- 체크박스의 value = 기준일자 6자리, 지국지사코드 5자리 -->
			<input type="checkbox" name="busnchrgclamtyn" onclick="window.event.cancelBubble=true;" value="<%= curcommlistRec.basidt%><%= curcommlistRec.bocd%>"
				<%= Util.convertYn(curcommlistRec.busnchrgclamtyn, "checked", "")%> >&nbsp;
		</td>
        <td width="130" class="gray" align="center">
				<%= Util.convertS(Util.convertNull(curcommlistRec.busnchrgclamtdt,"-"))%>&nbsp;
		</td>
        <td width="130" class="gray" align="center">
				<%= Util.convertYn(curcommlistRec.costburdyn,"&nbsp;","300부미만지국")%>&nbsp;
		</td>
      </tr>
<%}%>
      <tr bgcolor="#dddddd">
        <td colspan="3" class="gray" align="right"> 계&nbsp;</td>
        <td class="gray" align="right"> <%= Util.comma(ds.getTotalcostamt())%>&nbsp;</td>
        <td colspan="4" class="gray">
          <div align="right"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총건수
            : <b><%= ds.getTotalcnt()%>건</b></div>
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
    
    // 이벤트 핸들러 호출
    parent.jsInit();
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%></script>

