<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�    : ad_com_1450_p.jsp
* ���       : ����Ȯ�α�����Ʈ  ���
* �ۼ����� : 2009-02-06
* �ۼ���    : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������    :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //����� ��������
//    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�
	String cmpy_cd = "312";
	String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>

paramTag[paramTag.length] = '<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">';
paramTag[paramTag.length] = '<param name="connection.servlet"				value="<%=ozServerIP%>">';
paramTag[paramTag.length] = '<param name="connection.reportname"			value="SP_AD_COM_1450_P.ozr">';
paramTag[paramTag.length] = '<param name="odi.odinames"						value="SP_AD_COM_1450_P">';
paramTag[paramTag.length] = '<param name="odi.SP_AD_COM_1440_P.pcount"		value="2">';
paramTag[paramTag.length] = '<param name="odi.SP_AD_COM_1440_P.args1"		value="cmpy_cd=<%=cmpy_cd%>">';
paramTag[paramTag.length] = '<param name="odi.SP_AD_COM_1440_P.args2"		value="search_dt=<%=request.getParameter("search_dt")%>">';
paramTag[paramTag.length] = '<param name="appleconfigmode"					value="html">';
paramTag[paramTag.length] = '<param name="applet.isframe"					value="true">';
paramTag[paramTag.length] = '<param name="applet.isframemode"				value="preview">';

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
paramTag[paramTag.length] = '<param name="export.path"						value="C:\\temp\\CIIS">';
paramTag[paramTag.length] = '<param name="export.filename"					value="����Ȯ�α�����Ʈ_<%=sysDate%>.xls">';
paramTag[paramTag.length] = '<param name="excel.removerange"				value="1,3">';
paramTag[paramTag.length] = '<param name="excel.exceptfirstpage"			value="true">';
        <!--������ȯ ����-->
paramTag[paramTag.length] = '</OBJECT>';

oz_activex_build(paramTag);
</script>