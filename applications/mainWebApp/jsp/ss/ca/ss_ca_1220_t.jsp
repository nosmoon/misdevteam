<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : ss_ca_1220_t.jsp
* 기능       : 사이버센터-사이버수당지급-인쇄
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
    String url        = request.getRequestURI();                                          //프로그램명
    String uid        = Util.getSessionParameterValue(request, "uid",  true);             //사용자아이디
    String sysDate    = Util.getDate();                                                   //엑셀화일 저장시 파일이름으로 사용

    //request process
    String clsfcd     = Util.checkString(request.getParameter("clsfcd"));                 //인쇄(지급내역):PR  확인서:CF

    String closyymm   = Util.checkString(request.getParameter("closyymm"));               //지급월
    String selcd      = Util.checkString(request.getParameter("selcd"));                  //검색코드
    String selnm      = Util.Uni2Ksc(Util.checkString(request.getParameter("selnm")));    //검색어

    //구분코드별 인쇄구분
    if(clsfcd.equals("CF")) {
        //송금 확인서 인쇄
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
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
        <param name="export.path"                        value="C:\temp\ChosunCRM">
        <param name="export.filename"                    value="사이버수당확인서_<%=sysDate%>.xls">
        <param name="excel.removerange"                  value="1,3">
        <param name="excel.exceptfirstpage"              value="true">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
    </OBJECT>

<%
    }else{
        //지급내역 인쇄
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
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
        <param name="export.path"                        value="C:\temp\ChosunCRM">
        <param name="export.filename"                    value="사이버수당지급내역_<%=sysDate%>.xls">
        <param name="excel.removerange"                  value="1,3">
        <param name="excel.exceptfirstpage"              value="true">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
    </OBJECT>
<%
    }
%>

</BODY>
</HTML>
