<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1310_l.jsp
* ��� : ����Info-����������Ȳ-���
* �ۼ����� : 2004-02-06
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOEMPDataSet ds = (SS_L_BOEMPDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��

	// ��ȸ���ǿ� ����, �μ�(��)�� ������,������ ����� �����Ѵ�.
	String viewflag = request.getParameter("viewflag");

%>

<%--�μ�(��)��--%>
<%if("1".equals(viewflag)){%>
<table width="830" border="0" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" id="boemp_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">��&nbsp;</td>
		<td rowspan="2" class="gray" width="80">�߼ۺμ�</td>
		<td rowspan="2" class="gray" width="50">�ѹ�</td>
		<td colspan="5" class="gray">��޿�</td>
		<td rowspan="2" class="gray" width="50">����</td>
		<td rowspan="2" class="gray" width="50">�渮</td>
		<td rowspan="2" class="gray" width="50">�ֹ�</td>
		<td rowspan="2" class="gray" width="50">��Ÿ</td>
		<td rowspan="2" class="gray" width="50">��</td>
		<td rowspan="2" class="gray" width="55">���̹�</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="50">����</td>
		<td class="gray" width="50">�ֺ�</td>
		<td class="gray" width="50">�˹�</td>
		<td class="gray" width="50">��Ÿ</td>
		<td class="gray" width="50">��</td>
	</tr>
	<%-- ������ǰ��Ȳ ��Ȳ ����Ʈ ���� ���� �κ�--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMPCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMPCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
	<tr>
		<td class="gray">&nbsp;<%= curcommlistRec.boknm%></td>
		<td class="gray" align="right" width="80"><%= Util.comma(curcommlistRec.bsbusu)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd20)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd50)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd60)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd70)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd80)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.total1)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd100)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd40)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd110)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd120)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.total2)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(curcommlistRec.cybcnt)%>&nbsp;</td>
	</tr>
	<%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" > &nbsp; </td>
		<td class="gray" align="right" width="80" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="55" > &nbsp; </td>
	</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	<tr bgcolor="#dddddd" height="23">
		<td class="gray" align="right">�Ұ�&nbsp; </td>
		<td class="gray" align="right" width="80"><%= Util.comma(ds.bsbusucnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd20cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd50cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd60cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd70cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd80cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.total1cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd100cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd40cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd110cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd120cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.total2cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(ds.cybcntcnt)%>&nbsp;</td>
	</tr>
	<tr align="right" height="23">
		<td colspan="14" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� <%= Util.comma(ds.getTotalcnt())%> ��</b>
		</td>
	</tr>
</table>

<%--������--%>
<%}else if("2".equals(viewflag)){%>
<table width="830" border="0" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" id="boemp_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">��&nbsp;</td>
		<td rowspan="2" class="gray" width="70">����</td>
		<td rowspan="2" class="gray" width="80">�߼ۺμ�</td>
		<td rowspan="2" class="gray" width="50">�ѹ�</td>
		<td colspan="5" class="gray">��޿�</td>
		<td rowspan="2" class="gray" width="45">����</td>
		<td rowspan="2" class="gray" width="45">�渮</td>
		<td rowspan="2" class="gray" width="45">�ֹ�</td>
		<td rowspan="2" class="gray" width="45">��Ÿ</td>
		<td rowspan="2" class="gray" width="50">��</td>
		<td rowspan="2" class="gray" width="55">���̹�</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="45">����</td>
		<td class="gray" width="45">�ֺ�</td>
		<td class="gray" width="45">�˹�</td>
		<td class="gray" width="45">��Ÿ</td>
		<td class="gray" width="45">��</td>
	</tr>
	<%-- ������ǰ��Ȳ ��Ȳ ����Ʈ ���� ���� �κ�--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMPCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMPCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
	<tr>
		<td class="gray">&nbsp;<%= curcommlistRec.boknm%></td>
		<td class="gray" width="70">&nbsp;<%= curcommlistRec.areanm%></td>
		<td class="gray" align="right" width="80"><%= Util.comma(curcommlistRec.bsbusu)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.dutycd20)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd50)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd60)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd70)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd80)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.total1)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd100)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd40)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd110)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd120)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(curcommlistRec.total2)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(curcommlistRec.cybcnt)%>&nbsp;</td>
	</tr>
	<%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" > &nbsp; </td>
		<td class="gray" width="70" > &nbsp; </td>
		<td class="gray" align="right" width="80" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="50" > &nbsp; </td>
		<td class="gray" align="right" width="55" > &nbsp; </td>
	</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="2" class="gray" align="right">�Ұ�&nbsp; </td>
		<td class="gray" align="right" width="80"><%= Util.comma(ds.bsbusucnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.dutycd20cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd50cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd60cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd70cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd80cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.total1cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd100cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd40cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd110cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd120cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="50"><%= Util.comma(ds.total2cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(ds.cybcntcnt)%>&nbsp;</td>
	</tr>
	<tr align="right" height="23">
		<td colspan="15" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� <%= Util.comma(ds.getTotalcnt())%> ��</b>
		</td>
	</tr>
</table>

<%--������--%>
<%}else{%>
<table width="830" border="0" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" id="boemp_list_id">
<form name="boemp_list_form" method="post" action="" >
    <input name="bocd" type="hidden" value ="">

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">��&nbsp;</td>
		<td rowspan="2" class="gray" width="60">����</td>
		<td rowspan="2" class="gray" width="60">����</td>
		<td rowspan="2" class="gray" width="60">�߼ۺμ�</td>
		<td rowspan="2" class="gray" width="45">�ѹ�</td>
		<td colspan="5" class="gray">��޿�</td>
		<td rowspan="2" class="gray" width="45">����</td>
		<td rowspan="2" class="gray" width="45">�渮</td>
		<td rowspan="2" class="gray" width="45">�ֹ�</td>
		<td rowspan="2" class="gray" width="45">��Ÿ</td>
		<td rowspan="2" class="gray" width="40">��</td>
		<td rowspan="2" class="gray" width="55">���̹�</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="45">����</td>
		<td class="gray" width="45">�ֺ�</td>
		<td class="gray" width="45">�˹�</td>
		<td class="gray" width="45">��Ÿ</td>
		<td class="gray" width="40">��</td>
	</tr>
	<%-- ������ǰ��Ȳ ��Ȳ ����Ʈ ���� ���� �κ�--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMPCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMPCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
	<tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand"  onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray">&nbsp;<%= curcommlistRec.boknm%></td>
		<td class="gray" width="60">&nbsp;<%= curcommlistRec.areanm%></td>
		<td class="gray" width="60">&nbsp;<%= curcommlistRec.bonm%></td>
		<td class="gray" align="right" width="60"><%= Util.comma(curcommlistRec.bsbusu)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd20)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd50)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd60)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd70)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd80)%>&nbsp;</td>
		<td class="gray" align="right" width="40"><%= Util.comma(curcommlistRec.total1)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd100)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd40)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd110)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(curcommlistRec.dutycd120)%>&nbsp;</td>
		<td class="gray" align="right" width="40"><%= Util.comma(curcommlistRec.total2)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(curcommlistRec.cybcnt)%>&nbsp;</td>
	</tr>
	<%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" > &nbsp; </td>
		<td class="gray" width="60" > &nbsp; </td>
		<td class="gray" width="60" > &nbsp; </td>
		<td class="gray" align="right" width="60" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="40" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="40" > &nbsp; </td>
		<td class="gray" align="right" width="55" > &nbsp; </td>
	</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="3" class="gray" align="right">�Ұ�&nbsp; </td>
		<td class="gray" align="right" width="60"><%= Util.comma(ds.bsbusucnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd20cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd50cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd60cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd70cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd80cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="40"><%= Util.comma(ds.total1cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd100cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd40cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd110cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="45"><%= Util.comma(ds.dutycd120cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="40"><%= Util.comma(ds.total2cnt)%>&nbsp;</td>
		<td class="gray" align="right" width="55"><%= Util.comma(ds.cybcntcnt)%>&nbsp;</td>
	</tr>
	<tr align="right" height="23">
		<td colspan="16" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� <%= Util.comma(ds.getTotalcnt())%> ��</b>
		</td>
	</tr>
</form>
</table>
<%}%>

<!---button-->
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
		    <jsp:param name = "pageno" 			value="<%=pageno%>"/>
		    <jsp:param name = "totalcnt" 		value="<%=totalcnt%>"/>
		    <jsp:param name = "js_fn_nm" 		value="<%=js_fn_nm%>"/>
		    <jsp:param name = "pagesize" 		value="<%=moveListCount%>"/>
		    <jsp:param name = "page_set_gubun" 	value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>

<script>
    parent.document.all.boemp_list_id.outerHTML = boemp_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
