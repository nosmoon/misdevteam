<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1310_l.jsp
* ��� : �̻絶��-�۱�(�������)-���
* �ۼ����� : 2004-01-09
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MOVM_RDR_RMTTDataSet ds = (SS_L_MOVM_RDR_RMTTDataSet)request.getAttribute("ds");
    int rmttListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" id="rmtt_list_id">
	<tr bgcolor="#DDDDDD" align="center" height="23">
		<td width="90" 	class="gray">��&nbsp;</td>
		<td width="90" 	class="gray">����</td>
		<td width="100" class="gray">����</td>
		<td width="100" class="gray">������</td>
		<td width="100" class="gray">����</td>
		<td width="200" class="gray">���¹�ȣ</td>
		<td class="gray">�ݾ�</td>
	</tr>

	<!-- �̻絶�� ��û��� ���� -------------------------------------------------------------------------->

	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MOVM_RDR_RMTTCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDR_RMTTCURCOMMLISTRecord)ds.curcommlist.get(i);%>

	<tr>
		<td width="90" 	class="gray" align="left"><%= curcommlistRec.deptnm%>&nbsp;</td>
		<td width="90" 	class="gray" align="left"><%= curcommlistRec.areanm%>&nbsp;</td>
		<td width="100" class="gray" align="left"><%= curcommlistRec.bonm%>&nbsp;</td>
		<td width="100" class="gray" align="left"><%= curcommlistRec.deps_persnm%>&nbsp;</td>
		<td width="100" class="gray" align="left"><%= curcommlistRec.banknm%>&nbsp;</td>
		<td width="200"	class="gray" align="left"><%= curcommlistRec.acctno%>&nbsp;</td>
		<td class="gray" align="right"><%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
	</tr>

    <%}%>


    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(rmttListCount-ds.curcommlist.size()); i++){%>

	<tr>
		<td width="90" 	class="gray" align="center">&nbsp;</td>
		<td width="90" 	class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="center">&nbsp;</td>
		<td width="100" class="gray" align="center">&nbsp;</td>
		<td width="200"	class="gray" align="center">&nbsp;</td>
		<td class="gray" align="right">&nbsp;</td>
	</tr>

    <%}%>

	<tr bgcolor="#DDDDDD">
	    <td  height="25" class="gray" colspan="7" align="right">
	    	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѱݾ� <%= Util.comma(ds.getTotalcostamt())%> �� </b>&nbsp;&nbsp;&nbsp;
	    	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
	    </td>
	</tr>

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
                <jsp:param name = "pagesize" 	value="<%= rmttListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->
<!-- �̻絶�� ��û��� �� -------------------------------------------------------------------------->

<script>
    parent.document.all.rmtt_list_id.outerHTML = rmtt_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
