<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_bil_1311_u.jsp
* ��� :  ������ �Ա� ����,������Ʈ
* �ۼ����� : 2003-12-01
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<html>
	<head>
	<script language="JavaScript" src="/html/comm_js/common.js"></script>
	<script language="javascript">
		alert("����Ǿ����ϴ�.");


		var lo_form1 = parent.document.non_rcpm_form;
		var curr_page_no=lo_form1.curr_page_no.value;

		parent.non_rcpm_list(curr_page_no);
		parent.setEventHandler();
	</script>
	</head>
</html>