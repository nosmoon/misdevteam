<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : ss_ca_1130_t.jsp
* 기능       : 사이버센터-사이버수당청구-인쇄
* 작성일자   : 2004-06-23
* 작성자     : 김상옥
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //Session process
    String url        = request.getRequestURI();                                //프로그램명
    String uid        = Util.getSessionParameterValue(request, "uid",  true);   //사용자아이디
    String sysDate    = Util.getDate();                                         //엑셀화일 저장시 파일이름으로 사용

    //request process
    String closyymm   = Util.checkString(request.getParameter("closyymm"));     //청구월
    String deptcd     = Util.checkString(request.getParameter("deptcd"));       //부서코드
    String areacd     = Util.checkString(request.getParameter("areacd"));       //지역코드
    String bocd       = Util.checkString(request.getParameter("bocd"));         //지국지사코드
    String hdqtcnfmyn = Util.checkString(request.getParameter("hdqtcnfmyn"));   //본사담당확인여부
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
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
        <param name="export.path"                       value="C:\temp\ChosunCRM">
        <param name="export.filename"                   value="사이버수당청구내역_<%=sysDate%>.xls">
        <param name="excel.removerange"                 value="1,3">
        <param name="excel.exceptfirstpage"             value="true">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
    </OBJECT>
</BODY>
</HTML>


