<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1765_d.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-��ȸ����-���-����
* �ۼ����� : 2004-04-07
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<script language="javascript">
    alert("�����Ǿ����ϴ�.");

    // ���ȭ���� �������ش�.
    parent.cost_list_search();

    var form1 = parent.document.cost_detail_form;	// ������ ��

    // ������ ���� ���� reset ���ش�.
    var form1_elements = form1.elements;
    for( var i =0; i< form1_elements.length; i++) {
        form1_elements(i).value = "";
    }

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

	// ���� accflag �� 'I'�� �����Ѵ�.
    parent.document.cost_detail_form.accflag.value = 'I'

    //��� ��ư�� disable��Ų��.
	parent.document.all.cancel_id.disabled=true;
</script>