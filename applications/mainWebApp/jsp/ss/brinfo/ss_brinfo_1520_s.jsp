<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1520_s.jsp
* ��� : ����Info-���������ڱ���Ȳ-��
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
    SS_S_LEASAMTDataSet ds = (SS_S_LEASAMTDataSet)request.getAttribute("ds");
%>

<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="detail_list">
<form name="aset_detail_form" method="post" action="">
	<input name="deptcd" type="hidden" value ="<%= ds.getDeptcd()%>" maxlength="5" >	<!--�μ�(��)�ڵ�-->
	<input name="areacd" type="hidden" value ="<%= ds.getAreacd()%>" maxlength="5" >    <!--�����ڵ�-->
	<input name="bocd" type="hidden" value ="<%= ds.getBocd()%>" maxlength="5" >        <!--���������ڵ�-->
	<input name="seq" type="hidden" value ="<%= ds.getSeq()%>" maxlength="5">        	<!--����-->

	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">��&nbsp;</td>
		<td class="gray" width="250" ><%= ds.getDeptnm()%>&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >����</td>
		<td class="gray" width="100" ><%= ds.getAreanm()%>&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >������</td>
		<td class="gray" width="120" ><%= ds.getBonm()%>&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">������</td>
		<td class="gray" width="250" ><%= ds.getPresinm()%>&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >�����</td>
		<td class="gray" colspan="3" ><%= ds.getNowchrg()%>&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">ä��Ȯ������</td>
		<td class="gray" width="250">
			�������
			<input type="checkbox" name="bondregiconf" value="<%= ds.getBondregiconf()%>" <%= ("Y".equals(ds.getBondregiconf().toUpperCase()))? "checked" : "" %> >
			���ε
			<input type="checkbox" name="bondregi" value="<%= ds.getBondregi()%>" <%= ("Y".equals(ds.getBondregi().toUpperCase()))? "checked" : "" %> >
			������
			<input type="checkbox" name="bondwarrp" value="<%= ds.getBondwarrp()%>" <%= ("Y".equals(ds.getBondwarrp().toUpperCase()))? "checked" : "" %> >
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">��������</td>
		<td class="gray" colspan="3">
			��༭
			<input type="checkbox" name="leascntrp" value="<%= ds.getLeascntrp()%>" <%= ("Y".equals(ds.getLeascntrp().toUpperCase()))? "checked" : "" %> >
			���ε
			<input type="checkbox" name="leasregi" value="<%= ds.getLeasregi()%>" <%= ("Y".equals(ds.getLeasregi().toUpperCase()))? "checked" : "" %> >
			����
			<input type="checkbox" name="leasexch_note" value="<%= ds.getLeasexch_note()%>" <%= ("Y".equals(ds.getLeasexch_note().toUpperCase()))? "checked" : "" %> >
			��������
			<input type="checkbox" name="leasloandeed" value="<%= ds.getLeasloandeed()%>" <%= ("Y".equals(ds.getLeasloandeed().toUpperCase()))? "checked" : "" %> >
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">�����缭��</td>
		<td class="gray" width="250">
			����
			<input type="checkbox" name="prvoffideciddocuyn" value="<%= ds.getPrvoffideciddocuyn()%>"<%= ("Y".equals(ds.getPrvoffideciddocuyn().toUpperCase()))? "checked" : "" %> >
			����
			<input type="checkbox" name="curroffideciddocuyn" value="<%= ds.getCurroffideciddocuyn()%>" <%= ("Y".equals(ds.getCurroffideciddocuyn().toUpperCase()))? "checked" : "" %> >
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">�����缭��</td>
		<td class="gray" colspan="3">
			����
			<input type="checkbox" name="prvhdqtdeciddocuyn" value="<%= ds.getPrvhdqtdeciddocuyn()%>" <%= ("Y".equals(ds.getPrvhdqtdeciddocuyn().toUpperCase()))? "checked" : "" %> >
			����
			<input type="checkbox" name="currhdqtdeciddocuyn" value="<%= ds.getCurrhdqtdeciddocuyn()%>" <%= ("Y".equals(ds.getCurrhdqtdeciddocuyn().toUpperCase()))? "checked" : "" %> >
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">�����繫�� �ε���ǥ��</td>
		<td class="gray" colspan="5"><%= ds.getBooffi_roomrlesindc()%>&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">ä��Ȯ������ �ε���ǥ�� </td>
		<td class="gray" colspan="5"><%= ds.getBondprsvobjvolrlesindc()%>&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">���</td>
		<td class="gray" colspan="5">
		<textarea name="remk" rows="3" cols="90" ><%= ds.getRemk()%></textarea>
		</td>
	</tr>
	</form>
</table>

<script>
    parent.document.all.detail_list.outerHTML = detail_list.outerHTML;
</script>
