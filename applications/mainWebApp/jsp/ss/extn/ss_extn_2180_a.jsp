<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2180_a.jsp
* ��� : Ȯ����Ȳ-���Ȯ������ �ʱ�ȭ��
* �ۼ����� : 2009-05-29
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_COST_INITDataSet ds = (SS_L_EXTN_COST_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "yyyymm", Util.getYear() + "0101"); // �Ⱓ ����
	rxw.add(codeData, "yyyymmdd", Util.getDate()); // �Ⱓ ��
		
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "��ü","", codeData, "mediCombo"); // ��ȸ ����Ʈ���� �̿�
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", codeData, "mediCombo1"); // �űԵ�� �˾����� �̿�
	
	rxw.flush(out);	
%>
