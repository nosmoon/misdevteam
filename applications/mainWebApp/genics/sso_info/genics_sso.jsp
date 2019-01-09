<%@ include file="/genics/sso_info/db_conn.jsp" %>
<%
	StringEncrypter encrypter = new StringEncrypter(aes_key, aes_lv);
	//문자열 복호화.    
			System.out.println("encrypter["+encrypter+"]");
	String decrypted = encrypter.decrypt(sso_info); 
			System.out.println("decrypted["+decrypted+"]");

	session.setAttribute("ENC_TOKEN", enc_token);
	session.setAttribute("SSO_INFO", decrypted);		
	/* 이 부분에 인증후 해당 SP의 세션을 올린다*/
	session.setAttribute("SP_SESSION", decrypted);
	/* SP 세션 형성 종료 */ 

	String sso_login_id = "";
	String sso_login_nm = "";

	if(decrypted != null && !"".equals(decrypted) && !"null".equals(decrypted)) {
		String[] ssoInfos	= decrypted.split("\\$\\$");
		sso_login_id = ssoInfos[0];
		sso_login_nm = ssoInfos[1];
		
		String uid			=	ssoInfos[1];		    // 아이디				
		String emp_no       =	ssoInfos[4];		    // 사번					
		String emp_nm       =	ssoInfos[5];		    // 성명					
		String cmpycd       =	ssoInfos[14];		    // 회사					
		String deptcd       =	ssoInfos[2];		    // 부서					
		String deptnm       =	ssoInfos[20];		    // 부서명				
		String selldeptcd	=	ssoInfos[37];		    // 판매부서
		String selldeptnm   =	ssoInfos[38];			// 판매부서명
		String areacd       =	ssoInfos[35];		    // 관리지역코드			
		String areanm       =	ssoInfos[36];		    // 관리지역명			
		String deptplacyn   =	"";					    // 부서장여부
		String jobcd        =	ssoInfos[28];		    // 업무구분				
		String jobnm        =	ssoInfos[29];		    // 업무구분명			
		String posicd       =	ssoInfos[25];		    // 직책코드				
		String posinm       =	ssoInfos[24];		    // 직책명				
		String usertypecd   =	ssoInfos[7];		    // 사원구분코드			
		String usertypenm   =	"";					    // 사원구분명
		String email        =	ssoInfos[11];		    // 이메일				
		String dealdeptcd   =	ssoInfos[52];		    // 관리부서코드			
		String dealdeptnm   =	ssoInfos[53];		    // 관리부서명			

		// CIIS 추가 항목들
		String hdqtcd		=	"";						// 본부
		String hdqtnm		=	"";						// 본부명
		String partcd		=	"";						// 파트코드
		String partnm		=	"";						// 파트명
		String hdqtplacyn	=	"";						// 본부장여부
		String partplacyn	=	"";						// 파트장여부
		String dealmedicd	=	"";						// 관리매체코드
		
		session.setAttribute("uid"			,uid		); 		// 아이디
		//	자재에서 추가하는 로직
		//	분공장및 자회사에서 로그인하는 경우 사번이 없이 아이디만 있게 된다.
		//	아이디를 가지고 사번으로 사용
		if (emp_no.equals("")){
			session.setAttribute("emp_no"		,uid     );      // 사번
		} else {
			session.setAttribute("emp_no"		,emp_no     );      // 사번
		}
		
		session.setAttribute("ACCT_CD", ssoInfos[1]);
		session.setAttribute("EMPNO", ssoInfos[4]);
		session.setAttribute("NM", ssoInfos[5]);
		session.setAttribute("BLNG_CMPY_CD", ssoInfos[12]);
		session.setAttribute("BLNG_CMPY_NM", ssoInfos[13]);
		session.setAttribute("PART_CD", ssoInfos[2]);
		session.setAttribute("PART_NM", ssoInfos[20]);
		session.setAttribute("CRM_SELL_DEPT_CD", ssoInfos[37]);
		session.setAttribute("CRM_SELL_DEPT_NM", ssoInfos[38]);
		session.setAttribute("CRM_MANG_AREA_CD", ssoInfos[35]);
		session.setAttribute("CRM_MANG_AREA_NM", ssoInfos[36]);
		session.setAttribute("JOB_CLSF_CD", ssoInfos[28]);
		session.setAttribute("JOB_CLSF_NM", ssoInfos[29]);
		session.setAttribute("DTY_CD", ssoInfos[25]);
		session.setAttribute("DTY_NM", ssoInfos[26]);
		session.setAttribute("EMP_CLSF_CD", ssoInfos[7]);
		session.setAttribute("EMP_CLSF_NM", ssoInfos[8]);
		session.setAttribute("EMAIL_ID", ssoInfos[11]);
		session.setAttribute("CRM_MANG_DEPT_CD", ssoInfos[52]);
		session.setAttribute("CRM_MANG_DEPT_NM", ssoInfos[53]);
		session.setAttribute("PTPH", ssoInfos[10]);
		session.setAttribute("dealmedicd", ssoInfos[83]);

		session.setAttribute("EMP_NM"		,emp_nm    	);      // 성명
		session.setAttribute("CMPYCD"		,cmpycd     );      // 회사
		session.setAttribute("DEPTCD"		,deptcd     );      // 부서
		session.setAttribute("DEPTNM"		,deptnm     );      // 부서명
		session.setAttribute("SELLDEPTCD"   ,selldeptcd );      // 판매부서
		session.setAttribute("SELLDEPTNM"   ,selldeptnm );      // 판매부서명
		session.setAttribute("DEALDEPTCD"   ,dealdeptcd );      // 관리부서코드
		session.setAttribute("DEALDEPTNM"   ,dealdeptnm );      // 관리부서명
		session.setAttribute("AREACD"       ,areacd     );      // 관리지역코드
		session.setAttribute("AREANM"       ,areanm     );      // 관리지역명
		session.setAttribute("DEPTPLACYN"   ,deptplacyn );      // 부서장여부
		session.setAttribute("JOBCD"        ,jobcd      );      // 업무구분
		session.setAttribute("JOBNM"        ,jobnm      );      // 업무구분명
		session.setAttribute("POSICD"       ,posicd     );      // 직책코드
		session.setAttribute("POSINM"       ,posinm     );      // 직책명
		session.setAttribute("USERTYPECD"   ,usertypecd );      // 사원구분코드
		session.setAttribute("USERTYPENM"   ,usertypenm );      // 사원구분명
		session.setAttribute("EMAIL"        ,email      );      // 이메일
		
		// CIIS 추가 항목들  - 본부(명),파트(명) LDAP에서 관리 안되는 관계로 삭제함.
		//session.setAttribute("hdqtcd"     ,hdqtcd     );      // 본부        
		//session.setAttribute("hdqtnm"     ,hdqtnm     );      // 본부명      
		//session.setAttribute("partcd"     ,partcd     );      // 파트코드    
		//session.setAttribute("partnm"     ,partnm     );      // 파트명      
		session.setAttribute("HDQTPLACYN" 	,hdqtplacyn );      // 본부장여부  
		session.setAttribute("PARTPLACYN" 	,partplacyn );      // 파트장여부  
		session.setAttribute("DEALMEDICD"  	,dealmedicd );      // 관리매체코드

	}	

%>