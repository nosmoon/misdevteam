<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_print_1107_t.jsp
* ���     : Ȯ�嵶����Ȳ
* �ۼ����� : 2009-05-06
* �ۼ���   : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd    = Util.getSessionParameterValue(request, "cmpycd", true);        //���������ڵ�
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //�Է��ھ��̵�
    String sysDate   = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"              		value="<%=ozServerIP%>">
<param name="connection.reportname"           		value="SP_PS_P_RDR_EXTN_PCOND.ozr">
<param name="odi.odinames"                    		value="SP_PS_P_RDR_EXTN_PCOND">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.pcount"	value="5">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args2" 	value="rdr_extn_fr=<%=Util.checkString(request.getParameter("RDR_EXTN_fr"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args3" 	value="rdr_extn_to=<%=Util.checkString(request.getParameter("RDR_EXTN_to"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args4" 	value="medicd=<%=Util.checkString(request.getParameter("RDR_EXTN_medicd"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args5" 	value="extntypecd=<%=Util.checkString(request.getParameter("RDR_EXTN_extntypecd"))%>">
<param name="applet.configmode"               		value="html">
<param name="applet.isframe"                  		value="true">
<param name="applet.mode"                     		value="preview">
<param name="applet.smartframesize"           		value="true">
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                     		value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 		value="Ȯ�嵶����Ȳ_<%=sysDate%>.xls">
<param name="excel.removerange"               		value="0,0">
<param name="excel.exceptfirstpage"           		value="true">
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->

</OBJECT>
