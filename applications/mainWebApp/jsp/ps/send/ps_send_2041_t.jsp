<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%@ page contentType="text/html; charset=KSC5601" %>
<%--------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2041_t.jsp
* ���     : ���� �߰��߼� ���� �μ�
* �ۼ����� : 2004/03/16
* �ۼ���   : ���ȣ
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
--------------------------------------------------------------------------------------------------%>
<%
    //����� ��������
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�
	String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���

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
