<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1105_l.jsp
* ��� : ������-�۾�-���̱׷��̼� ���
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%--
���������ڵ�, ����������� request�� ���� ��´�.
--%>
<%
	SS_S_MIGRWORKINFODataSet ds = (SS_S_MIGRWORKINFODataSet)request.getAttribute("ds");
	String bocd = request.getParameter("bocd");
	String bonm = Util.Uni2Ksc(request.getParameter("bonm"));
%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
<form name="mig_list_form" method="post" action="" >
	<input name="bocd" type="hidden" value ="<%= bocd%>">                    	<!-- �����ڵ� -->
	<input name="bonm" type="hidden" value ="<%= bonm%>">                    	<!-- ������ -->
	<input name="accflag" type="hidden" value ="">                    			<!--accflag ����('BU':���� DB ���ε�, 'LU':���� DB ���ε�, 'BC':���� DB ��ȯ, 'LC':���� DB ��ȯ)-->

	<tr bgcolor="#dddddd" align="center" height="23">
		<td class="gray" align="center"> ���� </td>
		<td width="165" class="gray" align="center"> �����Ͻ� </td>
		<td width="165" class="gray" align="center"> �����Ͻ� </td>
		<td width="150" class="gray" align="center"> �۾����� </td>
		<td width="200" class="gray" align="center"> ó�� </td>
	</tr>
	<tr height="23">
		<td class="gray" align="left"> &nbsp;����DB���ε� </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBodbupfrdt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBodbuptodt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="150" class="gray" align="center"> <%= ds.getBodbupstat()%>&nbsp; </td>
		<td width="200" class="gray" align="left">&nbsp;&nbsp;
			<input type="image" src="/html/comm_img/bu_bodbup.gif" width="96" height="19" align="absmiddle" onclick="javascript:bo_db_upload();window.event.returnValue=false;" border="0">
<%--����DB���ε� ������ ����Ȯ�� ��ư�� �����ش�--%>
<%if("3".equals(ds.getBodbupstatcd())){%>
			&nbsp;<input type="image" src="/html/comm_img/bu_ok.gif" width="36" height="19" align="absmiddle" onclick="javascript:showError();window.event.returnValue=false;" border="0">
<%}%>
		</td>
	</tr>
<%--	
	<tr height="23">
		<td class="gray" align="left"> &nbsp;����DB���ε� </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBilldbupfrdt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBilldbuptodt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="150" class="gray" align="center"> <%= ds.getBilldbupstat()%>&nbsp; </td>
		<td width="200" class="gray" align="left">&nbsp;&nbsp;
			<input type="image" src="/html/comm_img/bu_billdbup.gif" width="96" height="19" align="absmiddle" onclick="javascript:bill_db_upload();window.event.returnValue=false;" border="0">
		</td>
	</tr>
--%>	
	<tr height="23">
		<td class="gray" align="left"> &nbsp;����DB��ȯ </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBoswitfrdt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBoswittodt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="150" class="gray" align="center"> <%= ds.getBoswitstat()%>&nbsp; </td>
		<td width="200" class="gray" align="left">&nbsp;&nbsp;
			<input type="image" src="/html/comm_img/bu_bodbch.gif" width="84" height="19" align="absmiddle" onclick="javascript:bo_db_convert();window.event.returnValue=false;" border="0">
		</td>
	</tr>
<%--	
	<tr height="23">
		<td class="gray" align="left"> &nbsp;����DB��ȯ </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBillswitfrdt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBillswittodt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="150" class="gray" align="center"> <%= ds.getBillswitstat()%>&nbsp; </td>
		<td width="200" class="gray" align="left">&nbsp;&nbsp;
			<input type="image" src="/html/comm_img/bu_billdbch.gif" width="84" height="19" align="absmiddle" onclick="javascript:bill_db_convert();window.event.returnValue=false;" border="0">
		</td>
	</tr>
--%>	
</form>
</table>
<script>
    parent.document.all.mig_list_id.outerHTML = mig_list_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
<%if("".equals(ds.bocd)){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>
