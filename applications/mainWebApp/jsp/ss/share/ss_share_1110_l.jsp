<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1110_l.jsp
* ��� : �������� Ÿ��߼ۺμ� ��ȸȭ��
* �ۼ����� : 2003-11-20
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
    SS_L_OTHQTYDataSet ds = (SS_L_OTHQTYDataSet) request.getAttribute("ds");  // request dataset
    int listCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
%>

<table width="830" border="0" cellspacing="0" cellpadding="1" align="center" bgcolor="#FFFFFF" class="gray" id="othqty_list_id">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td class="gray">�������</td>
		<td class="gray" width="120">��&nbsp;</td>
		<td class="gray" width="120">����</td>
		<td class="gray" width="120">����</td>
		<td class="gray" width="120">�߾��Ϻ�</td>
		<td class="gray" width="120">�����Ϻ�</td>
		<td class="gray" width="120">��Ÿ</td>
	</tr>
	<%-- �������� Ÿ�� �߼ۺμ� ����Ʈ ���� ���� �κ�--%>
	<%for(int i=0 ; i< ds.curcommlist.size(); i++) {
        SS_L_OTHQTYCURCOMMLISTRecord rec = (SS_L_OTHQTYCURCOMMLISTRecord)ds.curcommlist.get(i); %>

	<tr>
		<td class="gray" align="center"> &nbsp;<%= Util.convertS(rec.getInvsgdt()) %> </td>
		<td class="gray" width="120" align="left"> &nbsp;<%= rec.getDeptnm()%> </td>
		<td class="gray" width="120" align="left"> &nbsp;<%= rec.getAreanm()%> </td>
		<td class="gray" width="120" align="left"> &nbsp;<%= rec.getBonm()%> </td>
		<td class="gray" width="120" align="right"> &nbsp;<%= Util.comma(rec.getJoong_qty())%> </td>
		<td class="gray" width="120" align="right"> &nbsp;<%= Util.comma(rec.getDong_qty())%> </td>
		<td class="gray" width="120" align="right"> &nbsp;<%= Util.comma(rec.getEtc_qty())%> </td>
	</tr>
    <%}%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" align="center"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
	</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="7" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
		</td>
	</tr>
</table>
<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
	<tr>
		<td align="center" height="2">
		<!--����-->
		</td>
	</tr>
	<tr>
		<td align="center" height="24" bgcolor="#E8E8E8">
			<!--JSP PAGE START---------------------------------------------------------------------------------->
			<%
			String pageno = request.getParameter("pageno");
			String totalcnt = String.valueOf(ds.getTotalcnt());
			String js_fn_nm = request.getParameter("js_fn_nm");
			%>
			<jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
			<jsp:param name = "pageno" 		value="<%=pageno%>"/>
			<jsp:param name = "totalcnt" 	value="<%=totalcnt%>"/>
			<jsp:param name = "js_fn_nm" 	value="<%=js_fn_nm%>"/>
			<jsp:param name = "pagesize" 	value="<%= listCount%>"/>
			<jsp:param name = "page_set_gubun" 	value="0"/>
			</jsp:include>
			<!--JSP PAGE END------------------------------------------------------------------------------------>
		</td>
	</tr>
</table>
<!-- ������ �̵� -->

<script>
    parent.document.all.othqty_list_id.outerHTML = othqty_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();


<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
