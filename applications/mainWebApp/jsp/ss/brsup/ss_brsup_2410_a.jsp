<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_brsup_1310_a.jsp
* ���     : �ְ���������-���긶��-���������
* �ۼ����� : 2007-04-17
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    String accflag	=	request.getParameter("accflag");
    String pageno	=	request.getParameter("pageno");

    if(pageno=="" || pageno.equals("")) {
        pageno = "1";
    }

System.out.println("pageno");
%>

<script language="JavaScript">
<!--
<%
	if(accflag.equals("M")){
%>
    alert("���긶�� �Ϸ�Ǿ����ϴ�.");
<%
	} else if(accflag.equals("C")){
%>
    alert("���긶�� ��ҵǾ����ϴ�.");
<%
	}
%>

	//��˻�
	parent.closlist_sear("<%=pageno%>");

    // ȭ�� �ʱ�ȭ
    parent.jsInit();

//-->
</script>
