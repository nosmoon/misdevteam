<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : pb_print_1102_t.jsp
* ���     : ���纰 ������û ��Ȳ
* �ۼ����� : 2006-02-01
* �ۼ���   : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd    = Util.getSessionParameterValue(request, "cmpycd", true);          //���������ڵ�
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //�Է��ھ��̵�
    String sysDate   = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
    String aplcdt_from = Util.checkString(request.getParameter("SELF_PCOND_APLCDT_FROM"));
    String aplcdt_to = Util.checkString(request.getParameter("SELF_PCOND_APLCDT_TO"));
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"              value="<%=ozServerIP%>">
<param name="connection.reportname"           value="SP_PS_P_SELF_PCOND.ozr">
<param name="odi.odinames"                    value="SP_PS_P_SELF_PCOND">
<param name="odi.SP_PS_P_SELF_PCOND.pcount"   value="3">
<param name="odi.SP_PS_P_SELF_PCOND.args1"    value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SELF_PCOND.args2"    value="aplcdt_from=<%=aplcdt_from%>">
<param name="odi.SP_PS_P_SELF_PCOND.args3"    value="aplcdt_to=<%=aplcdt_to%>">
<param name="applet.configmode"               value="html">
<param name="applet.isframe"                  value="true">
<param name="applet.mode"                     value="preview">
<param name="applet.smartframesize"           value="true">
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                     value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 value="���纰 ������û ��Ȳ_<%=sysDate%>.xls">
<param name="excel.removerange"               value="1,2">
<param name="excel.exceptfirstpage"           value="true">
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->
</OBJECT>