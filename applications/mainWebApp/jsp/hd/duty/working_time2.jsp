<%@ page contentType="text/html; charset=KSC5601"%>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
		java.util.Date,
        somo.framework.util.*,
"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : working_time.jsp
* 기능 : 근무시간 입력 시스템
* 작성일자 : 2018-06-28
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
		
		cmpycd = "100";
		uid = "c202029";
		emp_no = "202029";
		
		if(uid.equals("")){
			//response.sendRedirect("/");			
		}

		// LDAP 사용자 정보 Request 처리 (현 CRM 사용중인 항목들)
		/*
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
		*/

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

//  uid="cit0000";
//  emp_no="cit0000";
//  deptcd="361100";
//  deptnm="임원실";
//  cmpycd="100";
  
//  uid="ait0000";
//  emp_no="ait0000";
//  deptcd="361100";
//  deptnm="임원실";
//  cmpycd="500";  
  
  //cmpycd="332";
  //cmpynm="사내복지기금";
//  cmpynm="조선일보";
//  emp_nm="노상현";
  //dealmedicd = "1";
	
//  dealmedicd	 = "1";

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
		
	String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	String strMenuUrl = "";
	String strmainFrame = "";
	
	System.out.println("domainName : " + domainName);
	domainName = "http://192.168.1.102:8100";
	System.out.println("uid : " + uid);
	if (uid == null) {
		uid = GetCookie(request,response,"uid");
	System.out.println("uid null : " + uid);
	}

	if (uid == null){
		response.sendRedirect("/login.jsp"); 
	}

	System.out.println("strmainFrame == " + strmainFrame);
	System.out.println("domainName == " + domainName);
	
	//http://news.chosun.com/cs_intranet/html/css/intranet_common.css
%>
<html lang='ko'>
<head>
  <meta charset="UTF-8">
  <title>조선 - 인트라넷</title>
  <link rel="stylesheet" type="text/css" href="http://news.chosun.com/cs_intranet/css/intranet_common.css">
  <style>
   body{height:100%; margin:0 auto; text-align:center;}
   .tbl_tit { text-align:left; }
  </style>
   <script type="text/javascript" src="http://news.chosun.com/dhtm/js/jquery-1.9.1.min.js"></script>
  <script type="text/javascript" src="http://news.chosun.com/cs_intranet/js/placeholder.js"></script>
  <script type="text/javascript" src="http://news.chosun.com/cs_intranet/js/intra_common.js"></script>

  <script>
  
  //초기화
  function init() {
	  var frm = document.frm_content;
	  frm.reset();
	  search();
  }

  //조회
  function search() {	  
	  var frm = document.frm1;
	  frm.action = "/hd/duty/1001001";
	  frm.target = "ifrm";	  	 
	  frm.submit();
  }
  
  
  //입력
  function save() {
	  var frm = document.frm_content;
	  var tmp = "";
	  
	  //tmp += frm.duty_dt.value + " : " + frm.prsnt_tm.value + " : " + frm.finish_tm.value;
	  //alert(tmp);
	  
	  frm.action = "/hd/duty/1001002";
	  frm.method = "post";
	  frm.target = "ifrm";
	  frm.submit();
  }
  

  //전체 선택/해제
  function set_check_onoff(obj) {
	var ocheck = document.getElementsByName("check_yn");		
	for(var i=0; i<ocheck.length; i++) {
		document.getElementById("t"+i).checked = obj.checked; 
	}
  }

  //선택삭제
  function chkdelete() {
	  var frm  = document.frm_list;
	  var frm1 = document.frm1;
	  var ocheck = document.getElementsByName("check_yn");
	  var param = "";
	  var chk;
	  
	  for(var i=0; i<ocheck.length; i++) {
		chk = document.getElementById("t"+i);
		param += (chk.checked == true) ? chk.value + "#" : "";
	  }
	  
	  if(param == "") {
		  alert("선택된  항목이 없습니다");
	  } else {
		  if(confirm("삭제하시겠습니까?")) {
			  //alert(param + "\n" + param.substring(0, param.length - 1));
			  //return;
			  
			  frm1.duty_dt.value = param.substring(0, param.length - 1);
			  frm1.action = "/hd/duty/1001003";
			  frm1.target = "ifrm";
			  frm1.submit();
		  } else {
			  return;
		  }
	  }
  }

  </script>
</head>
<body onload="init();">

<div class="header">
  <a href="http://chosun.com/"><img src="http://image.chosun.com/img/intranet//logo_intr.png" alt="조선일보"></a>
