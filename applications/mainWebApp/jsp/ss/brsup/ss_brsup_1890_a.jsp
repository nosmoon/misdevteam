<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1880_a.jsp
* ��� : ��������-����-���μ�����Ȳ-�ʱ�ȭ��
* �ۼ����� : 2007-03-20
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-27
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CVSRECP_INITDataSet ds = (SS_L_CVSRECP_INITDataSet)request.getAttribute("ds");
    //int rcpListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int rcpListCount = 5000;
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", rcpListCount);
	rxw.add(codeData, "fromdt", Util.getDate());
	rxw.add(codeData, "todt", Util.getDate());
	
	//������ ���
	rxw.makeDataToList(ds, "cvsinfocur", "cicdnm", "cicodeval", "��ü", "", codeData, "recpbankcdCombo");
	
	rxw.flush(out);
%>
