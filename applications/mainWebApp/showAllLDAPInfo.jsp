<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
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

		// LDAP ����� ���� Request ó��
		String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // ���̵�
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NO"));         // ���
		String emp_nm       = request.getHeader("EMP_NM")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NM"));         // ����
		String cmpycd       = request.getHeader("CMPYCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYCD"));         // ȸ��
		String deptcd       = request.getHeader("DEPTCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTCD"));         // �μ�
		String deptnm       = request.getHeader("DEPTNM")       == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTNM"));         // �μ���
		String selldeptcd	= request.getHeader("SELLDEPTCD")   == null ? "" : Util.Uni2Ksc(request.getHeader("SELLDEPTCD"));     // �Ǹźμ�
		String selldeptnm   = request.getHeader("SELLDEPTNM")   == null ? "" : Util.Uni2Ksc(request.getHeader("SELLDEPTNM"));     // �Ǹźμ���
		String areacd       = request.getHeader("AREACD")       == null ? "" : Util.Uni2Ksc(request.getHeader("AREACD"));         // ���������ڵ�
		String areanm       = request.getHeader("AREANM")       == null ? "" : Util.Uni2Ksc(request.getHeader("AREANM"));         // ����������
		String deptplacyn   = request.getHeader("DEPTPLACYN")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTPLACYN"));     // �μ��忩��
		String jobcd        = request.getHeader("JOBCD")        == null ? "" : Util.Uni2Ksc(request.getHeader("JOBCD"));          // ��������
		String jobnm        = request.getHeader("JOBNM")        == null ? "" : Util.Uni2Ksc(request.getHeader("JOBNM"));          // �������и�
		String posicd       = request.getHeader("POSICD")       == null ? "" : Util.Uni2Ksc(request.getHeader("POSICD"));         // ��å�ڵ�
		String posinm       = request.getHeader("POSINM")       == null ? "" : Util.Uni2Ksc(request.getHeader("POSINM"));         // ��å��
		String usertypecd   = request.getHeader("USERTYPECD")   == null ? "" : Util.Uni2Ksc(request.getHeader("USERTYPECD"));     // ��������ڵ�
		String usertypenm   = request.getHeader("USERTYPENM")   == null ? "" : Util.Uni2Ksc(request.getHeader("USERTYPENM"));     // ������и�
		String email        = request.getHeader("EMAIL")        == null ? "" : Util.Uni2Ksc(request.getHeader("EMAIL"));          // �̸���
		String dealdeptcd   = request.getHeader("DEALDEPTCD")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEALDEPTCD"));     // �����μ��ڵ�
		String dealdeptnm   = request.getHeader("DEALDEPTNM")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEALDEPTNM"));	  // �����μ���
		String mobile	    = request.getHeader("mobile")   	== null ? "" : Util.Uni2Ksc(request.getHeader("mobile"));	  // �����μ���



		// LDAP ����� ���� Session ó��
		session.setAttribute("uid"			,uid		); 		// ���̵�
		session.setAttribute("emp_no"		,emp_no     );      // ���
		session.setAttribute("emp_nm"		,emp_nm    	);      // ����
		session.setAttribute("cmpycd"		,cmpycd     );      // ȸ��
		session.setAttribute("deptcd"		,deptcd     );      // �μ�
		session.setAttribute("deptnm"		,deptnm     );      // �μ���
		session.setAttribute("selldeptcd"   ,selldeptcd );      // �Ǹźμ�
		session.setAttribute("selldeptnm"   ,selldeptnm );      // �Ǹźμ���
		
		session.setAttribute("dealdeptcd"   ,dealdeptcd );      // �����μ��ڵ�
		session.setAttribute("dealdeptnm"   ,dealdeptnm );      // �����μ���		
		session.setAttribute("areacd"       ,areacd     );      // ���������ڵ�
		session.setAttribute("areanm"       ,areanm     );      // ����������
		
		session.setAttribute("deptplacyn"   ,deptplacyn );      // �μ��忩��
		session.setAttribute("jobcd"        ,jobcd      );      // ��������
		session.setAttribute("jobnm"        ,jobnm      );      // �������и�
		session.setAttribute("posicd"       ,posicd     );      // ��å�ڵ�
		session.setAttribute("posinm"       ,posinm     );      // ��å��
		session.setAttribute("usertypecd"   ,usertypecd );      // ��������ڵ�
		session.setAttribute("usertypenm"   ,usertypenm );      // ������и�
		session.setAttribute("email"        ,email      );      // �̸���
		
		session.setAttribute("mobile"        ,mobile      );      // �̸���		

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
	<tr bgcolor="#DDDDDD">
		<td class="gray" width="120">����			</td><td class="gray">��û �ڵ�							</td><td class="gray">��� ��</td>
	</tr>
	<tr>
		<td class="gray width="120"">���̵�      	</td><td class="gray">request.getHeader("UID")        	</td><td class="gray"><%= uid	%>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">���        	</td><td class="gray">request.getHeader("EMP_NO")     	</td><td class="gray"><%= emp_no %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">����        	</td><td class="gray">request.getHeader("EMP_NM")     	</td><td class="gray"><%= emp_nm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">ȸ��        	</td><td class="gray">request.getHeader("CMPYCD")     	</td><td class="gray"><%= cmpycd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">�μ�        	</td><td class="gray">request.getHeader("DEPTCD")     	</td><td class="gray"><%= deptcd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">�μ���      	</td><td class="gray">request.getHeader("DEPTNM")     	</td><td class="gray"><%= deptnm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">�Ǹźμ�    	</td><td class="gray">request.getHeader("SELLDEPTCD") 	</td><td class="gray"><%= selldeptcd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">�Ǹźμ���  	</td><td class="gray">request.getHeader("SELLDEPTNM") 	</td><td class="gray"><%= selldeptnm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">���������ڵ�	</td><td class="gray">request.getHeader("AREACD")     	</td><td class="gray"><%= areacd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">������      	</td><td class="gray">request.getHeader("AREANM")     	</td><td class="gray"><%= areanm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">�μ��忩��  	</td><td class="gray">request.getHeader("DEPTPLACYN") 	</td><td class="gray"><%= deptplacyn %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">��������    	</td><td class="gray">request.getHeader("JOBCD")      	</td><td class="gray"><%= jobcd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">�������и�  	</td><td class="gray">request.getHeader("JOBNM")      	</td><td class="gray"><%= jobnm %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">��å�ڵ�    	</td><td class="gray">request.getHeader("POSICD")     	</td><td class="gray"><%= posicd %>&nbsp;</td>
	</tr>
    <tr>
		<td class="gray" width="120">��å��      	</td><td class="gray">request.getHeader("POSINM")     	</td><td class="gray"><%= posinm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">��������ڵ�	</td><td class="gray">request.getHeader("USERTYPECD") 	</td><td class="gray"><%= usertypecd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">������и�  	</td><td class="gray">request.getHeader("USERTYPENM") 	</td><td class="gray"><%= usertypenm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">�̸���      	</td><td class="gray">request.getHeader("EMAIL")      	</td><td class="gray"><%= email %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">�����μ��ڵ�	</td><td class="gray">request.getHeader("DEALDEPTCD") 	</td><td class="gray"><%= dealdeptcd %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">�����μ���  	</td><td class="gray">request.getHeader("DEALDEPTNM") 	</td><td class="gray"><%= dealdeptnm %>&nbsp;</td>
	</tr>
	<tr>
		<td class="gray" width="120">�ڵ��� 	</td><td class="gray">request.getHeader("mobile") 	</td><td class="gray"><%= mobile %>&nbsp;</td>
	</tr>	
</table>
</body>
</html>
