<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : sl_bill_1635_p.jsp
* ��� : ��������-����-����EDI��������-����EDI �Ա�ó����� ����μ�
* �ۼ����� : 2004-05-03
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
    <!--OBJECT width = "1300" height = "800" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet" value="<%=ozServerIP%>">
        <param name="connection.reportname" value="SP_SS_P_EDI_RCPM_CATL.ozr"> // �����̳ʷ� �ۼ���  ozr ����
		<param name="connection.pcount" value="3">
        <param name="connection.args1" 	value="sv_url=<%=request.getRequestURI()%>">
        <param name="odi.odinames" value="SP_SS_P_EDI_RCPM_CATL">
        <param name="odi.SP_SS_P_EDI_RCPM_CATL.pcount" value="2"> // �����ڰ�
        <param name="odi.SP_SS_P_EDI_RCPM_CATL.args1" value="acqdt=<%=request.getParameter("acqdt")%>">
        <param name="odi.SP_SS_P_EDI_RCPM_CATL.args2" value="girono=<%=request.getParameter("girono")%>">
        <param name="applet.configmode" value="html">
        <param name="applet.isframe" value="true"> // ��â���� ���� "false" = ����ȭ�鿡 ����
        <param name="applet.mode" value="preview"> // �̸����� "print" = �ٷ�����ϱ�
    </OBJECT>
</BODY>
</HTML-->


<%
    //Session process
    String bocd      = Util.checkString(request.getParameter("bocd"  ));          //���������ڵ�
    String url       = request.getRequestURI();                                       //���α׷���
    String uid       = Util.getSessionParameterValue(request, "uid", true);           //����ھ��̵�
    String bonm      = "";          //������
    //String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���

    //request process
	String ordcond   = "10";   //���Ĺ�� ����
	String acqdt    = Util.checkString(request.getParameter("acqdt"));   //�������� �˻�����
	String medicd    = "";   //��ü�ڵ� �˻�����
	String erryn    = "";   //�ݿ����� �˻�����
    String recpclsf = Util.checkString(request.getParameter("recpclsf")); //��������

%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"              		value="<%=ozServerIP%>">
        <param name="connection.reportname"           		value="SP_SL_P_GIRORECP.ozr">
        <param name="odi.odinames"                    		value="SP_SL_P_GIRORECP">
        <param name="connection.pcount" 					value="3">
        <param name="connection.args1" 						value="sv_bonm=<%=bonm%>">
        <param name="connection.args2" 						value="sv_uid=<%=uid%>">
        <param name="connection.args3" 						value="sv_url=<%=url%>">
        <param name="odi.SP_SL_P_GIRORECP.pcount" 			value="6">
        <param name="odi.SP_SL_P_GIRORECP.args1"  			value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SL_P_GIRORECP.args2"  			value="iv_ordcond=<%=ordcond%>">
        <param name="odi.SP_SL_P_GIRORECP.args3"  			value="iv_acqdt=<%=acqdt%>">
        <param name="odi.SP_SL_P_GIRORECP.args4"  			value="iv_medicd=<%=medicd%>">
        <param name="odi.SP_SL_P_GIRORECP.args5"  			value="iv_erryn=<%=erryn%>">
        <param name="odi.SP_SL_P_GIRORECP.args6"  			value="iv_recpclsf=<%=recpclsf%>">
        <param name="applet.configmode"               		value="html">
        <param name="applet.isframe"                  		value="true">
        <param name="applet.mode"                     		value="preview">
    </OBJECT>
</BODY>
</HTML>
