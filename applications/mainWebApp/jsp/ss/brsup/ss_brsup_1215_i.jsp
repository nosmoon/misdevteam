<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1215_i.jsp
* ��� : ��������-�Ź�������ǰ-����-����(���)
* �ۼ����� : 2004-02-05
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
    parent.nwspitemcostclos_list_search();

    var form1 = parent.document.nwspitemcostclos_detail_form;	// ������ ��

    // ������ ���� ���� reset ���ش�.
    var form1_elements = form1.elements;
    for( var i =0; i< form1_elements.length; i++) {
        form1_elements(i).value = "";
    }

    // ���� accflag �� 'I'�� �����Ѵ�.
    parent.document.nwspitemcostclos_detail_form.accflag.value = 'I'

    //��� ��ư�� disable��Ų��.
	parent.document.all.cancel_id.disabled = true;
</script>
