<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%@ page contentType="text/html; charset=KSC5601" %>
<%--------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2041_t.jsp
* 기능     : 지로 추가발송 지로 인쇄
* 작성일자 : 2004/03/16
* 작성자   : 김건호
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
--------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
	String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용

%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				     	value="<%=ozServerIP%>">
<param name="connection.reportname"				    value="SP_PS_P_SEND_GIRO_ADDM_RECP.ozr">
<param name="odi.odinames"						     	value="SP_PS_P_SEND_GIRO_ADDM_RECP">
<param name="odi.SP_PS_P_SEND_GIRO_ADDM_RECP.pcount"	value="3">
<param name="odi.SP_PS_P_SEND_GIRO_ADDM_RECP.args1"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_GIRO_ADDM_RECP.args2"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_GIRO_ADDM_RECP.args3"	value="girosenddt=<%=request.getParameter("senddt")%>">
<param name="appleconfigmode"					     	value="html">
<param name="applet.isframe"					     	value="true">
<param name="applet.isframemode"				     	value="preview">
</OBJECT>
