<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : annc_bridge.jsp
* 기능 : 설문조사페이지 새창으로 띄우기
* 작성일자 :
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
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

