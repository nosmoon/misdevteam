<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_send_1616_t.jsp
* ��� : ��ü�߰��߼� ����Ʈ
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
    //String incmgpers = Util.getSessionParameterValue(request, "uid", true); //�α��λ����
	String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"						value="<%=ozServerIP%>">
<param name="connection.reportname"					value="SP_PS_P_SEND_ADDM_PROC_DTLS.ozr">
<param name="odi.odinames"								value="SP_PS_P_SEND_ADDM_PROC_DTLS">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.pcount"	value="9">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.args1"	value="senddt=<%=request.getParameter("brchdt")%>">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.args2"	value="bocd=<%=request.getParameter("cnfmbrchcd")%>">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.args3"	value="mediser_no=<%=request.getParameter("mediser_no")%>">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.args4"	value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.args5"	value="sendkindcd=<%=request.getParameter("sendkindcd")%>">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.args6"	value="sendmthdcd=<%=request.getParameter("sendmthdcd")%>">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.args7"	value="bocdnm=<%=Util.Uni2Ksc(Util.checkString(request.getParameter("cnfmbrch")))%>">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.args8"	value="medinm=<%=Util.Uni2Ksc(Util.checkString(request.getParameter("medinm")))%>">
<param name="odi.SP_PS_P_SEND_ADDM_PROC_DTLS.args9"	value="cmpycd=<%=cmpycd%>">
<param name="appleconfigmode"							value="html">
<param name="applet.isframe"							value="true">
<param name="applet.isframemode"						value="preview">
        <!--�̸����� ȭ�������-->
<param name="applet.framewidth"               			value="900">
<param name="applet.frameheight"              			value="720">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"								value="C:\\temp\\ChosunCRM">
<param name="export.filename"							value="�߰��߼۸���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"						value="1,3">
<param name="excel.exceptfirstpage"					value="true">
        <!--������ȯ ����-->
</OBJECT>
