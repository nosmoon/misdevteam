<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1211_t.jsp
* ���     : Ȯ�嵶�ڳ��� ���
* �ۼ����� : 2006-02-09
* �ۼ���   : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //����� ��������
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�
    String incmgpers = Util.getSessionParameterValue(request, "uid", true); //�α��λ����
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"                value="<%=ozServerIP%>">
<param name="connection.reportname"             value="SP_PS_P_RDR_EXTN.ozr">
<param name="odi.odinames"                      value="SP_PS_P_RDR_EXTN">
<param name="odi.SP_PS_P_RDR_EXTN.pcount"       value="17">
<param name="odi.SP_PS_P_RDR_EXTN.args1"        value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_RDR_EXTN.args2"        value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_RDR_EXTN.args3"        value="extndt_fr=<%=request.getParameter("sh_extndt_fr")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args4"        value="extndt_to=<%=request.getParameter("sh_extndt_to")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args5"        value="aplcpathcd=<%=request.getParameter("sh_aplcpathcd")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args6"        value="extntypecd=<%=request.getParameter("sh_extntypecd")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args7"        value="medicd=<%=request.getParameter("sh_medicd")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args8"        value="rdrnm=<%=Util.Uni2Ksc(request.getParameter("sh_rdrnm"))%>">
<param name="odi.SP_PS_P_RDR_EXTN.args9"        value="rdrprn1=<%=request.getParameter("sh_rdrprn1")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args10"       value="rdrprn2=<%=request.getParameter("sh_rdrprn2")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args11"       value="phone1=<%=request.getParameter("sh_phone1")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args12"       value="phone2=<%=request.getParameter("sh_phone2")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args13"       value="phone3=<%=request.getParameter("sh_phone3")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args14"       value="dlvaddr=<%=Util.Uni2Ksc(request.getParameter("sh_dlvaddr"))%>">
<param name="odi.SP_PS_P_RDR_EXTN.args15"       value="extnflnm=<%=Util.Uni2Ksc(request.getParameter("sh_extnflnm"))%>">
<param name="odi.SP_PS_P_RDR_EXTN.args16"       value="deliproccd=<%=request.getParameter("sh_deliproccd")%>">
<param name="odi.SP_PS_P_RDR_EXTN.args17"       value="bouseyn=<%=request.getParameter("sh_bouseyn")%>">
<param name="applet.configmode"                 value="html">
<param name="applet.isframe"                    value="true">
<param name="applet.mode"                       value="preview">
        <!--�̸����� ȭ�������-->
<param name="applet.framewidth"                 value="900">
<param name="applet.frameheight"                value="720">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                       value="C:\\temp\\ChosunCRM">
<param name="export.filename"                   value="Ȯ�嵶����ȸ����Ʈ���<%=sysDate%>.xls">
<param name="excel.removerange"                 value="1,1">
<param name="excel.exceptfirstpage"             value="true">
        <!--������ȯ ����-->
</OBJECT>
