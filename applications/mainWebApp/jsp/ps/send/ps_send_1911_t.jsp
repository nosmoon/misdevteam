<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_send_1511_t.jsp
* ��� : ���� ����߼� ����Ʈ
* �ۼ����� : 2004-02-03
* �ۼ��� : ����ǥ
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
	String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				value="<%=ozServerIP%>">
<param name="connection.reportname"			value="SP_PS_P_SEND_GIRONORM.ozr">
<param name="odi.odinames"						value="SP_PS_P_SEND_GIRONORM">
<param name="odi.SP_PS_P_SEND_GIRONORM.pcount"	value="3">
<param name="odi.SP_PS_P_SEND_GIRONORM.args1"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_GIRONORM.args2"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_GIRONORM.args3"	value="girosenddt=<%=request.getParameter("girosenddt")%>">
<param name="appleconfigmode"					value="html">
<param name="applet.isframe"					value="true">
<param name="applet.isframemode"				value="preview">

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="��������߼۸���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--������ȯ ����-->
</OBJECT>

