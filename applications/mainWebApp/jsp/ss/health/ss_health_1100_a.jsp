<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_health_1100_a.jsp
* ��� :  �ｺ����-��ũ�ϸ���-�ʱ�ȭ��
* �ۼ����� : 2015-1-5
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%  	
    applySession = false;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	rxw.add(codeData, "frdt", Util.addMonth(Util.getDate(),-1)); // �Ⱓ ����
	rxw.add(codeData, "todt", Util.getDate()); // �Ⱓ ��
	
	rxw.flush(out);
%>