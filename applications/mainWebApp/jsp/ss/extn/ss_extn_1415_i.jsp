<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1415_i.jsp
* ��� : Ȯ����Ȳ-Ȯ��������-����(���)
* �ۼ����� : 2003-12-17
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<script language="javascript">
    alert("�߰��Ǿ����ϴ�.");

    // ���ȭ���� �������ش�.
    parent.sls_list_search();

    var form1 = parent.document.sls_detail_form;	// ������ ��

    // ������ ���� ���� reset ���ش�.
    var form1_elements = form1.elements;
    for( var i =0; i< form1_elements.length; i++) {
        form1_elements(i).value = "";
    }

    // ���� accflag �� 'I'�� �����Ѵ�.
    parent.document.sls_detail_form.accflag.value = 'I'

    //��� ��ư�� disable��Ų��.
	parent.document.all.cancel_id.disabled = true;
</script>
