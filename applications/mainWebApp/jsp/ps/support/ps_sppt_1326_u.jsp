<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_sppt_1226_u.jsp
* ���     : ����� ���ϵǴ°�
* �ۼ����� : 2004-12-08
* �ۼ���   : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
String accflag = Util.checkString(request.getParameter("accflag"));
%>
<script language="javascript">
var lo_form1    = parent.document.code_search_form;
var ls_cur_page = lo_form1.curr_page_no.value;

if ('<%=accflag%>' == "20"){
       alert("ó�� �Ͽ����ϴ�.");
       parent.search_list(ls_cur_page);
       parent.setEventHandler();
}

</script>