<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1430_s.jsp
* ��� : ����Info-������ǰ��Ȳ-�� ��ȭ��
* �ۼ����� : 2004-02-01
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_ASET_DTLDataSet ds = (SS_S_ASET_DTLDataSet)request.getAttribute("ds");
	//���Աݾ�, ���������ݾ��� integer�� �����Ѵ�.
	
	int buyamt = 0;
	int hdqtsplyamt = 0;
	
	if( ds.getBuyamt() != null){
		buyamt = Integer.parseInt(ds.getBuyamt());
	}
	
	if( ds.getHdqtsplyamt() != null){
		hdqtsplyamt = Integer.parseInt(ds.getHdqtsplyamt());
	}
%>
	<table width="100%" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="aset_detail_id">
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��ȣ </td>
			<td class="gray"> &nbsp;<%= ds.getAsetseq()%> </td>
		</tr>
		<tr height="23"> 
			<td  bgcolor="#dddddd" width="100" class="gray"> &nbsp;��ǰ�з� </td>
			<td class="gray"> &nbsp;<%= ds.getAsetclascdnm()%></td>
		</tr>
		<tr height="23"> 
			<td  bgcolor="#dddddd" width="100" class="gray"> &nbsp;��ǰ�� </td>
			<td class="gray"> &nbsp;<%= ds.getAsetnm()%> </td>
		</tr>
		<tr height="23"> 
			<td  bgcolor="#dddddd" width="100" class="gray"> &nbsp;��� </td>
			<td class="gray"> &nbsp;<%= ds.getSpec()%></td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;������ </td>
			<td class="gray"> &nbsp;<%= ds.getMnftcmpy()%> </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;����ó </td>
			<td class="gray"> &nbsp;<%= ds.getBuyplac()%> </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;�������� </td>
			<td class="gray"> &nbsp;<%= Util.convertS(ds.getBuydt())%></td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;���Աݾ� </td>
			<td class="gray"> &nbsp;<%= Util.comma(buyamt)%></td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;���������� </td>
			<td class="gray"> &nbsp;<%= Util.comma(hdqtsplyamt)%> </td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" width="100" class="gray" he> &nbsp;������������ </td>
			<td class="gray"> 
				<textarea cols="27" rows="6" class="scroll1" readOnly><%= ds.getMantcont()%> &nbsp;</textarea>
			</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;������� </td>
			<td class="gray"> &nbsp;<%= Util.convertS(ds.getWstedt())%> </td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��� </td>
			<td class="gray">
				<textarea cols="27" rows="5" class="scroll1" readOnly><%= ds.getRemk()%> &nbsp;</textarea>
			</td>
		</tr>
	</table>        

<script>
    parent.document.all.aset_detail_id.outerHTML = aset_detail_id.outerHTML;
</script>
