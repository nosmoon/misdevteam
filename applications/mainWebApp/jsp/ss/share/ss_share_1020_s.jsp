<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1020_s.jsp
* ��� : �������� ���� ������ ����
* �ۼ����� : 2003-10-27
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    CO_S_SCHEDataSet ds = (CO_S_SCHEDataSet)request.getAttribute("ds");  // request dataset

    // �������κ��� ����������� ��´�.
	String selldeptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", true)); //�Ǹźμ���
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", true)); //����

%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="sche_detail_id">
<form name="sche_detail_form" method="post" action="">
	<input type="hidden" name="seq" value="<%= ds.getSeq()%>">
	<input type="hidden" name="accflag" value="U"> 		<!--�۾�����(I:���, U:����, D:����)-->

	<tr>
		<td width="100" height="24" bgcolor="#dddddd" class="gray">��&nbsp; <font color="red">*</font></td>
		<td  class="gray" width="315">&nbsp;<%= ds.getDeptnm()%></td>
		<td width="100" height="24" bgcolor="#dddddd" class="gray">����� <font color="red">*</font></td>
		<td  class="gray" width="315">&nbsp;<%= emp_nm%></td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">�����׸� <font color="red">*</font><br></td>
		<td class="gray">
			<select name="schemangitemcd" class="sel_all">
				<option value="">����</option>
				<%=ds.curcommlist3OptHtml(ds.getSchemangitemcd())%>
			</select>
		</td>
		<td bgcolor="#dddddd" class="gray" width="100"> �������� <font color="red">*</font></td>
		<td class="gray" width="315">
			<select name="schemangunitcd" class="sel_all">
				<option value="">����</option>
				<%=ds.curcommlist2OptHtml(ds.getSchemangunitcd())%>
			</select>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">�������� <font color="red">*</font><br>
		</td>
		<td class="gray" width="315">
			<input name="frdt" type="text" value="<%= ds.getFrdt()%>" maxlength="10" size="10" class="text_box" dataType=date> ��) 20040101
		</td>
		<td width="100" bgcolor="#dddddd" class="gray">�������� <font color="red">*</font></td>
		<td  class="gray" width="315">
			<input name="todt" type="text" value="<%= ds.getTodt()%>" maxlength="10" size="10" class="text_box" dataType=date> ��) 20040201
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">���� </td>
		<td colspan="3" class="gray">
			<input name="remk" type="text" style="ime-mode:active;" value="<%= ds.getRemk()%>" maxlength="100" size="100" class="text_box">
		</td>
	</tr>
</form>
</table>

<script>
<!--
    parent.document.all.sche_detail_id.outerHTML = sche_detail_id.outerHTML;
    parent.jsInit();
-->
</script>
