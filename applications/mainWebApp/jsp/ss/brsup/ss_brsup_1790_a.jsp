<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1790_a.jsp
* ��� : ������������-Billing�ڵ���ü-��û/�������-�ʱ�ȭ��
* �ۼ����� : 2005-01-11
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-24
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    //int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
    applySession = false;	// ���� ���� ����

    SS_L_SHFTAPLCEXPY_STCS_INITDataSet ds = (SS_L_SHFTAPLCEXPY_STCS_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", moveListCount);
	rxw.add(codeData, "fr_dt", Util.addDate(Util.getDate(),-365));
	rxw.add(codeData, "to_dt", Util.getDate());
	
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "ciymgbcd", "��ü", "", codeData, "shiftClsfCombo");
	
	rxw.flush(out);
%>
