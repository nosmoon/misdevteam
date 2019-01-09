<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_print_1107_t.jsp
* 기능     : 확장독자현황
* 작성일자 : 2009-05-06
* 작성자   : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd    = Util.getSessionParameterValue(request, "cmpycd", true);        //지국지사코드
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //입력자아이디
    String sysDate   = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"              		value="<%=ozServerIP%>">
<param name="connection.reportname"           		value="SP_PS_P_RDR_EXTN_PCOND.ozr">
<param name="odi.odinames"                    		value="SP_PS_P_RDR_EXTN_PCOND">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.pcount"	value="5">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args1" 	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args2" 	value="rdr_extn_fr=<%=Util.checkString(request.getParameter("RDR_EXTN_fr"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args3" 	value="rdr_extn_to=<%=Util.checkString(request.getParameter("RDR_EXTN_to"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args4" 	value="medicd=<%=Util.checkString(request.getParameter("RDR_EXTN_medicd"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_PCOND.args5" 	value="extntypecd=<%=Util.checkString(request.getParameter("RDR_EXTN_extntypecd"))%>">
<param name="applet.configmode"               		value="html">
<param name="applet.isframe"                  		value="true">
<param name="applet.mode"                     		value="preview">
<param name="applet.smartframesize"           		value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                     		value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 		value="확장독자현황_<%=sysDate%>.xls">
<param name="excel.removerange"               		value="0,0">
<param name="excel.exceptfirstpage"           		value="true">
<!--엘셀변환시 반복문구 제외와 폴더지정-->

</OBJECT>
