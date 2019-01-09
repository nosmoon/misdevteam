<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_print_1104_t.jsp
* 기능     : 지국별 배달비 목록 출력
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
    String cmpycd    = Util.getSessionParameterValue(request, "cmpycd", true);          //지국지사코드
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //입력자아이디
    String sysDate   = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용

%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"              		value="<%=ozServerIP%>">
<param name="connection.reportname"           		value="SP_PS_P_BO_SEND_ADJM.ozr">
<param name="odi.odinames"                    		value="SP_PS_P_BO_SEND_ADJM">
<param name="odi.SP_PS_P_BO_SEND_ADJM.pcount"		value="3">
<param name="odi.SP_PS_P_BO_SEND_ADJM.args1" 		value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_BO_SEND_ADJM.args2" 		value="closyymm=<%=Util.checkString(request.getParameter("BO_SEND_ADJM_closyymm"))%>">
<param name="odi.SP_PS_P_BO_SEND_ADJM.args3" 		value="medicd=<%=Util.checkString(request.getParameter("BO_SEND_ADJM_medicd"))%>">
<param name="applet.configmode"               		value="html">
<param name="applet.isframe"                  		value="true">
<param name="applet.mode"                     		value="preview">
<param name="applet.smartframesize"           		value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                     		value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 		value="지국별배달비목록_<%=sysDate%>.xls">
<param name="excel.removerange"               		value="0,0">
<param name="excel.exceptfirstpage"           		value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->

</OBJECT>
