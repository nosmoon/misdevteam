<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1906_l.jsp
* ��� : ����-�ڵ���üû��������
* �ۼ����� : 2006-04-19
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_SHFT_CLAM_SSUMDataSet ds = (PS_L_SHFT_CLAM_SSUMDataSet)request.getAttribute("ds");
%>
<table width="830" border="0" cellpadding="1" cellspacing="0" class="gray" id="clam_ssum_id">
    <tr align="center" bgcolor="#dddddd">
        <td width="100" class="gray">���籸��</td>
        <td width="100" class="gray">��ü����</td>
        <td width="100" class="gray">û���Ǽ�</td>
        <td width="100" class="gray">û���ݾ�</td>
        <td width="100" class="gray">�����Ǽ�</td>
        <td width="100" class="gray">�����ݾ�</td>
        <td width="100" class="gray">������</td>
        <td width="100" class="gray">����۱ݾ�</td>
    </tr>
    <%--����Ʈ���� ����%--%>
    <%
    int i = 0;
    for(i=0; i<ds.rsltcur.size(); i++){
        PS_L_SHFT_CLAM_SSUMRSLTCURRecord rsltcurRec = (PS_L_SHFT_CLAM_SSUMRSLTCURRecord)ds.rsltcur.get(i);
    %>
    <tr onclick="javascript:ocom_detl_list(1,'<%=rsltcurRec.shftclsfcd%>','<%= rsltcurRec.bocd%>')"  onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" style="cursor:hand;" >
        <td height="17" class="gray"><%= rsltcurRec.bonm%>&nbsp;</td>
        <td height="17" class="gray"><%= rsltcurRec.shftclsfnm%>&nbsp;</td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.clamnoit)%>&nbsp;	    </td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.clamtotamt)%>&nbsp;	</td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.recpnoit)%>&nbsp;	    </td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.recptotamt)%>&nbsp;	</td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.billcoms)%>&nbsp;	    </td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.recptotamt-rsltcurRec.billcoms)%>&nbsp;</td>
    </tr>
    <%--�� �� ����--%>
    <%
    }

    if(i<3) {
        for(int j=0; j<3-i; j++) {
    %>
    <tr  bgcolor="#FFFFFF">
        <td height="17" class="gray">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
    </tr>
    <%
        }
    }
   %>
</table>

<script language="javascript">
    parent.document.all.clam_ssum_id.outerHTML = document.all.clam_ssum_id.outerHTML;
    <%
        if(ds.rsltcur.size()==0) {
    %>
    alert("�˻������ �����ϴ�.");
    <%
        }
    %>
</script>
