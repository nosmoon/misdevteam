<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2121_t.jsp
* ���     : �ݼ۰��� ����Ʈ ���
* �ۼ����� : 2003-02-03
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
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"                value="<%=ozServerIP%>">
<param name="connection.reportname"             value="SP_PS_P_SEND_RETN.ozr">
<param name="odi.odinames"                      value="SP_PS_P_SEND_RETN">
<param name="odi.SP_PS_P_SEND_RETN.pcount"      value="7">
<param name="odi.SP_PS_P_SEND_RETN.args1"       value="bocd=<%=request.getParameter("slt_bocd")%>">
<param name="odi.SP_PS_P_SEND_RETN.args2"       value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_RETN.args3"       value="retndt_fr=<%=request.getParameter("slt_retndt_fr")%>">
<param name="odi.SP_PS_P_SEND_RETN.args4"       value="retndt_to=<%=request.getParameter("slt_retndt_to")%>">
<param name="odi.SP_PS_P_SEND_RETN.args5"       value="retnclsf=<%=request.getParameter("slt_retnclsf")%>">
<param name="odi.SP_PS_P_SEND_RETN.args6"       value="boprocyn=<%=request.getParameter("slt_boprocyn")%>">
<param name="odi.SP_PS_P_SEND_RETN.args7"       value="acqnm=<%=Util.Uni2Ksc(Util.checkString(request.getParameter("slt_acqnm")))%>">
<param name="applet.configmode"                 value="html">
<param name="applet.isframe"                    value="true">
<param name="applet.mode"                       value="preview">
        <!--�̸����� ȭ�������-->
<param name="applet.framewidth"                 value="900">
<param name="applet.frameheight"                value="720">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                       value="C:\\temp\\ChosunCRM">
<param name="export.filename"                   value="�ݼۼ۸���Ʈ���_<%=sysDate%>.xls">
<param name="excel.removerange"                 value="1,3">
<param name="excel.exceptfirstpage"             value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
</OBJECT>
