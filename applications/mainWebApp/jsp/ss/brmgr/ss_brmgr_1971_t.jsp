<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1871_t.jsp
* 기능     : 독자지국조회 리스트 출력
* 작성일자 : 2006-01-23
* 작성자   : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
---------------------------------------------------------------------------------------------------%>
<%
System.out.println("HI");
    //사용자 세션정보
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
    String incmgpers = Util.getSessionParameterValue(request, "uid", true); //로그인사용자
    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>
paramTag[paramTag.length] = '<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozClasssID%>">';
paramTag[paramTag.length] = '<param name="connection.servlet"              		value="<%=ozServerIP%>">';
paramTag[paramTag.length] = '<param name="connection.reportname"           		value="SP_PS_P_BO_READER_SEARCH.ozr">';
paramTag[paramTag.length] = '<param name="odi.odinames"                    		value="SP_PS_P_BO_READER_SEARCH">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.pcount" 	value="12">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args1"  	value="cmpycd=<%=cmpycd%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args2"  	value="medicd=<%=request.getParameter("medicd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args3"  	value="gubun1=<%=request.getParameter("gubun1")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args4"  	value="nmtext=<%=request.getParameter("nmtext")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args5"  	value="rdr_no=<%=request.getParameter("rdr_no")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args6"  	value="gubun2=<%=request.getParameter("gubun2")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args7"  	value="phone1=<%=request.getParameter("phone1")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args8"  	value="phone2=<%=request.getParameter("phone2")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args9"  	value="phone3=<%=request.getParameter("phone3")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args10" 	value="gubun3=<%=request.getParameter("gubun3")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args11" 	value="dlvdtlsaddr=<%=Util.Uni2Ksc(Util.checkString(request.getParameter("dlvdtlsaddr")))%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args12" 	value="sendmthd=<%=request.getParameter("sh_sendmthd")%>">';
paramTag[paramTag.length] = '<param name="applet.configmode"               		value="html">';
paramTag[paramTag.length] = '<param name="applet.isframe"                  		value="true">';
paramTag[paramTag.length] = '<param name="applet.mode"                     		value="preview">';

<!--미리보기 화면사이즈-->
<!--엘셀변환시 반복문구 제외와 폴더지정-->
paramTag[paramTag.length] = '<param name="export.path"                     		value="C:\\temp\\ChosunCRM">';
paramTag[paramTag.length] = '<param name="export.filename"                 		value="독자조회리스트출력<%=sysDate%>.xls">';
paramTag[paramTag.length] = '<param name="excel.removerange"               		value="1,2">';
paramTag[paramTag.length] = '<param name="excel.exceptfirstpage"           		value="true">';
        <!--엑셀변환 설정-->
paramTag[paramTag.length] = '</OBJECT>';

oz_activex_build(paramTag);
</script>

