<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2351_a.jsp
* ��� : �������߼�ó�� �ʱ�ȭ��
* �ۼ����� : 2004-03-02
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-10
* ������ϸ� : ps_send_2351_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = "20";
    //  dataset �ν��Ͻ� ����κ�
    PS_S_BO_SEND_INITDataSet ds = (PS_S_BO_SEND_INITDataSet)request.getAttribute("ds");  // request dataset

    // ȭ��� ������ Row��
    int li_per = 20;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "weekDate", ds.getWeekyymmdd()); // ex)2009/02/14
    rxw.add(initTemp, "weekDay", ds.getWeekday()); // ex)�����
       
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo"); // ��ü����
    rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "��ü", "", initTemp, "deptCombo");  // �μ�
    rxw.makeDataToList(ds, "areacdcur", "areanm", "areacd", "��ü", "", initTemp, "areaCombo");  // ����
   
	rxw.flush(out);    
%>

