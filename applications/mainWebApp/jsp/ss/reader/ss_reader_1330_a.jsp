<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1330_a.jsp
* 기능 : 독자현황-VacationStop-마감-마감
* 작성일자 : 2004-02-26
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_A_VSCLOS_CLOSEDataSet ds = (SS_A_VSCLOS_CLOSEDataSet)request.getAttribute("ds");
%>

<script language="javascript">
    alert("마감되었습니다.");

    // 상세화면을 갱신해준다.
	parent.vsclos_detail_view('<%= ds.getBasidt()%>');
</script>
