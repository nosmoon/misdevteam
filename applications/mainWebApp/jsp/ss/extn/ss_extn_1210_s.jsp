<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1210_s.jsp
* 기능 : 확장현황-사원확장-대회관리-상세
* 작성일자 : 2003-12-10
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RDR_EXTN_EMPCAMPDataSet ds = (SS_S_RDR_EXTN_EMPCAMPDataSet)request.getAttribute("ds");
    int mediListCount = 8;
%>
<table id="camp_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td height="25" bgcolor="#EBE9DC" class="title">사원확장대회 상세</td>
    </tr>
    <tr>
        <td height="3">
        <!--여백-->
        </td>
    </tr>
</table>

<table id="camp_detail_id" width="340" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
<form name="camp_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="U"><!-- 입력(I),수정(U),삭제(D) 구분필드 초기값(I) -->
    <input type="hidden" name="rdr_extncampno" value="<%= ds.getRdr_extncampno()%>"><!-- 사원확장대회번호 -->
    <input type="hidden" name="closyn" value="<%= ds.getClosyn()%>"><!-- 사원확장대회 마감여부 -->
    <input type="hidden" name="medicdary" value=""><!-- 매체정보 문자열 집합 -->
    <input type="hidden" name="alonamtary" value=""><!-- 수당금액 문자열 집합 -->
    <input type="hidden" name="qtyaplydtary" value=""><!-- 부수적용일자 문자열 집합 -->
    <input type="hidden" name="basivalqtyary" value=""><!-- 기준부수 문자열 집합 -->
  <tr>
    <td bgcolor="#dddddd"  class="gray" height="25">대회명<font color="#FF0000">*</td>
    <td colspan="3" class="gray" height="25">
      <input name="campnm" type="text" size="20" class="text_box" value="<%= ds.getCampnm()%>" caption="대회명" notEmpty>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">시작일자<font color="#FF0000">*</td>
    <td colspan="3" class="gray" height="25">
      <input name="frdt" type="text" size="10" class="text_box" value="<%= ds.getFrdt()%>"  caption="시작일자" dataType="date" notEmpty>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">종료일자<font color="#FF0000">*</td>
    <td colspan="3" class="gray" height="25">
      <input name="todt" type="text" size="10" class="text_box" value="<%= ds.getTodt()%>" caption="종료일자" dataType="date" notEmpty>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">등록종료일자<font color="#FF0000">*</td>
    <td colspan="3" class="gray" height="25">
      <input name="closdt" type="text" size="10" class="text_box" value="<%= ds.getClosdt()%>" caption="등록종료일자" dataType="date" notEmpty>
    </td>
  </tr>
  <tr>
    <td  bgcolor="#dddddd" class="gray" height="25">마감여부</td>
    <td colspan="3" class="gray" height="25">
     <%= ds.getClosyn()%>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">수당지급일자<font color="#FF0000">*</td>
    <td colspan="3" class="gray" height="25">
      <input name="alonpayplandt" type="text" size="10" class="text_box" value="<%= ds.getAlonpayplandt()%>" caption="수당지급일자" dataType="date" notEmpty>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">비고</td>
    <td colspan="3" class="gray" height="25">
      <input name="remk" type="text" size="35" class="text_box" value="<%= ds.getRemk()%>">
    </td>
  </tr>
  <tr align="center" bgcolor="#EBE9DC">
    <td width="110" class="gray" height="25">매체</td>
    <td width="75" class="gray" height="25">수당</td>
    <td width="80" class="gray" height="25">부수적용일자</td>
    <td width="75" class="gray" height="25">기준부수</td>
  </tr>


