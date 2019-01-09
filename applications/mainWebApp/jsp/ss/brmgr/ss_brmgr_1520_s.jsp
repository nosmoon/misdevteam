<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1520_s.jsp
* 기능 : 지국경영-공정위위약금-상세
* 작성일자 : 2004-04-16
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_FCT_FRFTDataSet ds = (SS_S_FCT_FRFTDataSet)request.getAttribute("ds");
%>

    <!--내역 -->
      <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="fct_frft_detail">
 		<form name="detail_form" method="post" action="">
		<input type="hidden" name="common_deptcd" value ="">
		<input type="hidden" name="bocd" value ="<%= ds.getBocd()%>" maxlength="5" >                   <!-- 공통 부서(팀)코드 -->
		<input type="hidden" name="accflag" value ="" maxlength="5" >
        <input type="hidden" name="incmgpers" value="">
        <input type="hidden" name="impndt_pk" value="<%= ds.getImpndt()%>">
        <input type="hidden" name="deptcd_pk" value="<%= ds.getDeptcd()%>">
        <input type="hidden" name="areacd_pk" value="<%= ds.getAreacd()%>">
        <input type="hidden" name="viltresn_pk" value="<%= ds.getViltresn()%>">
        <tr>
          <td  bgcolor="#dddddd" class="gray" width="90">지국
          </td>
          <td width="250" class="gray">팀&nbsp;
            <select name="deptcd" size="1" class="sel_all" notEmpty caption="팀" onChange="area_search('2');">
              <option value="" selected>선택</option>
              <%= ds.deptlistOptHtml(ds.getDeptcd()) %>
            </select>
            지역
            <select name="areacd" size="1" class="sel_all" notEmpty caption="지역" id="fct_frft_areacd_id">
              <option value="<%= ds.getAreacd()%>" selected><%= ds.getAreanm()%></option>
            </select>
		  </td>
		  <td class="gray" colspan="2">
            지국
            <input name="bonm" type="text" size="8" value="<%= ds.getBonm()%>" notEmpty style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search('2');">
            <input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" style="cursor:hand" height="19" align="absmiddle" onclick="javascript:bo_search('2');window.event.returnValue=false;"><!--지국검색팝업-->
            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
          </td>
          <td bgcolor="#dddddd" class="gray" width="90">위반건수</td>
          <td class="gray">
            <input name="viltnoit" type="text" value="<%= ds.getViltnoit()%>" size="4" class="text_box">
            건</td>
        </tr>
        <tr>
          <td width="90" height="26" bgcolor="#dddddd" class="gray">부과일자 </td>
          <td class="gray" width="250">
            <input type="text" name="impndt" value="<%= ds.getImpndt()%>" notEmpty caption="부과일자" class="text_box" dataType="date">
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">독자명 </td>
          <td colspan="3" class="gray">
            <input type="text" style="ime-mode:active;" name="rdrnm" value="<%= ds.getRdrnm()%>" caption="독자명" class="text_box">
          </td>
        </tr>
        <tr>
          <td height="26" bgcolor="#dddddd" class="gray" width="90">부과금액 </td>
          <td class="gray" width="250">
            <input type="text" name="frftimpnamt" value="<%= ds.getFrftimpnamt()%>" caption="부과금액" style="text-align:right" dataType="number" class="text_box" comma>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">보류금액 </td>
          <td colspan="3" class="gray">
            <input type="text" name="resamt" caption="보류금액" value="<%= ds.getResamt()%>" style="text-align:right" dataType="number"  class="text_box" comma>
          </td>
        </tr>
        <tr>
          <td height="26" bgcolor="#dddddd" class="gray" width="90">심의결과 </td>
          <td class="gray" width="250">
            <select name="delbocom" caption="심의결과" class="sel_all">
              <option value="" selected>선택</option>
              <%= ds.delbocomlistOptHtml(ds.getDelbocom()) %>
            </select>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">위약사유</td>
          <td colspan="3" class="gray">
            <select name="viltresn" notEmpty  size="1" class="sel_all" caption="위약사유" >
              <option value="" selected>선택</option>
              <%= ds.viltresnlistOptHtml(ds.getViltresn()) %>
            </select>
          </td>
        </tr>
        <tr>
          <td height="26" bgcolor="#dddddd" class="gray" width="90">본사입금액 </td>
          <td class="gray" width="250">
            <input type="text" caption="본사입금액" value="<%= ds.getHdqtrcpmamt()%>" style="text-align:right" dataType="number" name="hdqtrcpmamt" class="text_box" comma>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">본사입금일자 </td>
          <td class="gray" width="200">
            <input type="text" name="hdqtrcpmdt" value="<%= ds.getHdqtrcpmdt()%>" dataType="date" caption="본사입금일자" class="text_box">
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">본사미납금액 </td>
          <td class="gray">
            <input type="text" name="hdqtun_pymtamt" value="<%= ds.getHdqtun_pymtamt()%>" caption="본사미납금액" style="text-align:right" dataType="number" class="text_box" comma>
          </td>
        </tr>
        <tr>
          <td height="26" bgcolor="#dddddd" class="gray" width="90">지국입금액 </td>
          <td class="gray" width="250">
            <input type="text" name="borcpmamt" value="<%= ds.getBorcpmamt()%>" caption="지국입금액" style="text-align:right" dataType="number" class="text_box" comma>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">지국입금일자 </td>
          <td class="gray" width="200">
            <input type="text" name="borcpmdt" value="<%= ds.getBorcpmdt()%>" caption="지국입금일자" dataType="date" class="text_box">
          </td>
          <td bgcolor="#dddddd" class="gray" width="90">지국미납금액 </td>
          <td class="gray">
            <input type="text" name="boun_pymtamt" value="<%= ds.getBoun_pymtamt()%>" caption="지국미납금액" style="text-align:right" dataType="number" class="text_box" comma>
          </td>
        </tr>
		</form>
      </table>

<script>
    parent.document.all.fct_frft_detail.outerHTML = fct_frft_detail.outerHTML;
    // detail_form 의 accflag 를 'U'로 변경한다.
    parent.document.detail_form.accflag.value = 'U'
    // 취소버튼 활성화
    parent.document.all.cancel_id.disabled = false;
	// 입력항목 처리
	parent.jsInit();
</script>
