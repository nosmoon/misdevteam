<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : ss_extn_1599_p.jsp
* ���		: Ȯ����Ȳ-����Ȯ���̻����-����μ�
* �ۼ�����   : 2004-10-20
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
   //String bocd      = Util.getSessionParameterValue(request, "bocd", true);         //���������ڵ�
   	String bocd     = Util.checkString(request.getParameter("sbocd"   ));			  //���������ڵ�
    String url       = request.getRequestURI();                                       //���α׷���
    String uid       = Util.getSessionParameterValue(request, "uid", true);           //����ھ��̵�
   	String bonm     = Util.Uni2Ksc(Util.checkString(request.getParameter("sbocdnm"   )));			  //������
   //String bonm      = Util.getSessionParameterValue(request, "bonm", true);         //������
    String sysDate	 = Util.getDate(); // ����ȭ�� ����� �����̸����� ���

    //request process
	String medicd     = Util.checkString(request.getParameter("medicd"  ));   		//��ü�ڵ�(����Ʈ)
	String frdst      = "";   		//���۱���
	String todst      = "";   		//���ᱸ��
	String frsubsuprc = "";   	//�����ܰ�(from)
	String tosubsuprc = "";   //�����ܰ�(to)
	String frextndt   = Util.checkString(request.getParameter("frdt"    ));   	    //Ȯ������(from)
	String toextndt   = Util.checkString(request.getParameter("todt"   ));   	    //Ȯ������(to)
	String extntp     = "";   		//Ȯ������
	String extnnm     = "";   		//Ȯ����
	String frvalmm    = "";   	//������(from)
	String tovalmm    = "";   	//������(to)
	String frmonths   = "";   	//���ݰ�����(from)
	String tomonths   = "";   	//���ݰ�����(to)
	String rpttp      = "2";   		//�������(1:��ü���μ�, 2:Ȯ���ں��μ�)
	String clamtmthdcd  = ""; //���ݹ��
  	String extnblngcd   = "";  //Ȯ���ڼҼ��ڵ�
	String stafno       = "";       //��������ڵ�+�����ȣ Ȥ�� ������������ȣ
   	String extnbocd     = Util.checkString(request.getParameter("sbocd"   ));//Ȯ�����������ڵ�

    String subsum = Util.checkString(request.getParameter("N")); //�Ұ���¿���
    subsum = ("Y".equals(subsum))? subsum : "N";
    String line = Util.checkString(request.getParameter("line"));
    line = ("1".equals(line))? line : "0";
	System.out.println(bonm);
    System.out.println(url);
    System.out.println(ozServerIP);
%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"              		value="<%=ozServerIP%>">
        <param name="connection.reportname"           		value="SP_SL_P_RDRLIST_CONT.ozr">
        <param name="odi.odinames"                    		value="SP_SL_P_RDRLIST_CONT">
        <param name="connection.pcount" 					value="6">
        <param name="connection.args1" 	value="iv_subsum=<%=subsum%>">
        <param name="connection.args2" 	value="iv_line=<%=line%>">
        <param name="connection.args3" 	value="sv_bonm=<%=bonm%>">
        <param name="connection.args4" 	value="sv_uid=<%=uid%>">
        <param name="connection.args5" 	value="sv_url=<%=url%>">
        <param name="connection.args6" 	value="uv_rpttype=3"><!--1:������,2:���� �ܰ���,3:Ȯ�����ں�,4:Ȯ���ں�,5:��������,6:���ݹ����,7:������-->
        <param name="odi.SP_SL_P_RDRLIST_CONT.pcount" 		value="20">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args1"  		value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args2"  		value="iv_medicd=<%=medicd%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args3"  		value="iv_frdst=<%=frdst%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args4"  		value="iv_todst=<%=todst%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args5"  		value="iv_frsubsuprc=<%=frsubsuprc%>">
		<param name="odi.SP_SL_P_RDRLIST_CONT.args6"  		value="iv_tosubsuprc=<%=tosubsuprc%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args7"  		value="iv_frextndt=<%=frextndt%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args8"  		value="iv_toextndt=<%=toextndt%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args9"  		value="iv_extntp=<%=extntp%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args10"  		value="iv_frvalmm=<%=frvalmm%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args11"  		value="iv_tovalmm=<%=tovalmm%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args12"  		value="iv_frmonths=<%=frmonths%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args13"  		value="iv_tomonths=<%=tomonths%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args14"  		value="iv_rpttp=<%=rpttp%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args15"  		value="iv_clamtmthdcd=<%=clamtmthdcd%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args16"  		value="iv_extnblngcd=<%=extnblngcd%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args17"  		value="iv_stafno=<%=stafno%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args18"  		value="iv_extnbocd=<%=extnbocd%>">
		<param name="odi.SP_SL_P_RDRLIST_CONT.args19"  		value="iv_free=0"> 
		<param name="odi.SP_SL_P_RDRLIST_CONT.args20"  		value="iv_jm_extn=1">
        <param name="applet.configmode"               		value="html">
        <param name="applet.isframe"                  		value="true">
        <param name="applet.mode"                     		value="preview">
    </OBJECT>

</BODY>
</HTML>