<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%@ page contentType="text/html; charset=KSC5601" %>
<%--------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_print_1105_t.jsp
* ���     : �߼��ܿ��μ�
* �ۼ����� : 2004-07-24
* �ۼ���   : ����ǥ
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
--------------------------------------------------------------------------------------------------%>

<%
    //����� ��������
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //���������ڵ�
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //�Է��ھ��̵�

    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"           value="<%=ozServerIP%>">
<param name="connection.reportname"        value="SP_PS_P_SEND_REST.ozr">
<param name="odi.odinames"                 value="SP_PS_P_SEND_REST">
<param name="odi.SP_PS_P_SEND_REST.pcount" value="7">
<param name="odi.SP_PS_P_SEND_REST.args1" 	value="bocd=<%=Util.checkString(request.getParameter("SEND_REST_bocd"))%>">
<param name="odi.SP_PS_P_SEND_REST.args2"	value="medicd=<%=Util.checkString(request.getParameter("SEND_REST_medicd"))%>">
<param name="odi.SP_PS_P_SEND_REST.args3" 	value="substoser_no_m=<%=Util.checkString(request.getParameter("SEND_REST_M"))%>">
<param name="odi.SP_PS_P_SEND_REST.args4" 	value="substoser_no_w=<%=Util.checkString(request.getParameter("SEND_REST_W"))%>">
<param name="odi.SP_PS_P_SEND_REST.args5" 	value="aplcdt_fr=<%=Util.checkString(request.getParameter("SEND_APLCDT_FR"))%>">
<param name="odi.SP_PS_P_SEND_REST.args6" 	value="aplcdt_to=<%=Util.checkString(request.getParameter("SEND_APLCDT_TO"))%>">
<param name="odi.SP_PS_P_SEND_REST.args7" 	value="cmpycd=<%=cmpycd%>">

<param name="connection.fetchtype"			value="concurrent">
<param name="connection.pageque"			value="1">
<param name="applet.smartframesize"        value="true">
<param name="applet.configmode" 			value="html">
<param name="applet.isframe" 				value="true">
<param name="applet.mode" 					value="preview">
<param name="print.printbypage"			value="true">

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"					value="C:\\temp\\ChosunCRM">
<param name="export.filename"				value="�߼��ܿ��μ�<%=sysDate%>.xls">
<param name="excel.removerange"			value="1,1">
<param name="excel.exceptfirstpage"		value="true">
        <!--������ȯ ����-->
</OBJECT>

