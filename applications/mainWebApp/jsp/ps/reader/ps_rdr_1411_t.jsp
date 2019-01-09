<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1411_t.jsp
* 기능     : 독자조회 리스트 출력
* 작성일자 : 2004-02-27
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
    String incmgpers = Util.getSessionParameterValue(request, "uid", true); //로그인사용자
    String email = "";
    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"          value="<%=ozServerIP%>">
<param name="connection.reportname"       value="SP_PS_P_RDR_PUBL.ozr">
<param name="odi.odinames"                value="SP_PS_P_RDR_PUBL">
<param name="odi.SP_PS_P_RDR_PUBL.pcount" value="19">
<param name="odi.SP_PS_P_RDR_PUBL.args1"  value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_RDR_PUBL.args2"  value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_RDR_PUBL.args3"  value="aplcdtfr=<%=request.getParameter("aplcdtfr")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args4"  value="aplcdtto=<%=request.getParameter("aplcdtto")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args5"  value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args6"  value="rdr_no=<%=request.getParameter("rdr_no")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args7"  value="rdrnm=<%=Util.Uni2Ksc(request.getParameter("rdrnm"))%>">
<param name="odi.SP_PS_P_RDR_PUBL.args8"  value="asinbocd=<%=request.getParameter("asinbocd")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args9"  value="prn1=<%=request.getParameter("prn1")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args10" value="prn2=<%=request.getParameter("prn2")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args11" value="tel_kubun=<%=request.getParameter("tel_kubun")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args12" value="rdrtel_no1=<%=request.getParameter("rdrtel_no1")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args13" value="rdrtel_no2=<%=request.getParameter("rdrtel_no2")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args14" value="rdrtel_no3=<%=request.getParameter("rdrtel_no3")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args15" value="addr=<%=Util.Uni2Ksc(request.getParameter("addr"))%>">
<param name="odi.SP_PS_P_RDR_PUBL.args16" value="email=<%=email%>">
<param name="odi.SP_PS_P_RDR_PUBL.args17" value="flnm_yn=<%=request.getParameter("flnm_yn")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args18" value="empnm_yn=<%=request.getParameter("empnm_yn")%>">
<param name="odi.SP_PS_P_RDR_PUBL.args19" value="empnm=<%=Util.Uni2Ksc(request.getParameter("empnm"))%>">
<param name="applet.configmode"           value="html">
<param name="applet.isframe"              value="true">
<param name="applet.mode"                 value="preview">
        <!--미리보기 화면사이즈-->
<param name="applet.framewidth"           value="900">
<param name="applet.frameheight"          value="720">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                 value="C:\\temp\\ChosunCRM">
<param name="export.filename"             value="독자조회리스트출력<%=sysDate%>.xls">
<param name="excel.removerange"           value="1,3">
<param name="excel.exceptfirstpage"       value="true">
        <!--엑셀변환 설정-->
</OBJECT>
