<%@ page contentType="text/html; charset=euc-kr" %>
<%--@ include file="/login_ep/is_common.jsp" --%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : main.jsp
* ��� : ����������
* �ۼ����� : 2004-01-05
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
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
		// LDAP ����� ���� Request ó��
		String uid			= request.getHeader("UID")   		== null ? "" :  request.getHeader("UID"); 		 	  // ���̵�
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" :  request.getHeader("EMP_NO");         // ���
		String kflnm        = request.getHeader("KFLNM")       	== null ? "" :  request.getHeader("KFLNM");          // ����ڸ�
		String jjuminno     = request.getHeader("JJUMINNO")     == null ? "" :  request.getHeader("JJUMINNO");       // �ֹι�ȣ
		String jobcd        = request.getHeader("JOBCD")        == null ? "" :  request.getHeader("JOBCD");          // ��������
		String jobnm        = request.getHeader("JOBNM")        == null ? "" :  request.getHeader("JOBNM");          // �������и�
		String deptcd       = request.getHeader("DEPTCD")       == null ? "" :  request.getHeader("DEPTCD");         // �μ��ڵ�
		String deptnm       = request.getHeader("DEPTNM")       == null ? "" :  request.getHeader("DEPTNM");         // �μ���
		String bocd         = request.getHeader("BOCD")         == null ? "" :  request.getHeader("BOCD");           // ���������ڵ�
		String bonm         = request.getHeader("BONM")         == null ? "" :  request.getHeader("BONM");           // ���������
		String boclsf       = request.getHeader("BOCLSF")       == null ? "" :  request.getHeader("BOCLSF");         // �������籸���ڵ�
		String posicd       = request.getHeader("POSICD")       == null ? "" :  request.getHeader("POSICD");         // ��å�ڵ�
		String posinm       = request.getHeader("POSINM")       == null ? "" :  request.getHeader("POSINM");         // ��å��
		String email        = request.getHeader("EMAIL")        == null ? "" :  request.getHeader("EMAIL");          // �̸���



		// LDAP ����� ���� Session ó��
		session.setAttribute("uid"			,uid		); 		// ���̵�
//		session.setAttribute("emp_no"		,emp_no     );      // ���
//		session.setAttribute("kflnm"		,kflnm      );      // ����ڸ�
//		session.setAttribute("jjuminno"		,jjuminno   );      // �ֹι�ȣ
//		session.setAttribute("jobcd"		,jobcd      );      // ��������
//		session.setAttribute("jobnm"		,jobnm      );      // �������и�
//		session.setAttribute("deptcd"		,deptcd     );      // �μ��ڵ�
//		session.setAttribute("deptnm"       ,deptnm     );      // �μ���
//		session.setAttribute("bocd"   		,bocd 		);      // ���������ڵ�
//		session.setAttribute("bonm"         ,bonm     	);      // ���������
//		session.setAttribute("boclsf"       ,boclsf     );      // �������籸���ڵ�
//		session.setAttribute("posicd"   	,posicd 	);      // ��å�ڵ�
//		session.setAttribute("posinm"       ,posinm     );      // ��å��
//		session.setAttribute("email"   		,email 		);      // �̸���
%>
<html>
<head>
<title>��� LDAP ���� ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>
<body>
<h1> LDAP ���� </h1>
<hr>
<br><%=Password%>
<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" border="1">
	<tr bgcolor="#DDDDDD">
		<td class="gray">����</td><td class="gray">��û �ڵ�</td><td class="gray">��� ��</td>
	</tr>
	<tr>
		<td class="gray">���̵�      </td><td class="gray">request.getHeader("UID")         </td><td class="gray"><%= uid	%>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">���        </td><td class="gray">request.getHeader("EMP_NO")     </td><td class="gray"><%= emp_no %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">����ڸ�    </td><td class="gray">request.getHeader("KFLNM")       </td><td class="gray"><%= kflnm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">�ֹι�ȣ    </td><td class="gray">request.getHeader("JJUMINNO")    </td><td class="gray"><%= jjuminno %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">��������    </td><td class="gray">request.getHeader("JOBCD")       </td><td class="gray"><%= jobcd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">�������и�  </td><td class="gray">request.getHeader("JOBNM")       </td><td class="gray"><%= jobnm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">�μ��ڵ�   </td><td class="gray">request.getHeader("DEPTCD")       </td><td class="gray"><%= deptcd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">�μ���     </td><td class="gray">request.getHeader("DEPTNM")       </td><td class="gray"><%= deptnm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">���������ڵ�</td><td class="gray">request.getHeader("BOCD")         </td><td class="gray"><%= bocd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">���������  </td><td class="gray">request.getHeader("BONM")         </td><td class="gray"><%= bonm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">�������籸���ڵ�</td><td class="gray">request.getHeader("BOCLSF")    </td><td class="gray"><%= boclsf %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">��å�ڵ�    </td><td class="gray">request.getHeader("POSICD")      </td><td class="gray"><%= posicd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray">��å��      </td><td class="gray">request.getHeader("POSINM")     </td><td class="gray"><%= posinm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray">�̸���      </td><td class="gray">request.getHeader("EMAIL")      </td><td class="gray"><%= email %>&nbsp;</td>
	</tr>
</table>
</body>
</html>
