<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2500_a.jsp
* ��� : �������������ý���-���˹������Ȳ-�ʱ�ȭ��
* �ۼ����� : 2009-04-29
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BNSITEMINOUT_INITDataSet ds = (SS_L_BNSITEMINOUT_INITDataSet)request.getAttribute("ds");    
	
    applySession = true;		// ���� ���� ����
    
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��
	
    rxw.add(codeData, "applySession", String.valueOf(applySession));

    rxw.makeDataToList(ds, "taslmlist", "cdnm", "cd", "��ü", "", codeData, "promotionCombo");//��ǰ����
    rxw.flush(out);
%> 