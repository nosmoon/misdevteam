<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1816_t.jsp
* ���     : �߼�-���ʽ��Ϲ߼� �߼�Ȯ�� �� ����Ʈ ���
* �ۼ����� : 2004-02-27
* �ۼ���   : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
---------------------------------------------------------------------------------------------------%>
<%
    //����� ��������
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�
    String incmgpers = Util.getSessionParameterValue(request, "uid", true); //�α��λ����
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">

<param name="connection.servlet"         			value="<%=ozServerIP%>">
<param name="connection.reportname"      			value="SP_PS_P_SEND_BNSBK_CON.ozr">
<param name="odi.odinames"               			value="SP_PS_P_SEND_BNSBK_CON">
<param name="odi.SP_PS_P_SEND_BNSBK_CON.pcount"	value="5">
<param name="odi.SP_PS_P_SEND_BNSBK_CON.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_BNSBK_CON.args2" 	value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_SEND_BNSBK_CON.args3" 	value="senddt=<%=request.getParameter("senddt")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_CON.args4" 	value="asinbocd=<%=request.getParameter("asinbocd")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_CON.args5" 	value="sendmthd=<%=request.getParameter("sendmthd")%>">
<param name="applet.configmode"         			value="html">
<param name="applet.isframe"            			value="true">
<param name="applet.mode"               			value="preview">
        <!--�̸����� ȭ�������-->
<param name="applet.framewidth"               		value="900">
<param name="applet.frameheight"              		value="720">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                			value="C:\\temp\\ChosunCRM">
<param name="export.filename"            			value="���ʽ��߼۸���Ʈ���<%=sysDate%>.xls">
<param name="excel.removerange"          			value="1,3">
<param name="excel.exceptfirstpage"      			value="true">
        <!--������ȯ ����-->
</OBJECT>

