<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1020_u.jsp
* ��� : ��������-�Ź�������ǰ-���-����
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<script language="javascript">
    alert("����Ǿ����ϴ�.");

    // ���ȭ���� �������ش�.
    parent.list_search();

    // ��ȭ���� �ʱ�ȭ��Ų��.
    parent.add();
    parent.nwspitem_detail_form.thumbnailimg.src        =   '/html/img/No_Image.GIF';
    parent.nwspitem_detail_form.item.value              =   '0';
    
    parent.nwspitem_detail_form.thumbnail.select(); 				// �����
	parent.document.selection.clear();
	
	parent.nwspitem_detail_form.popup.select(); 				// �˾�
	parent.document.selection.clear();
</script>
