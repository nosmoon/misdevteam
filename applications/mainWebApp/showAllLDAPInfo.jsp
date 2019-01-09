<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : main.jsp
* 기능 : 메인페이지
* 작성일자 : 2004-01-05
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%

		// LDAP 사용자 정보 Request 처리
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
		String mobile	    = request.getHeader("mobile")   	== null ? "" : Util.Uni2Ksc(request.getHeader("mobile"));	  // 관리부서명



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
		
		session.setAttribute("mobile"        ,mobile      );      // 이메일		

%>
<html>
<head>
<title>모든 LDAP 정보 보기</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>
<body>
<h1> LDAP 정보 </h1>
<hr>
<br>
<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" border="1">
	<tr bgcolor="#DDDDDD">
		<td class="gray" width="120">구분			</td><td class="gray">요청 코드							</td><td class="gray">결과 값</td>
	</tr>
	<tr>
		<td class="gray width="120"">아이디      	</td><td class="gray">request.getHeader("UID")        	</td><td class="gray"><%= uid	%>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">사번        	</td><td class="gray">request.getHeader("EMP_NO")     	</td><td class="gray"><%= emp_no %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">성명        	</td><td class="gray">request.getHeader("EMP_NM")     	</td><td class="gray"><%= emp_nm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">회사        	</td><td class="gray">request.getHeader("CMPYCD")     	</td><td class="gray"><%= cmpycd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">부서        	</td><td class="gray">request.getHeader("DEPTCD")     	</td><td class="gray"><%= deptcd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">부서명      	</td><td class="gray">request.getHeader("DEPTNM")     	</td><td class="gray"><%= deptnm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">판매부서    	</td><td class="gray">request.getHeader("SELLDEPTCD") 	</td><td class="gray"><%= selldeptcd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">판매부서명  	</td><td class="gray">request.getHeader("SELLDEPTNM") 	</td><td class="gray"><%= selldeptnm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">관할지역코드	</td><td class="gray">request.getHeader("AREACD")     	</td><td class="gray"><%= areacd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">지역명      	</td><td class="gray">request.getHeader("AREANM")     	</td><td class="gray"><%= areanm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">부서장여부  	</td><td class="gray">request.getHeader("DEPTPLACYN") 	</td><td class="gray"><%= deptplacyn %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">업무구분    	</td><td class="gray">request.getHeader("JOBCD")      	</td><td class="gray"><%= jobcd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">업무구분명  	</td><td class="gray">request.getHeader("JOBNM")      	</td><td class="gray"><%= jobnm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">직책코드    	</td><td class="gray">request.getHeader("POSICD")     	</td><td class="gray"><%= posicd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">직책명      	</td><td class="gray">request.getHeader("POSINM")     	</td><td class="gray"><%= posinm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">사원구분코드	</td><td class="gray">request.getHeader("USERTYPECD") 	</td><td class="gray"><%= usertypecd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">사원구분명  	</td><td class="gray">request.getHeader("USERTYPENM") 	</td><td class="gray"><%= usertypenm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">이메일      	</td><td class="gray">request.getHeader("EMAIL")      	</td><td class="gray"><%= email %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">관리부서코드	</td><td class="gray">request.getHeader("DEALDEPTCD") 	</td><td class="gray"><%= dealdeptcd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">관리부서명  	</td><td class="gray">request.getHeader("DEALDEPTNM") 	</td><td class="gray"><%= dealdeptnm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">핸드폰 	</td><td class="gray">request.getHeader("mobile") 	</td><td class="gray"><%= mobile %>&nbsp;</td>
	</tr>	
</table>
</body>
</html>
