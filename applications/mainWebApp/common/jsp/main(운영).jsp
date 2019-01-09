<%@ page contentType="text/html; charset=KSC5601"%>
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

		String uid = (String)session.getAttribute("ACCT_CD") == null ? "" : (String)session.getAttribute("ACCT_CD");				// 아이디
		String emp_no = (String)session.getAttribute("EMPNO") == null ? "" : (String)session.getAttribute("EMPNO");				// 사번
		String emp_nm = (String)session.getAttribute("NM") == null ? "" : (String)session.getAttribute("NM");					// 성명

		String cmpycd = (String)session.getAttribute("BLNG_CMPY_CD") == null ? "" : (String)session.getAttribute("BLNG_CMPY_CD");		// 회사
		String cmpynm = (String)session.getAttribute("BLNG_CMPY_NM") == null ? "" : (String)session.getAttribute("BLNG_CMPY_NM");		// 회사명

		String deptcd = (String)session.getAttribute("PART_CD") == null ? "" : (String)session.getAttribute("PART_CD");			// 부서
		String deptnm = (String)session.getAttribute("PART_NM") == null ? "" : (String)session.getAttribute("PART_NM");			// 부서명

		String selldeptcd = (String)session.getAttribute("CRM_SELL_DEPT_CD") == null ? "" : (String)session.getAttribute("CRM_SELL_DEPT_CD");		// 판매부서
		String selldeptnm = (String)session.getAttribute("CRM_SELL_DEPT_NM") == null ? "" : (String)session.getAttribute("CRM_SELL_DEPT_NM");		// 판매부서명
		
		String areacd = (String)session.getAttribute("CRM_MANG_AREA_CD") == null ? "" : (String)session.getAttribute("CRM_MANG_AREA_CD");			// 관리지역코드
		String areanm = (String)session.getAttribute("CRM_MANG_AREA_NM") == null ? "" : (String)session.getAttribute("CRM_MANG_AREA_NM");			// 관리지역명

		
		
		String jobcd = (String)session.getAttribute("JOB_CLSF_CD") == null ? "" : (String)session.getAttribute("JOB_CLSF_CD");				// 업무구분
		String jobnm = (String)session.getAttribute("JOB_CLSF_NM") == null ? "" : (String)session.getAttribute("JOB_CLSF_NM");				// 업무구분명
		
		String posicd = (String)session.getAttribute("DTY_CD") == null ? "" : (String)session.getAttribute("DTY_CD");			// 직책코드
		String posinm = (String)session.getAttribute("DTY_NM") == null ? "" : (String)session.getAttribute("DTY_NM");			// 직책명
		
		String usertypecd = (String)session.getAttribute("EMP_CLSF_CD") == null ? "" : (String)session.getAttribute("EMP_CLSF_CD");		// 사원구분코드
		String usertypenm = (String)session.getAttribute("EMP_CLSF_NM") == null ? "" : (String)session.getAttribute("EMP_CLSF_NM");		// 사원구분명
		
		String email = (String)session.getAttribute("EMAIL_ID") == null ? "" : (String)session.getAttribute("EMAIL_ID");				// 이메일

		String dealdeptcd = (String)session.getAttribute("CRM_MANG_DEPT_CD") == null ? "" : (String)session.getAttribute("CRM_MANG_DEPT_CD");		// 관리부서코드
		String dealdeptnm = (String)session.getAttribute("CRM_MANG_DEPT_NM") == null ? "" : (String)session.getAttribute("CRM_MANG_DEPT_NM");		// 관리부서명
			
		String mobile = (String)session.getAttribute("PTPH") == null ? "" : (String)session.getAttribute("PTPH");			// 휴대전화
		String dealmedicd	= (String)session.getAttribute("dealmedicd") == null ? "" : (String)session.getAttribute("dealmedicd"); 		// 관리매체코드
		
		// 정체불명
		String hdqtcd = "";			// 본부코드
		String hdqtnm = "";			// 본부명
		String partcd = "";			// 파트코드
		String partnm = "";			// 파트명
		String deptplacyn = "";												// 부서장여부
		String hdqtplacyn = "";												// 본부장여부
		String partplacyn = "";												// 파트장여부
		// -------

		if(uid.equals("")){
			response.sendRedirect("/");
		}
		
		/*
		// LDAP 사용자 정보 Request 처리 (현 CRM 사용중인 항목들)
		String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // 아이디
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NO"));         // 사번
		String emp_nm       = request.getHeader("EMP_NM")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NM"));         // 성명
		String cmpycd       = request.getHeader("CMPYCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYCD"));         // 회사
		String cmpynm       = request.getHeader("CMPYNM")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYNM"));         // 회사명
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
		String mobile	= request.getHeader("MOBILE")  	== null ? "" : Util.Uni2Ksc(request.getHeader("MOBILE")); 		// 관리매체코드		
		*/
		if("".equals(dealmedicd))	dealmedicd = "1";

		// LDAP 사용자 정보 Session 처리
		

		session.setAttribute("uid"			,uid		); 		// 아이디
		//	자재에서 추가하는 로직
		//	분공장및 자회사에서 로그인하는 경우 사번이 없이 아이디만 있게 된다.
		//	아이디를 가지고 사번으로 사용
		System.out.println("emp_no=_" + emp_no + "_");
		if (emp_no.equals("")){
			session.setAttribute("emp_no"		,uid     );      // 사번
		} else {
			session.setAttribute("emp_no"		,emp_no     );      // 사번
		}
		session.setAttribute("emp_nm"		,emp_nm    	);      // 성명
		session.setAttribute("cmpycd"		,cmpycd     );      // 회사
		session.setAttribute("cmpynm"		,cmpynm     );      // 회사명
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
		session.setAttribute("mobile"  			,mobile );      		// 사원전화번호
		
		// CIIS 추가 항목들  - 본부(명),파트(명) LDAP에서 관리 안되는 관계로 삭제함.
		//session.setAttribute("hdqtcd"     ,hdqtcd     );      // 본부        
		//session.setAttribute("hdqtnm"     ,hdqtnm     );      // 본부명      
		//session.setAttribute("partcd"     ,partcd     );      // 파트코드    
		//session.setAttribute("partnm"     ,partnm     );      // 파트명      
		session.setAttribute("hdqtplacyn" 	,hdqtplacyn );      // 본부장여부  
		session.setAttribute("partplacyn" 	,partplacyn );      // 파트장여부  
		session.setAttribute("dealmedicd"  	,dealmedicd );      // 관리매체코드
		

