<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1611_u.jsp
* ���     : ���+ ���ݿ����� ���ڵ�� ������ ���ϵǴ°�
* �ۼ����� : 2004-04-26
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : ������
* �������� : 2009-03-05
* ������ϸ� : ps_rdr_1611_u.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
    //dataset �ν��Ͻ� ����κ�
	CO_U_RDRCRTS_GRAD_GRNTDataSet ds = (CO_U_RDRCRTS_GRAD_GRNTDataSet)request.getAttribute("ds");

	String strMsg = "";
	//���������� request
	//String curr_page =   request.getParameter("pageno");

    //���������� ó��(����)�Ǿ��� ���
	if("".equals(ds.getChkwantcol()) || ds.getChkwantcol() == null) {
		
	   strMsg = "�����Ǿ����ϴ�.";		 

	} else {
		strMsg = ds.getChkmessage();
	}

   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);
   //rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>

