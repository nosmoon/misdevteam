<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_send_1216_t.jsp
* ��� : ��ü�ϰ��߼� ����Ʈ
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
    //����� �������� (������)
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�
    //String incmgpers = Util.getSessionParameterValue(request, "uid", true); //�α��λ����
	String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"						value="<%=ozServerIP%>">
<param name="connection.reportname"					value="SP_PS_P_BO_SEND_ADJM_LIST.ozr">
<param name="odi.odinames"								value="SP_PS_P_BO_SEND_ADJM_LIST">
<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.pcount"	    value="6">
<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args1"	    value="cmpycd=<%=request.getParameter("cmpycd")%>">
<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args2"	    value="closyymm=<%=request.getParameter("senddt")%>">
<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args3"	    value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args4"	    value="deptcd=<%=request.getParameter("deptcd")%>">
<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args5"	    value="areacd=<%=request.getParameter("areacd")%>">
<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args6"	    value="bocd=<%=request.getParameter("corrbocd")%>">
<param name="appleconfigmode"							value="html">
<param name="applet.isframe"							value="true">
<param name="applet.isframemode"						value="preview">
        <!--�̸����� ȭ�������-->
<param name="applet.framewidth"               			value="900">
<param name="applet.frameheight"              			value="720">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"								value="C:\\temp\\ChosunCRM">
<param name="export.filename"							value="�����߼۸���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"						value="1,3">
<param name="excel.exceptfirstpage"					value="true">
        <!--������ȯ ����-->
</OBJECT>



