<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_code_1501_a.jsp
* ��� : ������°��� �ʱ�ȭ��
* �ۼ����� : 2006-11-09
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-12
* ������ϸ� : ps_code_1501_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // �������� ������ ���μ�
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset �ν��Ͻ� ����κ�
    PS_L_BOACCTDataSet ds = (PS_L_BOACCTDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
             
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "����", "", initTemp, "branchCombo"); // ����
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "��ü", "ALL", initTemp, "branchCombo2"); // ����
    rxw.makeDataToList(ds, "bankcur", "cicdnm", "cicodeval", "����", "", initTemp, "bankCombo");  // �������
    rxw.makeDataToList(ds, "accitmcur", "cicdnm", "cicodeval", "����", "", initTemp, "accountCombo");  // �����׸� 
       
	rxw.flush(out);
%>

