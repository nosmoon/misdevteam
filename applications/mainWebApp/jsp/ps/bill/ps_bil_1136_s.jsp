<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%@ include file="/jsp/ps/comm_jsp/pb_common.jsp" %>

<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* 파일명 : pu_bil_1131_s.jsp
* 기능 : 개별 입금 상세 정보
* 작성일자 : 2003-11-25
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
// dataset 인스턴스 선언 부분
//PB_S_SEPBKDataSet ds=(PB_S_SEPBKDataSet)request.getAttribute("ds"); //request dataset
%>

<!--검색 -->
<!--
      <table  cellspacing="0" width="830" cellpadding="2" border="0" class="gray" bgcolor="#FFFFFF" id="seprrcpm">
        <tr>
          <td width="90" bgcolor="#dddddd" class="gray" > 입금일자</td>
          <td class="gray" >
            <input type="text" name="rcpm_dd" size="10" class="text_box" caption="입금일자" notEmpty>
          </td>
          <td bgcolor="#dddddd" class="gray" width="90" >입금방법</td>
          <td class="gray" >
            <select name="rcpm_mthd" size="1" class="sel_all" caption="입금방법" notEmpty>
              <option>선택</option>
-->
				<% //=ds.rcpmmthdcurOptHtml("") %>
<!--
              <option>OCR</option>
              <option>MICR</option>
              <option>CARD</option>
              <option>무통장</option>
              <option>직수</option>
-->
<!--            </select>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray" >금액</td>
          <td class="gray" width="200">
            <input type="text" name="rcpm_amt" size="10" class="text_box" caption="금액" notEmpty>
          </td>
        </tr>
        <tr>
          <td width="90" bgcolor="#dddddd" class="gray" > 수납일자</td>
          <td class="gray" >
            <input type="text" name="recp_dd" size="10" class="text_box" caption="수납일자" notEmpty>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray" > 독자번호</td>
          <td colspan="3" class="gray" >
            <input type="text" name="rdrno_1" size="9" class="text_box" caption="독자번호1" notEmpty>
            <input type="text" name="rdrno_2" size="3"  class="text_box" caption="독자번호2" notEmpty>
            <input type="text" name="rdrno_3" size="5"  class="text_box" caption="독자번호3" notEmpty>
            <input type="text" name="rdr_nm" size="10" value="성명"  class="text_box" caption="성명" notEmpty>
            <input type="text" name="subs_medi" size="10" value="구독매체_1"  class="text_box" caption="구독매체" notEmpty>
          </td>
        </tr>
      </table>
-->
<script>
    parent.document.all.seprrcpm.outerHTML = seprrcpm.outerHTML;
</script>