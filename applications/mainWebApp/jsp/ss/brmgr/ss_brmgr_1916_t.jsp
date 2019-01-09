<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1916_t.jsp
* 기능 : 매체일괄발송 리스트
* 작성일자 :
* 작성자 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보 (사용안함)
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
    //String incmgpers = Util.getSessionParameterValue(request, "uid", true); //로그인사용자
	String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>

paramTag[paramTag.length] = '<OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">';
paramTag[paramTag.length] = '<param name="connection.servlet"						value="<%=ozServerIP%>">';
paramTag[paramTag.length] = '<param name="connection.reportname"					value="SP_PS_P_BO_SEND_ADJM_LIST.ozr">';
paramTag[paramTag.length] = '<param name="odi.odinames"								value="SP_PS_P_BO_SEND_ADJM_LIST">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.pcount"	    value="6">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args1"	    value="cmpycd=<%=request.getParameter("cmpycd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args2"	    value="closyymm=<%=request.getParameter("senddt")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args3"	    value="medicd=<%=request.getParameter("medicd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args4"	    value="deptcd=<%=request.getParameter("deptcd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args5"	    value="areacd=<%=request.getParameter("areacd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_SEND_ADJM_LIST.args6"	    value="bocd=<%=request.getParameter("corrbocd")%>">';
paramTag[paramTag.length] = '<param name="appleconfigmode"							value="html">';
paramTag[paramTag.length] = '<param name="applet.isframe"							value="true">';
paramTag[paramTag.length] = '<param name="applet.isframemode"						value="preview">';
        <!--미리보기 화면사이즈-->
paramTag[paramTag.length] = '<param name="applet.framewidth"               			value="900">';
paramTag[paramTag.length] = '<param name="applet.frameheight"              			value="720">';
        <!--엘셀변환시 반복문구 제외와 폴더지정-->
paramTag[paramTag.length] = '<param name="export.path"								value="C:\\temp\\ChosunCRM">';
paramTag[paramTag.length] = '<param name="export.filename"							value="지국발송리스트_<%=sysDate%>.xls">';
paramTag[paramTag.length] = '<param name="excel.removerange"						value="1,3">';
paramTag[paramTag.length] = '<param name="excel.exceptfirstpage"					value="true">';
        <!--엑셀변환 설정-->
paramTag[paramTag.length] = '</OBJECT>';

oz_activex_build(paramTag);
</script>
