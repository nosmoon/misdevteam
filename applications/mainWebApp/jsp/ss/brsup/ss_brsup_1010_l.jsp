<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1010_l.jsp
* ��� : ��������-�Ź�������ǰ-���-���
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWSPITEMDataSet ds = (SS_L_NWSPITEMDataSet)request.getAttribute("ds");
    int nwspitemListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
%>

<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" id="nwspitem_list_id">

<form name="nwspitem_list_form" method="post" action="">
	<input name="itemcd" type="hidden" value ="">					<!-- ��ǰ�ڵ� -->

	<tr bgcolor="#dddddd" height="23">
		<td class="gray" align="center">��ǰ��</td>
		<td width="100" class="gray" align="center">��ǰ�ڵ�</td>
		<td width="150" class="gray" align="center">��ǰ����</td>
		<td width="100" class="gray" align="center">�߼۱���</td>
		<td width="100" class="gray" align="center">���û������</td>
		<td width="100" class="gray" align="center">�ܰ�</td>
		<td width="100" class="gray" align="center">������</td>
	</tr>

	<!-- �Ź�������ǰ ��� ���� -------------------------------------------------------------------------->
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- �� ��ũ -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.itemcd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" align="left">&nbsp;<%= curcommlistRec.itemnm%></td>
		<td width="100" class="gray" align="center"><%= curcommlistRec.itemcd%>&nbsp;</td>
		<td width="150" class="gray" align="left">&nbsp;<%= curcommlistRec.itemclsfnm%></td>
		<td width="100" class="gray" align="left">&nbsp;<%= curcommlistRec.sendclsfnm%></td>
		<td width="100" class="gray" align="left">&nbsp;<%= curcommlistRec.costclsfnm%></td>
		<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.uprc)%>&nbsp;</td>
		<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.qunt)%>&nbsp;</td>
	</tr>
    <%}%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(nwspitemListCount-ds.curcommlist.size()); i++){%>
    <tr>
		<td class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="center">&nbsp;</td>
		<td width="150" class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="right">&nbsp;</td>
		<td width="100" class="gray" align="right">&nbsp;</td>
	</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>

	<tr bgcolor="#dddddd">
		<td height="23" class="gray" colspan="11" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt()) %> �� </b>
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
                <jsp:param name = "pagesize" 	value="<%= nwspitemListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->
<!-- �Ź�������ǰ ��� �� -------------------------------------------------------------------------->

<script>
    parent.document.all.nwspitem_list_id.outerHTML = nwspitem_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
    // ȭ�� �ʱ�ȭ
    parent.add();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>   
</script>
