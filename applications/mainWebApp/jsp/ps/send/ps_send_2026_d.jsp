<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2026_d.jsp
* 기능 : 지로추가발송 삭제
* 작성일자 : 2004/03/16
* 작성자 : 장수환
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<script language="javascript">
    alert("삭제 되었습니다.");

    var o_form1 = parent.document.all.detail_form;

	o_form1.accflag.value = '';
    parent.list_search();
</script>


