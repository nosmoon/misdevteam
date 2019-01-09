<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%@ page contentType="text/html; charset=KSC5601" %>
<%--------------------------------------------------------------------------------------------------
* 파일명   : ps_bill_1426_t.jsp
* 기능     : 초과입금 처리관리 인쇄
* 작성일자 : 2004-01-29
* 작성자   : 김건호
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
--------------------------------------------------------------------------------------------------%>

<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet" 				value="<%=ozServerIP%>">
<param name="connection.reportname" 			value="SP_PS_P_EXCSRCPMPROC.ozr">
<param name="odi.odinames" 					value="SP_PS_P_EXCSRCPMPROC">
<param name="odi.SP_PS_P_EXCSRCPMPROC.pcount" 	value="5">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args1" 	value="iv_bocd=<%=request.getParameter("slt_bocd")%>">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args2" 	value="iv_subsyy=<%=request.getParameter("subsyy")%>">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args3" 	value="iv_procyn=<%=request.getParameter("excsrcpmporcyn")%>">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args4" 	value="iv_procdtbgn=<%=request.getParameter("procdtbgn")%>">
<param name="odi.SP_PS_P_EXCSRCPMPROC.args5" 	value="iv_procdtend=<%=request.getParameter("procdtend")%>">
<param name="applet.configmode" 				value="html">
<param name="applet.isframe" 					value="true">
<param name="applet.mode" 						value="preview">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"						value="C:\\temp\\ChosunCRM">
<param name="export.filename"					value="초과입금 처리관리_<%=sysDate%>.xls">
<param name="excel.removerange"				value="1,3">
<param name="excel.exceptfirstpage"			value="true">
        <!--엑셀변환 설정-->
</OBJECT>
