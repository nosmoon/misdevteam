<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : annc_bridge.jsp
* ��� : �������������� ��â���� ����
* �ۼ����� :
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<script language="JavaScript">
function openPage() {

  var page = "http://mailing.chosun.com/netpion/websurvey.jsp";
  var bid = "<%=session.getAttribute("uid")%>";

//  location.href = page + "?bid=" + bid;
   alert( page + "?bid=" + bid );

}
</script>
</head>
<body onload="javascript:openPage();">
</body>
</html>

