<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/comm_jsp/oz_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명    : ad_com_1450_p.jsp
* 기능       : 중점확인광고리스트  출력
* 작성일자 : 2009-02-06
* 작성자    : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자    :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //사용자 세션정보
//    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //출판회사코드
	String cmpy_cd = "312";
	String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
%>

paramTag[paramTag.length] = '<OBJECT width = "800" height = "600" CLASSID="<%=ozViewerID%>">';
paramTag[paramTag.length] = '<param name="connection.servlet"				value="<%=ozServerIP%>">';
paramTag[paramTag.length] = '<param name="connection.reportname"			value="SP_AD_COM_1450_P.ozr">';
paramTag[paramTag.length] = '<param name="odi.odinames"						value="SP_AD_COM_1450_P">';
paramTag[paramTag.length] = '<param name="odi.SP_AD_COM_1440_P.pcount"		value="2">';
paramTag[paramTag.length] = '<param name="odi.SP_AD_COM_1440_P.args1"		value="cmpy_cd=<%=cmpy_cd%>">';
paramTag[paramTag.length] = '<param name="odi.SP_AD_COM_1440_P.args2"		value="search_dt=<%=request.getParameter("search_dt")%>">';
paramTag[paramTag.length] = '<param name="appleconfigmode"					value="html">';
paramTag[paramTag.length] = '<param name="applet.isframe"					value="true">';
paramTag[paramTag.length] = '<param name="applet.isframemode"				value="preview">';

        <!--엘셀변환시 반복문구 제외와 폴더지정-->
paramTag[paramTag.length] = '<param name="export.path"						value="C:\\temp\\CIIS">';
paramTag[paramTag.length] = '<param name="export.filename"					value="중점확인광고리스트_<%=sysDate%>.xls">';
paramTag[paramTag.length] = '<param name="excel.removerange"				value="1,3">';
paramTag[paramTag.length] = '<param name="excel.exceptfirstpage"			value="true">';
        <!--엑셀변환 설정-->
paramTag[paramTag.length] = '</OBJECT>';

oz_activex_build(paramTag);
</script>