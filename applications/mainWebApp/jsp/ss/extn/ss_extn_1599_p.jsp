<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : ss_extn_1599_p.jsp
* 기능		: 확장현황-지국확장이사통계-목록인쇄
* 작성일자   : 2004-10-20
* 작성자     : 노상현
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //Session process
   //String bocd      = Util.getSessionParameterValue(request, "bocd", true);         //지국지사코드
   	String bocd     = Util.checkString(request.getParameter("sbocd"   ));			  //지국지사코드
    String url       = request.getRequestURI();                                       //프로그램명
    String uid       = Util.getSessionParameterValue(request, "uid", true);           //사용자아이디
   	String bonm     = Util.Uni2Ksc(Util.checkString(request.getParameter("sbocdnm"   )));			  //지국명
   //String bonm      = Util.getSessionParameterValue(request, "bonm", true);         //지국명
    String sysDate	 = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용

    //request process
	String medicd     = Util.checkString(request.getParameter("medicd"  ));   		//매체코드(리스트)
	String frdst      = "";   		//시작구역
	String todst      = "";   		//종료구역
	String frsubsuprc = "";   	//구독단가(from)
	String tosubsuprc = "";   //구독단가(to)
	String frextndt   = Util.checkString(request.getParameter("frdt"    ));   	    //확장일자(from)
	String toextndt   = Util.checkString(request.getParameter("todt"   ));   	    //확장일자(to)
	String extntp     = "";   		//확장유형
	String extnnm     = "";   		//확장자
	String frvalmm    = "";   	//유가월(from)
	String tovalmm    = "";   	//유가월(to)
	String frmonths   = "";   	//수금개월수(from)
	String tomonths   = "";   	//수금개월수(to)
	String rpttp      = "2";   		//출력형태(1:매체별부수, 2:확장자별부수)
	String clamtmthdcd  = ""; //수금방법
  	String extnblngcd   = "";  //확장자소속코드
	String stafno       = "";       //요원구분코드+요원번호 혹은 지국지사사원번호
   	String extnbocd     = Util.checkString(request.getParameter("sbocd"   ));//확장지국지사코드

    String subsum = Util.checkString(request.getParameter("N")); //소계출력여부
    subsum = ("Y".equals(subsum))? subsum : "N";
    String line = Util.checkString(request.getParameter("line"));
    line = ("1".equals(line))? line : "0";
	System.out.println(bonm);
    System.out.println(url);
    System.out.println(ozServerIP);
%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"              		value="<%=ozServerIP%>">
        <param name="connection.reportname"           		value="SP_SL_P_RDRLIST_CONT.ozr">
        <param name="odi.odinames"                    		value="SP_SL_P_RDRLIST_CONT">
        <param name="connection.pcount" 					value="6">
        <param name="connection.args1" 	value="iv_subsum=<%=subsum%>">
        <param name="connection.args2" 	value="iv_line=<%=line%>">
        <param name="connection.args3" 	value="sv_bonm=<%=bonm%>">
        <param name="connection.args4" 	value="sv_uid=<%=uid%>">
        <param name="connection.args5" 	value="sv_url=<%=url%>">
        <param name="connection.args6" 	value="uv_rpttype=3"><!--1:구역별,2:구독 단가별,3:확장일자별,4:확장자별,5:유가월별,6:수금방법별,7:개월별-->
        <param name="odi.SP_SL_P_RDRLIST_CONT.pcount" 		value="20">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args1"  		value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args2"  		value="iv_medicd=<%=medicd%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args3"  		value="iv_frdst=<%=frdst%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args4"  		value="iv_todst=<%=todst%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args5"  		value="iv_frsubsuprc=<%=frsubsuprc%>">
		<param name="odi.SP_SL_P_RDRLIST_CONT.args6"  		value="iv_tosubsuprc=<%=tosubsuprc%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args7"  		value="iv_frextndt=<%=frextndt%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args8"  		value="iv_toextndt=<%=toextndt%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args9"  		value="iv_extntp=<%=extntp%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args10"  		value="iv_frvalmm=<%=frvalmm%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args11"  		value="iv_tovalmm=<%=tovalmm%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args12"  		value="iv_frmonths=<%=frmonths%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args13"  		value="iv_tomonths=<%=tomonths%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args14"  		value="iv_rpttp=<%=rpttp%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args15"  		value="iv_clamtmthdcd=<%=clamtmthdcd%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args16"  		value="iv_extnblngcd=<%=extnblngcd%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args17"  		value="iv_stafno=<%=stafno%>">
        <param name="odi.SP_SL_P_RDRLIST_CONT.args18"  		value="iv_extnbocd=<%=extnbocd%>">
		<param name="odi.SP_SL_P_RDRLIST_CONT.args19"  		value="iv_free=0"> 
		<param name="odi.SP_SL_P_RDRLIST_CONT.args20"  		value="iv_jm_extn=1">
        <param name="applet.configmode"               		value="html">
        <param name="applet.isframe"                  		value="true">
        <param name="applet.mode"                     		value="preview">
    </OBJECT>

</BODY>
</HTML>