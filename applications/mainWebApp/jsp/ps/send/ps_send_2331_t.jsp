<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_send_2331_t.jsp
* ��� : �������߼� �� ���
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
	String flag   =  Util.checkString(request.getParameter("flag"));
	String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"					value="<%=ozServerIP%>">
<param name="connection.reportname"				value="SP_PS_P_BOSEND_LUMP.ozr">
<param name="odi.odinames"							value="SP_PS_P_BOSEND_LUMP">
<param name="odi.SP_PS_P_BOSEND_LUMP.pcount"	    value="3">
<param name="odi.SP_PS_P_BOSEND_LUMP.args1"	    value="acq_bocd=<%=request.getParameter("bocd")%>">
<param name="odi.SP_PS_P_BOSEND_LUMP.args2"	    value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_BOSEND_LUMP.args3"	    value="mediser_no=<%=request.getParameter("mediser_no")%>">

<param name="connection.fetchtype"					value="concurrent">
<param name="connection.pageque"					value="1">
<param name="viewer.mode"							value="print">
<param name="print.printbypage"					value="true">
<param name="applet.smartframesize"           		value="true">

<param name="applet.configmode"					value="html">
<param name="applet.isframe"						value="true">
<param name="applet.mode"							value="preview">

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"							value="C:\\temp\\ChosunCRM">
<param name="export.filename"						value="�ϰ��߼۽�ƼĿ_<%=sysDate%>.xls">
<param name="excel.removerange"					value="1,2">
<param name="excel.exceptfirstpage"				value="true">
        <!--������ȯ ����-->

</OBJECT>



