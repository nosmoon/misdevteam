<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1795_a.jsp
* ��� : ������������-Billing�ڵ���ü-��������-�ʱ�ȭ��
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
    SS_L_SHFTEXPYRDR_INITDataSet ds = (SS_L_SHFTEXPYRDR_INITDataSet)request.getAttribute("ds");

    //int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
    applySession = false;	// ���� ���� ����
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", moveListCount);
	rxw.add(codeData, "fr_dt", Util.addDate(Util.getDate(),-364));
	rxw.add(codeData, "to_dt", Util.getDate());
	
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "ciymgbcd", "��ü", "", codeData, "shiftClsfCombo");
	
	rxw.flush(out);
%>