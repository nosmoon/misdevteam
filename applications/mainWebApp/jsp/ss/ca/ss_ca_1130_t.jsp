<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : ss_ca_1130_t.jsp
* ���       : ���̹�����-���̹�����û��-�μ�
* �ۼ�����   : 2004-06-23
* �ۼ���     : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //Session process
    String url        = request.getRequestURI();                                //���α׷���
    String uid        = Util.getSessionParameterValue(request, "uid",  true);   //����ھ��̵�
    String sysDate    = Util.getDate();                                         //����ȭ�� ����� �����̸����� ���

    //request process
    String closyymm   = Util.checkString(request.getParameter("closyymm"));     //û����
    String deptcd     = Util.checkString(request.getParameter("deptcd"));       //�μ��ڵ�
    String areacd     = Util.checkString(request.getParameter("areacd"));       //�����ڵ�
    String bocd       = Util.checkString(request.getParameter("bocd"));         //���������ڵ�
    String hdqtcnfmyn = Util.checkString(request.getParameter("hdqtcnfmyn"));   //������Ȯ�ο���
%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"                value="<%=ozServerIP%>">
        <param name="connection.reportname"             value="SP_SS_P_CYBALON_BOCLAM.ozr">
        <param name="odi.odinames"                      value="SP_SS_P_CYBALON_BOCLAM">
        <param name="connection.pcount" 			    value="2">
        <param name="connection.args1" 	                value="sv_url=<%=url%>">
        <param name="connection.args2" 	                value="sv_uid=<%=uid%>">
        <param name="odi.SP_SS_P_CYBALON_BOCLAM.pcount" value="6">
        <param name="odi.SP_SS_P_CYBALON_BOCLAM.args1"  value="iv_closyymm=<%=closyymm%>">
        <param name="odi.SP_SS_P_CYBALON_BOCLAM.args2"  value="iv_deptcd=<%=deptcd%>">
        <param name="odi.SP_SS_P_CYBALON_BOCLAM.args3"  value="iv_areacd=<%=areacd%>">
        <param name="odi.SP_SS_P_CYBALON_BOCLAM.args4"  value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SS_P_CYBALON_BOCLAM.args5"  value="iv_incmgpers=<%=uid%>">
        <param name="odi.SP_SS_P_CYBALON_BOCLAM.args6"  value="iv_hdqtcnfmyn=<%=hdqtcnfmyn%>">
        <param name="applet.configmode"                 value="html">
        <param name="applet.isframe"                    value="true">
        <param name="applet.mode"                       value="preview">
        <param name="applet.smartframesize"             value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
        <param name="export.path"                       value="C:\temp\ChosunCRM">
        <param name="export.filename"                   value="���̹�����û������_<%=sysDate%>.xls">
        <param name="excel.removerange"                 value="1,3">
        <param name="excel.exceptfirstpage"             value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
    </OBJECT>
</BODY>
</HTML>


