<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1380_s.jsp
* 기능       : 독자정보관리(판촉물내역팝업-상세조회)
* 작성일자   : 2004-06-03
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	// request
	String rdr_no = Util.checkString(request.getParameter("rdr_no"));
	String payno = Util.checkString(request.getParameter("payno"));

    // getting dataset
    SL_S_BNS_ITEMPAYDataSet ds = (SL_S_BNS_ITEMPAYDataSet)request.getAttribute("ds");  // request dataset
%>
<!-------------------- 판촉물지급 상세폼 시작---------------------->
  <table width="670" border="0" cellpadding="1" cellspacing="0" bgcolor="#FFFFFF" class="gray" id="bns_detail_id">
    <form name="bns_detail_form" method="post">
      <input type=hidden name=accflag   > <!--	처리구분(I:입력, U:수정, D:삭제)                    -->
      <input type=hidden name=rdr_no    value="<%=rdr_no%>"> <!--	독자번호                    -->
    <tr height="23">
      <td width="51" bgcolor="#dddddd" class="gray">지급번호<font color="red">*</font></td>
      <td width="59" class="gray"><input name="payno" type="text" class="text_box" id="dlvno" tabIndex="1" size="3" maxlength="3" style="ime-mode:disabled;" len="3" dataType="number" caption="지급번호" notEmpty readonly value="<%=payno%>"></td>
      <td width="63" bgcolor="#dddddd" class="gray">지급일자<font color="red">*</font></td>
      <td width="77" class="gray"><input name="paydt" class="text_box" size="9"  tabindex="2" style="ime-mode:disabled" dataType="date" caption="지급일자" value="<%=Util.convertS(ds.paydt)%>"></td>
      <td width="65" bgcolor="#dddddd" class="gray">판촉물<font color="red">*</font></td>
      <td width="215" class="gray"><input name="bns_itemcd" type="text" class="text_box" tabIndex="3" size="6" maxlength="6" style="ime-mode:disabled;" dataType="number" caption="판촉물코드" notEmpty onkeydown="bns_itemcd_enter_search(1);" value="<%=ds.bns_itemcd%>">
        <input name="image" type="image" id="bns_itemcd_search_btn" onclick="bns_itemcd_search();window.event.returnValue=false;" src="/html/slcomm_img/bu_search.gif" align="absmiddle" width="36" height="19" border="0">
        <input type=hidden name="bns_itemuprc" value="<%=ds.bns_itemuprc%>">
      <input name="bns_itemnm" type="text" size="17" class="text_box" tabIndex="4" style="ime-mode:active;" caption="판촉물명" value="<%=ds.bns_itemcd%>"></td>
      <td width="38" bgcolor="#dddddd" class="gray">수량</td>
      <td width="85" class="gray"><input name="qunt" type="text" class="text_box" tabIndex="5" size="3" maxlength="3" style="ime-mode:disabled;text-align:right" dataType="number" caption="수량" readonly></td>
    </tr>
    <tr height="23">
      <td bgcolor="#dddddd" class="gray">확장일자</td>
      <td class="gray"><input name="rdr_extndt" class="text_box" size="9"  tabindex="6" style="ime-mode:disabled" dataType="date" caption="확장일자" readonly value="<%=Util.convertS(ds.rdr_extndt)%>"></td>
      <td bgcolor="#dddddd" class="gray">확장번호</td>
      <td class="gray"><input name="bonm" type="text" class="text_box" tabIndex="7" size="6" maxlength="6" style="ime-mode:active" dataType="number" caption="확장번호" readonly value="<%=Util.convertS(ds.rdr_extnno)%>"></td>
      <td bgcolor="#dddddd" class="gray">지급지국명</td>
      <td class="gray"><input type="hidden" name="bocd" ><input name="bonm" type="text" class="text_box" tabIndex="8" size="15" style="ime-mode:active" caption="지급지국명" notEmpty readonly value="<%=ds.bonm%>"></td>
      <td bgcolor="#dddddd" class="gray">금액</td>
      <td class="gray"><input name="amt" type="text" class="text_box" tabIndex="6" size="10" maxlength="10" style="ime-mode:disabled;text-align:right" dataType="number" comma caption="금액" readonly value="<%=Util.comma(ds.amt)%>">원</td>
    </tr>
    </form>
  </table>
  <!-------------------- 판촉물지급 상세폼 끝---------------------->
<script language="javascript">
    // 구독계약상세 정보 엎어치기
    parent.document.all.bns_detail_id.outerHTML = document.all.bns_detail_id.outerHTML;
    parent.jsInit();
</script>
