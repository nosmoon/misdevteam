<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1161_l.jsp
* ��� : ����-��ü�ڵ�˻�(ȸ�纰)-����
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
<select name="medicd_sel" class="sel_all" id="detail_medicd_id" onChange="medicd_changed();">
	<option value="" selected>����</option>
	<%= ds.curcommlistOptHtml("") %>
</select>

<script language="javascript">
	parent.document.all.detail_medicd_id.outerHTML = detail_medicd_id.outerHTML;
</script>
