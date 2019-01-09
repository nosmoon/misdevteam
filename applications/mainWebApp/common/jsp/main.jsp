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
		// LDAP 사용자 정보 Request 처리 (현 CRM 사용중인 항목들)
		String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // 아이디
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NO"));         // 사번
		String emp_nm       = request.getHeader("EMP_NM")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NM"));         // 성명
		String cmpycd       = request.getHeader("CMPYCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYCD"));         // 회사
		String cmpynm       = request.getHeader("CMPYNM")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYNM"));         // 회사		
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
		

//	uid="c191003";	
//	emp_no="191003";
//	deptcd="154500";
//	deptnm="CSI팀";
//	cmpycd="100";
//	emp_nm="이기춘";
//	dealmedicd = "1";

//	uid="c190053";	
//	emp_no="190053";
//	deptcd="154500";
//	deptnm="CSI팀";
//	cmpycd="100";
//	emp_nm="이기웅";
	
//	uid="c153001";	
//	emp_no="153001";
//	deptcd="154500";
//	deptnm="CSI팀";
//	cmpycd="100";
//	emp_nm="방우영";

// uid="c193057";//"c153001";
// emp_no="193057";//"210001";
// deptcd="541100";//"361100";
//  deptnm="AD플래닝팀";//"임원실";
//  cmpycd="100";
//  cmpynm="조선일보";
//  emp_nm="박남규";
  
//  uid="c153001";
//  uid="dit0010";  
//  emp_no="210001";
//  emp_no="it0010";  
//  deptcd="361100";
 // deptnm="임원실";
//  cmpycd="100";
 // cmpynm="조선일보";
 // emp_nm="방우영";
  
  //uid="c194062";
  //emp_no="194062";
  //deptcd="361100";
  //deptnm="AD본부";
  //cmpycd="100";
  //cmpynm="조선일보";
  //emp_nm="동희욱";  
  
//  uid="a211127";
//  emp_no="211127";
//  deptcd="361100";
//  deptnm="cstv";
//  cmpycd="500";
//  cmpynm="cstv";
 // emp_nm="조선방송";
  
//  uid="a211510";
//  emp_no="211510";
//  deptcd="255000";
//  deptnm="cstv";
//  cmpycd="500";
//  cmpynm="cstv";
//  emp_nm="조선방송";  

//TV조선 인사
	uid="a211095";	
	emp_no="211095";
	deptcd="700200";
	deptnm="인사팀";
	cmpycd="500";
	emp_nm="김덕영";	


//TV조선 인사
    uid="cit0022";	
	emp_no="it0022";
	deptcd="000000";
	deptnm="인사팀";
	cmpycd="100";
	  emp_nm="test";	


	//인사
	uid="cit0022";	
	emp_no="it0022";
	deptcd="000000";
	deptnm="MIS팀";
	cmpycd="100";
	emp_nm="이가연";			
	
//인사평가
       uid="c189034";      emp_no="189034";
    deptcd="250000";   cmpynm="조선일보"; deptnm="편집국";
   cmpycd="100";   emp_nm="이충일"; 

   	//뉴미디어
	uid="c212006";	
	emp_no="212006";
	deptcd="570000";
	deptnm="뉴미디어실";
	cmpycd="100";
	emp_nm="유선아";	
	dealmedicd	 = "5"; 

//출판 뉴스프레스 
 uid="x213057";
 emp_no="213057";
 deptcd="010500";
 deptnm="조선메거진";
 cmpycd="326";
 cmpynm="조선메거진";
 emp_nm="조선메거진";	
 dealmedicd	 = "2";	 

  dealmedicd	 = "3";              
  //TV조선 광고
	uid="ait0015";	
	emp_no="ait0015";
	deptcd="154500";
	deptnm="MIS팀";
	cmpycd="500";
	emp_nm="김상훈";	
	
	//통일과나눔
	uid="tn9999";	
	emp_no="tn9999";
	deptcd="360000";
	deptnm="MIS팀";
	cmpycd="700";
	emp_nm="김상훈";		

   //광고지사
	uid="c00038160";	
	emp_no="00038160";
	deptcd="000000";
	deptnm="강남광고";
	cmpycd="100";
	emp_nm="김상훈";
	 
 	  //광고
	uid="cit0015";	
	emp_no="it0015";
	deptcd="360000";
	deptnm="MIS팀";
	cmpycd="100";
	emp_nm="김상훈";	
	
	//angular 로그인 테스트
	uid="dit0010";
	  dealmedicd	 = "3"; 			  	
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
		session.setAttribute("cmpynm"		,cmpynm     );      // 회사
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
		
		// CIIS 추가 항목들  - 본부(명),파트(명) LDAP에서 관리 안되는 관계로 삭제함.
		//session.setAttribute("hdqtcd"     ,hdqtcd     );      // 본부        
		//session.setAttribute("hdqtnm"     ,hdqtnm     );      // 본부명      
		//session.setAttribute("partcd"     ,partcd     );      // 파트코드    
		//session.setAttribute("partnm"     ,partnm     );      // 파트명      
		session.setAttribute("hdqtplacyn" 	,hdqtplacyn );      // 본부장여부  
		session.setAttribute("partplacyn" 	,partplacyn );      // 파트장여부  
		session.setAttribute("dealmedicd"  	,dealmedicd );      // 관리매체코드
		session.setAttribute("mobile"  	,mobile );      // 관리매체코드		
		
