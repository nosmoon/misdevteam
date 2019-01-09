<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%@ page contentType="text/html; charset=KSC5601" %>
<%--------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2031_t.jsp
* 기능     : 지로 추가발송관리 인쇄
* 작성일자 : 2004/03/16
* 작성자   : 장수환
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
--------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
	String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용

%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				value="<%=ozServerIP%>">
<param name="connection.reportname"			value="SP_PS_P_SEND_GIROADDM.ozr">
<param name="odi.odinames"						value="SP_PS_P_SEND_GIROADDM">
<param name="odi.SP_PS_P_SEND_GIROADDM.pcount"	value="3">
<param name="odi.SP_PS_P_SEND_GIROADDM.args1"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_GIROADDM.args2"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_GIROADDM.args3"	value="girosenddt=<%=request.getParameter("senddt")%>">
<param name="appleconfigmode"					value="html">
<param name="applet.isframe"					value="true">
<param name="applet.isframemode"				value="preview">

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="지로추가발송리스트_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--엑셀변환 설정-->
</OBJECT>
