<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1175_l.jsp
* ��� : ������-�۾�-���̱׷��̼� ��Ȳ-���
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MIGRWORKINFODataSet ds = (SS_L_MIGRWORKINFODataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ�� �� �׸��
%>
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
	<form name="mig_list_form" method="post" action="" >
		<input name="bocdary" type="hidden" value ="">                	<!-- �����ڵ� ���չ��ڿ�-->
        <input name="checkedary" type="hidden" value ="">				<!-- ���ÿ��� ���չ��ڿ�-->

		<tr bgcolor="#dddddd" align="center">
			<td width="90" rowspan="2" height="23" class="gray" align="center"> ��&nbsp; </td>
			<td width="90" rowspan="2" height="23" class="gray" align="center"> ���� </td>
			<td width="100" rowspan="2" height="23" class="gray" align="center"> ���� </td>
			<td width="240" colspan="2" height="23" class="gray" align="center"> DB���ε� </td>
			<td width="240" colspan="2" height="23" class="gray" align="center"> DB��ȯ </td>
			<td rowspan="2" height="23" class="gray" align="center"> �Ϸ� </td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="120" height="23" class="gray" align="center"> �������� </td>
			<td width="120" height="23" class="gray" align="center"> �������� </td>
			<td width="120" height="23" class="gray" align="center"> �������� </td>
			<td width="120" height="23" class="gray" align="center"> �������� </td>
		</tr>
<%-- ���̱׷��̼� ��Ȳ ��� ����--%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_MIGRWORKINFOCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKINFOCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- �̻絶�ں�� �� ��ũ -->
		<tr bgcolor="#FFFFFF">
			<td width="90" class="gray" align="left"> <%= curcommlistRec.deptnm%>&nbsp; </td>
			<td width="90" class="gray" align="left"> <%= curcommlistRec.areanm%>&nbsp; </td>
			<td width="100" class="gray" align="left"> <%= curcommlistRec.bonm%>&nbsp; </td>
			<td width="120" class="gray" align="center"> <%= Util.Timestamp2Str(curcommlistRec.billdbuptodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
			<td width="120" class="gray" align="center"> <%= Util.Timestamp2Str(curcommlistRec.bodbuptodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
			<td width="120" class="gray" align="center"> <%= Util.Timestamp2Str(curcommlistRec.billswittodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
			<td width="120" class="gray" align="center"> <%= Util.Timestamp2Str(curcommlistRec.boswittodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
			<td class="gray" align="center">
				<input type="checkbox" name="endcnfmyn" <%= Util.convertYn(curcommlistRec.endcnfmyn, "checked disabled ", "")%> >&nbsp;
			</td>
			<input name="bocd" type="hidden" value ="<%= curcommlistRec.bocd%>"> 	<!-- �����ڵ� -->
		</tr>
<%}%>
<%-- ���̱׷��̼� ��Ȳ ��� ��--%>
<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="90" class="gray" align="center">&nbsp; </td>
			<td width="90" class="gray" align="center">&nbsp; </td>
			<td width="100" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td class="gray" align="center"><input type="checkbox" name="checkbox">&nbsp;</td>
		</tr>
	<%}%>
<%}%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="8" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> ��</b>
			</td>
		</tr>
    </form>
    </table>
<script>
    parent.document.all.mig_list_id.outerHTML = mig_list_id.outerHTML;

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>

