<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1360_t.jsp
* ���       : ������������(ī���μ�)
* �ۼ�����   : 2004-05-10
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //Session process
    String bocd      = Util.getSessionParameterValue(request, "bocd", true);          //���������ڵ�
    String url       = request.getRequestURI();                                       //���α׷���
    String uid       = Util.getSessionParameterValue(request, "uid", true);           //����ھ��̵�
    String bonm      = Util.getSessionParameterValue(request, "bonm", true);          //������
    String sysDate   = Util.getDate(); // ����ȭ�� ����� �����̸����� ���

    //request process
	String rdr_no    = Util.checkString(request.getParameter("rdr_no"  ));   //���ڹ�ȣ
%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"              		value="<%=ozServerIP%>">
        <param name="connection.reportname"           		value="SP_SL_P_RDR_CARD.ozr">
        <param name="odi.odinames"                    		value="SP_SL_P_RDR_CARD">
        <param name="connection.pcount" 					value="3">
        <param name="connection.args1" 	value="sv_url=<%=url%>">
        <param name="connection.args2" 	value="sv_uid=<%=uid%>">
        <param name="connection.args3" 	value="sv_bonm=<%=bonm%>">
        <param name="odi.SP_SL_P_RDR_CARD.pcount" 		value="2">
        <param name="odi.SP_SL_P_RDR_CARD.args1"  		value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SL_P_RDR_CARD.args2"  		value="iv_rdr_no=<%=rdr_no%>">
        <param name="applet.configmode"               		value="html">
        <param name="applet.isframe"                  		value="true">
        <param name="applet.mode"                     		value="preview">
    </OBJECT>
</BODY>
</HTML>