//System.out.println("request.getHeader(emp_nm) : " + request.getHeader("EMP_NM"));


//System.out.println("  emp_nm  : " + emp_nm);
//System.out.println("  sess emp_nm : " + Util.getSessionParameterValue(request, "emp_nm", true));
  
%>

<%
		//boolean updateyn = false;
		// LDAP 로그인 업데이트
		//System.out.println("uid : " + uid + " updateinflogin");
        //ldapp.UpdateInfoLogin updateInfoLogin = new ldapp.UpdateInfoLogin();
        //updateyn = updateInfoLogin.updateldap(uid);
		//System.out.println("updateyn : " + updateyn + " updateyn");

%>
<iframe frameborder=0 name=bodyframe scrolling=no src="http://220.73.135.81:40003/IMPlus/customer/setLastLoginDate.jsp?SERVICE_ID=MISCOM&USER_ID=<%=uid%>&SERVICE_USER_ID=<%=uid%>" width="500" height="0"></iframe>
<%
	String domainName = request.getScheme()+"://"+request.getServerName()+request.getContextPath(); // ":"+request.getServerPort()+
	String strMenuUrl = "";
	String strmainFrame = "";

System.out.println("uid : " + uid);
	if (uid == null) {
		uid = GetCookie(request,response,"uid");
System.out.println("uid null : " + uid);
	}

	if (uid == null){
		response.sendRedirect("/common/jsp/logclose.jsp"); 
	} else {
		strMenuUrl = "/co/mng/1000";
		strmainFrame = "/common/xrw/mainFrame.xrw";
	}

	System.out.println("strmainFrame == " + strmainFrame);
	System.out.println("domainName == " + domainName);
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
<script language="javascript" src="/js/swfShow.js"></script>
<script language="javascript">
    function jsNewModalWinNoS( url, args, sizeW, sizeH )
    {
        opt = "center:yes; help:no; resizable:no; scroll:no; status:no; location=no;";
        sizeH = parseInt(sizeH) + 20;
        window.showModalDialog(url, args, "dialogWidth:" + sizeW + "px; dialogHeight:" + sizeH  +"px; "+ opt );
        return;
    }
	function pop_system(){
		jsNewModalWinNoS("/html/popup01_2.html","a","450","500");
	}
