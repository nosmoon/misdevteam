<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1216_t.jsp
* ��� : �ϰ��Ա� ���� ���
* �ۼ����� : 2004-01-26
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	String sysDate = Util.getDate();	// ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"						value="<%=ozServerIP%>">
<param name="connection.reportname"					value="SP_PS_P_BILL_TACOD_GRRCPCM.ozr">
<param name="odi.odinames"								value="SP_PS_P_BILL_TACOD_GRRCPCM">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.pcount"	value="4">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.args1"		value="bocd=<%=request.getParameter("bocd")%>">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.args2"		value="acqdt=<%=request.getParameter("acqdt")%>">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.args3"		value="acqno=<%=request.getParameter("acqno")%>">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.args4"		value="girono=<%=request.getParameter("girono")%>">
<param name="applet.configmode"						value="html">
<param name="applet.isframe"							value="true">
<param name="applet.mode"								value="preview">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"								value="C:\temp\ChosunCRM">
<param name="export.filename"							value="�ϰ��Աݸ���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"						value="1,3">
<param name="excel.exceptfirstpage"					value="true">
        <!--������ȯ ����-->
</OBJECT>
