<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1916_t.jsp
* ��� : ��ü�ϰ��߼� ����Ʈ
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
    //����� �������� (������)
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�
    //String incmgpers = Util.getSessionParameterValue(request, "uid", true); //�α��λ����
	String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>

paramTag[paramTag.length] = '<OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">';
paramTag[paramTag.length] = '<param name="connection.servlet"						value="<%=ozServerIP%>">';
paramTag[paramTag.length] = '<param name="connection.reportname"					value="SP_PS_P_BO_SEND_ADJM_LIST.ozr">';
paramTag[paramTag.length] = '<param name="odi.odinames"								value="SP_PS_P_BO_SEND_ADJM_LIST">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.pcount"	    value="6">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args1"	    value="cmpycd=<%=request.getParameter("cmpycd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args2"	    value="closyymm=<%=request.getParameter("senddt")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args3"	    value="medicd=<%=request.getParameter("medicd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args4"	    value="deptcd=<%=request.getParameter("deptcd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args5"	    value="areacd=<%=request.getParameter("areacd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args6"	    value="bocd=<%=request.getParameter("corrbocd")%>">';
paramTag[paramTag.length] = '<param name="appleconfigmode"							value="html">';
paramTag[paramTag.length] = '<param name="applet.isframe"							value="true">';
paramTag[paramTag.length] = '<param name="applet.isframemode"						value="preview">';
        <!--�̸����� ȭ�������-->
paramTag[paramTag.length] = '<param name="applet.framewidth"               			value="900">';
paramTag[paramTag.length] = '<param name="applet.frameheight"              			value="720">';
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
paramTag[paramTag.length] = '<param name="export.path"								value="C:\\temp\\ChosunCRM">';
paramTag[paramTag.length] = '<param name="export.filename"							value="�����߼۸���Ʈ_<%=sysDate%>.xls">';
paramTag[paramTag.length] = '<param name="excel.removerange"						value="1,3">';
paramTag[paramTag.length] = '<param name="excel.exceptfirstpage"					value="true">';
        <!--������ȯ ����-->
paramTag[paramTag.length] = '</OBJECT>';

oz_activex_build(paramTag);
</script>
