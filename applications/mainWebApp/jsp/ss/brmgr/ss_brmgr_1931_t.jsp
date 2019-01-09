<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1931_t.jsp
* 기능 : 지국별발송 상세 출력
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
    //사용자 세션정보
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
	String flag   =  Util.checkString(request.getParameter("flag"));
	String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>

paramTag[paramTag.length] = '<OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">';
paramTag[paramTag.length] = '<param name="connection.servlet"					value="<%=ozServerIP%>">';
paramTag[paramTag.length] = '<param name="connection.reportname"				value="SP_PS_P_BOSEND_LUMP.ozr">';
paramTag[paramTag.length] = '<param name="odi.odinames"							value="SP_PS_P_BOSEND_LUMP">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BOSEND_LUMP.pcount"	    value="3">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BOSEND_LUMP.args1"	    value="acq_bocd=<%=request.getParameter("bocd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BOSEND_LUMP.args2"	    value="medicd=<%=request.getParameter("medicd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BOSEND_LUMP.args3"	    value="mediser_no=<%=request.getParameter("mediser_no")%>">';

paramTag[paramTag.length] = '<param name="connection.fetchtype"					value="concurrent">';
paramTag[paramTag.length] = '<param name="connection.pageque"					value="1">';
paramTag[paramTag.length] = '<param name="viewer.mode"							value="print">';
paramTag[paramTag.length] = '<param name="print.printbypage"					value="true">';
paramTag[paramTag.length] = '<param name="applet.smartframesize"           		value="true">';

paramTag[paramTag.length] = '<param name="applet.configmode"					value="html">';
paramTag[paramTag.length] = '<param name="applet.isframe"						value="true">';
paramTag[paramTag.length] = '<param name="applet.mode"							value="preview">';

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
paramTag[paramTag.length] = '<param name="export.path"							value="C:\\temp\\ChosunCRM">';
paramTag[paramTag.length] = '<param name="export.filename"						value="일괄발송스티커_<%=sysDate%>.xls">';
paramTag[paramTag.length] = '<param name="excel.removerange"					value="1,2">';
paramTag[paramTag.length] = '<param name="excel.exceptfirstpage"				value="true">';
        <!--엑셀변환 설정-->

paramTag[paramTag.length] = '</OBJECT>';

oz_activex_build(paramTag);
</script>
