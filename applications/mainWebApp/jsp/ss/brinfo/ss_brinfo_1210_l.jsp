<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1210_l.jsp
* ��� : ����Info-����������-��ȸ
* �ۼ����� : 2004-02-10
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
	SS_L_BO_HEADDataSet ds = (SS_L_BO_HEADDataSet)request.getAttribute("ds");
    int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
%>

<!--���������� ��� list iframe-->
<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="bo_head_list_id">
	<tr align="center"  bgcolor="#dddddd" height\"23">
		<td class="gray" width="60" bgcolor="#dddddd" height="23"> ��&nbsp; </td>
		<td class="gray" width="60" bgcolor="#dddddd"> ���� </td>
		<td class="gray" width="60" bgcolor="#dddddd"> ���� </td>
		<td class="gray" width="65" bgcolor="#dddddd"> ������ </td>
		<td class="gray" width="55" bgcolor="#dddddd"> ���� </td>
		<td class="gray" width="305"> �ּ� </td>
		<td class="gray" width="80" bgcolor="#dddddd"> ���� ��ȭ��ȣ </td>
		<td class="gray" width="80" bgcolor="#dddddd"> ������ �޴��� </td>
		<td class="gray" width="65" bgcolor="#dddddd"> ������ </td>
	</tr>
	<%-- ���������� ����Ʈ ���� ���� �κ�--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BO_HEADCURCOMMLISTRecord curcommlistRec = (SS_L_BO_HEADCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
	<tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>','<%= curcommlistRec.prn%>','<%= curcommlistRec.bjjgseq%>','<%= curcommlistRec.bjjuminno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" width="60"> &nbsp;<%= curcommlistRec.boksnm%> </td>
		<td class="gray" width="60"> &nbsp;<%= curcommlistRec.areanm%> </td>
		<td class="gray" width="60"> &nbsp;<%= curcommlistRec.bonm%> </td>
		<td class="gray" width="65"> &nbsp;<%= curcommlistRec.bo_headnm%> </td>
		<td class="gray" width="55" align="center"> &nbsp;<%= curcommlistRec.jmgystgb%> </td>
		<td class="gray" width="305"> &nbsp;<%= curcommlistRec.boaddr%> <%= curcommlistRec.bodtlsaddr%> </td>
		<td class="gray" width="80" align="left"> &nbsp;<%= Util.getChainStr(curcommlistRec.tel_no11,curcommlistRec.tel_no12,curcommlistRec.tel_no13,"-")%> </td>
		<td class="gray" width="80" align="left"> &nbsp;<%= Util.getChainStr(curcommlistRec.bo_head_ptph_no1,curcommlistRec.bo_head_ptph_no2,curcommlistRec.bo_head_ptph_no3,"-")%></td> </td>
		<td class="gray" width="65"> &nbsp;<%= curcommlistRec.bjnm%> </td>
	</tr>
	<%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="65"> &nbsp; </td>
		<td class="gray" width="55" align="center" > &nbsp; </td>
		<td class="gray" width="305"> &nbsp; </td>
		<td class="gray" width="80" align="center" > &nbsp; </td>
		<td class="gray" width="80" align="center" > &nbsp; </td>
		<td class="gray" width="65"> &nbsp; </td>
	</tr>
	<%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	<tr align="right">
		<td colspan="10" bgcolor="#dddddd" class="gray" height="23">
		<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� <%= Util.comma(ds.getTotalcnt())%> ��</b>
		</td>
	</tr>
</table>
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
		<!--���������� ��� list iframe end -->

<script>
    parent.document.all.bo_head_list_id.outerHTML = bo_head_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
