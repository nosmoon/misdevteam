<%@ page contentType="text/html; charset=EUC-KR" %>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
        somo.framework.util.*,
"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : main.jsp
* 기능 : 세션처리 및 메인프레임 시작
* 작성일자 : 2009-02-18
* 작성자 : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 	
* 수정자 : 	
* 수정일자 : 	
---------------------------------------------------------------------------------------------------%>
<%!
    // 전달된 쿠키에 설정된 값을 얻어서 리턴한다.
    public String GetCookie(HttpServletRequest req, HttpServletResponse res, String param) throws Exception{
        String ret = "";
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                if(cookies[i].getName().equals(param)){
                    ret = cookies[i].getValue();
					break;
                }
            }
        }
        return ret;
    }
%>
<%
System.out.println("HI");
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
		

		dealmedicd	 = "1";

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

%>

<%
		// LDAP 로그인 업데이트
        ldapp.UpdateInfoLogin updateInfoLogin = new ldapp.UpdateInfoLogin();
        updateInfoLogin.updateldap(uid);

%>

<%
	String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	String strMenuUrl = "";
	String strmainFrame = "";


	if (uid == null) {
		uid = GetCookie(request,response,("uid"));
	}

	if (uid == null){
		response.sendRedirect("/common/jsp/logclose.jsp"); 
	} else {
		strMenuUrl = "/co/mng/1000";
		strmainFrame = "/common/xrw/mainFrame.xrw";
	}

System.out.println("dom" + domainName);
System.out.println("strMenuUrl" + strMenuUrl);
System.out.println("strmainFrame" + strmainFrame);

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
</script>
<script language="javascript" src="/js/TFControlWrite.js"></script>

</HEAD>
<BODY border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="auto">

<form name="SessionInfo">
	<input type="hidden" name="uid"			value="<%= uid %>">
	<input type="hidden" name="emp_no"		value="<%= emp_no %>">
	<input type="hidden" name="emp_nm"		value="<%= emp_nm %>">
	<input type="hidden" name="cmpycd"		value="<%= cmpycd %>">
	<input type="hidden" name="deptcd"		value="<%= deptcd %>">
	<input type="hidden" name="deptnm"		value="<%= deptnm %>">
	<input type="hidden" name="selldeptcd"	value="<%= selldeptcd %>">
	<input type="hidden" name="selldeptnm"	value="<%= selldeptnm %>">
	<input type="hidden" name="areacd"		value="<%= areacd %>">
	<input type="hidden" name="areanm"		value="<%= areanm %>">
	<input type="hidden" name="deptplacyn"	value="<%= deptplacyn %>">
	<input type="hidden" name="jobcd"		value="<%= jobcd %>">
	<input type="hidden" name="jobnm"		value="<%= jobnm %>">
	<input type="hidden" name="posicd"		value="<%= posicd %>">
	<input type="hidden" name="posinm"		value="<%= posinm %>">
	<input type="hidden" name="usertypecd"	value="<%= usertypecd %>">
	<input type="hidden" name="usertypenm"	value="<%= usertypenm %>">
	<input type="hidden" name="email"		value="<%= email %>">
	<input type="hidden" name="dealdeptcd"	value="<%= dealdeptcd %>">
	<input type="hidden" name="dealdeptnm"	value="<%= dealdeptnm %>">
	<input type="hidden" name="hdqtcd"		value="<%= hdqtcd %>">
	<input type="hidden" name="hdqtnm"		value="<%= hdqtnm %>">
	<input type="hidden" name="partcd"		value="<%= partcd %>">
	<input type="hidden" name="partnm"		value="<%= partnm %>">
	<input type="hidden" name="hdqtplacyn"	value="<%= hdqtplacyn %>">
	<input type="hidden" name="partplacyn"	value="<%= partplacyn %>">
	<input type="hidden" name="dealmedicd"	value="<%= dealmedicd %>">
	<input type="hidden" name="domainnm"	value="<%= domainName %>">
</form>

<table cellSpacing="0" cellPadding="0" width="1259" height="830" border="0">
	<tr height="70">
		<td>
			<!-- ===================== TFMenu 부분 ============================================= -->
			<table cellSpacing="0" cellPadding="0" width="100%" height="70" border="0" background="/images/top_bg.gif">
				<tr height="36">
					<td rowspan="3" width="236" height="70" background="/images/top_logo.gif"></td>
					<td width="5" background="transparent"></td>
					<td width="*" align="right" valign="bottom">
						<img src="/images/01.gif">
						<img src="/images/02.gif">
						<img src="/images/03.gif">
						<img src="/images/04.gif">
					</td>
					<td width="5"></td>
				</tr>
				<tr height="26">
					<td width="5" background="transparent"></td>
					<td width="*" align="right" valign="bottom">
						<div id="TFMenuControlLocation">
							<script>
								TFMenuWrite(TFMenuControlLocation, "TFMenu", "<%= domainName + strMenuUrl %>", "998", "26");
							</script>
						</div>
					</td>
					<td width="5" background="transparent"></td>
				</tr>
				<tr height="8">
					<td width="5" background="transparent"></td>
					<td width="*" align="right" valign="bottom"></td>
					<td width="5" background="transparent"></td>
				</tr>
			</table>
			<!-- =============================================================================== -->
		</td>
	</tr>
	<tr>
		<td>

			<!-- ===================== TF Framework 부분 =======================================  -->
			<table cellSpacing="0" cellPadding="0" width="100%" height="800" border="0">
				<tr>
					<td width="100%" height="100%" style="border:0px; padding:0px;">
						<div id="TFViewerControlLocation">
							<script>
								TFViewerWrite(TFViewerControlLocation, "mainFrame", "<%= strmainFrame %>", "100%", "800", "<%= domainName %>");
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
