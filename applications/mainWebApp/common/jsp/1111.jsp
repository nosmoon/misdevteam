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
        // LDAP ����� ���� Request ó��
        String	uid	        =	request.getHeader("UID")	    ==	null ? "" : request.getHeader("UID");	        //	���̵�
        String	emp_no	    =	request.getHeader("EMP_NO")	    ==	null ? "" : request.getHeader("EMP_NO");	    //	���
        String	jobcd	    =	request.getHeader("JOBCD")	    ==	null ? "" : request.getHeader("JOBCD");	    //	��������
        String	jobnm	    =	request.getHeader("JOBNM")	    ==	null ? "" : request.getHeader("JOBNM");	    //	�������и�
        String	posicd	    =	request.getHeader("POSICD")	    ==	null ? "" : request.getHeader("POSICD");	    //	��å�ڵ�
        String	posinm	    =	request.getHeader("POSINM")	    ==	null ? "" : request.getHeader("POSINM");	    //	��å��
        String	deptcd	    =	request.getHeader("DEPTCD")	    ==	null ? "" : request.getHeader("DEPTCD");	    //	�μ��ڵ�
        String	deptnm	    =	request.getHeader("DEPTNM")	    ==	null ? "" : request.getHeader("DEPTNM");	    //	�μ���
        String	selldeptcd	=	request.getHeader("SELLDEPTCD")	==	null ? "" : request.getHeader("SELLDEPTCD");	//	�Ǹźμ�
        String	selldeptnm	=	request.getHeader("SELLDEPTNM")	==	null ? "" : request.getHeader("SELLDEPTNM");	//	�Ǹźμ���
        String	areacd	    =	request.getHeader("AREACD")	    ==	null ? "" : request.getHeader("AREACD");	    //	�����ڵ�
        String	areanm	    =	request.getHeader("AREANM")	    ==	null ? "" : request.getHeader("AREANM");	    //	������
        String	bocd	    =	request.getHeader("BOCD")	    ==	null ? "" : request.getHeader("BOCD");	    //	���������ڵ�
        String	boclsf	    =	request.getHeader("BOCLSF")	    ==	null ? "" : request.getHeader("BOCLSF");	    //	�������籸���ڵ�(�Ϲ�, ����)
        String	bonm	    =	request.getHeader("BONM")	    ==	null ? "" : request.getHeader("BONM");	    //	������
        String	email	    =	request.getHeader("EMAIL")	    ==	null ? "" : request.getHeader("EMAIL");	    //	�̸���
        String	usertype    =	request.getHeader("USERTYPE")	==	null ? "" : request.getHeader("USERTYPE");	//	usertype=3 ���������, usertype=5 ��������
        String	cmpynm	    =	request.getHeader("cmpynm")	    ==	null ? "" : request.getHeader("cmpynm");	    //	�̸���
%>
<html>
<head>
<title>��� LDAP ���� ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>
<body>
<h1> LDAP ���� </h1>
<hr>
<br>
<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" border="1">
    <tr bgcolor="#DDDDDD"><td class="gray">����</td><td class="gray">��û �ڵ�</td><td class="gray">��� ��</td></tr>
    <tr><td class="gray">���̵�                      </td><td class="gray">request.getHeader("UID")	    </td><td class="gray"><%=uid        	%>&nbsp;</td></tr>
    <tr><td class="gray">���                        </td><td class="gray">request.getHeader("EMP_NO")	    </td><td class="gray"><%=emp_no	     %>&nbsp;</td></tr>
    <tr><td class="gray">��������                    </td><td class="gray">request.getHeader("JOBCD")	    </td><td class="gray"><%=jobcd	     %>&nbsp;</td></tr>
    <tr><td class="gray">�������и�                  </td><td class="gray">request.getHeader("JOBNM")	    </td><td class="gray"><%=jobnm	     %>&nbsp;</td></tr>
    <tr><td class="gray">��å�ڵ�                    </td><td class="gray">request.getHeader("POSICD")	    </td><td class="gray"><%=posicd	     %>&nbsp;</td></tr>
    <tr><td class="gray">��å��                      </td><td class="gray">request.getHeader("POSINM")	    </td><td class="gray"><%=posinm	     %>&nbsp;</td></tr>
    <tr><td class="gray">�μ��ڵ�                    </td><td class="gray">request.getHeader("DEPTCD")	    </td><td class="gray"><%=deptcd	     %>&nbsp;</td></tr>
    <tr><td class="gray">�μ���                      </td><td class="gray">request.getHeader("DEPTNM")	    </td><td class="gray"><%=deptnm	     %>&nbsp;</td></tr>
    <tr><td class="gray">�Ǹźμ�                    </td><td class="gray">request.getHeader("SELLDEPTCD")	</td><td class="gray"><%=selldeptcd   %>&nbsp;</td></tr>
    <tr><td class="gray">�Ǹźμ���                  </td><td class="gray">request.getHeader("SELLDEPTNM")	</td><td class="gray"><%=selldeptnm   %>&nbsp;</td></tr>
    <tr><td class="gray">�����ڵ�                    </td><td class="gray">request.getHeader("AREACD")	    </td><td class="gray"><%=areacd	     %>&nbsp;</td></tr>
    <tr><td class="gray">������                      </td><td class="gray">request.getHeader("AREANM")	    </td><td class="gray"><%=areanm	     %>&nbsp;</td></tr>
    <tr><td class="gray">���������ڵ�                </td><td class="gray">request.getHeader("BOCD")	    </td><td class="gray"><%=bocd	     %>&nbsp;</td></tr>
    <tr><td class="gray">�������籸���ڵ�(�Ϲ�, ����)</td><td class="gray">request.getHeader("BOCLSF")	    </td><td class="gray"><%=boclsf	     %>&nbsp;</td></tr>
    <tr><td class="gray">������                      </td><td class="gray">request.getHeader("BONM")	    </td><td class="gray"><%=bonm	     %>&nbsp;</td></tr>
    <tr><td class="gray">�̸���                      </td><td class="gray">request.getHeader("EMAIL")	    </td><td class="gray"><%=email	     %>&nbsp;</td></tr>
    <tr><td class="gray">��뱸��(��ü,����)           </td><td class="gray">request.getHeader("USERTYPE")	    </td><td class="gray"><%=usertype	     %>&nbsp;</td></tr>
    <tr><td class="gray">cmpynm           </td><td class="gray">request.getHeader("cmpynm")	    </td><td class="gray"><%=cmpynm	     %>&nbsp;</td></tr>
</table>
</body>
</html>