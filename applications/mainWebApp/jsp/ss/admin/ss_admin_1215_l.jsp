<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1215_l.jsp
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
    SS_L_MIGRGUYUKDataSet ds = (SS_L_MIGRGUYUKDataSet)request.getAttribute("ds");
    int migListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
	int bigListCount = (ds.migrtmpguyukcur.size() > ds.migrcrmguyukcur.size())? ds.migrtmpguyukcur.size() : ds.migrcrmguyukcur.size();
	if (migListCount < bigListCount) {
        migListCount = bigListCount;
	}
	System.out.print(ds.migrtmpguyukcur.size());
	System.out.print(ds.migrcrmguyukcur.size());
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
              <td class="gray">������</td>
              <td class="gray">����</td>
              <td class="gray">��Ÿ</td>
              <td class="gray">��μ�</td>
              <td class="gray">��������</td>
            </tr>
            <%-- ��� �ݺ� ���� --%>
            <%
            for(int i=0; i<ds.migrtmpguyukcur.size(); i++){
                SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord migrtmpguyukcurRec = (SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord)ds.migrtmpguyukcur.get(i);%>
            <tr align="center" style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrtmpguyukcurRec.guyuk%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.yuga%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.jyuga%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.muga%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.etc%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.total%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.jungji%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- ��� �ݺ� ���� --%>
            <%for(int i=0; i<(migListCount-ds.migrtmpguyukcur.size()); i++){%>
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
              <td class="gray">������</td>
              <td class="gray">����</td>
              <td class="gray">��Ÿ</td>
              <td class="gray">��μ�</td>
              <td class="gray">��������</td>
            </tr>
            <%-- ��� �ݺ� ���� --%>
            <%
            for(int i=0; i<ds.migrcrmguyukcur.size(); i++){
                SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord migrcrmguyukcurRec = (SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord)ds.migrcrmguyukcur.get(i);%>
            <tr align="center"
			style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrcrmguyukcurRec.guyuk%>&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.yuga%>&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.jyuga%>&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.muga%>&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.total%>&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.jungji%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- ��� �ݺ� ���� --%>
            <%for(int i=0; i<(migListCount-ds.migrcrmguyukcur.size()); i++){%>
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

<%if(ds.migrtmpguyukcur.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    

</script>

