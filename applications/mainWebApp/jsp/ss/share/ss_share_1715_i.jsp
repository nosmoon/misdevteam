<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1715_i.jsp
* 기능 : 정보공유 게시판 기사평 등록
* 작성일자 : 2003-12-08
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<script language="javascript">
<!--
// 기사평 등록 확인
function insert_ok(){
    alert("등록되었습니다.");
    infoexg_insert_form.action="/ss/share/1700";
    infoexg_insert_form.submit();
}    
-->
</script>

<body onload=insert_ok();>
<form name="infoexg_insert_form">
</form>
</body>
