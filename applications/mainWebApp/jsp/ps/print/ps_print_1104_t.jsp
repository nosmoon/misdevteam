<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_print_1104_t.jsp
* ���     : ������ ��޺� ��� ���
* �ۼ����� : 2007-03-26
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

%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"              		value="<%=ozServerIP%>">
<param name="connection.reportname"           		value="SP_PS_P_BO_SEND_ADJM.ozr">
<param name="odi.odinames"                    		value="SP_PS_P_BO_SEND_ADJM">
<param name="odi.SP_PS_P_BO_SEND_ADJM.pcount"		value="3">
<param name="odi.SP_PS_P_BO_SEND_ADJM.args1" 		value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_BO_SEND_ADJM.args2" 		value="closyymm=<%=Util.checkString(request.getParameter("BO_SEND_ADJM_closyymm"))%>">
<param name="odi.SP_PS_P_BO_SEND_ADJM.args3" 		value="medicd=<%=Util.checkString(request.getParameter("BO_SEND_ADJM_medicd"))%>">
<param name="applet.configmode"               		value="html">
<param name="applet.isframe"                  		value="true">
<param name="applet.mode"                     		value="preview">
<param name="applet.smartframesize"           		value="true">
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                     		value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 		value="��������޺���_<%=sysDate%>.xls">
<param name="excel.removerange"               		value="0,0">
<param name="excel.exceptfirstpage"           		value="true">
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->

</OBJECT>
