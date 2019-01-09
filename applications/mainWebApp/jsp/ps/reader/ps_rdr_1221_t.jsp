<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1221_t.jsp
* 기능     : 확장자정보 출력
* 작성일자 : 2010-06-15
* 작성자   : 박은주
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
//    System.out.println("extndt_fr 	: "+request.getParameter("sh_extndt_fr"));
//    System.out.println("extndt_to 	: "+request.getParameter("sh_extndt_to"));
//    System.out.println("aplcpathcd 	: "+request.getParameter("sh_aplcpathcd"));
//    System.out.println("extntypecd 	: "+request.getParameter("sh_extntypecd"));
//    System.out.println("medicd 		: "+request.getParameter("sh_medicd"));
//    System.out.println("rdrnm 		: "+request.getParameter("sh_rdrnm"));
//   System.out.println("rdrprn1 	: "+request.getParameter("sh_rdrprn1"));
//    System.out.println("rdrprn2 	: "+request.getParameter("sh_rdrprn2"));
//    System.out.println("phone1 		: "+request.getParameter("sh_phone1"));
//    System.out.println("phone2 		: "+request.getParameter("sh_phone2"));
//    System.out.println("phone3 		: "+request.getParameter("sh_phone3"));
//    System.out.println("dlvaddr 	: "+request.getParameter("sh_dlvaddr"));
//    System.out.println("extnflnm 	: "+request.getParameter("sh_extnflnm"));
//    System.out.println("deliproccd 	: "+request.getParameter("sh_deliproccd"));
//    System.out.println("bouseyn 	: "+request.getParameter("sh_bouseyn"));
    
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"                value="<%=ozServerIP%>">
<param name="connection.reportname"             value="SP_PS_P_RDR_EXTN_INFO.ozr">
<param name="odi.odinames"                      value="SP_PS_P_RDR_EXTN_INFO">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.pcount"       value="17">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args1"        value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args2"        value="incmgpers=<%=incmgpers%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args3"        value="sh_extndt_fr=<%=request.getParameter("sh_extndt_fr")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args4"        value="sh_extndt_to=<%=request.getParameter("sh_extndt_to")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args5"        value="sh_aplcpathcd=<%=request.getParameter("sh_aplcpathcd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args6"        value="sh_extntypecd=<%=request.getParameter("sh_extntypecd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args7"        value="sh_medicd=<%=request.getParameter("sh_medicd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args8"        value="sh_rdrnm=<%=Util.Uni2Ksc(request.getParameter("sh_rdrnm"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args9"        value="sh_rdrprn1=<%=request.getParameter("sh_rdrprn1")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args10"       value="sh_rdrprn2=<%=request.getParameter("sh_rdrprn2")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args11"       value="sh_phone1=<%=request.getParameter("sh_phone1")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args12"       value="sh_phone2=<%=request.getParameter("sh_phone2")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args13"       value="sh_phone3=<%=request.getParameter("sh_phone3")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args14"       value="sh_dlvaddr=<%=Util.Uni2Ksc(request.getParameter("sh_dlvaddr"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args15"       value="sh_extnflnm=<%=Util.Uni2Ksc(request.getParameter("sh_extnflnm"))%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args16"       value="sh_deliproccd=<%=request.getParameter("sh_deliproccd")%>">
<param name="odi.SP_PS_P_RDR_EXTN_INFO.args17"       value="sh_bouseyn=<%=request.getParameter("sh_bouseyn")%>">
<param name="applet.configmode"                 value="html">
<param name="applet.isframe"                    value="true">
<param name="applet.mode"                       value="preview">


        <!--미리보기 화면사이즈-->
<param name="applet.framewidth"                 value="900">
<param name="applet.frameheight"                value="720">
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
<param name="export.path"                       value="C:\\temp\\ChosunCRM">
<param name="export.filename"                   value="확장자정보출력<%=sysDate%>.xls">
<param name="excel.removerange"                 value="1,1">
<param name="excel.exceptfirstpage"             value="true">
        <!--엑셀변환 설정-->
</OBJECT>
