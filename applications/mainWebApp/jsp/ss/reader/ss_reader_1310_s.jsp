<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1310_s.jsp
* ��� : ������Ȳ-VacationStop-����-��
* �ۼ����� : 2004-02-26
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_VSCLOSDataSet ds = (SS_S_VSCLOSDataSet)request.getAttribute("ds");
%>
<table id="vsclos_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td height="25" bgcolor="#EBE9DC" class="title">VacationStop ���� ��</td>
    </tr>
    <tr>
        <td height="3">
        <!--����-->
        </td>
    </tr>
</table>

<table id="vsclos_detail_id" width="340" border="0" cellspacing="0" cellpadding="1" bgcolor="#ffffff" class="gray">
<form name="vsclos_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="U"><!-- �Է�(I),����(U),����(D) �����ʵ� �ʱⰪ(I) -->
    <input type="hidden" name="closyn" value="<%= ds.getClosyn()%>"><!-- VacationStop ���� �������� -->
    <tr>
        <td bgcolor="#dddddd"  class="gray" height="25">��������<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <input name="basidt" type="text" size="10" class="text_box" value="<%= ds.getBasidt()%>" caption="��������" dataType="date" notEmpty readOnly>
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
            <input name="closdt" type="text" size="10" class="text_box" value="<%= Util.convertS(ds.getClosdt())%>" caption="��������" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td  bgcolor="#dddddd" class="gray" width="90" height="25">��������</td>
        <td colspan="3" class="gray" height="25">
            <%= ds.getClosyn()%>
        </td>
    </tr>    
    <tr> 
      <td bgcolor="#dddddd" width="90" class="gray">�����رݾ�<font color="red">*</font></td>
      <td class="gray"> 
        <input name="costbasiamt" type="text" style="text-align:right" size="8" class="text_box" value="<%= ds.getCostbasiamt()%>"  dataType="integer" comma>
        </td>
    </tr>        
    <tr>
        <td bgcolor="#dddddd" width="90" class="gray" height="25">�����������<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <input name="costpaydt" type="text" size="10" class="text_box" value="<%= ds.getCostpaydt()%>" caption="�����������" dataType="date" notEmpty>
        </td>
    </tr>    
</form>
</table>

<script language="javascript">
    parent.document.all.vsclos_detail_title_id.outerHTML = vsclos_detail_title_id.outerHTML;
    parent.document.all.vsclos_detail_id.outerHTML = vsclos_detail_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
    
    //��� ��ư�� disable��Ų��.
	parent.document.all.cancel_id.disabled = false;
    
	// ���� accflag �� 'U'�� �����Ѵ�.
    parent.document.vsclos_detail_form.accflag.value = 'U';
</script>
