<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_3000_a.jsp
* ��� : ����������-�ʱ�ȭ��
* �ۼ����� : 2015-02-27
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXCD_INITDataSet ds = (SS_L_EXCD_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
			
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");

	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.makeDataToList(ds, "extncdusagecur", "cicdnm", "cicodeval", "��ü", "", codeData, "extncdusage"); // ���
	rxw.makeDataToList(ds, "resitypecdcur", "cicdnm", "cicodeval", "��ü", "", codeData, "resitypecd");
	
	rxw.flush(out);
%>

