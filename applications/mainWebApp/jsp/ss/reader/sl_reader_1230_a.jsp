<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1230_a.jsp
* ��� 		 : ������������(�Ա���������)
* �ۼ����� 	 :
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
	String result = (String)request.getAttribute("result");
	out.write("result  : " + result);

    //request
    String rdr_no = request.getParameter("rdr_no");
    String medicd = request.getParameter("medicd");
%>
<script language="javascript">
<!--
	alert("����Ǿ����ϴ�.");
	// ������ ���� ���� reset ���ش�.
	parent.rcpm_list_search('<%=rdr_no%>','<%=medicd%>', '');
-->
</script>
<%
	out.flush();
%>