</script>
<script type="text/javascript">
    // 빈 frame 생성
    document.write('<iframe id="hiddenFrame" style="display:none" width="0" height="0" ></iframe>');

    // 주기적으로 실행될 함수
    function onScheduler(){

        // 빈 페이지를 요청
        var dataobj = document.frames["hiddenFrame"];
        if(dataobj){
            dataobj.location.href = "http://ciis.chosun.com/common/jsp/blank.jsp";
        }
        // 10분 간격(세션 설정값에 따라 변경)
        setTimeout("onScheduler()", 1000*60*10);
    }

    // 초기 실행(form의 onLoad에 위치하여도 됨)
    onScheduler();

</script>
</HEAD>
<BODY border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="no">
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
	<input type="hidden" name="mobile"	value="<%= mobile %>">	
</form>
<%

System.out.println("마지막 XRW 호출 전 : uid [" + uid + "] 회사코드 : [" + cmpycd +"]");
System.out.println("마지막 XRW 호출 전 : uid [" + uid + "] 회사코드 : [" + cmpycd +"]");
System.out.println("마지막 XRW 호출 전 : uid [" + uid + "] 회사코드 : [" + cmpycd +"]");
System.out.println("마지막 XRW 호출 전 : uid [" + uid + "] 회사코드 : [" + cmpycd +"]");
System.out.println("마지막 XRW 호출 전 : uid [" + uid + "] 회사코드 : [" + cmpycd +"]");
System.out.println("xrw last : " + uid);
System.out.println("xrw last : " + emp_no);
System.out.println("xrw last : " + emp_nm);
System.out.println("xrw last : " + cmpycd);
System.out.println("xrw last : " + deptcd);
System.out.println("xrw last : " + deptnm);
System.out.println("xrw last : " + selldeptcd);
System.out.println("xrw last : " + selldeptnm);
System.out.println("xrw last : " + areacd);
System.out.println("xrw last : " + areanm);
System.out.println("xrw last : " + deptplacyn);
System.out.println("xrw last : " + jobcd);
System.out.println("xrw last : " + jobnm);
System.out.println("xrw last : " + posicd);
System.out.println("xrw last : " + posinm);
System.out.println("xrw last : " + usertypecd);
System.out.println("xrw last : " + usertypenm);
System.out.println("xrw last : " + email);
System.out.println("xrw last : " + dealdeptcd);
System.out.println("xrw last : " + dealdeptnm);
System.out.println("xrw last : " + hdqtcd);
System.out.println("xrw last : " + hdqtnm);
System.out.println("xrw last : " + partcd);
System.out.println("xrw last : " + partnm);
System.out.println("xrw last : " + hdqtplacyn);
System.out.println("xrw last : " + partplacyn);
System.out.println("xrw last : " + dealmedicd);
System.out.println("xrw last : " + domainName);
System.out.println("session " + Util.getSessionParameterValue(request, "cmpycd", true));
%>

