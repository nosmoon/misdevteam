<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_bil_1431_s.jsp
* ���     : ���� ���ϵ��� ���� �˻�
* �ۼ����� : 2004-03-31
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset �ν��Ͻ� ����κ�
	PB_S_RDRINFO_PARTDataSet ds = (PB_S_RDRINFO_PARTDataSet)request.getAttribute("ds");
%>

	<script>
		var lo_form1  =  parent.document.detail_form;

		lo_form1.rdr_no.value        =  '<%= ds.getRdr_no()%>';
		lo_form1.medicd.value        =  '<%= ds.getMedicd()%>';
		lo_form1.termsubsno.value    =  '<%= ds.getTermsubsno()%>';
		lo_form1.rdrnm.value         =  '<%= ds.getRdrnm()%>';
		lo_form1.medinm.value        =  '<%= ds.getMedinm()%>';
		lo_form1.subsfrser_no.value  =  '<%= ds.getSubsfrser_no()%>';
		lo_form1.substoser_no.value  =  '<%= ds.getSubstoser_no()%>';

		lo_form1.procclsf.focus();
	</script>
