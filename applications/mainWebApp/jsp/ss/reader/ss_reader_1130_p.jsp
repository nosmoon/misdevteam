<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : ss_reader_1130_p.jsp
* 기능       : 독자현황-불편접수-목록인쇄
* 작성일자   : 2004-10-04
* 작성자     : 노상현
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   : 화면검색 목록과 동일하게 출력
* 수정자     : 김대섭
* 수정일자   : 20041214
* 백업파일명 : 없음(추가)
---------------------------------------------------------------------------------------------------%>
<%
    //Session process
    /*
    String bocd      = Util.getSessionParameterValue(request, "bocd", true);          //지국지사코드
    String url       = request.getRequestURI();                                       //프로그램명
    String uid       = Util.getSessionParameterValue(request, "uid", true);           //사용자아이디
    String bonm      = Util.getSessionParameterValue(request, "bonm", true);          //지국명
    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용
	*/

    //request process
	String fracpndt = Util.checkString(request.getParameter("frdt"    ));   	//등록일자(From)
	String toacpndt = Util.checkString(request.getParameter("todt"    ));   	//등록일자(To)
    String dscttypecd   = Util.checkString(request.getParameter("dscttypecd"    ));   	//불편유형코드

    String deptcd = Util.checkString(request.getParameter("deptcd"));  //부서코드
    String areacd = Util.checkString(request.getParameter("areacd"));  //지역코드
    String bocd = Util.checkString(request.getParameter("bocd"));      //지국코드
    String acpnpathcd = Util.checkString(request.getParameter("acpnpathcd"));  //경로코드
    String fromtogb = Util.checkString(request.getParameter("fromtogb"));  //기간선택종류
    String rdrnm = Util.Uni2Ksc(Util.checkString(request.getParameter("rdrnm"))); //독자명
    String rdr_no = Util.Uni2Ksc(Util.checkString(request.getParameter("rdr_no"))); //독자번호
    String titl = Util.Uni2Ksc(Util.checkString(request.getParameter("titl"))); //제목
    String cont = Util.Uni2Ksc(Util.checkString(request.getParameter("cont"))); //내용
    String bocnfmyn = Util.checkString(request.getParameter("bocnfmyn"));  //지국지사확인상태
    String boprocyn = Util.checkString(request.getParameter("boprocyn"));  //지국지사처리여부 (Y:처리, N:미처리)
%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"              		value="<%=ozServerIP%>">
        <param name="connection.reportname"           		value="SP_SS_P_RDR_DSCT.ozr">
        <param name="odi.odinames"                    		value="SP_SS_P_RDR_DSCT">

        <param name="odi.SP_SS_P_RDR_DSCT.pcount" 		value="14">
        <param name="odi.SP_SS_P_RDR_DSCT.args1"  		value="iv_fracpndt=<%=fracpndt%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args2"  		value="iv_toacpndt=<%=toacpndt%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args3"  		value="iv_dscttypecd=<%=dscttypecd%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args4"  		value="iv_deptcd=<%=deptcd%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args5"  		value="iv_areacd=<%=areacd%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args6"  		value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args7"  		value="iv_fromtogb=<%=fromtogb%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args8"  		value="iv_rdrnm=<%=rdrnm%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args9"  		value="iv_rdr_no=<%=rdr_no%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args10"  		value="iv_titl=<%=titl%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args11"  		value="iv_cont=<%=cont%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args12"  		value="iv_bocnfmyn=<%=bocnfmyn%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args13"  		value="iv_boprocyn=<%=boprocyn%>">
        <param name="odi.SP_SS_P_RDR_DSCT.args14"  		value="iv_acpnpathcd=<%=acpnpathcd%>">


        <param name="applet.configmode"               		value="html">
        <param name="applet.isframe"                  		value="true">
        <param name="applet.mode"                     		value="preview">
    </OBJECT>
</BODY>
</HTML>

