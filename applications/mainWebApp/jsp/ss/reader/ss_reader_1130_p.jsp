<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : ss_reader_1130_p.jsp
* ���       : ������Ȳ-��������-����μ�
* �ۼ�����   : 2004-10-04
* �ۼ���     : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   : ȭ��˻� ��ϰ� �����ϰ� ���
* ������     : ��뼷
* ��������   : 20041214
* ������ϸ� : ����(�߰�)
---------------------------------------------------------------------------------------------------%>
<%
    //Session process
    /*
    String bocd      = Util.getSessionParameterValue(request, "bocd", true);          //���������ڵ�
    String url       = request.getRequestURI();                                       //���α׷���
    String uid       = Util.getSessionParameterValue(request, "uid", true);           //����ھ��̵�
    String bonm      = Util.getSessionParameterValue(request, "bonm", true);          //������
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
	*/

    //request process
	String fracpndt = Util.checkString(request.getParameter("frdt"    ));   	//�������(From)
	String toacpndt = Util.checkString(request.getParameter("todt"    ));   	//�������(To)
    String dscttypecd   = Util.checkString(request.getParameter("dscttypecd"    ));   	//���������ڵ�

    String deptcd = Util.checkString(request.getParameter("deptcd"));  //�μ��ڵ�
    String areacd = Util.checkString(request.getParameter("areacd"));  //�����ڵ�
    String bocd = Util.checkString(request.getParameter("bocd"));      //�����ڵ�
    String acpnpathcd = Util.checkString(request.getParameter("acpnpathcd"));  //����ڵ�
    String fromtogb = Util.checkString(request.getParameter("fromtogb"));  //�Ⱓ��������
    String rdrnm = Util.Uni2Ksc(Util.checkString(request.getParameter("rdrnm"))); //���ڸ�
    String rdr_no = Util.Uni2Ksc(Util.checkString(request.getParameter("rdr_no"))); //���ڹ�ȣ
    String titl = Util.Uni2Ksc(Util.checkString(request.getParameter("titl"))); //����
    String cont = Util.Uni2Ksc(Util.checkString(request.getParameter("cont"))); //����
    String bocnfmyn = Util.checkString(request.getParameter("bocnfmyn"));  //��������Ȯ�λ���
    String boprocyn = Util.checkString(request.getParameter("boprocyn"));  //��������ó������ (Y:ó��, N:��ó��)
%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"              		value="<%=ozServerIP%>">
        <param name="connection.reportname"           		value="SP_SS_P_RDR_DSCT.ozr">
        <param name="odi.odinames"                    		value="SP_SS_P_RDR_DSCT">

        <param name="odi.SP_SS_P_RDR_DSCT.pcount" 		value="14">
        <param name="odi.SP_SS_P_RDR_DSCT.args1"  		value="iv_fracpndt=<%=fracpndt%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args2"  		value="iv_toacpndt=<%=toacpndt%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args3"  		value="iv_dscttypecd=<%=dscttypecd%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args4"  		value="iv_deptcd=<%=deptcd%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args5"  		value="iv_areacd=<%=areacd%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args6"  		value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args7"  		value="iv_fromtogb=<%=fromtogb%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args8"  		value="iv_rdrnm=<%=rdrnm%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args9"  		value="iv_rdr_no=<%=rdr_no%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args10"  		value="iv_titl=<%=titl%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args11"  		value="iv_cont=<%=cont%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args12"  		value="iv_bocnfmyn=<%=bocnfmyn%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args13"  		value="iv_boprocyn=<%=boprocyn%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args14"  		value="iv_acpnpathcd=<%=acpnpathcd%>">


        <param name="applet.configmode"               		value="html">
        <param name="applet.isframe"                  		value="true">
        <param name="applet.mode"                     		value="preview">
    </OBJECT>
</BODY>
</HTML>

