<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2366_t.jsp
* 기능 : 매체일괄발송 스티커
* 작성일자 : 2007-06-21
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보 (사용안함)
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
    //String incmgpers = Util.getSessionParameterValue(request, "uid", true); //로그인사용자
	String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"						value="<%=ozServerIP%>">
<param name="connection.reportname"					value="SP_PS_P_BO_SEND_LIST_A4.ozr">
<param name="odi.odinames"								value="SP_PS_P_BO_SEND_LIST">
<param name="odi.SP_PS_P_BO_SEND_LIST.pcount"	    	value="8">
<param name="odi.SP_PS_P_BO_SEND_LIST.args1"	    	value="cmpycd=<%=Util.checkString(request.getParameter("cmpycd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args2"	    	value="mediser_no=<%=Util.checkString(request.getParameter("mediser_no"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args3"	    	value="senddt=<%=Util.checkString(request.getParameter("senddt"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args4"	    	value="medicd=<%=Util.checkString(request.getParameter("medicd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args5"	    	value="deptcd=<%=Util.checkString(request.getParameter("deptcd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args6"	    	value="areacd=<%=Util.checkString(request.getParameter("areacd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args7"	    	value="bocd=<%=Util.checkString(request.getParameter("corrbocd"))%>">
<param name="odi.SP_PS_P_BO_SEND_LIST.args8"	    	value="rdr_no=<%=Util.checkString(request.getParameter("rdr_no"))%>">
<param name="appleconfigmode"							value="html">
<param name="applet.isframe"							value="true">
<param name="applet.isframemode"						value="preview">
        <!--미리보기 화면사이즈-->
<param name="applet.framewidth"               			value="900">
<param name="applet.frameheight"              			value="720">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"								value="C:\\temp\\ChosunCRM">
<param name="export.filename"							value="지국발송리스트_<%=sysDate%>.xls">
<param name="excel.removerange"						value="1,3">
<param name="excel.exceptfirstpage"					value="true">
        <!--엑셀변환 설정-->
</OBJECT>



