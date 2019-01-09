<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1811_t.jsp
* 기능   : 수금-자동이체청구확인목록-인쇄
* 작성일자 : 2006-04-18
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", true);
    //String bonm = getCookieParameterValue(request, "BONM", true);

    String bocd = Util.checkString(request.getParameter("bocd"));
    String uid = Util.getSessionParameterValue(request, "uid", true);
    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>

<OBJECT width = "1300" height = "800" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet" 					value="<%=ozServerIP%>">
<param name="connection.reportname" 				value="SP_PS_P_SHFT_CLAM_PLAN.ozr">
<param name="odi.odinames" 						value="SP_PS_P_SHFT_CLAM_PLAN">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.pcount"	value="6">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args2" 	value="bocd=<%=bocd%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args3" 	value="sechcond=<%=request.getParameter("sechcond")%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args4" 	value="sechcont=<%=Util.Uni2Ksc(request.getParameter("sechcont"))%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args5" 	value="rcpmmthd=<%=request.getParameter("rcpmmthd")%>">
<param name="odi.SP_PS_P_SHFT_CLAM_PLAN.args6" 	value="clammthd=<%=request.getParameter("clammthd")%>">
<param name="applet.configmode"				    value="html">
<param name="applet.isframe"					    value="true">
<param name="applet.mode"						    value="preview">
<param name="applet.smartframesize"                value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"						    value="C:\\temp\\ChosunCRM">
<param name="export.filename"					    value="자동이체청구확인목록_<%=sysDate%>.xls">
<param name="excel.removerange"				    value="1,3">
<param name="excel.exceptfirstpage"			    value="true">
</OBJECT>
