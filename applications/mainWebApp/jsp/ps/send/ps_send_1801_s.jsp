<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1801_s.jsp
* ��� : ���ʽ��� �߼� �ʱ�ȭ��
* �ۼ����� : 2004-02-20
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-09
* ������ϸ� : ps_send_1801_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // �������� ������ ���μ�
    String records_per_page = "5";

    //	dataset �ν��Ͻ� ����κ�
    PS_S_SEND_BNSBKDataSet ds = (PS_S_SEND_BNSBKDataSet)request.getAttribute("ds");  // request dataset

    // ȭ��� ������ Row��
    int li_per = 10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
       
    rxw.makeDataToList(ds, "bnsbksenddtcur", "brch_offisend_dt_view", "brch_offisend_dt", initTemp, "sendCombo"); // �߼�����
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "��ü", "", initTemp, "branchCombo");  // �߼�����
    rxw.makeDataToList(ds, "sendmthdcur", "cicdnm", "cicodeval", initTemp, "sendMthCombo");  // �߼۹��
	rxw.flush(out);
%>

