<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1110_l.jsp
* ��� : �����濵-���ϸ�����Ȳ-��ȸ
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
	SS_L_MIGLLMMTCLOSDataSet ds = (SS_L_MIGLLMMTCLOSDataSet)request.getAttribute("ds");
    int listCount = 10;			// �� ȭ��� ����Ʈ �׸� ��
    int noit_tot = 0; 			//���ްǼ��հ�
    int paypont_tot = 0; 		//��������Ʈ�հ�
    int hdqtallmamt_tot = 0; 	//����д���հ�
    int boallmamt_tot = 0; 		//�����д���հ�
%>

<table width="830" border="0" cellspacing="0"  cellpadding="1" class="gray" bgcolor="#FFFFFF" id="migllmmtclos_list_id">
<form name="milgpay_list_form" method="post" action="">
	<input type="hidden" name="bocd" value="">
	<input type="hidden" name="frdt" value="">
	<input type="hidden" name="todt" value="">
	<input type="hidden" name="pageno" value ="1">					<!-- ���� ������ ��ȣ -->
	<input type="hidden" name="pagesize" value ="<%= listCount%>">	<!-- �� ȭ��� ����Ʈ �׸� �� -->
	<input type="hidden" name="js_fn_nm" value ="page_move2">

	<tr align="center" bgcolor="#dddddd" height="23">
		<td width="120" class="gray"> ��&nbsp; </td>
		<td width="120" class="gray"> ���� </td>
		<td width="120" class="gray"> ���� </td>
		<td class="gray"> ���ްǼ� </td>
		<td width="120" class="gray"> ��������Ʈ </td>
		<td width="120" class="gray"> ����д�� </td>
		<td width="120" class="gray"> �����д�� </td>
	</tr>
	<%-- ����Ʈ ���� ���� �κ�--%>
	<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGLLMMTCLOSCURCOMMLISTRecord curcommlistRec = (SS_L_MIGLLMMTCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);

		noit_tot 			= noit_tot + curcommlistRec.noit;
		paypont_tot 		= paypont_tot + curcommlistRec.paypont;
		hdqtallmamt_tot 	= hdqtallmamt_tot + curcommlistRec.hdqtallmamt;
		boallmamt_tot 		= boallmamt_tot + curcommlistRec.boallmamt;
	%>
	<tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>','<%= curcommlistRec.frdt%>','<%= curcommlistRec.todt%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" width="120">&nbsp;<%= curcommlistRec.boksnm%></td>
		<td class="gray" width="120">&nbsp;<%= curcommlistRec.areanm%></td>
		<td class="gray" width="120">&nbsp;<%= curcommlistRec.bonm%></td>
		<td class="gray" align="right"><%= Util.comma(curcommlistRec.noit)%>&nbsp;</td>
		<td class="gray" width="120" align="right"><%= Util.comma(curcommlistRec.paypont)%>&nbsp;</td>
		<td class="gray" width="120" align="right"><%= Util.comma(curcommlistRec.hdqtallmamt)%>&nbsp;</td>
		<td class="gray" width="120" align="right"><%= Util.comma(curcommlistRec.boallmamt)%>&nbsp;</td>
	</tr>
	<%}%>
	<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
	<%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" width="120">&nbsp;</td>
		<td class="gray" width="120">&nbsp;</td>
		<td class="gray" width="120">&nbsp;</td>
		<td class="gray" align="right">&nbsp;</td>
		<td class="gray" width="120" align="right">&nbsp;</td>
		<td class="gray" width="120" align="right">&nbsp;</td>
		<td class="gray" width="120" align="right">&nbsp;</td>
	</tr>
	<%}%>
	<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	<tr bgcolor="#dddddd">
		<td colspan="3" class="gray" align="center" height="23"> �� </td>
		<td class="gray" align="right"><%=Util.comma(noit_tot)%>&nbsp;</td>
		<td class="gray" align="right"><%=Util.comma(paypont_tot)%>&nbsp;</td>
		<td class="gray" align="right"><%=Util.comma(hdqtallmamt_tot)%>&nbsp;</td>
		<td class="gray" align="right"><%=Util.comma(boallmamt_tot)%>&nbsp;</td>
	</tr>
	<tr align="right" height="23">
		<td colspan="7" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� <%= Util.comma(ds.getTotalcnt())%> ��</b>
		</td>
	</tr>
</form>
</table>

<!-- ������ �̵� -->
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

<!-- �� �ʱ�ȭ�� ���� ���̺�-->
<!-- ���ϸ�����Ȳ �� ���� -->
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
	<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
	<%for(int j=0; j<listCount; j++){%>
	<tr>
		<td class="gray" width="70" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" width="70">&nbsp;</td>
		<td class="gray" width="50" align="right">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="100" align="center">&nbsp;</td>
		<td class="gray" width="50" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
	</tr>
	<%}%>
	<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="10" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �ѰǼ� �� </b>
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
		<jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
		<jsp:param name = "pageno" 			value="0"/>
		<jsp:param name = "totalcnt" 		value="0"/>
		<jsp:param name = "js_fn_nm" 		value="page_move2"/>
		<jsp:param name = "pagesize" 		value="<%= listCount%>"/>
		<jsp:param name = "page_set_gubun" 	value="0"/>
		</jsp:include>
		<!--JSP PAGE END------------------------------------------------------------------------------------>
		</td>
	</tr>
</table>
<!-- ������ �̵� -->

<script>
    parent.document.all.migllmmtclos_list_id.outerHTML = migllmmtclos_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;

	// �� �ʱ�ȭ
    parent.document.all.milgpay_detail_id.outerHTML = milgpay_detail_id.outerHTML;
    parent.document.all.page_move2.outerHTML = page_move2.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
