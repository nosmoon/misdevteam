<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_sppt_1221_t.jsp
* ���     : �����ϸ���Ʈ ���
* �ۼ����� : 2003-12-27
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
    String bocd      = Util.getSessionParameterValue(request, "cmpycd", true);          //���������ڵ�

    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"           value="<%=ozServerIP%>">
<param name="connection.reportname"        value="SP_PS_P_DSCT_CATL.ozr">
<param name="odi.odinames"                 value="SP_PS_P_DSCT_CATL">
<param name="odi.SP_PS_P_DSCT_CATL.pcount"	value="6">
<param name="odi.SP_PS_P_DSCT_CATL.args1" 	value="bocd=<%=bocd%>">
<param name="odi.SP_PS_P_DSCT_CATL.args2" 	value="kubun=<%=request.getParameter("kubun")%>">
<param name="odi.SP_PS_P_DSCT_CATL.args3" 	value="datefrom=<%=request.getParameter("datefrom")%>">
<param name="odi.SP_PS_P_DSCT_CATL.args4" 	value="dateto=<%=request.getParameter("dateto")%>">
<param name="odi.SP_PS_P_DSCT_CATL.args5" 	value="dscttypecd=<%=request.getParameter("dscttypecd")%>">
<param name="odi.SP_PS_P_DSCT_CATL.args6" 	value="boprocyn=<%=request.getParameter("boprocyn")%>">
<param name="applet.configmode"            value="html">
<param name="applet.isframe"               value="true">
<param name="applet.mode"                  value="preview">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                  value="C:\\temp\\ChosunCRM">
<param name="export.filename"              value="�����ϸ���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"            value="1,3">
<param name="excel.exceptfirstpage"        value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
</OBJECT>



