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
    SS_L_MIGRERRDataSet ds = (SS_L_MIGRERRDataSet)request.getAttribute("ds");
    int migListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
	System.out.print(ds.migrerrcur.size());
%>
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="gray" id="mig_mecd">
    <tr valign="top">
        <td>
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td height="25" align="left" colspan="3" class="gray">&nbsp;</td>
                <td height="25" align="left" colspan="4" class="gray">&nbsp;���������</td>
                <td height="25" align="left" colspan="4" class="gray">&nbsp;CRM�ý���</td>
                <td height="25" align="left" colspan="2" class="gray">&nbsp;</td>
            </tr>
            <tr bgcolor="#dddddd" align="center">

              <td height="23" class="gray">����</td>
              <td class="gray">���</td>
			  <td class="gray">��ü��</td>

              <td class="gray">������ȣ</td>
              <td class="gray">������</td>
              <td class="gray">��������</td>
              <td class="gray">���ݹ��</td>

              <td class="gray">�ŵ��ڹ�ȣ</td>
              <td class="gray">���Ῡ��</td>
              <td class="gray">������</td>
              <td class="gray">���ݹ��</td>

              <td class="gray">�����ڵ�</td>
              <td class="gray">��������</td>

            </tr>
            <%-- ��� �ݺ� ���� --%>
            <%
			for(int i=0; i<ds.migrerrcur.size(); i++){
				SS_L_MIGRERRMIGRERRCURRecord migrerrcurRec = (SS_L_MIGRERRMIGRERRCURRecord)ds.migrerrcur.get(i);%>
            <tr align="center"
			style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrerrcurRec.dd_no%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.dd_bno%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.sinmoon%>&nbsp;</td>

              <td class="gray"><%= migrerrcurRec.dd_code%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.oyuga%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.ogudok%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.osgbang%>&nbsp;</td>

              <td class="gray"><%= migrerrcurRec.rdr_no%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.cfreeyn%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.cyuga%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.csgbang%>&nbsp;</td>

              <td class="gray"><%= migrerrcurRec.ercode%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.ername%>&nbsp;</td>

            </tr>
            <%}%>
            <%-- ��� �ݺ� ���� --%>
            <%for(int i=0; i<(migListCount-ds.migrerrcur.size()); i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>

              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>

              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>

              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <%}%>
            <tr bgcolor="#dddddd">
              <td height="23" colspan="13" class="gray">
                <%-- �հ� --%>&nbsp;
              </td>
            </tr>
          </table>
        </td>
    </tr>
    </table>

<script>
    parent.document.all.mig_mecd.outerHTML = mig_mecd.outerHTML;
    //parent.document.all.page_move.outerHTML = page_move.outerHTML;
	parent.jsInit();
</script>

