<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_send_1921_t.jsp
* 기능 : 지로 정상발송 지로출력
* 작성일자 : 2004-02-03
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				     	value="<%=ozServerIP%>">
<param name="connection.reportname"				    value="SP_PS_P_SEND_GIRO_NORM_RECP.ozr">
<param name="odi.odinames"						     	value="SP_PS_P_SEND_GIRO_NORM_RECP">
<param name="odi.SP_PS_P_SEND_GIRO_NORM_RECP.pcount" 	value="3">
<param name="odi.SP_PS_P_SEND_GIRO_NORM_RECP.args1"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_GIRO_NORM_RECP.args2"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_GIRO_NORM_RECP.args3"	value="girosenddt=<%=request.getParameter("girosenddt")%>">
<param name="appleconfigmode"					     	value="html">
<param name="applet.isframe"					     	value="true">
<param name="applet.isframemode"				     	value="preview">
</OBJECT>
