<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_sppt_1411_t.jsp
* ��� : ���ݿ����� ���
* �ۼ����� : 2004-06-10
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
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //���������ڵ�
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //�Է��ھ��̵�

	String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				value="<%=ozServerIP%>">
<param name="connection.reportname"			value="SP_PS_P_CASHRCPT.ozr">
<param name="odi.odinames"						value="SP_PS_P_CASHRCPT">
<param name="odi.SP_PS_P_CASHRCPT.pcount"		value="7">
<param name="odi.SP_PS_P_CASHRCPT.args1"		value="bocd=<%=request.getParameter("bocd")%>">
<param name="odi.SP_PS_P_CASHRCPT.args2"		value="cashrcpt_dtbgn=<%=request.getParameter("cashrcpt_dtbgn")%>">
<param name="odi.SP_PS_P_CASHRCPT.args3"		value="cashrcpt_dtend=<%=request.getParameter("cashrcpt_dtend")%>">
<param name="odi.SP_PS_P_CASHRCPT.args4"		value="selpubclsf=<%=request.getParameter("selpubclsf")%>">
<param name="odi.SP_PS_P_CASHRCPT.args5"		value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_CASHRCPT.args6"		value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_CASHRCPT.args7"		value="rcptclsf=<%=request.getParameter("rcptclsf")%>">
<param name="applet.configmode"				value="html">
<param name="applet.isframe"					value="true">
<param name="applet.mode"						value="preview">

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="���ݿ�����_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--������ȯ ����-->
</OBJECT>



