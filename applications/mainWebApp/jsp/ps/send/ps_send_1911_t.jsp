<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_send_1511_t.jsp
* 기능 : 지로 정상발송 리스트
* 작성일자 : 2004-02-03
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
	String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				value="<%=ozServerIP%>">
<param name="connection.reportname"			value="SP_PS_P_SEND_GIRONORM.ozr">
<param name="odi.odinames"						value="SP_PS_P_SEND_GIRONORM">
<param name="odi.SP_PS_P_SEND_GIRONORM.pcount"	value="3">
<param name="odi.SP_PS_P_SEND_GIRONORM.args1"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_GIRONORM.args2"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_GIRONORM.args3"	value="girosenddt=<%=request.getParameter("girosenddt")%>">
<param name="appleconfigmode"					value="html">
<param name="applet.isframe"					value="true">
<param name="applet.isframemode"				value="preview">

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="지로정상발송리스트_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--엑셀변환 설정-->
</OBJECT>

