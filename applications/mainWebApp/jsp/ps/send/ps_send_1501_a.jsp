<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1501_a.jsp
* ��� : ��ü �߰��߼�Ȯ�� �ʱ�ȭ��
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȯ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-11
* ������ϸ� : ps_send_1501_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //	dataset �ν��Ͻ� ����κ�
    PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet)request.getAttribute("ds");  // request dataset

    // ȭ��� ������ Row��
    int li_per = 10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.makeDataToList(ds, "hdqtsenddtcur", "hdqtsenddt_view", "hdqtsenddt", initTemp, "sendCombo"); // �߼�����
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "branchCombo");  // Ȯ������
    
	rxw.flush(out);    
%>

