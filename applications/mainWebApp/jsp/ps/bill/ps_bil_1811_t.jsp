<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1811_t.jsp
* ���   : ����-�ڵ���üû��Ȯ�θ��-�μ�
* �ۼ����� : 2006-04-18
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", true);
    //String bonm = getCookieParameterValue(request, "BONM", true);

    String bocd = Util.checkString(request.getParameter("bocd"));
    String uid = Util.getSessionParameterValue(request, "uid", true);
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>

<OBJECT width = "1300" height = "800" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet" 					value="<%=ozServerIP%>">
<param name="connection.reportname" 				value="SP_PS_P_SHFT_CLAM_PLAN.ozr">
<param name="odi.odinames" 						value="SP_PS_P_SHFT_CLAM_PLAN">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.pcount"	value="6">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args2" 	value="bocd=<%=bocd%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args3" 	value="sechcond=<%=request.getParameter("sechcond")%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args4" 	value="sechcont=<%=Util.Uni2Ksc(request.getParameter("sechcont"))%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args5" 	value="rcpmmthd=<%=request.getParameter("rcpmmthd")%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args6" 	value="clammthd=<%=request.getParameter("clammthd")%>">
<param name="applet.configmode"				    value="html">
<param name="applet.isframe"					    value="true">
<param name="applet.mode"						    value="preview">
<param name="applet.smartframesize"                value="true">
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"						    value="C:\\temp\\ChosunCRM">
<param name="export.filename"					    value="�ڵ���üû��Ȯ�θ��_<%=sysDate%>.xls">
<param name="excel.removerange"				    value="1,3">
<param name="excel.exceptfirstpage"			    value="true">
</OBJECT>
