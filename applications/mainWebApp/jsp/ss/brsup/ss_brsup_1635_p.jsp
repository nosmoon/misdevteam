<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : sl_bill_1635_p.jsp
* 기능 : 지국지원-빌링-지로EDI수납관리-지로EDI 입금처리결과 목록인쇄
* 작성일자 : 2004-05-03
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
    <!--OBJECT width = "1300" height = "800" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet" value="<%=ozServerIP%>">
        <param name="connection.reportname" value="SP_SS_P_EDI_RCPM_CATL.ozr"> // 디자이너로 작성한  ozr 파일
		<param name="connection.pcount" value="3">
        <param name="connection.args1" 	value="sv_url=<%=request.getRequestURI()%>">
        <param name="odi.odinames" value="SP_SS_P_EDI_RCPM_CATL">
        <param name="odi.SP_SS_P_EDI_RCPM_CATL.pcount" value="2"> // 총인자값
        <param name="odi.SP_SS_P_EDI_RCPM_CATL.args1" value="acqdt=<%=request.getParameter("acqdt")%>">
        <param name="odi.SP_SS_P_EDI_RCPM_CATL.args2" value="girono=<%=request.getParameter("girono")%>">
        <param name="applet.configmode" value="html">
        <param name="applet.isframe" value="true"> // 새창으로 띄우기 "false" = 현재화면에 띄우기
        <param name="applet.mode" value="preview"> // 미리보기 "print" = 바로출력하기
    </OBJECT>
</BODY>
</HTML-->


<%
    //Session process
    String bocd      = Util.checkString(request.getParameter("bocd"  ));          //지국지사코드
    String url       = request.getRequestURI();                                       //프로그램명
    String uid       = Util.getSessionParameterValue(request, "uid", true);           //사용자아이디
    String bonm      = "";          //지국명
    //String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용

    //request process
	String ordcond   = "10";   //정렬방식 구분
	String acqdt    = Util.checkString(request.getParameter("acqdt"));   //수취일자 검색조건
	String medicd    = "";   //매체코드 검색조건
	String erryn    = "";   //반영여부 검색조건
    String recpclsf = Util.checkString(request.getParameter("recpclsf")); //수납구분

%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"              		value="<%=ozServerIP%>">
        <param name="connection.reportname"           		value="SP_SL_P_GIRORECP.ozr">
        <param name="odi.odinames"                    		value="SP_SL_P_GIRORECP">
        <param name="connection.pcount" 					value="3">
        <param name="connection.args1" 						value="sv_bonm=<%=bonm%>">
        <param name="connection.args2" 						value="sv_uid=<%=uid%>">
        <param name="connection.args3" 						value="sv_url=<%=url%>">
        <param name="odi.SP_SL_P_GIRORECP.pcount" 			value="6">
        <param name="odi.SP_SL_P_GIRORECP.args1"  			value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SL_P_GIRORECP.args2"  			value="iv_ordcond=<%=ordcond%>">
        <param name="odi.SP_SL_P_GIRORECP.args3"  			value="iv_acqdt=<%=acqdt%>">
        <param name="odi.SP_SL_P_GIRORECP.args4"  			value="iv_medicd=<%=medicd%>">
        <param name="odi.SP_SL_P_GIRORECP.args5"  			value="iv_erryn=<%=erryn%>">
        <param name="odi.SP_SL_P_GIRORECP.args6"  			value="iv_recpclsf=<%=recpclsf%>">
        <param name="applet.configmode"               		value="html">
        <param name="applet.isframe"                  		value="true">
        <param name="applet.mode"                     		value="preview">
    </OBJECT>
</BODY>
</HTML>
