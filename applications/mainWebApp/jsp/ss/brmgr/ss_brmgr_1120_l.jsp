<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1120_l.jsp
* ��� : �����濵-���ϸ�����Ȳ-��
* �ۼ����� : 2004-03-17
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
	SS_L_MILGPAYDataSet ds = (SS_L_MILGPAYDataSet)request.getAttribute("ds");
    int listCount = 10;			// �� ȭ��� ����Ʈ �׸� ��
%>

<table width="830" border="0" cellspacing="0"  cellpadding="1" class="gray" bgcolor="#FFFFFF" id="milgpay_detail_id">
	<tr align="center" bgcolor="#dddddd" height="23"> 
		<td width="70" class="gray"> �������� </td>
		<td class="gray"> ���ڸ� </td>
		<td width="70" class="gray">��ü</td>
		<td width="50" class="gray">����Ʈ</td>
		<td width="100" class="gray">���ޱ���</td>
		<td width="100" class="gray">���ޱ���</td>
		<td width="50" class="gray">ȯ��</td>
		<td width="65" class="gray">�����</td>
		<td width="65" class="gray">����д�</td>
		<td width="65" class="gray">�����д�</td>
	</tr>
	<%-- ����Ʈ ���� ���� �κ�--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_MILGPAYCURCOMMLISTRecord curcommlistRec = (SS_L_MILGPAYCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>       
	<tr> 
		<td class="gray" width="70" align="center"><%= Util.convertS(curcommlistRec.milgpaydt)%>&nbsp;</td>
		<td class="gray" ><%= curcommlistRec.rdrnm%>&nbsp;</td>
		<td class="gray" width="70"><%= curcommlistRec.medicdnm%>&nbsp;</td>
		<td class="gray" width="50" align="right"><%= Util.comma(curcommlistRec.pont)%>&nbsp;</td>
		<td class="gray" width="100"><%= curcommlistRec.payclsfcdnm%>&nbsp;</td>
		<td class="gray" width="100"><%= curcommlistRec.paybasinm%>&nbsp;</td>
		<td class="gray" width="50" align="right"><%= curcommlistRec.adjmexchrate%>&nbsp;</td>
		<td class="gray" width="65" align="right"><%= Util.comma(curcommlistRec.adjmamt)%>&nbsp;</td>
		<td class="gray" width="65" align="right"><%= Util.comma(curcommlistRec.hdqtallmamt)%>&nbsp;</td>
		<td class="gray" width="65" align="right"><%= Util.comma(curcommlistRec.boallmamt)%>&nbsp;</td>
	</tr>
	<%}%>  
	<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
	<%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
	<tr> 
		<td class="gray" width="70" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" width="70">&nbsp;</td>
		<td class="gray" width="50" align="right">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="50" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
	</tr>	    
	<%}%> 
	<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>		           
	<tr bgcolor="#dddddd" align="right"> 
		<td colspan="10" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
		</td>
	</tr>
</table>

<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move2">
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
	        <jsp:param name = "pagesize" 	value="<%=listCount%>"/>
	        <jsp:param name = "page_set_gubun" 	value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>
<!-- ������ �̵� -->


<script>

    parent.document.all.milgpay_detail_id.outerHTML = milgpay_detail_id.outerHTML;
    parent.document.all.page_move2.outerHTML = page_move2.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>
