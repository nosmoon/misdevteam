<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2400_a.jsp
* ��� : Ȯ����Ȳ-��ŸȮ�����-���л�ķ����Ȯ�� �ʱ�ȭ��
* �ۼ����� : 2012-02-20
* �ۼ��� : ����
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
	
	rxw.add(codeData, "fr_dt", "20120221" ); //Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "to_dt", Util.getDate()); // �Ⱓ ��
		
	//rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "��ü","", codeData, "mediCombo"); // ��ȸ ����Ʈ���� �̿�
	//rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", codeData, "mediCombo1"); // �űԵ�� �˾����� �̿�
	
	rxw.flush(out);	
%>
