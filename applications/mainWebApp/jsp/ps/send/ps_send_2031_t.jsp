<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%@ page contentType="text/html; charset=KSC5601" %>
<%--------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2031_t.jsp
* ���     : ���� �߰��߼۰��� �μ�
* �ۼ����� : 2004/03/16
* �ۼ���   : ���ȯ
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
<param name="connection.servlet"				value="<%=ozServerIP%>">
<param name="connection.reportname"			value="SP_PS_P_SEND_GIROADDM.ozr">
<param name="odi.odinames"						value="SP_PS_P_SEND_GIROADDM">
<param name="odi.SP_PS_P_SEND_GIROADDM.pcount"	value="3">
<param name="odi.SP_PS_P_SEND_GIROADDM.args1"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_GIROADDM.args2"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_GIROADDM.args3"	value="girosenddt=<%=request.getParameter("senddt")%>">
<param name="appleconfigmode"					value="html">
<param name="applet.isframe"					value="true">
<param name="applet.isframemode"				value="preview">

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="�����߰��߼۸���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--������ȯ ����-->
</OBJECT>
