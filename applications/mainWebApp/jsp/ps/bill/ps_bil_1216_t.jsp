<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1216_t.jsp
* 기능 : 일괄입금 내역 출력
* 작성일자 : 2004-01-26
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
<param name="connection.servlet"						value="<%=ozServerIP%>">
<param name="connection.reportname"					value="SP_PS_P_BILL_TACOD_GRRCPCM.ozr">
<param name="odi.odinames"								value="SP_PS_P_BILL_TACOD_GRRCPCM">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.pcount"	value="4">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.args1"		value="bocd=<%=request.getParameter("bocd")%>">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.args2"		value="acqdt=<%=request.getParameter("acqdt")%>">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.args3"		value="acqno=<%=request.getParameter("acqno")%>">
<param name="odi.SP_PS_P_BILL_TACOD_GRRCPCM.args4"		value="girono=<%=request.getParameter("girono")%>">
<param name="applet.configmode"						value="html">
<param name="applet.isframe"							value="true">
<param name="applet.mode"								value="preview">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"								value="C:\temp\ChosunCRM">
<param name="export.filename"							value="일괄입금리스트_<%=sysDate%>.xls">
<param name="excel.removerange"						value="1,3">
<param name="excel.exceptfirstpage"					value="true">
        <!--엑셀변환 설정-->
</OBJECT>
