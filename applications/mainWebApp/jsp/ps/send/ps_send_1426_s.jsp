<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1426_s.jsp
* ��� : ��ü �ϰ��߼� ��üȣ��
* �ۼ����� : 2005-11-28
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090209
* ������ϸ� : ps_send_1426_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset �ν��Ͻ� ����κ�
    PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
           
    rxw.makeDataToList(ds, "medisercur", "mediser_view", "mediser_no", initTemp, "mcNoCombo");  // ��üȣ��
    rxw.makeDataToList(ds, "hdqtsenddtcur", "hdqtsenddt_view", "hdqtsenddt", initTemp, "confirmCombo");  // Ȯ������
    rxw.flush(out);    
%>