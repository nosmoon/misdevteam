<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1220_l.jsp
* ��� : ������-�۾�-���̱׷��̼�-�������
* �ۼ����� : 2004-04-01
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MIGRSGBANGDataSet ds = (SS_L_MIGRSGBANGDataSet)request.getAttribute("ds");
    int migListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
	int bigListCount = (ds.migrtmpsgbangcur.size() > ds.migrcrmsgbangcur.size())? ds.migrtmpsgbangcur.size() : ds.migrcrmsgbangcur.size();
	if (migListCount < bigListCount) {
        migListCount = bigListCount;
	}
%>
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="gray" id="mig_mecd">
    <tr>
        <td height="25" align="left" class="gray">&nbsp;���������</td>
        <td height="25" align="left" class="gray">&nbsp;CRM�ý���</td>
    </tr>
    <tr valign="top">
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">����</td>
              <td class="gray">����</td>
              <td class="gray">�湮</td>
              <td class="gray">�ڵ���ü</td>
              <td class="gray">ī����ü</td>
              <td class="gray">��Ÿ</td>
              <td class="gray">TOTAL</td>
            </tr>
            <%-- ��� �ݺ� ���� --%>
            <%
            for(int i=0; i<ds.migrtmpsgbangcur.size(); i++){
                SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord migrtmpsgbangcurRec = (SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord)ds.migrtmpsgbangcur.get(i);%>
            <tr align="center" style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrtmpsgbangcurRec.sinmoon%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.giro%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.bangmun%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.autogiro%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.cardauto%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.etc%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.total%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- ��� �ݺ� ���� --%>
            <%for(int i=0; i<(migListCount-ds.migrtmpsgbangcur.size()); i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <%}%>
            <tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
                <%-- �հ� --%>&nbsp;
              </td>
            </tr>
          </table>
        </td>
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">����</td>
              <td class="gray">����</td>
              <td class="gray">�湮</td>
              <td class="gray">�ڵ���ü</td>
              <td class="gray">ī����ü</td>
              <td class="gray">��Ÿ</td>
              <td class="gray">TOTAL</td>
            </tr>
            <%-- ��� �ݺ� ���� --%>
            <%
            for(int i=0; i<ds.migrcrmsgbangcur.size(); i++){
                SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord migrcrmsgbangcurRec = (SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord)ds.migrcrmsgbangcur.get(i);%>
            <tr align="center"
			style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrcrmsgbangcurRec.sinmoon%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.giro%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.bangmun%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.autogiro%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.cardauto%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.etc%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.total%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- ��� �ݺ� ���� --%>
            <%for(int i=0; i<(migListCount-ds.migrcrmsgbangcur.size()); i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <%}%>
            <tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
                <%-- �հ� --%> &nbsp;
              </td>
            </tr>
          </table>
        </td>
    </tr>
    </table>

<script>
    parent.document.all.mig_mecd.outerHTML = mig_mecd.outerHTML;
    //parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();


<%if(ds.migrtmpsgbangcur.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>

