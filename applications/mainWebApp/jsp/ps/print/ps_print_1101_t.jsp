<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : pb_print_1101_t.jsp
* ���     : ���纰 ����/���� ���
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
    String procyymm = Util.checkString(request.getParameter("PROCYYMM"));           //�Է��ھ��̵�
    String sysDate   = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
	<param name="connection.servlet"              value="<%=ozServerIP%>">
	<param name="connection.reportname"           value="SP_PS_P_PROC_SUSP.ozr">
	<param name="odi.odinames"                    value="SP_PS_P_PROC_SUSP">
	<param name="odi.SP_PS_P_PROC_SUSP.pcount"    value="2">
	<param name="odi.SP_PS_P_PROC_SUSP.args1"     value="cmpycd=<%=cmpycd%>">
	<param name="odi.SP_PS_P_PROC_SUSP.args2"     value="procyymm=<%=procyymm%>">
	<param name="applet.configmode"               value="html">
	<param name="applet.isframe"                  value="true">
	<param name="applet.mode"                     value="preview">
	<param name="applet.smartframesize"           value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
	<param name="export.path"                     value="C:\\temp\\ChosunCRM">
	<param name="export.filename"                 value="���纰 ����/����_<%=sysDate%>.xls">
	<param name="excel.removerange"               value="1,2">
	<param name="excel.exceptfirstpage"           value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
</OBJECT>