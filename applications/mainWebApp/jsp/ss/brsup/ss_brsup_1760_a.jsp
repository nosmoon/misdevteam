<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1760_a.jsp
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-�ʱ�ȭ��
* �ۼ����� : 2004-04-08
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-05
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_SHFT_PYMT_INITDataSet ds = (SS_L_SHFT_PYMT_INITDataSet)request.getAttribute("ds");
    applySession = false;	// ���� ���� ����
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToList(ds, "bankcur", "cicdnm", "cicodeval", "����", "", resTemp, "bankCombo");
	rxw.makeDataToList(ds, "cardcur", "cicdnm", "cicodeval", "����", "", resTemp, "cardCombo");
	
	rxw.flush(out);
%>
