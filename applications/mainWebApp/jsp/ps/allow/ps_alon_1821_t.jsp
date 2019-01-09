<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>

<%--------------------------------------------------------------------------------------------------
* 파일명   : pb_alon_1821_t.jsp
* 기능     : 수당월마감 마감내역 출력
* 작성일자 : 2004-01-28
* 작성자   : 김상옥
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
--------------------------------------------------------------------------------------------------%>

<%
    //사용자 세션정보
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //회사코드
 	String sysDate = Util.getDate();	// 엑셀화일 저장시 파일이름으로 사용
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);           //입력자아이디
%>
<OBJECT width="800" height="800" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"                   value="<%=ozServerIP%>">
<param name="connection.reportname"                value="SP_PS_P_DEPTEMP_ALON_PTCR.ozr">
<param name="odi.odinames"                         value="SP_PS_P_DEPTEMP_ALON_PTCR">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.pcount" value="5">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args1"  value="iv_cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args2"  value="iv_incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args3"  value="iv_closmm=<%=request.getParameter("closmm")%>">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args4"  value="iv_bocd=<%=request.getParameter("bocd")%>">
<param name="odi.SP_PS_P_DEPTEMP_ALON_PTCR.args5"  value="iv_deptcd=<%=request.getParameter("deptcd")%>">
<param name="applet.configmode"                    value="html">
<param name="applet.isframe"                       value="true">
<param name="applet.mode"                          value="preview">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"					value="C:\\temp\\ChosunCRM">
<param name="export.filename"				value="수당월마감마감내역_<%=sysDate%>.xls">
<param name="excel.removerange"			value="1,3">
<param name="excel.exceptfirstpage"		value="true">
        <!--엑셀변환 설정-->
</OBJECT>
