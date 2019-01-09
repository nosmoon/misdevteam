<%@page contentType="text/html; charset=KSC5601" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*, somo.framework.util.* " %>

<%
	String resultMsg = Util.checkString((String)request.getAttribute("resultMsg"));
	String msg = "";
	
	if(!"".equals(resultMsg)){
		msg = resultMsg;
	}else{
		msg = "정상처리되었습니다";
	}
%>

<script>
alert("<%=msg%>");
parent.init();
</script>
