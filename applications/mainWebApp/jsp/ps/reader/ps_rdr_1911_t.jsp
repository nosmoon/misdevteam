<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1911_t.jsp
* ���     : �����Է¸�� ���
* �ۼ����� : 2008-07-14
* �ۼ���   : ������
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
<param name="connection.reportname"     			value="SP_PS_P_TODAYINPUT_RDR.ozr">
<param name="odi.odinames"               			value="SP_PS_P_TODAYINPUT_RDR">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.pcount"	value="5">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args2" 	value="input_fromdt=<%=request.getParameter("input_fromdt")%>">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args3" 	value="input_todt=<%=request.getParameter("input_todt")%>">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args4" 	value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args5" 	value="asinbocd=<%=request.getParameter("asinbocd")%>">
<param name="applet.configmode"          			value="html">
<param name="applet.isframe"             			value="true">
<param name="applet.mode"                			value="preview">
        <!--�̸����� ȭ�������-->
<param name="applet.framewidth"               		value="900">
<param name="applet.frameheight"              		value="720">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                			value="C:\\temp\\ChosunCRM">
<param name="export.filename"            			value="�����Է¸��<%=sysDate%>.xls">
<param name="excel.removerange"          			value="1,3">
<param name="excel.exceptfirstpage"      			value="true">
        <!--������ȯ ����-->
</OBJECT>
