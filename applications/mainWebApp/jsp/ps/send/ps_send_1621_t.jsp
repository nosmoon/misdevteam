<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_send_1421_t.jsp
* 기능 : 매체일일발송 스티커 출력
* 작성일자 : 2004-02-03
* 작성자 : 김건호
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
	String flag   =  Util.checkString(request.getParameter("flag"));

	if(flag.equals("STICKER")) {
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"					value="<%=ozServerIP%>">
<param name="connection.reportname"				value="SP_PS_P_SEND_ADDM_STICKER.ozr">
<param name="odi.odinames"							value="SP_PS_P_SEND_ADDM_STICKER">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.pcount"	value="7">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args1"	value="senddt=<%=request.getParameter("senddt")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args2"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args3"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args4"	value="mediser_no=<%=request.getParameter("mediser_no")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args5"	value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args6"	value="sendkindcd=<%=request.getParameter("sendkindcd")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args7"	value="sendmthdcd=<%=request.getParameter("sendmthdcd")%>">

<param name="appleconfigmode"						value="html">
<param name="applet.isframe"						value="true">
<param name="applet.isframemode"					value="preview">
</OBJECT>
<%
	} else {
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"					value="<%=ozServerIP%>">
<param name="connection.reportname"				value="SP_PS_P_SEND_ADDM_LIST.ozr">
<param name="odi.odinames"							value="SP_PS_P_SEND_ADDM_STICKER">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.pcount"	value="7">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args1"	value="senddt=<%=request.getParameter("senddt")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args2"	value="bocd=<%=request.getParameter("sendbrch")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args3"	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args4"	value="mediser_no=<%=request.getParameter("mediser_no")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args5"	value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args6"	value="sendkindcd=<%=request.getParameter("sendkindcd")%>">
<param name="odi.SP_PS_P_SEND_ADDM_STICKER.args7"	value="sendmthdcd=<%=request.getParameter("sendmthdcd")%>">

<param name="connection.fetchtype"					value="concurrent">
<param name="connection.pageque"					value="1">
<param name="viewer.mode"							value="preview">
<param name="print.printbypage"					value="true">
<param name="applet.smartframesize"           		value="true">

<param name="applet.configmode"					value="html">
<param name="applet.isframe"						value="true">
<param name="applet.mode"							value="preview">

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"							value="C:\\temp\\ChosunCRM">
<param name="export.filename"						value="추가발송리스트_<%=sysDate%>.xls">
<param name="excel.removerange"					value="1,2">
<param name="excel.exceptfirstpage"				value="true">
        <!--엑셀변환 설정-->

</OBJECT>
<%
	}
%>
