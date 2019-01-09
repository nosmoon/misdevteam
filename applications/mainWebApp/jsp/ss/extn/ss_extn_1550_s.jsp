<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1550_s.jsp
* 기능 : 확장현황-확장용역비용-(확장담당)-상세
* 작성일자 : 2003-12-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RDR_EXTN_SERVCLOSDataSet ds = (SS_S_RDR_EXTN_SERVCLOSDataSet)request.getAttribute("ds");
    int mediListCount = 13;
%>
<table id="serv_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td height="25" bgcolor="#EBE9DC" class="title">조선IS확장마감 상세</td>
    </tr>
    <tr>
        <td height="3">
        <!--여백-->
        </td>
    </tr>
</table>

<table id="serv_detail_id" width="430" border="0" cellspacing="0" cellpadding="1" bgcolor="#ffffff" class="gray">
<form name="serv_detail_form" method="post" action="">
	<input type="hidden" name="accflag" value="">          			<!-- 마감,마감취소 구분필드 -->
    <input type="hidden" name="closyn" value="<%= ds.getClosyn()%>"><!-- 확장용역비용마감 마감여부 -->
    <input type="hidden" name="medicdary" value="">					<!-- 매체정보 문자열 집합 -->
    <input type="hidden" name="basiamtary" value="">				<!-- 기준금액 문자열 집합 -->
  <tr>
    <td bgcolor="#dddddd"  class="gray" height="25">기준일자</td>
    <td colspan="4" class="gray" height="25">
      <input name="basidt" type="text" size="20" class="text_box" value="<%= ds.getBasidt()%>" caption="기준일자" dataType="month" readonly>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">시작일자</td>
    <td colspan="4" class="gray" height="25">
      <input name="frdt" type="text" size="10" class="text_box" value="<%= ds.getFrdt()%>"  caption="시작일자" dataType="date" readonly>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">종료일자</td>
    <td colspan="4" class="gray" height="25">
      <input name="todt" type="text" size="10" class="text_box" value="<%= ds.getTodt()%>" caption="종료일자" dataType="date" readonly>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">마감일자</td>
    <td colspan="4" class="gray" height="25">
      <input name="closdt" type="text" size="10" class="text_box" value="<%= ds.getClosdt()%>" caption="마감일자" dataType="date" readonly>
    </td>
  </tr>
  <tr>
    <td  bgcolor="#dddddd" class="gray" height="25">조선IS 마감여부</td>
    <td colspan="4" class="gray" height="25">
     <%= ds.getClosyn()%>
    </td>
  </tr>
  <tr>
    <td  bgcolor="#dddddd" class="gray" height="25">지원부 마감여부</td>
    <td colspan="4" class="gray" height="25">
     <%= ds.getSplychrgclosyn()%>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">청구일자</td>
    <td colspan="4" class="gray" height="25">
      <input name="clamdt" type="text" size="10" class="text_box" value="<%= ds.getClamdt()%>" caption="청구일자" dataType="date" readonly>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">비고</td>
    <td colspan="4" class="gray" height="25">
      <input name="remk" type="text" size="35" class="text_box" value="<%= ds.getRemk()%>"readonly>
    </td>
  </tr>
    <tr align="center" bgcolor="#EBE9DC">
        <td width="100" class="gray" height="25" align="center">매체</td>
        <td width="100" class="gray" height="25" align="center">부서</td>
        <td width="75" class="gray" height="25" align="center">아파트</td>
        <td width="75" class="gray" height="25" align="center">주택</td>
        <td class="gray" height="25" align="center">상가</td>
    </tr>


