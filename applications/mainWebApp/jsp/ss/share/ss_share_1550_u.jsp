<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1550_u.jsp
* ��� : �������� �Խ��� �̽� ��õ
* �ۼ����� : 2004-01-07
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
    String pageno = Util.checkString((String)request.getAttribute("pageno"));
    String pagesize = Util.checkString((String)request.getAttribute("pagesize"));
    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //���źμ�
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    String brwscnt = Util.checkString((String)request.getAttribute("brwscnt"));
    int brwscnt_int = Integer.parseInt(brwscnt) - 1;  
    
%>

<script language="javascript">
<!--
//�Խ��� �̽� ��õȮ��
function recom_ok(){
    alert("��õ�Ͽ����ϴ�.");
    infoexg_recom_form.action="/ss/share/1520";
    infoexg_recom_form.submit();
}    
-->
</script>

<body onload=recom_ok();>
<form name="infoexg_recom_form" method="post" action="">
	<input type="hidden" name="seq" value="<%=seq%>">
	<input type="hidden" name="pageno" value="<%=pageno%>">
	<input type="hidden" name="pagesize" value="<%=pagesize%>">
	<input type="hidden" name="rmsgdept" value="<%=rmsgdept%>">
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
	<input type="hidden" name="brwscnt" value="<%= brwscnt_int%>">	
</form>
</body>
