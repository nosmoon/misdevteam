<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_sppt_1221_t.jsp
* 기능     : 불편등록리스트 출력
* 작성일자 : 2003-12-27
* 작성자   : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
---------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보
    String bocd      = Util.getSessionParameterValue(request, "cmpycd", true);          //지국지사코드

    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"           value="<%=ozServerIP%>">
<param name="connection.reportname"        value="SP_PS_P_DSCT_CATL.ozr">
<param name="odi.odinames"                 value="SP_PS_P_DSCT_CATL">
<param name="odi.SP_PS_P_DSCT_CATL.pcount"	value="6">
<param name="odi.SP_PS_P_DSCT_CATL.args1" 	value="bocd=<%=bocd%>">
<param name="odi.SP_PS_P_DSCT_CATL.args2" 	value="kubun=<%=request.getParameter("kubun")%>">
<param name="odi.SP_PS_P_DSCT_CATL.args3" 	value="datefrom=<%=request.getParameter("datefrom")%>">
<param name="odi.SP_PS_P_DSCT_CATL.args4" 	value="dateto=<%=request.getParameter("dateto")%>">
<param name="odi.SP_PS_P_DSCT_CATL.args5" 	value="dscttypecd=<%=request.getParameter("dscttypecd")%>">
<param name="odi.SP_PS_P_DSCT_CATL.args6" 	value="boprocyn=<%=request.getParameter("boprocyn")%>">
<param name="applet.configmode"            value="html">
<param name="applet.isframe"               value="true">
<param name="applet.mode"                  value="preview">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                  value="C:\\temp\\ChosunCRM">
<param name="export.filename"              value="불편등록리스트_<%=sysDate%>.xls">
<param name="excel.removerange"            value="1,3">
<param name="excel.exceptfirstpage"        value="true">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
</OBJECT>



