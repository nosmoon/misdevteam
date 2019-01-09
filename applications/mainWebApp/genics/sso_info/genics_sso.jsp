<%@ include file="/genics/sso_info/db_conn.jsp" %>
<%
	StringEncrypter encrypter = new StringEncrypter(aes_key, aes_lv);
	//���ڿ� ��ȣȭ.    
			System.out.println("encrypter["+encrypter+"]");
	String decrypted = encrypter.decrypt(sso_info); 
			System.out.println("decrypted["+decrypted+"]");

	session.setAttribute("ENC_TOKEN", enc_token);
	session.setAttribute("SSO_INFO", decrypted);		
	/* �� �κп� ������ �ش� SP�� ������ �ø���*/
	session.setAttribute("SP_SESSION", decrypted);
	/* SP ���� ���� ���� */ 

	String sso_login_id = "";
	String sso_login_nm = "";

	if(decrypted != null && !"".equals(decrypted) && !"null".equals(decrypted)) {
		String[] ssoInfos	= decrypted.split("\\$\\$");
		sso_login_id = ssoInfos[0];
		sso_login_nm = ssoInfos[1];
		
		String uid			=	ssoInfos[1];		    // ���̵�				
		String emp_no       =	ssoInfos[4];		    // ���					
		String emp_nm       =	ssoInfos[5];		    // ����					
		String cmpycd       =	ssoInfos[14];		    // ȸ��					
		String deptcd       =	ssoInfos[2];		    // �μ�					
		String deptnm       =	ssoInfos[20];		    // �μ���				
		String selldeptcd	=	ssoInfos[37];		    // �Ǹźμ�
		String selldeptnm   =	ssoInfos[38];			// �Ǹźμ���
		String areacd       =	ssoInfos[35];		    // ���������ڵ�			
		String areanm       =	ssoInfos[36];		    // ����������			
		String deptplacyn   =	"";					    // �μ��忩��
		String jobcd        =	ssoInfos[28];		    // ��������				
		String jobnm        =	ssoInfos[29];		    // �������и�			
		String posicd       =	ssoInfos[25];		    // ��å�ڵ�				
		String posinm       =	ssoInfos[24];		    // ��å��				
		String usertypecd   =	ssoInfos[7];		    // ��������ڵ�			
		String usertypenm   =	"";					    // ������и�
		String email        =	ssoInfos[11];		    // �̸���				
		String dealdeptcd   =	ssoInfos[52];		    // �����μ��ڵ�			
		String dealdeptnm   =	ssoInfos[53];		    // �����μ���			

		// CIIS �߰� �׸��
		String hdqtcd		=	"";						// ����
		String hdqtnm		=	"";						// ���θ�
		String partcd		=	"";						// ��Ʈ�ڵ�
		String partnm		=	"";						// ��Ʈ��
		String hdqtplacyn	=	"";						// �����忩��
		String partplacyn	=	"";						// ��Ʈ�忩��
		String dealmedicd	=	"";						// ������ü�ڵ�
		
		session.setAttribute("uid"			,uid		); 		// ���̵�
		//	���翡�� �߰��ϴ� ����
		//	�а���� ��ȸ�翡�� �α����ϴ� ��� ����� ���� ���̵� �ְ� �ȴ�.
		//	���̵� ������ ������� ���
		if (emp_no.equals("")){
			session.setAttribute("emp_no"		,uid     );      // ���
		} else {
			session.setAttribute("emp_no"		,emp_no     );      // ���
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

		session.setAttribute("EMP_NM"		,emp_nm    	);      // ����
		session.setAttribute("CMPYCD"		,cmpycd     );      // ȸ��
		session.setAttribute("DEPTCD"		,deptcd     );      // �μ�
		session.setAttribute("DEPTNM"		,deptnm     );      // �μ���
		session.setAttribute("SELLDEPTCD"   ,selldeptcd );      // �Ǹźμ�
		session.setAttribute("SELLDEPTNM"   ,selldeptnm );      // �Ǹźμ���
		session.setAttribute("DEALDEPTCD"   ,dealdeptcd );      // �����μ��ڵ�
		session.setAttribute("DEALDEPTNM"   ,dealdeptnm );      // �����μ���
		session.setAttribute("AREACD"       ,areacd     );      // ���������ڵ�
		session.setAttribute("AREANM"       ,areanm     );      // ����������
		session.setAttribute("DEPTPLACYN"   ,deptplacyn );      // �μ��忩��
		session.setAttribute("JOBCD"        ,jobcd      );      // ��������
		session.setAttribute("JOBNM"        ,jobnm      );      // �������и�
		session.setAttribute("POSICD"       ,posicd     );      // ��å�ڵ�
		session.setAttribute("POSINM"       ,posinm     );      // ��å��
		session.setAttribute("USERTYPECD"   ,usertypecd );      // ��������ڵ�
		session.setAttribute("USERTYPENM"   ,usertypenm );      // ������и�
		session.setAttribute("EMAIL"        ,email      );      // �̸���
		
		// CIIS �߰� �׸��  - ����(��),��Ʈ(��) LDAP���� ���� �ȵǴ� ����� ������.
		//session.setAttribute("hdqtcd"     ,hdqtcd     );      // ����        
		//session.setAttribute("hdqtnm"     ,hdqtnm     );      // ���θ�      
		//session.setAttribute("partcd"     ,partcd     );      // ��Ʈ�ڵ�    
		//session.setAttribute("partnm"     ,partnm     );      // ��Ʈ��      
		session.setAttribute("HDQTPLACYN" 	,hdqtplacyn );      // �����忩��  
		session.setAttribute("PARTPLACYN" 	,partplacyn );      // ��Ʈ�忩��  
		session.setAttribute("DEALMEDICD"  	,dealmedicd );      // ������ü�ڵ�

	}	

%>