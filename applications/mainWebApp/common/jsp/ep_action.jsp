<%@ page contentType="text/html; charset=EUC-KR" %>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
        somo.framework.util.*;
"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ep.jsp
* 기능 : EP를 통해서 팝업화면으로 접속한 사용자에 대한 세션처리 및 해당 XRW 호출
* 작성일자 : 2009-03-24
* 작성자 : 양정녕
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 	
* 수정자 : 	
* 수정일자 : 	
---------------------------------------------------------------------------------------------------%>

<%
		// LDAP 사용자 정보 Request 처리 (현 CRM 사용중인 항목들)
		String uid			= (String)session.getAttribute("uid");
		String emp_no       = (String)session.getAttribute("emp_no");
		String emp_nm       = (String)session.getAttribute("emp_nm");
		String cmpycd       = (String)session.getAttribute("cmpycd");
		String deptcd       = (String)session.getAttribute("deptcd");
		String deptnm       = (String)session.getAttribute("deptnm");
		String selldeptcd	= (String)session.getAttribute("selldeptcd");
		String selldeptnm   = (String)session.getAttribute("selldeptnm");
		String areacd       = (String)session.getAttribute("areacd");
		String areanm       = (String)session.getAttribute("areanm");
		String deptplacyn   = (String)session.getAttribute("deptplacyn");
		String jobcd        = (String)session.getAttribute("jobcd");
		String jobnm        = (String)session.getAttribute("jobnm");
		String posicd       = (String)session.getAttribute("posicd");
		String posinm       = (String)session.getAttribute("posinm");
		String usertypecd   = (String)session.getAttribute("usertypecd");
		String usertypenm   = (String)session.getAttribute("usertypenm");
		String email        = (String)session.getAttribute("email");
		String dealdeptcd   = (String)session.getAttribute("dealdeptcd");
		String dealdeptnm   = (String)session.getAttribute("dealdeptnm");

		// CIIS 추가 항목들
		String hdqtcd		= (String)session.getAttribute("hdqtcd");
		String hdqtnm		= (String)session.getAttribute("hdqtnm");
		String partcd		= (String)session.getAttribute("partcd");
		String partnm		= (String)session.getAttribute("partnm");
		String hdqtplacyn	= (String)session.getAttribute("hdqtplacyn");
		String partplacyn	= (String)session.getAttribute("partplacyn");
		String dealmedicd	= (String)session.getAttribute("dealmedicd");
		String epView_seq	= (String)session.getAttribute("epView_seq");
		String dlco_no  	= (String)session.getAttribute("dlco_no");


        //////////////////////////////////////////////////////////////////
        //
        //  포워딩되는 URL에 parameter passing 기능추가
        //  by 권정윤 at 20090612
        //
        //  ex) .../ep.jsp?url=/.../aa.xrw?param1=&param2= 
        String url = request.getParameter("url");
        if(url == null) url = "";
        StringBuffer params = new StringBuffer();
        
        int pos = url.indexOf("?");
        if(pos > 0 ) {
            String [] tokens = url.substring(pos+1).split("&");
            url = url.substring(0,pos);

            for( int i = 0; tokens != null && i < tokens.length; i++) {
                String token = tokens[i];

                int pos2 = token.indexOf("=");

                if(pos2 > 0) {
                    session.setAttribute(token.substring(0,pos2),token.substring(pos2+1));
                }
            }
        }


	String domainName = request.getScheme()+"://"+request.getServerName()+":7001"+request.getContextPath();
	String strMenuUrl = "";
	String strmainFrame = "";

	strMenuUrl = "/co/mng/1000";
	strmainFrame = request.getParameter("url");
	
%>
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=euc-kr">
<title>조선일보통합정보지원시스템</title>
<Script language="javascript" for="TFMenu" event="OnClickedMenuItem(idx)">
	//클릭한 메뉴의 하위단계를 레프트메뉴트리로 보내기
	document.all.mainFrame.window.javaScript.loadLeftMenuXml(idx);
	document.all.mainFrame.window.javaScript.onBtnTree("top");
	//업무화면을 호출
	//document.all.mainFrame.window.javaScript.onLoadPage(idx);
	
	model.property("epView_seq") = "<%= epView_seq %>";
	model.property("dlco_no") = "<%= dlco_no %>";
