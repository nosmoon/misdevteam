<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1510_l.jsp
* ��� : ����Info-���������ڱ���Ȳ-���
* �ۼ����� : 2004-05-19
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_LEASAMT_LISTDataSet ds = (SS_L_LEASAMT_LISTDataSet)request.getAttribute("ds");
	int asetListCount = 10;	// �� ȭ��� ������ �׸� ��
%>

<table width="830" border="0" cellspacing="0" align="center" class="gray" bgcolor="#FFFFFF" cellpadding="1" id="leasamt_list">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray" width="60"> ������ </td>
		<td rowspan="2" class="gray" width="60">������ </td>
		<td rowspan="2" class="gray" width="70"> �����ݾ� </td>
		<td rowspan="2" class="gray" width="70"> ��ü������ </td>
		<td class="gray" colspan="2"> ä��Ȯ�� </td>
		<td rowspan="2" class="gray" width="60">�����</td>
		<td class="gray" width="80" > �����繫�� </td>
		<td class="gray" width="80" > ä��Ȯ������ </td>
		<td class="gray" colspan="2"> ���� �Ⱓ </td>
		<td rowspan="2" class="gray"> ���缭����ȣ </td>
	</tr>
	<tr align="center">
		<td bgcolor="#dddddd" class="gray" width="70"> �ݾ� </td>
		<td bgcolor="#dddddd" class="gray" width="50">���� </td>
		<td bgcolor="#dddddd" class="gray" width="80"> ������ </td>
		<td bgcolor="#dddddd" class="gray" width="80"> ������ </td>
		<td bgcolor="#dddddd" class="gray" width="70"> ����� </td>
		<td bgcolor="#dddddd" class="gray" width="70"> ������ </td>
	</tr>
	<!-- ���������ڱ���Ȳ ��� ���� -------------------------------------------------------------------------->
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_LEASAMT_LISTCURCOMMLISTRecord curcommlistRec = (SS_L_LEASAMT_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- �� ��ũ -->
	<tr onclick="detail_view('<%=curcommlistRec.getDeptcd() %>','<%=curcommlistRec.getAreacd() %>','<%=curcommlistRec.getBocd() %>','<%=curcommlistRec.getSeq() %>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" align="left"><%=curcommlistRec.getBonm() %>&nbsp;</td>
		<td class="gray" align="left"><%=curcommlistRec.getBo_presinm() %>&nbsp;</td>
		<td class="gray" align="right" width="70"><%=Util.formatNumber(curcommlistRec.getHdqtsplyamt()) %>&nbsp;</td>
		<td class="gray" align="right"><%=Util.formatNumber(curcommlistRec.getWholgurtamt()) %>&nbsp;</td>
		<td class="gray" align="right" width="70" ><%=Util.formatNumber(curcommlistRec.getBondprsvamt()) %>&nbsp;</td>
		<td class="gray" align="center" ><%=curcommlistRec.getBondprsvkind() %>&nbsp;</td>
		<td class="gray" align="left">&nbsp;<%=curcommlistRec.getNowchrg() %>&nbsp;</td>
		<td class="gray" align="left">&nbsp;<%=curcommlistRec.getBooffi_roomownr() %>&nbsp;</td>
		<td class="gray" align="left">&nbsp;<%=curcommlistRec.getBondprsvobjvolownr() %>&nbsp;</td>
		<td class="gray" align="center"><%=Util.convertS(curcommlistRec.getLeascntrdt()) %>&nbsp;</td>
		<td class="gray" align="center"><%=Util.convertS(curcommlistRec.getLeasexprdt()) %>&nbsp;</td>
		<td class="gray" align="center"><%=curcommlistRec.getDeciddocuno() %>&nbsp;</td>
	</tr>
    <%}%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(asetListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" align="right" width="70">&nbsp</td>
		<td class="gray" align="right">&nbsp</td>
		<td class="gray" align="right" width="70" >&nbsp</td>
		<td class="gray" align="right" >&nbsp</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" >&nbsp;</td>
		<td class="gray" >&nbsp;</td>
		<td class="gray" align="center">&nbsp</td>
		<td class="gray" align="center">&nbsp</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>

	<tr bgcolor="#dddddd" align="right">
		<td colspan="12" height="23" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �������ݾ� <%= Util.comma(ds.getTotalamt())%> ��</b>&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> ��</b>
		</td>
	</tr>
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
                <jsp:param name = "pagesize" 	value="<%= asetListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->
<!-- ���������ڱ���Ȳ ��� �� -------------------------------------------------------------------------->

<!-- �� �ʱ�ȭ�� ���� ���̺� ���� -->
<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="detail_list">
<form name="aset_detail_form" method="post" action="">
	<input name="deptcd" type="hidden" value ="" maxlength="5">		<!--�μ�(��)�ڵ�-->
	<input name="areacd" type="hidden" value ="" maxlength="5">     <!--�����ڵ�-->
	<input name="bocd" type="hidden" value ="" maxlength="5">       <!--���������ڵ�-->
	<input name="seq" type="hidden" value ="" maxlength="5">        <!--����-->

	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">��&nbsp;</td>
		<td class="gray" width="250" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >����</td>
		<td class="gray" width="100" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >������</td>
		<td class="gray" width="120" >&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">������</td>
		<td class="gray" width="250" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >�����</td>
		<td class="gray" colspan="3" >&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">ä��Ȯ������</td>
		<td class="gray" width="250">
			�������
			<input type="checkbox" name="bondregiconf" value="Y">
			���ε
			<input type="checkbox" name="bndregi" value="Y">
			������
			<input type="checkbox" name="bondwarrp" value="Y">
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">��������</td>
		<td class="gray" colspan="3">
			��༭
			<input type="checkbox" name="leascntrp" value="Y">
			���ε
			<input type="checkbox" name="leasregi" value="Y">
			����
			<input type="checkbox" name="leasexch_note" value="Y">
			��������
			<input type="checkbox" name="leasloandeed" value="Y">
		</td>
	</tr>
	<tr>
	<td bgcolor="#dddddd" width="153" class="gray">�����缭��</td>
		<td class="gray" width="250">
			����
			<input type="checkbox" name="prvoffideciddocuyn" value="Y">
			����
			<input type="checkbox" name="curroffideciddocuyn" value="Y">
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">�����缭��</td>
		<td class="gray" colspan="3">
			����
			<input type="checkbox" name="prvhdqtdeciddocuyn" value="Y">
			����
			<input type="checkbox" name="currhdqtdeciddocuyn" value="Y">
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">�����繫�� �ε���ǥ��</td>
		<td class="gray" colspan="5">&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">ä��Ȯ������ �ε���ǥ�� </td>
		<td class="gray" colspan="5">&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">���</td>
		<td class="gray" colspan="5">
			<textarea name="remk" rows="3" cols="90" >&nbsp;</textarea>
		</td>
	</tr>
</form>
</table>
<!-- �� �ʱ�ȭ�� ���� ���̺� �� -->

<!--IFRAME ID=leasamt_list END--------------------------------------------------------------------------->
<script>
    parent.document.all.leasamt_list.outerHTML = leasamt_list.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    parent.document.all.detail_list.outerHTML = detail_list.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
