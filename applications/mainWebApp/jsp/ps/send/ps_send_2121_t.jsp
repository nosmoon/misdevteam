<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2121_t.jsp
* 기능     : 반송관리 리스트 출력
* 작성일자 : 2003-02-03
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
    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"                value="<%=ozServerIP%>">
<param name="connection.reportname"             value="SP_PS_P_SEND_RETN.ozr">
<param name="odi.odinames"                      value="SP_PS_P_SEND_RETN">
<param name="odi.SP_PS_P_SEND_RETN.pcount"      value="7">
<param name="odi.SP_PS_P_SEND_RETN.args1"       value="bocd=<%=request.getParameter("slt_bocd")%>">
<param name="odi.SP_PS_P_SEND_RETN.args2"       value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_SEND_RETN.args3"       value="retndt_fr=<%=request.getParameter("slt_retndt_fr")%>">
<param name="odi.SP_PS_P_SEND_RETN.args4"       value="retndt_to=<%=request.getParameter("slt_retndt_to")%>">
<param name="odi.SP_PS_P_SEND_RETN.args5"       value="retnclsf=<%=request.getParameter("slt_retnclsf")%>">
<param name="odi.SP_PS_P_SEND_RETN.args6"       value="boprocyn=<%=request.getParameter("slt_boprocyn")%>">
<param name="odi.SP_PS_P_SEND_RETN.args7"       value="acqnm=<%=Util.Uni2Ksc(Util.checkString(request.getParameter("slt_acqnm")))%>">
<param name="applet.configmode"                 value="html">
<param name="applet.isframe"                    value="true">
<param name="applet.mode"                       value="preview">
        <!--미리보기 화면사이즈-->
<param name="applet.framewidth"                 value="900">
<param name="applet.frameheight"                value="720">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                       value="C:\\temp\\ChosunCRM">
<param name="export.filename"                   value="반송송리스트출력_<%=sysDate%>.xls">
<param name="excel.removerange"                 value="1,3">
<param name="excel.exceptfirstpage"             value="true">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
</OBJECT>
