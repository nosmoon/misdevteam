<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_send_1916_t.jsp
* ��� : ���� ����߼� ���κ������
* �ۼ����� : 2004-02-03
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //����� ��������
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�

%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				     	value="<%=ozServerIP%>">
<param name="connection.reportname"				    value="SP_PS_P_SEND_GIRO_NORM_CASE.ozr">
<param name="odi.odinames"						     	value="SP_PS_P_SEND_GIRO_NORM_CASE">
<param name="odi.SP_PS_P_SEND_GIRO_NORM_CASE.pcount" 	value="3">
<param name="odi.SP_PS_P_SEND_GIRO_NORM_CASE.args1"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_GIRO_NORM_CASE.args2"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_GIRO_NORM_CASE.args3"	value="girosenddt=<%=request.getParameter("girosenddt")%>">
<param name="appleconfigmode"					     	value="html">
<param name="applet.isframe"					     	value="true">
<param name="applet.isframemode"				     	value="preview">
</OBJECT>
