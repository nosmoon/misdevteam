<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1126_t.jsp
* ��� : ���� �Ա� ����Ʈ ���
* �ۼ����� : 2004-03-26
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
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //ȸ���ڵ�
 	String sysDate = Util.getDate();	// ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"			value="<%=ozServerIP%>">
<param name="connection.reportname"		value="SP_PS_P_BILL_SEPR.ozr">
<param name="odi.odinames"					value="SP_PS_P_BILL_SEPR">
<param name="odi.SP_PS_P_BILL_SEPR.pcount"	value="5">
<param name="odi.SP_PS_P_BILL_SEPR.args1"	value="bocd=<%=request.getParameter("slt_bocd")%>">
<param name="odi.SP_PS_P_BILL_SEPR.args2"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_BILL_SEPR.args3"	value="proc_dd_1=<%=request.getParameter("proc_dd_1")%>">
<param name="odi.SP_PS_P_BILL_SEPR.args4"	value="proc_dd_2=<%=request.getParameter("proc_dd_2")%>">
<param name="odi.SP_PS_P_BILL_SEPR.args5"	value="rcpm_mthd=<%=request.getParameter("rcpm_mthd")%>">
<param name="applet.configmode"			value="html">
<param name="applet.isframe"				value="true">
<param name="applet.mode"					value="preview">

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"					value="C:\\temp\\ChosunCRM">
<param name="export.filename"				value="�����Աݸ���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"			value="1,3">
<param name="excel.exceptfirstpage"		value="true">
        <!--������ȯ ����-->
</OBJECT>
