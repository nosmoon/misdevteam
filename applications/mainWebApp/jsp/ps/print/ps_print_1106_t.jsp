<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_print_1106_t.jsp
* ���     : �����μ���Ȳ
* �ۼ����� : 2008-02-12
* �ۼ���   : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd    = Util.getSessionParameterValue(request, "cmpycd", true);        //���������ڵ�
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //�Է��ھ��̵�
    String sysDate   = Util.getDate(); // ����ȭ�� ����� �����̸����� ���

%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"              		value="<%=ozServerIP%>">
<param name="connection.reportname"           		value="SP_PS_P_SEND_JD_CAL.ozr">
<param name="odi.odinames"                    		value="SP_PS_P_SEND_JD_CAL">
<param name="odi.SP_PS_P_SEND_JD_CAL.pcount"		value="5">
<param name="odi.SP_PS_P_SEND_JD_CAL.args1" 		value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_JD_CAL.args2" 		value="medicd=<%=Util.checkString(request.getParameter("JD_CAL_medicd"))%>">
<param name="odi.SP_PS_P_SEND_JD_CAL.args3" 		value="send_from=<%=Util.checkString(request.getParameter("JD_CAL_send_from"))%>">
<param name="odi.SP_PS_P_SEND_JD_CAL.args4" 		value="send_to=<%=Util.checkString(request.getParameter("JD_CAL_send_to"))%>">
<param name="odi.SP_PS_P_SEND_JD_CAL.args5" 		value="asinbocd=<%=Util.checkString(request.getParameter("JD_CAL_asinbocd"))%>">
<param name="applet.configmode"               		value="html">
<param name="applet.isframe"                  		value="true">
<param name="applet.mode"                     		value="preview">
<param name="applet.smartframesize"           		value="true">
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                     		value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 		value="�����μ���Ȳ_<%=sysDate%>.xls">
<param name="excel.removerange"               		value="0,0">
<param name="excel.exceptfirstpage"           		value="true">
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->

</OBJECT>
