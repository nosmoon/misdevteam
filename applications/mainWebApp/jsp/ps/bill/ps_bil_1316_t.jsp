<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bok_1316_t.jsp
* 기능 : 비정상 입금 리스트 출력
* 작성일자 : 2004-03-26
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	String sysDate = Util.getDate();	// 엑셀화일 저장시 파일이름으로 사용
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"				value="<%=ozServerIP%>">
<param name="connection.reportname"			value="SP_PS_P_BILL_NONRCPM.ozr">
<param name="odi.odinames" 					value="SP_PS_P_BILL_NONRCPM">
<param name="odi.SP_PS_P_BILL_NONRCPM.pcount"	value="4">
<param name="odi.SP_PS_P_BILL_NONRCPM.args1" 	value="bocd=<%=request.getParameter("slt_bocd")%>">
<param name="odi.SP_PS_P_BILL_NONRCPM.args2" 	value="acqdt_1=<%=request.getParameter("acqdt_1")%>">
<param name="odi.SP_PS_P_BILL_NONRCPM.args3" 	value="acqdt_2=<%=request.getParameter("acqdt_2")%>">
<param name="odi.SP_PS_P_BILL_NONRCPM.args4" 	value="rcpmrflyn=<%=request.getParameter("rcpmrflyn")%>">
<param name="applet.configmode"        		value="html">
<param name="applet.isframe"            		value="true">
<param name="applet.mode"               		value="preview">

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="비정상입금리스트_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--엑셀변환 설정-->
</OBJECT>
