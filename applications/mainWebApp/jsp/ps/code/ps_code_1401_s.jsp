<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_code_1401_a.jsp
* ��� : �����ڵ���� �ʱ�ȭ��
* �ۼ����� : 2004-02-20
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-11
* ������ϸ� : ps_code_1401_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // �������� ������ ���μ�
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset �ν��Ͻ� ����κ�
    PS_S_CMPYBO_INTGDataSet ds = (PS_S_CMPYBO_INTGDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
             
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "����", "", initTemp, "branchCombo"); // ����
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "��ü", "", initTemp, "branchCombo2"); // ����
    rxw.makeDataToList(ds, "alonlist", "cicdnm", "cicodeval", "����", "", initTemp, "branchPayCombo");  // ����������޽���
    rxw.makeDataToList(ds, "alonlist", "cicdnm", "cicodeval", "����", "", initTemp, "mainPayCombo");  // ����������޽���
       
	rxw.flush(out);
%>

