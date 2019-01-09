<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : pb_print_1102_t.jsp
* 기능     : 지사별 자진신청 현황
* 작성일자 : 2006-02-01
* 작성자   : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd    = Util.getSessionParameterValue(request, "cmpycd", true);          //지국지사코드
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //입력자아이디
    String sysDate   = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
    String aplcdt_from = Util.checkString(request.getParameter("SELF_PCOND_APLCDT_FROM"));
    String aplcdt_to = Util.checkString(request.getParameter("SELF_PCOND_APLCDT_TO"));
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"              value="<%=ozServerIP%>">
<param name="connection.reportname"           value="SP_PS_P_SELF_PCOND.ozr">
<param name="odi.odinames"                    value="SP_PS_P_SELF_PCOND">
<param name="odi.SP_PS_P_SELF_PCOND.pcount"   value="3">
<param name="odi.SP_PS_P_SELF_PCOND.args1"    value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SELF_PCOND.args2"    value="aplcdt_from=<%=aplcdt_from%>">
<param name="odi.SP_PS_P_SELF_PCOND.args3"    value="aplcdt_to=<%=aplcdt_to%>">
<param name="applet.configmode"               value="html">
<param name="applet.isframe"                  value="true">
<param name="applet.mode"                     value="preview">
<param name="applet.smartframesize"           value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                     value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 value="지사별 자진신청 현황_<%=sysDate%>.xls">
<param name="excel.removerange"               value="1,2">
<param name="excel.exceptfirstpage"           value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->
</OBJECT>