<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_3000_a.jsp
* ��� : ����������-�ʱ�ȭ��
* �ۼ����� : 2015-02-27
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_SUSP_DEF_INITDataSet ds = (SS_L_SUSP_DEF_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	rxw.add(codeData, "defaultFrom", Util.getDate()); // �Ⱓ from 
	rxw.add(codeData, "defaultTo", Util.getDate()); // �Ⱓ to
	
	rxw.makeDataToList(ds, "curdeftype", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo");
	rxw.makeDataToList(ds, "curcnsstat", "cicdnm", "cicodeval", "��ü", "", codeData, "statCombo");
	
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");

	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.flush(out);
%>

