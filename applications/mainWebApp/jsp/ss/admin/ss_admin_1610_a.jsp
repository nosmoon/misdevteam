<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1610_a.jsp
* ��� : ������-������ �����ȣ ����ó��-�ʱ�ȭ��
* �ۼ����� : 2004-05-07
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: 
* ������	: 
* ��������	: 
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CHGZIPCODE_INITDataSet ds = (SS_L_CHGZIPCODE_INITDataSet)request.getAttribute("ds");
    int wrkListCount = 12;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
		
	rxw.makeDataToList(ds, "curdatelist", "workvernm", "workver", initData, "dateCombo"); //����߻���
		
	rxw.flush(out);	
%>

