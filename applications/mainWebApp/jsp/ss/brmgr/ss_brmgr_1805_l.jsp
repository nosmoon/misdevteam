<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1805_l.jsp
* ��� : ��������-����Ʈ���Է�-���(����Ʈ)
* �ۼ����� : 2004-11-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_APTDataSet ds = (SS_L_APTDataSet)request.getAttribute("ds");
    int listCount = 20;		// �� ȭ��� ����Ʈ �׸� ��
    BigDecimal d1 = null;
    BigDecimal d2 = null;
%>
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="apt_list_id">
<form name="cdv_list_form" method="post" action="" >
    <input name="bocd" type="hidden" value ="">		<!--���������ڵ�-->
    <input name="addrcd" type="hidden" value ="">	<!--�ּ��ڵ�-->
    <input name="dongno" type="hidden" value ="">	<!--��ȣ��-->

	<tr bgcolor="#dddddd" align="center" height="23"> 
		<td class="gray">����Ʈ��</td>
		<td width="100" class="gray">��ȣ��</td>
		<td width="100" class="gray">�����</td>
		<td width="100" class="gray">���ڼ�</td>
		<td width="100" class="gray">���Է�</td>
	</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_APTCURCOMMLISTRecord curcommlistRec = (SS_L_APTCURCOMMLISTRecord)ds.curcommlist.get(i);
	d1 = new BigDecimal(curcommlistRec.rdrcnt);
	d2 = new BigDecimal(curcommlistRec.hoscnt);
	%>
    <!-- �� ��ũ -->
    <tr height="23" bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>', '<%= curcommlistRec.addrcd%>','<%= curcommlistRec.dongno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" align="left">&nbsp;<%= curcommlistRec.addrnm%></td>
		<td width="100" class="gray" align="right"><%= curcommlistRec.dongno%>&nbsp;</td>
		<td width="100" class="gray" align="right"><%= curcommlistRec.hoscnt%>&nbsp;</td>
		<td width="100" class="gray" align="right"><%= curcommlistRec.rdrcnt%>&nbsp;</td>
		<td width="100" class="gray" align="right"><%= ( (curcommlistRec.hoscnt == 0) ? 0 : d1.divide(d2, BigDecimal.ROUND_HALF_UP, 1).doubleValue() * 100 ) %>&nbsp;</td>
	</tr> 
<%}%>	

<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
<%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
	<tr align="center""> 
		<td class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
	</tr>
<%}%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="5" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �� �Ǽ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
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
                <jsp:param name = "pagesize" 	value="<%= listCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->
<script>
    parent.document.all.apt_list_id.outerHTML = apt_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    	
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>