<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_brmgr_2059_l.jsp
* ��� 	 	 : �Ǹ�-����Ʈ���Է� 
* �ۼ����� 	 : 2009-08-14
* �ۼ��� 	 : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: 
* ������	: 
* ��������	: 
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%

    // dataset �ν��Ͻ� ����κ�
    SS_L_APTDONGUNITTHRW_INITDataSet ds = (SS_L_APTDONGUNITTHRW_INITDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;

	rxw.makeDataToList(ds, "aptlistcur", "addrnm", "addrcd", "����", "", root, "aptlist");
	
	rxw.flush(out);
%> 
