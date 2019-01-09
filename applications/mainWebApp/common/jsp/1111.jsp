<%@ page contentType="text/html; charset=KSC5601" %>
<%@ page import = "java.util.*,java.io.*,java.net.*"  %>
 
<%
	Enumeration enum = request.getHeaderNames();
	while (enum.hasMoreElements()) {
		String name  = (String) enum.nextElement();
		String value = (String) request.getHeader(name);
		System.out.println(name + " : " + value );
		
		if ( value != null ) {
			out.println("<br><font color=red><b>" + name + "</b></font> : " + value + " ");
		}
	}
	
%>
 

<%
        // LDAP 사용자 정보 Request 처리
        String	uid	        =	request.getHeader("UID")	    ==	null ? "" : request.getHeader("UID");	        //	아이디
        String	emp_no	    =	request.getHeader("EMP_NO")	    ==	null ? "" : request.getHeader("EMP_NO");	    //	사번
        String	jobcd	    =	request.getHeader("JOBCD")	    ==	null ? "" : request.getHeader("JOBCD");	    //	업무구분
        String	jobnm	    =	request.getHeader("JOBNM")	    ==	null ? "" : request.getHeader("JOBNM");	    //	업무구분명
        String	posicd	    =	request.getHeader("POSICD")	    ==	null ? "" : request.getHeader("POSICD");	    //	직책코드
        String	posinm	    =	request.getHeader("POSINM")	    ==	null ? "" : request.getHeader("POSINM");	    //	직책명
        String	deptcd	    =	request.getHeader("DEPTCD")	    ==	null ? "" : request.getHeader("DEPTCD");	    //	부서코드
        String	deptnm	    =	request.getHeader("DEPTNM")	    ==	null ? "" : request.getHeader("DEPTNM");	    //	부서명
        String	selldeptcd	=	request.getHeader("SELLDEPTCD")	==	null ? "" : request.getHeader("SELLDEPTCD");	//	판매부서
        String	selldeptnm	=	request.getHeader("SELLDEPTNM")	==	null ? "" : request.getHeader("SELLDEPTNM");	//	판매부서명
        String	areacd	    =	request.getHeader("AREACD")	    ==	null ? "" : request.getHeader("AREACD");	    //	지역코드
        String	areanm	    =	request.getHeader("AREANM")	    ==	null ? "" : request.getHeader("AREANM");	    //	지역명
        String	bocd	    =	request.getHeader("BOCD")	    ==	null ? "" : request.getHeader("BOCD");	    //	지국지사코드
        String	boclsf	    =	request.getHeader("BOCLSF")	    ==	null ? "" : request.getHeader("BOCLSF");	    //	지국지사구분코드(일반, 교판)
        String	bonm	    =	request.getHeader("BONM")	    ==	null ? "" : request.getHeader("BONM");	    //	지국명
        String	email	    =	request.getHeader("EMAIL")	    ==	null ? "" : request.getHeader("EMAIL");	    //	이메일
        String	usertype    =	request.getHeader("USERTYPE")	==	null ? "" : request.getHeader("USERTYPE");	//	usertype=3 지국사용자, usertype=5 대행지국
        String	cmpynm	    =	request.getHeader("cmpynm")	    ==	null ? "" : request.getHeader("cmpynm");	    //	이메일
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
    <tr bgcolor="#DDDDDD"><td class="gray">구분</td><td class="gray">요청 코드</td><td class="gray">결과 값</td></tr>
    <tr><td class="gray">아이디                      </td><td class="gray">request.getHeader("UID")	    </td><td class="gray"><%=uid        	%>&nbsp;</td></tr>
    <tr><td class="gray">사번                        </td><td class="gray">request.getHeader("EMP_NO")	    </td><td class="gray"><%=emp_no	     %>&nbsp;</td></tr>
    <tr><td class="gray">업무구분                    </td><td class="gray">request.getHeader("JOBCD")	    </td><td class="gray"><%=jobcd	     %>&nbsp;</td></tr>
    <tr><td class="gray">업무구분명                  </td><td class="gray">request.getHeader("JOBNM")	    </td><td class="gray"><%=jobnm	     %>&nbsp;</td></tr>
    <tr><td class="gray">직책코드                    </td><td class="gray">request.getHeader("POSICD")	    </td><td class="gray"><%=posicd	     %>&nbsp;</td></tr>
    <tr><td class="gray">직책명                      </td><td class="gray">request.getHeader("POSINM")	    </td><td class="gray"><%=posinm	     %>&nbsp;</td></tr>
    <tr><td class="gray">부서코드                    </td><td class="gray">request.getHeader("DEPTCD")	    </td><td class="gray"><%=deptcd	     %>&nbsp;</td></tr>
    <tr><td class="gray">부서명                      </td><td class="gray">request.getHeader("DEPTNM")	    </td><td class="gray"><%=deptnm	     %>&nbsp;</td></tr>
    <tr><td class="gray">판매부서                    </td><td class="gray">request.getHeader("SELLDEPTCD")	</td><td class="gray"><%=selldeptcd   %>&nbsp;</td></tr>
    <tr><td class="gray">판매부서명                  </td><td class="gray">request.getHeader("SELLDEPTNM")	</td><td class="gray"><%=selldeptnm   %>&nbsp;</td></tr>
    <tr><td class="gray">지역코드                    </td><td class="gray">request.getHeader("AREACD")	    </td><td class="gray"><%=areacd	     %>&nbsp;</td></tr>
    <tr><td class="gray">지역명                      </td><td class="gray">request.getHeader("AREANM")	    </td><td class="gray"><%=areanm	     %>&nbsp;</td></tr>
    <tr><td class="gray">지국지사코드                </td><td class="gray">request.getHeader("BOCD")	    </td><td class="gray"><%=bocd	     %>&nbsp;</td></tr>
    <tr><td class="gray">지국지사구분코드(일반, 교판)</td><td class="gray">request.getHeader("BOCLSF")	    </td><td class="gray"><%=boclsf	     %>&nbsp;</td></tr>
    <tr><td class="gray">지국명                      </td><td class="gray">request.getHeader("BONM")	    </td><td class="gray"><%=bonm	     %>&nbsp;</td></tr>
    <tr><td class="gray">이메일                      </td><td class="gray">request.getHeader("EMAIL")	    </td><td class="gray"><%=email	     %>&nbsp;</td></tr>
    <tr><td class="gray">사용구분(자체,대행)           </td><td class="gray">request.getHeader("USERTYPE")	    </td><td class="gray"><%=usertype	     %>&nbsp;</td></tr>
    <tr><td class="gray">cmpynm           </td><td class="gray">request.getHeader("cmpynm")	    </td><td class="gray"><%=cmpynm	     %>&nbsp;</td></tr>
</table>
</body>
</html>