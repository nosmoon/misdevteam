<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2600_a.jsp
* ��� : ��������-����_�ڵ���ü-��ü��û����-�ʱ�ȭ��
* �ۼ����� : 2009-05-20
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    applySession = true;		// ���� ���� ����
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��
	
    rxw.add(codeData, "applySession", String.valueOf(applySession));

    rxw.flush(out);
%> 