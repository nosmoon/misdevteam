<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1216_t.jsp
* 기능     : 확장독자집계 출력(확장집계1,2)
* 작성일자 : 2006-02-09
* 작성자   : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
    String incmgpers = Util.getSessionParameterValue(request, "uid", true); //로그인사용자
    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용

    String print_flag = Util.checkString(request.getParameter("hd_print_flag"));
//확장집계
if(print_flag.equals("1")) {
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"                value="<%=ozServerIP%>">
<param name="connection.reportname"             value="SP_PS_P_RDR_EXTN_AGGR.ozr">
<param name="odi.odinames"                      value="SP_PS_P_RDR_EXTN_AGGR">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.pcount"  value="17">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args1"   value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args2"   value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args3"   value="extndt_fr=<%=request.getParameter("sh_extndt_fr")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args4"   value="extndt_to=<%=request.getParameter("sh_extndt_to")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args5"   value="aplcpathcd=<%=request.getParameter("sh_aplcpathcd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args6"   value="extntypecd=<%=request.getParameter("sh_extntypecd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args7"   value="medicd=<%=request.getParameter("sh_medicd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args8"   value="rdrnm=<%=Util.Uni2Ksc(request.getParameter("sh_rdrnm"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args9"   value="rdrprn1=<%=request.getParameter("sh_rdrprn1")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args10"  value="rdrprn2=<%=request.getParameter("sh_rdrprn2")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args11"  value="phone1=<%=request.getParameter("sh_phone1")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args12"  value="phone2=<%=request.getParameter("sh_phone2")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args13"  value="phone3=<%=request.getParameter("sh_phone3")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args14"  value="dlvaddr=<%=Util.Uni2Ksc(request.getParameter("sh_dlvaddr"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args15"  value="extnflnm=<%=Util.Uni2Ksc(request.getParameter("sh_extnflnm"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args16"  value="deliproccd=<%=request.getParameter("sh_deliproccd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR.args17"  value="bouseyn=<%=request.getParameter("sh_bouseyn")%>">
<param name="applet.configmode"                 value="html">
<param name="applet.isframe"                    value="true">
<param name="applet.mode"                       value="preview">
        <!--미리보기 화면사이즈-->
<param name="applet.framewidth"                 value="900">
<param name="applet.frameheight"                value="720">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                       value="C:\\temp\\ChosunCRM">
<param name="export.filename"                   value="확장독자집계출력<%=sysDate%>.xls">
<param name="excel.removerange"                 value="1,3">
<param name="excel.exceptfirstpage"             value="true">
        <!--엑셀변환 설정-->
</OBJECT>
<%
    }
//확장집계2
else if(print_flag.equals("2"))
    {
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"                value="<%=ozServerIP%>">
<param name="connection.reportname"             value="SP_PS_P_RDR_EXTN_AGGR2.ozr">
<param name="odi.odinames"                      value="SP_PS_P_RDR_EXTN_AGGR2">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.pcount"  value="17">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args1"   value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args2"   value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args3"   value="extndt_fr=<%=request.getParameter("sh_extndt_fr")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args4"   value="extndt_to=<%=request.getParameter("sh_extndt_to")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args5"   value="aplcpathcd=<%=request.getParameter("sh_aplcpathcd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args6"   value="extntypecd=<%=request.getParameter("sh_extntypecd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args7"   value="medicd=<%=request.getParameter("sh_medicd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args8"   value="rdrnm=<%=Util.Uni2Ksc(request.getParameter("sh_rdrnm"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args9"   value="rdrprn1=<%=request.getParameter("sh_rdrprn1")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args10"  value="rdrprn2=<%=request.getParameter("sh_rdrprn2")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args11"  value="phone1=<%=request.getParameter("sh_phone1")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args12"  value="phone2=<%=request.getParameter("sh_phone2")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args13"  value="phone3=<%=request.getParameter("sh_phone3")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args14"  value="dlvaddr=<%=Util.Uni2Ksc(request.getParameter("sh_dlvaddr"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args15"  value="extnflnm=<%=Util.Uni2Ksc(request.getParameter("sh_extnflnm"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args16"  value="deliproccd=<%=request.getParameter("sh_deliproccd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_AGGR2.args17"  value="bouseyn=<%=request.getParameter("sh_bouseyn")%>">
<param name="applet.configmode"                 value="html">
<param name="applet.isframe"                    value="true">
<param name="applet.mode"                       value="preview">
        <!--미리보기 화면사이즈-->
<param name="applet.framewidth"                 value="900">
<param name="applet.frameheight"                value="720">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                       value="C:\\temp\\ChosunCRM">
<param name="export.filename"                   value="확장독자집계출력2<%=sysDate%>.xls">
<param name="excel.removerange"                 value="1,3">
<param name="excel.exceptfirstpage"             value="true">
        <!--엑셀변환 설정-->
</OBJECT>
<% } %>
