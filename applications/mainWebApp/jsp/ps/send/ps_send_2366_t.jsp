<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2366_t.jsp
* ��� : ��ü�ϰ��߼� ��ƼĿ
* �ۼ����� : 2007-06-21
* �ۼ��� : ����ǥ
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
<param name="connection.reportname"					value="SP_PS_P_BO_SEND_LIST_A4.ozr">
<param name="odi.odinames"								value="SP_PS_P_BO_SEND_LIST">
<param name="odi.SP_PS_P_BO_SEND_LIST.pcount"	    	value="8">
<param name="odi.SP_PS_P_BO_SEND_LIST.args1"	    	value="cmpycd=<%=Util.checkString(request.getParameter("cmpycd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args2"	    	value="mediser_no=<%=Util.checkString(request.getParameter("mediser_no"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args3"	    	value="senddt=<%=Util.checkString(request.getParameter("senddt"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args4"	    	value="medicd=<%=Util.checkString(request.getParameter("medicd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args5"	    	value="deptcd=<%=Util.checkString(request.getParameter("deptcd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args6"	    	value="areacd=<%=Util.checkString(request.getParameter("areacd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args7"	    	value="bocd=<%=Util.checkString(request.getParameter("corrbocd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args8"	    	value="rdr_no=<%=Util.checkString(request.getParameter("rdr_no"))%>">
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



