<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1555_u.jsp
* 기능 : 확장현황-확장용역비용-(확장담당)-마감
* 작성일자 : 2003-12-22
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet ds = (SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet)request.getAttribute("ds");
%>

<script language="javascript">
    alert("마감되었습니다.");

    // 상세화면을 갱신해준다.
	parent.serv_detail_view('<%= ds.getBasidt()%>');
</script>