</div>
<div class="wrap_container">
  <div class="content">
  <!--// user_input_area -->
  <form id="frm_content" name="frm_content" action="" method="post" target="ifrm">
    <strong class="title_txt">근무시간 관리 시스템</strong>
    <span class="tbl_tit">근무시간 입력</span>
    <div class="user_input_area">
      <div class="option_step">
        <strong class="tit">날짜</strong><div class="selectarea"><div class="selectBox">
            <select name="duty_dt" onchange="">
<%
	//String[] week_days = {"일", "월", "화", "수", "목", "금", "토"};
	String[] week_days = {"1","2","3","4","5","6","7"};
	String dt = "";
	Calendar now = Calendar.getInstance();
	int	day_of_week = now.get(now.DAY_OF_WEEK);
	int inc;
	String today = Util.getDate();
	
	for(int d=1; d<=7; d++) {
		
		if(d == day_of_week) {
			inc = 0;
		} else {
			inc = ((d < day_of_week) ? -(day_of_week - d) : (d-day_of_week));
		}

		dt = Util.addDate(today, inc);
%>
		<option value="<%=dt%>" <%=(day_of_week == d ? "selected" : "")%>><%=dt.substring(4,6)%>월<%=dt.substring(6,8)%>일(<%=week_days[d-1]%>)</option>
<%
	}
%>
            </select>
          </div>
        </div>
      </div>      
      <div class="option_step">
        <strong class="tit">출근시각</strong><p><input type="text" id="prsnt_tm" name="prsnt_tm" maxlength="10" placeholder="예)09:00"></p>
      </div>
      <div class="option_step">
        <strong class="tit">퇴근시각</strong><p><input type="text" id="finish_tm" name="finish_tm" maxlength="10" placeholder="예)16:00"></p>
      </div>
      <div class="option_step">
        <strong class="tit">추가휴게시간</strong><p><input type="text" id="addm_rest_minute" name="addm_rest_minute" maxlength="10" placeholder="예)01:00"></p>
      </div>
      <div class="option_step">
        <input type="checkbox" id="duty_clsf" name="duty_clsf" value="10"><label for="duty_clsf"><span>출장</span></label>
      </div>
      
    </div>
	<input type="hidden" id="cmpycd" name="cmpycd"	value="<%=cmpycd%>"/>
	<input type="hidden" id="emp_no" name="emp_no"  value="<%=emp_no%>"/>
	<!--
<%--
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
		dm.finish_tm = Util.checkString(req.getParameter("finish_tm"));
		dm.app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.addm_rest_minute = Util.checkString(req.getParameter("addm_rest_minute"));
	    dm.duty_clsf = Util.checkString(req.getParameter("duty_clsf"));
--%>
	  -->	    
    </form>
    <!--// user_input_area -->
    
    <div class="btn_area">
      <button type="submit" id="csSubmitButton" class="common_btn small" onclick="init();"><span><em></em>초기화</span></button><button type="submit" id="csSubmitButton" class="common_btn small on" onclick="save();"><span>입력</span></button>
      <button type="submit" id="csSubmitButton" class="common_btn small on" onclick="search();"><span>조회</span></button>
    </div>

    <span class="tbl_tit">금주 근무시간</span>
    <div class="tbl_area" id="div_table" name="div_table">
      <table class="table_style" id="table_list" name="table_list" summery="금주 근무시간을 등록">
        <caption>근무시간</caption>
        <colgroup>
          <col class="c1"></col>
          <col class="c2"></col>
          <col class="c3"></col>
          <col class="c4"></col>
          <col class="c5"></col>
          <col class="c6"></col>
          <col class="c7"></col>
        </colgroup>
        <thead>
          <tr>
            <th scope="col"><input type="checkbox" id="check_all" name="check_all" onclick="set_check_onoff(this);"><label for="check_all"></label></th>
            <th scope="col">날짜</th>
            <th scope="col">출근시각</th>
            <th scope="col">퇴근시각</th>
            <th scope="col">휴게시간</th>
            <th scope="col">비고</th>
            <th scope="col">근무시간</th>
          </tr>
        </thead>
        <tbody id="table_body" name="table_body">
        </tbody>
      </table>
    </div><!-- tbl_area -->
    <div class="all_txt" style="text-align:left;"><a href="#none" class="btn_delete" onclick="chkdelete();">선택삭제</a><span class="sum_txt">주간 총 근무시간<em class="time" id="sum_txt" name="sum_txt"></em></span></div>

  </div><!--// content -->
</div><!--// wrap_container -->

<form id="frm1" name="frm1" action="" method="post" target="ifrm">
<input type="hidden" name="cmpycd" value="<%=cmpycd%>"/>
<input type="hidden" name="emp_no" value="<%=emp_no%>"/>
<input type="hidden" name="basi_dt" value="<%=today%>"/>
<input type="hidden" name="duty_dt" value=""/>
</form>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" style="width:0px;height:0px;"/>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
