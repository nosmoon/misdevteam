<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bok_1316_t.jsp
* ��� : ������ �Ա� ����Ʈ ���
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
	String sysDate = Util.getDate();	// ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				value="<%=ozServerIP%>">
<param name="connection.reportname"			value="SP_PS_P_BILL_NONRCPM.ozr">
<param name="odi.odinames" 					value="SP_PS_P_BILL_NONRCPM">
<param name="odi.SP_PS_P_BILL_NONRCPM.pcount"	value="4">
<param name="odi.SP_PS_P_BILL_NONRCPM.args1" 	value="bocd=<%=request.getParameter("slt_bocd")%>">
<param name="odi.SP_PS_P_BILL_NONRCPM.args2" 	value="acqdt_1=<%=request.getParameter("acqdt_1")%>">
<param name="odi.SP_PS_P_BILL_NONRCPM.args3" 	value="acqdt_2=<%=request.getParameter("acqdt_2")%>">
<param name="odi.SP_PS_P_BILL_NONRCPM.args4" 	value="rcpmrflyn=<%=request.getParameter("rcpmrflyn")%>">
<param name="applet.configmode"        		value="html">
<param name="applet.isframe"            		value="true">
<param name="applet.mode"               		value="preview">

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="�������Աݸ���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--������ȯ ����-->
</OBJECT>
