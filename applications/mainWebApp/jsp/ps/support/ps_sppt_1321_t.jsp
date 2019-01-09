<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_sppt_1321_t.jsp
* 기능     : 이사신청리스트 출력
* 작성일자 : 2005-02-15
* 작성자   : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
---------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보
    String bocd      = Util.getSessionParameterValue(request, "cmpycd", true);          //지국지사코드

    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>
<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"           value="<%=ozServerIP%>">
<param name="connection.reportname"        value="SP_PS_P_MOVM_RDR.ozr">
<param name="odi.odinames"                 value="SP_PS_P_MOVM_RDR">
<param name="odi.SP_PS_P_MOVM_RDR.pcount"  value="6">
<param name="odi.SP_PS_P_MOVM_RDR.args1"   value="bocd=<%=bocd%>">
<param name="odi.SP_PS_P_MOVM_RDR.args2"   value="rdrnm=<%=Util.Uni2Ksc(Util.checkString(request.getParameter("rdrnm")))%>">
<param name="odi.SP_PS_P_MOVM_RDR.args3"   value="regdt_fr=<%=request.getParameter("regdt_fr")%>">
<param name="odi.SP_PS_P_MOVM_RDR.args4"   value="regdt_to=<%=request.getParameter("regdt_to")%>">
<param name="odi.SP_PS_P_MOVM_RDR.args5"   value="boprocyn=<%=request.getParameter("boprocyn")%>">
<param name="odi.SP_PS_P_MOVM_RDR.args6"   value="acptbocnfmyn=<%=request.getParameter("acptbocnfmyn")%>">
<param name="applet.configmode"            value="html">
<param name="applet.isframe"               value="true">
<param name="applet.mode"                  value="preview">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                  value="C:\\temp\\ChosunCRM">
<param name="export.filename"              value="이사신청리스트_<%=sysDate%>.xls">
<param name="excel.removerange"            value="1,3">
<param name="excel.exceptfirstpage"        value="true">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
</OBJECT>