<%-- 매체 목록 반복 시작 --%>
<%
for(int i=0; i<mediListCount; i++){     // 화면에 표시할 목록 갯수 만큼
    if(i< ds.curcommlist.size()){		// 상세정보 결과값을 가지고 있는 경우
        SS_S_RDR_EXTN_EMPCAMPCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_EXTN_EMPCAMPCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
  <tr>
    <td class="gray" height="25" align="center">
    <%-- 하나의 매체는 필수 입력항목 --%>
    <%
        if( i== 0 ){
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="매체설정" notEmpty onchange="javascript:medicd_change(<%= i+1 %>, medicd<%= i+1 %>, alonamt<%= i+1 %>,  qtyaplydt<%= i+1 %>, basivalqty<%= i+1 %>);">
    <%
        }else{
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="매체설정" onchange="javascript:medicd_change(<%= i+1 %>, medicd<%= i+1 %>, alonamt<%= i+1 %>,  qtyaplydt<%= i+1 %>, basivalqty<%= i+1 %>);">
    <%
        }
    %>
        <!-- 매체코드, 코드명 목록 -->
        <option value=''>선택</option>
        <%
            for(int j=0; j<ds.curmedicd.size(); j++){
                SS_S_RDR_EXTN_EMPCAMPCURMEDICDRecord curmedicdRec = (SS_S_RDR_EXTN_EMPCAMPCURMEDICDRecord)ds.curmedicd.get(j);

                /* 예외 처리 시작 */
                if(curmedicdRec == null || curmedicdRec.cicodeval == null || "".equals(curmedicdRec.cicodeval)){
                    request.setAttribute("appException", new AppException("ss_extn_1110_s.jsp(1)","매체코드가 올바르지 않습니다."));
                    pageContext.forward("/jsp/ss/comm_jsp/app_error.jsp");
                    //rd.forward(request, response);
                }
                /* 예외 처리 끝 */

                if(curmedicdRec.cicodeval.equals(curcommlistRec.medicd)){
        %>
                    <option value="<%= curmedicdRec.cicodeval%>" selected><%= curmedicdRec.cicdnm%></option>
        <%      }else{%>
                    <option value="<%= curmedicdRec.cicodeval%>"><%= curmedicdRec.cicdnm%></option>
        <%
                }
            }
        %>
    </select>
    </td>
    <td class="gray" height="25" align="center">
      <input name="alonamt<%= i+1 %>" id="alonamt<%= i+1 %>" type="text" style="text-align:right" value="<%= curcommlistRec.alonamt%>" size="8" class="text_box" caption="수당" dataType="integer" comma >
    </td>
    <td class="gray" height="25" align="center">
      <input name="qtyaplydt<%= i+1 %>" id="qtyaplydt<%= i+1 %>" type="text" value="<%= curcommlistRec.qtyaplydt%>" size="10" class="text_box" caption="부수적용일자" dataType="date" >
    </td>
    <td class="gray" height="25" align="center">
      <input name="basivalqty<%= i+1 %>" id="basivalqty<%= i+1 %>" type="text" style="text-align:right" value="<%= curcommlistRec.basivalqty%>" size="8" class="text_box" caption="기준부수" dataType="integer" >
    </td>
  </tr>
<%
    }else{                  //상세정보 결과값을 가지고 있지 않은 경우
%>
  <tr>
    <td class="gray" height="25" align="center">
    <%-- 하나의 매체는 필수 입력항목 --%>
    <%
        if( i== 0 ){
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="매체설정" notEmpty onchange="javascript:medicd_change(<%= i+1 %>, medicd<%= i+1 %>, alonamt<%= i+1 %>,  qtyaplydt<%= i+1 %>, basivalqty<%= i+1 %>);">
    <%
        }else{
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="매체설정" onchange="javascript:medicd_change(<%= i+1 %>, medicd<%= i+1 %>, alonamt<%= i+1 %>,  qtyaplydt<%= i+1 %>, basivalqty<%= i+1 %>);">
    <%
        }
    %>
        <option value='' selected>선택</option>
        <%= ds.curmedicdOptHtml("") %><!-- 매체코드, 코드명 목록 -->
    </select>
    </td>
    <td class="gray" height="25" align="center">
      <input name="alonamt<%= i+1 %>" id="alonamt<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="수당" dataType="integer" comma >
    </td>
    <td class="gray" height="25" align="center">
      <input name="qtyaplydt<%= i+1 %>" id="qtyaplydt<%= i+1 %>" type="text" value="" size="10" class="text_box" caption="부수적용일자" dataType="date" >
    </td>
    <td class="gray" height="25" align="center">
      <input name="basivalqty<%= i+1 %>" id="basivalqty<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="기준부수" dataType="integer" >
    </td>
  </tr>
<%
    }
}
%>

<%-- 매체 목록 반복 끝 --%>
</form>
</table>

<script language="javascript">
    parent.document.all.camp_detail_title_id.outerHTML = camp_detail_title_id.outerHTML;
    parent.document.all.camp_detail_id.outerHTML = camp_detail_id.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

	// 취소버튼 활성화
	parent.document.all.cancel_id.disabled = false;
	
	// 폼의 accflag 를 'U'로 변경한다.
    parent.document.camp_detail_form.accflag.value = 'U'
</script>
