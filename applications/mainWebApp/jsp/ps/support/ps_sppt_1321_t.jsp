<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_sppt_1321_t.jsp
* ���     : �̻��û����Ʈ ���
* �ۼ����� : 2005-02-15
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
    String bocd      = Util.getSessionParameterValue(request, "cmpycd", true);          //���������ڵ�

    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"           value="<%=ozServerIP%>">
<param name="connection.reportname"        value="SP_PS_P_MOVM_RDR.ozr">
<param name="odi.odinames"                 value="SP_PS_P_MOVM_RDR">
<param name="odi.SP_PS_P_MOVM_RDR.pcount"  value="6">
<param name="odi.SP_PS_P_MOVM_RDR.args1"   value="bocd=<%=bocd%>">
<param name="odi.SP_PS_P_MOVM_RDR.args2"   value="rdrnm=<%=Util.Uni2Ksc(Util.checkString(request.getParameter("rdrnm")))%>">
<param name="odi.SP_PS_P_MOVM_RDR.args3"   value="regdt_fr=<%=request.getParameter("regdt_fr")%>">
<param name="odi.SP_PS_P_MOVM_RDR.args4"   value="regdt_to=<%=request.getParameter("regdt_to")%>">
<param name="odi.SP_PS_P_MOVM_RDR.args5"   value="boprocyn=<%=request.getParameter("boprocyn")%>">
<param name="odi.SP_PS_P_MOVM_RDR.args6"   value="acptbocnfmyn=<%=request.getParameter("acptbocnfmyn")%>">
<param name="applet.configmode"            value="html">
<param name="applet.isframe"               value="true">
<param name="applet.mode"                  value="preview">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                  value="C:\\temp\\ChosunCRM">
<param name="export.filename"              value="�̻��û����Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"            value="1,3">
<param name="excel.exceptfirstpage"        value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
</OBJECT>



