<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2700_a.jsp
* ��� : ������� ���
* �ۼ����� : 2015-09-30
* �ۼ��� : ������

---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VACT_STAT_INITDataSet ds = (SS_L_VACT_STAT_INITDataSet)request.getAttribute("ds");

    //int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
    applySession = false;	// ���� ���� ����
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fr_dt", Util.getDate());
	rxw.add(codeData, "to_dt", Util.getDate());
	
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "��ü", "", codeData, "mediCombo");
	rxw.makeDataToList(ds, "curbankcd", "cicdnm", "cicodeval", "��ü", "", codeData, "bankCombo");
	
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");	
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.flush(out);
%>