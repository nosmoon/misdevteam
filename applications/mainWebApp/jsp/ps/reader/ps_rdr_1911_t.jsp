<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1911_t.jsp
* 기능     : 수금입력목록 출력
* 작성일자 : 2008-07-14
* 작성자   : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
---------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
    String incmgpers = Util.getSessionParameterValue(request, "uid", true); //로그인사용자
    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"         			value="<%=ozServerIP%>">
<param name="connection.reportname"     			value="SP_PS_P_TODAYINPUT_RDR.ozr">
<param name="odi.odinames"               			value="SP_PS_P_TODAYINPUT_RDR">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.pcount"	value="5">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args2" 	value="input_fromdt=<%=request.getParameter("input_fromdt")%>">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args3" 	value="input_todt=<%=request.getParameter("input_todt")%>">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args4" 	value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_TODAYINPUT_RDR.args5" 	value="asinbocd=<%=request.getParameter("asinbocd")%>">
<param name="applet.configmode"          			value="html">
<param name="applet.isframe"             			value="true">
<param name="applet.mode"                			value="preview">
        <!--미리보기 화면사이즈-->
<param name="applet.framewidth"               		value="900">
<param name="applet.frameheight"              		value="720">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                			value="C:\\temp\\ChosunCRM">
<param name="export.filename"            			value="수금입력목록<%=sysDate%>.xls">
<param name="excel.removerange"          			value="1,3">
<param name="excel.exceptfirstpage"      			value="true">
        <!--엑셀변환 설정-->
</OBJECT>
