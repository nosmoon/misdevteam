<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1516_a.jsp
* ��� : ����-�ڵ���ü-���
* �ۼ����� : 2006-04-20
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<table  width="830" cellspacing="0" cellpadding="0" border="0" id="pbrdr_list">
    <tr bgcolor="#DDDDDD" >
        <td width="30" align="center" class="gray">
        <input type="checkbox" name="formcheckbox1">
        </td>
        <td width="100" align="center" class="gray"> �Ҽ����� </td>
        <td width="100" align="center" class="gray"> ������ü </td>
        <td width="150" align="center" class="gray"> ���ڹ�ȣ </td>
        <td width="130" align="center" class="gray"> �����Ⱓ </td>
        <td width="80"  align="center" class="gray"> �ּ� </td>
        <td width="80"  align="center" class="gray"> �����ڹ�ȣ </td>
    </tr>
    <tr>
        <td width="30" class="gray" align="center" >
        <input type="checkbox" name="formcheckbox12">
        </td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
    </tr>
</table>
<script language="javascript">
    alert("��û�Ǿ����ϴ�.");

	// ȭ�� �ʱ�ȭ
    parent.shftaplc_cancel();

    parent.document.all.pbrdr_list.outerHTML = pbrdr_list.outerHTML;
	parent.setEventHandler();

</script>
