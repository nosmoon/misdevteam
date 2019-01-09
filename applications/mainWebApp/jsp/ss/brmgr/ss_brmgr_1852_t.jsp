<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_commun_2690_t.jsp
* 기능       : 투입율현황-인쇄
* 작성일자   : 2006-06-14
* 작성자     : 노상현
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //Session process
    String bocd      = "01100"; //Util.getSessionParameterValue(request, "bocd", true);          //지국지사코드
    String url       = request.getRequestURI();                                       //프로그램명
    String uid       = "i0212"; //Util.getSessionParameterValue(request, "uid", true);           //사용자아이디
    String bonm      = "청담"; //getCookieParameterValue(request, "BONM", true);          //지국명
    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용

    //request process
	String medicd   = Util.checkString(request.getParameter("medicd"  ));   //매체코드(리스트)
    String addrcd   = Util.checkString(request.getParameter("addrcd"  ));   //주소코드
    String dongno   = Util.Uni2Ksc(Util.checkString(request.getParameter("dongno"  )));   //동번호(리스트)
    String invsgdt   = Util.checkString(request.getParameter("invsgdt"  ));   //주소코드
    String invsgno   = Util.checkString(request.getParameter("invsgno"  ));   //주소코드
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
