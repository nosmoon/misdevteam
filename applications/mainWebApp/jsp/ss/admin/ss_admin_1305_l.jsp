<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1305_l.jsp
* ��� : ������-���ϸ���-���ޱ���-���
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MIGLBASIDataSet ds = (SS_L_MIGLBASIDataSet)request.getAttribute("ds");
	int paybasiListCount = 10;
%>
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="paybasi_list_id">
<form name="paybasi_list_form" method="post" action="">
    <input name="cmpycd" type="hidden" value ="">			<!--ȸ���ڵ�-->
    <input name="medicd" type="hidden" value ="">           <!--��ü�ڵ�-->
    <input name="payclsfcd" type="hidden" value ="">        <!--���ޱ���-->
    <input name="paybasicd" type="hidden" value ="">        <!--���ޱ���-->
    
	<tr align="center" bgcolor="#dddddd" height="23">
		<td class="gray">ȸ��</td>
		<td width="110" class="gray">��ü</td>
		<td width="110" class="gray">����</td>
		<td width="130" class="gray">���ޱ���</td>
		<td width="60" class="gray">����Ʈ</td>
		<td width="60" class="gray">����</td>
		<td width="60" class="gray">�������</td>
		<td width="60" class="gray">��������</td>
		<td width="60" class="gray">����ȯ��</td>
	</tr>
<%-- ���ޱ��� ��� ���--%>
<%  for(int i=0; i<ds.curcommlist.size(); i++){
        SS_L_MIGLBASICURCOMMLISTRecord curcommlistRec = (SS_L_MIGLBASICURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- ���ޱ��� �� ��ũ -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.cmpycd%>','<%= curcommlistRec.medicd%>','<%= curcommlistRec.payclsfcd%>','<%= curcommlistRec.paybasicd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" align="left"><%= curcommlistRec.cmpy%>&nbsp;</td>
		<td class="gray" width="110" align="left"><%= curcommlistRec.medinm%>&nbsp;</td>
		<td class="gray" width="110" align="left"><%= curcommlistRec.payclsf%>&nbsp;</td>
		<td class="gray" width="130" align="left"><%= curcommlistRec.paybasi%>&nbsp;</td>
		<td class="gray" width="60" align="right"><%= curcommlistRec.pont%>&nbsp;</td>
		<td class="gray" width="60" align="right"><%= curcommlistRec.pontrate%>&nbsp;</td>
		<td class="gray" width="60" align="right"><%= curcommlistRec.hdqtallmratio%>&nbsp;</td>
		<td class="gray" width="60" align="right"><%= curcommlistRec.boallmratio%>&nbsp;</td>
		<td class="gray" width="60" align="right"><%= curcommlistRec.adjmexchrate%>&nbsp;</td>
    </tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
<%for(int i=0; i<(paybasiListCount-ds.curcommlist.size()); i++){%>
    <tr>
		<td class="gray" align="center"> &nbsp; </td>
		<td class="gray" width="110" align="center"> &nbsp; </td>
		<td class="gray" width="110" align="center"> &nbsp; </td>
		<td class="gray" width="130" align="center"> &nbsp; </td>
		<td class="gray" width="60" align="right"> &nbsp; </td>
		<td class="gray" width="60" align="right"> &nbsp; </td>
		<td class="gray" width="60" align="right"> &nbsp; </td>
		<td class="gray" width="60" align="right"> &nbsp; </td>
		<td class="gray" width="60" align="right"> &nbsp; </td>
    </tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	<tr align="right">
		<td  colspan="9" bgcolor="#dddddd" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
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
                <jsp:param name = "pagesize" 	value="<%=paybasiListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<script>
    parent.document.all.paybasi_list_id.outerHTML = paybasi_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
    // ȭ�� �ʱ�ȭ
    parent.add();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    

</script>
