<%@ page contentType="text/html; charset=euc-kr" %>
<%--@ include file="/login_ep/is_common.jsp" --%>
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
	Enumeration enum = request.getHeaderNames();
	while (enum.hasMoreElements()) {
		String name  = (String) enum.nextElement();
		String value = (String) request.getHeader(name);
		//System.out.println(name + " : " + value );
						
		if ( value != null ) {
			out.println("<br><font color=red><b>" + name + "</b></font> : " + value + " ");
		}
	}

String Password = request.getParameter("Password");
		// LDAP 사용자 정보 Request 처리
		String uid			= request.getHeader("UID")   		== null ? "" :  request.getHeader("UID"); 		 	  // 아이디
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" :  request.getHeader("EMP_NO");         // 사번
		String kflnm        = request.getHeader("KFLNM")       	== null ? "" :  request.getHeader("KFLNM");          // 사용자명
		String jjuminno     = request.getHeader("JJUMINNO")     == null ? "" :  request.getHeader("JJUMINNO");       // 주민번호
		String jobcd        = request.getHeader("JOBCD")        == null ? "" :  request.getHeader("JOBCD");          // 업무구분
		String jobnm        = request.getHeader("JOBNM")        == null ? "" :  request.getHeader("JOBNM");          // 업무구분명
		String deptcd       = request.getHeader("DEPTCD")       == null ? "" :  request.getHeader("DEPTCD");         // 부서코드
		String deptnm       = request.getHeader("DEPTNM")       == null ? "" :  request.getHeader("DEPTNM");         // 부서명
		String bocd         = request.getHeader("BOCD")         == null ? "" :  request.getHeader("BOCD");           // 지국지사코드
		String bonm         = request.getHeader("BONM")         == null ? "" :  request.getHeader("BONM");           // 지국지사명
		String boclsf       = request.getHeader("BOCLSF")       == null ? "" :  request.getHeader("BOCLSF");         // 지국지사구분코드
		String posicd       = request.getHeader("POSICD")       == null ? "" :  request.getHeader("POSICD");         // 직책코드
		String posinm       = request.getHeader("POSINM")       == null ? "" :  request.getHeader("POSINM");         // 직책명
		String email        = request.getHeader("EMAIL")        == null ? "" :  request.getHeader("EMAIL");          // 이메일



		// LDAP 사용자 정보 Session 처리
		session.setAttribute("uid"			,uid		); 		// 아이디
//		session.setAttribute("emp_no"		,emp_no     );      // 사번
//		session.setAttribute("kflnm"		,kflnm      );      // 사용자명
//		session.setAttribute("jjuminno"		,jjuminno   );      // 주민번호
//		session.setAttribute("jobcd"		,jobcd      );      // 업무구분
//		session.setAttribute("jobnm"		,jobnm      );      // 업무구분명
//		session.setAttribute("deptcd"		,deptcd     );      // 부서코드
//		session.setAttribute("deptnm"       ,deptnm     );      // 부서명
//		session.setAttribute("bocd"   		,bocd 		);      // 지국지사코드
//		session.setAttribute("bonm"         ,bonm     	);      // 지국지사명
//		session.setAttribute("boclsf"       ,boclsf     );      // 지국지사구분코드
//		session.setAttribute("posicd"   	,posicd 	);      // 직책코드
//		session.setAttribute("posinm"       ,posinm     );      // 직책명
//		session.setAttribute("email"   		,email 		);      // 이메일
%>
<html>
<head>
<title>모든 LDAP 정보 보기</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>
<body>
<h1> LDAP 정보 </h1>
<hr>
<br><%=Password%>
<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" border="1">
	<tr bgcolor="#DDDDDD">
		<td class="gray">구분</td><td class="gray">요청 코드</td><td class="gray">결과 값</td>
	</tr>
	<tr>
		<td class="gray">아이디      </td><td class="gray">request.getHeader("UID")         </td><td class="gray"><%= uid	%>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">사번        </td><td class="gray">request.getHeader("EMP_NO")     </td><td class="gray"><%= emp_no %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">사용자명    </td><td class="gray">request.getHeader("KFLNM")       </td><td class="gray"><%= kflnm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">주민번호    </td><td class="gray">request.getHeader("JJUMINNO")    </td><td class="gray"><%= jjuminno %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">업무구분    </td><td class="gray">request.getHeader("JOBCD")       </td><td class="gray"><%= jobcd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">업무구분명  </td><td class="gray">request.getHeader("JOBNM")       </td><td class="gray"><%= jobnm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">부서코드   </td><td class="gray">request.getHeader("DEPTCD")       </td><td class="gray"><%= deptcd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">부서명     </td><td class="gray">request.getHeader("DEPTNM")       </td><td class="gray"><%= deptnm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">지국지사코드</td><td class="gray">request.getHeader("BOCD")         </td><td class="gray"><%= bocd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">지국지사명  </td><td class="gray">request.getHeader("BONM")         </td><td class="gray"><%= bonm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">지국지사구분코드</td><td class="gray">request.getHeader("BOCLSF")    </td><td class="gray"><%= boclsf %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">직책코드    </td><td class="gray">request.getHeader("POSICD")      </td><td class="gray"><%= posicd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">직책명      </td><td class="gray">request.getHeader("POSINM")     </td><td class="gray"><%= posinm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">이메일      </td><td class="gray">request.getHeader("EMAIL")      </td><td class="gray"><%= email %>&nbsp;</td>
	</tr>
</table>
</body>
</html>
