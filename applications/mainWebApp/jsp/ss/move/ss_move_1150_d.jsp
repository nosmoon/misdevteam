<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1125_d.jsp
* ��� : �̻絶��-����-����
* �ۼ����� : 2004-01-07
* �ۼ��� : ��뼷
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
    parent.move_list_search();

    var form1 = parent.document.move_detail_form;	// ������ ��

    // ������ ���� ���� reset ���ش�.
    var form1_elements = form1.elements;
    for( var i =0; i< form1_elements.length; i++) {
        form1_elements(i).value = "";
    }

	// ���� accflag �� 'I'�� �����Ѵ�.
    parent.document.move_detail_form.accflag.value = 'I'

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

    // ��� ��ư�� disable��Ų��.
	parent.document.all.cancel_id.disabled = true;


</script>
