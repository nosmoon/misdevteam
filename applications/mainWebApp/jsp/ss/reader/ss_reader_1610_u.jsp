<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1611_u.jsp
* ���     : ���ڵ�ް��� ���ڵ�� ������ ���ϵǴ°�
* �ۼ����� : 2004-04-26
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset �ν��Ͻ� ����κ�
	CO_U_RDRCRTS_GRAD_GRNTDataSet ds = (CO_U_RDRCRTS_GRAD_GRNTDataSet)request.getAttribute("ds");
	
	//���������� request
	//String curr_page =   request.getParameter("pageno");
%>

<%
    //���������� ó��(����)�Ǿ��� ���
	if("".equals(ds.getChkwantcol()) || ds.getChkwantcol() == null) {
%>

    <script language="javascript">
        alert("����Ǿ����ϴ�.");

        var lo_form1 = parent.document.search_form;
        
        var ls_pageno = lo_form1.pageno.value;

        parent.list_search(ls_pageno);
    </script>

<%
	//üũ���� �߻����� ���
	} else {
%>

    <script language="javascript">
        alert("<%= ds.getChkmessage()%>");

        var lo_form1 = parent.document.grad_form;

        lo_form1.<%= ds.getChkwantcol()%>.focus();
    </script>

<%
	}
%>
