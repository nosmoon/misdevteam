<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1605_l.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-�������-���
* �ۼ����� : 2004-03-29
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_CYEXTNDataSet ds = (SS_L_PROMSTAF_CYEXTNDataSet)request.getAttribute("ds");
    int promstafListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
%>

<!-- ��� ���� -------------------------------------------------------------------------->
<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="promstaf_list_id">
<form name="promstaf_list_form" method="post" action="" >
	<input name="stafclsfcd" type="hidden" value="">
	<input name="stafno" type="hidden" value="">

	<tr align="center" height="23">
		<td width="150" bgcolor="#dddddd" class="gray">�����</td>
		<td width="150" bgcolor="#dddddd" class="gray">�����ڸ�</td>
		<td width="150" bgcolor="#dddddd" class="gray">�������</td>
		<td width="150" bgcolor="#dddddd" class="gray">�޴�����ȣ</td>
		<td bgcolor="#dddddd" class="gray">�̸���</td>
	</tr>

	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- �� ��ũ -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.stafclsfcd%>','<%= curcommlistRec.stafno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td width="150" class="gray" align="left">&nbsp;<%= curcommlistRec.stafnm%></td>
		<td width="150" class="gray" align="left">&nbsp;<%= curcommlistRec.cnvsstafnm%></td>
		<td width="150" class="gray" align="center">&nbsp;<%= Util.convertS(curcommlistRec.in_cmpydt)%></td>
		<td width="150" class="gray" align="left">&nbsp;<%= Util.getChainStr(curcommlistRec.ptph_no1,curcommlistRec.ptph_no2,curcommlistRec.ptph_no3,"-")%></td>
		<td class="gray" align="left">&nbsp;<%= curcommlistRec.email%></td>
	</tr>
    <%}%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(promstafListCount-ds.curcommlist.size()); i++){%>
    <tr>
		<td width="150" class="gray">&nbsp;</td>
		<td width="150" class="gray">&nbsp;</td>
		<td width="150" class="gray">&nbsp;</td>
		<td width="150" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>

	<tr bgcolor="#dddddd">
		<td  height="23" class="gray" colspan="11" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt()) %> �� </b>
		</td>
	</tr>
</form>
</table>
<!-- ��� �� -------------------------------------------------------------------------->

<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_id">
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
                <jsp:param name = "pagesize" 	value="<%= promstafListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<!--���̹���� �� ����-->
<table width="830" border="0"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="promstaf_detail_id">
	<tr>
		<td rowspan="4" width="80" bgcolor="#EBE9DC" class="gray">�������</td>
		<td width="100" bgcolor="#dddddd" class="gray">����</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">�������</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">�ֹε�Ϲ�ȣ</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <tr>
		<td width="100" bgcolor="#dddddd" class="gray">��ȭ��ȣ</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">�޴�����ȣ</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">�̸���<font color="red">&nbsp;</font></td>
		<td class="gray">&nbsp;</td>
    </tr>
    <tr>
		<td width="100" bgcolor="#dddddd" class="gray">�ּ�</td>
		<td colspan="5"  class="gray">&nbsp;</td>
    </tr>
    <tr >
		<td width="100" bgcolor="#dddddd" class="gray">�����</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">������</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">���¹�ȣ</td>
		<td class="gray">&nbsp;</td>
    </tr>
	<tr>
		<td rowspan="2" width="80" bgcolor="#EBE9DC" class="gray">����������</td>
		<td width="100" bgcolor="#dddddd" class="gray">����</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">�������</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">�ֹε�Ϲ�ȣ</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <tr>
		<td width="100" bgcolor="#dddddd" class="gray">��ȭ��ȣ</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" bgcolor="#dddddd" class="gray">�޴�����ȣ</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="100" bgcolor="#dddddd" class="gray">�̸���<font color="red">&nbsp;</font></td>
		<td class="gray">&nbsp;</td>
    </tr>
</table>
<!--���̹���� �� ��-->

<script>
    parent.document.all.promstaf_list_id.outerHTML = promstaf_list_id.outerHTML;
    parent.document.all.page_move_id.outerHTML = page_move_id.outerHTML;

    // ���� �ʱ�ȭ
    parent.document.all.promstaf_detail_id.outerHTML = promstaf_detail_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
