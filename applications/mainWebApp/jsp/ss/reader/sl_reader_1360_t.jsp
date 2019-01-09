<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1360_t.jsp
* 기능       : 독자정보관리(카드인쇄)
* 작성일자   : 2004-05-10
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //Session process
    String bocd      = Util.getSessionParameterValue(request, "bocd", true);          //지국지사코드
    String url       = request.getRequestURI();                                       //프로그램명
    String uid       = Util.getSessionParameterValue(request, "uid", true);           //사용자아이디
    String bonm      = Util.getSessionParameterValue(request, "bonm", true);          //지국명
    String sysDate   = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용

    //request process
	String rdr_no    = Util.checkString(request.getParameter("rdr_no"  ));   //독자번호
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