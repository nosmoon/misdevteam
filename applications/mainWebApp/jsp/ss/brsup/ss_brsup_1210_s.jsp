<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1210_s.jsp
* ��� : ��������-�Ź�������ǰ-����-��
* �ۼ����� : 2004-02-05
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_NWSPITEMCOSTCLOSDataSet ds = (SS_S_NWSPITEMCOSTCLOSDataSet)request.getAttribute("ds");
    int mediListCount = 4;
%>
<table id="nwspitemcostclos_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td height="25" bgcolor="#EBE9DC" class="title">�Ź�������ǰ���� ��</td>
    </tr>
    <tr>
        <td height="3">
        <!--����-->
        </td>
    </tr>
</table>

<table id="nwspitemcostclos_detail_id" width="340" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
<form name="nwspitemcostclos_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="U"><!-- �Է�(I),����(U),����(D) �����ʵ� �ʱⰪ(I) -->
    <input type="hidden" name="closyn" value="<%= ds.getClosyn()%>"><!-- �Ź�������ǰ���� �������� -->
    <tr>
        <td bgcolor="#dddddd"  class="gray" height="25">��������(���)<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <input name="basidt" type="text" size="7" class="text_box" value="<%= ds.getBasidt()%>" caption="��������(���)" dataType="month" notEmpty readOnly>
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
        <td  bgcolor="#dddddd" class="gray" width="90" height="25">��������<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <%= ds.getClosyn()%>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" width="90" class="gray" height="25">���û������<font color="#FF0000">*</font></td>
        <td colspan="3" class="gray" height="25">
            <input name="costclamdt" type="text" size="10" class="text_box" value="<%= ds.getCostclamdt()%>" caption="���û������" dataType="date" notEmpty>
        </td>
    </tr>
</form>
</table>

<script language="javascript">
    parent.document.all.nwspitemcostclos_detail_title_id.outerHTML = nwspitemcostclos_detail_title_id.outerHTML;
    parent.document.all.nwspitemcostclos_detail_id.outerHTML = nwspitemcostclos_detail_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

	// ���� accflag �� 'U'�� �����Ѵ�.
    parent.document.nwspitemcostclos_detail_form.accflag.value = 'U'
    
    
    //��� ��ư�� disable��Ų��.
	parent.document.all.cancel_id.disabled = false;
    
</script>
