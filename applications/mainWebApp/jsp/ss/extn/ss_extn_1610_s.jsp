<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : sss_extn_1610_s.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-�������-��
* �ۼ����� : 2004-04-10
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_PROMSTAF_CYEXTNDataSet ds = (SS_S_PROMSTAF_CYEXTNDataSet)request.getAttribute("ds");
%>
	<table width="830" border="0"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="promstaf_detail_id">
		<tr>
			<td width="80" rowspan="4" bgcolor="#EBE9DC" class="gray">�������</td>
			<td width="100" bgcolor="#dddddd" class="gray">����</td>
			<td width="120" class="gray"><%= ds.getStafnm()%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">�������</td>
			<td width="120" class="gray"><%= Util.convertS(ds.getIn_cmpydt())%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">�ֹε�Ϲ�ȣ</td>
			<td class="gray"><%= Util.FormatJumin(ds.getPrn())%>&nbsp;</td>			
		</tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">��ȭ��ȣ</td>
			<td width="120" class="gray"><%=Util.getChainStr( ds.getTel_no1(), ds.getTel_no2(), ds.getTel_no3(), "-")%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">�޴�����ȣ</td>
			<td width="120" class="gray"><%=Util.getChainStr( ds.getPtph_no1(), ds.getPtph_no2(), ds.getPtph_no3(), "-")%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">�̸���<font color="red">&nbsp;</font></td>
			<td class="gray"><%= ds.getEmail()%>&nbsp;</td>
        </tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">�ּ�</td>
			<td colspan="5" class="gray">[<%= Util.FormatZip(ds.getZip())%>]&nbsp;<%= ds.getAddr()%>&nbsp;<%= ds.getDtlsaddr()%></td>
        </tr>
        <tr >
			<td width="100" bgcolor="#dddddd"  class="gray">�����</td>
			<td width="120" class="gray"><%= ds.getAcctbank()%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">������</td>
			<td width="120" class="gray"><%= ds.getAcctdeps_pers()%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd"  class="gray">���¹�ȣ</td>
			<td class="gray"><%= ds.getAcctno()%>&nbsp;</td>
        </tr>
		<tr>
			<td width="80" rowspan="2" bgcolor="#EBE9DC" class="gray">����������</td>
			<td width="100" bgcolor="#dddddd" class="gray">����</td>
			<td width="120" class="gray"><%= ds.getCnvsstafnm()%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">�������</td>
			<td width="120" class="gray"><%= Util.convertS(ds.getCnvsin_cmpydt())%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">�ֹε�Ϲ�ȣ</td>
			<td class="gray"><%= Util.FormatJumin(ds.getCnvsprn())%>&nbsp;</td>			
		</tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">��ȭ��ȣ</td>
			<td width="120" class="gray"><%=Util.getChainStr( ds.getCnvstelno1(), ds.getCnvstelno2(), ds.getCnvstelno3(), "-")%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">�޴�����ȣ</td>
			<td width="120" class="gray"><%=Util.getChainStr( ds.getCnvsptph_no1(), ds.getCnvsptph_no2(), ds.getCnvsptph_no3(), "-")%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">�̸���<font color="red">&nbsp;</font></td>
			<td class="gray"><%= ds.getCnvsemail()%>&nbsp;</td>
        </tr>
	</table>


<script language="javascript">
    parent.document.all.promstaf_detail_id.outerHTML = promstaf_detail_id.outerHTML;

	// �Է��׸� ó��
	parent.jsInit();
</script>