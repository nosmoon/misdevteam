<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1230_a.jsp
* 기능 : 지국지원-신문지원물품-마감-마감
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
    SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet ds = (SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet)request.getAttribute("ds");
%>

<script language="javascript">
    alert("마감되었습니다.");

    // 상세화면을 갱신해준다.
	parent.nwspitemcostclos_detail_view('<%= ds.getBasidt()%>');
</script>
