<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1900_a.jsp
* ��� : ��������-����-���Ͼ��ε�-����EDI
* �ۼ����� : 2008-05-14
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-16
* ������ϸ� : ss_brsup_1770_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    //int wrkListCount = 5;		// �� ȭ��� ����Ʈ �׸� ��
    int wrkListCount = 5000;		// �� ȭ��� ����Ʈ �׸� ��
    //int wrkdtlListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��(����)
    int wrkdtlListCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��(����)
    applySession = true;		// ���� ���� ����
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "applySession", String.valueOf(applySession));
    rxw.add(codeData, "pagesize", wrkListCount);
    rxw.add(codeData, "wrkListCount", wrkListCount);
    rxw.add(codeData, "wrkdtlListCount", wrkdtlListCount);
    
    rxw.add(codeData, "frdt", Util.getDate()); //�������� ����
    rxw.add(codeData, "todt", Util.getDate()); //�������� ����

    rxw.flush(out);
%>
