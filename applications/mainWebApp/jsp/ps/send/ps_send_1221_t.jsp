<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_send_1221_t.jsp
* ��� : ��ü�ϰ��߼� ��ƼĿ ���
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

	if(flag.equals("STICKER")) {
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"					value="<%=ozServerIP%>">
<param name="connection.reportname"				value="SP_PS_P_SEND_LUMP_STICKER.ozr">
<param name="odi.odinames"							value="SP_PS_P_SEND_LUMP_STICKER">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.pcount"	value="7">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args1"	value="senddt=<%=request.getParameter("senddt")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args2"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args3"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args4"	value="mediser_no=<%=request.getParameter("mediser_no")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args5"	value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args6"	value="sendkindcd=<%=request.getParameter("sendkindcd")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args7"	value="sendmthdcd=<%=request.getParameter("sendmthdcd")%>">

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



<%
	} else {
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"					value="<%=ozServerIP%>">
<param name="connection.reportname"				value="SP_PS_P_SEND_LUMP_LIST.ozr">
<param name="odi.odinames"							value="SP_PS_P_SEND_LUMP_STICKER">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.pcount"	value="7">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args1"	value="senddt=<%=request.getParameter("senddt")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args2"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args3"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args4"	value="mediser_no=<%=request.getParameter("mediser_no")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args5"	value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args6"	value="sendkindcd=<%=request.getParameter("sendkindcd")%>">
<param name="odi.SP_PS_P_SEND_LUMP_STICKER.args7"	value="sendmthdcd=<%=request.getParameter("sendmthdcd")%>">

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
<param name="export.filename"						value="�ϰ��߼۸���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"					value="1,2">
<param name="excel.exceptfirstpage"				value="true">
        <!--������ȯ ����-->
</OBJECT>



<%
	}
%>
