<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4700_a.jsp
* ��� : ���Ȯ�� ������ȸ-�ʱ�ȭ��
* �ۼ����� : 2016-04-16
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��	
	
	rxw.add(codeData, "uid", String.valueOf( session.getAttribute("uid")));

	rxw.flush(out);
%>

