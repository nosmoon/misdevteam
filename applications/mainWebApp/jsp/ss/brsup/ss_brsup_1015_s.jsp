<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1015_s.jsp
* ��� : ��������-�Ź�������ǰ-���-��
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_NWSPITEMDataSet ds = (SS_S_NWSPITEMDataSet)request.getAttribute("ds");
%>
<%--
��ȭ�鿡�� ��ǰ�ڵ�� �ڵ���� ������ �� ����. MIS���� ���氡��
--%>
<form name="nwspitem_detail_form" method="post" action="">
	<select name="itemcd" class="sel_all">
		<option value="<%= ds.getItemcd()%>" selected><%= ds.getItemnm() %></option>
	</select>
    <textarea name="remk"><%=ds.getRemk()%></textarea>
</form>

<script language="javascript">
	// ȭ�� �׸� ó��
	parent.nwspitem_detail_form.itemclsf.value 			= 	'<%= ds.getItemclsf()%>';				// ��ǰ����
	parent.nwspitem_detail_form.itemcd.outerHTML		= 	nwspitem_detail_form.itemcd.outerHTML;	// ��ǰ��
	parent.nwspitem_detail_form.sendclsf.value 			= 	'<%= ds.getSendclsf()%>';				// �߼۱���
	parent.nwspitem_detail_form.costclsf.value 			= 	'<%= ds.getCostclsf()%>';				// ���û������
	parent.nwspitem_detail_form.rcpmchrgpersclsf.value 	= 	'<%= ds.getRcpmchrgpersclsf()%>';		// �Աݴ����
	parent.nwspitem_detail_form.clamchrgpersclsf.value 	= 	'<%= ds.getClamchrgpersclsf()%>';		// û�������
	parent.nwspitem_detail_form.remk.value 				= 	nwspitem_detail_form.remk.value;		// ����
	parent.nwspitem_detail_form.uprc.value 				= 	'<%= ds.getUprc()%>';					// �ܰ�
	parent.nwspitem_detail_form.qunt.value 				= 	'<%= ds.getQunt()%>';					// ����
	parent.nwspitem_detail_form.aplcfrdt.value 			= 	'<%= ds.getAplcfrdt()%>';				// ��û��������
	parent.nwspitem_detail_form.aplctodt.value 			= 	'<%= ds.getAplctodt()%>';				// ��û��������
	parent.nwspitem_detail_form.aplcclostm.value 		= 	'<%= ds.getAplcclostm()%>';				// ��û�����ð�
	parent.nwspitem_detail_form.item.value        		= 	'<%= ds.getItemcd()%>';				// ��û�����ð�
	//parent.nwspitem_detail_form.thumbnailimg.src        =   '/html/img/No_Image.GIF'	
	parent.nwspitem_detail_form.thumbnailimg.src        =   '/ss/brsup/1016?itemcd=<%= ds.getItemcd()%>'
	
	// �����, �˾� �� �ʱ�ȭ
	parent.nwspitem_detail_form.thumbnail.select(); 				// �����
	parent.document.selection.clear();
	
	parent.nwspitem_detail_form.popup.select(); 				// �˾�
	parent.document.selection.clear();


	
	// ������ accflag ����
	parent.nwspitem_detail_form.accflag.value = 'U';

	// �Է��׸� ó��
	parent.jsInit();

</script>