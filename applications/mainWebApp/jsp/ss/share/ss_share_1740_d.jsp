<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1740_d.jsp
* ��� : �������� �Խ��� ����� ����
* �ۼ����� : 2003-12-08
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "10";}
    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //���źμ�����
    String rmsgarea = Util.checkString((String)request.getAttribute("rmsgarea"));         //������������
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
%>

<script language="javascript">
<!--
// ����� ���� Ȯ��
function update_ok(){
    alert("�����Ǿ����ϴ�.");
    infoexg_delete_form.action="/ss/share/1701";
    infoexg_delete_form.submit();
}    
-->
</script>

<body onload=update_ok();>
<form name="infoexg_delete_form" method="post" action="">
	<input type="hidden" name="pageno" value="<%=pageno%>">
	<input type="hidden" name="pagesize" value="<%=pagesize%>">
	<input type="hidden" name="rmsgdept" value="<%=rmsgdept%>">
	<input type="hidden" name="rmsgarea" value="<%=rmsgarea%>">	
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
</form>
</body>
