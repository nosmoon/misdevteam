<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%@ page contentType="text/html; charset=KSC5601" %>
<%--------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_bill_1426_t.jsp
* ���     : �ʰ��Ա� ó������ �μ�
* �ۼ����� : 2004-01-29
* �ۼ���   : ���ȣ
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
--------------------------------------------------------------------------------------------------%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet" 				value="<%=ozServerIP%>">
<param name="connection.reportname" 			value="SP_PS_P_EXCSRCPMPROC.ozr">
<param name="odi.odinames" 					value="SP_PS_P_EXCSRCPMPROC">
<param name="odi.SP_PS_P_EXCSRCPMPROC.pcount" 	value="5">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args1" 	value="iv_bocd=<%=request.getParameter("slt_bocd")%>">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args2" 	value="iv_subsyy=<%=request.getParameter("subsyy")%>">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args3" 	value="iv_procyn=<%=request.getParameter("excsrcpmporcyn")%>">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args4" 	value="iv_procdtbgn=<%=request.getParameter("procdtbgn")%>">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args5" 	value="iv_procdtend=<%=request.getParameter("procdtend")%>">
<param name="applet.configmode" 				value="html">
<param name="applet.isframe" 					value="true">
<param name="applet.mode" 						value="preview">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="�ʰ��Ա� ó������_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--������ȯ ����-->
</OBJECT>
