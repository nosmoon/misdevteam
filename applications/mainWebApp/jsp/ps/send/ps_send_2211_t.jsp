<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2211_t.jsp
* 기능 : 거래명세서 출력
* 작성일자 : 2005-10-01
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
<param name="connection.servlet"					value="<%=ozServerIP%>">
<param name="connection.reportname"				value="SP_PS_P_COMBI_SEND_DETAIL.ozr">
<param name="connection.usewinhttp"			    value="true">
<param name="odi.odinames"							value="SP_PS_P_COMBI_SEND_DETAIL">
<param name="odi.SP_PS_P_COMBI_SEND_DETAIL.pcount"	value="6">
<param name="odi.SP_PS_P_COMBI_SEND_DETAIL.args1"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_COMBI_SEND_DETAIL.args2"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_COMBI_SEND_DETAIL.args3"	value="senddt_fr=<%=request.getParameter("senddt_fr")%>">
<param name="odi.SP_PS_P_COMBI_SEND_DETAIL.args4"	value="senddt_to=<%=request.getParameter("senddt_to")%>">
<param name="odi.SP_PS_P_COMBI_SEND_DETAIL.args5"	value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_COMBI_SEND_DETAIL.args6"	value="cmpycd_option=<%=request.getParameter("cmpycd_option")%>">

<param name="applet.configmode"					value="html">
<param name="applet.isframe"						value="true">
<param name="applet.mode"							value="preview">
<param name="applet.smartframesize"             	value="true">

        <!--엘셀변환시 반복문구 제외와 폴더지정 -->
<param name="export.path"							value="C:\\temp\\ChosunCRM">
<param name="export.filename"						value="거래명세서_<%=sysDate%>.xls">
<param name="excel.removerange"					value="1,2">
<param name="excel.exceptfirstpage"				value="true">
        <!--엑셀변환 설정-->
</OBJECT>



