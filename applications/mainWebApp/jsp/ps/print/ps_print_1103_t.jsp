<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_print_1103_t.jsp
* 기능     : 지국별 배송 목록 출력
* 작성일자 : 2007-03-26
* 작성자   : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd    = Util.getSessionParameterValue(request, "cmpycd", true);          	//지국지사코드
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);          	 	//입력자아이디
    String sysDate   = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
    String medisend_flag = Util.checkString(request.getParameter("BO_SEND_LIST_flag"));	  	//지국별

    if(medisend_flag.equals("P")) {
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"              		value="<%=ozServerIP%>">
<param name="connection.reportname"           		value="SP_PS_P_SEND_LUMP_TOTZ_P.ozr">
<param name="odi.odinames"                    		value="SP_PS_P_SEND_LUMP_TOTZ">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.pcount"	value="6">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args2" 	value="senddt=<%=Util.checkString(request.getParameter("BO_SEND_LIST_senddt"))%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args3" 	value="mediser_fr=<%=Util.checkString(request.getParameter("BO_SEND_LIST_fr"))%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args4" 	value="mediser_to=<%=Util.checkString(request.getParameter("BO_SEND_LIST_to"))%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args5" 	value="medicd=<%=Util.checkString(request.getParameter("BO_SEND_LIST_medicd"))%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args6" 	value="sendtype=<%=Util.checkString(request.getParameter("BO_SEND_LIST_sendtype"))%>">
<param name="applet.configmode"               		value="html">
<param name="applet.isframe"                  		value="true">
<param name="applet.mode"                     		value="preview">
<param name="applet.smartframesize"           		value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                     		value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 		value="지국별배송목록집계표_<%=sysDate%>.xls">
<param name="excel.removerange"               		value="0,0">
<param name="excel.exceptfirstpage"           		value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->

</OBJECT>

<% } else { %>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"                   value="<%=ozServerIP%>">
<param name="connection.reportname"                value="SP_PS_P_SEND_LUMP_TOTZ.ozr">
<param name="odi.odinames"                         value="SP_PS_P_SEND_LUMP_TOTZ">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.pcount"	value="6">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args2" 	value="senddt=<%=Util.checkString(request.getParameter("BO_SEND_LIST_senddt"))%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args3" 	value="mediser_fr=<%=Util.checkString(request.getParameter("BO_SEND_LIST_fr"))%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args4" 	value="mediser_to=<%=Util.checkString(request.getParameter("BO_SEND_LIST_to"))%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args5" 	value="medicd=<%=Util.checkString(request.getParameter("BO_SEND_LIST_medicd"))%>">
<param name="odi.SP_PS_P_SEND_LUMP_TOTZ.args6" 	value="sendtype=<%=Util.checkString(request.getParameter("BO_SEND_LIST_sendtype"))%>">
<param name="applet.configmode"               value="html">
<param name="applet.isframe"                  value="true">
<param name="applet.mode"                     value="preview">
<param name="applet.smartframesize"           value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                     value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 value="지국별배송목록_<%=sysDate%>.xls">
<param name="excel.removerange"               value="1,1">
<param name="excel.exceptfirstpage"           value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->

</OBJECT>

<% } %>