//System.out.println("request.getHeader(emp_nm) : " + request.getHeader("EMP_NM"));


//System.out.println("  emp_nm  : " + emp_nm);
//System.out.println("  sess emp_nm : " + Util.getSessionParameterValue(request, "emp_nm", true));
  
%>

<%
		// LDAP 로그인 업데이트
        // ldapp.UpdateInfoLogin updateInfoLogin = new ldapp.UpdateInfoLogin();
        // updateInfoLogin.updateldap(uid);

%>

<%
	String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	String strMenuUrl = "";
	String strmainFrame = "";

System.out.println("uid : " + uid);
	if (uid == null) {
		uid = GetCookie(request,response,"uid");
System.out.println("uid null : " + uid);
	}

	if (uid == null){
		response.sendRedirect("/common/jsp/logclose.jsp"); 
	}
	else {
		if(uid.equals("dit0010")){
		response.sendRedirect("/menu_test.html");
		}
			strMenuUrl = "/co/mng/1000";
			strmainFrame = "/common/xrw/mainFrame.xrw";
		
	}
	System.out.println("domainName == " + domainName);
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
<script language="javascript" src="/js/Layer.js"></script>
<script language="javascript" src="/js/Mouse.js"></script>
<script language="javascript" src="/js/Fire.js"></script>
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

	function JSFX_StartEffects(){
				JSFX.Fire(40,0);
	}

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

<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
    <tr height="70">
        <td>
            <!-- ===================== TFMenu 부분 ============================================= -->
            <table cellSpacing="0" cellPadding="0" width="100%" height="70" border="0" background="/images/top_bg.gif">
                <tr>
					<td width="20" background="transparent"></td>                
                    <!--td valign="middle" rowspan=3 border=0 align="left" width="236" height="70">
                    	<img width="236" height="60" src="/images/top_logo3.gif">
                    </td-->
			        <td valign="middle" rowspan=3 border=0 align="left" width="100" height="70">
			        	<!--img src="/images/Logo.gif" width="115" height="46" alt=""-->
			        	<!--img src="/images/Logo.gif" width="100" height="40" alt=""-->
			        	<script type="text/javascript">swfShow("/flash/logo01.swf", 115, 46)</script><br>
			        </td>
			        <td valign="middle" rowspan=3 width="126" height="70">
			            <table width="100%" border="0" cellspacing="0" cellpadding="0">
			              <tr>
		                	<% if(cmpycd.equals("100")){%>
		                	<td align="left">
		                		&nbsp;<script type="text/javascript">swfShow("/flash/logo02.swf", 100, 22)</script><br>
		                	</td>
			                <%}else{%>
			                <td align="center">
			                	&nbsp;<span style="COLOR:#6b6b6b;FILTER:shadow(color=#cccccc);height:8px"><font size=5><b><%=cmpynm%></b></font></span>
			                </td>
			                <%}%>
			                <!-- img src="/images/Logo_Txt.gif" width="100" height="20" alt="" -->
			              </tr>
			              <tr>
			                <td valign="bottom" height="22" align="center"><font style="font-size:9pt; color:#808080;filter:glow(color=green, strength=8)"><%=deptnm%>&nbsp;<%=emp_nm%></font></td>
			              </tr>
			          </table>
			        </td>
                    <td width="*" valign="bottom" background="transparent">
						<script type="text/javascript">swfShow("/flash/ciis_txt.swf", 483, 24)</script><br>                    
                    	<!--font size="2">통합정보지원시스템(CIIS : Chosunilbo Integrated Information System)</font-->
                    </td>
                    <td align="right" valign="bottom" background="transparent" height="18">
                    		<!--http://eipt.chosun.com:7777/manual/index.jsp-->
                        <a href="/common/jsp/main.jsp"><img height="18" border=0 src="/images/01.gif"></a>
                        <a href="_self" onclick="pop_system();return false;"><img height="18" border=0 src="/images/03.gif"></a>
                        <a href="/common/jsp/logout.jsp"><img height="18" border=0 src="/images/04.gif"></a>
                    </td>
                    <td width="5"></td>
                </tr>
                <tr height="26">
                    <td width="20" background="transparent"></td>
                    <td colspan=3 width="*" align="left" valign="bottom">
                        <div id="TFMenuControlLocation">
                            <script>
                                 TFMenuWrite(TFMenuControlLocation, "TFMenu", "<%= domainName + strMenuUrl %>", "100%", "26");
                                //TFMenuWrite(TFMenuControlLocation, "TFMenu", "<%= domainName + strMenuUrl %>", "998", "26");
                            </script>
                        </div>
                    </td>
                    <td width="5" background="transparent"></td>
                </tr>
                <tr height="8">
                    <td width="20" background="transparent"></td>
                    <td colspan=3 width="*" align="right" valign="bottom"></td>
                    <td width="5" background="transparent"></td>
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
