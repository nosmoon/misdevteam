<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_send_2331_t.jsp
* 기능 : 지국별발송 상세 출력
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
	String flag   =  Util.checkString(request.getParameter("flag"));
	String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"					value="<%=ozServerIP%>">
<param name="connection.reportname"				value="SP_PS_P_BOSEND_LUMP.ozr">
<param name="odi.odinames"							value="SP_PS_P_BOSEND_LUMP">
<param name="odi.SP_PS_P_BOSEND_LUMP.pcount"	    value="3">
<param name="odi.SP_PS_P_BOSEND_LUMP.args1"	    value="acq_bocd=<%=request.getParameter("bocd")%>">
<param name="odi.SP_PS_P_BOSEND_LUMP.args2"	    value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_BOSEND_LUMP.args3"	    value="mediser_no=<%=request.getParameter("mediser_no")%>">

<param name="connection.fetchtype"					value="concurrent">
<param name="connection.pageque"					value="1">
<param name="viewer.mode"							value="print">
<param name="print.printbypage"					value="true">
<param name="applet.smartframesize"           		value="true">

<param name="applet.configmode"					value="html">
<param name="applet.isframe"						value="true">
<param name="applet.mode"							value="preview">

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"							value="C:\\temp\\ChosunCRM">
<param name="export.filename"						value="일괄발송스티커_<%=sysDate%>.xls">
<param name="excel.removerange"					value="1,2">
<param name="excel.exceptfirstpage"				value="true">
        <!--엑셀변환 설정-->

</OBJECT>



