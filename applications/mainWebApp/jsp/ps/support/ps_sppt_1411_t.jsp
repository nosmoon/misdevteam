<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1411_t.jsp
* 기능 : 현금영수증 출력
* 작성일자 : 2004-06-10
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
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //지국지사코드
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //입력자아이디

	String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				value="<%=ozServerIP%>">
<param name="connection.reportname"			value="SP_PS_P_CASHRCPT.ozr">
<param name="odi.odinames"						value="SP_PS_P_CASHRCPT">
<param name="odi.SP_PS_P_CASHRCPT.pcount"		value="7">
<param name="odi.SP_PS_P_CASHRCPT.args1"		value="bocd=<%=request.getParameter("bocd")%>">
<param name="odi.SP_PS_P_CASHRCPT.args2"		value="cashrcpt_dtbgn=<%=request.getParameter("cashrcpt_dtbgn")%>">
<param name="odi.SP_PS_P_CASHRCPT.args3"		value="cashrcpt_dtend=<%=request.getParameter("cashrcpt_dtend")%>">
<param name="odi.SP_PS_P_CASHRCPT.args4"		value="selpubclsf=<%=request.getParameter("selpubclsf")%>">
<param name="odi.SP_PS_P_CASHRCPT.args5"		value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_CASHRCPT.args6"		value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_CASHRCPT.args7"		value="rcptclsf=<%=request.getParameter("rcptclsf")%>">
<param name="applet.configmode"				value="html">
<param name="applet.isframe"					value="true">
<param name="applet.mode"						value="preview">

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="현금영수증_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--엑셀변환 설정-->
</OBJECT>



