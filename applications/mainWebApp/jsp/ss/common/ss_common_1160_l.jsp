<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1160_l.jsp
* ��� : ����-��ü�ڵ�˻�(ȸ�纰)-�˻���
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_CMPY_MEDICDDataSet ds = (SS_L_CMPY_MEDICDDataSet)request.getAttribute("ds");
%>
<select name="medicd" class="sel_all" id="medicd_id">
	<option value="" selected>��ü</option>
	<%= ds.curcommlistOptHtml("") %>
</select>

<script language="javascript">
	parent.document.all.medicd_id.outerHTML = medicd_id.outerHTML;
</script>
