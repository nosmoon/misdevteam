<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1275_a.jsp
* 기능 : 확장현황-사원확장-대회관리-비용-마감취소
* 작성일자 : 2003-12-12
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet ds = (SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet)request.getAttribute("ds");
%>

<script language="javascript">
    alert("마감취소 되었습니다.");

    // 상세화면을 갱신해준다.
	parent.cost_detail_view('<%= ds.getBasidt()%>');
</script>
