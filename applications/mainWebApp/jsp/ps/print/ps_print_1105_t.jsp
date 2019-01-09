<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%@ page contentType="text/html; charset=KSC5601" %>
<%--------------------------------------------------------------------------------------------------
* 파일명   : ps_print_1105_t.jsp
* 기능     : 발송잔여부수
* 작성일자 : 2004-07-24
* 작성자   : 전현표
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
--------------------------------------------------------------------------------------------------%>

<%
    //사용자 세션정보
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //지국지사코드
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //입력자아이디

    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"           value="<%=ozServerIP%>">
<param name="connection.reportname"        value="SP_PS_P_SEND_REST.ozr">
<param name="odi.odinames"                 value="SP_PS_P_SEND_REST">
<param name="odi.SP_PS_P_SEND_REST.pcount" value="7">
<param name="odi.SP_PS_P_SEND_REST.args1" 	value="bocd=<%=Util.checkString(request.getParameter("SEND_REST_bocd"))%>">
<param name="odi.SP_PS_P_SEND_REST.args2"	value="medicd=<%=Util.checkString(request.getParameter("SEND_REST_medicd"))%>">
<param name="odi.SP_PS_P_SEND_REST.args3" 	value="substoser_no_m=<%=Util.checkString(request.getParameter("SEND_REST_M"))%>">
<param name="odi.SP_PS_P_SEND_REST.args4" 	value="substoser_no_w=<%=Util.checkString(request.getParameter("SEND_REST_W"))%>">
<param name="odi.SP_PS_P_SEND_REST.args5" 	value="aplcdt_fr=<%=Util.checkString(request.getParameter("SEND_APLCDT_FR"))%>">
<param name="odi.SP_PS_P_SEND_REST.args6" 	value="aplcdt_to=<%=Util.checkString(request.getParameter("SEND_APLCDT_TO"))%>">
<param name="odi.SP_PS_P_SEND_REST.args7" 	value="cmpycd=<%=cmpycd%>">

<param name="connection.fetchtype"			value="concurrent">
<param name="connection.pageque"			value="1">
<param name="applet.smartframesize"        value="true">
<param name="applet.configmode" 			value="html">
<param name="applet.isframe" 				value="true">
<param name="applet.mode" 					value="preview">
<param name="print.printbypage"			value="true">

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"					value="C:\\temp\\ChosunCRM">
<param name="export.filename"				value="발송잔여부수<%=sysDate%>.xls">
<param name="excel.removerange"			value="1,1">
<param name="excel.exceptfirstpage"		value="true">
        <!--엑셀변환 설정-->
</OBJECT>

