<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1830_u.jsp
* ��� : �������� ���Ͼ������� ����
* �ۼ����� : 2003-12-23
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    String makedt = Util.checkString((String)request.getAttribute("makedt"));
    String makepersid = Util.checkString((String)request.getAttribute("makepersid"));
    
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
// ���Ͼ������� ���� Ȯ��
function update_ok(){
    alert("�����Ǿ����ϴ�.");
    jobrec_update_form.action="/ss/share/1820";
    jobrec_update_form.submit();
}    
-->
</script>

<body onload=update_ok();>
<form name="jobrec_update_form" method="post" action="">
	<input type="hidden" name="makedt" value="<%=makedt%>">              <!--���Ͼ������� pk��-->
	<input type="hidden" name="makepersid" value="<%=makepersid%>">      <!--���Ͼ������� pk��-->
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