<%-- 매체 목록 반복 시작 --%>
<%
for(int i=0; i<mediListCount; i++){     // 화면에 표시할 목록 갯수 만큼
    if(i< ds.curcommlist.size()){		// 상세정보 결과값을 가지고 있는 경우
        SS_S_RDR_EXTN_SERVCLOSCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_EXTN_SERVCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
  <tr>
    <td class="gray" height="25" align="center">
    <%-- 하나의 매체는 필수 입력항목 --%>
    <%
        if( i== 0 ){
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" disabled class="sel_all" caption="매체설정" notEmpty onchange="javascript:medicd_change(medicd<%= i+1 %>, deptcd<%= i+1 %>, basiamt1<%= i+1 %>, basiamt2<%= i+1 %>, basiamt3<%= i+1 %>);">
    <%
        }else{
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" disabled class="sel_all" caption="매체설정" onchange="javascript:medicd_change(medicd<%= i+1 %>, deptcd<%= i+1 %>, basiamt1<%= i+1 %>, basiamt2<%= i+1 %>, basiamt3<%= i+1 %>);">
    <%
        }
    %>
        <!-- 매체코드, 코드명 목록 -->
        <option value=''>선택</option>
        <%
            for(int j=0; j<ds.curmedicd.size(); j++){
                SS_S_RDR_EXTN_SERVCLOSCURMEDICDRecord curmedicdRec = (SS_S_RDR_EXTN_SERVCLOSCURMEDICDRecord)ds.curmedicd.get(j);

                /* 예외 처리 시작 */
                if(curmedicdRec == null || curmedicdRec.cicodeval == null || "".equals(curmedicdRec.cicodeval)){
                    request.setAttribute("appException", new AppException("[ss_extn_1510_s.jsp(1)]","[ss_extn_1510_s.jsp(1)] 매체코드가 올바르지 않습니다."));
                    pageContext.forward("/jsp/ss/comm_jsp/app_error.jsp");
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
		<select name="deptcd<%= i+1 %>" size="1" class="sel_all" disabled>
            <option value="" selected>선택</option>
        <%
            for(int j=0; j<ds.curdeptcd.size(); j++){
                SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord curdeptcdRec = (SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord)ds.curdeptcd.get(j);

                if(curdeptcdRec.deptcd.equals(curcommlistRec.deptcd)){
        %>
                    <option value="<%= curdeptcdRec.deptcd%>" selected><%= curdeptcdRec.boksnm%></option>
        <%      }else{%>
                    <option value="<%= curdeptcdRec.deptcd%>"><%= curdeptcdRec.boksnm%></option>
        <%
                }
            }
        %>            
		</select>            
    </td>
    <td class="gray" height="25" align="center">
      <input name="basiamt1<%= i+1 %>" id="basiamt<%= i+1 %>" type="text" readOnly style="text-align:right" value="<%= curcommlistRec.basiamt1%>" size="8" class="text_box" caption="기준금액" dataType="integer" comma >      
    </td>
    <td class="gray" height="25" align="center">
      <input name="basiamt2<%= i+1 %>" id="basiamt<%= i+1 %>" type="text" readOnly style="text-align:right" value="<%= curcommlistRec.basiamt2%>" size="8" class="text_box" caption="기준금액" dataType="integer" comma >      
    </td>
    <td class="gray" height="25" align="center">
      <input name="basiamt3<%= i+1 %>" id="basiamt<%= i+1 %>" type="text" readOnly style="text-align:right" value="<%= curcommlistRec.basiamt3%>" size="8" class="text_box" caption="기준금액" dataType="integer" comma >      
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
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" disabled class="sel_all" caption="매체설정" notEmpty onchange="javascript:medicd_change(medicd<%= i+1 %>, deptcd<%= i+1 %>, basiamt1<%= i+1 %>, basiamt2<%= i+1 %>, basiamt3<%= i+1 %>);">
    <%
        }else{
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" disabled class="sel_all" caption="매체설정" onchange="javascript:medicd_change(medicd<%= i+1 %>, deptcd<%= i+1 %>, basiamt1<%= i+1 %>, basiamt2<%= i+1 %>, basiamt3<%= i+1 %>);">
    <%
        }
    %>
        <option value='' selected>선택</option>
        <%= ds.curmedicdOptHtml("") %><!-- 매체코드, 코드명 목록 -->
    </select>
    </td>
    <td class="gray" height="25" align="center">
		<select name="deptcd<%= i+1 %>" size="1" class="sel_all" disabled>
            <option value="" selected>선택</option>
            <%= ds.curdeptcdOptHtml("") %>                              	<!-- 부서코드, 코드명 목록 -->
		</select>            
    </td>
    <td class="gray" height="25" align="center">
        <input name="basiamt1<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="아파트기준금액" dataType="integer" comma readOnly>
    </td>
    <td class="gray" height="25" align="center">
        <input name="basiamt2<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="주택기준금액" dataType="integer" comma readOnly>
    </td>
    <td class="gray" height="25" align="center">
        <input name="basiamt3<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="상가기준금액" dataType="integer" comma readOnly>
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
    parent.document.all.serv_detail_title_id.outerHTML = serv_detail_title_id.outerHTML;
    parent.document.all.serv_detail_id.outerHTML = serv_detail_id.outerHTML;

    // 화면 초기화
    parent.jsInit();
</script>