</script>
<script language="javascript" src="/js/TFControlWrite.js"></script>
<!--
<script type="text/javascript">
    // 빈 frame 생성
    document.write('<iframe id="hiddenFrame" style="display:none" width="0" height="0" ></iframe>');

    // 주기적으로 실행될 함수
    function onScheduler(){

        // 빈 페이지를 요청
        var dataobj = document.frames["hiddenFrame"];
        if(dataobj){
            dataobj.location.href = "http://ess.chosun.com/common/jsp/refresh.jsp";
        }
        // 10분 간격(세션 설정값에 따라 변경)
        setTimeout("onScheduler()", 1000*60*10);
    }

    // 초기 실행(form의 onLoad에 위치하여도 됨)
    onScheduler();

</script>
-->
</HEAD>
<BODY border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="auto">

<form name="SessionInfo">
	<input type="hidden" name="uid"			value="<%=uid%>">
	<input type="hidden" name="emp_no"		value="<%=emp_no%>">
	<input type="hidden" name="emp_nm"		value="<%=emp_nm%>">
	<input type="hidden" name="cmpycd"		value="<%=cmpycd%>">
	<input type="hidden" name="deptcd"		value="<%=deptcd%>">
	<input type="hidden" name="deptnm"		value="<%=deptnm%>">
	<input type="hidden" name="selldeptcd"	value="<%=selldeptcd%>">
	<input type="hidden" name="selldeptnm"	value="<%=selldeptnm%>">
	<input type="hidden" name="areacd"		value="<%=areacd%>">
	<input type="hidden" name="areanm"		value="<%=areanm%>">
	<input type="hidden" name="deptplacyn"	value="<%=deptplacyn%>">
	<input type="hidden" name="jobcd"		value="<%=jobcd%>">
	<input type="hidden" name="jobnm"		value="<%=jobnm%>">
	<input type="hidden" name="posicd"		value="<%=posicd%>">
	<input type="hidden" name="posinm"		value="<%=posinm%>">
	<input type="hidden" name="usertypecd"	value="<%=usertypecd%>">
	<input type="hidden" name="usertypenm"	value="<%=usertypenm%>">
	<input type="hidden" name="email"		value="<%=email%>">
	<input type="hidden" name="dealdeptcd"	value="<%=dealdeptcd%>">
	<input type="hidden" name="dealdeptnm"	value="<%=dealdeptnm%>">
	<input type="hidden" name="hdqtcd"		value="<%=hdqtcd%>">
	<input type="hidden" name="hdqtnm"		value="<%=hdqtnm%>">
	<input type="hidden" name="partcd"		value="<%=partcd%>">
	<input type="hidden" name="partnm"		value="<%=partnm%>">
	<input type="hidden" name="hdqtplacyn"	value="<%=hdqtplacyn%>">
	<input type="hidden" name="partplacyn"	value="<%=partplacyn%>">
	<input type="hidden" name="dealmedicd"	value="<%=dealmedicd%>">
	<input type="hidden" name="domainnm"	value="<%=domainName%>">
	<input type="hidden" name="epView_seq"	value="<%=epView_seq%>">
	<input type="hidden" name="dlco_no"	value="<%=dlco_no%>">
</form>

<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
	<tr>
		<td>
			<!-- ===================== TF Framework 부분 =======================================  -->
			<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
				<tr>
					<td width="100%" height="100%" style="border:0px; padding:0px;">
						<div id="TFViewerControlLocation">
							<script>
								TFViewerWrite(TFViewerControlLocation, "essmainFrame", "<%=strmainFrame%>", "100%", "100%", "<%=domainName%>");
							</script>
						</div>
<!-- fileDownload를 위한 hidden iframe 시작 -->
	<div><iframe id="hiddenIframe" src="" style="width: 0px; height: 0px; visibility: hidden;" ></iframe></div>
<!-- fileDownload를 위한 hidden iframe 끝 -->							
					</td>
				</tr> 
			</table>

		</td>
	</tr>
</table>

</body>
</HTML>
