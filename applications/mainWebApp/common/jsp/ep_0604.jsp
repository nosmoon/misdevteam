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
	System.out.println(" =============== ep.jsp =============== ");
		// LDAP 사용자 정보 Request 처리 (현 CRM 사용중인 항목들)
		String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // 아이디
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NO"));         // 사번
		String emp_nm       = request.getHeader("EMP_NM")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NM"));         // 성명
		String cmpycd       = request.getHeader("CMPYCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYCD"));         // 회사
		String deptcd       = request.getHeader("DEPTCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTCD"));         // 부서
		String deptnm       = request.getHeader("DEPTNM")       == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTNM"));         // 부서명
		String selldeptcd	= request.getHeader("SELLDEPTCD")   == null ? "" : Util.Uni2Ksc(request.getHeader("SELLDEPTCD"));     // 판매부서
		String selldeptnm   = request.getHeader("SELLDEPTNM")   == null ? "" : Util.Uni2Ksc(request.getHeader("SELLDEPTNM"));     // 판매부서명
		String areacd       = request.getHeader("AREACD")       == null ? "" : Util.Uni2Ksc(request.getHeader("AREACD"));         // 관리지역코드
		String areanm       = request.getHeader("AREANM")       == null ? "" : Util.Uni2Ksc(request.getHeader("AREANM"));         // 관리지역명
		String deptplacyn   = request.getHeader("DEPTPLACYN")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTPLACYN"));     // 부서장여부
		String jobcd        = request.getHeader("JOBCD")        == null ? "" : Util.Uni2Ksc(request.getHeader("JOBCD"));          // 업무구분
		String jobnm        = request.getHeader("JOBNM")        == null ? "" : Util.Uni2Ksc(request.getHeader("JOBNM"));          // 업무구분명
		String posicd       = request.getHeader("POSICD")       == null ? "" : Util.Uni2Ksc(request.getHeader("POSICD"));         // 직책코드
		String posinm       = request.getHeader("POSINM")       == null ? "" : Util.Uni2Ksc(request.getHeader("POSINM"));         // 직책명
		String usertypecd   = request.getHeader("USERTYPECD")   == null ? "" : Util.Uni2Ksc(request.getHeader("USERTYPECD"));     // 사원구분코드
		String usertypenm   = request.getHeader("USERTYPENM")   == null ? "" : Util.Uni2Ksc(request.getHeader("USERTYPENM"));     // 사원구분명
		String email        = request.getHeader("EMAIL")        == null ? "" : Util.Uni2Ksc(request.getHeader("EMAIL"));          // 이메일
		String dealdeptcd   = request.getHeader("DEALDEPTCD")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEALDEPTCD"));     // 관리부서코드
		String dealdeptnm   = request.getHeader("DEALDEPTNM")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEALDEPTNM"));	  // 관리부서명

		// CIIS 추가 항목들
		String hdqtcd		= request.getHeader("HDQTCD")   	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTCD")); 			// 본부
		String hdqtnm		= request.getHeader("HDQTNM")   	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTNM")); 			// 본부명
		String partcd		= request.getHeader("PARTCD")   	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTCD")); 			// 파트코드
		String partnm		= request.getHeader("PARTNM")   	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTNM")); 			// 파트명
		String hdqtplacyn	= request.getHeader("HDQTPLACYN") 	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTPLACYN")); 		// 본부장여부
		String partplacyn	= request.getHeader("PARTPLACYN") 	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTPLACYN")); 		// 파트장여부
		String dealmedicd	= request.getHeader("DEALMEDICD")  	== null ? "" : Util.Uni2Ksc(request.getHeader("DEALMEDICD")); 		// 관리매체코드
		String epView_seq	= request.getParameter("epView_seq")  	== null ? "" : Util.Uni2Ksc(request.getParameter("epView_seq")); 		// epView_seq

