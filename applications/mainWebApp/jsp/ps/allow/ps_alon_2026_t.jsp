<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_alon_2026_t.jsp
* ��� : �����ޱ� �μ�
* �ۼ����� : 2006-04-06
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //����� ��������
    String bocd      = request.getParameter("bocd");          //���������ڵ�
	String sysDate = Util.getDate();	// ����ȭ�� ����� �����̸����� ���
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"			value="<%=ozServerIP%>">
<param name="connection.reportname"		value="SP_PS_P_PAYADV.ozr">
<param name="odi.odinames"					value="SP_PS_P_PAYADV">
<param name="odi.SP_PS_P_PAYADV.pcount"	value="6">
<param name="odi.SP_PS_P_PAYADV.args1"		value="bocd=<%=bocd%>">
<param name="odi.SP_PS_P_PAYADV.args2"		value="aloncd=<%=Util.checkString(request.getParameter("aloncd"))%>">
<param name="odi.SP_PS_P_PAYADV.args3"		value="boemp_no_from=<%=Util.checkString(request.getParameter("boemp_no_from"))%>">
<param name="odi.SP_PS_P_PAYADV.args4"		value="boemp_no_to=<%=Util.checkString(request.getParameter("boemp_no_to"))%>">
<param name="odi.SP_PS_P_PAYADV.args5"		value="deptcd=<%=Util.checkString(request.getParameter("deptcd"))%>">
<param name="odi.SP_PS_P_PAYADV.args6"		value="yymm=<%=Util.checkString(request.getParameter("yymm"))%>">
<param name="applet.configmode"			value="html">
<param name="applet.isframe"				value="true">
<param name="applet.mode"					value="preview">
<param name="information.debug"			value="true">
<param name="applet.smartframesize"        value="true">

        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"					value="C:\\temp\\ChosunCRM">
<param name="export.filename"				value="�����ޱݻ󼼸���Ʈ_<%=sysDate%>.xls">
<param name="excel.removerange"			value="1,3">
<param name="excel.exceptfirstpage"		value="true">
        <!--������ȯ ����-->
</OBJECT>