<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
    <tr height="70">
        <td>
            <!-- ===================== TFMenu 부분 ============================================= -->
            <table cellSpacing="0" cellPadding="0" width="100%" height="70" border="0" background="/images/top_bg.gif">
                <tr>
					<td width="20" ></td>                
                    <!--td valign="middle" rowspan=3 border=0 align="left" width="236" height="70">
                    	<img width="236" height="60" src="/images/top_logo3.gif">
                    </td-->
			        <td valign="middle" rowspan=3 border=0 align="left" width="100" height="70">
			        	<!--img src="/images/top_logo3.gif" width="115" height="46" alt=""-->
			        	<!--img src="/images/Logo.gif" width="100" height="40" alt=""-->
			        	<script type="text/javascript">swfShow("/flash/logo01_new.swf", 115, 46)</script>
			        	<br>
			        </td>
			        <td valign="middle" rowspan=3 width="126" height="70">
			            <table width="100%" border="0" cellspacing="0" cellpadding="0">
			              <tr>
		                	<%-- if(cmpycd.equals("100")){--%>
		                	<!--td align="left">
		                		&nbsp;<script type="text/javascript">swfShow("/flash/logo02.swf", 100, 22)</script><br>
		                	</td-->
			                <%--}else{%-->
			                <td align="center">
			                	&nbsp;<span style="COLOR:#6b6b6b;FILTER:shadow(color=#cccccc);height:8px;font-size:11pt;"><b><%=cmpynm%></b></span>
			                </td>
			                <%--}--%>
			                <td align="center">
			                	&nbsp;<span style="COLOR:#6b6b6b;FILTER:shadow(color=#cccccc);height:8px;font-size:11pt;"><b><%=cmpynm%></b></span>
			                </td>			                
			                <!-- img src="/images/Logo_Txt.gif" width="100" height="20" alt="" -->
			              </tr>
			              <tr>
			                <td valign="bottom" height="22" align="center"><font style="font-size:9pt; color:#808080;filter:glow(color=green, strength=8);"><%=deptnm%>&nbsp;<%=emp_nm%></font></td>
			              </tr>
			          </table>
			        </td>
                    <td width="*" valign="bottom" >
						<script type="text/javascript">swfShow("/flash/ciis_txt.swf", 483, 24)</script><br>                    
                    	<!--font size="2">통합정보지원시스템(CIIS : Chosunilbo Integrated Information System)</font-->
                    </td>
                    <td align="right" valign="bottom"  height="18">
                        <a href="/common/jsp/main.jsp"><img height="18" border=0 src="/images/01.gif"></a>
                        <a href="_self" onclick="pop_system();return false;"><img height="18" border=0 src="/images/03.gif"></a>
						<% //---------------------- GENICS ASSOCIATE ------------------------// %> 
                        <!--
						<a href="/common/jsp/logclose.jsp"><img height="18" border=0 src="/images/04.gif"></a>
						-->
						<a href="/genics/logout.jsp"><img height="18" border=0 src="/images/04.gif"></a>
						<% //---------------------- GENICS ASSOCIATE ------------------------// %> 
                    </td>
                    <td width="5"></td>
                </tr>
                <tr height="26">
                    <td width="20" ></td>
                    <td colspan=3 width="*" align="left" valign="bottom">
                        <div id="TFMenuControlLocation">
                            <script>
                                //TFMenuWrite(TFMenuControlLocation, "TFMenu", "<%= domainName + strMenuUrl %>", "998", "26");
                                TFMenuWrite(TFMenuControlLocation, "TFMenu", "<%= domainName + strMenuUrl %>", "100%", "26");
                            </script>
                        </div>
                    </td>
                    <td width="5" ></td>
                </tr>
                <tr height="8">
                    <td width="20" ></td>
                    <td colspan=3 width="*" align="right" valign="bottom"></td>
                    <td width="5" ></td>
                </tr>
            </table>
            <!-- =============================================================================== -->
        </td>
    </tr>
	<tr>
		<td>

			<!-- ===================== TF Framework 부분 =======================================  -->
			<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
				<tr>
					<td width="100%" height="100%" style="border:0px; padding:0px;">
						<div id="TFViewerControlLocation">
							<script>
								TFViewerWrite(TFViewerControlLocation, "mainFrame", "<%= strmainFrame %>", "100%", "100%", "<%= domainName %>");
							</script>
						</div>
					</td>
				</tr> 
			</table>

		</td>
	</tr>
</table>
<% //---------------------- GENICS ASSOCIATE ------------------------// %> 
<iframe id="_sso_frame" name="_sso_frame" width="500" height="0" frameborder="0" src="http://ciis.chosun.com/genics/sso_inc/inc_agent.jsp"></iframe>
<% //---------------------- GENICS ASSOCIATE ------------------------// %> 

</body>
</HTML>



