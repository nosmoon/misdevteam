<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2206_a.jsp
* ��� : �߼����� ���
* �ۼ����� : 2005-10-01
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
<param name="connection.servlet"					value="<%=ozServerIP%>">
<param name="connection.reportname"				value="SP_PS_P_SEND_CLOS_COND.ozr">
<param name="connection.usewinhttp"			    value="true">
<param name="odi.odinames"							value="SP_PS_P_SEND_CLOS_COND">
<param name="odi.SP_PS_P_SEND_CLOS_COND.pcount"	value="7">
<param name="odi.SP_PS_P_SEND_CLOS_COND.args1"		value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_CLOS_COND.args2"		value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_CLOS_COND.args3"		value="groupby=<%=request.getParameter("send_clos_option")%>">
<param name="odi.SP_PS_P_SEND_CLOS_COND.args4"		value="senddt_fr=<%=request.getParameter("senddt_fr")%>">
<param name="odi.SP_PS_P_SEND_CLOS_COND.args5"		value="senddt_to=<%=request.getParameter("senddt_to")%>">
<param name="odi.SP_PS_P_SEND_CLOS_COND.args6"		value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_SEND_CLOS_COND.args7"		value="cmpycd_option=<%=request.getParameter("cmpycd_option")%>">

<param name="applet.configmode"					value="html">
<param name="applet.isframe"						value="true">
<param name="applet.mode"							value="preview">
<param name="applet.smartframesize"             	value="true">

        <!--������ȯ�� �ݺ����� ���ܿ� �������� -->
<param name="export.path"							value="C:\\temp\\ChosunCRM">
<param name="export.filename"						value="�߼�����_<%=sysDate%>.xls">
<param name="excel.removerange"					value="1,2">
<param name="excel.exceptfirstpage"				value="true">
        <!--������ȯ ����-->
</OBJECT>



