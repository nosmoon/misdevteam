<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_commun_2690_t.jsp
* ���       : ��������Ȳ-�μ�
* �ۼ�����   : 2006-06-14
* �ۼ���     : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //Session process
    String bocd      = "01100"; //Util.getSessionParameterValue(request, "bocd", true);          //���������ڵ�
    String url       = request.getRequestURI();                                       //���α׷���
    String uid       = "i0212"; //Util.getSessionParameterValue(request, "uid", true);           //����ھ��̵�
    String bonm      = "û��"; //getCookieParameterValue(request, "BONM", true);          //������
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���

    //request process
	String medicd   = Util.checkString(request.getParameter("medicd"  ));   //��ü�ڵ�(����Ʈ)
    String addrcd   = Util.checkString(request.getParameter("addrcd"  ));   //�ּ��ڵ�
    String dongno   = Util.Uni2Ksc(Util.checkString(request.getParameter("dongno"  )));   //����ȣ(����Ʈ)
    String invsgdt   = Util.checkString(request.getParameter("invsgdt"  ));   //�ּ��ڵ�
    String invsgno   = Util.checkString(request.getParameter("invsgno"  ));   //�ּ��ڵ�
%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"              		value="<%=ozServerIP%>">
        <param name="connection.reportname"           		value="SP_SL_P_APT_THRW.ozr">
        <param name="print.size"                            value="A4">
        <param name="odi.odinames"                    		value="SP_SL_P_APT_THRW">
        <param name="connection.pcount" 					value="3">
        <param name="connection.args1" 	value="sv_url=<%=url%>">
        <param name="connection.args2" 	value="sv_uid=<%=uid%>">
        <param name="connection.args3" 	value="sv_bonm=<%=bonm%>">
        <param name="odi.SP_SL_P_APT_THRW.pcount" 		value="6">
        <param name="odi.SP_SL_P_APT_THRW.args1"  		value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SL_P_APT_THRW.args2"  		value="iv_medicd=<%=medicd%>">
        <param name="odi.SP_SL_P_APT_THRW.args3"  		value="iv_addrcd=<%=addrcd%>">
        <param name="odi.SP_SL_P_APT_THRW.args4"  		value="iv_dongno=<%=dongno%>">
        <param name="odi.SP_SL_P_APT_THRW.args5"  		value="iv_invsgdt=<%=invsgdt%>">
        <param name="odi.SP_SL_P_APT_THRW.args6"  		value="iv_invsgno=<%=invsgno%>">
        <param name="applet.configmode"               		value="html">
        <param name="applet.isframe"                  		value="true">
        <param name="applet.mode"                     		value="preview">
		<!--param name="viewer.largebundle"					value="true"-->

    </OBJECT>
</BODY>
</HTML>
