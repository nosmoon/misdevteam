<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1410_l.jsp
* ��� : ������Ȳ-VacationStop ���-���
* �ۼ����� : 2004-01-20
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VSCOST_COSTDataSet ds = (SS_L_VSCOST_COSTDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
%>

<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="vscost_list_id">
	<tr bgcolor="#DDDDDD" height="23">
		<td class="gray" align="center" width="70">�ǿ�</td>
		<td class="gray" align="center" width="110">�ް���</td>
		<td class="gray" align="center" width="60">��&nbsp;</td>
		<td class="gray" align="center" width="60">����</td>
		<td class="gray" align="center" width="80">����</td>
		<td class="gray" align="center" width="60">��޺μ�</td>
		<td class="gray" align="center" width="60">�ܰ�</td>
		<td class="gray" align="center" width="60">�ݾ�</td>
		<td class="gray" width="90" align="center">������������</td>
		<td class="gray" align="center">�����Ⱓ</td>
	</tr>
<%-- ���ں��� ����Ʈ ���� ���� �κ�--%>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_VSCOST_COSTCURCOMMLISTRecord curcommlistRec = (SS_L_VSCOST_COSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<tr>
		<td class="gray" align="left" width="70">&nbsp;<%= curcommlistRec.vaca_arearegnnm%></td>
		<td class="gray" align="left" width="110">&nbsp;<%= curcommlistRec.vaca_areanm%></td>
		<td class="gray" align="left" width="60">&nbsp;<%= curcommlistRec.deptnm%></td>
		<td class="gray" align="left" width="60">&nbsp;<%= curcommlistRec.areanm%></td>
		<td class="gray" align="left" width="80">&nbsp;<%= curcommlistRec.bonm%></td>
		<td class="gray" align="right" width="60"><%= Util.comma(curcommlistRec.dlvqty)%>&nbsp;</td>
		<td class="gray" align="right" width="60"><%= Util.comma(curcommlistRec.costbasiamt)%>&nbsp;</td>
		<td class="gray" align="right" width="60"><%= Util.comma(curcommlistRec.amt)%>&nbsp;</td>
		<td class="gray" align="center" width="90"><%= Util.convertS(curcommlistRec.basidt)%>&nbsp;</td>
		<td class="gray" align="center"><%= Util.convertS(curcommlistRec.frdt)%> ~ <%= Util.convertS(curcommlistRec.todt)%>&nbsp;</td>
	</tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
<%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" align="center" width="70">&nbsp;</td>
		<td class="gray" align="center" width="110">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="right" width="60">&nbsp;</td>
		<td class="gray" align="right" width="60">&nbsp;</td>
		<td class="gray" align="center" width="90">&nbsp;</td>
		<td class="gray" align="center">&nbsp;</td>
	</tr>
<%}%>
<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr bgcolor="#DDDDDD" align="right">
		<td  height="23" class="gray" colspan="10">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b>�ѱݾ� <%= Util.comma(ds.getTotalcostamt())%> �� </b>&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b>�ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
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
                <jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<script>
    parent.document.all.vscost_list_id.outerHTML = vscost_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
