<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_alon_2026_t.jsp
* 기능 : 가지급금 인쇄
* 작성일자 : 2006-04-06
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
    String bocd      = request.getParameter("bocd");          //지국지사코드
	String sysDate = Util.getDate();	// 엑셀화일 저장시 파일이름으로 사용
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"			value="<%=ozServerIP%>">
<param name="connection.reportname"		value="SP_PS_P_PAYADV.ozr">
<param name="odi.odinames"					value="SP_PS_P_PAYADV">
<param name="odi.SP_PS_P_PAYADV.pcount"	value="6">
<param name="odi.SP_PS_P_PAYADV.args1"		value="bocd=<%=bocd%>">
<param name="odi.SP_PS_P_PAYADV.args2"		value="aloncd=<%=Util.checkString(request.getParameter("aloncd"))%>">
<param name="odi.SP_PS_P_PAYADV.args3"		value="boemp_no_from=<%=Util.checkString(request.getParameter("boemp_no_from"))%>">
<param name="odi.SP_PS_P_PAYADV.args4"		value="boemp_no_to=<%=Util.checkString(request.getParameter("boemp_no_to"))%>">
<param name="odi.SP_PS_P_PAYADV.args5"		value="deptcd=<%=Util.checkString(request.getParameter("deptcd"))%>">
<param name="odi.SP_PS_P_PAYADV.args6"		value="yymm=<%=Util.checkString(request.getParameter("yymm"))%>">
<param name="applet.configmode"			value="html">
<param name="applet.isframe"				value="true">
<param name="applet.mode"					value="preview">
<param name="information.debug"			value="true">
<param name="applet.smartframesize"        value="true">

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"					value="C:\\temp\\ChosunCRM">
<param name="export.filename"				value="가지급금상세리스트_<%=sysDate%>.xls">
<param name="excel.removerange"			value="1,3">
<param name="excel.exceptfirstpage"		value="true">
        <!--엑셀변환 설정-->
</OBJECT>

