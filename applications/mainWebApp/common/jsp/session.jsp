<%
/*
 * -----------------------------------------------------------------------------
 * ���ϸ�  : session.jsp
 * ������  : ������
 * �ۼ���  : ������
 * ����    : ���������� XML ���·� �����Ѵ�.
 * -----------------------------------------------------------------------------
 * �����̷�
 * Version   Date         Description		�ۼ���
 *  1.0.0    2008/10/27   �󼼼��迡 �ǰ�.		������
 * -----------------------------------------------------------------------------
 */
%>
<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%
	response.setHeader("Pragma","No-cache"); //HTTP 1.0 
	response.setDateHeader ("Expires", 0); 
	response.setHeader ("Cache-Control", "no-cache");

	RwXml rx = new RwXml();         // XML ��ü ���� 
	int id_root = rx.rootNodeID;

	int id = rx.add (id_root, "session", "" );
	if (session.getAttribute("user_auth") == null){
		rx.add(id, "ss_auth", "");
		rx.add(id, "ss_id", "");
		rx.add(id, "ss_nm", "");
		rx.add(id, "ss_mail", "");
		rx.add(id, "ss_dept_cd", "");
		rx.add(id, "ss_dept_nm", "");
		rx.add(id, "ss_comp_cd", "");
		rx.add(id, "ss_comp_nm", "");
		rx.add(id, "ss_perm_nm", "");
		rx.add(id, "ss_perm_cd", "");
	} else {
		rx.add(id, "ss_auth", session.getAttribute("user_auth").toString());
		rx.add(id, "ss_id", session.getAttribute("user_id").toString());
		rx.add(id, "ss_nm", session.getAttribute("user_nm").toString());
		rx.add(id, "ss_mail", session.getAttribute("user_mail").toString());
		rx.add(id, "ss_dept_cd", session.getAttribute("user_dept_cd").toString());
		rx.add(id, "ss_dept_nm", session.getAttribute("user_dept_nm").toString());
		rx.add(id, "ss_comp_cd", session.getAttribute("user_comp_cd").toString());
		rx.add(id, "ss_comp_nm", session.getAttribute("user_comp_nm").toString());
		rx.add(id, "ss_perm_cd", session.getAttribute("user_perm_cd").toString());
		rx.add(id, "ss_perm_nm", session.getAttribute("user_perm_nm").toString());
	}
    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());

%>