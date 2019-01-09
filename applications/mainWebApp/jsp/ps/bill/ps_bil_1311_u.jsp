<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_bil_1311_u.jsp
* 기능 :  비정상 입금 저장,업데이트
* 작성일자 : 2003-12-01
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<html>
	<head>
	<script language="JavaScript" src="/html/comm_js/common.js"></script>
	<script language="javascript">
		alert("저장되었습니다.");


		var lo_form1 = parent.document.non_rcpm_form;
		var curr_page_no=lo_form1.curr_page_no.value;

		parent.non_rcpm_list(curr_page_no);
		parent.setEventHandler();
	</script>
	</head>
</html>