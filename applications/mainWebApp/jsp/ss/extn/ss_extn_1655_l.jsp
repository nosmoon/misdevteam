<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1655_l.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����-���
* �ۼ����� : 2004-04-01
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_CYEXPAYDataSet ds = (SS_L_PROMSTAF_CYEXPAYDataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ��� �׸��
%>
<!--��� ���� ---------------------------------------------------------------------------->
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="alon_list_id">
<form name="alon_list_form" method="post" action="" >
    <input name="rdr_extndtary" type="hidden" value ="">
    <input name="rdr_extnnoary" type="hidden" value ="">
    <input name="checkedary" type="hidden" value ="">
    <input name="accflag" type="hidden" value ="">
    
	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="70" class="gray" align="center">Ȯ������</td>
		<td width="70" class="gray" align="center">�����</td>
		<td width="60" class="gray" align="center">���ڸ�</td>
		<td width="75" class="gray" align="center">��ü</td>
		<td width="40" class="gray" align="center">�μ�</td>
		<td width="60" class="gray" align="center">����</td>
		<td width="80" class="gray" align="center">����</td>
		<td width="70" class="gray" align="center">Ȯ������</td>
		<td width="80" class="gray" align="center">����</td>
		<td width="60" class="gray" align="center">����</td>
		<td width="70" class="gray" align="center">��������</td>
		<td class="gray" align="center">����</td>
	</tr>
<%	for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord)ds.curcommlist.get(i);%>		
    <!-- �� ��ũ -->
    <tr>
		<td width="70" class="gray" align="center"><%= Util.convertS(curcommlistRec.rdr_extndt)%>&nbsp;</td>
		<td width="70" class="gray" align="left">&nbsp;<%= curcommlistRec.stafnm%></td>
		<td width="60" class="gray" align="left">&nbsp;<%= curcommlistRec.rdrnm%></td>
		<td width="75" class="gray" align="left">&nbsp;<%= curcommlistRec.medinm%></td>
		<td width="40" class="gray" align="right"><%= curcommlistRec.qty%>&nbsp;</td>
		<td width="60" class="gray" align="left">&nbsp;<%= curcommlistRec.areanm%></td>
		<td width="80" class="gray" align="left">&nbsp;<%= curcommlistRec.bonm%></td>
		<td width="70" class="gray" align="center"><%= Util.convertS(curcommlistRec.bo_headcnfmdt)%>&nbsp;</td>
		<td width="80" class="gray" align="left"><%= curcommlistRec.subscnfmstatnm%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.cyextnalon)%>&nbsp;</td>
		<td width="70" class="gray" align="center"><%= Util.convertS(curcommlistRec.alonadjmdt)%>&nbsp;</td>
		<td class="gray" align="center"><input type="checkbox" name="alonadjmyn" value="" <%= Util.convertYn(curcommlistRec.alonadjmyn, "checked", "")%> >&nbsp;</td>
	    <input name="rdr_extndt" type="hidden" value ="<%= curcommlistRec.rdr_extndt%>">
	    <input name="rdr_extnno" type="hidden" value ="<%= curcommlistRec.rdr_extnno%>">
	</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
		<td width="70" class="gray" align="center">&nbsp;</td>
		<td width="70" class="gray" align="center">&nbsp;</td>
		<td width="60" class="gray" align="center">&nbsp;</td>
		<td width="75" class="gray" align="center">&nbsp;</td>
		<td width="40" class="gray" align="center">&nbsp;</td>
		<td width="60" class="gray" align="center">&nbsp;</td>
		<td width="80" class="gray" align="center">&nbsp;</td>
		<td width="70" class="gray" align="center">&nbsp;</td>
		<td width="80" class="gray" align="center">&nbsp;</td>
		<td width="60" class="gray" align="center">&nbsp;</td>
		<td width="70" class="gray" align="center">&nbsp;</td>
		<td class="gray" align="center"><input type="checkbox" name="checkbox" value="">&nbsp;</td>
	</tr>
	<%}%>
<%}%>
   
</form>
</table>
    
<script>
    parent.document.all.alon_list_id.outerHTML = alon_list_id.outerHTML;
    
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>
