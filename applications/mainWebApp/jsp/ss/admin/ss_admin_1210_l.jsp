<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1210_l.jsp
* ��� : ������-�۾�-���̱׷��̼�-�������
* �ۼ����� : 2004-03-11
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MIGRMECDDataSet ds = (SS_L_MIGRMECDDataSet)request.getAttribute("ds");
    int migListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
	int bigListCount = (ds.migrtmpmecdcur.size() > ds.migrcrmmecdcur.size())? ds.migrtmpmecdcur.size() : ds.migrcrmmecdcur.size();
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
              <td class="gray">������</td>
              <td class="gray">����</td>
              <td class="gray">��Ÿ</td>
              <td class="gray">��μ�</td>
              <td class="gray">��������</td>
            </tr>
            <%-- ��� �ݺ� ���� --%>
            <%
            for(int i=0; i<ds.migrtmpmecdcur.size(); i++){
                SS_L_MIGRMECDMIGRTMPMECDCURRecord migrtmpmecdcurRec = (SS_L_MIGRMECDMIGRTMPMECDCURRecord)ds.migrtmpmecdcur.get(i);%>
            <tr align="center" style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrtmpmecdcurRec.sinmoon%>&nbsp;</td>
              <td class="gray"><%= migrtmpmecdcurRec.yuga%>&nbsp;</td>
              <td class="gray"><%= migrtmpmecdcurRec.jyuga%>&nbsp;</td>
              <td class="gray"><%= migrtmpmecdcurRec.muga%>&nbsp;</td>
              <td class="gray"><%= migrtmpmecdcurRec.etc%>&nbsp;</td>
              <td class="gray"><%= migrtmpmecdcurRec.total%>&nbsp;</td>
              <td class="gray"><%= migrtmpmecdcurRec.jungji%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- ��� �ݺ� ���� --%>
            <%for(int i=0; i<(migListCount-ds.migrtmpmecdcur.size()); i++){%>
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
            for(int i=0; i<ds.migrcrmmecdcur.size(); i++){
                SS_L_MIGRMECDMIGRCRMMECDCURRecord migrcrmmecdcurRec = (SS_L_MIGRMECDMIGRCRMMECDCURRecord)ds.migrcrmmecdcur.get(i);%>
            <tr align="center"
			style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrcrmmecdcurRec.sinmoon%>&nbsp;</td>
              <td class="gray"><%= migrcrmmecdcurRec.yuga%>&nbsp;</td>
              <td class="gray"><%= migrcrmmecdcurRec.jyuga%>&nbsp;</td>
              <td class="gray"><%= migrcrmmecdcurRec.muga%>&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray"><%= migrcrmmecdcurRec.total%>&nbsp;</td>
              <td class="gray"><%= migrcrmmecdcurRec.jungji%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- ��� �ݺ� ���� --%>
            <%for(int i=0; i<(migListCount-ds.migrcrmmecdcur.size()); i++){%>
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
	parent.jsInit();

<%if(ds.migrtmpmecdcur.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>

