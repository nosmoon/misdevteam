<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1701_s.jsp
* ��� : ���ʽ��� �߼� �ʱ�ȭ��
* �ۼ����� : 2004-02-20
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-11
* ������ϸ� : ps_send_1701_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // �������� ������ ���μ�
    String records_per_page = "10";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset �ν��Ͻ� ����κ�
    PS_S_SEND_BNSBKDataSet ds = (PS_S_SEND_BNSBKDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    
    rxw.makeDataToList(ds, "bnsbksenddtcur", "brch_offisend_dt_view", "brch_offisend_dt", initTemp, "sendCombo"); // �߼�����
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "��ü", "", initTemp, "branchCombo");  // Ȯ������
    
	rxw.flush(out);    
%>

