<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1811_t.jsp
* ���     : ������ȸ ����Ʈ ���
* �ۼ����� : 2006-01-23
* �ۼ���   : ����ǥ
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
<param name="connection.servlet"              value="<%=ozServerIP%>">
<param name="connection.reportname"           value="SP_PS_P_RDR_PUBL_ETC.ozr">
<param name="odi.odinames"                    value="SP_PS_P_RDR_PUBL_ETC">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.pcount" value="17">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args1"  value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args2"  value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args3"  value="aplcdtfr=<%=request.getParameter("aplcdtfr")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args4"  value="aplcdtto=<%=request.getParameter("aplcdtto")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args5"  value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args6" value="rdr_no=<%=request.getParameter("rdr_no")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args7"  value="rdrnm=<%=Util.Uni2Ksc(request.getParameter("rdrnm"))%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args8"  value="asinbocd=<%=request.getParameter("asinbocd")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args9"  value="prn1=<%=request.getParameter("prn1")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args10"  value="prn2=<%=request.getParameter("prn2")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args11" value="tel_kubun=<%=request.getParameter("tel_kubun")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args12" value="rdrtel_no1=<%=request.getParameter("rdrtel_no1")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args13" value="rdrtel_no2=<%=request.getParameter("rdrtel_no2")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args14" value="rdrtel_no3=<%=request.getParameter("rdrtel_no3")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args15" value="addr=<%=Util.Uni2Ksc(request.getParameter("addr"))%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args16" value="email=<%=request.getParameter("email")%>">
<param name="odi.SP_PS_P_RDR_PUBL_ETC.args17" value="flnm_yn=<%=request.getParameter("flnm_yn")%>">
<param name="applet.configmode"               value="html">
<param name="applet.isframe"                  value="true">
<param name="applet.mode"                     value="preview">
        <!--�̸����� ȭ�������-->
<param name="applet.framewidth"               value="900">
<param name="applet.frameheight"              value="720">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                     value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 value="������ȸ����Ʈ���<%=sysDate%>.xls">
<param name="excel.removerange"               value="1,3">
<param name="excel.exceptfirstpage"           value="true">
        <!--������ȯ ����-->
</OBJECT>