<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1821_t.jsp
* ���     : �߼�-���ʽ��Ϲ߼� �߼�Ȯ�� �� ��ƼĿ ���
* �ۼ����� : 2004-02-27
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
    String incmgpers = Util.getSessionParameterValue(request, "uid", true); //�α��λ����
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
	String flag   =  Util.checkString(request.getParameter("flag"));

	if(flag.equals("STICKER")) {
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"         				value="<%=ozServerIP%>">
<param name="connection.reportname"      				value="SP_PS_P_SEND_BNSBK_STICKER.ozr">
<param name="odi.odinames"               				value="SP_PS_P_SEND_BNSBK_STICKER">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.pcount"	value="5">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args2" 	value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args3" 	value="senddt=<%=request.getParameter("slt_senddt")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args4" 	value="asinbocd=<%=request.getParameter("slt_asinbocd")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args5" 	value="sendmthd=<%=request.getParameter("slt_sendmthd")%>">
<param name="applet.configmode"          				value="html">
<param name="applet.isframe"             				value="true">
<param name="applet.mode"                				value="preview">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                				value="C:\\temp\\ChosunCRM">
<param name="export.filename"            				value="���ʽ��߼۽�ƼĿ���<%=sysDate%>.xls">
<param name="excel.removerange"          				value="1,3">
<param name="excel.exceptfirstpage"      				value="true">
        <!--������ȯ ����-->
</OBJECT>
<%
	} else {
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"         				value="<%=ozServerIP%>">
<param name="connection.reportname"      				value="SP_PS_P_SEND_BNSBK_LIST.ozr">
<param name="odi.odinames"               				value="SP_PS_P_SEND_BNSBK_STICKER">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.pcount" 	value="5">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args1"  	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args2"  	value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args3"  	value="senddt=<%=request.getParameter("slt_senddt")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args4"  	value="asinbocd=<%=request.getParameter("slt_asinbocd")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args5"  	value="sendmthd=<%=request.getParameter("slt_sendmthd")%>">

<param name="connection.fetchtype"						value="concurrent">
<param name="connection.pageque"						value="1">
<param name="viewer.mode"								value="print">
<param name="print.printbypage"						value="true">
<param name="applet.smartframesize"           			value="true">

<param name="applet.configmode"						value="html">
<param name="applet.isframe"							value="true">
<param name="applet.mode"								value="preview">

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                				value="C:\temp\ChosunCRM">
<param name="export.filename"            				value="���ʽ��߼۸���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"          				value="1,2">
<param name="excel.exceptfirstpage"      				value="true">
        <!--������ȯ ����-->
</OBJECT>

<%
	}
%>
