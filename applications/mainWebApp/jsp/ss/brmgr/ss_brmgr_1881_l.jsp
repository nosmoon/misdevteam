<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_brmgr_1881_l.jsp
* ��� 	 	 : �Ǹ�-����Ʈ���Է� ����-��Ȳ���
* �ۼ����� 	 : 2006-01-25
* �ۼ��� 	 : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-19
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%

    // dataset �ν��Ͻ� ����κ�
    SS_L_COMM_APT_THRWDataSet ds = (SS_L_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;

	rxw.makeDataToList(ds, "addrcdcur", "addrnm", "addrcd", "����", "", root, "aptlist");
	
	rxw.flush(out);
%>
