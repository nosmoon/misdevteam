<%@ page contentType="text/html; charset=EUC-KR" %>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
        somo.framework.util.*;
"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ep.jsp
* ��� : EP�� ���ؼ� �˾�ȭ������ ������ ����ڿ� ���� ����ó�� �� �ش� XRW ȣ��
* �ۼ����� : 2009-03-24
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 	
* ������ : 	
* �������� : 	
---------------------------------------------------------------------------------------------------%>

<%
	System.out.println(" =============== decid.jsp =============== ");
		// LDAP ����� ���� Request ó�� (�� CRM ������� �׸��)
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

		// CIIS �߰� �׸��
		String hdqtcd		= request.getHeader("HDQTCD")   	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTCD")); 			// ����
		String hdqtnm		= request.getHeader("HDQTNM")   	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTNM")); 			// ���θ�
		String partcd		= request.getHeader("PARTCD")   	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTCD")); 			// ��Ʈ�ڵ�
		String partnm		= request.getHeader("PARTNM")   	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTNM")); 			// ��Ʈ��
		String hdqtplacyn	= request.getHeader("HDQTPLACYN") 	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTPLACYN")); 		// �����忩��
		String partplacyn	= request.getHeader("PARTPLACYN") 	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTPLACYN")); 		// ��Ʈ�忩��
		String dealmedicd	= request.getHeader("DEALMEDICD")  	== null ? "" : Util.Uni2Ksc(request.getHeader("DEALMEDICD")); 		// ������ü�ڵ�
		String strdocID		= request.getParameter("docID")  	== null ? "" : Util.Uni2Ksc(request.getParameter("docID")); 		// docID
		String strprotID 	= request.getParameter("protID")  	== null ? "" : Util.Uni2Ksc(request.getParameter("protID")); 		// protID
		String strDocument 	= request.getParameter("Document")  == null ? "" : Util.Uni2Ksc(request.getParameter("Document")); 		// Document

System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
System.out.println("uid : " + uid + " cmpy_cd : " + cmpycd + " deptcd : " + deptcd );
System.out.println("uid : " + uid + " docID : " + strdocID + " protID : " + strprotID + " Document : " + strDocument);
	
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
		
		// CIIS �߰� �׸��
		session.setAttribute("hdqtcd"       ,hdqtcd     );      // ����        
		session.setAttribute("hdqtnm"       ,hdqtnm     );      // ���θ�      
		session.setAttribute("partcd"       ,partcd     );      // ��Ʈ�ڵ�    
		session.setAttribute("partnm"       ,partnm     );      // ��Ʈ��      
		session.setAttribute("hdqtplacyn" 	,hdqtplacyn );      // �����忩��  
		session.setAttribute("partplacyn" 	,partplacyn );      // ��Ʈ�忩��  
		session.setAttribute("dealmedicd"  	,dealmedicd );      // ������ü�ڵ�


		response.sendRedirect("/co/decid/1001?docID=" + strdocID + "&protID=" + strprotID + "&Document=" + strDocument); 
%>
