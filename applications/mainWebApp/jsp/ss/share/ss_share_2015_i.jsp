<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_2015_i.jsp
* ��� : �������� �����ٹ����� ���
* �ۼ����� : 2003-12-29
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    String curr_page_no = Util.checkString((String)request.getAttribute("curr_page_no"));
    String records_per_page = Util.checkString((String)request.getAttribute("records_per_page"));
    String srchdeptcd = Util.checkString((String)request.getAttribute("srchdeptcd"));
    String makedt1 = Util.checkString((String)request.getAttribute("makedt1"));
    String makedt2 = Util.checkString((String)request.getAttribute("makedt2"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    String brwscnt = Util.checkString((String)request.getAttribute("brwscnt"));
%>

<script language="javascript">
<!--
// �����ٹ����� ��� Ȯ��
function insert_ok(){
    alert("��ϵǾ����ϴ�.");
    dawnrpt_insert_form.action="/ss/share/2001";
    dawnrpt_insert_form.submit();
}    
-->
</script>

<body onload=insert_ok();>
<form name="dawnrpt_insert_form" method="post" action="">
	<input type="hidden" name="curr_page_no" value="<%=curr_page_no%>">
	<input type="hidden" name="records_per_page" value="<%=records_per_page%>">
	<input type="hidden" name="srchdeptcd" value="<%=srchdeptcd%>">
	<input type="hidden" name="makedt1" value="<%=makedt1%>">
	<input type="hidden" name="makedt2" value="<%=makedt2%>">		
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
</form>
</body>
