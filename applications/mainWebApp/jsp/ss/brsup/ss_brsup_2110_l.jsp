<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brsup_2110_l.jsp
* ��� 	 	 : ��������-��ǻ��AS(AS����Ʈ)
* �ۼ����� 	 : 2004-03-15
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<% 
	SS_L_ASREQDataSet ds = (SS_L_ASREQDataSet)request.getAttribute("ds");
    int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table id="as_list_id" width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" >
	<tr bgcolor="#DDDDDD" height="23"> 
		<td width="50" class="gray"align="center">����</td>
		<td class="gray" align="center"> A/S ��û����</td>
		<td width="70" class="gray" align="center">����</td>
		<td width="70" class="gray" align="center">��û����</td>
		<td width="70" class="gray" align="center">��������</td>
		<td width="70" class="gray" align="center">�Ϸ�����</td>
	</tr>
   <%-- ��Ȳ���� ����Ʈ�� ��� --%>
    <%
    	int TotalSize = Integer.parseInt(ds.getTotalcnt()+"");
    	int curr_page_int = Integer.parseInt(request.getParameter("pageno"));
        for(int i=0; i<ds.curasreqlist.size(); i++){
            SS_L_ASREQCURASREQLISTRecord rsltcurRec = (SS_L_ASREQCURASREQLISTRecord)ds.curasreqlist.get(i);
	%>
    <tr align="left" onClick="bocomp_view('<%=rsltcurRec.bocd%>','<%=rsltcurRec.regdt%>','<%=rsltcurRec.regno%>','<%=rsltcurRec.eqpno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
	    <td width="50" align="center" class="gray">&nbsp;<%=(curr_page_int-1)*moveListCount+i+1%></td>
	    <td class="gray">&nbsp;<%=rsltcurRec.req_rmk%></td>
	    <td width="70" align="center" class="gray">&nbsp;<%=rsltcurRec.as_stat%></td>
	    <td width="70" align="center" class="gray">&nbsp;<%=Util.convertS(rsltcurRec.regdt)%></td>
	    <td width="70" align="center" class="gray">&nbsp;<%=Util.convertS(rsltcurRec.acpndt)%></td>
	    <td width="70" align="center" class="gray">&nbsp;<%=Util.convertS(rsltcurRec.nddt)%></td>
  	</tr>
    <%}%>

	<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <% for (int i = 0 ; i < (moveListCount - ds.curasreqlist.size()) ; i++) {%>		
	<tr> 
		<td width="50"  align="center" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td width="70" align="center" class="gray">&nbsp;</td>
		<td width="70" align="center" class="gray">&nbsp;</td>
		<td width="70" align="center" class="gray">&nbsp;</td>
		<td width="70" align="center" class="gray">&nbsp;</td>
	</tr>
    <%}%>
	<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	
	<tr  bgcolor="#dddddd" align="right" > 
		<td  colspan="6" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%=Util.comma(ds.getTotalcnt())%> �� </b>
		</td>
	</tr>
</table>

<!-- ������ �̵� -->
<table id="as_list_nav_id" width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
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
    parent.document.all.as_list_nav_id.outerHTML = as_list_nav_id.outerHTML;
    parent.document.all.as_list_id.outerHTML = as_list_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
    // ȭ�� �ʱ�ȭ
    parent.bocomp_append();
    
<%if(ds.curasreqlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%> 
</script>
