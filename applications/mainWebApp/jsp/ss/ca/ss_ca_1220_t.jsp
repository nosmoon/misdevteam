<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : ss_ca_1220_t.jsp
* ���       : ���̹�����-���̹���������-�μ�
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
    String url        = request.getRequestURI();                                          //���α׷���
    String uid        = Util.getSessionParameterValue(request, "uid",  true);             //����ھ��̵�
    String sysDate    = Util.getDate();                                                   //����ȭ�� ����� �����̸����� ���

    //request process
    String clsfcd     = Util.checkString(request.getParameter("clsfcd"));                 //�μ�(���޳���):PR  Ȯ�μ�:CF

    String closyymm   = Util.checkString(request.getParameter("closyymm"));               //���޿�
    String selcd      = Util.checkString(request.getParameter("selcd"));                  //�˻��ڵ�
    String selnm      = Util.Uni2Ksc(Util.checkString(request.getParameter("selnm")));    //�˻���

    //�����ڵ庰 �μⱸ��
    if(clsfcd.equals("CF")) {
        //�۱� Ȯ�μ� �μ�
%>

    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"                 value="<%=ozServerIP%>">
        <param name="connection.reportname"              value="SP_SS_P_CYBALON_STAFPAY_SEND.ozr">
        <param name="odi.odinames"                       value="SP_SS_P_CYBALON_STAFPAY">
        <param name="connection.pcount" 			     value="2">
        <param name="connection.args1" 	                 value="sv_url=<%=url%>">
        <param name="connection.args2" 	                 value="sv_uid=<%=uid%>">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.pcount" value="4">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.args1"  value="iv_closyymm=<%=closyymm%>">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.args2"  value="iv_selcd=<%=selcd%>">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.args3"  value="iv_selnm=<%=selnm%>">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.args4"  value="iv_incmgpers=<%=uid%>">
        <param name="applet.configmode"                  value="html">
        <param name="applet.isframe"                     value="true">
        <param name="applet.mode"                        value="preview">
        <param name="applet.smartframesize"              value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
        <param name="export.path"                        value="C:\temp\ChosunCRM">
        <param name="export.filename"                    value="���̹�����Ȯ�μ�_<%=sysDate%>.xls">
        <param name="excel.removerange"                  value="1,3">
        <param name="excel.exceptfirstpage"              value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
    </OBJECT>

<%
    }else{
        //���޳��� �μ�
%>

    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"                 value="<%=ozServerIP%>">
        <param name="connection.reportname"              value="SP_SS_P_CYBALON_STAFPAY.ozr">
        <param name="odi.odinames"                       value="SP_SS_P_CYBALON_STAFPAY">
        <param name="connection.pcount" 			     value="2">
        <param name="connection.args1" 	                 value="sv_url=<%=url%>">
        <param name="connection.args2" 	                 value="sv_uid=<%=uid%>">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.pcount" value="4">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.args1"  value="iv_closyymm=<%=closyymm%>">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.args2"  value="iv_selcd=<%=selcd%>">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.args3"  value="iv_selnm=<%=selnm%>">
        <param name="odi.SP_SS_P_CYBALON_STAFPAY.args4"  value="iv_incmgpers=<%=uid%>">
        <param name="applet.configmode"                  value="html">
        <param name="applet.isframe"                     value="true">
        <param name="applet.mode"                        value="preview">
        <param name="applet.smartframesize"              value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
        <param name="export.path"                        value="C:\temp\ChosunCRM">
        <param name="export.filename"                    value="���̹��������޳���_<%=sysDate%>.xls">
        <param name="excel.removerange"                  value="1,3">
        <param name="excel.exceptfirstpage"              value="true">
        <!--������ȯ�� �ݺ����� ���ܿ� ��������-->
    </OBJECT>
<%
    }
%>

</BODY>
</HTML>
