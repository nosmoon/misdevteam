<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2900_a.jsp
* ��� : Ȯ����Ȳ-��ŸȮ�����-�������� �̺�Ʈ ���� �ʱ�ȭ��
* �ۼ����� : 2014-02-05
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fr_dt", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "to_dt", Util.getDate()); // �Ⱓ ��
	
	rxw.flush(out);	
%>