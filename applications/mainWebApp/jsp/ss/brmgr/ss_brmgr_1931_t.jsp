<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1931_t.jsp
* ��� : �������߼� �� ���
* �ۼ����� :
* �ۼ��� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //����� ��������
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�
	String flag   =  Util.checkString(request.getParameter("flag"));
	String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>

paramTag[paramTag.length] = '<OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">';
paramTag[paramTag.length] = '<param name="connection.servlet"					value="<%=ozServerIP%>">';
paramTag[paramTag.length] = '<param name="connection.reportname"				value="SP_PS_P_BOSEND_LUMP.ozr">';
paramTag[paramTag.length] = '<param name="odi.odinames"							value="SP_PS_P_BOSEND_LUMP">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BOSEND_LUMP.pcount"	    value="3">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BOSEND_LUMP.args1"	    value="acq_bocd=<%=request.getParameter("bocd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BOSEND_LUMP.args2"	    value="medicd=<%=request.getParameter("medicd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BOSEND_LUMP.args3"	    value="mediser_no=<%=request.getParameter("mediser_no")%>">';

paramTag[paramTag.length] = '<param name="connection.fetchtype"					value="concurrent">';
paramTag[paramTag.length] = '<param name="connection.pageque"					value="1">';
paramTag[paramTag.length] = '<param name="viewer.mode"							value="print">';
paramTag[paramTag.length] = '<param name="print.printbypage"					value="true">';
paramTag[paramTag.length] = '<param name="applet.smartframesize"           		value="true">';

paramTag[paramTag.length] = '<param name="applet.configmode"					value="html">';
paramTag[paramTag.length] = '<param name="applet.isframe"						value="true">';
paramTag[paramTag.length] = '<param name="applet.mode"							value="preview">';

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
paramTag[paramTag.length] = '<param name="export.path"							value="C:\\temp\\ChosunCRM">';
paramTag[paramTag.length] = '<param name="export.filename"						value="�ϰ��߼۽�ƼĿ_<%=sysDate%>.xls">';
paramTag[paramTag.length] = '<param name="excel.removerange"					value="1,2">';
paramTag[paramTag.length] = '<param name="excel.exceptfirstpage"				value="true">';
        <!--������ȯ ����-->

paramTag[paramTag.length] = '</OBJECT>';

oz_activex_build(paramTag);
</script>
