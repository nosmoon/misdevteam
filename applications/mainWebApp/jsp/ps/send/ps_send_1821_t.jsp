<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1821_t.jsp
* 기능     : 발송-보너스북발송 발송확인 상세 스티커 출력
* 작성일자 : 2004-02-27
* 작성자   : 김건호
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
	String flag   =  Util.checkString(request.getParameter("flag"));

	if(flag.equals("STICKER")) {
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"         				value="<%=ozServerIP%>">
<param name="connection.reportname"      				value="SP_PS_P_SEND_BNSBK_STICKER.ozr">
<param name="odi.odinames"               				value="SP_PS_P_SEND_BNSBK_STICKER">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.pcount"	value="5">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args2" 	value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args3" 	value="senddt=<%=request.getParameter("slt_senddt")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args4" 	value="asinbocd=<%=request.getParameter("slt_asinbocd")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args5" 	value="sendmthd=<%=request.getParameter("slt_sendmthd")%>">
<param name="applet.configmode"          				value="html">
<param name="applet.isframe"             				value="true">
<param name="applet.mode"                				value="preview">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                				value="C:\\temp\\ChosunCRM">
<param name="export.filename"            				value="보너스발송스티커출력<%=sysDate%>.xls">
<param name="excel.removerange"          				value="1,3">
<param name="excel.exceptfirstpage"      				value="true">
        <!--엑셀변환 설정-->
</OBJECT>
<%
	} else {
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"         				value="<%=ozServerIP%>">
<param name="connection.reportname"      				value="SP_PS_P_SEND_BNSBK_LIST.ozr">
<param name="odi.odinames"               				value="SP_PS_P_SEND_BNSBK_STICKER">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.pcount" 	value="5">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args1"  	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args2"  	value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args3"  	value="senddt=<%=request.getParameter("slt_senddt")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args4"  	value="asinbocd=<%=request.getParameter("slt_asinbocd")%>">
<param name="odi.SP_PS_P_SEND_BNSBK_STICKER.args5"  	value="sendmthd=<%=request.getParameter("slt_sendmthd")%>">

<param name="connection.fetchtype"						value="concurrent">
<param name="connection.pageque"						value="1">
<param name="viewer.mode"								value="print">
<param name="print.printbypage"						value="true">
<param name="applet.smartframesize"           			value="true">

<param name="applet.configmode"						value="html">
<param name="applet.isframe"							value="true">
<param name="applet.mode"								value="preview">

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                				value="C:\temp\ChosunCRM">
<param name="export.filename"            				value="보너스발송리스트_<%=sysDate%>.xls">
<param name="excel.removerange"          				value="1,2">
<param name="excel.exceptfirstpage"      				value="true">
        <!--엑셀변환 설정-->
</OBJECT>

<%
	}
%>
