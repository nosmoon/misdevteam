<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1250_s.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-��ȸ����-���-��
* �ۼ����� : 2004-04-07
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RDR_EXTN_CYBCLOSDataSet ds = (SS_S_RDR_EXTN_CYBCLOSDataSet)request.getAttribute("ds");
    int mediListCount = 4;
%>
<table id="cost_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td height="25" bgcolor="#EBE9DC" class="title">���̹�Ȯ���븶�� ��</td>
    </tr>
    <tr>
        <td height="3">
        <!--����-->
        </td>
    </tr>
</table>

<table id="cost_detail_id" width="340" border="0" cellspacing="0" cellpadding="1" bgcolor="#ffffff" class="gray">
<form name="cost_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="U"><!-- �Է�(I),����(U),����(D) �����ʵ� �ʱⰪ(I) -->
    <input type="hidden" name="closyn" value="<%= ds.getClosyn()%>"><!-- ���̹�Ȯ���� �������� -->
  <tr>
    <td bgcolor="#dddddd"  class="gray" height="25">��������(���)<font color="#FF0000">*</font></td>
    <td colspan="3" class="gray" height="25">
      <input name="basidt" type="text" size="20" class="text_box" value="<%= ds.getBasidt()%>" caption="��������(���)" dataType="month" notEmpty readOnly>
<%--
      <%= ds.getBasidt()%>&nbsp;
--%>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" width="90" height="25">��������<font color="#FF0000">*</font></td>
    <td colspan="3" class="gray" height="25">
      <input name="frdt" type="text" size="10" class="text_box" value="<%= ds.getFrdt()%>"  caption="��������" dataType="date" notEmpty>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" width="90" height="25">��������<font color="#FF0000">*</font></td>
    <td colspan="3" class="gray" height="25">
      <input name="todt" type="text" size="10" class="text_box" value="<%= ds.getTodt()%>" caption="��������" dataType="date" notEmpty>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" width="90" height="25">�����������<font color="#FF0000">*</font></td>
    <td colspan="3" class="gray" height="25">
      <input name="closdt" type="text" size="10" class="text_box" value="<%= ds.getClosdt()%>" caption="�����������" dataType="date" notEmpty>
    </td>
  </tr>
  <tr>
    <td  bgcolor="#dddddd" class="gray" width="90" height="25">��������</td>
    <td colspan="3" class="gray" height="25">
     <%= ds.getClosyn()%>
    </td>
  </tr>
</form>
</table>

<script language="javascript">
    parent.document.all.cost_detail_title_id.outerHTML = cost_detail_title_id.outerHTML;
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

	// ���� accflag �� 'U'�� �����Ѵ�.
    parent.document.cost_detail_form.accflag.value = 'U';
</script>
