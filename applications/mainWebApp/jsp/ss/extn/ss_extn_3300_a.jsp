<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_3300_a.jsp
* ��� : Ȯ�����-�������˵��ڰ���-��������ʱ�ȭ��
* �ۼ����� : 2015-11-11
* �ۼ��� : �弱��
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

//	rxw.add(codeData, "frdt", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "frdt", Util.addMonth(Util.getDate(),-1));// �Ⱓ ����
	rxw.add(codeData, "todt", Util.getDate()); // �Ⱓ ��

	rxw.flush(out);
%>
