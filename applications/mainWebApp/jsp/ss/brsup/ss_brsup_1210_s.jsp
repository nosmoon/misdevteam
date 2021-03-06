<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1210_s.jsp
* 기능 : 지국지원-신문지원물품-마감-상세
* 작성일자 : 2004-02-05
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_NWSPITEMCOSTCLOSDataSet ds = (SS_S_NWSPITEMCOSTCLOSDataSet)request.getAttribute("ds");
    int mediListCount = 4;
%>
<table id="nwspitemcostclos_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td height="25" bgcolor="#EBE9DC" class="title">신문지원물품마감 상세</td>
    </tr>
    <tr>
        <td height="3">
        <!--여백-->
        </td>
    </tr>
</table>

<table id="nwspitemcostclos_detail_id" width="340" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
<form name="nwspitemcostclos_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="U"><!-- 입력(I),수정(U),삭제(D) 구분필드 초기값(I) -->
    <input type="hidden" name="closyn" value="<%= ds.getClosyn()%>"><!-- 신문지원물품마감 마감여부 -->
    <tr>
        <td bgcolor="#dddddd"  class="gray" height="25">기준일자(년월)<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <input name="basidt" type="text" size="7" class="text_box" value="<%= ds.getBasidt()%>" caption="기준일자(년월)" dataType="month" notEmpty readOnly>
        <%--
        <%= ds.getBasidt()%>&nbsp;
        --%>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" width="90" height="25">시작일자<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <input name="frdt" type="text" size="10" class="text_box" value="<%= ds.getFrdt()%>"  caption="시작일자" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" width="90" height="25">종료일자<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <input name="todt" type="text" size="10" class="text_box" value="<%= ds.getTodt()%>" caption="종료일자" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" width="90" height="25">등록종료일자<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <input name="closdt" type="text" size="10" class="text_box" value="<%= ds.getClosdt()%>" caption="등록종료일자" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td  bgcolor="#dddddd" class="gray" width="90" height="25">마감여부<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <%= ds.getClosyn()%>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" width="90" class="gray" height="25">비용청구일자<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <input name="costclamdt" type="text" size="10" class="text_box" value="<%= ds.getCostclamdt()%>" caption="비용청구일자" dataType="date" notEmpty>
        </td>
    </tr>
</form>
</table>

<script language="javascript">
    parent.document.all.nwspitemcostclos_detail_title_id.outerHTML = nwspitemcostclos_detail_title_id.outerHTML;
    parent.document.all.nwspitemcostclos_detail_id.outerHTML = nwspitemcostclos_detail_id.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();

	// 폼의 accflag 를 'U'로 변경한다.
    parent.document.nwspitemcostclos_detail_form.accflag.value = 'U'
    
    
    //취소 버튼을 disable시킨다.
	parent.document.all.cancel_id.disabled = false;
    
</script>
