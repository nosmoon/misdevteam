<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1425_l.jsp
* ��� : ����Info-������ǰ��Ȳ-��-��ȸ
* �ۼ����� : 2004-02-01
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
	SS_L_ASET_DTLDataSet ds = (SS_L_ASET_DTLDataSet)request.getAttribute("ds");
    int moveListCount = 15;	// �� ȭ��� ����Ʈ �׸� ��
%>

	<%-- ������ǰ�� ��� ����--%>
	<table width="500" border="0" cellspacing="0"  cellpadding="1" bgcolor="#FFFFFF" class="gray" id="aset_list_id">
	<form name="aset_list_form" method="post" action="">
		<input type="hidden" name="bocd" value="">   	<!--���������ڵ�-->
		<input type="hidden" name="asetseq" value="">   <!--��ǰ�Ϸù�ȣ-->    

		<tr bgcolor="#dddddd" height="23">
			<td width="60" class="gray" align="center" > ��ȣ </td>
			<td width="150" class="gray" align="center"> �з� </td>
			<td width="180" class="gray" align="center"> ��ǰ�� </td>
			<td class="gray" align="center"> �������� </td>
		</tr>
	<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_ASET_DTLCURCOMMLISTRecord curcommlistRec = (SS_L_ASET_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    	<!-- ������ǰ��Ȳ �� ��ũ -->   
		<tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>','<%= curcommlistRec.asetseq%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
			<td class="gray" align="center" width="60" > &nbsp;<%= curcommlistRec.asetseq%> </td>
			<td class="gray" width="150"> &nbsp;<%= curcommlistRec.asetclascdnm%> </td>
			<td class="gray" width="180"> &nbsp;<%= curcommlistRec.asetnm%> </td>
			<td class="gray" align="center"> &nbsp;<%= Util.convertS(curcommlistRec.buydt)%> </td>
		</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
        <tr>
			<td class="gray" align="center" width="60" > &nbsp; </td>
			<td class="gray" width="150"> &nbsp; </td>
			<td class="gray" width="180"> &nbsp; </td>
			<td class="gray" align="center"> &nbsp; </td>
		</tr>          
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
		<tr bgcolor="#dddddd" >
			<td  colspan="4" class="gray" height="23" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �ѰǼ� <%= Util.comma(ds.getTotalcnt()) %> ��</b>
			</td>
		</tr>
	</form>		
	</table>
	<%-- ������ǰ�� ��� ��--%>
	
	<!-- ������ �̵�-->
	<table width="500" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
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
	<!-- ������ �̵�-->

	<!--������ǰ�� �� ���� -->
	<table width="100%" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="aset_detail_id">		
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��ȣ </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��ǰ�з� </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��ǰ�� </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��� </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;������ </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;����ó </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;�������� </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;���Աݾ� </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;���������� </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" width="100" class="gray" he> &nbsp;������������ </td>
			<td class="gray"> 
				<textarea cols="27" rows="6" class="scroll1" readOnly>&nbsp;</textarea>
			</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;������� </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��� </td>
			<td class="gray">
				<textarea cols="27" rows="5" class="scroll1" readOnly>&nbsp;</textarea>
			</td>
		</tr>
	</table>        
	<!--������ǰ�� �� �� -->


<script>
    parent.document.all.aset_list_id.outerHTML = aset_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

    // ȭ�� �ʱ�ȭ
    parent.document.all.aset_detail_id.outerHTML = aset_detail_id.outerHTML;

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}else if(ds.curcommlist.size() == 1){			// ��Ȳ-��Ͽ��� �󼼷� �б�� ����� ������ 1���� ���� �ڵ����� �󼼸� �����ֱ� ���� ����
	SS_L_ASET_DTLCURCOMMLISTRecord curcommlistRec1 = (SS_L_ASET_DTLCURCOMMLISTRecord)ds.curcommlist.get(0); %>
	
	// �� ��ȸ
	if(parent.gs_bocd != ''){
		parent.detail_view(parent.gs_bocd, '<%= curcommlistRec1.asetseq%>');
	}
		
<%}%>
</script>
