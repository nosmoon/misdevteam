<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%--------------------------------------------------------------------------------------------------
* ���ϸ�   : pb_alon_1821_t.jsp
* ���     : ��������� �������� ���
* �ۼ����� : 2004-01-28
* �ۼ���   : ����
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
--------------------------------------------------------------------------------------------------%>

<%
    //����� ��������
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //ȸ���ڵ�
 	String sysDate = Util.getDate();	// ����ȭ�� ����� �����̸����� ���
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //�Է��ھ��̵�
%>
<OBJECT width="800" height="800" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"                   value="<%=ozServerIP%>">
<param name="connection.reportname"                value="SP_PS_P_DEPTEMP_ALON_PTCR.ozr">
<param name="odi.odinames"                         value="SP_PS_P_DEPTEMP_ALON_PTCR">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.pcount" value="5">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args1"  value="iv_cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args2"  value="iv_incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args3"  value="iv_closmm=<%=request.getParameter("closmm")%>">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args4"  value="iv_bocd=<%=request.getParameter("bocd")%>">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args5"  value="iv_deptcd=<%=request.getParameter("deptcd")%>">
<param name="applet.configmode"                    value="html">
<param name="applet.isframe"                       value="true">
<param name="applet.mode"                          value="preview">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"					value="C:\\temp\\ChosunCRM">
<param name="export.filename"				value="�����������������_<%=sysDate%>.xls">
<param name="excel.removerange"			value="1,3">
<param name="excel.exceptfirstpage"		value="true">
        <!--������ȯ ����-->
</OBJECT>
