<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1010_l.jsp
* ��� : �������� ���� ����Ʈ ��������
* �ۼ����� : 2003-10-27
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
    CO_L_SCHEDataSet ds = (CO_L_SCHEDataSet)request.getAttribute("ds");    // request dataset
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
%>

<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="sche_list_id">
<form name="sche_list_form" method="post" action="">
	<input type="hidden" name="seq">			<!--�Ϸù�ȣ-->

	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="80">����</td>
		<td class="gray" width="80">��&nbsp;</td>
		<td class="gray" width="80">�����</td>
		<td class="gray" width="100">������</td>
		<td class="gray" width="90">��������</td>
		<td class="gray" width="90">��������</td>
		<td class="gray">����</td>
	</tr>

    <%-- ���� ��� ����--%>
    <%for(int i=0 ; i< ds.curcommlist.size(); i++) {
        CO_L_SCHECURCOMMLISTRecord curcommlistRec = (CO_L_SCHECURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.seq%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" width="80" align="left">&nbsp; <%= curcommlistRec.schemangunitcd_nm%></td>
		<td class="gray" width="80" align="left">&nbsp; <%= curcommlistRec.deptnm%></td>
		<td class="gray" width="80" align="left">&nbsp; <%= curcommlistRec.empnm%></td>
		<td class="gray" width="100" align="left">&nbsp; <%= curcommlistRec.schemangitemcd_nm%></td>
		<td class="gray" width="90" align="center">&nbsp; <%=Util.Timestamp2Str(curcommlistRec.frdt)%> </td>
		<td class="gray" width="90" align="center">&nbsp; <%=Util.Timestamp2Str(curcommlistRec.todt)%> </td>
		<td class="gray">&nbsp; <%= curcommlistRec.remk%></td>
	</tr>
    <%}%>
    <%-- ���� ��� ��--%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="90" align="center">&nbsp;</td>
		<td class="gray" width="90" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <%}%>
	<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="7" height="23" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%=Util.comma(ds.getTotalcnt())%> �� </b>
		</td>
	</tr>
</form>
</table>
<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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
                <jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<script>
    parent.document.all.sche_list_id.outerHTML = sche_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

    // ȭ�� �ʱ�ȭ
    parent.add();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