System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
System.out.println("uid : " + uid + " cmpy_cd : " + cmpycd + " deptcd : " + deptcd + " epView_seq : " + epView_seq);
	
		// LDAP 사용자 정보 Session 처리
		session.setAttribute("uid"			,uid		); 		// 아이디
		session.setAttribute("emp_no"		,emp_no     );      // 사번
		session.setAttribute("emp_nm"		,emp_nm    	);      // 성명
		session.setAttribute("cmpycd"		,cmpycd     );      // 회사
		session.setAttribute("deptcd"		,deptcd     );      // 부서
		session.setAttribute("deptnm"		,deptnm     );      // 부서명
		session.setAttribute("selldeptcd"   ,selldeptcd );      // 판매부서
		session.setAttribute("selldeptnm"   ,selldeptnm );      // 판매부서명
		session.setAttribute("dealdeptcd"   ,dealdeptcd );      // 관리부서코드
		session.setAttribute("dealdeptnm"   ,dealdeptnm );      // 관리부서명
		session.setAttribute("areacd"       ,areacd     );      // 관리지역코드
		session.setAttribute("areanm"       ,areanm     );      // 관리지역명
		session.setAttribute("deptplacyn"   ,deptplacyn );      // 부서장여부
		session.setAttribute("jobcd"        ,jobcd      );      // 업무구분
		session.setAttribute("jobnm"        ,jobnm      );      // 업무구분명
		session.setAttribute("posicd"       ,posicd     );      // 직책코드
		session.setAttribute("posinm"       ,posinm     );      // 직책명
		session.setAttribute("usertypecd"   ,usertypecd );      // 사원구분코드
		session.setAttribute("usertypenm"   ,usertypenm );      // 사원구분명
		session.setAttribute("email"        ,email      );      // 이메일
		
		// CIIS 추가 항목들
		session.setAttribute("hdqtcd"       ,hdqtcd     );      // 본부        
		session.setAttribute("hdqtnm"       ,hdqtnm     );      // 본부명      
		session.setAttribute("partcd"       ,partcd     );      // 파트코드    
		session.setAttribute("partnm"       ,partnm     );      // 파트명      
		session.setAttribute("hdqtplacyn" 	,hdqtplacyn );      // 본부장여부  
		session.setAttribute("partplacyn" 	,partplacyn );      // 파트장여부  
		session.setAttribute("dealmedicd"  	,dealmedicd );      // 관리매체코드
		session.setAttribute("epView_seq"  	,epView_seq );      // epView_seq
%>

<%
		// LDAP 로그인 업데이트
        //ldapp.UpdateInfoLogin updateInfoLogin = new ldapp.UpdateInfoLogin();
        //updateInfoLogin.updateldap(uid);
%>

<%
	String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	String strMenuUrl = "";
	String strmainFrame = "";

	if (uid == null) {
		uid = request.getParameter("uid");
	}
	if (uid == null){
		response.sendRedirect("/common/jsp/close.jsp"); 
	} else {
		strMenuUrl = "/co/mng/1000";
		strmainFrame = request.getParameter("url");
	}
	
	System.out.println("ep_strmainFrame == " + strmainFrame);
	System.out.println("ep_domainName == " + domainName);
	System.out.println("ep_epView_seq == " + epView_seq);
	System.out.println(" =============== ep.jsp =============== ");
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

</script>
<script language="javascript" src="/js/TFControlWrite.js"></script>

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
</form>

<table cellSpacing="0" cellPadding="0" width="946" height="728" border="0">
	<tr>
		<td>
			<!-- ===================== TF Framework 부분 =======================================  -->
			<table cellSpacing="0" cellPadding="0" width="100%" height="728" border="0">
				<tr>
					<td width="100%" height="100%" style="border:0px; padding:0px;">
						<div id="TFViewerControlLocation">
							<script>
								TFViewerWrite(TFViewerControlLocation, "mainFrame", "<%=strmainFrame%>", "100%", "728", "<%=domainName%>");
							</script>
						</div>
					</td>
				</tr> 
			</table>

		</td>
	</tr>
</table>

</body>
</HTML>
