<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_2130_u.jsp
* ��� : �������� Ÿ�絿�⺸�� ����
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
    String seq = Util.checkString((String)request.getAttribute("seq"));
    
    String curr_page_no = Util.checkString((String)request.getAttribute("curr_page_no"));
    String records_per_page = Util.checkString((String)request.getAttribute("records_per_page"));
    String srchdeptcd = Util.checkString((String)request.getAttribute("srchdeptcd"));
    String makedt1 = Util.checkString((String)request.getAttribute("makedt1"));
    String makedt2 = Util.checkString((String)request.getAttribute("makedt2"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    String brwscnt = Util.checkString((String)request.getAttribute("brwscnt"));
    int brwscnt_int = Integer.parseInt(brwscnt) - 1;
    
%>

<script language="javascript">
<!--
// Ÿ�絿�⺸�� ���� Ȯ��
function update_ok(){
    alert("�����Ǿ����ϴ�.");
    dawnrpt_update_form.action="/ss/share/2120";
    dawnrpt_update_form.submit();
}    
-->
</script>

<body onload=update_ok();>
<form name="dawnrpt_update_form" method="post" action="">
	<input type="hidden" name="seq" value="<%=seq%>">              <!--Ÿ�絿�⺸�� pk��-->
	<input type="hidden" name="curr_page_no" value="<%=curr_page_no%>">
	<input type="hidden" name="records_per_page" value="<%=records_per_page%>">
	<input type="hidden" name="srchdeptcd" value="<%=srchdeptcd%>">
	<input type="hidden" name="makedt1" value="<%=makedt1%>">
	<input type="hidden" name="makedt2" value="<%=makedt2%>">		
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
	<input type="hidden" name="brwscnt" value="<%= brwscnt_int%>">
</form>
</body>
